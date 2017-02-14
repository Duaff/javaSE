package map;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class TestMap<K, V> extends AbstractMap<K, V> {
	private List<K> keys = new ArrayList<K>();
	private List<V> values = new ArrayList<V>();

	public V put(K key, V value){
		V oldValue = get(key);
		if(keys.contains(key)){
			values.set(keys.indexOf(key), value);
		}else {
			keys.add(key);
			values.add(value);
		}
		return oldValue;
	}
	
	public V get(Object key){
		if(keys.contains(key)){
			return values.get(keys.indexOf(key));
		}else {
			return null;
		}
	}

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K,V>>();
		Iterator<K> ki = keys.iterator();
		Iterator<V> vi = values.iterator();
		while(ki.hasNext()){
			set.add(new MapEntry<K,V>(ki.next(), vi.next()));
		}
		return set;
	}
	
	public static void main(String[] args) {
		TestMap<String, String> map = new TestMap<String, String>();
		map.put("Duff", "18");map.put("Dest", "100");map.put("King", "50");
//		System.out.println(map);
//		System.out.println(map.get("Duff"));
//		System.out.println(map.entrySet());
		System.out.println(Math.abs(-1));
	}
}
