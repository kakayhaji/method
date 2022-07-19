package javaoop;

public class Main {
public static void main(String[] args){
    BankAccount obj1= new BankAccount("hama",77);


    //for send money we have 2 account-1 name=ahmad id=1 account-2 name=kaka id=2
    //both have 70$ and to send enter id when you call method
System.out.println(obj1.sendmoney(2,1,20));

}//main
}//class
