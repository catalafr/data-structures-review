package arrays;

public class PalindromeNumber {

    public boolean isPalindrome(int x){
        String num = String.valueOf(x);
        int length = num.length();
        String first;
        String second;


        if(num.length() % 2 == 0){
            first = num.substring(0,num.length()/2);
            second = num.substring(num.length()/2, length);
            return first.equals(new StringBuilder(second).reverse().toString());
        }
        else {
            first = num.substring(0,num.length()/2);
            second = num.substring(num.length()/2 + 1,length);
            return first.equals(new StringBuilder(second).reverse().toString());
        }
    }
}
