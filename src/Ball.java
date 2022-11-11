public class Ball {
    private int x;
    private int y;
    private int vx = -1;
    private int vy = -1;

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(){
        x = x + vx;
        y = y + vy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void bounce(int a, int b, int c){
        if(x == a && y >= b && y <= b+c){
            vx = vx * (-1);
        }
    }

    public void bounce(){
        vy = vy * (-1);
    }

    public int getVx() {
        return vx;
    }

    public int getVy() {
        return vy;
    }
}
