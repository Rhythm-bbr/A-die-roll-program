import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int total = 0;

        System.out.println("How many dies you wanna roll : ");
        int count = input.nextInt();

        System.out.println();

        for(int i = 1; i <= count; i++){
            int rolls = random.nextInt(1,7);
            aDie(rolls);
            System.out.println();
            System.out.println("A die is rolled " + i + ". times : " + rolls);
            System.out.println();
            total += rolls;
        }
        System.out.println("total is : " + total);
    }
    static void aDie(int rolls){
        String die1 = """
                -------
               |       |
               |   O   |
               |       |
                -------""";
        String die2 = """
                -------
               | 0     |
               |       |
               |     0 |
                -------""";
        String die3 = """
                -------
               | 0     |
               |   O   |
               |     0 |
                -------""";
        String die4 = """
                -------
               | 0   0 |
               |       |
               | 0   0 |
                -------""";
        String die5 = """
                -------
               | 0   0 |
               |   O   |
               | 0   0 |
                -------""";
        String die6 = """
                -------
               | 0   0 |
               | 0   0 |
               | 0   0 |
                -------""";
        String Default = """ 
                 -------
                | 0 0 0 |
                | 0 O 0 |
                | 0 0 0 |
                 -------""";

        switch (rolls){
            case 1 -> System.out.print(die1);
            case 2 -> System.out.print(die2);
            case 3 -> System.out.print(die3);
            case 4 -> System.out.print(die4);
            case 5 -> System.out.print(die5);
            case 6 -> System.out.print(die6);
            default -> System.out.println(Default);
        }
    }
}
