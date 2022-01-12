/**
 * Java Core. Homework #1
 * <p>
 * author Svetlana Cherkovskaya
 */

package homeWork1;

public class Participant {
    private final String name;
    private final int power;
    private boolean winner;

    public Participant(String name, int power, boolean winner) {
        this.name = name;
        this.power = power;
        this.winner = winner;
    }

    public Participant(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {

        return name + ", " +
                "Power: " + power + ", " +
                "Winner: " + winner + ".";
    }
}
