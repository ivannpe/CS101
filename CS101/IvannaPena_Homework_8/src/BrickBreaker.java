import processing.core.PApplet;
// Similar to Brick Breaker Game.
//There is a paddle a ball and bricks on a screen, the ball moves off 
//of a paddle controlled by the user towards the bricks. If a brick is hit
//you get points. The ball will reflect off of the bricks until it goes down 
//to the paddle again. You lose lives if you fail to get the ball with the
//paddle
public class BrickBreaker extends PApplet {
	int rows = 5; 
	int columns = 5; 
	int totalBricks = rows * columns; //Total number of bricks
	int score = 0; //Bricks hit by ball
	int displayScore = 0; // score on screen
	int lives = 5; //lives
	
	Paddle paddle = new Paddle(this); //initialize paddle
	Ball ball = new Ball(this); //initialize ball
	Brick[] box = new Brick[totalBricks]; //Initialize the array that will hold all the bricks
	public void setup(){
	  size(600, 600);
	  background(0);
	  smooth();

	  //Setup array of all bricks on screen
	  for (int i = 0; i < rows; i++){
	    for (int j = 0; j< columns; j++){
	      box[i*rows + j] = new Brick((i+1) *width/(rows + 2), (j+1) * 50, this); //places all the bricks into the array, properly labeled.
	    }
	  }
	}

//draw function
	public void draw(){
	  background(0);

	  //Draw bricks
	  for (int i = 0; i<totalBricks; i++){
	    box[i].update();
	  }

	  //Draw paddle and ball
	  paddle.update();
	  ball.update();

	  //if ball hits left side of paddle, go left
	  if (ball.y == paddle.y && ball.x > paddle.x && ball.x <= paddle.x + (paddle.w / 2) ){
	    ball.goLeft();
	    ball.changeY();

	  }

	  //if ball hits right side of paddle go right
	  if (ball.y == paddle.y && ball.x > paddle.x + (paddle.w/2) && ball.x <= paddle.x + paddle.w ){
	    ball.goRight();
	    ball.changeY();

	  }

	  //If the ball hits the right wall, go in same direction towards the left
	  if (ball.x + ball.D / 2 >= width){
	    ball.goLeft();
	  }

	  //If the ball hits the left wall, go in same direction towards the right
	  if (ball.x - ball.D / 2 <= 0){
	    ball.goRight();
	  }

	  //If the ball hits the ceiling, go down in a different direction
	  if (ball.y - ball.D / 2 <= 0){
	    ball.changeY();
	  }

	  for (int i = 0; i < totalBricks; i ++){
	    //If ball hits bottom of brick, ball moves down, score goes up
	    if (ball.y - ball. D / 2 <= box[i].y + box[i].h &&  ball.y - ball.D/2 >= box[i].y && ball.x >= box[i].x && ball.x <= box[i].x + box[i].w  && box[i].hit == false ){
	      ball.changeY();
	      box[i].gotHit();
	      score += 1;
	      displayScore += 10;

	    } 

	    //If ball hits top of brick ball moves up,score goes up
	    if (ball.y + ball.D / 2 >= box[i].y && ball.y - ball.D /2 <= box[i].y + box[i].h/2 && ball.x >= box[i].x && ball.x <= box[i].x + box[i].w && box[i].hit == false ) {
	      ball.changeY();
	      box[i].gotHit();
	      score += 1;
	      displayScore += 10;

	    }

	    //if ball hits the left of the brick, ball moves right score goes up
	    if (ball.x + ball.D / 2 >= box[i].x && ball.x + ball.D / 2 <= box[i].x + box[i].w / 2 && ball.y >= box[i].y && ball.y <= box[i].y + box[i].h  && box[i].hit == false){
	      ball.goLeft();
	      box[i].gotHit();
	      score += 1;
	      displayScore += 10;

	    }

	    //if ball hits the right of the brick, ball moves left score goes up
	    if (ball.x - ball.D/2 <= box[i].x + box[i].w && ball.x +ball.D / 2 >= box[i].x + box[i].w / 2 && ball.y >= box[i].y && ball.y <= box[i].y + box[i].h  && box[i].hit == false){
	      ball.goRight();
	      box[i].gotHit();
	      score += 1;
	      displayScore += 10;

	    }  
	  }

	  //If ball goes off the screen, reset the ball, and lose a life.
	  if (ball.y > height){
	    ball.reset();
	    lives -= 1;
	  }

	  //Displays score in top left corner
	  textSize(32);
	  text(displayScore, 10, 30);

	  //Displays lives in bottom left corner
	  textSize(18);
	  text("LIVES: ", 10, 570);
	  text(lives, 70, 570); 

	  //If the player wins/loses click the mouse to restart the game.
	  if ((score == totalBricks || lives <= 0) && mousePressed){
	    resetGame();
	  } 

	  //Once the score is equal to the total, bring up the "game over" screen.
	  if (score == totalBricks){
	    gameWin();
	  }

	  //If no more lives are left, game ends
	  if (lives <= 0){
	    gameLose();
	  }
	}

	//Function that displays the game screen after the player loses.
	void gameLose(){
	  //Says "Game over", displays score and allows user to click screen to play again. 
	  background(0);
	  textSize(32);
	  text("GAME OVER", 100, 200);
	  text("Score: ", 100, 300);
	  text(displayScore, 300, 300);
	  text("Click to play again", 100, 500);

	  //The game still in play, stops ball
	  ball.x = -10;
	  ball.y = -10;
	  ball.vx = 0;
	  ball.vy = 0;
	}

	//Game won
	void gameWin(){ 

	  background(0);
	  textSize(32);
	  text("YOU WON", 100, 200);
	  text("Score: ", 100, 300);
	  text(displayScore, 300, 300);
	  text("Click to play again", 100, 500);

	  ball.x = -10;
	  ball.y = -10;
	  ball.vx = 0;
	  ball.vy = 0;

	}

	//Reset
	void resetGame(){

	  //Setup array of all bricks on screen
	  for (int i = 0; i < rows; i++){
	    for (int j = 0; j< columns; j++) {
	      box[i*rows + j] = new Brick((i+1) *width/(rows + 2), (j+1) * 50, this);
	    }
	    //Reset score
	    score = 0;
	    displayScore = 0;
	    lives = 5;
	  }
	  //Reset ball placement
	  ball.reset();
	}
}
