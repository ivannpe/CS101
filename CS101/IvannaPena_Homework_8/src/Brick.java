import processing.core.PApplet;
public class Brick {
  float x; //brick x
  float y; //brick y
  float w; //brick width
  float h; //brich height
  float r; //brick red val
  float g; //grick green val
  float b; //brick blue val
  boolean hit; //whether or not the brick has been hit
  PApplet parent;

    Brick(float x0, float y0,PApplet p){ //float x0, float y0, 
    	parent = p;
    x = x0;
    y = y0;
    r = 211;
    g = 211;
    b = 211;
    w = 50; //brick width
    h = 25; //brick height
    hit = false; //brick is initially not hit
  }

  //Draws the brick
  void update(){
    parent.noStroke();
    parent.fill(r, g, b);
    parent.rect(x, y, w, h);
  }

  //If brick is hit
  void gotHit(){
    hit = true; //brick recognizes that it has been hit
    r = 0;
    g = 0;
    b = 0;
    parent.rect(x, y, w, h);
  }
}

