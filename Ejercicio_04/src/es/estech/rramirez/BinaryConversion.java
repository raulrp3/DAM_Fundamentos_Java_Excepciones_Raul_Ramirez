package es.estech.rramirez;

public class BinaryConversion {
    public Object binarioADecimal(String binaryNum) {
        long number;
        Object result = "¡ERROR! El número que has introducido no es un número binario.";
        try {
            number = Long.parseLong(binaryNum, 2);
            return number;
        } catch (NumberFormatException nfex) {
            return result;
        }
    }
}
