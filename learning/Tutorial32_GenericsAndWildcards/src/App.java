import java.util.ArrayList;
class Machine {
//    @Override
    public String toString(){
        return "I am a machine";
    }
    public void start(){
        System.out.println("Machine starting");
    }
    public void snap(){
        System.out.println("Snap");
    }

}


class Camera extends Machine {
    @Override
    public String toString(){
        return "I am a Camera";
    }

}

public class App {
    public static void main(String[] args){
        ArrayList<Machine> list1 = new ArrayList<Machine>();
        list1.add(new Machine());
        list1.add(new Machine());
//        showList(list);

        ArrayList<Camera> list2 = new ArrayList<Camera>();
        list2.add(new Camera());
        list2.add(new Camera());
        showList(list2);
        System.out.println("_-----------");
        showList2(list1);


    }
    public static void showList(ArrayList<? extends Machine> list){
        for (Machine value:list){
            System.out.println(value);
            value.start();

        }
    }

    public static void showList2(ArrayList<? super Camera> list){
        for (Object value:list){
            System.out.println(value);
        }
    }
}
