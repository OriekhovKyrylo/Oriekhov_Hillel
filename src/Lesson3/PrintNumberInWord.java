package Lesson3;
/*Написать программу с названием “PrintNumberInWord”, которая напечатает “ONE”,
“TWO”, …, “NINE”, “OTHER” если переменная “number” типа int будет 1, 2, 3, 4, … 9, или
любой другой
. Решить задачу двумя способами: 1) с использованием if..else if 2) с использованием
switch-case*/
public class PrintNumberInWord {
    public static void main(String[] args) {
        int number = 2;
        if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
        } else if (number == 3) {
            System.out.println("THREE");
        } else if (number == 4) {
            System.out.println("FOUR");
        } else if (number == 5) {
            System.out.println("FIVE");
        } else if (number == 6) {
            System.out.println("SIX");
        } else if (number == 7) {
            System.out.println("SEVEN");
        } else if (number == 8) {
            System.out.println("EIGHT");
        } else if (number == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }
    }
}
 class PrintNumberSwitch {
     public static void main(String[] args) {
         int  number = 3;
         switch (number){
             case 1:
                 System.out.println(" ONE ");
                 break;
             case 2:
                 System.out.println(" TWO ");
                 break;
             case 3:
                 System.out.println(" THREE ");
                 break;
             case 4:
                 System.out.println( " FOUR ");
                 break;
             case 5:
                 System.out.println( " FIVE ");
                 break;
             case 6:
                 System.out.println( " SIX ");
                 break;
             case 7:
                 System.out.println( " SEVEN ");
                 break;
             case 8:
                 System.out.println( " EIGHT ");
                 break;
             case 9:
                 System.out.println( " NINE ");
                 break;
             default:
                 System.out.println( " OTHER ");
                 break;

         }
     }
        }