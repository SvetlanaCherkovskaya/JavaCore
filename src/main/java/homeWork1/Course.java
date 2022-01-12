/**
 * Java Core. Homework #1
 * <p>
 * author Svetlana Cherkovskaya
 */

package homeWork1;

public class Course {
    private final int[] arrayCourse;

    public Course(int[] arrayCourse) {
        this.arrayCourse = arrayCourse;
    }

    void doIt(Team team) {
        for (int i = 0; i < team.getArrayParticipant().length; i++) {
            int ball = 0;
            for (int j = 0; j < arrayCourse.length; j++) {
                if (arrayCourse[j] <= team.getArrayParticipant()[i].getPower()) {
                    ball++;
                }
                if (ball == 3) {
                    team.getArrayParticipant()[i].setWinner(true);
                }
            }
        }
    }
}



