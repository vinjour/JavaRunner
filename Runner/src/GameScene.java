import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.geometry.Rectangle2D;


public class GameScene extends Scene {
    private double width;
    private double height;
    private Camera camera;
    private StaticThing bgLeft;
    private StaticThing bgRight;
    private String cd = System.getProperty("user.dir");
    private int numberOfLives = 3;
    private StaticThing heart;
    AnimatedThing hero;

    public GameScene(Group root, double width, double height) {
        super(root, 1600, 400);
        this.width = width;
        this.height = height;

        bgLeft = new StaticThing(0, 0, 800, 400, cd + "\\src\\desert.png");
        bgRight = new StaticThing(800, 0, 800, 400, cd + "\\src\\desert.png");
        camera = new Camera(0, 0);
        hero = new Hero(0,0,50,250,cd + "\\src\\heros.png");

        root.getChildren().add(bgLeft.getImV());
        root.getChildren().add(bgRight.getImV());
        root.getChildren().add(hero.getImV());

        for(int i = 0; i<numberOfLives; i++) {
            //StaticThing heart = new StaticThing(16 + i*40, 12, 0, 0, cd + "\\src\\fullHearth.png");
            //root.getChildren().add(heart.getImV());
        }
    }


    public Camera getCam() {
        return camera;
    }
}
