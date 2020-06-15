import java.util.Scanner;

public class Palindromeone {
    public static void main(String[] args){
        System.out.println("Enter a string for whicbh you want to check that whether a string is palindrome or not");
        Scanner scanner= new Scanner(System.in);
        String string= scanner.next();
        Boolean isPalindrome=true;
        int n=string.length();
        int i=0,j=n-1;
        while(i<j){
            if(string.charAt(i)!=string.charAt(j))
                isPalindrome=false;
            j--;
            i++;
        }
        if(isPalindrome)
            System.out.println("String is a Palindrome");
        else
            System.out.println("String is not a Palindrome");
    }
}
