package sungro.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Repo extends Remote {
    ResultForGetManyUsers getManyUsers(ParamForGetManyUsers param) throws RemoteException;
    ResultForGetOneUser getOneUser(ParamForGetOneUser param) throws RemoteException;
    ResultForAddUser addUser(ParamForAddUser param) throws RemoteException;
    ResultForDeleteUser deleteUser(ParamForDeleteUser param) throws RemoteException;
    ResultForSetUser setUser(ParamForSetUser param) throws RemoteException;

    ResultForGetCurrentUser getCurrentUser(ParamForGetCurrentUser param) throws RemoteException;
    ResultForLogin login(ParamForLogin param) throws RemoteException;
    ResultForLogout logout(ParamForLogout param) throws RemoteException;

    ResultForGetManyProducts getManyProducts(ParamForGetManyProducts param) throws RemoteException;
    ResultForGetOneProduct getOneProduct(ParamForGetOneProduct param) throws RemoteException;
    ResultForAddProduct addProduct(ParamForAddProduct param) throws RemoteException;
    ResultForDeleteProduct deleteProduct(ParamForDeleteProduct param) throws RemoteException;
    ResultForSetProduct setProduct(ParamForSetProduct param) throws RemoteException;

    ResultForGetManyStock getManyStock(ParamForGetManyStock param) throws RemoteException;
    ResultForGetOneStock getOneStock(ParamForGetOneStock param) throws RemoteException;
    ResultForGetManyStockTrx getManyStockTrx(ParamForGetManyStockTrx param) throws RemoteException;
    ResultForAddStock addStock(ParamForAddStock param) throws RemoteException;
    ResultForDeleteStock deleteStock(ParamForDeleteStock param) throws RemoteException;
    ResultForSetStock setStock(ParamForSetStock param) throws RemoteException;

    ResultForGetManySales getManySales(ParamForGetManySales param) throws RemoteException;
    ResultForAddSale addSale(ParamForAddSale param) throws RemoteException;
    ResultForDeleteSale deleteSale(ParamForDeleteSale param) throws RemoteException;
}
