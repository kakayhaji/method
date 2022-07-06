package firstweek;
import java.util.Scanner;
public class advance {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
      //exercise-1

        System.out.print("How much element of array :");
        int elemnet_of_array=con.nextInt();
       String[] Array=new String[elemnet_of_array];

        for(int i=0; i<elemnet_of_array; i++){
            Array[i]="x";
        }
        System.out.println("we add number to array  ");
        for(int i=0; i<elemnet_of_array; i++){
            System.out.print((1+i)+"m elemnet :");
            Array[i]=con.next();
            System.out.print("{ ");
            for(int j =0; j<elemnet_of_array; j++){
                System.out.print(Array[j]+",");
            }System.out.print(" }");
            System.out.println();
        }
        System.out.print("your array = {");
        for(int i=0; i<elemnet_of_array; i++){
            System.out.print(Array[i]);
            if(i<elemnet_of_array-1)System.out.print(", ");
        }System.out.println("}");
        // exercise-2&3
        System.out.println("------------");
        System.out.println("exercise-2 ");
        System.out.print("How much row  you need  for your array :");
        int row_of_array=con.nextInt();
        System.out.print("How much coloum  you need  for your array :");
        int coloum_of_array=con.nextInt();
        int[][] array=new int[row_of_array][coloum_of_array];

        for(int i=0; i<row_of_array; i++){
            for(int j=0; j<coloum_of_array; j++){
                array[i][j]=0;
            }
        }
        System.out.println("we add number to array ");
        for(int i=0; i<row_of_array; i++) {
            for (int j = 0; j < coloum_of_array; j++) {
                System.out.print("elemnet of row:" + (i + 1) + "coloum:" + (j + 1) + " is :");
                array[i][j] = con.nextInt();
            }
        }

        System.out.println("your array is ");
            System.out.print("{ ");
            for(int i =0; i<row_of_array; i++){
                for(int j=0; j<coloum_of_array; j++){
                System.out.print(array[i][j]);
                if(j<coloum_of_array-1)System.out.print(", ");
            }
           if(i<row_of_array-1) {System.out.println();
                System.out.print("  ");}//if
        }System.out.println(" }");
        System.out.print("what to do with array 1-sum OR 2-squaer :");
        int x=con.nextInt();
        if(x==1){
            int sumallarray=0;
            System.out.print("you need to sum 1-all or 2-one Row 3-one coloum :");
            int y=con.nextInt();
            if(y==1){
      sumallarray= sumallarray(array,row_of_array,coloum_of_array);
System.out.println("the sum all your array is ="+sumallarray);}//sumall
            if(y==2){
                System.out.print("what row you need to sum :");
                int row_number=con.nextInt();
            int sum_of_row= sum_of_row(array,row_of_array,coloum_of_array,row_number);
                System.out.println("the sum of Row:"+row_number+" is ="+sum_of_row);
            }//sum-row
            if(y==3){
                System.out.print("what coloum you need to sum :");
                  int coloum_number=con.nextInt();
                int sum_of_coloum= sum_of_coloum(array,row_of_array,coloum_of_array,coloum_number);
                System.out.println("the sum of coloum:"+coloum_number+" is ="+sum_of_coloum);
            }//sum-row
        }//sum-if
if(x==2){

    array=arraysquer(array,row_of_array,coloum_of_array);
    System.out.print("{");
    for(int i=0; i<row_of_array; i++){
        for(int j=0; j<coloum_of_array; j++){
            System.out.print(" "+array[i][j]);
            if(j<1) System.out.print(",");
        }//for-j
        if(i<1) System.out.println();
        System.out.print(" ");
    }//for-i
    System.out.print(" }");
}//if-square



    }//main

    public static int sumallarray(int[][] array,int row_of_array,int coloum_of_array){
      int sumallarray=0;

       for(int i=0; i<row_of_array; i++){
           for(int j =0; j<coloum_of_array; j++){
           sumallarray+=array[i][j];
       }//for-1
       }//for-2

       return sumallarray;
    }
    public static int sum_of_row(int[][] array,int row_of_array,int coloum_of_array,int row_number){
       int[] row=new int[row_of_array];
        for(int i=0; i<row_of_array; i++){
            for(int j =0; j<coloum_of_array; j++){
                row[i]+=array[i][j];
            }//for-1
        }//for-2
        int sumrow=row[row_number];
        return sumrow;
    }//sum-of-row
    public static int sum_of_coloum(int[][] array,int coloum_of_array,int row_of_array,int coloum_number){
      int[] coloum=new int[coloum_of_array];
        for(int i=0; i<coloum_of_array; i++){
            for(int j =0; j<row_of_array; j++){
                coloum[i]+=array[j][i];
            }//for-1
        }//for-2
        int sumcoloum=coloum[coloum_number];
        return sumcoloum;
    }//sum-of-coloum
    public static int[][] arraysquer(int [][] Array,int row_of_array,int coloum_of_array){
        for (int i=0; i<row_of_array; i++){
            for(int j=0; j<coloum_of_array; j++){
                Array[i][j]= Array[i][j]*Array[i][j];
            }
        }
        return Array;
    }
}
