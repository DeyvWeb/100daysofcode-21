class Ekclass{
    int a;
    
    public int getA(){
        return a;
    }
    
    
    Ekclass(int a){
        this.a = a;

    }

    public int returnone(){
        return 1;
    }
}

class DoClass extends Ekclass{
    DoClass(int c){
        super(c);
        System.out.println("Mai ek constructor hu");
    }
}

public class Harrykeywords {
    public static void main(String [] agrs){
        Ekclass e = new Ekclass(5);
        DoClass d = new DoClass(10);

        System.out.println(e.getA());
    }

}
