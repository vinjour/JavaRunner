import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.geometry.Rectangle2D;


public class GameScene extends Scene {
    Camera camera;
    StaticThing backgroundLeft;
    StaticThing backgroundRight;

    public GameScene(Group g) {
        super(g, 600, 400);
        backgroundLeft = new StaticThing(0, 0, "desert.png");
        backgroundRight = new StaticThing(800, 0, "desert.png");
        camera = new Camera(0, 0);
    }
}
