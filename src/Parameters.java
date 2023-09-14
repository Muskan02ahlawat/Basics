public class Parameters {
    //create method
    public void display1() {
        System.out.println("Method with no parameter");
    }
    public void display2(int a) {
        System.out.println("One parameter method");
    }
    public static void main(String[] args) {
        //create object for Parameters
        Parameters obj = new Parameters();

        //calling no parameter method
        obj.display1();

        //calling one parameter method
        obj.display2(0x43);

    }
}
