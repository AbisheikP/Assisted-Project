package ExceptionalHandling;

public class sleepWait 
{
    private static Object LOCK = new Object();
    public static void main(String args[]) throws InterruptedException
    {
        Thread.sleep(1000);
        System.out.println("Thread '" + Thread.currentThread().getName() + "' Abi is woken after sleeping for 20 second");
        synchronized (LOCK) 
        {
            LOCK.wait(1000);
            System.out.println("Object '" + LOCK + "' Abi is woken after" + " waiting for 15 second");
        }
    }
}
