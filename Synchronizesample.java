package Casting;
 class Tables{
    void Printtable(int n){
//        for(int i=0;i<5;i++){
//            System.out.println(n*i);
//        }

        while(n<100){
            System.out.println(n);
            n++;


        }

    }
}
class fThread1 extends Thread{
    Tables t;
    fThread1(Tables t){
        t.Printtable(5);
    }

}
class fThread2 extends Thread{
    Tables t;
    fThread2(Tables t){
        t.Printtable(100);
    }
}

public class Synchronizesample {
    public static void main(String [] args){
        Tables obj1=new Tables();
        fThread1 t1=new fThread1(obj1);
        fThread2 t2=new fThread2(obj1);
        t1.start();
        t2.start();


    }
}
