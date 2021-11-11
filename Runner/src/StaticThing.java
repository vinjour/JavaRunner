import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.geometry.Rectangle2D;

public class StaticThing {
    private double x;
    private double y;
    private double width;
    private double height;
    private String fileName;
    private Image im;
    private ImageView imV;

    public StaticThing (double x, double y, double width, double height, String fileName) {
        this.im = new Image(fileName);
        this.imV = new ImageView(im);
        imV.setX(x);
        imV.setY(y);
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public ImageView getImV(){
        return imV;
    }
}
