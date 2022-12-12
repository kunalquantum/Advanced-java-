


//using Runnable interface we can create anonymous class
// to save the time and make program more efficient we can create an anonymous class
public class PriorityThread {
    public static void main(String[] args) throws Exception
    //the exception is handled here
    {




        //if we are using the object only one time then we can simple write the definiation inside the parameter of the thread
        //so this method will not need any class object directly instead it will use the class defination instead
        //using lambda expression


        Thread t1 =new Thread(()->

        {
            for  (int i =2;i>=0;i--)
            {
                //the fucntion Thread.currentThread().getPriority() will show the priority of current thread
                System.out.println("percentange of dimension developement priority:"+Thread.currentThread().getPriority());
                try{
                    Thread.sleep(1000);
                }catch (Exception e){};
            }
        });//this is a another way for naming the thread
        Thread t2 =new Thread(()->

        {
            for (int i =3;i>=0;i--)
            {
                System.out.println("percentage of time dilation priority:"+Thread.currentThread().getPriority());
                try{
                    Thread.sleep(1000);
                }catch (Exception e){};
            }
        });

        //the thread have priority defined by default
        System.out.println("priority of Thread one default:"+t1.getPriority());
        System.out.println("priority of Thread one default:"+t2.getPriority());
        //getPriority will return the  priority of the thread
        //range of prioriity goes from 1 to 10 (1 means least and 10 means most and 5 is normal )

        //here we are setting priority (user defined) priority using function setPriority
        t1.setPriority(10);//10 indicates highest priority
        t2.setPriority(1);//1 indicates the least prioriiy

        //priority  after setting
        System.out.println("priority of Thread one user defined)(constant):"+t1.getPriority());
        System.out.println("priority of Thread two user defined)(constant):"+t2.getPriority());

        //instead of making the number to indiacte the priority we can max or min priority using the functions
        t1.setPriority(Thread.MIN_PRIORITY);//Least priority
        t2.setPriority(Thread.MAX_PRIORITY);//most priority

        //priority  after setting
        System.out.println("priority of Thread one user defined)(function):"+t1.getPriority());
        System.out.println("priority of Thread two user defined:(function) "+t2.getPriority());


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



