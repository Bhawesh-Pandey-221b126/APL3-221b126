
public class main {
    public static void main(String[] args) {
        Mother m1 = new Child(); 
        m1.show(); 

        // next line will cause an error since we are calling static methods incorrectly.
        // Child ch = new Mother(); // Not allowed, as Mother is not a subclass of Child
    }
}
