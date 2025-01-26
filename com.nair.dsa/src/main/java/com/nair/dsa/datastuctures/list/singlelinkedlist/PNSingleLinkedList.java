package com.nair.dsa.datastuctures.list.singlelinkedlist;

import java.util.Collection;

public interface PNSingleLinkedList<E> {
    /**
     * Appends the specified element to the end of this list (optional operation).
     * @param e - element to be appended
     */
    void add(E e);

    /**
     * Inserts the specified element at the specified position in this list (optional operation).
     * @param index - index at which the specified element is to be inserted
     * @param element - element to be inserted
     */
    void add(int index, E element);

    /**
     * Appends all of the elements in the specified collection to the end of this list, in the order they are returned by the collection's iterator (optional operation).
     * @param c - collection containing elements to be added to this list
     * @return true if the list changed as a result of the call
     */
    boolean addAll(Collection<? extends E> c);

    /**
     * Inserts all of the elements in the specified collection into this list at the specified position (optional operation).
     * @param index - index at which to insert the first element from the specified collection
     * @param c - collection containing elements to be added to this list
     * @return true if the list changed as a result of the call
     */
    boolean addAll(int index, Collection<? extends E> c);

    /**
     * Removes all of the elements from this list (optional operation).
     */
    void clear();

    /**
     * Returns true if this list contains the specified element.
     * @param o - element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     */
    boolean contains(Object o);

    /**
     * Returns true if this list contains all of the elements in the specified collection.
     * @param c - collection to be checked for containment in this list
     * @return true if this list contains all of the elements in the specified collection
     */
    boolean containsAll(Collection<?> c);

    /**
     * Compares the specified object with this list for equality.
     * @param o - object to be compared for equality with this list
     * @return true if the specified object is equal to this list
     */
    boolean equals(Object o);

    /**
     * Returns the element at the specified position in this list.
     * @param index - index of the element to return
     * @return the element at the specified position in this list
     */
    E get(int index);

    /**
     * Returns the first element in this list.
     * @return the first element in this list
     */
    E getFirst();

    /**
     * Returns the last element in this list.
     * @return the last element in this list
     */
    E getLast();

    /**
     * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
     * @param o - element to search for
     * @return the index of the first occurrence of the specified element in this list, or -1 if not present
     */
    int indexOf(Object o);

    /**
     * Returns true if this list contains no elements.
     * @return true if this list contains no elements
     */
    boolean isEmpty();

    /**
     * Removes the element at the specified position in this list (optional operation).
     * @param index - the index of the element to be removed
     * @return the element that was removed from the list
     */
    E remove(int index);

    /**
     * Removes the first occurrence of the specified element from this list, if it is present (optional operation).
     * @param o - element to be removed from this list, if present
     * @return true if this list contained the specified element
     */
    boolean remove(Object o);

    /**
     * Removes all of the elements from this list that are contained in the specified collection (optional operation).
     * @param c - collection containing elements to be removed from this list
     * @return true if this list changed as a result of the call
     */
    boolean removeAll(Collection<?> c);

    /**
     * Removes and returns the first element from this list.
     * @return the first element from this list
     */
    E removeFirst();

    /**
     * Removes and returns the last element from this list.
     * @return the last element from this list
     */
    E removeLast();

    /**
     * Replaces the element at the specified position in this list with the specified element (optional operation).
     * @param index - index of the element to replace
     * @param element - element to be stored at the specified position
     * @return the element previously at the specified position
     */
    E set(int index, E element);

    /**
     * Returns the number of elements in this list.
     * @return the number of elements in this list
     */
    int size();

    /**
     * Returns an array containing all of the elements in this list in proper sequence (from first to last element).
     * @return an array containing all of the elements in this list in proper sequence
     */
    Object[] toArray();

    /**
     * Returns an array containing all of the elements in this list in proper sequence; the runtime type of the returned array is that of the specified array.
     * @param a - the array into which the elements of this list are to be stored, if it is big enough
     * @return an array containing all of the elements in this list
     */
    <T> T[] toArray(T[] a);

    /**
     * Returns a string representation of this list.
     * @return a string representation of this list
     */
    @Override
    String toString();
}
