import java.util.HashMap;

/**
 * Learn how to use Dynamic Programming in this course for beginners. It can help you solve complex programming problems, such as those often seen in programming interview questions about data structures and algorithms.
 * <p>
 * This course was developed by Alvin Zablan from Coderbyte. Coderbyte is one of the top websites for technical interview prep and coding challenges.
 * <p>
 * 🔗 Check out the Coderbyte channel: https://www.youtube.com/channel/UCOJt...
 * 🔗 Improve your coding and interview skills: https://coderbyte.com/member?promo=ja... (NOT an affiliate link)
 * <p>
 * This course uses images and animations to help you visualize problems and important concepts. After understanding problems conceptually, you will learn how to solve them in JavaScript using Dynamic Programming. Even though JavaScript is used in this course, you will learn concepts and knowledge that you can apply to other programming languages.
 */

public class Main {

    public static void main(String[] args) {

        printFibMemoization();
    }

    public static void printFibMemoization() {

        FibMemoization fibMemoization = new FibMemoization();
        System.out.println(fibMemoization.fib(6L, new HashMap<>()));//8
        System.out.println(fibMemoization.fib(7L, new HashMap<>()));//13
        System.out.println(fibMemoization.fib(8L, new HashMap<>()));//21
        System.out.println(fibMemoization.fib(50L, new HashMap<>()));//12586269025

    }
}
