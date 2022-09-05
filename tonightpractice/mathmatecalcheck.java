package tonightpractice;
import java.util.*;
public class mathmatecalcheck {
    Random ran =new Random();
    Scanner con= new Scanner(System.in);
     int num1;
     int num2;
     int input;
     int result=0;
     public int addition(int inputlevel) {
         for (int i = 1; i <= 5; i++) {
             num1 = ran.nextInt(inputlevel);
             num2 = ran.nextInt(inputlevel);
             System.out.print("Q" + i + ")   " + num1 + "+" + num2 + "=");
             input = con.nextInt();
             if ((num1 + num2) == input) {
                 System.out.println("correct");
                 result++;
             } else System.out.println("incorrect think better");
         }//for
         return result;
     }//addition-method

     public int subtractin(int inputlevel){
         for (int i = 1; i <= 5; i++) {
             num1 = ran.nextInt(inputlevel);
             num2 = ran.nextInt(inputlevel);
             System.out.print("Q" + i + ")   " + num1 + "-" + num2 + "=");
             input = con.nextInt();
             if ((num1 - num2) == input) {
                 System.out.println("correct");
                 result++;
             } else System.out.println("incorrect think better");
         }//for
         return result;
     }//subtraction-method

    public int division(int inputlevel){
        for (int i = 1; i <= 5; i++) {
            num1 = ran.nextInt( inputlevel);
            num2 = ran.nextInt(inputlevel);
            System.out.print("Q" + i + ")   " + num1 + "/" + num2 + "=");
            double inputdivision = con.nextDouble();
            if ((num1 + num2) == inputdivision) {
                System.out.println("correct");
                result++;
            } else System.out.println("incorrect think better");
        }//for
         return result;
    }// division

    public int multiplication(int inputlevel){
        for (int i = 1; i <= 5; i++) {
            num1 = ran.nextInt(inputlevel);
            num2 = ran.nextInt(inputlevel);
            System.out.print("Q" + i + ")   " + num1 + "*" + num2 + "=");
            input = con.nextInt();
            if ((num1 * num2) == input) {
                System.out.println("correct");
                result++;
            } else System.out.println("incorrect think better");
        }//for
         return result;
    }//multiplication

    public int LevelOfGame(){
        int inputlevelgame;
        int randomnum=0;
       do {
           System.out.print("choose the level 1-easy 2-meduim 3-hard :");
           inputlevelgame = con.nextInt();
           if (inputlevelgame == 1) randomnum = 10;
           else if (inputlevelgame == 2) randomnum = 100;
           else if (inputlevelgame == 3) randomnum = 1000;
           else System.out.println("enter the right number ");
       }while(inputlevelgame<=0 || inputlevelgame>=4 );

         return randomnum;
    }//levelOfexam-method

    public int Exam(int inputlevelexam){
        int inputquestion;
         do {
            System.out.print("do you need 1=addition(+) OR 2-subtraction(-)\n OR 3-divition(/) OR 4-multiplication(*) :");
            inputquestion = con.nextInt();

            if (inputquestion == 1) {
                result=addition(inputlevelexam);

            }//if-1
            else if (inputquestion == 2) {
                result= subtractin(inputlevelexam);

            }//if-2
            else  if (inputquestion == 3) {
                result= division(inputlevelexam);

            }//if-3
            else if (inputquestion == 4) {
                result= multiplication(inputlevelexam);

            }//if-4
            else System.out.println("enter the right number ");
        }while(inputquestion<=0 || inputquestion>4 );
         return result;
    }//Exam-method
    public String result(int result){
         if(result==5)return "you are perfect";
         else if(result==4)return "very Good";
         else if (result==3)return "Good";
         else if (result==2)return "try to better";
         else if(result==1)return "you are Bad in mathmatical";
         else if (result==0)return "go home schoole didn't need you";
         return "";
    }


}//class
