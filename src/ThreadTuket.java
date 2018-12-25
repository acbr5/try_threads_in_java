
public class ThreadTuket implements Runnable{
    Count c;

    public ThreadTuket(Count c){
        this.c=c;
    }
    @Override
    public void run() {
        for(int i=0; i<=10; i++){
            synchronized (c) {
                if(c.flag==false ) {
                    try {
                        Thread.sleep(20);
                        c.count--;
                        System.out.println("Fonksiyon Tüketti =" + c.count);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
