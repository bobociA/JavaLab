import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Graphics;

public class Rrathet extends Canvas{
    public void paint(Graphics g){
        int a=200;
        int b=200;
        int x=30;
        for(int i=0;i<=10;i++){
            g.drawOval(a,b,x,x);
            a=a-20;
            b=b-20;
            x=x+40;
        }
    }
    

    public static void main(String[] args) {
        JFrame frame=new JFrame("Rethe bashkeqendrore");
        Canvas canvas=new Rrathet();
        canvas.setSize(500,500);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
}
