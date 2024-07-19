

import java.util.*;
import java.io.*;

class Contents {
    public static void main(String[] args) throws IOException {
        Scanner s1 = new Scanner(System.in);

        InputStreamReader r = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(r); // Corrected BufferedReader

        FileWriter f = new FileWriter("C:/Users/USER/Desktop/JAVA/SEM/input.txt");

        BufferedWriter bw = new BufferedWriter(f); // Corrected BufferedWriter

        System.out.println("Enter the no. of lines ");
        int n = s1.nextInt();
        s1.nextLine(); // Consume the newline

        System.out.println("Enter the file content (Enter end to exit)");

        String s;
        int i = 0;
        while (i < n) {
            s = br.readLine();
            if (s.equals("end")) {
                break;
            }
            bw.write(s);
            bw.newLine();
            i++;
        }

        bw.close();

        FileReader fr = new FileReader("C:/Users/USER/Desktop/JAVA/SEM/input.txt");

        BufferedReader bfr = new BufferedReader(fr); // Corrected BufferedReader

        String sr;

        System.out.println("The file content is: ");

        while ((sr = bfr.readLine()) != null) {
            System.out.println(sr);
        }

        bfr.close();
        s1.close(); // Close the Scanner object
    }
}
