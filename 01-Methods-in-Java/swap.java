public class swap {
    public static void main(String[] args) {
        int a=10; 
        int b=20;
        swapnum(a,b);
        System.out.print(a+" "+b);        
    }
    public static void swapnum(int d, int c){
        int temp=d;
        d=c;
        c=temp;
    
    }    
}
//can't change the value of a integer(primitive data type) from another method, can modify a array outside a method