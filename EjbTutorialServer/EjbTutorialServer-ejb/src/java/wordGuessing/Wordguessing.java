/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordGuessing;

import java.rmi.RemoteException;
import javax.ejb.Stateless;

/**
 *
 * @author balamano
 */
@Stateless
public class Wordguessing implements WordguessingRemote {

    public WordguessingImpl wordGuess;
    public Wordguessing() {
        wordGuess = new WordguessingImpl();
    }
    
    @Override
    public String getLetters() throws RemoteException {
      return wordGuess.getLetters();
    }

    @Override
    public String guessWord(String guess) throws RemoteException {
        return wordGuess.guessWord(guess);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
