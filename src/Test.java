public class Test {
    public static void main(String[] args){
        Paddle a = new Paddle(1,5);
        a.moveDown();
        System.out.println(a.getY());
        Ball b = new Ball(3,8 );
        for(int i = 0; i < 5; i++){
            b.move();
            b.bounce(a);
            System.out.println("x: " + b.getX());
            System.out.println("y: " + b.getY());
        }
    }
}
