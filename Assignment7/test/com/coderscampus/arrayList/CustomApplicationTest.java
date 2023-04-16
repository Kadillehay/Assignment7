package com.coderscampus.arrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CustomApplicationTest {
	Object[] items = new Object[10];
	int counter = 0;

	@Test
	void should_add_item_to_list() {
		CustomArrayList<String> sut = new CustomArrayList<>();
		sut.add("testString");
//		System.out.println(sut.get(0));
		assertEquals("testString", sut.get(0));
//		System.out.println("-----");
	}

	@Test
	void should_add_30_items_to_list() {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		for (int i = 1; i <= 30; i++) {
			sut.add(i);
//			System.out.println(i);
		}
		assertEquals(30, sut.getSize());
	}

	@Test
	void should_return_size_of_customArrayList() {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		for (int i = 1; i <= 38; i++) {
			sut.add(i);
		
//			System.out.println(i);
		}

//		System.out.println("-------");
//		System.out.println(sut.getSize());
//		System.out.println("-------");
		assertEquals (38, sut.getSize());
	}
	@Test
	void should_add_item_at_specified_index() {
		CustomArrayList<String> sut = new CustomArrayList<>();
		sut.add(0, "blue");
		sut.add(1, "red");
		sut.add(2, "yellow");
		sut.add(3, "green");
		sut.add(4, "purple");
		sut.add(5, "grey");
		sut.add(6, "white");
		sut.add(3, "magenta");
		sut.add(7, "periwinkle");
		sut.add(9, "lavender");
		sut.add(9, "mauve");
		sut.add(8, "red");
		sut.add(11, "orange");
		
		assertEquals("magenta", sut.get(3));
		assertEquals("orange", sut.get(11));
		

	}


	@Test
	void should_remove_item_from_customArrayList() {
		var sut = new CustomArrayList<>();

		sut.add(1);
		sut.add(2);
		sut.add(3);
		sut.add(4);
		sut.add(5);
		sut.add(6);
		sut.remove(2);
//		System.out.println(sut);
		assertEquals(5, sut.getSize());
	}
	
	@Test
	void should_remove_last_item_from_customArrayList() {
		var sut = new CustomArrayList<>();
//		for (int i = 1; i <= 11; i++) {
//			sut.add(i);
//		}
		sut.add(9);
		sut.add(9);
		sut.add(9);
		sut.add(9);
		sut.add(9);
		sut.add(9);
		sut.remove(5);
		System.out.println(sut);
		assertEquals(5, sut.getSize());
	}
	
	@Test
	void should_return_size_of_array() {
		CustomArrayList<String> sut = new CustomArrayList<>();
		sut.add(0, "blue");
		sut.add(1, "red");
		sut.add(2, "yellow");
		sut.add(3, "green");
		sut.add(4, "purple");
		sut.add(5, "grey");
		sut.add(6, "white");
		sut.add(3, "magenta");
		sut.add(7, "periwinkle");
		sut.add(9, "lavender");
		sut.add(9, "mauve");
		sut.add(8, "red");
		sut.add(11, "orange");
	
		System.out.println(sut.getSize());
		assertEquals(13, sut.getSize());
		
	}
	@Test
	void should_remove_item_from_beginning_of_list() {
		CustomArrayList<String> sut = new CustomArrayList<>();
		sut.add(0, "blue");
		sut.add(1, "red");
		sut.add(2, "yellow");
		sut.add(3, "green");
		sut.add(4, "purple");
		sut.add(5, "grey");
		sut.add(6, "white");
		sut.add(3, "magenta");
		sut.add(7, "periwinkle");
		sut.add(9, "lavender");
		sut.add(9, "mauve");
		sut.add(8, "red");
		sut.add(11, "orange");
		sut.remove(0);
//		System.out.println(sut.get(0));
		assertEquals("red",sut.get(0));
		
	}
}
