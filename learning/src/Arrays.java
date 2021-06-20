import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
//        int[] marks = {10,20,30,40,50};
//        System.out.println("marks = "+marks[]);

//        int[] age = {20,21,30};
//        int[] marks = new int[3];
//        marks[0] = 50;
//        marks[1] = 70;
//        marks[2] = 93;
//        System.out.println("marks = "+marks[2]);

//        int[] marks = {50,55,60,70,80};
//        System.out.println(marks[0]);
//        System.out.println(marks[4]);

//        // Changing element value
//        int[] nums = {1, 2, 0, 4};
//        System.out.println(nums[2]);
//        nums[2] = 3;
//        System.out.println(nums[2]);


        String runner = "dataflow.runner";
        String project = "dataflow.project";
        String gcpTempLocation = "dataflow.gcpTempLocation";
        String region = "dataflow.region";
        String network = "dataflow.network";
        String subnetwork = "dataflow.subnetwork";
        String streaming = "dataflow.streaming";

        List<String> argStringList = new ArrayList<>();
        if (runner != null) {
            argStringList.add(runner);
        }
        System.out.println(argStringList);
    }
}