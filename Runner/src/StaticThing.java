import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.geometry.Rectangle2D;

public class StaticThing {
    private double x;
    private double y;
    ImageView imV;

    public StaticThing (double x, double y, String background) {
        Image im = new Image(background);
        imV = new ImageView(im);
        imV.setViewport(new Rectangle2D(0,0,800,400));
        imV.setX(x);
        imV.setY(y);
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x=x;
    }

    public void setY(double y){
        this.y=y;
    }

    public ImageView getImV(){
        return imV;
    }
}
