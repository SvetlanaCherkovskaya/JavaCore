package homeWork5;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File testFile = new File("homeWork5/test.csv");

        AppData appData1 = new AppData();

        appData1.readFromFile("src/main/java/homeWork5/test.csv");
        for (int[] row : appData1.getData()) {
            for(int i = 0; i < row.length; ++i) {
                row[i] = row[i]*2;
            }
        }
        appData1.writeInFile("src/main/java/homeWork5/test-copy.csv");
    }
}
