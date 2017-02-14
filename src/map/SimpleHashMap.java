package map;


import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

public class SimpleHashMap<K, V> extends AbstractMap<K, V> {

	static final int SIZE = 997;
	@SuppressWarnings("unchecked")
	LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];
	
	public V put(K key, V value){
		V oldValue = null;
		int index = Math.abs(key.hashCode()) % SIZE;
		if(buckets[index] == null)
			buckets[index] = new LinkedList<MapEntry<K,V>>();
		LinkedList<MapEntry<K, V>> bucket = buckets[index];
		MapEntry<K, V> pair = new MapEntry<K, V>(key, value);
		boolean found = false;
		ListIterator<MapEntry<K, V>> it = bucket.listIterator();
		while(it.hasNext()){
			MapEntry<K, V> iPair = it.next();
			if(iPair.getKey().equals(key)){
				oldValue = iPair.getValue();
				it.set(pair);
				found = true;
				break;
			}
		}
		if(!found){
			buckets[index].add(pair);
		}
		return oldValue;
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		return null;
	}

	public V getValue(K key){
		int index = Math.abs(key.hashCode()) % SIZE;
		if(buckets[index]==null) return null;
		for (MapEntry<K, V> iPair : buckets[index]) {
			if(iPair.getKey().equals(key)){
				return iPair.getValue();
			}
		}
		return null;
	}


	public static void main(String[] args) {
		SimpleHashMap<String, String> map = new SimpleHashMap<String, String>();
		map.put("1", "Duff");map.put("2", "David");map.put("3", "Lili");
		System.out.println(map.getValue("1"));
		
	}
}
