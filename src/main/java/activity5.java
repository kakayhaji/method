import java.util.Scanner;

public class activity5 {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);

        System.out.println("Hello,World");


   /*  System.out.println("program-1:the number dividable by 3 OR 5 \nprogram-2:the number dividable by 3 and 5 ");
System.out.print("choose program 1 OR 2\t:");
int program=con.nextInt();
if(program==1){
    System.out.print("choose thar program run by 1-while OR 2-for\t:");
   int Run_program=con.nextInt();
    int number=0;
    if(Run_program==1) {
        while (number <= 100) {
            if (number % 3 == 0) {
                System.out.print("the number dividable by 3:\t"+number);
System.out.println();
            }//if-2
            else if (number % 5 == 0) {
                System.out.print("the number dividable by 5:\t"+number);
                System.out.println();
            }//else if
number++;
        }//while
    }//if-1
else if (Run_program==2){
    for( number=0; number<=100; number++){
        if (number % 3 == 0) {
            System.out.print("the number dividable by 3:\t"+number);
System.out.println();
        }//if-2
        else if (number % 5 == 0) {
            System.out.print("the number dividable by 5:\t"+number);
            System.out.println();
        }//else if
    }//for
    }//else if-program-2
}//if-program-1
else if(program==2){
    int number=0;
    System.out.print("choose that program run by 1-while OR 2-for\t:");
    int Run_program=con.nextInt();
    if(Run_program==1){
        while(number<=100){
            if(number%3==0 && number%5==0){
                System.out.println("the number dividable by 3 and 5:\t"+number);
            }//if
            number++;
        }//while
    }//if porgram2-Run_program-1
    else if(Run_program==2){
        for(number=0; number<=100; number++){
            if(number%3==0 &&  number%5==0){
                System.out.println("the number dividable by 3 and 5:\t"+number);
            }//if-for
        }//for-program-2
    }//else if-program-2
}//program-2 */


    /* //activity-6
     int input;
     int randomnumber;

         Random rand = new Random();
         randomnumber = rand.nextInt(10) + 1;
         System.out.println(randomnumber);
        do{ System.out.print("enter number between(1-10):");
         input = con.nextInt();
         if (randomnumber < input) {
             System.out.println("your number is bigger than the random number");
         }//if
         else if (randomnumber > input) {
             System.out.println("your number is smaller than  the random number");
         }//else if
         else {
             System.out.println("your number is correct , well done");
         }//else
     } while (input != randomnumber); */


//khalat
           /*  System.out.println("you have :\n 1. addition\n 2. subtraction\n 3. multiplication\n 4. division\n");
             int choose;
             int num1;
             int num2;
             int result=0;
             System.out.println("Enter your first number");
             num1 = con.nextInt();
             do{System.out.println("choose one of them\n 1. addition\n 2. subtraction\n 3. multiplication\n 4. division\n");
                 choose = con.nextInt();
                 if(choose==1){
                     System.out.println(" Enter your second number");
                     num2 = con.nextInt();
                     result = num1+num2;
                     System.out.println("result : "+result);

                 }if(choose==2){
                     System.out.println(" Enter your second number  ");
                     num2 = con.nextInt();
                     result = num1-num2;
                     System.out.println("result : " +result);

                 }if(choose==3){
                     System.out.println(" Enter your second number");
                     num2 = con.nextInt();
                     result = num1*num2;
                     System.out.println("result : " +result);

                 }if(choose==4){
                     System.out.println("Enter your second number");
                     num2 = con.nextInt();
                     result = num1/num2;
                     System.out.println("result : " +result);

                 }num1=result;
             }while(choose!=0); */

