class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }

    public void name(){
        System.out.println("My name is Java in Class Phone");
    }

}

class SmartPhone extends Phone{
    public void swagat() {
        
        System.out.println("Aapka swagat h!");
    }
    
    public void name(){
        System.out.println("My name is Java SmartPhone");
    }
}


public class Harrydynamicmethod {
    public static void main(String[] args){
    //     Phone obj = new Phone();
    //     SmartPhone smobj = new SmartPhone();
    // obj.name();    

    Phone obj = new SmartPhone(); // Allowed cause if you create superclass reference and object to subclass it's possible!
    obj.greet();

    // Runtime Polymorphism
    obj.name(); // Object(new SmartPhone) ka run hoga! Reference(obj) ka nhi

    // SmartPhone obj2 = new Phone();     // Not allowed! 

    }    
}
