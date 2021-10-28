import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Demo");
        Group root = new Group();
        GameScene gs = new GameScene(root);
        primaryStage.setScene(gs);
        primaryStage.sizeToScene();
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
        System.out.println("Good");
    }
}
