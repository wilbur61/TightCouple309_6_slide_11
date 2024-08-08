package org.tightCouple;

public class Manager{
    SmartWorker sw;
    LazyWorker lw;
    ExtraOrdWorker ew; //added new object
    // modifying constructor
    public Manager (SmartWorker sw, LazyWorker lw, ExtraOrdWorker ew)
    {
        this.sw = sw;
        this.lw = lw;
        this.ew = ew;// new added
    }
    public void ManageWork(){
        sw.work();
        lw.work() ;
        ew.work();
    }
}
