public class Main {
    public static void main(String[] args) throws InterruptedException {
Long startTime = System.currentTimeMillis();
        System.out.println("Main start");

        MyThread1 thread1=new MyThread1(100,110);
        MyThread1 thread1a=new MyThread1(120,130);
        Thread thread2= new Thread(new MyTask());

        Runnable thread3=() ->{
            while (true){
        System.out.println("Clock "+ System.currentTimeMillis());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            }
        };

        thread1.start();
        thread1a.start();
        thread2.start();



        thread1.join();
        thread2.join();
        thread1a.join();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main: "+i);


            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
        System.out.println("Main finish");
        Long endTime = System.currentTimeMillis();
        System.out.println("Main time: " + (endTime - startTime));
    }


}
