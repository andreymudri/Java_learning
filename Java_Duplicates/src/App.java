public class App {
    public static void main(String[] args) {
        String[] array1 = {"maçã", "banana", "laranja", "uva", "pera"};
        String[] array2 = { "abacaxi", "pêra", "uva", "limão", "banana" };
        for (String item1 : array1) {
            for (String item2 : array2) {
                if (item1.equals(item2)) {
                    System.out.println(item1);
                }
            }
        }
    }
}