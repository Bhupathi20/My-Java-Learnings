package GenericsInJava;

public class MyGenericClass <Thing extends Number, Thing2 extends Number>{
    
    Thing x;
    Thing2 y;


    MyGenericClass(Thing x, Thing2 y){
        this.x = x;
        this.y = y;
    }

    public Thing2 getVaule(){
        return y;
    }
}
