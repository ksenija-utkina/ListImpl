import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {

	@Test
	void whenIterator_thenThrowException() {
		List<String> myList = new MyList<>();
		assertThrows(UnsupportedOperationException.class, myList::iterator);
		assertThrows(UnsupportedOperationException.class, myList::listIterator);
		assertThrows(UnsupportedOperationException.class, () -> myList.listIterator(1));
	}

	@Test
	void givenListWithTwoElements_whenSize_thenTwoReturned() {
		List<String> list = new MyList<>();
		list.add("1");
		list.add("1");
		assertEquals(2, list.size());
	}

	@Test
	void givenNonEmptyList_whenIsEmpty_thenFalseIsReturned() {
		List<Object> list = new MyList<>();
		list.add(null);
		assertFalse(list.isEmpty());
	}

	@Test
	void givenEmptyList_whenIsEmpty_thenTrueIsReturned() {
		List<Object> list = new MyList<>();
		assertTrue(list.isEmpty());
	}

	@Test
	void givenListWithAnElement_whenAnotherIsAdded_thenGetReturnsBoth() {
		List<Object> list = new MyList<>();
		list.add("first");
		list.add("second");
		Object element1 = list.get(0);
		Object element2 = list.get(1);

		assertEquals("first", element1);
		assertEquals("second", element2);
	}

	@Test
	void givenListWithAnElement_whenContains_thenTrueIsReturned() {
		List<Integer> list = new MyList<>();
		list.add(1);
		assertTrue(list.contains(1));
	}

	@Test
	void givenListWithoutAnElement_whenContains_thenFalseIsReturned() {
		List<Long> list = new MyList<>();
		list.add(1L);
		list.add(2L);
		list.add(4L);
		assertFalse(list.contains(0L));
	}

	@Test
	void givenListWithUser_whenContainsWithSameUserId_thenTrueIsReturned() {
		List<User> list = new MyList<>();
		User user = new User(1L, "user", "user@mail.com");
		User user2 = new User(1L, "user", "other@mail.com");
		list.add(user);

		assertTrue(list.contains(user2));
	}

	@Test
	void givenListWithUser_whenContainsWithDifferentUserId_thenFalseIsReturned() {
		List<User> list = new MyList<>();
		User user = new User(1L, "user", "user@mail.com");
		User user2 = new User(2L, "other user", "user@mail.com");
		list.add(user);

		assertFalse(list.contains(user2));
	}

	@Test
	void givenEmptyList_whenToArray_thenEmptyArrayIsReturned() {
		List<Object> list = new MyList<>();
		Object[] array = list.toArray();
		assertEquals(0, array.length);
	}

	@Test
	void givenList_whenToArray_thenArrayReturnedInRightOrder() {
		List<String> list = new MyList<>();
		list.add("1");
		list.add("2");
		Object[] array = list.toArray();
		assertEquals(2, array.length);
		assertEquals("1", array[0]);
		assertEquals("2", array[1]);
	}

	@Test
	void givenList_whenGenericToArrayWithoutCapacity_thenArrayReturnedInRightOrder() {
		List<String> list = new MyList<>();
		list.add("1");
		list.add("2");
		String[] array = list.toArray(new String[]{});

		assertEquals(2, array.length);
		assertEquals("1", array[0]);
		assertEquals("2", array[1]);
	}

	@Test
	void givenList_whenGenericToArray_thenArrayReturnedInRightOrder() {
		List<String> list = new MyList<>();
		list.add("1");
		list.add("2");
		String[] array = list.toArray(new String[2]);

		assertEquals(2, array.length);
		assertEquals("1", array[0]);
		assertEquals("2", array[1]);
	}

	@Test
	void givenList_whenAdd_thenTrueIsReturned() {
		List<String> list = new MyList<>();
		assertTrue(list.add("1"));
	}

	@Test
	void givenListWithAnElement_whenRemove_thenTrueIsReturned() {
		List<String> list = new MyList<>();
		list.add("1");
		assertTrue(list.remove("1"));
	}

	@Test
	void givenListWithoutAnElement_whenRemove_thenFalseIsReturned() {
		List<Long> list = new MyList<>();
		list.add(2L);
		assertFalse(list.remove(0L));
	}

	@Test
	void givenListWithAnElements_whenContainsAll_thenTrueIsReturned() {
		List<Long> list = new MyList<>();
		list.addAll(Arrays.asList(0L, 2L));
		list.add(1L);
		assertTrue(list.containsAll(Arrays.asList(0L, 1L)));
	}

	@Test
	void givenListWithOnlyOneElement_whenContainsAll_thenFalseIsReturned() {
		List<String> list = new MyList<>();
		list.add("0");
		list.add("2");
		assertFalse(list.containsAll(Arrays.asList("0", "1")));
	}

	@Test
	void givenEmptyList_whenContainsAll_thenFalseIsReturned() {
		List<Long> list = new MyList<>();
		assertFalse(list.containsAll(Arrays.asList(0L, 1L)));
	}

	@Test
	void givenList_whenAddAll_thenSizeIsCorrect() {
		List<Integer> list = new MyList<>();
		list.addAll(Arrays.asList(1, 2, 3));
		assertEquals(3, list.size());
		assertTrue(list.containsAll(Arrays.asList(1, 2, 3)));
	}

}