class P{
    P(){
        System.out.println("inside P "+this.hashCode());
    }
}

class C extends P{
    C(){
        System.out.println("inside C "+this.hashCode());
    }
}

class CreateObject{
    public static void main(String args[]){
        C c= new C();
        System.out.println(c.hashCode());
    }
}