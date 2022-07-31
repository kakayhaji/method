package mobail;

public class Battery {
    public int batterylevel;
    public int capacity;

    public Battery(int batterylevel, int capacity) {
        this.batterylevel = batterylevel;
        this.capacity = capacity;
    }

    public void setBatterylevel(int batterylevel) {
        if(batterylevel<0 && batterylevel>100){
            System.out.println("ERROR Pleas enter battery level between 0 TO 100");
        }else{
        this.batterylevel = batterylevel;}
    }
    public int getBatterylevel() {
        return batterylevel;
    }

    public int getCapacity() {
        return capacity;
    }
    public void showbatterylevel(){
        System.out.println("your battery level is ="+this.batterylevel);
    }

    @Override
    public String toString() {
        return "Battery{" +
                "batterylevel=" + batterylevel +
                ", capacity=" + capacity +
                '}';
    }
}
