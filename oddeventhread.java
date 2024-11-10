// 1.Write a java application program to print odd and even numbers less than 100 using multithreading. 

class OddThread extends Thread {
    int n = 100;
    public void run() {
        try {
            for (int i = 1; i <= n; i++) { 
                if(i % 2 ==1){
                    System.out.println("Odd number: " + i);
                    Thread.sleep(1000); 
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class EvenThread extends Thread {
    int n = 100;

    public void run() {
        try {
            for (int i = 1; i <= n; i++) { 
                if(i % 2 ==0){
                    System.out.println("Even number: " + i);
                    Thread.sleep(1000); 
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

public class oddeventhread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        oddThread.start();
        evenThread.start();
        
        
    }
}
