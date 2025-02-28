class Singleton
{
    private static Singleton uniqueInstance;
   static int count = 0;
    private Singleton(){
        count++;
    }
    public static Singleton getInstance() {
        if(uniqueInstance == null) 
        {
            uniqueInstance = new Singleton();
            System.out.println("New Object Created");
        }
         System.out.println("Count : " + count);
        return uniqueInstance;
    }
    
}
