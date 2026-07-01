package Core;
import Consumer;

public class Stock {
    int goods;
    public synchronized void addGoods(int i){
        goods +=i;
        System.out.println("Added goods are: "+i);
        System.out.println("Toral goods are: "+ goods);
        notify();
    }

    public synchronized int getGoods(int i){
        while (true) { 
            if(goods>i){
                goods -= i;
                System.out.println("deducted goods are : "+i);
                System.out.println("Total goods are: "+goods);
                break;
            }else{
                System.out.println("!!!!Incufficent Goods!!!!");
                try {
                    wait();
                } catch (Exception e) {
                }
            }
        }
        return goods;
    }
public static void main(String[] args) {

    Stock kk = new Stock();

    Producer p = new Producer(kk);
    Consumer s = new Consumer(kk);

    try{
        Thread.sleep(10000);
    }catch(InterruptedException ie){

    }

}

    
}
