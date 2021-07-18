public class Field {
    private Plant plant = new Plant();
    public Field(){
        //size is protected; Field is in thesame package as Plant
        System.out.println(plant.size);

    }
}
