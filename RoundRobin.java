import java.util.ArrayList;
import java.util.List;

public class RoundRobin {
    public static void main(String[] args) {
        // Beispiel-Liste von Spielern
        List<String> players = new ArrayList<>();
        players.add("Spieler 1");
        players.add("Spieler 2");
        players.add("Spieler 3");
        players.add("Spieler 4");

        // Zeige die Paarungen für einen bestimmten Spieltag an
        int targetRound = 1; // Zum Beispiel Spieltag 2
        showRoundRobinForRound(players, targetRound);
    }

    public static void showRoundRobinForRound(List<String> players, int targetRound) {
        int numPlayers = players.size();

        // Sicherstellen, dass die Anzahl der Spieler gerade ist (für den Fall der Ungeradzahl wird ein Dummy-Spieler hinzugefügt)
        if (numPlayers % 2 != 0) {
            players.add("Freilos"); // Dummy-Spieler für Freilos
            numPlayers++;
        }

        int numRounds = numPlayers - 1;

        // Überprüfen, ob der gewünschte Spieltag innerhalb der gültigen Bereich ist
        if (targetRound < 1 || targetRound > numRounds) {
            System.out.println("Ungültiger Spieltag. Bitte wählen Sie einen Spieltag zwischen 1 und " + numRounds + ".");
            return;
        }

        // Berechnung und Anzeige der Paarungen für den gewünschten Spieltag
        System.out.println("Spieltag " + targetRound);

        int numMatchesPerRound = numPlayers / 2;
        int round = targetRound - 1; // da wir von 0 indexiert sind

        for (int match = 0; match < numMatchesPerRound; match++) {
            int home = (round + match) % (numPlayers - 1);
            int away = (numPlayers - 1 - match + round) % (numPlayers - 1);

            // Der letzte Spieler (der numPlayers-1 Index) bleibt immer gleich und rotiert nicht
            if (match == 0) {
                away = numPlayers - 1;
            }

            System.out.println(players.get(home) + " vs " + players.get(away));
        }
    }
}
