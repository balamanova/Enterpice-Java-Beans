package hello;

import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;

public class HelloClient {

    public static void main(String[] args) {
        try {
            Properties props = new Properties();
            props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
            props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
            Context context = new InitialContext(props);
            Object ref = context.lookup("java:global/EjbTutorialServer/EjbTutorialServer-ejb/Hello!hello.HelloRemote");
            HelloRemote remoteInterface = (HelloRemote) PortableRemoteObject.narrow(ref, HelloRemote.class);
            System.out.println(remoteInterface.sayHello("Peter"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
