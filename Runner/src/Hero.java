import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Hero extends AnimatedThing {

    private double yVelocity;
    private double yAcceleration = 40;
    private static final int X_FORCE = 2;
    private static final double GRAVITY = 0.1;
    private static final double DELTA_TIME = 0.018;
    private int attitude;
    private boolean isGrounded;
    private double invincibility = 25000.0;
    private boolean invincible = false;
    private double invincibilityTime;

    public Hero(double x, double y, String fileName){
        super(x,y,85,100,0,0,6,85,0.2, fileName);
        attitude = 1;
        isGrounded = true;
    }

    @Override
    public void mvtUpdate(double time) {
        switch (attitude) {
            case 1 : //Run
                xPos += 0.000001*time;
                this.getImV().setX((int)xPos);
                this.getImV().setY((int)yPos);
                break;


            case 2 : //Jump
                xPos += 0.000001*time + X_FORCE;
                yVelocity += yAcceleration * GRAVITY;
                yPos = yVelocity * GRAVITY + yPos;
                getImV().setX((int)xPos);
                getImV().setY((int)yPos);

                if(yVelocity < 0){
                    this.getImV().setViewport(new Rectangle2D(0,160,imVwidth,imVheight));
                }
                else {
                    this.getImV().setViewport(new Rectangle2D(offset,160,imVwidth,imVheight));
                }

                if (yPos>250) {
                    yVelocity = 0;
                    yPos = 250;
                    isGrounded = true;
                    attitude = 1;
                }

                break;
        }
    }

    public void jump() {
        if(isGrounded == true){
            attitude = 2;
            yVelocity = -100;
            isGrounded = false;
        }
    }
}
