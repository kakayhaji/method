package tonightpractice;
public class Practise {
    public static void main(String[] args) {
        int result=0;
        int inputlevelexam;

mathmatecalcheck math=new mathmatecalcheck();
        System.out.println("we have 5 question of  mathmaticaly ");
        inputlevelexam=math.LevelOfGame();
        System.out.println(inputlevelexam);
       result= math.Exam(inputlevelexam);
        System.out.println(result);
        System.out.println( math.result(result));
    }//main
}//class
