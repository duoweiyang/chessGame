/**
 *
 * @author Luke Senseney
 * @version 1.0 Oct 17, 17
 **/
public class Lock {
    private boolean isLocked = false;
    private int key;

    public Lock(int key){
        this.key = key;
    }
    public static void main(String[] args){
        Lock l = new Lock(5);
        try {
            l.lock(5);
            System.out.println("L is now locked");
        } catch (IsLockedException e) {
            System.out.println("The lock is already locked");
        }
        try {
            l.lock(5);
            System.out.println("L is now locked");
        } catch (IsLockedException e) {
            System.out.println("The lock is already locked");
        } catch (ArithmeticException e){
            System.out.println("Divided by zero");
        }

    }

    public void lock(int key) throws IsLockedException{
        if(isLocked){
            throw new IsLockedException();
        }
        if(this.key != key){
            throw new WrongKeyException();
        }
        isLocked = true;
    }
}
