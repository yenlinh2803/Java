public class Bear {
    String species;
    public Bear(String speciesOfBear){
        species = speciesOfBear;
    }

    public static void main(String[] args){
        Bear baloo = new Bear("Sloth bear");
        System.out.println("Bear: "+baloo.species);
        baloo = null;
        System.out.println(baloo);

    }
}
