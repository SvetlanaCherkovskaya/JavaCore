package homeWork5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData() {
        //this.header = new String[0];
        //this.data = new int[0][0];
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "header=" + Arrays.toString(header) +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    public void readFromFile(String file) {

        //String [] array;
        //String [] array = new String [0];


        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String lineArray;
            int count = 0;
            int numberOfLines = 0;

            ArrayList<String> arrayList = new ArrayList<>();

            while ((lineArray = reader.readLine()) != null) {
                arrayList.add(lineArray);
                numberOfLines++;
            }


            for (String line : arrayList) {

                count++;
                if (count == 1) {
                    header = line.split(";");
                    for (int j = 0; j < header.length; j++) {
                        System.out.print(header[j] + ";");
                    }
                    data = new int[numberOfLines - 1][header.length];
                    System.out.println();
                } else {

                    String[] array = line.split(";");

                    for (int i = 0; i < array.length; i++) {
                        data[count - 2][i] = Integer.parseInt(array[i]);
                        System.out.print(data[(count - 2)][i] + ";");
                    }
                    System.out.println();
                }

            }

            System.out.println();
            System.out.println("Вывожу массив data");

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < header.length; j++) {
                    System.out.print(data[i][j] + ";");
                }
                System.out.println();
            }

        } catch (IOException е) {
            System.out.println("Oшибкa ввода-вывода:   " + е);
        }
    }

    public void writeInFile(String file) {
        //boolean isHeader = true;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            String newHeader = "";
            for (String s : header) {
                newHeader += s + ";";
            }
            System.out.print(newHeader);
            writer.write(newHeader);
            writer.newLine();
            System.out.println();

            for (int[] datum : data) {
                String newData = "";
                for (int j = 0; j < header.length; j++) {
                    newData += datum[j] + ";";
                }
                writer.write(newData);
                writer.newLine();

                System.out.print(newData);
                System.out.println();
            }
        } catch (IOException е) {
            System.out.println("Oшибкa ввода-вывода:   " + е);
        }
    }
}
