//import java.util.Arrays;

package homeWork3;

public class Main {
    public static void main(String[] args) {


        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox.compare(orangeBox));

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        System.out.println(appleBox1.getWeight());


        appleBox.putIntoAnother(appleBox1);
        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox.getWeight());

        //orangeBox.putIntoAnother(appleBox1);
    }
}
