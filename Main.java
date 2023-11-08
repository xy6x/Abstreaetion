public class Main {
    public static void main(String[] args) {
       Book B1 =new Book("yousef",550.0,"ahmed");
        System.out.println("The new price Book "+B1.getDiscount());
        Movie m =new Movie("fisal",680,"yousef");
        System.out.println("The new price Movie "+m.getDiscount());


        MovmlePoint mp =new MovmlePoint(50,40,3,20);
        mp.moveDown();
        mp.moveUp();
        mp.moveLeft();
        mp.moveRight();
    }
}