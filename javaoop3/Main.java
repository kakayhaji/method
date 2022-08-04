package javaoop3;

import javax.tools.Tool;

public class Main {
    public static void main(String [] args){
        ToolAction a=new ToolAction();
      EraserTool e=new EraserTool();
      BrushTool b=new BrushTool();
      SelectionTool s=new SelectionTool();
      e.LeftClick();
      e.RightClick();
      b.LeftClick();
      b.RightClick();
      s.LeftClick();
      s.RightClick();

    }
}
