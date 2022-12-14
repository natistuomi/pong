public class Test {
    public static void main(String[] args){
        Paddle a = new Paddle(1,5);
        a.moveDown();
        System.out.println(a.getY());
        Ball b = new Ball(3,8 );
        for(int i = 0; i < 5; i++){
            b.move();
            b.bounce(a.getX(), a.getY(), a.getWidth());
            System.out.println("x: " + b.getX() + "   y: " + b.getY());
        }

        Pong game = new Pong(20, 10);
        Ball ball = game.getB();
        System.out.println("new game");
        for(int i = 0; i < 50; i++){
            game.update();
            System.out.println("x: " + ball.getX() + "   y: " + ball.getY());
            System.out.println("vx: " + ball.getVx() + "   vy: " + ball.getVy());
        }
    }
}
