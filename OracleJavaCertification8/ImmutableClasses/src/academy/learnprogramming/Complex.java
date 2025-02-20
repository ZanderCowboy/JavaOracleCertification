package academy.learnprogramming;

public class Complex {

    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex plus(Complex b) {
        double newReal = real + b.real;
        double newImaginary = imaginary + b.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex minus(Complex otherComplex) {
        double newReal = real - otherComplex.real;
        double newImaginary = imaginary - otherComplex.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex times(Complex b) {
        // ABBA
        double newReal = real * b.real - imaginary * b.imaginary;
        double newImaginary = real * b.imaginary + imaginary * b.real;
        return new Complex(newReal, newImaginary);
    }

    public Complex divide(Complex b) {
        double aReal = this.real;
        double aImaginary = this.imaginary;
        double bReal = b.real;
        double bImaginary = b.imaginary;
        double newBImaginary = -1 * bImaginary;

        Complex numA = new Complex(aReal, aImaginary);
        Complex numB = new Complex(bReal, newBImaginary);
        Complex numerator = numA.times(numB);

        Complex denumA = new Complex(bReal, bImaginary);
        Complex denumB = new Complex(bReal, newBImaginary);
        Complex denumerator = denumA.times(denumB);

        double newReal = numerator.real / denumerator.real;
        double newImaginary = numerator.imaginary / denumerator.real;

        return new Complex(newReal, newImaginary);
    }

    public static Complex plus(Complex a, Complex b) {
//        double real = a.real + b.real;
//        double imaginary = a.imaginary + b.imaginary;
//        return new Complex(real, imaginary);
        return a.plus(b);
    }

    public static void main(String[] args) {
        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(-3.0, 4.0);

//        Complex bPlusA = b.plus(a);
        Complex bPlusA = Complex.plus(a, b); // static method

        System.out.println("a real= " + a.real + " imaginary= " + a.imaginary);
        System.out.println("b real= " + b.real + " imaginary= " + b.imaginary);
        System.out.println("b + a real= " + bPlusA.real + " imaginary= " + bPlusA.imaginary);
        System.out.println();

        Complex c = new Complex(2, 3);
        Complex d = new Complex(4, 5);
        Complex cPlusD = c.plus(d);
        Complex cMinusD = c.minus(d);
        Complex cTimesD = c.times(d);
        Complex cDividesD = c.divide(d);

        System.out.println("c: " + c.real + " + " + c.imaginary + "i");
        System.out.println("d: " + d.real + " + " + d.imaginary + "i");
        System.out.println("c + d: " + cPlusD.real + " imaginary= " + cPlusD.imaginary);
        System.out.println("c - d real= " + cMinusD.real + " imaginary= " + cMinusD.imaginary);
        System.out.println("c * d real= " + cTimesD.real + " imaginary= " + cTimesD.imaginary);
        System.out.println("c / d real= " + cDividesD.real + " imaginary= " + cDividesD.imaginary);

    }
}
