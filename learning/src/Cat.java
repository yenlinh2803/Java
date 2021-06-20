public class Cat {
//    public Cat(){
//
//    }
//    public static void main(String[] args){
//        Cat garfield = new Cat();
//        System.out.println(garfield);
//    }

    String furType ;
    boolean containsClaws;

    public Cat(String furLegth, boolean hasClaws){
        furType = furLegth;
        containsClaws = hasClaws;
    }

    public static void main(String[] args){
        Cat garfield = new Cat("Long-hair", true);
        System.out.println("Cat furType: "+garfield.furType);
        System.out.println("Cat containsClaws: "+garfield.containsClaws);
    }

}
