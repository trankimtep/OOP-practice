package timoday.bai1.entity;

import java.util.Scanner;

public class Fraction {

    private int nominator;
    private int denominator;

    public Fraction() {}

    public Fraction(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public int getNominator() {
        return nominator;
    }

    public void setNominator(int nominator) {
        this.nominator = nominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void inputFraction(Scanner scanner) {
        int nom = scanner.nextInt();
        int denom = scanner.nextInt();
        setNominator(nom);
        setDenominator(denom);
    }

    public Boolean isMinimalist (Fraction fraction) {
        return gcd(fraction.getDenominator(), fraction.getNominator()) == 1;
    }

    public Fraction minimalating (Fraction fraction){
        int tem = gcd(fraction.getDenominator(), fraction.getNominator());
        int nom = fraction.getNominator()/tem;
        int denom = fraction.getDenominator()/tem;
        return new Fraction(nom, denom);
    }

    public Fraction addFraction(Fraction newFraction) {
        Fraction result = new Fraction();
        result.setNominator(this.getNominator() * newFraction.getDenominator() + this.getDenominator() * newFraction.getNominator());
        result.setDenominator(this.getDenominator() * newFraction.getDenominator());
        return minimalating(result);
    }

    public Fraction subtractFraction(Fraction newFraction) {
        Fraction result = new Fraction();
        result.setNominator(this.getNominator() * newFraction.getDenominator() - this.getDenominator() * newFraction.getNominator());
        result.setDenominator(this.getDenominator() * newFraction.getDenominator());
        return minimalating(result);
    }

    public Fraction multiplyFraction(Fraction newFraction) {
        Fraction result = new Fraction();
        result.setNominator(this.getNominator() * newFraction.getNominator());
        result.setDenominator(this.getDenominator() * newFraction.getDenominator());
        return minimalating(result);
    }

    public Fraction divideFraction(Fraction newFraction) {
        Fraction result = new Fraction();
        result.setNominator(this.getNominator() * newFraction.getDenominator());
        result.setDenominator(this.getDenominator() * newFraction.getNominator());
        return minimalating(result);
    }

    public static int gcd (int num1, int num2){
        int ans=1;
        int num=0;
        if(num1>num2)
            num=num2;
        else
            num=num1;
            for(int i=num;i>0;i--){
              if(num1%i==0 && num2%i==0)
              {ans=i;break;}
            }
        return ans;
    }

    @Override
    public String toString() {
        return nominator + "/" + denominator;
    }

}
