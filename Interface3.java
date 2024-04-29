class Laptop{
    public void compile(){
        System.out.println("You got 5 errors");
    }
}
class Developer {
    Laptop object=new Laptop();
    public void BuildApp(){
        System.out.println("your app is creating");

        object.compile();
    }
}

public class Interface3 {
    public static void main(String[] args) {
        System.out.println("hemlo");
        Developer dev = new Developer();
        dev.BuildApp();
    }
}
