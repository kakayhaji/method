package com.example.avtivites;
import java.util.Scanner;
public class problem {
    public static void main (String[] args){
        Scanner con = new Scanner(System.in);
       // fibonacci_series(9);
        System.out.print("Enter the  number to factoryal :");
        int x = con.nextInt();
int factoryal_of_number=factoryal(x);
System.out.print("the factoryal of ("+x+") is = "+factoryal_of_number);


    }//main
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

}
