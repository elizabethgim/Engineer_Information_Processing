package engineer;

class Parent2{
    public void show(){
        System.out.println("Parent");
    }
}

class Child2 extends Parent2{
    public void show(){
        System.out.println("Child");
    }
}

public class Q05 {
    public static void main(String[] args){
        Parent2 pa = new Child2();
        pa.show();
    }
}