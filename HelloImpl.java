import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello {

    public HelloImpl() throws RemoteException {
        super();
    }

    public String sayHello(String name) throws RemoteException {
        return "Hello, " + name + "!";
    }
    public int add(int num1,int num2) throws RemoteException {
        int result = num1 + num2;
        return result;
    }
}
