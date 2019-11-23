final class P{
// every method inside final class is always final bydefault
// but every every variable presenet inside final class need not to be final
    public void property(){
        System.out.println("Land_Gold_Cash");
    }

    public void marry(){
        System.out.println("Shubhlaxmi");
    }
}

public class FinalDemo extends P{
    public void marry(){
        System.out.println("Vaishali");
    }

    public static void main(String[] args) {
        FinalDemo fd = new FinalDemo();
        fd.marry();

    }
}