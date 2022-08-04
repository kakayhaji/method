package javaoop3;

public class EraserTool implements Toolinterface{
   @Override
    public void RightClick() {
        System.out.println("right click pressed on EraserTool");
    }

    @Override
    public void LeftClick() {
        System.out.println("left click pressed on EraserTool ");
    }

}
