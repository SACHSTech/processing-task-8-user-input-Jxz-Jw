import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

boolean upPressed = false;
boolean downPressed = false;
boolean leftPressed = false;
boolean rightPressed = false;

  float circleX = 200;
  float circleY = 200;
  

    public void setup() {
    background(50);
  }

    
  // mouseWheel function
  public void mouseWheel(){
    fill(252, 186, 3); 
    rect(mouseX , mouseY, 10, 50);
       
    fill(252, 186, 3);
    rect(mouseX - 10, mouseY - 10, 10, 50);
    }
  
    // mouseClicked
    public void mouseClicked() {
      fill(0, 255, 0);
      ellipse(mouseX, mouseY, 50, 50);
    }

  
 // define other methods down here.

  public void draw() {
    

    // mousePressed
    if (mousePressed) {
    fill(255);
    ellipse(mouseX, mouseY, 25, 25);
    }

    if (upPressed) {
      circleY--;
    }
    if (downPressed) {
      circleY++;
    }
    if (leftPressed) {
      circleX--;
    }
    if (rightPressed) {
      circleX++;
    }
    fill(0);
    ellipse(circleX, circleY, 10, 10);

    letters();
  } 

 // arrow buttons
  public void keyPressed() {
    if (keyCode == UP) {
      upPressed = true;
    }
    else if (keyCode == DOWN) {
      downPressed = true;
    }
    else if (keyCode == LEFT) {
      leftPressed = true;
    }
    else if (keyCode == RIGHT) {
      rightPressed = true;
    }
  }
  
  public void keyReleased() {
    if (keyCode == UP) {
      upPressed = false;
    }
    else if (keyCode == DOWN) {
      downPressed = false;
    }
    else if (keyCode == LEFT) {
      leftPressed = false;
    }
    else if (keyCode == RIGHT) {
      rightPressed = false;
    }

  }
  
  // keyboard letters
  public void letters(){
     if(keyPressed){
       if(key == 'a'){
         fill(255, 0, 0);
         textSize(50);
         text(key, mouseX, mouseY);
       } else if(key == 'b'){
         fill(0, 0, 255);
         textSize(50);
         text(key, mouseX, mouseY);
       } else if(key == 'c'){
         fill(255, 255, 0);
         textSize(50);
         text(key, mouseX, mouseY);
       } else if(key == 'd'){
          fill(0, 255, 255);
          textSize(50);
          text(key, mouseX, mouseY);
       } else if(key == 'e'){
          fill(255, 0, 255);
          textSize(50);
          text(key, mouseX, mouseY);
       }  
     }
 }

}