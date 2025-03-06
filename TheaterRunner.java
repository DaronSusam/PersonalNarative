import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

  
  /*
  * 2D arrays that are used as variables in the MyStory so that we could display them on the theather.
  */
    String[][] Writing = {
      {"Watching the game", "Getting Benched on JV"},
      {"Gettign subbed on JV", "Scoring two goals on JV"},
      
    };
    
ImageFilter[][] array3 = {
      { new ImageFilter("meeting-1002800_1280.jpg"), new ImageFilter("soccer-1521512_1280.png") },
      { new ImageFilter("football-142952_1280.jpg"), new ImageFilter("istockphoto-181090357-612x612.jpg") },
    };

    String[][] SecondGame = {
      {"Getting moved up to Var", "Starting on Var"},
      {"Scoring on Var", "Winning my first Var game"},
      
    };
       ImageFilter[][] array2 = {
      { new ImageFilter("download-(1).jpeg"), new ImageFilter("people-1540749_1280.jpg") },
      { new ImageFilter("download.jpeg"), new ImageFilter("gate-374493_1280.jpg") },
    };
    // MyStory object
    MyStory scene = new MyStory(Writing , array2, SecondGame, array3);
    
    // Call drawScene
    scene.drawScene();
    
    // Play scene in Theater
    Theater.playScenes(scene);
    
  }
}