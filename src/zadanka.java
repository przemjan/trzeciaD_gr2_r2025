import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class zadanka {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("zadanka.txt");
        String text= """
                1.Uporządkuj poniższy program, i następnie sformatuj tekst. Dopisz najgorsze gry:
                System.out.print("Według mnie najlepsze gry to:");
                }
                System.out.print("\\"Minecraft \\" (bo napisany w
                Javie:)");
                System.out.print ("\\" WOT \\"");
                public static void main(String[] args) {
                System.out.print("\\"CS 1.6\\"");
                public class NajlepszeGry {
                }
                System.out.print("\\"Dying Light\\"");
                2.Napisz program, który wyświetli w pierwszym wierszu Twoje imię i nazwisko, w
                drugim — ulicę oraz numer domu i mieszkania, w trzecim — nazwę miasta i kod
                pocztowy, a w czwartym — numer telefonu. Na początku programu umieść
                komentarz z dzisiejszą datą. Przetestuj program; w tym celu wpisz go, skompiluj i
                uruchom. Zastosuj najwyżej jedno polecenie println
                3.Napisz program, który wyświetla następujący rysunek:
                *
                ***
                *****
                *******
                *****
                ***
                *
                4.5.6.Napisz program wykonujący następujące operacje: deklarowanie zmiennej letter
                typu char, przypisywanie litery A do zmiennej letter, wyświetlanie zawartości
                zmiennej letter
                Mieszkanie ma 4 pomieszczenia. 2 pomieszczenia mają wymiary 3 *4 metry, jedno
                pomieszczenie 2 * 3 metry, jedno pomieszczenie 2 *2 metry. Napisz program który
                oblicza powierzchnię poszczególnych pomieszczeń oraz powierzchnię całkowitą
                mieszkania. Program powinien wyświetlać zawartość tych zmiennych na ekranie.
                Zmodyfikuj program z zad. 5 tak aby wyświetlał powierzchnię przypadającą na 1
                osobę. (4 osoby).
                7.Region mazowiecki generuje 62% sprzedaży w firmie. Napisz program, który na
                podstawie tego procentu oszacuje, jaką sprzedaż wygeneruje region mazowiecki,
                jeśli firma w ciągu roku sprzeda produkty w sumie za 4,6 mln złotych. Wskazówka:
                Do reprezentowania 62% zastosuj wartość 0,62.
                8.Zmodyfikuj program z zad. 6 tak, aby użytkownik miał możliwość podania
                pojedynczych wymiarów każdego pokoju.
                np.:
                podaj długość pokoju nr1:
                podaj szerokość pokoju nr1:
                podaj długość pokoju nr2:
                podaj szerokość pokoju nr2:
                9. Napisz program w którym zadeklarowane są:
                zmienna name typu String,
                zmienna age typu int,
                zmienna annualPay typu double.
                Zapisz w tych zmiennych literały reprezentujące Twoje nazwisko, wiek i oczekiwany
                roczny dochód. Program powinien wyświetlać te wartości na ekranie w sposób
                podobny do poniższego:
                Nazywam się Adam Kowalski, mam 99 lat
                i chcę zarabiać 100000.0 złotych rocznie
                10. Napisz program zawierający następujące zmienne typu String: firstName,
                middleName i lastName. Pobierz te zmienne od użytkownika. Program powinien
                ponadto obejmować następujące zmienne typu char: first Initial, middleInitial i
                lastInitial. Zapisz w tych zmiennych inicjały pierwszego imienia, drugiego imienia i
                nazwiska. Program powinien wyświetlać zawartość tych zmiennych na ekranie.
                11. Napisz program, który wyświetla prośbę o wprowadzenie wartości kupowanego
                produktu. Program ten powinien następnie obliczać podatek stanowy i lokalny od
                sprzedaży. Załóżmy, że podatek stanowy wynosi 4%, a podatek lokalny to 2%.
                Program powinien wyświetlać wartość produktu, podatek stanowy, podatek lokalny i
                łączną cenę sprzedaży (czyli sumę wartości produktu i obu podatków od sprzedaży).
                Wskazówka: Posłuż się wartością 0,02, aby przedstawić 2%, i wartością 0,04 do
                reprezentowania 4%.
                12. Liczbę kilometrów przejechanych na litrze paliwa można obliczyć według
                następującego wzoru:
                kilometry na litrze = przejechane kilometry/litry paliwa
                Napisz program, który wyświetla prośbę o wprowadzenie liczby przejechanych
                kilometrów i zużytych litrów paliwa. Program powinien obliczać liczbę kilometrów
                przejechanych na litrze i wyświetlać wynik na ekranie.
                13. Pudełko zawiera 40 ciasteczek. Z informacji na opakowaniu wynika, że pudełko
                obejmuje 10 porcji, a każda porcja ma 300 kalorii. Napisz program, który pozwala
                użytkownikowi wpisać liczbę zjedzonych ciasteczek, a następnie informuje o liczbie
                skonsumowanych kalorii.
                14. Napisz program, który wyświetla prośbę o wprowadzenie wyników z trzech testów.
                Program powinien wyświetlać wyniki z każdego testu, a także średnią.
                15. Producent elektroniki sprzedaje płytki drukowane z marżą 40%. Jeśli znasz cenę
                detaliczną płytki, możesz obliczyć zysk za pomocą następującego wzoru:
                zysk = cena detaliczna × 0,4
                Napisz program, który prosi o wprowadzenie ceny detalicznej płytki, oblicza zysk ze
                sprzedaży tego produktu i wyświetla wynik na ekranie.
                16. Napisz program, który wyświetla użytkownikowi prośbę o wprowadzenie nazwy
                ulubionego miasta. Dane wejściowe zapisz w zmiennej typu String. Program
                powinien wyświetlać następujące informacje:
                liczbę znaków w nazwie miasta,
                nazwę miasta zapisaną wielkimi literami,
                nazwę miasta zapisaną małymi literami,
                pierwszy znak nazwy miasta.
                17. Napisz program, który oblicza podatek i napiwek na podstawie rachunku w
                restauracji. Program powinien wyświetlać użytkownikowi prośbę o wprowadzenie
                ceny posiłku. Przyjmij podatek na poziomie 6,75% ceny, a napiwek na poziomie 20%
                sumy ceny i podatku. Wyświetl na ekranie cenę posiłku, wartość podatku, wysokość
                napiwku i łączną kwotę do zapłaty.
                18. Katarzyna kupiła 600 akcji w cenie 21,77 złotego za akcję. Musi zapłacić swojemu
                brokerowi 2% prowizji za transakcję. Napisz program, który oblicza i wyświetla
                następujące informacje:
                kwotę zapłaconą za same akcje (bez prowizji),
                wysokość prowizji,
                łączną zapłaconą kwotę (cena akcji plus prowizja).
                19. Producent napojów bezalkoholowych przeprowadził ankietę z udziałem 12 467
                konsumentów i odkrył, że około 14% ankietowanych kupuje przynajmniej jeden
                napój energetyczny tygodniowo. Około 64% kupujących napoje energetyczne
                preferuje smak cytrusowy. Napisz program wyświetlający następujące informacje:
                przybliżoną liczbę ankietowanych osób, które kupują przynajmniej jeden napój
                energetyczny tygodniowo;
                przybliżoną liczbę ankietowanych osób, które preferują napoje energetyczne o
                smaku cytrusowym.
                20. W przepisie na ciasteczka podana jest następująca ilość składników:
                1,5 szklanki cukru,
                1 szklanka masła,
                2,75 szklanki mąki.
                Te składniki pozwalają upiec 48 ciasteczek. Napisz program, który wyświetla
                użytkownikowi prośbę o wpisanie oczekiwanej liczby ciasteczek, a następnie
                informuje, ile szklanek poszczególnych składników potrzeba do uzyskania tej liczby.
                21. Gdy bank wypłaca procent składany, płaci odsetki nie tylko od zdeponowanej kwoty,
                ale też od zakumulowanej z czasem kwoty odsetek. Załóżmy, że chcesz zdeponować
                pewną kwotę na rachunku oszczędnościowym i pozwolić na akumulowanie procentu
                składanego przez określoną liczbę lat. Oto wzór na obliczenie stanu konta po
                określonej liczbie lat:
                A = P(1 +r/n)nt
                Oto wartości z tego wzoru:
                A to kwota pieniędzy na koncie po określonej liczbie lat,
                P to kwota pierwotnie zdeponowana na koncie,
                r to roczna stopa oprocentowania,
                n określa, ile razy w roku odsetki są doliczane do kapitału,
                t to liczba lat.
                Napisz program, który przeprowadza takie obliczenia. Program powinien wyświetlać
                prośbę o wprowadzenie następujących danych:
                kwoty pieniędzy początkowo zdeponowanej na koncie,
                rocznej stopy oprocentowania,
                ile razy w roku odsetki są kapitalizowane (np. przy kapitalizacji miesięcznej wpisz 12,
                a przy kapitalizacji kwartalnej — 4),
                liczby lat, przez jakie środki będą znajdować się na koncie i generować odsetki.
                Po wprowadzeniu danych wejściowych program powinien obliczać i wyświetlać
                kwotę, jaka znajdzie się na koncie po określonej liczbie lat.
                22. W zeszłym miesiącu Jacek kupił trochę akcji firmy Acme Software. Oto szczegóły tej
                transakcji:
                liczba zakupionych akcji: 1000,
                cena zakupu akcji: 32,87 złotego za akcję, prowizja wypłacona brokerowi: 2% ceny
                akcji.
                Po dwóch tygodniach Jacek sprzedał akcje. Oto szczegóły transakcji sprzedaży:
                liczba sprzedanych akcji: 1000,
                cena sprzedaży akcji: 33,92 złotego za akcję,
                prowizja wypłacona brokerowi: 2% ceny akcji.
                Napisz program wyświetlający następujące informacje:
                kwotę zapłaconą przez Jacka za akcje,
                wartość prowizji zapłaconej przez Jacka brokerowi przy zakupie,
                kwotę otrzymaną przez Jacka ze sprzedaży akcji,
                wartość prowizji zapłaconej przez Jacka brokerowi przy sprzedaży,
                zysk Jacka ze sprzedaży akcji po zapłaceniu obu prowizji (jeśli wysokość zysku
                m jest ujemna, oznacza to, że Jacek poniósł stratę).
                23. Właściciel winnicy sadzi kilka nowych rzędów winogron i musi wiedzieć, ile sadzonek
                ma umieścić w każdym rzędzie. Po pomiarze rzędów stwierdził, że może zastosować
                do tego pokazany niżej wzór (uwzględnia on okratowanie, jakie trzeba zbudować po
                obu końcach każdego rzędu):
                V=(R-2E) /S
                Oto wartości wykorzystywane w tym wzorze:
                V to liczba sadzonek, jakie można umieścić w rzędzie,
                R to długość rzędu w metrach,
                E to ilość miejsca zajmowanego przez okratowanie,
                S to odległość między sadzonkami w metrach.
                Napisz program, który wykonuje potrzebne obliczenia za właściciela winnicy.
                Program powinien wyświetlać użytkownikowi prośbę o wprowadzenie następujących
                danych:
                długości rzędu w metrach,
                ilości miejsca zajmowanego przez okratowanie w metrach,
                odległości między sadzonkami w metrach.
                Po wprowadzeniu danych wejściowych program powinien obliczać i wyświetlać
                liczbę sadzonek, jakie zmieszczą się w rzędzie 
                """;
        pw.println(text);
        pw.close();
    }

}
