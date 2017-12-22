import javax.swing.*;

public class Main {

    static int liczbaKolumn = Integer.parseInt(JOptionPane.showInputDialog(null, "[Tworzenie Tabeli] Wporwadz liczbe kolumn: "));
    static int liczbaWierszy = Integer.parseInt(JOptionPane.showInputDialog(null, "[Tworzenie tabeli] Wprowadz liczbe wierszy: "));
    static int convertedColumn = 0;
    static String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "W", "X", "Y", "Z"};


    public static void main(String[] args) {


        System.out.println("Wygenerowano tablice zawierajaca kolumny (" + liczbaKolumn + ") oraz wiersze(" + liczbaWierszy + ")");
        sumujKomorki();
    }

    public static void sumujKomorki() {
        String wyborKolumny = JOptionPane.showInputDialog(null, "Wybierz zakres kolumn do zsumowania (" + letters[0] + "-" + letters[liczbaKolumn - 1] + ")", "");
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].equals(wyborKolumny)) {
                convertedColumn = i + 1;
            }
        }
        int wyborKomorki = Integer.parseInt(JOptionPane.showInputDialog(null, "Wybierz zakres komorek do zsumowania (1-" + liczbaWierszy + ")"));

        if (wyborKomorki > liczbaWierszy || (convertedColumn - 1) > liczbaKolumn) {
            System.out.println("Nie udalo sie zsumowac wybranego zakresu komorek. Prawdopodobnie wykroczyles poza granice utworzonej tabeli.");
        } else {
            System.out.println("\n\nOgolny zakres tabeli:\n Stworzone kolumny(" + letters[0] + " - " + letters[liczbaKolumn - 1] + "). \n Stworzone wiersze: (" + liczbaWierszy + ")");
            System.out.println("Laczna liczba komorek w wybranym przez Ciebie zakresie to: " + (convertedColumn * wyborKomorki));
        }
    }
}
