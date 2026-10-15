public class App {
    public static void main(String[] args) throws Exception {
        int count = 5;
        int steps = 0;
        while (count >0) {
            System.out.println("T-minus " + count);
            count-=2;
            steps++;
        }
        System.out.println("Liftoff!");
        System.out.println("Loop ran " + steps + " times.");
    }
}
