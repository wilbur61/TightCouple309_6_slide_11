package org.tightCouple;


public class Main {
    public static void main(String[] args) {

            SmartWorker sw = new SmartWorker ();
            LazyWorker lw = new LazyWorker();
            ExtraOrdWorker eo = new ExtraOrdWorker();

            Manager mn = new Manager (sw,lw,eo);
            mn.ManageWork ();

    }
}