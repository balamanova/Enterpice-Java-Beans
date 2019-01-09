/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordGuessing;

import java.rmi.RemoteException;
import javax.ejb.Remote;

/**
 *
 * @author balamano
 */
@Remote
public interface WordguessingRemote {
    public String getLetters() throws RemoteException;
    public String guessWord(String guess) throws RemoteException;
}
