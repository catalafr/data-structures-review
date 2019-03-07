package design;

import java.util.*;


public class LRUCache {

    private int capacity;
    private int numOfElements;
    private Deque<Integer> timer;
    private Map<Integer, Integer> data;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.numOfElements = 0;
        this.data = new Hashtable<>(capacity);
        this.timer = new ArrayDeque<>(capacity);
    }

    /**
     * Using queue, check oldest element, remove it from data, remove it from cache.
     *
     * @param k
     * @return
     */
    public int get(int k) {
        if (this.data.containsKey(k)) {
            this.timer.removeFirstOccurrence(k);
            this.timer.offer(k);
            return this.data.get(k);
        }
        else
            return -1;
    }


    public void put(int k, int v){
        /**
         * Check if it is full,
         * if so, remove the oldest element.
         */
        if(this.capacity == numOfElements && !this.data.containsKey(k)){
            int oldest = this.timer.getFirst();
            this.timer.remove(oldest);
            this.data.remove(oldest);
            this.numOfElements--;
        }

        /**
         * Check if the key is already in there, if so renew the timestamp.
         */
        if(this.data.containsKey(k)){
                this.timer.remove(k); //Remove it from its position, place it back at the back.
                this.timer.offer(k);
                this.data.remove(k);
                this.data.put(k,v);
        }
        //New entry.
        else {
            this.timer.offer(k);
            this.data.put(k,v);
            this.numOfElements++;
        }
    }
}
