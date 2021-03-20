package MentoringReadWriteExcel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReader {

    public static void main(String[] args) throws Exception {

        try(FileReader fr=new FileReader("src/MentoringReadWriteExcel/genText.txt")){
            BufferedReader br=new BufferedReader(fr);

            int i;

            while((i=br.read())!=-1)
                System.out.print((char)i);
            System.out.println("\n *** Text File Is Found ***");
            br.close();

        } catch (IOException e){
            e.printStackTrace();
            System.out.println("\n *** Text File Not Found ***");
        }

    }
}
