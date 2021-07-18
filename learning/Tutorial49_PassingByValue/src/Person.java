public class Person {
    private String name;

    public Person(String name){
        this.name = name ;
    }
    public String getName(String name){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "Person [name= "+name+"]";
    }


}
