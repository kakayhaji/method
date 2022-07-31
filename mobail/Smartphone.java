package mobail;

public class Smartphone {
  private Camera camera;
  private Screen screen;
  private Battery battery;


  public Smartphone(Camera camera, Screen screen, Battery battery) {
    this.camera = camera;
    this.screen = screen;
    this.battery = battery;
    if(battery.batterylevel<20){if(screen.brightnesspercentage>40)screen.brightnesspercentage=40;}
  }
  public Camera getCamera() {
    return camera;
  }


  public Screen getScreen() {
    return screen;
  }

  public void setScreen(Screen screen) {
    this.screen = screen;
  }

  public Battery getBattery() {
    return battery;
  }

  public void setBattery(Battery battery) {
    this.battery = battery;
  }
  public void opencamera(){
    camera.isopen=true;
    System.out.println("camera already open");
  }
  public void closecamera(){
    camera.isopen=false;
    System.out.println("camera already closed1");
  }
  public void takepic(){
    if(camera.isopen==true){
      System.out.println("picture captured");
    }else{
      System.out.println("first open the camera");
    }
  }
  public void increasebrightness(){
    if(screen.brightnesspercentage>1 && screen.brightnesspercentage<100){
      if(screen.brightnesspercentage>80){
        System.out.println("your brightness level = "+screen.brightnesspercentage);
      }
      if(battery.batterylevel<20 || screen.brightnesspercentage>21){
        System.out.println("low battery level ,you can't increase brightness up to 40%");
      }
      screen.brightnesspercentage+=20;
      System.out.println("your brightness level is = "+screen.brightnesspercentage+"%");
    }
  }
  public void decreasebrightness(){
    if(screen.brightnesspercentage>0 && screen.brightnesspercentage<100) {
      if (screen.brightnesspercentage > 0 && screen.brightnesspercentage < 20) {
        System.out.println("your brightness =" + screen.brightnesspercentage);
      } else {
        screen.brightnesspercentage -= 20;
        System.out.println("your brightness =" + screen.brightnesspercentage);
      }
    }
  }

  @Override
  public String toString() {
    return "Smartphone{" +
            "camera=" + camera +
            ", screen=" + screen +
            ", battery=" + battery +
            '}';
  }
}
