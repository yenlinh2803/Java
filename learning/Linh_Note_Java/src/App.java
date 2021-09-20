import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    // abstract và interface ko có body
    // abstract thì viết abstract cả class và method (xem ví dụ Tutorial 38)
    // interface thì viết interface class, method ko có chữ interface nhưng ko có body

    // các class khác muốn thừa kế interface vẫn được:
    // interface Animal
    // class Pig implements Animal

    // Read file xem Tutorial 39:
    // Read file: FileReader
    // Read each line: BufferedReader

    // Interface AutoCloseable có method là close.
    // void close()
    //    throws Exception
    // --> Khi su dung fai @Override


    // Serialization and Deserialization
    // https://www.geeksforgeeks.org/serialization-in-java/
    //For serializing the object, we call the writeObject() method ObjectOutputStream, and for deserialization we call the readObject() method of ObjectInputStream class.
    //We must have to implement the Serializable interface for serializing the object.

    // Length vs length()
    // length can be used for int[], double[], String[]
    // to know the length of the arrays.
    // length() can be used for String, StringBuilder, etc
    // String class related Objects to know the length of the String


    // ArrayList, LinkedList, HashMap, LinkedHashMap, TreeMap
    // Set
        // Hashset does not retain order
        // Set<String> set1 = new HashSet<String>();
        // LinkedHashSet remembers the order you added items in
        // Set<String> set1 = new LinkedHashSet<String>();
        // TreeSet sorts in natural order
        // Set<String> set1 = new TreeSet<String>();

//    // Intersection
//    Set<String> intersection = new HashSet<String>(set1);
//        System.out.println(set1);
//        intersection.retainAll(set2);
//        System.out.println(intersection);
//
//    // Difference
//    Set<String> difference = new HashSet<String>(set1);
//        difference.removeAll(set2);
//        System.out.println(difference);


    // Super
//    class Vehicle {
//        int maxSpeed = 120;
//    }
//
//    /* sub class Car extending vehicle */
//    class Car extends Vehicle {
//        int maxSpeed = 180;
//
//        void display()
//        {
//            /* print maxSpeed of base class (vehicle) */
//            System.out.println("Maximum Speed: "
//                    + super.maxSpeed);
//        }
//    }
//
//    /* Driver program to test */
//    class Test {
//        public static void main(String[] args)
//        {
//            Car small = new Car();
//            small.display();
//        }
//    }

    // Super()
//// Java code to demonstrate super()
//    /* superclass Person */
//    class Person {
//        Person()
//        {
//            System.out.println("Person class Constructor");
//        }
//    }
//    /* subclass Student extending the Person class */
//    class Student extends Person {
//        Student()
//        {
//            // invoke or call parent class constructor
//            super();
//
//            System.out.println("Student class Constructor");
//        }
//    }
//    /* Driver program to test*/
//    class Test {
//        public static void main(String[] args)
//        {
//            Student s = new Student();
//        }
//    }


}
