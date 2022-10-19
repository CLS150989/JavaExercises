public class Main {
    public static void main(String[] args) {
        // concurrency: different threads get handled by device´s cpu
        // by  something called a process


        Thread thread = new Thread(new Runnable() {
            @Override //code to be handled inside a worker thread
            public void run() {
                for(int i = 0; i < 10; i++){
                    System.out.println("printing "+ i +" in a worker thread");

                    //thread.sleep causes an exception so
                    //you have to ove rcome it with try... cath

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        thread.start();

        for(int i = 0; i < 10; i++){
            System.out.println("printing "+ i +" from a main thread");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
