

public class ThreadAnaS {
    public static void main(String[] args){
        Count c = new Count();
        c.count=10;
        c.flag=false;
        ThreadUret tu = new ThreadUret(c);
        Thread t = new Thread(tu);
        ThreadTuket tt = new ThreadTuket(c);
        Thread th = new Thread(tt);
        t.start();
        th.start();
    }
}