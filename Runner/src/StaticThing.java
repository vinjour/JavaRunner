import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.geometry.Rectangle2D;
import javafx.scene.layout.HBox;

public class StaticThing {
    private double x;
    private double y;
    Image im;
    ImageView imV;

    public StaticThing (double x, double y, String background) {
        Image im = new Image(background);
        this.imV = new ImageView(im);
        imV.setViewport(new Rectangle2D(0,0,75,100));
        this.x = x;
        this.y = y;
        imV.setX(x);
        imV.setY(y);
        imV.setPreserveRatio(true);
    }

    public double getY(){
        return this.y;
    }
    public double getX(){
        return this.x;
    }
    public ImageView getImg(){
        return this.imV;
    }
}
