class Demo implements Runnable
{
    public void run()
    {
        System.out.println("Thread is Running");
    }
}

class ThreadDemo3
{
    public static void main(String A[])
    {
        System.out.println("Inside main thread");

        Demo dobj = new Demo();
        Thread tobj = new Thread(dobj);

        tobj.start();
    }
}