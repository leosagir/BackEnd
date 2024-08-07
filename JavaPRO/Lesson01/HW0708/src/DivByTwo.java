public class DivByTwo implements Runnable {
    @Override
    public void run() {
        int i=1;
        while(!Thread.currentThread().isInterrupted()) {
            if(i%2==0){
                System.out.println( i+" Делится на 2");
            }
            i++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
