package com.hin.bridge.bridge;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author chenjinfu
 * @since 2019/01/03
 */
public class LRU<K,V> {

    private int MAX_CACHE_SIZE;

    private final float DEFAULT_LOAD_FACTOR = 0.75f;

    LinkedHashMap<K,V> map ;

    public LRU(int cacheSize){
        MAX_CACHE_SIZE = cacheSize;
        int capacity = (int)Math.ceil(MAX_CACHE_SIZE/DEFAULT_LOAD_FACTOR)+1;
        map = new LinkedHashMap<K,V>(capacity,DEFAULT_LOAD_FACTOR,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > MAX_CACHE_SIZE;
            }
        };

    }

    public void put(K k, V v){
        this.map.put(k,v);
    }

    public V get(K k){
        return this.map.get(k);
    }

    public Set<Map.Entry<K,V>> getAllEntrys(){
        return this.map.entrySet();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<K,V> entry : getAllEntrys()){
            sb.append(String.format("%s:%s",entry.getKey(),entry.getValue())+"\t");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
           /* LRU<Integer, Integer> lru1 = new LRU<>(2);
            lru1.put(1, 1);
            lru1.put(2, 2);
            lru1.put(3, 3);
            System.out.println(lru1);
            System.out.println(lru1.get(1));

            System.out.println(lru1);
            lru1.put(4, 4);
            lru1.put(5, 5);
            lru1.put(6, 6);
            System.out.println(lru1);*/

        LRU<Integer, Integer> cache = new LRU<>(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1)); // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        System.out.println(cache.get(2));       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        cache.get(1);       // 返回 -1 (未找到)
        cache.get(3);       // 返回  3
        cache.get(4);       // 返回  4

        cache.get(5); //返回-1
    }
}
