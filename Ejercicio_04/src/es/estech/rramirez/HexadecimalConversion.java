package es.estech.rramirez;

public class HexadecimalConversion {
    public Object hexADecimal(String hexNum) {
        long number;
        Object result = "¡ERROR! El número que has introducido no es un número hexadecimal.";
        try {
            number = Long.parseLong(hexNum, 16);
            return number;
        } catch (NumberFormatException nfex) {
            return result;
        }
    }
}
