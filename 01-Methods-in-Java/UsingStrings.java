public class UsingStrings {
    public static void main(String[] args) {
        String name="Vishnu";
        String greeting=greet(name);// Calling the greet() method and passing 'name' as an argument
        System.out.println(greeting);
    }
    public static String greet(String naam){// String naam -> Parameter that receives the passed name
        String message="hello"+" "+naam;
        return message;
    }
}


