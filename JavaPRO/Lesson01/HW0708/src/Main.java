public class Main {
    public static void main(String[] args) throws InterruptedException {
        DivByTwo divByTwo = new DivByTwo();
        DivByTree divByTree = new DivByTree();

        Thread thread1 = new Thread(divByTwo);
        Thread thread2 = new Thread(divByTree);

        thread1.start();
        thread2.start();

        Thread.sleep(3000);

        thread1.interrupt();
        thread2.interrupt();

        thread1.join();
        thread2.join();

        System.out.println("Поток завершён.");
    }
}
