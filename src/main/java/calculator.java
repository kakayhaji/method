import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner con=new Scanner(System.in);


   /*    System.out.print("enter first number:");
        double firstnumber=con.nextDouble();
        double resualt=0.0;
        while (true){
            System.out.println("pleas choose one of the oparations");
            System.out.println("1=+ 2=- 3=/ 4=* 5=a^x 6=mod " //in ther we need 2 input
                    + "\n 7=sin(x) 8=cos(x) 9=tan(x) 10=factoryal \n enter(0) to qiut"); //but in there we need 1 input
            int oparation = con.nextInt();

            if (1<= oparation && oparation<=6){
                System.out.println("enter second number:");
                if (oparation==1){
                    System.out.print(firstnumber+"+");
                    double secondnumber=con.nextDouble();
                    resualt=firstnumber+secondnumber;
                    System.out.println(firstnumber+"+"+secondnumber+"="+resualt);
                } //oparation-1
                else  if (oparation==2){
                    System.out.print(firstnumber+"-");
                    double secondnumber=con.nextDouble();
                    resualt=firstnumber-secondnumber;
                    System.out.println(firstnumber+"-"+secondnumber+"="+resualt);
                } //oparation-2
                else if (oparation==3){
                    System.out.print(firstnumber+"/");
                    double secondnumber=con.nextDouble();
                    resualt=firstnumber/secondnumber;
                    System.out.println(firstnumber+"/"+secondnumber+"="+resualt);
                } //oparation-3
                else if (oparation==4){
                    System.out.print(firstnumber+"*");
                    double secondnumber=con.nextDouble();
                    resualt=firstnumber*secondnumber;
                    System.out.println(firstnumber+"*"+secondnumber+"="+resualt);
                } //oparation-4
                else  if (oparation==5){
                    System.out.print(firstnumber+"^");
                    double secondnumber=con.nextDouble();
                    resualt=Math.pow(firstnumber,secondnumber);
                    System.out.println(firstnumber+"^"+secondnumber+"="+resualt);
                } //oparation-5
                else if (oparation==6){
                    System.out.print(firstnumber+"%");
                    double secondnumber=con.nextDouble();
                    resualt=firstnumber%secondnumber;
                    System.out.println(firstnumber+"%"+secondnumber+"="+resualt);
                } //oparation-6
            }//if-1
            else if (oparation==7){
                resualt=firstnumber*(Math.PI/180);
                resualt=Math.sin(firstnumber);
                System.out.println("sin("+firstnumber+") ="+resualt);
            }//oparation-7
            else if (oparation==8){
                resualt=firstnumber*(Math.PI/180);
                resualt=Math.cos(firstnumber);
                System.out.println("cos("+firstnumber+") ="+resualt);
            }//oparation-8
            else if (oparation==9){
                resualt=firstnumber*(Math.PI/180);
                resualt=Math.tan(firstnumber);
                System.out.println("tan("+firstnumber+") ="+resualt);
            }//oparatio-9
            else if(oparation==10) {
                double y=1;
                while(firstnumber>=1){
                    y=y*firstnumber;
                    firstnumber--;
                } //while-oparation-10
                resualt=y;
                System.out.println(resualt);
            } // oparation-10
            else if (oparation==0){
                System.out.println("your resualt ="+resualt);
                break;
            }//oparation-0
            firstnumber=resualt;
        }//while*/
        int s=0;
        s=con.nextInt();
        System.out.println(s);
    }//main
}//class