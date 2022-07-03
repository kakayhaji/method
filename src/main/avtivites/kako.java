package com.example.avtivites;
import java.util.Scanner;
public class kako {

    public static void  main(String[] args) {
        Scanner con =new Scanner (System.in);

        //activity-1
        System.out.print("Enter a Number :");
        int x =con.nextInt();
        String output =kaka(x);;
System.out.println(output);
//avtivity-2
        fibonacci_series(9);
//activity-3

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
         int result= secondmethod(firstnumber, secondnumber, thirdnumber);
          System.out.println(firstnumber + " + " + secondnumber + " + " + thirdnumber+" = "+result);
          break;
      }//else-if-1
      else if (input_summing == 3) {
          System.out.print("Enter first number :");
          double firstnumber = con.nextInt();
          System.out.print("Enter second number :");
          int secondnumber = con.nextInt();
       double result=thirdmethod(firstnumber, secondnumber);
          System.out.println(firstnumber + " + " + secondnumber + " = " + result);
          break;
      }//else_if-2
      else {
          System.out.println("ERROR ");
      }//else
  }while(true);




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
    public static int firstmethod(int x,int y){
     int result=x+y;
        return result;
    }//firstmethod
    public static int secondmethod(int firstnumber, int secondnumber,int thirdnumber){
        int result=firstnumber+secondnumber+thirdnumber;
        return result;
    }//second-method
    public static double thirdmethod(double firstnumber,int secondnumber){
        double result=firstnumber+secondnumber;
        return result;
    }//thirdmethod

}//class
