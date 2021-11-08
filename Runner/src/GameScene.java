import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.geometry.Rectangle2D;


public class GameScene extends Scene {
    private Camera camera;
    private StaticThing bgLeft;
    private StaticThing bgRight;
    private String cd = System.getProperty("user.dir");

    public GameScene(Group g) {
        super(g, 1600, 400);
        bgLeft = new StaticThing(0, 0, cd + "\\src\\desert.png");
        bgRight = new StaticThing(800, 0, cd + "\\src\\desert.png");
        camera = new Camera(0, 0);
        g.getChildren().add(bgLeft.getImV());
        g.getChildren().add(bgRight.getImV());
    }
}
