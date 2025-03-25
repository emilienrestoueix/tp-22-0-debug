public class Main {
    public static void main(String[] args) throws Exception {
        // Problème 1
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number at index " + i + ": " + numbers[i]);
        }

        // Problème 2
        double result = calculateValue(5, 0);
        System.out.println("Result: " + result);

        // Problème 3
        int count = 10;
        while (count > 0) {
            System.out.println("Count: " + count);
            count -= 2;
        }

        // Problème 4
        String message = "Bonjour";
        System.out.println("Longueur du message : " + message.length());
        try {
            char character = message.charAt(message.length()-1);
            System.out.println("Caractère à l'indice " + message.length() + " : " + character);
        } catch (Exception e){
            throw new Exception("Index de charactere incorrect");
        }

        // Problème 5
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println("Comparaison de chaînes : " + (str1.equals(str2)));

        // Problème 6
        Main mainObj = new Main();
        mainObj.method();
    }

    // Méthode pour le problème de division par zéro
    public static int calculateValue(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }

    // Méthode pour le problème d'utilisation incorrecte d'une méthode de classe
    public void method() {
        System.out.println("Méthode appelée !");
    }
}
