package calcapp.main;
import calcapp.logics.CalcLogic;
public class Calc{
  public static void main(String[] args){
    int a = 10;
    int b = 25;
    int total = CalcLogic.plus(a, b);
    int difference = CalcLogic.minus(a, b);
    System.out.println("足すと" + total + "、引くと" + difference);
  }
}
