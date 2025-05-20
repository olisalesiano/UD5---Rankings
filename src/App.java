import javax.swing.*;
import java.util.ArrayList;
import net.salesianos.ranking.*;

public class App {
    static ArrayList<Team> teams = new ArrayList<>();

    public static void main(String[] args) {
        String option;
        do {
            option = JOptionPane.showInputDialog(
                    "Ranking de Equipos\n1. Añadir equipo\n2. Mostrar equipos\nQ. Salir");

            if (option == null)
                break; // botón cancela r

            switch (option) {
                case "1":
                    addTeam();
                    break;
                case "2":
                    showTeams();
                    break;
                default:
                    break;
            }
        } while (!"Q".equalsIgnoreCase(option));
    }

    static void addTeam() {
        String name = JOptionPane.showInputDialog("Nombre del equipo:");
        String country = JOptionPane.showInputDialog("País:");
        int year = Integer.parseInt(JOptionPane.showInputDialog("Año de fundación:"));
        int rating = Integer.parseInt(JOptionPane.showInputDialog("Puntuación (1-5):"));

        teams.add(new Team(name, country, year, rating));
        JOptionPane.showMessageDialog(null, "Equipo añadido.");
    }

    static void showTeams() {
        if (teams.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay equipos.");
            return;
        }

        StringBuilder info = new StringBuilder();
        for (Team team : teams) {
            info.append(team).append("\n");
        }

        JOptionPane.showMessageDialog(null, info.toString());
    }
}
