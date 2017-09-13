package Utility;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by uslabs on 9/12/17.
 */
public class MyQueue implements Queue<Object> {

    LinkedList<Object> list = new LinkedList<>();

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        list.add(o);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object remove() {
        Object o = list.getFirst();
        list.removeFirst();
        return o;
    }

    @Override
    public Object poll() {
        if (list.size() == 0)
            return null;
        Object o = list.getFirst();
        list.removeFirst();
        return o;
    }

    @Override
    public Object element() {
        return list.getFirst();
    }

    @Override
    public Object peek() {
        if (list.size() == 0)
            return null;
        else
            return list.getFirst();
    }
}
