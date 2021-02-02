package sungro.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Repo extends Remote {
    ResultForGetManyUsers getManyUsers(ParamForGetManyUsers param) throws RemoteException;
    ResultForGetOneUser getOneUser(ParamForGetOneUser param) throws RemoteException;
    ResultForAddUser addUser(ParamForAddUser param) throws RemoteException;
    ResultForDeleteUser deleteUser(ParamForDeleteUser param) throws RemoteException;
    ResultForSetUser setUser(ParamForSetUser param) throws RemoteException;
}
