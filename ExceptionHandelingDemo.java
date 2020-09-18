class RuntimeCustomError extends Throwable{
    public RuntimeCustomError(String msg){
        super(msg);
        //System.out.println(msg);
    }
}

class Test{
    public void show()throws RuntimeCustomError,RuntimeException{
        try {
            throw new RuntimeCustomError("User Define Error");
        } catch (RuntimeCustomError e) {
            throw new RuntimeCustomError("User Define Error");
        }finally{
            System.out.println("always run this one");
        }
    }

    public static void main(String[] args)throws RuntimeCustomError,RuntimeException {
        Test t = new Test();
        t.show();
    }
}
