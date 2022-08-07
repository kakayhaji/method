import java.util.InputMismatchException;
import java.util.Scanner;
public class exception extends Throwable {
    public static void main(String[] args) {
        Scanner con =new Scanner(System.in);
     //exercise-1
       try{  int[] array=new int[5];
           for(int i=0; i<=5; i++){
               array[i]=i;
           }//for
        }//try
       catch(ArrayIndexOutOfBoundsException ex){
    System.out.println("your array have error enter another array have 5 element not more");
        }//catch

        //exercise-2
while(true){
    try{System.out.print("enter an integer number:");
       int  input =con.nextInt();
        break;
   }//try
    catch(InputMismatchException e){
       System.out.println("you should enter an integer");
       con.nextLine();
   }//catch
}//while
        System.out.println("thank you for testing ");
        }//main
}//class