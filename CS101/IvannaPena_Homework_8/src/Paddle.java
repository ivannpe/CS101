import processing.core.PApplet;
public class Paddle {
	float x; //paddle x
	float y; //paddle y
	float w; //paddle width
	float h; //paddle height
	float r; //paddle red
	float g; //paddle green
	float b; //paddle blue
	PApplet parent;

  //Paddle constructor
	  Paddle(PApplet p){
		parent = p;
	    x = parent.width/2;
	    y = 500;
	    w = 100;
	    h = 10;
	    r=255;
	    g=255;
	    b=255;
	  }
	
	  void update(){
	    //Paddle follows the mouse
		x = parent.mouseX;    
		//Draw paddle
	    parent.fill(r, g, b);
	    parent.rect(x, y, w, h);
	  }
}
