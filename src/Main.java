import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "W", "X", "Y", "Z"};

        int liczbaKolumn = Integer.parseInt(JOptionPane.showInputDialog(null, "Wporwadz liczbe kolumn: "));
        int liczbaWierszy = Integer.parseInt(JOptionPane.showInputDialog(null, "Wprowadz liczbe wierszy: "));
        int convertedColumn = 0;

        System.out.println("Wygenerowano tablice zawierajaca kolumny (" + liczbaKolumn + ") oraz wiersze(" + liczbaWierszy + ")");
        String wyborKolumny = JOptionPane.showInputDialog(null, "Wybierz zakres kolumn do zsumowania (A-Z)", "");
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].equals(wyborKolumny)) {
                System.out.println("Wybrana kolumna: " + wyborKolumny);
                convertedColumn = i + 1;
            }
        }
        int wyborKomorki = Integer.parseInt(JOptionPane.showInputDialog(null, "Wybierz zakres komorek do zsumowania (1-" + liczbaWierszy +")"));

        //sumowanie
        if(wyborKomorki > liczbaWierszy || (convertedColumn-1) > liczbaKolumn)
    }
}
