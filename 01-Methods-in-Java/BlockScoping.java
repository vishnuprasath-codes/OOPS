public class BlockScoping {
    public static void main(String[] args) {
        int a = 10;

        {
            int b = 27;
            System.out.println(a);//10
            System.out.println(b);//27
            a=34;
            System.out.println(a);//34
        }
        System.out.println(a);//34

        // System.out.println(b); // Error
    }
}