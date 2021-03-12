package ReaderUtilities.ReadTextFile;

import java.io.BufferedReader; // Reads textFile line by line
// Java BufferedReader class is used to read the text from a character-based input stream.
// It can be used to read data line by line by readLine() method. It makes the performance fast.
// It inherits Reader class.

import java.io.FileReader; // Reads the textFile one letter at a time, or else returns -1 if there is no text in file
// Java FileReader class is used to read data from the file.
// It returns data in byte format like FileInputStream class.
// It is character-oriented class which is used for file handling in java.

public class BufferedReader101 {

    public static void main(String args[])throws Exception{ // Main Method Throws Exception

        // Created an Object of FileReader Class
        // In The Constructor We Want Enter Our TextFile Path From Content Root
        FileReader fr=new FileReader("src/ReaderUtilities/testBufferedReader.txt");

        // Created an Object of BufferedReader Class
        // In The Constructor We Entered fr Which is The Reference of FileReader class object
        // BufferedReader will read the textFile line by line <-- allows performance to become faster
        BufferedReader br=new BufferedReader(fr);

        // Created a Empty int Variable i [int i;] <-- No Value/Empty
        int i;

        // If i is able to identify the textFile using FileReader, than Read textFile
        while((i=br.read())!=-1){
            // Overrides: (read) in Reader Class
            // Returns: The character read, or -1 if no text were found in textFile

            // Print the Characters in the textFile after Reading
            System.out.print((char)i);
        }
        // It is used to close the BufferedReader class.
        br.close();

        // It is used to close the FileReader class.
        fr.close();
    }
}
