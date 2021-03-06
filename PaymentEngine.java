/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_;

/**
 *
 * @author Asus
 */
public class PaymentEngine {
    
    public static void accept(Payment payment)
    {
        System.out.println("Accepting payment : "+payment.getAmount());
    }
}
