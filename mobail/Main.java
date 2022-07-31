package mobail;

public class Main {
    public static void main (String[] args){
Camera camera=new Camera(16,10);
Battery battery =new Battery(17,8000);
Screen screen=new Screen(15,80);
Smartphone smartphone=new Smartphone(camera,screen,battery);
smartphone.opencamera();
smartphone.closecamera();
smartphone.toString();
System.out.println(smartphone.getScreen());
System.out.println(smartphone.getBattery());
smartphone.decreasebrightness();
smartphone.increasebrightness();
        System.out.println(smartphone);
    }
}
