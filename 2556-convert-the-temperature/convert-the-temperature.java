class Solution {
    public double[] convertTemperature(double celsius) {
        double Fahrenheit = celsius * 1.80 + 32.00;
        double kel = celsius+273.15;

        return new double[] {kel, Fahrenheit};
    }
}