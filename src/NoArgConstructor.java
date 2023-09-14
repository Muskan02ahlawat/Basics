public class NoArgConstructor {
    int i;
    //define constructor
    private NoArgConstructor() {
        i = 5;
        System.out.println("Constructor is called");
    }
    public static void main(String[] args) {
        //calling the constructor
        NoArgConstructor obj = new NoArgConstructor();
        System.out.println("Value of i: "+ obj.i);
    }
}
