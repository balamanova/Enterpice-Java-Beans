/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.rmi.RemoteException;
import javax.ejb.Remote;

/**
 *
 * @author balamano
 */
@Remote
public interface CalculatorRemote {
   public String compute(String num1, String num2, String op) throws RemoteException;
}
