package Day2;

import java.io.File;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws Exception {
        File f = new File("/Users/macbook/Ilknur-1/Day2/Cinderella.txt");
        Scanner sc = new Scanner(f);

        int wc = 0;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            wc += line.split(" ").length;
        }
        System.out.println("The text contains " + wc + " words.");
        sc.close();
    }
}
