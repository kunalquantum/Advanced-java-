//interface using Runnable interface
//instead of extending the Thread class to a class we can use the interface Runnable to implement the Multithreading



//here we have a class welcome that will implement the class Runnable to call the thread class function run() and sleep()
class welcome implements Runnable
{
    public synchronized void run()
    {
        for(int i=0;i<=12;i++)
        {
            System.out.println("welcome to delta universe !!");
            try{
                Thread.sleep(1000); // this function sleep is used to pause the thread to run for the specific time (here we have 1000)
            }catch (Exception e){}

        }

    }

}


class dark implements Runnable
{
    public synchronized void run()
    {
        for(int i=0;i<=12;i++)
        {
            System.out.println("darkness is being initialted!");
            try{
                Thread.sleep(1000); // this function sleep is used to pause the thread to run for the specific time (here we have 1000)
            }catch (Exception e){}

        }

    }

}





public class multithreading_runnable_interface {
    public static void main(String[] args) {


        //in this case while using Runnable we cant call the start method directly using the object
        // we need to create the Thread objects through which we will call the start method
        Runnable w= new welcome();
        Runnable d= new dark();
        // after the creation of the object of the respective class we need to pass those object to the thread object so that
        // the run method of class of the respective objects will be created
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(d);
        
        t1.start();

        t2.start();






    }
}