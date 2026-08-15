class FindLastDigit {
   public static void main(String[] args) {
        String a = "123";
        String b = "456";
        if (b.equals("0")) {
            System.out.println(1);
            return;
        }

        if (a.equals("0")) {
            System.out.println(0);
            return;
        }

        int lastDigitA = a.charAt(a.length() - 1) - '0';

        int remainder = 0;
        for (int i = 0; i < b.length(); i++) {
            remainder = (remainder * 10 + (b.charAt(i) - '0')) % 4;
        }

        int power = (remainder == 0) ? 4 : remainder;

        int ans = (int) Math.pow(lastDigitA, power);
        System.out.println(ans % 10);
        return;
    }
}