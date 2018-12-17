package es.estech.rramirez;

public class Triangle {
    private double l1;
    private double l2;
    private double l3;

    public Triangle(double l1, double l2, double l3) throws IlegalTriangleException {
        if (validate(l1, l2, l3)) {
            this.l1 = l1;
            this.l2 = l2;
            this.l3 = l3;
        } else {
            throw new IlegalTriangleException("¡ERROR! Has introducido longitudes incorrectas.");
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "l1=" + l1 +
                ", l2=" + l2 +
                ", l3=" + l3 +
                '}';
    }

    private boolean validate(double l1, double l2, double l3) {
        boolean isValidate = true;
        if (l2 + l3 < l1 || l1 + l3 < l2 || l1 + l2 < l3) {
            isValidate = false;
        }
        return isValidate;
    }
}
