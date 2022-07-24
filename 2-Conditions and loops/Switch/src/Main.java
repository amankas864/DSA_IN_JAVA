import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
//        switch (fruit){
//            case "banana":
//                System.out.println("🍌");
//                break;
//            case "Apple":
//                System.out.println("🥭-🍎");
//                break;
//            default:
//                System.out.println("Invalid fruit");
//        }

//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("Illegal day");
//                break;
//        }

        switch (fruit) {
            case "banana" -> System.out.println("🍌");
            case "Apple" -> System.out.println("🥭-🍎");
            default -> System.out.println("Invalid fruit");
        }
        int day = in.nextInt();
        switch (day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Illegal day");
        }

    }
}