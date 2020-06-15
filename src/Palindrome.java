import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        System.out.println("Enter a string:");
        Scanner scanner =new Scanner(System.in);
        String palindrome= scanner.next();
        Boolean isPalindrome=true;
        int n=palindrome.length();
        int i=0,j=n-1;
        for(i=0;i<n/2;i++){
            if(palindrome.charAt(i)!=palindrome.charAt(j))
                isPalindrome=false;
            j--;
        }
        if(isPalindrome)
            System.out.println("String is  a palindrome");
        else
            System.out.println("String is not a palindrome");
    }
}