/*int program;
   do{  System.out.println("choose program 1-factorial OR \n2-fibonacci seriese ");
      program = con.nextInt();
//1st pattern -factorial

   if (program == 1) {
         int result = 1;
         System.out.print("enter number to find factorial:");
         int factorial = con.nextInt();
         for (int num = 1; num <= factorial; num++) {
             result = result * num;
             System.out.print(" " + result);
         }//   for-1st program
         System.out.println();
         System.out.println("factorial=" + result);
break;
     }//if-1

     //2nd pattern-fibonacci series
     else if (program == 2) {
       int choose;
       do {
           System.out.println("you need program as activity OR you  enter  numbers\n 1-activity and 2-you  enter number ");
           choose = con.nextInt();
           if (choose == 1) {
               int num1 = 0;
               int num2 = 1;
               System.out.print(num1 + ", " + num2);
               for (int i = 1; i <= 8; i++) {
                   int result = num1 + num2;
                   System.out.print(", " + result);
                   num1 = num2;
                   num2 = result;
               }
System.out.println();
               break;
           }//if
           else if (choose == 2) {
               System.out.print("enter 1st number:");
               int num1 = con.nextInt();
               System.out.print("enter 2nd number:");
               int num2 = con.nextInt();
               System.out.println("how many times does program happen again");
               int times = con.nextInt();
               System.out.print(num1 + ", " + num2);
               for (int i = 1; i <= times; i++) {
                   int result = num1 + num2;
                   System.out.print(", " + result);
                   num1 = num2;
                   num2 = result;
               }//for
               System.out.println();
break;
           }
           else{
               System.out.println("error");
           }//else
      } while (true);
       break;
   }//else if-2
     else {
         System.out.println("Error");
     }//else
 }while(true);
     int num1 = 0;
     int num2 = 1;
     for (int i = 1; i <= 10; i++) {
         System.out.print(", " + num1);
         int temp = num1;
         num1 += num2;
         num2 = temp;
     }*/
//pattern==1
//     1
//     33
//     123
//     5555
//     12345
//     777777
// System.out.println("how much row you need ?");
// int userinput=con.nextInt();;

        //patterns
        //pattern==1
        //     for (int i =1; i<=userinput; i++){
//         for(int j =1; j<=i; j++){
//             if(i%2==0){
//                 System.out.print(i+1);
//             }else{
//                 System.out.print(j);
//             }//else
//         }//for-j
//System.out.println();
//     }

