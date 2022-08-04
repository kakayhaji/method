package javaoop3;

public class SelectionTool  implements Toolinterface{
   @Override
    public void RightClick() {
        System.out.println("right click pressed on Selectiontool");
    }

    @Override
    public void LeftClick() {
        System.out.println("left click pressed on Selectiontool ");
    }
}
