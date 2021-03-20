package MentoringReadWriteExcel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProperlyReadTextFile {

    static String systemPath = System.getProperty("user.dir");
    static String relativePath = "/src/MentoringReadWriteExcel/bufferedReader.txt";

    static String path= systemPath+relativePath;

    static FileReader fileReader;
    static BufferedReader bufferedReader;

    public static void main(String[] args) throws Exception {
   ProperlyReadTextFile.readFile();

    }
    static void readFile() {

        String data;

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            System.out.println("\n *** Path Found Successfully ***");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("\n *** Path Not Found ***");
        }
        try {
            while ((data = bufferedReader.readLine()) != null)
            {
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("\n *** Text Not Able To Be Read ***");

        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
                System.out.println("\n *** Closing Successful ***");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("\n *** Closing Unsuccessful ***");
            }
        }
    }
}
