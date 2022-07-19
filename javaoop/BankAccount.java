package javaoop;

public class BankAccount {
    private String ownername;
    private double balance;
   public void setownername(String name){
       this.ownername=name;
    }//setownername-method

    public String getOwnername(){
        return this.ownername;
    }//getownername-method

   private void setBalance(double setbalance){
    if(setbalance>0){
    this.balance=setbalance;}
}//setbalance-method

    public double getBalance(){
        return this.balance;
    }//getbalance-method

    public boolean deposit(double putmoney){
       if(putmoney>0){
           this.balance +=putmoney;
           return true;
       }//if
       else{return false;}
    }//deposit-method

    public boolean withdraw(double withdraw){
        if(this.balance>withdraw){
            this.balance-=withdraw;
            return true;
        }else{ return false;}
    }//withdraw-method

  String account_1_name="ahmad";//id=1
    String account_2_name="kaka";//id=2
    int[][] Bankaccount={
            {1,70}
            ,{2,70}
    };

    boolean sendmoney(int BankAccount_ID_sender,int BankAccount_ID_receiver,double amountTosend) {
        if (amountTosend > 0) {
            for (int i = 0; i < 2; i++) {
                if (Bankaccount[i][0] == BankAccount_ID_sender && amountTosend < Bankaccount[i][1]) {
                    Bankaccount[i][1] -= amountTosend;
                   // System.out.println("After sender your id is =" + Bankaccount[i][0] + " And your Balance is =" + Bankaccount[i][1]+"$");

                    for (int j = 0; j < 2; j++) {
                        if (Bankaccount[j][0] == BankAccount_ID_receiver) {
                            Bankaccount[j][1] += amountTosend;
                            //System.out.println("After receiver your id is =" + Bankaccount[j][0] + " And your Balance is =" + Bankaccount[j][1]+"$");
                            return true;
                        }
                    }
                }
            }
        }
           return false;
        }


}
