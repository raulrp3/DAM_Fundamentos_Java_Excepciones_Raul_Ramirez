package es.estech.rramirez;

public class Main {
    public static void main(String[] args) {
        HexadecimalConversion hex = new HexadecimalConversion();
        BinaryConversion bin = new BinaryConversion();
        System.out.println(hex.hexADecimal("1F"));
        System.out.println(bin.binarioADecimal("13"));
    }
}
