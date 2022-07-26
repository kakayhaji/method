package javaoop2;
public class Main {
    public static void main(String[] args) {

        Student s1=new Student("ahmad",15,4);
        s1.setMark(0,68);
        s1.setMark(1,80);
        s1.setMark(2,77);
        s1.setMark(3,78);
        s1.StudentAverageMark();
        System.out.println(s1.toString());
        Student s2=new Student("kaka",18,3);
        s2.setMark(0,98);
        s2.setMark(1,92);
        s2.setMark(2,91);
        s2.StudentAverageMark();
        System.out.println(s2.toString());
        Person p1=new Teacher("ahmad",85,500,8);
        System.out.println(p1.toString());
    }
}
