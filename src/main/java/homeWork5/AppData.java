package homeWork5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

    public void setHeader(String[] header) {
        this.header = header;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "header=" + Arrays.toString(header) +
                ", data=" + Arrays.toString(data) +
                '}';
    }

     void readFromFile(String file) {

        //String [] array;
        //String [] array = new String [0];



        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            //String line;
            String lineArray;
            int count = 0;
            int numberOfLines = 0;

            ArrayList<String> arrayList = new ArrayList<>();

            while ((lineArray = reader.readLine()) != null) {
                arrayList.add(lineArray);
                numberOfLines++;
            }
            //System.out.println(numberOfLines);


                for (String line : arrayList) {

                    //System.out.println(line);
                count++;

                //System.out.println(count);

                if(count == 1) {

                     setHeader(line.split(";"));// = line.split(";");
                    //System.out.println(setHeader()[0]);
                    for (int j = 0; j < getHeader().length; j++) {
                        System.out.print(getHeader()[j] + " ");
                    }
                    System.out.println();
                } else {

                    String[] array = line.split(";");
                    //int
                    int newArray[] = new int[array.length];
                    int countData = 0;
                    //setData(new int [numberOfLines][array.length]);
                    data = new int [numberOfLines-1][array.length];
                    //data = new int [2][3];

                    System.out.println("array.length = " + array.length);
                    System.out.println("numberOfLines = " + numberOfLines);
                     for (int i = 0; i < array.length; i++) {
                         newArray[i] = Integer.parseInt(array[i]);
                         countData ++;
                         //setData(newArray[i])[count-2][i];
                         System.out.println();
                         System.out.println("count = " + count);

                         data[count-2][i] = newArray[i];
                         System.out.println("newArray[i]= " + newArray[i]);

                         //setData()[count-2][i] = newArray[i];
                         //dataNew[count-2][i] = newArray[i];

                         System.out.print("i=" + (count-2) + " j=" + (i) + "; " + data[count-2][i] + " ");
                     }
                    System.out.println();
                   //setData(int[][] dataNew);
                }

            }

/*
            int[][] data = new int [count][countData];
            for (int i = 0; i < count; i++){
                for (int j = 0; i < countData; i++){
                    data[i][j] =
                }
            }
*/
            //System.out.println(data[0][0);
            System.out.println(header[0]);
           System.out.println(data[1][0]);

           System.out.println();
            System.out.println("Вывожу массив data");

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data.length; j++) {
                    System.out.print(data[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println(data.length);


        } catch (IOException е) {
            System.out.println("Oшибкa ввода-вывода:   " + е);
        }



    }

   // void writeInFile()
}
