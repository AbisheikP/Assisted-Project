package ExceptionalHandling;

public class threadsCreation{
	 
    public static int myCount = 0;
    public threadsCreation(){
         
    }
    public void run() {
        while(threadsCreation.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++threadsCreation.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        threadsCreation mrt = new threadsCreation();
        Thread t = new threadsCreation(mrt);
        t.start();
        while(threadsCreation.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++threadsCreation.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
