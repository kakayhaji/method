package firstweek;
import java.util.Scanner;
public class method {
    public static void  main(String[] args) {
        Scanner con =new Scanner (System.in);
        System.out.println("For Running Program Enter ( yas ) pleas ");
        //exercise-1
        System.out.print("do you need to run exercise_1 :");
        String input =con.next();
        if(input.equals("yas")){
        System.out.println("--------------\n| Exercise-1 |\n--------------");
        System.out.print("Enter a Number :");
        int x =con.nextInt();
        String output =kaka(x);;
        System.out.println(output);}

//exercise_2
        System.out.print("do you need to run exercise_2 :");
        String input_2=con.next();
        if(input.equals("yas")){
            System.out.println("**************\n* Exercise-2 *\n**************");
        fibonacci_series(9);}
//exercise_3
        System.out.print("do you need to run exercise_3 :");
        String input_3=con.next();
        if(input.equals("yas")){
            System.out.println("..............\n. Exercise-3 .\n..............");
            System.out.print("Enter the  number to factoryal :");
            int x = con.nextInt();
            int factoryal_of_number=factoryal(x);
            System.out.println("the factoryal of ("+x+") is = "+factoryal_of_number);
        }//if
        //exercise-4
        System.out.print("do you need to run exercise_4 :");
        String input_4=con.next();
        if(input.equals("yas")){
            System.out.println("xxxxxxxxxxxxxx\nx Exercise-4 x\nxxxxxxxxxxxxxx");
            do {
                System.out.println("choose one summing\n1-sum(int firstnumber,int secondnumber)");
                System.out.println("2-sum(int firstnumber,int secondnumber,int thirdnumber)\n3-sum(double firstnumber,int secondnumber)");
                int input_summing = con.nextInt();
                if (input_summing == 1) {
                    System.out.print("Enter first number :");
                    int firstnumber = con.nextInt();
                    System.out.print("Enter second number :");
                    int secondnumber = con.nextInt();
                    int result = firstmethod(firstnumber, secondnumber);
                    System.out.println(firstnumber + " + " + secondnumber + " = " + result);
                    break;
                }//if
                else if (input_summing == 2) {
                    System.out.print("Enter first number :");
                    int firstnumber = con.nextInt();
                    System.out.print("Enter second number :");
                    int secondnumber = con.nextInt();
                    System.out.print("Enter third number :");
                    int thirdnumber = con.nextInt();
                    int result=firstmethod(firstnumber, secondnumber, thirdnumber);
                    System.out.println(firstnumber + " + " + secondnumber + " + " + thirdnumber+" = "+result);
                    break;
                }//else-if-1
                else if (input_summing == 3) {
                    System.out.print("Enter first number :");
                    double firstnumber = con.nextDouble();
                    System.out.print("Enter second number :");
                    int secondnumber = con.nextInt();
                    double result=firstmethod(firstnumber, secondnumber);
                    System.out.println(firstnumber + " + " + secondnumber + " = " + result);
                    break;
                }//else_if-2
                else {
                    System.out.println("ERROR ");
                }//else
            }while(true);
        }//if

System.out.println(" Thank you For Testing My Program ");
    }//main_method
    public static String kaka(int x){
        String out;
        if(x%2==1){
            out =" the number is odd ";
        }//if
        else {
            out=" the number is even ";
        }//else
        return out;
    }//kaka_method
    public static void fibonacci_series(int index){
        System.out.print("{ ");
        int result=0;
        int num_1;
        int num_2=1;
        for (int i=1; i<=index; i++){

            System.out.print(result+", ");
            num_1=num_2;
            num_2=result;
            result=num_1+num_2;

        }//for
        System.out.println(" }");
    }//fibonacci_method
    public static int factoryal(int x){
        int result=1;
        while (x>0){
            result=result*x;
            x--;
        }
        return result;
    }//factotyal_method
    public static int firstmethod(int x,int y){
        int result=x+y;
        return result;
    }//firstmethod
    public static int firstmethod(int firstnumber, int secondnumber,int thirdnumber){
        int result=firstnumber+secondnumber+thirdnumber;
        return result;
    }//second-method
    public static double firstmethod(double firstnumber,int secondnumber){
        double result=firstnumber+secondnumber;
        return result;
    }//thirdmethod
}//class
