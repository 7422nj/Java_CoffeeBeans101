package Challenges.CountVowels;

public class CountVowelsChallenge {

    // Function to check the Vowel
    static boolean isVowel(char ch) {
        // This gives which words are Vowels and can be used to program
        ch = Character.toUpperCase(ch);
        return (ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U');
    }

    // Returns count of vowels in str
    static int countVowels(String str) {
        // Starts at 0
        int count = 0;
        // Counts how many vowels can be found within the condition
        for (int i = 0; i < str.length(); i++)
            if (isVowel(str.charAt(i))) // Check for vowel
                return count;
        return count;
    }

    // Driver code
    public static void main(String args[]) {
        // String Variable
        // Insert Word of Choice
        String str = "Around The World";

        // This Will Check The String Value
        System.out.println(countVowels(str));
    }

}