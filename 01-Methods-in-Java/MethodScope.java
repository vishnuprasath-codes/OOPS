public class MethodScope {
    //you can only access a variable inside the funtion, cant use outside the function
    public static void main(String[] args) {
        int a=10;
        int b=34;
        System.out.println(a+b);
        fun();
    }
    public static void fun(){
        int a=25;
        int b=45;
        System.out.println(a+b);
    }

}
