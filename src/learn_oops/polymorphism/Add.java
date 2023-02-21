package learn_oops.polymorphism;

public class Add extends Arithmetic{

    public void doArithmetic(int x , int y){
        System.out.println(x + y);
    }
    public void add(int x , int y){
        System.out.println(x + y);
    }
    public void add(int x , int y ,int z){
        System.out.println(x + y + z);
    }
    public void add(float x , float y){
        System.out.println(x + y);
    }
//    public int add(int x , int y){ //we can't overload by changing return type
//        return x + y;
//    }
//    public int add(int x, int y){
//        return x + y;
//    }
//    public Float add(Float x , Float y){
//        return x + y;
//    }
    public void add(){
        int a = 10;
        int b = 90;
        System.out.println(a + b);
    }

}
