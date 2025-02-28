class Singleton
{
    private static Singleton uniqueInstance = new Singleton();
   static int count = 0;
    private Singleton(){
        count++;
    }
    public static Singleton getInstance() {
        System.out.println("Count : " + count);
        return uniqueInstance;
    }
    
}
