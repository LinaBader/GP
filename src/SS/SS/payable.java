/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SS;

public interface payable {
    double VAT = 0.15;
    public abstract void pay(double amount);
    public abstract double calcprice();
}
