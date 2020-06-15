import java.util.Scanner;

public class Prime {

    public static void main(String[]  args){
        System.out.println("Enter any integer number : ");
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        if(number==0)
            System.out.println("Number entered by you is zero, which is neither prime nor a composite number");
        if(number==1)
            System.out.println("Number entered by you is one, which is not a prime number but a composite number");
	if(true){}
        Boolean isPrime=false;
        if(number>2){
            for(int i=2; i<=number-1; i++){
                if(number%i!=0)
                    isPrime=true;
            }
        }
        if(isPrime)
            System.out.println("Number entered by you is a prime number");
        else
            System.out.println("Number entered by you is not a prime number");
    }
}
