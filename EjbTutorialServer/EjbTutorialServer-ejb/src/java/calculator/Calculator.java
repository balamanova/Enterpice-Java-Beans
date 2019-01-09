/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author balamano
 */
@Stateless
public class Calculator implements CalculatorRemote {

    @Override
    public String compute(String num1, String num2, String op) throws RemoteException {
       Calculation calc = new Calculation();
       String res=null;
        try {
            res= calc.compute(num1, num2, op);
        } catch (CalculationException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return res;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
