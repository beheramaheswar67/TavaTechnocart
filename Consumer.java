public class Consumer implements Runnable{
    Stock s;
    Thread t;

    Consumer (Stock s) {
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
            s.getGoods((int)(Math.random()*100));
        }
    }
    public void kill(){
        t.stop();
        t = null;
    }
    
    
}

