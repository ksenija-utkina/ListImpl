import org.junit.jupiter.api.Test;

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

}