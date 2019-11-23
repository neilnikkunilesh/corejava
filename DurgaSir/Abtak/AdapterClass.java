interface X{

    void m1();
    void m2();
    void m3();
    void m4();
    void m5();
}
abstract class AdapterX implements X{
    public void m1(){}
    public void m2(){}
    public void m3(){}
    public void m4(){}
    public void m5(){}
}
class AdapterClass extends AdapterX{

}