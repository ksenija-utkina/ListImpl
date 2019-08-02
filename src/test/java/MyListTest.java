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
		List<String> myList = new MyList<>();
		myList.add("1");
		myList.add("2");
		assertEquals(2, myList.size());
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

}