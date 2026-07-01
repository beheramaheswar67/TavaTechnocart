package Core;
public class Producer implements Runnable {
    Stock s;
    Thread t;

    Producer(Stock s) {
        this.s = s;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                    }
            s.addGoods((int)(Math.random()*100));
        }
    }
    public void kill(){
        t.stop();
        t = null; 
    }
    
    
}
