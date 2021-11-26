public class Foe extends AnimatedThing {
    private Camera cam;

    public Foe(double x, double y, String fileName, Camera camera) {
        super(x, y,35,25,250,15,5,-60,0.2, fileName);
        cam = camera;
    }

    @Override
    public void mvtUpdate(double time) {
        getImV().setFitHeight(1.5*imVheight);
        getImV().setFitWidth(1.5*imVwidth);
        xPos += -0.5*time;
        getImV().setX(xPos);

    }
}
