class alpha {
    int num;
    boolean valueSet = false;
    public synchronized void put(int num) {
        while (valueSet) {//this block will see wheather the value is already set or not //
            try {wait();} catch (Exception e){//whenever we use wait we will see that our function is synchronised//
                System.out.println(e);
            }
        }
        System.out.println("put"+num);
        this.num = num;
        valueSet=true;
        notify();
    }

    public synchronized void get() {
        while (!valueSet) {//this block will see wheather the value is already set or not //
            try {wait();} catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("get: "+num);
        valueSet=false;
        notify();
    }
}
    class producer implements Runnable{
        alpha b;
        public producer(alpha b){
            this.b=b;
            Thread t = new Thread(this,"producer");
            t.start();
        }
        public void run()
        {
            int i=0;
            while(true)
            {
                b.put(i++);
                try {
                    Thread.sleep(10);
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
        }
    }


class consumer implements Runnable{
    alpha b;
    public consumer(alpha b){
        this.b=b;
        Thread t = new Thread(this,"consumer");
        t.start();
    }
    public void run()
    {
        int i=0;
        while(true)
        {
            b.get();
            try {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}


public class interthreadcommunication {
    public static void main(String[] args) {
        alpha b=new alpha();
        //producing annonymous object
        new producer( b);
        new consumer(b);
    }

}
