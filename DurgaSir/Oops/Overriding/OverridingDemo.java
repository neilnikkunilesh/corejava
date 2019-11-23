class P{
    public void properrty(){
        System.out.println("Cash+land+Property");
    }
    public void marry(){
        System.out.println("SubhaLaxmi Decided be Parents");
    }
}
class C extends P{
    public void marry(){
        System.out.println("Select by child Tara ");
    }
}

class OverridingDemo{
    public static void main(String[] args) {
        P p =new P();
        p.marry();

        C c = new C();
        c.marry();
        /*   In method overriding method resolution always take care by JVM. Based on run time object 
        hance overriding is also considered as Runtime Polymarphism or dynamic Polymorphism or late Binding   */
        P p1 = new C();
        p1.marry();
    }
}