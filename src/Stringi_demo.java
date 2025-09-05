public class Stringi_demo {
    public static void main(java.lang.String[] args) {
        String name = "Adam";

        int dlugosc = name.length();

        char inicjal = name.charAt(0);

        System.out.println("Inicjał: " + inicjal);

        String duze, male;

        duze = name.toUpperCase();
        male = name.toLowerCase();

        System.out.println("Imię: " + name);

    }
}
