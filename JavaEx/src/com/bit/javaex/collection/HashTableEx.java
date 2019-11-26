package com.bit.javaex.collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableEx {
	//hashtable은 키 -값의 쌍
	// 키를 기반으로 값을 검색(Hash 계열)
	public static void main(String[] args) {
		Map<String, ClassRoom> map = new Hashtable<>();
		
		// 맵에 데이터 넣기
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("201", new ClassRoom("C", "R201"));
		map.put("301", new ClassRoom("Python", "R301"));
		map.put("201", new ClassRoom("C++", "R201"));
		//키 중복은 허용하지 않고 나중에 put한 객체가 value로 사용
		
		System.out.println("Map:" + map);
		
		//키가 있는지 확인 : containsKey
		System.out.println("KEY 101:" + map.get("101"));
		System.out.println("KEY 501:" + map.get("501")); //null
		
		//키로 값에 접급
		ClassRoom c = map.get("101");
		System.out.println("101 강의실:" +c);
		
		//값이 있는지 확인 : containsValue
		//값중에 Java강의실이 있는지 확인
		System.out.println("containsValue:" + map.containsValue(new ClassRoom("Java")));
		
		//Hash Table의 키 목록은 HashSet
		// Hashtable 내의 키 SET 반환받은 후, iterator를 받을 수 있다
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			ClassRoom room = map.get(key);
			System.out.println("ROOM(it)" + room);
			
		}
		
		map.clear();
		System.out.println("MAP:" +map);
	}

}
