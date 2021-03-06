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
public class BkashPayment implements Payment{

    @Override
    public long getAmount() {
        System.out.println("Taking Bkash payment ");
        return 100;
    }

}
