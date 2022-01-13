/**
 * Java Core. Homework #1
 * <p>
 * author Svetlana Cherkovskaya
 */

package homeWork1;

public class Main {

    public static void main(String[] args) {
        Participant participant1 = new Participant("Ivan", 30);
        Participant participant2 = new Participant("Petr", 40);
        Participant participant3 = new Participant("Anna", 35);
        Participant participant4 = new Participant("Lena", 37);

        Team team1 = new Team("SuperTeam", new Participant[]{participant1, participant2, participant3, participant4});

        System.out.println(team1); //выводим данные

        Course course1 = new Course(new int[]{30, 35, 36});

        course1.doIt(team1); // проходим препятствия

        System.out.println(team1); // выводим данные

        team1.showWinners(team1); // выводим список победителей
    }
}
