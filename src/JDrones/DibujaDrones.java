package JDrones;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.util.ArrayList;
public class DibujaDrones extends JPanel{
    private int x;
    private int y;
    private int n;
    private int div;
    private BufferedImage ima;
    private ArrayList<Ellipse2D> circulos;
    
    DibujaDrones(BufferedImage ima){
        this.ima=ima;
        this.x=x;
        this.y=y;
        this.n=n;
        div=0;
        circulos= new ArrayList<Ellipse2D>();
    }
    public void paintComponent(Graphics g){
        int cont=0;
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(ima, -300, -10, this);
        g2.setColor(Color.black);
        switch(div){  
            case 1:
                g2.fill(new Rectangle2D.Double(390, 0, 2, 550));
            break;
            case 2:
                g2.fill(new Rectangle2D.Double(390, 0, 2, 550));
                g2.fill(new Rectangle2D.Double(0, 260, 790, 2));
            break;
            case 3:
                g2.fill(new Rectangle2D.Double(0, 260, 790, 2));//horizontal
                g2.fill(new Rectangle2D.Double(260, 0, 2, 550));
                g2.fill(new Rectangle2D.Double(520, 0, 2, 550));
            break;
            case 4:
                g2.fill(new Rectangle2D.Double(195, 0, 2, 550));
                g2.fill(new Rectangle2D.Double(390, 0, 2, 550));
                g2.fill(new Rectangle2D.Double(585, 0, 2, 550));
                g2.fill(new Rectangle2D.Double(0, 260, 790, 2));//horizontal
            break;
            case 5:
                g2.fill(new Rectangle2D.Double(156, 0, 2, 550));
                g2.fill(new Rectangle2D.Double(312, 0, 2, 550));
                g2.fill(new Rectangle2D.Double(468, 0, 2, 550));
                g2.fill(new Rectangle2D.Double(624, 0, 2, 550));
                g2.fill(new Rectangle2D.Double(0, 260, 790, 2));
            break;            
        }
        for(Ellipse2D c:circulos){
            if(n==cont){
                c.setFrame(x, y, 20, 20);
            }
            g2.fill((Ellipse2D)c);
            cont++;
        }
    }
    public void CreaCirculo(){
        circulos.add(new Ellipse2D.Double());
    }
    public void limpiarCirculo(){
        circulos.clear();
    }
    public void ActualizaXY(int x,int y, int n){
        this.x=x;
        this.y=y;
        this.n=n;  
    }
    public void setDivisiones(int div){
        div=div/2;
        this.div = div;
    }
}
