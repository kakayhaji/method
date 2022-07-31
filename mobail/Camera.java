package mobail;

public class Camera {

   public int pixels;
    public int zoom;
   public boolean isopen=false;

    public Camera(int pixel, int zoom){
        this.pixels=pixel;
        this.zoom=zoom;
    }//construct

    public int getPixels() {
        return pixels;
    }

    public int getZoom() {
        return zoom;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "pixels=" + pixels +
                ", zoom=" + zoom +
                ", isopen=" + isopen +
                '}';
    }
}//class
