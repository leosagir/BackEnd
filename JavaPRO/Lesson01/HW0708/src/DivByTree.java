public class DivByTree implements Runnable{
    @Override
    public void run() {
        int i=0;
        while(!Thread.currentThread().isInterrupted()){
            if(i%3==0){
                System.out.println(i+" Делится на 3");
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
