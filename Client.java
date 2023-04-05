import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
            Hello obj = (Hello) Naming.lookup("//localhost/Hello");
            String message = obj.sayHello("world");
            int ans = obj.add(10, 20);
            System.out.println(message);
            System.out.println(ans);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

