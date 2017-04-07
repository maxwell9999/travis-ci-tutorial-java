package io.github.joaomlneto.travis_ci_tutorial_java;

public class SimpleCalcDriver {
   public static final void main(String[] args) {
      int num = 17;
      SimpleCalculator calc = new SimpleCalculator();

      num = calc.mul(num, 3);
      num = calc.mul(num, 7);
      num = calc.mul(num, 13);
      num = calc.mul(num, 37);
      System.out.println(num);
   }
}
