package com.company;

import java.io.OutputStream;
import java.util.ArrayList;

public class NiceQueue<E> {
    private ArrayList<E> m_queue ;

    public NiceQueue (int size)
    {
        m_queue = new ArrayList<>();
    }

    public void enqueu (E i) {
        m_queue.add(i);
        if (m_queue.size() > 20) {
            System.out.print("queue if full");
        }
    }
    public E dequeu ()
    {
        E first_item = m_queue.get(0);
        m_queue.remove(0);
        return first_item;
    }
    public E peek()
    {
        if (m_queue.size() == 0)
        {
            return null;
        }
        return m_queue.get(0);
    }
    public void clear()
    {
        m_queue.clear();
    }
    public int count()
    {
        return m_queue.size();
    }
    public E next ()
    {
        E first_item = m_queue.get(0);
        return first_item;
    }
}
