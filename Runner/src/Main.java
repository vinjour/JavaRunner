import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Demo");
        Group root = new Group();
        GameScene gs = new GameScene(root);
        primaryStage.setScene(gs);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
        System.out.println("Good");
    }
}
