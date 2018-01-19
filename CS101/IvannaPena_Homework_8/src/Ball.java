import processing.core.PApplet;
public class Ball {
	  float x;  //ball x
	  float y; //ball y
	  float vx; //ball velocity in x
	  float vy; //ball velocity in y 
	  float D; //ball diameter
	  PApplet parent;
	  //Ball constructor
	  Ball(PApplet p){
		  parent = p;
		  x = 300;
		  y = 400;
		  vx = 0; //Initially, ball just falls straight down
		  vy = 4; 
		  D = 10;
	  }

	  //Update the ball
	  void update(){
	    parent.noStroke();
	    parent.fill(255);
	    parent.ellipse(x, y, D, D);

	    y += vy; //increment y
	    x += vx; //increment x
	  }

	  //Ball goes left
	  void goLeft(){
	    vx = -4; //decrement x
	  }

	  //Ball goes right
	  void goRight(){
	    vx = 4; //increment x
	  }

	  //Ball changes in y direction
	  void changeY(){
	    vy *= -1; 
	  }

	  //If ball goes below paddle, reset
	  void reset(){
	    x = 300;
	    y = 400;
	    vx = 0;
	    vy = 4;
	  }
}
