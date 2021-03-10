package Java101;


public class Day5 {

    // String is a data type
    // String is a class
    // String is a sequence of character

    String name = "James";

    public static void main(String[] args) {

        String food = "couscous";

        // Prints Length of String Value
        System.out.println(food.length());

        // Returns true if it matches Previous String Value
        System.out.println(food.equals("Couscous"));

        // Returns true is argument is not null, otherwise false
        System.out.println(food.equalsIgnoreCase("cOusCous"));

        // Prints the Char Value At The Specified Index #
        System.out.println(food.charAt(5));

        // Prints last 5 characters of the String Value
        char charCompare = food.charAt(5);

        String name = "James";

        // Prints the letters from the String according to index number given <-- removes letters first->last
        // Than Prints the remaining of the word after removal of letters according to index
        System.out.println(food.substring(3));

        // Returns a string that is a substring of this string.
        // The substring begins at the specified beginIndex
        // And extends to the character at index endIndex - 1.
        // Thus the length of the substring is endIndex-beginIndex.
        // Examples:
        //       "hamburger".substring(4, 8) returns "urge" <-- index 4 end-begin; index 8 begin-end;
        //       "smiles".substring(1, 5) returns "mile"
        System.out.println(food.substring(4, 7));


        System.out.println(food.toLowerCase());
        System.out.println(food.toUpperCase());


        String stId = "101";
        String lName = "William";
        System.out.println(stId.concat(lName));

        // Exception Handling

        try {
            System.out.println(food.charAt(10));
        } catch (Exception e) {
            System.out.println("String Index Out Of Bounds Exception");
        }

        // Reverse String
        // Remove
        // Trim
        System.out.println(food.contains("p"));

    }
}
