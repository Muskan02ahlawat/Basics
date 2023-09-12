public class ConstructorOverloading {
    String language;
    //no parameter constructor
    ConstructorOverloading() {
        this.language = "Java";
    }
    //single parameter
    ConstructorOverloading(String language) {
    this.language = language;
}
public void getName() {
    System.out.println("Programming Langauage: " + this.language);
}
    public static void main(String[] args) {

        // call constructor with no parameter
        ConstructorOverloading obj1 = new ConstructorOverloading();

        // call constructor with a single parameter
        ConstructorOverloading obj2 = new ConstructorOverloading("Python");

        obj1.getName();
        obj2.getName();
    }
}
