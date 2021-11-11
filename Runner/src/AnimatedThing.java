import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class AnimatedThing {
    private double x;
    private double y;
    private Image im;
    private ImageView imV;
    private int attitude;
    private int indexImV;
    private int compteur;

    public AnimatedThing(double x, double y, double xEcran, double yEcran, String fileName){
        Image im = new Image(fileName);
        imV = new ImageView(im);
        imV.setViewport(new Rectangle2D(0, 0, 75, 100));
        imV.setX(xEcran);
        imV.setY(yEcran);
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public ImageView getImV(){
        return imV;
    }

    public int getAtti() {
        return attitude;
    }

    public void setAtti(int attitude) {
        this.attitude = attitude;
    }
}
