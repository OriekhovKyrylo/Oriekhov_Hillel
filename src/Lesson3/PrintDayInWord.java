package Lesson3;

public class PrintDayInWord {
    public static void main(String[] args) {
        int number = 4;
        if (number == 1) {
            System.out.println("MONDAY");
        } else if (number == 2) {
            System.out.println("TUESDAY");
        } else if (number == 3) {
            System.out.println("WEDNESDAY");
        } else if (number == 4) {
            System.out.println("THURSDAY");
        } else if (number == 5) {
            System.out.println("FRIDAY");
        } else if (number == 6) {
            System.out.println("SATURDAY");
        } else if (number == 7) {
            System.out.println("SUNDAY");
        } else {
            System.out.println("Not a valid day");
        }
    }
}

class DayInWorldSwitch {
    public static void main(String[] args) {
        int number = 7;
        switch (number) {
            case 1:
                System.out.println(" MONDAY ");
                break;
            case 2:
                System.out.println(" TUESDAY ");
                break;
            case 3:
                System.out.println(" WEDNESDAY ");
                break;
            case 4:
                System.out.println(" THURSDAY ");
                break;
            case 5:
                System.out.println(" FRIDAY ");
                break;
            case 6:
                System.out.println(" SATURDAY ");
                break;
            case 7:
                System.out.println(" SUNDAY ");
                break;
            case 8:
                System.out.println(" Not a valid day");
                break;
        }
    }
}