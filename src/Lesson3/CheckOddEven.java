package Lesson3;
/*Написать программу с названием “CheckOddEven”, которая печатает “Odd Number”
если переменная “number” типа int нечетная. Или “Even Number” если переменная
четная. Программа всегда должна перед выходом печатать “BYE”
*/
public class CheckOddEven {
    public static void main(String[] args) {

        int number = 5;
        if ( number % 2 == 0 ) {
            System.out.println("Even Number ");
        }
        else {
            System.out.println( "Odd Number ");

        }
        System.out.println( "Buy" );
    }

}
