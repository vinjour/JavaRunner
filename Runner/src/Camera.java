public class Camera {
    private double posX;
    private double posY;
    private double a;
    private double v;
    private Hero hero;

    public Camera(double x, double y, Hero hero){
        posX=x;
        posY=y;
        this.hero=hero;
    }

    public double getPosX(){
        return posX;
    }

    public double getPosY(){
        return posY;
    }

    @Override
    public String toString(){
        return posX + "," + posY;
    }

    public void update(double time){
        a =(hero.getXPos()-posX)-1.2*v;
        v += a * 0.05;
        posX += v * 0.05;

        hero.getImV().setX(hero.getImV().getX()-posX+30);
    }
}
