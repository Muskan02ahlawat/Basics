public class Method {
    //create method
    public int addNumbers(int a, int b) {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 12;
        //create object
        Method obj =new Method();
        //calling method
        int result = obj.addNumbers(num1 , num2);
        System.out.println("Sum is: " + result);

    }
}
