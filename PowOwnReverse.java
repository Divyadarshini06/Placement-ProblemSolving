class PowOwnReverse {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        int result = pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static int pow(int base, int exponent) {
        if (exponent == 0) {
            return 1; 
        } else if (exponent < 0) {
            return 1 / pow(base, -exponent); 
        } else {
            return base * pow(base, exponent - 1); 
        }
    }
}
  

