// Java program to implement HashMap API

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class HashMapImplementation<K, V> {
    private HashMap<K, V> hashMap;

    // Constructs an empty HashMap with the default initial
    // capacity (16) and the default load factor (0.75).

    public HashMapImplementation()
    {
        hashMap = new HashMap<K, V>();
    }

    // Constructs an empty HashMap with the specified
    // initial capacity and the default load factor (0.75).

    public HashMapImplementation(int initialCapacity)
    {
        hashMap = new HashMap<K, V>(initialCapacity);
    }

    // Constructs an empty HashMap with the specified
    // initial capacity and load factor.

    public HashMapImplementation(int initialCapacity,
                                 float loadFactor)
    {
        hashMap = new HashMap<K, V>(initialCapacity,
                loadFactor);
    }

    // Constructs a new HashMap with the same mappings as
    // the specified Map.
    public HashMapImplementation(Map<? extends K, ? extends V> m)
    {
        hashMap = new HashMap<K, V>(m);
    }

    // Removes all of the mappings from this map.
    public void clear() { hashMap.clear(); }

    // Returns a shallow copy of this HashMap instance: the
    // keys and values
    // themselves are not cloned.

    public Object clone() { return hashMap.clone(); }

    // return true if map contains given key
    public boolean containsKey(Object key)
    {
        return hashMap.containsKey(key);
    }

    // Returns true if this map maps one or more keys to the
    // specified value.
    public boolean containsValue(Object value)
    {
        return hashMap.containsValue(value);
    }

    // Returns a Set view of the mappings contained in this
    // map.
    public Set<Map.Entry<K, V> > entrySet()
    {
        return hashMap.entrySet();
    }

    // return the value for which the key is mapped , if key
    // is not mapped with any value then it will return null
    public V get(Object key) { return hashMap.get(key); }

    // return true if hashmap is empty else false
    public boolean isEmpty() { return hashMap.isEmpty(); }

    // Returns a Set view of the keys contained in this map.
    public Set<K> keySet() { return hashMap.keySet(); }

    // map the key with value
    public V put(K key, V value)
    {
        return hashMap.put(key, value);
    }

    // copy all the mapping to this map
    public void putAll(Map<? extends K, ? extends V> m)
    {
        hashMap.putAll(m);
    }

    // remove the mapping of given key
    public V remove(Object key)
    {
        return hashMap.remove(key);
    }

    // returns the size of map(number of key )
    public int size() { return hashMap.size(); }

    // Returns a Collection view of the values contained in
    // this map.
    public Collection<V> values()
    {
        return hashMap.values();
    }
}

class hashMapImplement {

    public static void main(String arg[])
    {
        HashMapImplementation<Integer, String> hashMap
                = new HashMapImplementation<Integer, String>();

        hashMap.put(1, "John");
        hashMap.put(2, "Philips");
        hashMap.put(3, "James");

        Map<Integer, String> secondMap = new HashMap<Integer, String>();

        secondMap.put(4, "Jack");
        secondMap.put(5, "Mike");

        hashMap.putAll(secondMap);

        System.out.println("the key set of the map is ");

        Set<Integer> keySet = hashMap.keySet();

        Iterator<Integer> itr = keySet.iterator();

        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();

        System.out.println("the values of the map is ");

        Iterator<String> itr1;

        Collection<String> collectionValues = hashMap.values();

        itr1 = collectionValues.iterator();

        while (itr1.hasNext())
        {
            System.out.print(itr1.next() + "\t");
        }
        System.out.println();

        System.out.println("the entry set of the map is ");

        Iterator<Entry<Integer, String> > eitr;

        Set<Entry<Integer, String> > entrySet = hashMap.entrySet();
        eitr = entrySet.iterator();

        while (eitr.hasNext())
        {
            System.out.println(eitr.next() + "\t");
        }

        System.out.println("the hash Map contains Key 3 :"
                + hashMap.containsKey(3));

        System.out.println("the hash Map contains Value Bucky :"
                + hashMap.containsValue("Bucky"));

        System.out.println("the size of the hash Map is "
                + hashMap.size());
        hashMap.clear();

        if (hashMap.isEmpty())
            System.out.println("the hash Map is empty");
        else
            System.out.println("the hash Map is not empty");
    }
}
