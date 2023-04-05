import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    public String sayHello(String name) throws RemoteException;
    public int add(int num1,int num2) throws RemoteException;
}
