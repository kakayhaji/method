package mobail;

public class Screen {
   public int brightnesspercentage;
   public int resolution;

    public Screen(int brightnesspercentage, int resolution) {
        this.brightnesspercentage = brightnesspercentage;
        this.resolution = resolution;

    }

    public int getBrightnesspercentage() {
        return brightnesspercentage;
    }
    public int getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "brightnesspercentage=" + brightnesspercentage +
                ", resolution=" + resolution +
                '}';
    }
}
