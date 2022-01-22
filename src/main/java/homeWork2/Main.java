/**
 * Java Core. Homework #2
 * author Svetlana Cherkovskaya
 */

package homeWork2;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(makeArray(new String[][]{
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"}
            }));

        } catch (MyArraySizeException e) {
            System.out.println(e);
        } catch (MyArrayDataException e) {
            System.out.println(e);
        }
    }

    public static int makeArray(String[][] array) throws MyArraySizeException {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int l = array.length;
        if (l != 4) {
            throw new MyArraySizeException();
        }
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            k = array[i].length;
            if (k != 4) {
                throw new MyArraySizeException();
            }
        }

        int sum = 0;
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    a = Integer.parseInt(array[i][j].trim());
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
                sum += a;
            }
        }
        return sum;
    }
}