//patern==2
//     1
//     1 0
//     1 0 1
//     1 0 1 0
//     1 0 1 0 1
//pattern==2
//     for(int i=1; i<=userinput; i++){
//         for(int j=1; j<=i; j++){
//             if(j%2==0){
//                 System.out.print("0");
//             }//if
//             else{
//                 System.out.print("1");
//             }//else
//         }System.out.println();
//
//     }

   /* pattern==3
     for(int i=1; i<10; i++){
       if(i<=5) { for(int j =1; j<=i; j++){
    System.out.print("*");  }//for-2
           System.out.println();
     }else {
       for(int j =1; j<=10-i; j++){
           System.out.print("*");
       }//for-3
       System.out.println();//else
     }//else
     }//for-1
 pattern==4
     for(int i =1; i<=5; i++){

         for(int s=1; s<=5-i; s++){
             System.out.print(" ");
         }for(int a=1; a<=2*i-1; a++){
             System.out.print("*");
             }for(int s=1; s<=5-i; s++){
                 System.out.print(" ");}
System.out.println();
     }//for-1
      pattern==5
     for(int i =5; i>=1; i--){

         for(int s=1; s<=5-i; s++){
             System.out.print(" ");
         }for(int a=1; a<=2*i-1; a++){
             System.out.print("*");
         }for(int s=1; s<=5-i; s++){
             System.out.print(" ");}
         System.out.println();
     }//for-1
pattern==6

     for(int i=1; i<10; i++){
       if(i<=5) { for(int j =1; j<=i; j++){
    System.out.print("*");  }//for-2

           for(int s=1; s<=10-2*i; s++){
               System.out.print(" ");
           }  for(int j =1; j<=i; j++){
               System.out.print("*");  }//for-2
           System.out.println();
     }else {
           for(int j =1; j<=10-i; j++){
               System.out.print("*");  }
           for(int s=1; s<=2*i-10; s++){
               System.out.print(" ");
           }
       for(int j =1; j<=10-i; j++){
           System.out.print("*");
       }//for
       System.out.println();//else
     }//else
     }//for-1
*/

        //resturant program

      /*  int total = 0;
        String userinput;
        int humburger_price = 0;
        int cheese_price = 0;
        int combo_price = 0;
        int finger_price_small = 0;
        int finger_price_big = 0;
        int finger_input = 0;
        int humburger_input = 0;
        System.out.println("please write as list and in question answer with yas OR no not more   ");
        System.out.println("Hello? how can i help you?  ");
        System.out.println("Do you need shaw list ?");
        userinput = con.nextLine();
        do {
            System.out.println("list resturant \n****************\n humburger   price : 8$\n finger      price : ?");
            userinput = con.next();
            if (userinput.equals("humburger") || userinput.equals("finger")) {
                if (userinput.equals("humburger")) {
                    System.out.println("how much humburger you need?");
                    humburger_input = con.nextInt();
                    humburger_price = 8 * humburger_input;
                    System.out.println("with cheese yas OR  no ");
                    userinput = con.next();
                    if (userinput.equals("yas")) {
                        System.out.println("cheese costs extra 2 dollar do you agree?");
                        userinput = con.next();
                        if (userinput.equals("yas")) {
                            cheese_price = 2 * humburger_input;
                            System.out.println("do you want a combo?");
                            userinput = con.next();
                            if (userinput.equals("yas")) {
                                System.out.println("combo costs extra 4 dollar do you agree?");
                                userinput = con.next();
                                if (userinput.equals("yas")) {
                                    combo_price = 4 * humburger_input;
                                }
                            }
                        } else {
                            System.out.println("do you want a combo?");
                            userinput = con.next();
                            if (userinput.equals("yas")) {
                                System.out.println("combo costs extra 4 dollar do you agree?");
                                userinput = con.next();
                                if (userinput.equals("yas")) {
                                    combo_price = 4 * humburger_input;
                                }
                            }
                        }
                    } else {
                        System.out.println("do you want a combo?");
                        userinput = con.next();
                        if (userinput.equals("yas")) {
                            System.out.println("combo costs extra 4 dollar do you agree?");
                            userinput = con.next();
                            if (userinput.equals("yas")) {
                                combo_price = 4 * humburger_input;

                            }
                        }
                    }
                } else if (userinput.equals("finger")) {
                    System.out.println("you need small or big finger");
                    System.out.println("small 2$ \nbig 4$ ");
                    userinput = con.next();
                    System.out.print("how much finger you need :");
                    if (userinput.equals("small")) {
                        finger_input = con.nextInt();
                        finger_price_small = 2 * finger_input;
                    } else if (userinput.equals("big")) {
                        finger_input = con.nextInt();
                        finger_price_big = 4 * finger_input;
                    }
                }
                System.out.println("you need any more ?");
                userinput = con.next();
                if (userinput.equals("no")) {

                    total = humburger_price + cheese_price + combo_price + finger_price_small + finger_price_big;
                    if (humburger_price != 0) {
                        System.out.println("8$ per humburger");
                    }
                    if (cheese_price != 0) {
                        System.out.println("2$ per cheese");
                    }
                    if (combo_price != 0) {
                        System.out.println("4$ per combo  ");
                    }
                    if (finger_price_small != 0) {
                        System.out.println("2$ per small finger");
                    }
                    if (finger_price_big != 0) {
                        System.out.println("4$ per big finger  ");
                    }
                    System.out.println("the  total is " + total + " dollar");

                    break;
                } else {

                    total = humburger_price + cheese_price + combo_price + finger_price_small + finger_price_big + total;

                }
            } else {
                System.out.println("error ,please write as list");
            }
        } while (true);*/


    }//main
}//class