//using Runnable interface we can create anonymous class
// to save the time and make program more efficient we can create an anonymous class
public class anonymous_class {
    public static void main(String[] args) {
        //using tradituonal convetion
        Runnable r1 =new Runnable() {
            @Override
            synchronized
            public void  run() {
                for (int i =12;i>=0;i--)
                {
                    System.out.println("anonymous part 1...'wooo'");
                    try{
                        Thread.sleep(3400);
                    }catch (Exception e){}
                }
            }
        }; // it is a class hence need a termitor to break
 //using lambda expression

        Runnable r2 =()->

                {
                for (int i =12;i>=0;i--)
                {
                    System.out.println("anonymous part 2...'shooo'");
                    try{
                        Thread.sleep(3400);
                    }catch (Exception e){};
                }
            };
         // it is a class hence need a termitor to break

        Thread t1 =new Thread(r1);
        Thread t2 =new Thread(r2);

        t1.start();
        t2.start();



    }
}
