import java.util.*;


class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime*result + ((name ==null)?0 : name.hashCode());
        return result;
    }

    @Override
    public int compareTo(Person person){
//        return name.compareTo(person.name);
        int len1 = name.length();
        int len2 = person.name.length();

        if (len1>len2){
            return 1;
        }
        else if (len1<len2){
            return -1;
        } else {
//            return 0;
            return name.compareTo(person.name);
        }
    }
}

public class App {
    public static void main(String[] args){
        List<Person> list = new ArrayList<Person>();
        Set<Person> set = new TreeSet<Person>();

        addElements(list);
        addElements(set);

        //Collection.sort(list);

        showElements(list);
        System.out.println();
        showElements(set);

    }

    private static void addElements(Collection<Person>col){
        col.add(new Person("Joe"));
        col.add(new Person("Sue"));
        col.add(new Person("Juliet"));
        col.add(new Person("Clare"));
        col.add(new Person("Mike"));

    }

    private static void showElements(Collection<Person> col){
        for(Person element: col ){
            System.out.println(element);
        }
    }
}
