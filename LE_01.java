
public class Main
{
	public static void main(String[] args) {
	    juet obj = new juet();
	    obj.setName(args[0]);
	    obj.setAge(Integer.parseInt(args[1]));
	    obj.getName();
	    obj.getAge();
	}
}

class juet {
    String name;
    int age;
    
    void setName(String n){
        this.name = n;
    }
    
    void setAge(int a){
        this.age = a;
    }
    
    void getName(){
        System.out.println("name : "+name);
    }
    
    void getAge(){
        System.out.println("age : "+age);
    }

}