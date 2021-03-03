package ExtraExercises;

public class QuizQuestion {

    // Let's Make An Exception For This Problem

    public static void main(String[] args) throws Exception {
        printEachLetter("JaVa is an IslAnd");

    }

    public static void printEachLetter(String text) {
        char[] textArray = text.toLowerCase().toCharArray();
        int length = textArray.length;

        for (int i = 0; i <= length; i++) {
            System.out.println(textArray[i]);

            try {
                int x = textArray.length;
                System.out.println(x);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("Sorry");

            }

        }
    }
}