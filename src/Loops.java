public class Loops {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println("Loop #: " + i);
        }
        System.out.println("---------------------------");
        for (int x = 1; x <= 10; ++x){
            System.out.println("Loop #: " + x);
        }
        System.out.println("-----------------------");
        for(int h = 1; h <= 100; h++){
            if(h % 3 == 0 && h % 5 == 0) {
                System.out.println("Loop #: " + h);
            }
        }
    }
}
