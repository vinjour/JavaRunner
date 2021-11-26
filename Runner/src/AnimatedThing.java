import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class AnimatedThing {
    protected double xPos;
    protected double yPos;
    protected double x;
    protected double y;
    private Image im;
    private ImageView imV;
    protected double imVwidth;
    protected double imVheight;
    protected double offset;
    protected double indexImV;
    protected double maxIndex;
    protected double compteur;

    public AnimatedThing(double xPos, double yPos, double width, double height, double x, double y, double maxIndex, double offset, double compteur, String fileName){
        this.xPos = xPos;
        this.yPos = yPos;
        imVheight = height;
        imVwidth = width;
        this.maxIndex = maxIndex;
        this.x = x;
        this.y = y;
        this.offset = offset;
        this.compteur = compteur;
        Image im = new Image(fileName);
        imV = new ImageView(im);
        imV.setX(xPos);
        imV.setY(yPos);
    }

    public double getXPos(){
        return xPos;
    }

    public double getYPos(){
        return yPos;
    }

    public ImageView getImV(){
        return imV;
    }

    public double getIndexImV() {
        return indexImV;
    }

    abstract public void mvtUpdate(double time);

    public void update(double time) {
        indexImV = (int)((time%(maxIndex*compteur))/compteur);
        imV.setViewport(new Rectangle2D(x+(indexImV*offset),y,imVwidth,imVheight));
        this.mvtUpdate(time);
    }

}
