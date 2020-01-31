package HelloWorld;

public class Car extends Vehicle {


    // unique to Car class
    public String honkHorn(){
        return "Horn honked.";
    }

    // the same method from my Vehicle class
    // Overriding lets me make this method do whatever I want
    @Override
    public String doDrive() {
        return super.doDrive();
    }


}
