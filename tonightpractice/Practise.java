package tonightpractice;
public class Practise {
    public static void main(String[] args) {
        int result=0;
        int inputlevelexam;

mathmatecalcheck math=new mathmatecalcheck();
        System.out.println("we have 5 question of  mathmaticaly ");
        inputlevelexam=math.LevelOfGame();
       result= math.Exam(inputlevelexam);
        System.out.println( math.result(result));
    }//main
}//class
