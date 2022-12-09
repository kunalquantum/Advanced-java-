import com.sun.jdi.PathSearchingVirtualMachine;
class goodmorning extends Thread{
    public synchronized void run()
    {
        for(int i=0;i<=5;i++){
        System.out.println("Good Morning!!");
        try{
            Thread.sleep(500);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        }
    }
}
class namaste extends Thread{
    public synchronized void run()
    {
        for(int i=0;i<=5;i++){
            System.out.println("Namaste!!");
            try{
                Thread.sleep(500);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        }
    }




public class MULTITHREADING {
    public static void main(String[] args) {
        //creatiing the object of the class //
        goodmorning gm=new goodmorning();
        namaste nm= new namaste();
        //creating the objects of the threads//
        Thread t1 = new goodmorning();
        Thread t2=new namaste();
        //calling or initiating the start method from the thread class //
        gm.start();
        nm.start();
        //calling the method of the classes //

    }
}
// to execute the  thread we should always use run() method it will execute the thread and the statements inside
