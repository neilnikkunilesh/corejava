/* 
    For the final static variable compulsory we should perform initialization
    Before Class loading complition
    >> at the time of declaration 
    >> inside static block
*/
class FinalStaticVariableParent{
    static final int x;
    static{
        x=5;
    }
    public FinalStaticVariableParent(int x){
       

    }

}
public class FinalStaticVariable extends FinalStaticVariableParent{

}