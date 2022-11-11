public class Pong {
    private Ball b;
    private Paddle p1;
    private Paddle p2;
    private int width;
    private int height;

    public Pong(int width, int height) {
        this.width = width;
        this.height = height;
        b = new Ball(width/2, height/2);
        p1 = new Paddle(0, height/2);
        p2 = new Paddle(width, height/2);
    }

    public void update(){
        b.move();
        checkCollision();
    }

    public void checkCollision(){
        if(b.getY() == 0 || b.getY() == height){
            b.bounce();
        }
        b.bounce(p1.getX(), p1.getY(), p1.getWidth());
        b.bounce(p2.getX(), p2.getY(), p2.getWidth());
    }
}
