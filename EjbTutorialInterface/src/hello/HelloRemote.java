package hello;

import javax.ejb.Remote;

/**
 *
 * @author neuhardt
 */
@Remote
public interface HelloRemote {
    public String sayHello(String name);
    
}
