import java.math.BigInteger;
import java.rmi.*;


public interface Service extends java.rmi.Remote
{

public int[][] produit( int [][] m1, int [][] m2)throws RemoteException;
public int[][] somme( int [][] m1, int [][] m2)throws RemoteException;

}