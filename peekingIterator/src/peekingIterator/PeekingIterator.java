package peekingIterator;

import java.util.Iterator;

public class PeekingIterator {
	private Integer next = null;
	private Iterator<Integer> iter;
	
	
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    iter = iterator;
	    if(iter.hasNext())
	    	next = iter.next();
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return next;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	public Integer next() {
	   Integer result = next;
	   next = iter.hasNext()? iter.next() : null;
	   return result;
	}

	public boolean hasNext() {
	    return next != null;
	}
}
