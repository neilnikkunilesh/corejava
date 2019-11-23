import java.util.*;

public class PalinfromeProg{
    int res,sum=0;
    int oldVal;
   int PalFun(int val){
        oldVal = val;

        while(val > 0){
            res = val%10;
            sum = (sum*10)+res;
            val = val/10;
        }
        if(oldVal == sum){
            return 1;
        }

        return 0;


    }

    public static void main(String[] args) {
        
        Scanner s1 = new Scanner(System.in);
        String X = s1.nextInt();
        Scanner s2 = new Scanner(System.in);
        String Y = s2.nextInt();

        int count = 0;
        PalinfromeProg tp = new PalinfromeProg();
        count = count+tp.PalFun(X);     
        count = count+tp.PalFun(Y);
        System.out.println("count "+count);

    }
}