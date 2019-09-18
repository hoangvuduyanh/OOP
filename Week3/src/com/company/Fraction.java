public class Fraction {
    private int numerator, denominator;
    void debug () {
        System.out.printf("%d %d\n", numerator, denominator);
    }
    int gcd (int a, int b) {
        if (a == 0 || b == 0) return a + b;

        while (a != 0 && b != 0) {
            if (Math.abs(a) > Math.abs(b)) {
                a %= b;
            } else {
                b %= a;
            }
            if (a == 0 || b == 0) return Math.abs(a + b);
        }
        return Math.abs(a + b);
    }
    Fraction reduce() {
        int g = gcd(this.numerator, this.denominator);
        this.numerator /= g;
        this.denominator /= g;
        return this;
    }

    public Fraction () {
        this.numerator = 1;
        this.denominator = 1;
    }
    public Fraction (int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0)
            this.denominator = denominator;
        else
            this.denominator = 1;
    }
    public Fraction (Fraction other) {
        this.setNumerator(other.getNumerator());
        this.setDenominator(other.getDenominator());
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getNumerator() {
        return numerator;
    }
    public void setDenominator(int denominator) {
        if (denominator != 0)
            this.denominator = denominator;
        else
            this.denominator = 1;
    }
    public int getDenominator() {
        return denominator;
    }
    // add
    public Fraction add(Fraction other) {
        int newNum = numerator * other.getDenominator() + other.getNumerator() * denominator;
        int newDen = denominator * other.getDenominator();
        this.setNumerator(newNum);
        this.setDenominator(newDen);
        return this;
    }

    // subtract
    public Fraction subtract(Fraction other) {
        int newNum = numerator * other.getDenominator() - other.getNumerator() * denominator;
        int newDen = denominator * other.getDenominator();
        this.setNumerator(newNum);
        this.setDenominator(newDen);
        return this;
    }

    // multiple
    public Fraction multiply(Fraction other) {
        int newNum = numerator * other.getNumerator();
        int newDen = denominator * other.getDenominator();
        this.setNumerator(newNum);
        this.setDenominator(newDen);
        return this;
    }

    // divide
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) return this;
        int newNum = numerator * other.denominator;
        int newDen = denominator * other.numerator;
        this.setNumerator(newNum);
        this.setDenominator(newDen);
        return this;
    }

    /**
     * compare this with other, notice that param is Object type
     */
    public boolean equals(Object obj) {
        if (!(obj instanceof Fraction)) {
            return false;
        }
        Fraction other = (Fraction) (obj);
        if (numerator * other.getDenominator() == denominator * other.getNumerator()) {
            return true;
        }
        return false;
    }
}