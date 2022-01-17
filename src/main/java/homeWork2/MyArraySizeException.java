/**
 * Java Core. Homework #2
 * author Svetlana Cherkovskaya
 */

package homeWork2;

public class MyArraySizeException extends Exception {

    public MyArraySizeException() {
    }

    public String toString() {
        return "MyArraySizeException. Массив должен быть 4х4.";
    }

}
