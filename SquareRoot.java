public class SquareRoot {
    public static void main(String[] args) {
        int n = 25;
        int i = 1;
        int sqrt = 0;
        while( i*i <=n){
            sqrt = i;
            i++;
        }
        System.out.println("Square root of " + n + " is: " + sqrt);
    }
}