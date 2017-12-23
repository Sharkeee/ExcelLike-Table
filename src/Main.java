import javax.swing.*;

public class Main {

    static int liczbaKolumn = Integer.parseInt(JOptionPane.showInputDialog(null, "[Tworzenie Tabeli] Wprowadz liczbe kolumn: "));
    static int liczbaWierszy = Integer.parseInt(JOptionPane.showInputDialog(null, "[Tworzenie tabeli] Wprowadz liczbe wierszy: "));
    static int convertedColumn = 0;
    static String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "W", "X", "Y", "Z"};


    public static void main(String[] args) {

        if (liczbaKolumn < 0 || liczbaKolumn > letters.length) {
            System.out.println("Liczba kolumn wykracza poza rozmiar alfabetu. Maksymalna liczba kolumn do utworzenia to: " + letters.length);
        }
        if (liczbaWierszy < 0 || liczbaWierszy > 9999) {
            System.out.println("Niepoprawna liczba wierszy, wprowadz liczbe z zakresu (0-9999");
        }

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

        if (wyborKomorki > liczbaWierszy || wyborKomorki < 0 || (convertedColumn - 1) > liczbaKolumn || (convertedColumn - 1) < 0) {
            System.out.println("Nie udalo sie zsumowac wybranego zakresu komorek. Prawdopodobnie wykroczyles poza granice utworzonej tabeli.");
        } else {
            System.out.println("Parametry wygenerowanej tabeli:\n Stworzone kolumny(" + letters[0] + " - " + letters[liczbaKolumn - 1] + "). \n Stworzone wiersze: (0-" + liczbaWierszy + ")");
            System.out.println("\nLaczna liczba komorek w wybranym przez Ciebie zakresie to: " + (convertedColumn * wyborKomorki));
        }
    }


}
