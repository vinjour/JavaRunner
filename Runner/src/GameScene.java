import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.geometry.Rectangle2D;
import javafx.animation.AnimationTimer;


public class GameScene extends Scene {
    private double width;
    private double height;
    private Camera camera;
    private StaticThing bgLeft;
    private StaticThing bgRight;
    private String cd = System.getProperty("user.dir");
    private int numberOfLives = 2;
    private Hero hero;



    public GameScene(Group root) {
        super(root, 1600, 400);

        bgLeft = new StaticThing(800, 400, cd + "\\src\\desert.png");
        bgRight = new StaticThing(800, 400, cd + "\\src\\desert.png");
        camera = new Camera(800, 0, hero);
        hero = new Hero(30, 250, cd + "\\src\\heros.png");
        root.getChildren().add(bgLeft.getImV());
        root.getChildren().add(bgRight.getImV());
        root.getChildren().add(hero.getImV());

        for (int i = 0; i < numberOfLives; i++) {
            //StaticThing heart = new StaticThing( 50, 50, cd + "\\src\\fullHearth.png");
            //heart.getImV().setX(630+i*40);
            //root.getChildren().add(heart.getImV());
        }

        this.setOnMouseClicked((event) -> {
            System.out.println("Jump");
            hero.jump();
        });

        render();
        timer.start();
    }

    public void render() {
        double offset = camera.getPosX() % bgLeft.getWidth();
        bgLeft.getImV().setViewport(new Rectangle2D(offset, 0, bgLeft.getWidth(), bgLeft.getHeight()));
        bgRight.getImV().setViewport(new Rectangle2D(0, 0, bgRight.getWidth(), bgRight.getHeight()));
        bgRight.getImV().setX(bgRight.getWidth() - offset);
    }

    AnimationTimer timer = new AnimationTimer() {
        public void handle(long time) {
            double t = time / 500000000;
            hero.update(t);
            render();
        }
    };
}