package JDrones;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import javax.swing.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Dron extends Thread{
    public MiX x;
    public MiY y;
    private DibujaDrones panel;
    private int a=1;
    private int b=1;
    public boolean kill=false;
    private Lock mutex;
    private Lock vCondition;
    private Condition condition;
    private Semaphore semaforo;
    public double datosX[];
    public double datosY[];
    private int id;
    private int algoritmo=0;
    private int limite[];
    private CyclicBarrier barrera;
    private int cont=0;
    
    
    
    Dron(MiX x, MiY y, DibujaDrones panel, int n){
        this.x=x;
        this.y=y;
        this.id=n;
        this.panel=panel;
        mutex = new ReentrantLock();
        vCondition = new ReentrantLock();
        condition= vCondition.newCondition();
        barrera= new CyclicBarrier(1);
        semaforo = new Semaphore (1);
        limite= new int[4];
        datosX= new double[10000];
        datosY= new double[10000];
    }
    
    public  void run(){
        while(!kill){
            switch(algoritmo){
                    case 1: 
                        mutex();
                    break;
                    case 2:
                        semaforos();
                    break;
                    case 3: 
                        vCondition();
                    break;
                    case 4:
                        monitores();
                    break;
                    case 5: 
                        barrera();
                    break;
            }
            
        }
    }
    public void algoritmo(int alg){
        this.algoritmo = alg;
    }
    public void setLimites(int x1, int x2, int y1, int y2){
        limite[0]=x1;
        limite[1]=x2;
        limite[2]=y1;
        limite[3]=y2; 
    }
    
    public void area(){        
        if (y.getY()==limite[3])
            b=-b;
        if (y.getY()==limite[2])
            b=-b;
        if (x.getX()==limite[1])
            a=-a;
        if (x.getX()==limite[0])
            a=-a; 
    }
    
    public void mutex(){
        try{
                if(mutex.tryLock()){
                    mutex.lock();
                        y.setY(y.getY()+b);
                        x.setX(x.getX()+a);
                        panel.ActualizaXY(x.getX(),y.getY(), id);
                        panel.repaint();
                        this.sleep(3+(int)Math.random()*10);
                    mutex.unlock();
                }
                area();
            }catch(Exception e){e.printStackTrace();}
    }
    
    public void barrera(){
        try{
                        y.setY(y.getY()+b);
                        x.setX(x.getX()+a);
                        panel.ActualizaXY(x.getX(),y.getY(), id);
                        panel.repaint();
                        this.sleep(3+(int)Math.random()*10);
                        barrera.await();
                area();
            }catch(Exception e){e.printStackTrace();}
    }
    
    public void vCondition(){ 
        try{ 
            mutex.lock();
            condition.signal();
        }catch(Exception e){
        }
                        y.setY(y.getY()+b);
                        x.setX(x.getX()+a);
                        panel.ActualizaXY(x.getX(),y.getY(), id);
                        panel.repaint();
        try{   
            condition.wait();
        }catch(Exception e){}
        finally{
            mutex.unlock();
        }
        try{
            sleep(3+(int)Math.random()*10);
        }catch(Exception e){}
        area(); 
    }
    
    public void semaforos(){
    
    try{
                    semaforo.acquire();
                        y.setY(y.getY()+b);
                        x.setX(x.getX()+a);
                        panel.ActualizaXY(x.getX(),y.getY(), id);
                        panel.repaint();
                        this.sleep(3+(int)Math.random()*10);
                    semaforo.release();
                        area();
            }catch(Exception e){e.printStackTrace();}
    }
    public void monitores(){
    
    try{
                    synchronized(this){
                        y.setY(y.getY()+b);
                        x.setX(x.getX()+a);
                        panel.ActualizaXY(x.getX(),y.getY(), id);
                        panel.repaint();
                        sleep(3+(int)Math.random()*10);
                    }
                        area();
            }catch(Exception e){e.printStackTrace();}
    }
}
