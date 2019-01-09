/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.rmi.RemoteException;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author balamano
 */
@Remote
public interface ShopRemote {
    public List<Product> findProducts(String searchString) throws RemoteException;

    public List<Product> findProductsByTitle(String searchString) throws RemoteException;

    public List<Product> findProductsByPerson(String searchString)throws RemoteException;

    public List<Product> findBooks(String searchString) throws RemoteException;

    public List<Product> findBooksByTitle(String searchString) throws RemoteException;

    public List<Product> findBooksByPerson(String searchString) throws RemoteException;

    public List<Product> findFilms(String searchString) throws RemoteException;

    public List<Product> findFilmsByTitle(String searchString) throws RemoteException;

    public List<Product> findFilmsByPerson(String searchString) throws RemoteException;
    
}
