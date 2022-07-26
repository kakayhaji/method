package javaoop2;
public class Student extends Person{
    int[] Marks;
    int classcount;
    int averageofmarks;
    public Student(String name,int age,int classcount){
        super(name,age);
       this.classcount=classcount;
         Marks=new int[classcount];
    }
    public void goHome(){
        System.out.println("Students Take Their Bag Before Going Home");
        System.out.println(this.classcount);
    }
    public void goOut(){
        System.out.println("Students Take Their Homework And Bag Before Going Out");
    }
    public void setMark( int classindex,int  mark ){
       this.Marks[classindex]=mark;
    }

    public int StudentAverageMark() {
        int x = 0;
        for (int i = 0; i <Marks.length; i++) {
         x += Marks[i];
        }
        this.averageofmarks=x/Marks.length;
        return averageofmarks;
    }
    public String toString(){
        return "Student Name :"+name+"\n"
                +"Age :"+age+"\n"
                +"Average :"+this.averageofmarks;
    }

}
