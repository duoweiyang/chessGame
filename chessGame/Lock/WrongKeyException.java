/**
 *
 * @author Luke Senseney
 * @version 1.0 Oct 17, 17
 **/
public class WrongKeyException extends RuntimeException{
    public WrongKeyException(){
        super("You used the wrong key!");
    }
}
