class Stack{

    static final int MAXSIZE = 100;
    int[] a = new int[MAXSIZE];
    int top;

    Stack(){
        top = -1;
    }

    boolean isEmpty(){
        return (top < 0);
    }

    boolean push(int x){
        if(top >= MAXSIZE){
            System.out.println("Stack is Overflow");
            return false;
        }else{
            a[++top] = x;
            System.out.println(x+" pushed into stack");
            return true;
        }
    }

    int pop(){
        if(top < 0){
            System.out.println("Stack is Underflow");
            return 0;
        }else{
            int x = a[top--];
            System.out.println(x+" popped from stack");
            return x;
        }
    }

    int peek(){
        if(top < 0){
            System.out.println("Stack is Underflow");
            return 0;
        }else{
            int x = a[top];
            return x;
        }
    }
}
