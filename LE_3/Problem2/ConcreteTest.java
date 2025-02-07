public class ConcreteTest extends AbsTest {

    public void display() {
        System.out.println("Display method in ConcreteTest class");
    }

    public static void main(String[] args) {
        ConcreteTest concreteObj = new ConcreteTest();

        concreteObj.display();
    }
}
