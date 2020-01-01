/**
 *
 * @author Luke Senseney
 * @version 1.0 Oct 17, 17
 **/
public class IsLockedException extends Exception{
    public IsLockedException(){
        super("The lock is already locked");
    }
}
