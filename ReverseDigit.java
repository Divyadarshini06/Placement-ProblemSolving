class ReverseDigit {
   
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverseDigits(number);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10; 
            reversed = reversed * 10 + digit; 
            num /= 10; 
        }
        return reversed;
    }
}