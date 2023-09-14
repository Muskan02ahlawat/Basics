public class Sum {
    public static void main(String[] args) {
        int num = 100, Sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            Sum += i;
        }

        System.out.println("Sum = " + Sum);
    }
}
