package javaRevision;

import java.io.*;

public class JavaDay2 {

    public static void main(String[] args) throws IOException {

        String fName = "Pritam";
        String lName = "Das";
        String fullName = fName + " " + lName;

        //Cleans the text file
        FileWriter fileOut = new FileWriter("DataTest/file.txt");
        fileOut = new FileWriter("DataTest/file.txt", true); //this reopens file for appending
        BufferedWriter bw = new BufferedWriter(fileOut);
        PrintWriter pw = new PrintWriter(bw);
        pw.println(fullName);
        //some code ...
        System.out.println(pw.checkError()); //checks if error occured
        pw.println("names added"); //appends more text
        pw.flush();
        pw.close();
    }



}
