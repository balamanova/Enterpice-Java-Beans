package hello;

import javax.ejb.Stateless;

/**
 *
 * @author neuhardt
 */
@Stateless
public class Hello implements HelloRemote {

@Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }

}
