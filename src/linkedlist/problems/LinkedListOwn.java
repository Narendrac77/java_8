package src.linkedlist.problems;

public class LinkedListOwn<E> implements ListOwn<E>{

    int size = 0;

    Node<E> first;

    Node<E> last;

    public LinkedListOwn(){}

    private void linkFirst(E e){
        final Node<E> f = first;
        final  Node<E> newNode = new Node<>(null, e, f);
        first = newNode;
        if(f == null)
            last = newNode;
        else
            f.prev = newNode;
        size++;

    }

    private void linkLast(E e){
        final Node<E> l = last;
        final  Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if(l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;

    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }



    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }


    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }



    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }


    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
