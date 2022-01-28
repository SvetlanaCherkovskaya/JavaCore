package homeWork4;

import java.util.*;


public class Main1 {
    public static void main(String[] args) {

        String[] arrayAnimals = new String[15];
        arrayAnimals[0] = "dog";
        arrayAnimals[1] = "cat";
        arrayAnimals[2] = "cow";
        arrayAnimals[3] = "dog";
        arrayAnimals[4] = "horse";
        arrayAnimals[5] = "cat";
        arrayAnimals[6] = "mouse";
        arrayAnimals[7] = "cow";
        arrayAnimals[8] = "hamster";
        arrayAnimals[9] = "cat";
        arrayAnimals[10] = "chinchilla";
        arrayAnimals[11] = "horse";
        arrayAnimals[12] = "cat";
        arrayAnimals[13] = "sheep";
        arrayAnimals[14] = "dog";

        //Выводим список уникальных слов
        List<String> listOfAnaimals = new ArrayList<String>();
        listOfAnaimals = Arrays.asList(arrayAnimals);
        HashSet<String> uniqueAnimals = new HashSet<>(listOfAnaimals);
        System.out.println(uniqueAnimals);

        //Выводим количество повторов
        HashMap<String, Integer> repeats = new HashMap<>();
        for (String animal : arrayAnimals) {
            if (repeats.get(animal) == null) {
                repeats.put(animal, 1);
            } else {
                repeats.put(animal, repeats.get(animal) + 1);
            }

        }
        System.out.println(repeats);


    }
}
