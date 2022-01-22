/**
 * Java Core. Homework #2
 * author Svetlana Cherkovskaya
 */

package homeWork2;

public class MyArrayDataException extends RuntimeException {
    private final int i;
    private final int j;

    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public String toString() {
        return "MyArrayDataException. Тип String в ячейке: i=" + i + ", j=" + j + ".";
    }
}
