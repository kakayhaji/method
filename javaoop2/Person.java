package javaoop2;
public class Person {
    String name;
    int age;
    public  Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void gohome(){
        System.out.println("Person Go Home");
    }
    public void goout(){
        System.out.println("Person Go Out");
    }
    public void identity(){
        System.out.println("Name :"+this.name+"  Age :"+this.age);
    }
    public String toString() {
        return "name=" + name + "\n" +
                "age=" + age;
    }
}
