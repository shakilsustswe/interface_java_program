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
public class PaymentEngineDemo {
    public static void main(String[] args)
    {
        PaymentEngine paymentEngine = new PaymentEngine();
        BkashPayment bkashPayment = new BkashPayment();
        CashPayment cashPayment = new CashPayment();
        PaymentEngine.accept(bkashPayment);
        PaymentEngine.accept(cashPayment);
        
    }
}
