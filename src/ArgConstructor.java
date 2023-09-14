public class ArgConstructor {
    String languages;
    //Constructor accepting single values
    ArgConstructor(String lang) {
        languages = lang;
        System.out.println(languages  +  "Programming language");
    }
    public static void main(String[] args){
        //calling constructor
        ArgConstructor obj1 = new ArgConstructor( "JAVA");
        ArgConstructor obj2 = new ArgConstructor( "PYTHON");
        ArgConstructor obj3 = new ArgConstructor( "CPP");
    }
}
