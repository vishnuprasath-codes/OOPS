public class VarArgs {
    public static void main(String[] args) {
        sum(10, 20);
        sum(10, 20, 30);
        sum(10, 20, 30, 40);
    }

    static void sum(int... numbers) {
        int total = 0;

        for (int num : numbers) {
            total += num;
        }

        System.out.println(total);
    }
}