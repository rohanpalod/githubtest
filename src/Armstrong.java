import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        System.out.println("Enter any integer number");
        Scanner scanner=new Scanner(System.in);
        Integer number= scanner.nextInt();
        int originalNumber=number;
        int remainder=0;
        int n=0;
        int sum=0;
        Boolean isArmstrong=false;
        while(number>0){
            number=number/10;
            n++;
        }
        number=originalNumber;
        while(number>0){
            remainder=number%10;
            number=number/10;
            sum+=Math.pow(remainder,n);
        }
        if(sum==originalNumber)
            isArmstrong=true;
        if(isArmstrong)
            System.out.println("Number is a armstrong number");
        else
            System.out.println("number is not a armstrong number");
    }
}
