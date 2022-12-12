


//using Runnable interface we can create anonymous class
// to save the time and make program more efficient we can create an anonymous class
public class NamingThread {
    public static void main(String[] args) throws Exception
    //the exception is handled here
    {




        //if we are using the object only one time then we can simple write the definiation inside the parameter of the thread
        //so this method will not need any class object directly instead it will use the class defination instead
        //using lambda expression


        Thread t1 =new Thread(()->

        {
            for  (int i =5;i>=0;i--)
            {
                System.out.println("percentange of dimension developement:"+i+"%.....");
                try{
                    Thread.sleep(1000);
                }catch (Exception e){};
            }
        },"dark");//this is a another way for naming the thread
        Thread t2 =new Thread(()->

        {
            for (int i =5;i>=0;i--)
            {
                System.out.println("percentage of time dilation:"+i+"%......");
                try{
                    Thread.sleep(1000);
                }catch (Exception e){};
            }
        },"Great dark");//this is a another way for naming the thread

        //there are by default name for the threads if not assinged
        t1.getName();
        t2.getName();

        //setName() this function is used to give the ()user defined name to the thread
        t1.setName("kunal ");
        t2.setName("siddhi");
        //getname() is function use to see the name of the function
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        // another method to set the name of the thread
        t1.start();
        System.out.println();
        try{
            Thread.sleep(34);
        }catch (Exception e){};
        t2.start();
        t1.join();
        System.out.println("the running part is done");
        t2.join();
        //this will make the main thread to wait until the t1 and t2 thread actually completes executions
        System.out.println("exiting... the world");




    }
}



