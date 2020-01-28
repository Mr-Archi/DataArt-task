//sin x=x/1!-x^3/3!+x^5/5!-...+
public class NotCosCalculator {
    public double CalculateWithForLoop(int x, int NoName) {
        double result = 1D;
        double numerator = 1D;
        double denominator = 1D;
        byte b = 1;
        for (int x = 2; x <= NoName; x++) {
            b *= -1;
            numerator = numerator * x;
            denominator *= (x - 1);
            result = (result + numerator / denominator) * b;
        }
        return result;
    }
}
