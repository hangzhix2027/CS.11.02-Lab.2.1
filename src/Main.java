/**
 *****************************************************************************************************
 * By writing your name in the space provided below, you are honouring the CIS academic honesty pledge
 * “I have neither given nor received unauthorized aid on this piece of work.”
 * NAME: Charlotte Xiong
 *****************************************************************************************************
 */

public class Main {

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(3, 5, 8, 9));
        System.out.println(morningGreeting("TobyFox"));
        System.out.println(morningGreeting("Mr. Ewing"));
    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String name) {
        return name + name + name;
    }

    // 6. half
    public static double half (int number) {
        double myDouble = number;
        //myDouble = number + 0.5;
        int myInt = (int) myDouble;
        double newDouble = myDouble/ 2;
        return newDouble;
    }

    // 7. roundPositiveValueToNearestInteger
    //roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double number) {
        double myDouble = number;
        myDouble = number + 0.5;
        int myInt = (int) myDouble;
        return myInt;
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double number) {
        double myDouble = number;
        myDouble = number - 0.5;
        int myInt = (int) myDouble;
        return myInt;
    }
}
