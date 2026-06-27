public class DeadLock{

            static final String s1=new String("Java");
            static final String s2=new String("Technocard");

            public static void main(String args[]){

            Thread t1=new Thread(new Runnable() {
            @Override
            public void run(){
            synchronized(s1){
            System.out.println("Thread1 Locked "+s1+" Object");
            try{

               Thread.sleep(100);

              }catch(InterruptedException ie){
                  }
            synchronized(s2){
            System.out.println("Thread Locked "+s2+" Object");
                  }
               }
           }
        }
        );

          Thread t2=new Thread(new Runnable() {
            @Override
            public void run(){
            synchronized(s2){
            System.out.println("Thread2 Locked "+s2+" Object");
            try{

               Thread.sleep(100);

              }catch(InterruptedException ie){
                  }
            synchronized(s1){
            System.out.println("Thread Locked "+s1+" Object");
                  }
               }
           }
        }
        );

      t1.start();
      t2.start();
    }

}