/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SS;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author leena
 */
public class subscription implements payable{
        
    private account account ;
    private int lengthInMon ;
    private date startdate ;
    private date enddate ;
    private String status ;

    public subscription(account account, date startdate, date enddate) {
        this.account = account;
        this.startdate = startdate;
        this.enddate = enddate;
        setLengthInMon();
    }

    public account getAccount() {
        return account;
    }

    public void setAccount(account account) {
        this.account = account;
    }
    
    public void setLengthInMon(){
        lengthInMon=((this.enddate.getYear()-this.startdate.getYear())*12+this.enddate.getMonth())-(this.startdate.getMonth());
    }

    public int getLengthInMon() {
        return lengthInMon;
    }
    
    public date getStartdate() {
        return startdate;
    }

    public void setStartdate(date startdate) {
        this.startdate = startdate;
    }

    public date getEnddate() {
        return enddate;
    }

    public void setEnddate(date enddate) {
        this.enddate = enddate;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void pay(double amount){
       System.out.print("you're total price is "+calcprice()+"SAR");
    }
    @Override
    public double calcprice() {
    return (lengthInMon*30)*VAT;   
}
    
    public final void confirm(){
        Scanner input = new Scanner(System.in);
        pay(calcprice());
        try{
            System.out.println("do you want to confirm the subscription/payment? yes/no");
            String answer = input.next();
            if(answer=="yes"){
        status="valid till"+enddate.toString();
        System.out.println("payment confirmed "+status+"\nthank you :)");}
            else System.out.println("subscripiton has been cancelled thank you for visting the streaming service");
        }
        catch(InputMismatchException e){
            System.err.println("error");
        }
    }
@Override
    public String toString(){
        return String.format("username: %s status: %s", account.getUsername(), status);
    }
}
