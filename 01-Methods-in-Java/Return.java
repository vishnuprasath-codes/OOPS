public class Return {
    public static void main(String[] args){
        int ans=sum(); //function call and assign the value to ans
        System.out.print(ans); //Print ans
    }
    public static int sum(){
        int a=10;
        int b=20;
        return a+b; //Returning the sum
    }
}
