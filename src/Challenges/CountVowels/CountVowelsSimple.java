package Challenges.CountVowels;

public class CountVowelsSimple {

    public static String countVowels(String word){

        // How This Program Works
        // 1. It Views Our String Value
        // 2. It Starts Count At 0
        // 3. It Checks If Initialized Value and Condition Are Met
        // 4. To Check If Initialized Value and Condition Is Met
        // It Looks At What Letters The Program Should Catch And If That Letter Is In Our String Value
        // 5. If A Letter Is Recognized, Than It Return To Count And Does +1
        // 6. It Does This Until Every Letter Of Our String Value Is Checked And Confirmed
        // 7. Than It Prints Numbers Of Vowels In Our String Value

        //================================================================================================//

        // Starts counting from 0 using our String Value
        int count = 0; // Starting Value is 0

        // Looks at How Many Times the Condition is Met
        // How Many Times Can Our String Value Meet The Condition & Initialized Value
        // altogether
        // 0123


        for (int i = 0; i < word.length(); i++){
            //i++=1,2,3,4 incrementing
            //i--=4,3,2,1 decrementing

            // These are the Words We Want The Program To Catch if Related to Our String Value
            // These Words will let Our Program Know What Words are Vowels
            // If A Word is Related to our String Value, Than it confirms +1 and sends it into the  int Count=0;
            if (word.toLowerCase().charAt(i) == 'a' || word.toLowerCase().charAt(i) == 'e' ||
                    word.toLowerCase().charAt(i) == 'o' || word.toLowerCase().charAt(i) == 'u'
                    || word.toLowerCase().charAt(i) == 'i')
            {
                // Increment Is Used So We Don't Get A Infinite Loop/Infinite Print
                count++;
            }
        }
        // Prints The Number Of Vowels In Our String Value
        System.out.println("Total number of vowels in string are: " + count);

        // Returns The String Value We Used
        return "Our Word is Altogether ";
    }

    public static void main(String[] args) {

        // The String Value
        System.out.println(countVowels("altogether"));
    }
    }




