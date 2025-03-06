import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {

  // Instance Variables
  private String[][] variable1; // Stores text for the first set of scenes
  private ImageFilter[][] variable2; // Stores images for the second set of scenes
  private String[][] variable3; // Stores text for the third set of scenes
  private ImageFilter[][] variable4; // Stores images for the fourth set of scenes
  
  // Constructor
  public MyStory(String[][] variable1, ImageFilter[][] variable2, String[][] variable3, ImageFilter[][] variable4) {
    this.variable1 = variable1;
    this.variable2 = variable2;
    this.variable3 = variable3;
    this.variable4 = variable4;
  }

  // Calls all the parts of your animation, in order
  public void drawScene() {
    playSound("Champions League Music.wav"); // Play background music
    
    // Draws each scene sequentially
    drawFirstScene();
    drawSecondScene();
    drawThirdScene();
    drawFourthScene();
  }

  /* These methods are used to draw out and write out all of the pictures and captions shown on the screen.
   * You could also find a string method in this as well.
   * Draws text for first scene and also sets color ot orange if "JV" is found.
   * Sets text to blue if the text has "VAR" in it.
   * Draws and changes from different scenes.
   */

  public void drawFirstScene() {
    clear("white"); 
    
    // Drawing text for the first scene based on the content of 'variable1'
    if (variable1[0][0].indexOf("JV") != -1) {
      setTextColor("orange"); // Set text color to orange if "JV" is found
    } else {
      setTextColor("black"); // Set text color to black otherwise
    }
    drawText(variable1[0][0], 25, 100);
    pause(0.5); // Pause for half a second
    
    // Similar logic for the next lines of text
    if (variable1[0][1].indexOf("JV") != -1) {
      setTextColor("orange");
    } else {
      setTextColor("black");
    }
    drawText(variable1[0][1], 190, 85);
    pause(0.5);
    
    if (variable1[1][0].indexOf("JV") != -1) {
      setTextColor("orange");
    } else {
      setTextColor("black");
    }
    drawText(variable1[1][0], 25, 300);
    pause(0.5);
    
    if (variable1[1][1].indexOf("JV") != -1) {
      setTextColor("orange");
    } else {
      setTextColor("black");
    }
    drawText(variable1[1][1], 180, 250);

    pause(1.0); // Pause before transitioning to the next scene
  }

  public void drawSecondScene() {
    clear("white"); // Clear the screen
    
    // Drawing images for the second scene based on 'variable2'
    drawImage(variable2[0][0], 0, 0, 200); // Draw first image
    pause(0.5);
    drawImage(variable2[0][1], 200, 0, 200); // Draw second image
    pause(0.5);
    drawImage(variable2[1][0], 0, 200, 200); // Draw third image
    pause(0.5);
    drawImage(variable2[1][1], 200, 200, 200); // Draw fourth image

    pause(1.0);
  }
/* Clear the screen, Drawing text for the third scene based on 'variable3', Set text color to blue if "Var" is found, // Set text color to black otherwise, 
  */
   public void drawThirdScene() {
    clear("white"); // Clear the screen
    
    // Drawing text for the third scene based on 'variable3'
    if (variable3[0][0].indexOf("Var") != -1) {
      setTextColor("blue"); // Set text color to blue if "Var" is found
    } else {
      setTextColor("black"); // Set text color to black otherwise
    }
    drawText(variable3[0][0], 25, 100); // Draw the first line of text
    pause(0.5);
    
    if (variable3[0][1].indexOf("Var") != -1) {
      setTextColor("blue");
    } else {
      setTextColor("black");
    }
    drawText(variable3[1][0], 250, 100);
    pause(0.5);
    
    if (variable3[0][0].indexOf("Var") != -1) {
      setTextColor("blue");
    } else {
      setTextColor("black");
    }
    drawText(variable3[1][0], 25, 300);
    pause(0.5);
    
    if (variable3[1][1].indexOf("Var") != -1) {
      setTextColor("blue");
    } else {
      setTextColor("black");
    }
    drawText(variable3[1][1], 165, 300); 

    pause(1.0); // Pause before transitioning to the next scene
  }

 public void drawFourthScene() {
    clear("white"); // Clear the screen

    // Drawing images for the fourth scene based on 'variable4'
    drawImage(variable4[0][0], 0, 0, 200); // Draw first image
    pause(0.5);
    drawImage(variable4[0][1], 200, 0, 200); // Draw second image
    pause(0.5);
    drawImage(variable4[1][0], 0, 200, 200); // Draw third image
    pause(0.5);
    
    // Pixelate an image before displaying it
    ImageFilter pixilate = new ImageFilter("football-142952_1280.jpg");
    pixilate.pixelate(10); // Apply pixelation filter
    drawImage(pixilate, 0, 200, 200); // Draw pixelated image
    pause(0.5);
    
    drawImage(variable4[1][1], 200, 200, 200); // Draw fourth image

    pause(1.0); // Pause before finishing
  }
  

  
}
