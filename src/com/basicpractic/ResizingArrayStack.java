package com.basicpractic;

import com.sun.xml.internal.fastinfoset.stax.events.ReadIterator;

import java.util.Iterator;

/**
 * @program: ResizingArrayStack
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/2
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {

    //可以看到通过泛型替换成任意的数据类型
    private Item[] a = (Item[]) new Object[1];
    private int N = 0;

    public boolean isEmpty(){
        return  N == 0;
    }

    public int size(){
        return N;
    }

    private void resize(int max){
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++){
            temp[i] = a[i];
        }
        a = temp;
    }

    public void push(Item item){
        if (N == a.length) resize(2 * a.length);
        a[N++] = item;
    }

    public Item pop(){
        Item item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length/4) resize(a.length/2);
        return item;
    }


    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }

        @Override
        public void remove() {

        }
    }
}
