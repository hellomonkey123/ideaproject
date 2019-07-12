package com.jvm.test;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 代码实现了一个栈（先进后出（FILO））结构，乍看之下似乎没有什么明显的问题，
 * 它甚至可以通过你编写的各种单元测试。然而其中的pop方法却存在内存泄露的问题，
 * 当我们用pop方法弹出栈中的对象时，该对象不会被当作垃圾回收，即使使用栈的程序
 * 不再引用这些对象，因为栈内部维护着对这些对象的过期引用（obsolete reference）
 * 。在支持垃圾回收的语言中，内存泄露是很隐蔽的，这种内存泄露其实就是无意识的对
 * 象保持。如果一个对象引用被无意识的保留起来了，那么垃圾回收器不会处理这个对象，
 * 也不会处理该对象引用的其他对象，即使这样的对象只有少数几个，也可能会导致很多
 * 的对象被排除在垃圾回收之外，从而对性能造成重大影响，极端情况下会引发
 * Disk Paging（物理内存与硬盘的虚拟内存交换数据），甚至造成OutOfMemoryError。
 *
 *
 * @param <T>
 */
public class MyStack<T> {
    private T[] elements;
    private int size = 0;

    private static final int INIT_CAPACITY = 16;

    public MyStack(){
        elements = (T[]) new Object[INIT_CAPACITY];
    }

    public void push(T elem){
        ensureCapacity();
        elements[size++] = elem;
    }

    public T pop(){
        if (size == 0){
            throw new EmptyStackException();
        }
        return elements[--size];
    }

    private void ensureCapacity(){
        if (elements.length == size){
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
