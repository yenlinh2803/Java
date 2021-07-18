class Plant {
    private String name;
    public static final int id = 7;

    public String getData(){
        String data = "some stuff" + calculatedGrowthForecast();
        return data
    }

    private int calculatedGrowthForecast(){
        return 9;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name ;
    }

}

public class App {
    public static void main(String[] args){

    }
}
