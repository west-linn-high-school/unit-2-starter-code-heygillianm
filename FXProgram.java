import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXProgram extends Application {

  public void start(Stage stage){
    final double WIDTH = 600;
    final double HEIGHT = 800;



    Group root = new Group();
    Scene scene = new Scene(root, WIDTH, HEIGHT, Color.LIGHTBLUE);

    stage.setTitle("FXProgram");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
