class PalindromeNum{
    public static void main(String[]args) {
        int n = 21;
        if(n < 0){
            n = -n;
        }
        
        int original = n;
        int rev = 0;
        
        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
    
          if(original == rev){
              System.out.println(true);
          }
          else{
               System.out.println(false);
          }
}
}

