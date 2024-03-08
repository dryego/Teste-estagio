import java.lang.StringBuilder;

public class InverteString {
    public static void main(String[] args) {
        String original = "Exemplo";
        String invertida = inverterString(original);
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }

    // Função para inverter a string
    public static String inverterString(String str) {
        int length = str.length();
        StringBuilder invertida = new StringBuilder(length);
        for (int i = length - 1; i >= 0; i--) {
            invertida.append(str.charAt(i));
        }
        return invertida.toString();
    }
}

