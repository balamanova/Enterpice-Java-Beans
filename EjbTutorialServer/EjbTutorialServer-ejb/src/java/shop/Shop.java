/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.rmi.RemoteException;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author balamano
 */
@Stateless
public class Shop implements ShopRemote {
    ProductInfoImpl productInfo;
    
    public Shop() {
        this.productInfo = new ProductInfoImpl();
    }

    @Override
    public List<Product> findProducts(String searchString) {
        return productInfo.findProducts(searchString);
    }

    @Override
    public List<Product> findProductsByTitle(String searchString) {
        return productInfo.findProductsByTitle(searchString);
    }

    @Override
    public List<Product> findProductsByPerson(String searchString){
        return productInfo.findProductsByPerson(searchString);
    }

    @Override
    public List<Product> findBooks(String searchString) {
        return productInfo.findBooks(searchString);
    }

    @Override
    public List<Product> findBooksByTitle(String searchString)  {
        return productInfo.findBooksByTitle(searchString);
    }

    @Override
    public List<Product> findBooksByPerson(String searchString) {
        return productInfo.findBooksByPerson(searchString);
    }

    @Override
    public List<Product> findFilms(String searchString) {
        return productInfo.findFilms(searchString);
    }

    @Override
    public List<Product> findFilmsByTitle(String searchString) {
        return productInfo.findFilmsByTitle(searchString);
    }

    @Override
    public List<Product> findFilmsByPerson(String searchString) {
        return productInfo.findFilmsByPerson(searchString);
    }
    
}
