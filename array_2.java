package firstweek;
import java.util.Scanner;
public class array_2 {
    public static void main(String[] args){
        Scanner con=new Scanner(System.in);
        System.out.print("how much  row :");
        int rownumber=con.nextInt();
        System.out.print("how much coloum :");
        int coloumnumber=con.nextInt();
        System.out.println("enter number to array");
        int[][] array=new int[rownumber][coloumnumber];
        for(int i=0; i<rownumber; i++){
            for(int j=0; j<coloumnumber; j++){
                System.out.print("zhmaray dany bo row:"+(i+1)+"coloumy:"+(j+1)+":");
                 array[i][j]=con.nextInt();
            }//for-2
        }//for-1
      do{  System.out.print("do you need 1-search for element in array OR \n2-minimum number in array OR 3-maximum number in array to stop enter(0) :");
       int choose_input=con.nextInt();
        if(choose_input==1){
            System.out.print("enter the number you search for it :");
            int numbersearch=con.nextInt();
           System.out.println(search_for_elemnet_in_array(array,numbersearch,rownumber,coloumnumber));
        }
        else if(choose_input==2){
          System.out.println("the minimum number is ="+minimumnumberofarray(array,rownumber,coloumnumber));
        }
        else if(choose_input==3){
            System.out.println("the miximum number is ="+miximumnumberofarray(array,rownumber,coloumnumber));
        }else if(choose_input==0){break;}
        else{
            System.out.println ("ERROR please enter true number ");
        }
     if(1<=choose_input && choose_input<= 3){  System.out.println("your array ");
        System.out.print("{ ");
         for(int i=0; i<rownumber; i++){
            for(int j=0; j<coloumnumber; j++){
                System.out.print(array[i][j]);
                if(j<coloumnumber-1)System.out.print(" , ");
            } if(i<rownumber-1)System.out.println("  ");
        } System.out.println (" }");}

      }while(true);
    }//main
    public static int search_for_elemnet_in_array(int[][] array,int numbersearch,int rownumber,int coloumnumber){
       int find_number=0;
        for(int i=0; i<rownumber; i++){
           for(int j=0; j<coloumnumber; j++){
               if(numbersearch==array[i][j]){
                  find_number=array[i][j] ;
               }//if
               else{
                   find_number=-1;
               }//else
           }//for_2
       }//for_1
        return find_number;
    }//serach_of_element_in_array-method
    public static int minimumnumberofarray(int[][] array, int row_number,int coloum_number){
       int minimumnumber=array[0][0];
        for(int i=0; i<row_number; i++){
            for(int j=0; j<coloum_number; j++){
                minimumnumber=Math.min(minimumnumber,array[i][j]);
            }
        }
        return minimumnumber;
    }
    public static int miximumnumberofarray(int[][] array, int row_number,int coloum_number){
        int miximumnumber=array[0][0];
        for(int i=0; i<row_number; i++){
            for(int j=0; j<coloum_number; j++){
                miximumnumber=Math.max(miximumnumber,array[i][j]);
            }
        }
        return miximumnumber;
    }
}//class
