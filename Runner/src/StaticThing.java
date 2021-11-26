import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.geometry.Rectangle2D;

public class StaticThing {
    private double width;
    private double height;
    private String fileName;
    private Image im;
    private ImageView imV;

    public StaticThing (double width, double height, String fileName) {
        this.width = width;
        this.height = height;
        this.im = new Image(fileName);
        this.imV = new ImageView(im);
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public ImageView getImV(){
        return imV;
    }
}
