public class shadowing {
    
    int age = 20;

    static void display() {
        int age = 25;

        System.out.println(age);
        
    }
    public static void main(String[] args) {
        display();
    }
}    

