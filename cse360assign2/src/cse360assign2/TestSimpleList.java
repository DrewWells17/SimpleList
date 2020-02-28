package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import cse360assign2.SimpleList;

class TestSimpleList {

	@Test
	void checkIfAddMethodCanAddTheFirstInteger()
	{
		SimpleList simpleList = new SimpleList();
		simpleList.add(5);
		assertNotNull(simpleList);		//Pass
		
	}
	
	@Test
	void GiveOneIntegerDetermineIfCountReturnsOne()
	{
		SimpleList simpleList = new SimpleList();
		simpleList.add(5);
		int x = simpleList.count();
		assertEquals(1, x);
	}
	
	@Test
	void GivenOneIntegerDetermineIfSearchReturnsTheCorrectIndex()
	{
		SimpleList simpleList = new SimpleList();
		simpleList.add(5);
		int x = simpleList.search(5);
		assertEquals(0, x);		//index should be zero
	}
	
	@Test
	void GivenOneIntegerDetermineIfSearchReturnsTheSameIndexAsBefore()
	{
		SimpleList simpleList = new SimpleList();
		simpleList.add(5);
		int x = simpleList.search(6);
		assertEquals(-1, x);
	}
	
	@Test
	void GivenOneIntegerDetermineIfToStringWorks()
	{
		SimpleList simpleList = new SimpleList();
		simpleList.add(5);
		String str1 = simpleList.toString();
		String str2 = "5";
		assertTrue(str1.contentEquals(str2));
	}
	
	@Test
	void GivenOneIntegerDetermineIfRemoveWork()
	{
		SimpleList simpleList = new SimpleList();
		simpleList.add(5);
		simpleList.add(6);
		simpleList.remove(5);
		int x = simpleList.count;
		assertEquals(x, 1);
	}
	
	@Test
	void GivenOneIntegerDetermineIfRemoveWorks()
	{
		SimpleList simpleList = new SimpleList();
		simpleList.add(5);
		simpleList.remove(5);
		int x = simpleList.count;
		assertEquals(x, 0);
	}
	
	@Test
	void GivenFullArrayObjectDetermineIfAddWorks()
	{
		SimpleList simpleList = new SimpleList();
		simpleList.add(0);
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		simpleList.add(4);
		simpleList.add(5);
		simpleList.add(6);
		simpleList.add(7);
		simpleList.add(8);
		simpleList.add(9);
		simpleList.add(10);
		int x = simpleList.search(10);		//Zero should be pushed from the array so it should return -1 when searched
		assertEquals(0, x);
	}
	
	@Test
	void GivenFullArrayObjectDetermineIfCountKeepsCount()
	{
		SimpleList simpleList = new SimpleList();
		simpleList.add(0);
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		simpleList.add(4);
		simpleList.add(5);
		simpleList.add(6);
		simpleList.add(7);
		simpleList.add(8);
		simpleList.add(9);
		int x = simpleList.count();
		assertEquals(10, x);
	}
	
	@Test
	void GivenFullArrayObjectDetermineIfSearchSearchesFullArray()
	{
		SimpleList simpleList = new SimpleList();
		simpleList.add(0);
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		simpleList.add(4);
		simpleList.add(5);
		simpleList.add(6);
		simpleList.add(7);
		simpleList.add(8);
		simpleList.add(9);
		int x = simpleList.search(10);
		assertEquals(-1, x);
	}
	
	@Test
	void GivenFullArrayDetermineIfToStringPrintsMultipleArgumentsWithSpace()
	{
		SimpleList simpleList = new SimpleList();
		simpleList.add(0);
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		simpleList.add(4);
		simpleList.add(5);
		simpleList.add(6);
		simpleList.add(7);
		simpleList.add(8);
		simpleList.add(9);
		String str1 = simpleList.toString();
		String str2 = "9 8 7 6 5 4 3 2 1 0";
		assertTrue(str1.contentEquals(str2));
	}
	
	@Test
	void CheckIfRemovesChangesCountWhenCalled()
	{
		SimpleList simpleList = new SimpleList();
		simpleList.add(0);
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		simpleList.remove(2);
		int x = simpleList.count();
		assertEquals(3, x);
	}
	
	@Test
	void CheckIfRemovesChangesToStringCorrectly()
	{
		SimpleList simpleList = new SimpleList();
		simpleList.add(0);
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		simpleList.add(4);
		simpleList.add(5);
		simpleList.add(6);
		simpleList.add(7);
		simpleList.add(8);
		simpleList.add(9);
		simpleList.remove(6);
		String str1 = simpleList.toString();
		String str2 = "9 8 7 5 4 3 2 1 0";
		assertTrue(str1.contentEquals(str2));
	}
	
	@Test
	void CheckIfAppendAddsIntegerForAFewElementsInTheArray()
	{
		SimpleList simpleList = new SimpleList();
		simpleList.add(5);
		simpleList.add(6);
		simpleList.append(10);
		String str1 = simpleList.toString();
		String str2 = "6 5 10";
		assertTrue(str1.contentEquals(str2));
		
	}
	
	@Test
	void CheckIfAppendAddsTheIntegerToTheEndOfAFullArray()
	{
		SimpleList simpleList = new SimpleList();
		simpleList.add(0);
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		simpleList.add(4);
		simpleList.add(5);
		simpleList.add(6);
		simpleList.add(7);
		simpleList.add(8);
		simpleList.add(9);
		simpleList.append(10);
		String str1 = simpleList.toString();
		String str2 = "9 8 7 6 5 4 3 2 1 0 10";
		assertTrue(str1.contentEquals(str2));
	}
	
	@Test
	void CheckIfFirstReturnsTheFirstInTheArray()
	{
		SimpleList simpleList = new SimpleList();
		simpleList.add(0);
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		simpleList.add(4);
		simpleList.add(5);
		simpleList.add(6);
		simpleList.add(7);
		int x = simpleList.first();
		assertEquals(x, 7);
	}
	
	@Test
	void CheckIfSizeReturnsTheCorretAmountOfSpaceInTheArray()
	{
		SimpleList simpleList = new SimpleList();
		simpleList.add(0);
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		simpleList.add(4);
		simpleList.add(5);
		simpleList.add(6);
		simpleList.add(7);
		int x = simpleList.size();
		assertEquals(x, 2);
	}

}


























