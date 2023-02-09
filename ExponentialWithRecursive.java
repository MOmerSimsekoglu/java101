import java.util.Scanner;

public class ExponentialWithRecursive {

    static int exponential(int base,int exponential){

        int result=1;

        if (base==1 || exponential==0)
            return 1;



        return base* exponential(base,exponential-1);

    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Please enter base number: ");
        int number1= inp.nextInt();
        System.out.print("Please enter exponential number: ");
        int number2= inp.nextInt();

        System.out.println(exponential(number1,number2));

    }
}