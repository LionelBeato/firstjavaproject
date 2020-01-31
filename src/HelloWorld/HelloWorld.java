package HelloWorld;


public class HelloWorld {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        Plane myPlane = new Plane();

        // Class that has method that is overridden
        // this is a good example of inheritance
        Car volvo = new Car();

        Object garfield = new Cat();

        String myString = new String();
        Dog Rover = new Dog();

        //making a new Eagle object
        Eagle newEagle = new Eagle();
        //setting newEagle's plumage value to false
        newEagle.setPlumage(false);

        // printing out that value
        System.out.println(newEagle.isPlumage());



        int num = 5; //data

        myClass.addNum(num, 4); // function

        String otherNum = "Five";
        String str = "600";


        //System.out.println(garfield.doPurr());
        System.out.println(myPlane.doDrive());

    }
}
