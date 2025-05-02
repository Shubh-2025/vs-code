public class Fraction {
    private int num;
    private int den;
    
    public Fraction() {
        num=1;
        den=1;
    }
    
    public void setNum(int num) {
        this.num = num;
    }
    
    public void setDen(int den) {
        if (den == 0) throw new IllegalArgumentException("Denominator cannot be zero");
        this.den = den;
    }
    
    public double getDecimal() {
        return (double)num / den;
    }
    
    private int gcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }
    
    public String getReducedFraction() {
        int gcd = gcd(num, den);
        int reducedNum = num / gcd;
        int reducedDen = den / gcd;
        if (reducedDen < 0) {
            reducedNum = -reducedNum;
            reducedDen = -reducedDen;
        }
        return reducedNum + "/" + reducedDen;
    }
    
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.setNum(20);
        f1.setDen(60);
        System.out.println("<        1st testing     >");
        System.out.println("Original Values [Numerator] = "+f1.num+", [Denomirator] = "+f1.den);
        System.out.printf("Decimal value: %.2f\n", f1.getDecimal());
        System.out.println("Reduced fraction: " + f1.getReducedFraction());
        
        f1.setNum(15);
        f1.setDen(25);
        System.out.println("<        2nd testing     >");
        System.out.println("New Values [Numerator] = "+f1.num+", [Denomirator] = "+f1.den);
        System.out.printf("New decimal value: %.2f\n", f1.getDecimal());
        System.out.println("New reduced fraction: " + f1.getReducedFraction());
    }
}