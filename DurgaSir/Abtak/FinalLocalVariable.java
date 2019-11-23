/* 
    If we are not using local variable then it's not required to perform initialization for local variable

    >>>>  the only applicable modifier for local variable is final
    Local variable can be final before using only we have initialize that, if we are not using,
    it's not required to perform initialization even though it is final
*/

class FinalLocalVariable{
    public static void main(String[] args) {
       final int x;
       int y=20;
       /* public int z;
       private int z;
       protected int z; */
        System.out.println("hello");
    }
}

