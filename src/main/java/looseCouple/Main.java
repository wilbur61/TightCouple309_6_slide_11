package looseCouple;

/*

From the previous example, to implement loose coupling, notice
that we are not going to touch the manager class when we want
to extend it with the extraordinary worker class.
We will write a new extraordinary worker class and implement
the interface. And in the client program, we will call it.
We will create an interface named IWorker, and every worker
will implement it. This program follows the OPEN/CLOSED PRINCIPLE
and dependency inversion.

 */

public class Main {
    public static void main(String[] args) {
        SmartWorker sw = new SmartWorker();
        Manager mn = new Manager(sw);
        mn.ManageWork();

        LazyWorker lw = new LazyWorker();
        Manager mn2 = new Manager(lw);
        mn2.ManageWork();

        ExtraordinaryWorker ew = new ExtraordinaryWorker();
        Manager mn3 = new Manager(ew);
        mn3.ManageWork();
    }
}
