
class Myth1 extends Thread {
    public void run() {
        int i = 0;
        while (i <= 45) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Th1");
            i++;
            
        }
     }




}
class Myth2 extends Thread {
    public void run() {
        int i = 0;
        while (i <= 25) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Th2");
            i++;
            
        }
     }




}
public class Thr{

    
    public static void main(String[] args) {
        Myth1 t1 = new Myth1();
        Myth2 t2 = new Myth2();
        t1.start();
        t2.start();
        
    }
}