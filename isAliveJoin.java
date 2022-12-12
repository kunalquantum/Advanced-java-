


//using Runnable interface we can create anonymous class
// to save the time and make program more efficient we can create an anonymous class
public class isAliveJoin {
    public static void main(String[] args) throws Exception
    //the exception is handled here
    {




        //if we are using the object only one time then we can simple write the definiation inside the parameter of the thread
        //so this method will not need any class object directly instead it will use the class defination instead
        //using lambda expression


        Thread t1 =new Thread(()->

        {
            for  (int i =100;i>=0;i--)
            {
                System.out.println("percentange of dimension developement:"+i+"%.....");
                try{
                    Thread.sleep(1000);
                }catch (Exception e){};
            }
        });
        Thread t2 =new Thread(()->

        {
            for (int i =100;i>=0;i--)
            {
                System.out.println("percentage of time dilation:"+i+"%......");
                try{
                    Thread.sleep(1000);
                }catch (Exception e){};
            }
        });;

        t1.start();
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



