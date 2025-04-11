class Test{
    public static void main(String args[]){
        Offering offering = new Coffee();
        offering = new Rum(offering);
        offering = new Rum(offering);
        System.out.println(offering.getName()+" "+offering.getPrice());
        Offering offering1 = new Icecream();
        offering1 = new Soda(offering1);
        offering1 = new Rum(offering1);
        System.out.println(offering1.getName()+" "+offering1.getPrice());
    }
}