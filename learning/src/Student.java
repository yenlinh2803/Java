import java.util.ArrayList;

public class Student {
//    public static void main(String[] args) {
//        ArrayList<String> studentList = new ArrayList<String>();
//        studentList.add("John");
//        studentList.add("Lily");
//        studentList.add("Samantha");
//        studentList.add("Tony");
//        System.out.println("studentList: "+studentList);
//        studentList.remove(0);
//        System.out.println("studentList: "+studentList);
//        studentList.remove("Lily");
//        System.out.println("studentList: "+studentList);

//        Loop

//        int[] numbers = {1,2,3,4,5,6};
//        for (int num: numbers){
//            System.out.println(num);
//        }
//
//        String str = "Codecademy";
//        System.out.println(str.length());

//        //Concat
//        String s1 = "Hello";
//        String s2 = " World";
//        String s3 = s1.concat(s2);
//        System.out.println(s3);

//        String s1 = "Hello";
//        String s2 = "World";
//        System.out.println(s1.equals("Hello"));
//        System.out.println(s2.equals("Hello"));
//        System.out.println(s2.equalsIgnoreCase("wold"));

//        String str = "Hello World";
//        System.out.println(str.indexOf("l"));
//        System.out.println(str.indexOf("o"));
//        System.out.println(str.indexOf("a"));

//        String str = "This is a string";
//        System.out.println(str);
//        System.out.println(str.charAt(0));
//        System.out.println(str.charAt(15));

//        String str = "Hello World";
//        String upercase = str.toUpperCase();
//        String lowercase = str.toLowerCase();
//        System.out.println("uppercase: "+upercase);
//        System.out.println("lowercase: "+lowercase);

//    }

    // Protected and Final keywords in Java
    protected double gpa;
    // any child class of Student can access gpa
    final protected boolean isStudent(){
        return true;
    }
    // any child class of Student cannot modify isStudent()
}


