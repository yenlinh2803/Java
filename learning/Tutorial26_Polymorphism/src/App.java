public class App {
    public static void main(String[] args){
        Plant plant1 = new Plant();
        Tree tree = new Tree();

        Plant plant2 = tree;
        plant2.grow();

        tree.shedLeavers();
        Plant plant3 = new Plant();
        plant3.grow();

        doGrow(tree);

    }
    public static void doGrow(Plant plant){
        plant.grow();
    }
}
//http://www.udemy.com/course/java-tutorial/learn/lecture/149501#overview