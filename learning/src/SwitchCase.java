public class SwitchCase {
    public static void main(String[] args){
        int day = 4;
        String name = "Linh";
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        switch (name){
            case "Linh":
                System.out.println("Name is "+name);
                break;
            case "Ngoc":
                System.out.println("Mom name is "+name);
                break;
        }
    }
}
