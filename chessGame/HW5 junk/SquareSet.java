import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 * Represents a convenient collection class of chess squares.
 *
 * @author dyang305
 * @version 1.0
 */
public class SquareSet implements Set<Square> {

    private Square[] squareObjects;
    private int size;

    /**
     * No-arg constructor that creates instance of SquareSet.
     */
    public SquareSet() {
        this.squareObjects = new Square[10];
        this.size = 0;
    }

    /**
     * Constructor that creates instance of SquareSet with
     * no duplicates or nulls.
     *
     * @param c a Collection of Square
     */
    public SquareSet(Collection<Square> c) {
        this.squareObjects = new Square[10];
        this.size = 0;
        for (Square s : c) {
            this.add(s);
        }
    }

    /**
     * Adds square to set if it's not already present.
     *
     * @param square a chess square (i.e. a1)
     *
     * @exception InvalidSquareException if square given is invalid.
     *
     * @return true if this set did not already contain the specified element
     */
    @Override
    public boolean add(Square square) {
        if (square == null) {
            throw new NullPointerException();
        }
        if (((int) square.getFile() < 97 || (int) square.getFile() > 104)) {
            throw new InvalidSquareException("" + square.getFile()
            + square.getRank());
        }
        if ((int) square.getRank() < 49 || (int) square.getRank() > 56) {
            throw new InvalidSquareException("" + square.getFile()
            + square.getRank());
        }
        if (size == squareObjects.length) {
            Square[] tempArray = new Square[squareObjects.length * 2];
            for (int i = 0; i < squareObjects.length; i++) {
                tempArray[i] = squareObjects[i];
            }
            squareObjects = tempArray;
        }
        if (!contains(square)) {
            squareObjects[size] = square;
            size++;
            return true;
        }
        return false;
    }

    /**
     * Tests if this set contains the specified element.
     *
     * @param o the element whose presence in this set is to be tested
     * @return true if this set contains the specified element
     */
    @Override
    public boolean contains(Object o) {
        int num = size;
        while (num != 0) {
            if ((squareObjects[num - 1]).equals(o)) {
                return true;
            }
            num--;
        }
        return false;
    }

    /**
     * Tests if set contains all elements from a specific collection.
     *
     * @param c the collection to be checked for containment in this set
     * @return true if set contains all elements of the specified collection
     */
    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!(this.contains(o))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Comparing specified object with this set for equality.
     *
     * @param o the object to be compared for equality with this set.
     * @return true if the object passing through is equal to this set.
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        Set c = (Set) o;
        if (size() == c.size()) {
            if (containsAll(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the hashcode value for this set, which is
     * the sum of hashcodes of elements in the set.
     *
     * @return hashcode of the set.
     */
    @Override
    public int hashCode() {
        int total = 0;
        for (Square item : this) {
            total += item.hashCode();
        }
        return total;
    }

    /**
     * Tests if this set has any elements.
     *
     * @return true if this set contains no elements.
     */
    @Override
    public boolean isEmpty() {
        if (this.size() == 0) {
            return true;
        }
        return false;
    }

    /**
     * Finds the amount of elements in the set.
     *
     * @return number of elements in the set (cardinality).
     */
    @Override
    public int size() {
        int result = 0;
        for (int i = 0; i < squareObjects.length; i++) {
            if (!(squareObjects[i] == null)) {
                result++;
            }
        }
        return result;
    }

    /**
     * Gets elements in this set and returns it.
     *
     * @return an array containing all the elements in this set.
     */
    @Override
    public Object[] toArray() {
        int arraySize = this.size();
        Square[] result = new Square[arraySize];
        int count = 0;

        for (int i = 0; i < squareObjects.length; i++) {
            if (!(squareObjects[i] == null)) {
                result[count] = squareObjects[i];
                count++;
            }
        }
        return result;
    }

    /**
     * Gets elements in this set and returns it.
     *
     * @param a the array into which the elements of this set are to be stored.
     *
     * @exception NullPointerException if a is null.
     * @exception ArrayStoreException if a is not in the inheritance chain.
     *
     * @return an array containing all of the elements in this set,
     * specifically the runtime type of the returned array is that
     * of the specified array.
     */
    @Override
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        if (a == null) {
            throw new NullPointerException();
        }
        if (a.length < size()) {
            a = (T[]) new Object[size()];
        }
        for (int i = 0; i < size(); i++) {
            a[i] = (T) squareObjects[i];
        }
        if (a.length > size()) {
            a[size()] = null;
        }
        return a;
    }

    /**
     * Adds all of the elements in the specified collection to this set if
     * they're nont already there.
     *
     * @param c collection containing elements to be added to this set.
     *
     * @exception NullPointerException if c is null.
     *
     * @return true if this set changed as a result of the call.
     */
    @Override
    public boolean addAll(Collection<? extends Square> c) {
        boolean bol = false;
        for (Square s : c) {
            if (this.add(s)) {
                bol = true;
            }
        }
        return bol;
    }

    /**
     * Goes over the elements in this set and returns an iterator.
     *
     * @return an iterator over the elements in this set
     */
    public Iterator<Square> iterator() {
        return new SquareIterator();
    }

    /**
     * Implements methods of Iterator interface.
     */
    private class SquareIterator implements Iterator<Square> {

        private int index = 0;

        /**
         * Finds out if next() is going to return an element
         * rather than throwing an exception.
         *
         * @return true if the iteration has more elements.
         */
        @Override
      public boolean hasNext() {
            if (squareObjects.length == index || squareObjects[index] == null) {
                return false;
            } else {
                return true;
            }
        }

        /**
         * Finds out if there's a next element.
         *
         * @exception InvalidSquareException is out of bounds or null.
         *
         * @return next element in the iteration.
         */
        @Override
      public Square next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            try {
                Square temp = squareObjects[index];
                index++;
                return temp;
            } catch (IndexOutOfBoundsException e) {
                throw new InvalidSquareException("Indexed out of bounds.");
            } catch (NullPointerException e) {
                throw new InvalidSquareException("No element here.");
            }
        }
    }

    /**
     * Throw exception for optional operation in the Set Interface.
     *
     * @exception UnsupportedOperationException for optional operation.
     */
    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    /**
     * Throw exception for optional operation in the Set Interface.
     *
     * @exception UnsupportedOperationException for optional operation.
     */
    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    /**
     * Throw exception for optional operation in the Set Interface.
     *
     * @exception UnsupportedOperationException for optional operation.
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    /**
     * Throw exception for optional operation in the Set Interface.
     *
     * @exception UnsupportedOperationException for optional operation.
     */
    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }
}
