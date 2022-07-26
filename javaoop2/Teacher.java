package javaoop2;
public class Teacher extends Person{
    double basesalary;
    int  classcount;

    public Teacher(String name, int age,double basesalary,int classcount){
        super(name,age);
        this.basesalary=basesalary;
        this.classcount=classcount;
    }//constructor
    public void goHome(){
        System.out.println("Teacher Take Students Paper Before Going Home");
    }//gohome-method
    public void goOut(){
        System.out.println("Teacher Take Thier Laptop Before Going Out");
    }//goout-method
    public double calculatesalary(){
        return basesalary;
    }
    public String toString(){
        return "teacher name :"+name+ "\n"
                 +"age :"+age+"\n"
                +"classscount :"+classcount;

    }
}
