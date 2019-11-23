/*  Co-Varient return type concept applicable only for object type but not for premitive type
    Object -> String, Number -> Number\Integer, String -> Object(not allowed), double -> int(not allowed)
*/
class P{
    public Object m1(){
        return null;
    }
}
class C extends P{
    public String m1(){
        return null;
    }
}
public class OverridingRule1{
    
}