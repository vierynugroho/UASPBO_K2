/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanuas;

/**
 *
 * @author Viery Nugroho TI-B 21104410049
 *
 */
public class Penjumlahan extends OperatorMatematics {

  public Penjumlahan(double a, double b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public double getA() {
    return a;
  }

  @Override
  public void setA(double a) {
    this.a = a;
  }

  @Override
  public double getB() {
    return b;
  }

  @Override
  public void setB(double b) {
    this.b = b;
  }

  public String result() {
    calculator calc = new calculator();
    calc.result = a + b;
    calc.angka = Double.toString(calc.result);
    return calc.angka;
  }
}
