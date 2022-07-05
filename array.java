package firstweek;
import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner con = new Scanner(System.in);

     // array-exercise-1
        System.out.println("exercise-1");
        int [] array=new int[5];
        System.out.println("5 zhamara wardagryn bo arrayaka");
for(int i=0; i<5; i++){
    System.out.print("zhmaray "+(i+1)+"m daxil bka :");
    array[i]=con.nextInt();
}//for-1
System.out.print("array =");
        System.out.print(" { ");
for(int i=0; i<5; i++){
    System.out.print(array[i]);
    if(i<5-1){
        System.out.print(",");
    }
}//for-2
        System.out.println(" }");
        System.out.println("---------------------");
       // array-exercise-2
        System.out.println("exercise-2");
        int[] arrayy = {1,2,3};
        System.out.print("sum of the array =");
   System.out.println(sumall(arrayy));
        System.out.println("---------------------");
        //array-exercise-3
        System.out.println("exercise-3");
int [][] Array= {
        {5,2} ,
        {4,3}
};
Array=arraysquer(Array);
        System.out.print("{");
for(int i=0; i<2; i++){
    for(int j=0; j<2; j++){
        System.out.print(" "+Array[i][j]);
        if(j<1) System.out.print(",");
    }//for-j
   if(i<1) System.out.println();
    System.out.print(" ");
}//for-i
        System.out.print(" }");

    }//main
    public static int sumall(int[] arrayy){
      int sumall=0;
      for(int i=0; i<3; i++){
          sumall+= arrayy[i];
      }
        return sumall;
    }//sumall-method
    public static int[][] arraysquer(int [][] Array){
       for (int i=0; i<2; i++){
           for(int j=0; j<2; j++){
               Array[i][j]= Array[i][j]*Array[i][j];
           }
       }
        return Array;
    }
}//class
