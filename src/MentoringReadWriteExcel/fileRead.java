package MentoringReadWriteExcel;

import java.io.FileReader;

public class fileRead {

    public static void main(String[] args) throws Exception{

         String path= "src/MentoringReadWriteExcel/genText.txt";
        FileReader fr=new FileReader(path);

        int i;

        while((i=fr.read())!=-1)

            System.out.print((char)i);

            fr.close();
        }



    }

