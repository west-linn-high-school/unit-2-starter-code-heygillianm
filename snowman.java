import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class snowman extends Application {

  public void start(Stage stage){
    final double WIDTH = 600;
    final double HEIGHT = 600;

    final double CENTER = WIDTH /2;

    final double RECT_Y = 450;
    final double RECT_HEIGHT = HEIGHT - RECT_Y;

    Rectangle ground = new Rectangle(0, RECT_Y, WIDTH, RECT_HEIGHT);
    ground.setFill(Color.WHITE);

    final double BUTT_X = CENTER;
    final double BUTT_Y = 480;
    final double BUTT_RAD = 60;

    Circle butt = new Circle(BUTT_X, BUTT_Y, BUTT_RAD);
    butt.setFill(Color.WHITE);
    butt.setStroke(Color.BLACK);

    final double TORSO_X = CENTER;
    final double TORSO_Y = 410;
    final double TORSO_RAD = 40;

    Circle torso = new Circle(TORSO_X, TORSO_Y, TORSO_RAD);
    torso.setFill(Color.WHITE);
    torso.setStroke(Color.BLACK);

    final double TOP_X = CENTER;
    final double TOP_Y = 360;
    final double TOP_RAD = 30;

    Circle top = new Circle(TOP_X, TOP_Y, TOP_RAD);
    top.setFill(Color.WHITE);
    top.setStroke(Color.BLACK);

    final double START_X = CENTER - TORSO_RAD;
    final double START_Y = 400;
    final double END_X = CENTER - 60;
    final double END_Y = 430;

    Line leftarm = new Line(START_X, START_Y, END_X, END_Y);
    leftarm.setStroke(Color.BROWN);

    final double START_X2 = CENTER + TORSO_RAD;
    final double START_Y2 = 400;
    final double END_X2 = CENTER + 60;
    final double END_Y2 = 430;

    Line rightarm = new Line(START_X2, START_Y2, END_X2, END_Y2);
    rightarm.setStroke(Color.BROWN);

    Polygon nose = new Polygon();
    nose.getPoints().setAll(50, 50, 60, 60, 20, 40);
    nose.setFill(Color.ORANGE);

    Group root = new Group(ground, butt, torso, top, leftarm, rightarm, nose);
    Scene scene = new Scene(root, WIDTH, HEIGHT, Color.LIGHTBLUE);

    stage.setTitle("snowman");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
