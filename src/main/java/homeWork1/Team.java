/**
 * Java Core. Homework #1
 * <p>
 * author Svetlana Cherkovskaya
 */

package homeWork1;

public class Team {
    private final String nameTeam;
    private Participant[] arrayParticipant;

    public Team(String nameTeam, Participant[] arrayParticipant) {
        this.nameTeam = nameTeam;
        this.arrayParticipant = arrayParticipant;
    }

    public Participant[] getArrayParticipant() {
        return arrayParticipant;
    }

    public void setArrayParticipant(Participant[] arrayParticipant) {
        this.arrayParticipant = arrayParticipant;
    }

    @Override
    public String toString() {
        String a = "Participiants: ";
        for (int i = 0; i < arrayParticipant.length; i++) {
            a += System.lineSeparator() + arrayParticipant[i];
        }
        return nameTeam + ". " + a;

    }
}
