/*Drew Wells
 * 1213541873
 * CSE360 Assignment01
 * This is the JUnit file that contains the tests for SimpleListTest.java 
 * 
 */

package cse360assign2;

/**
 * This is a SimpleList class that holds an integer array of size 10 and 
 * the count that as the number of integers in the array.
 *
 * @author drew wells
 *
 */

public class SimpleList
{
	int list[];
	int count = 0;
	
	/**
	 * Constructor method that creates an instance of the class with an empty array and count starts at 0.
	 */
	
	SimpleList()
	{
		list = new int[10];
		count = 0;
	}
	
	/**
	 * Add method that inserts an integer that is newInt into the first index of the array and shifts 
	 * other integers over if there are already some in the array.
	 * 
	 * @param newInt
	 */
	
	public void add(int newInt)
	{
		if (count == 0)
		{
			list[0] = newInt;
		}
		else 
		{
			for(int index = (count-1); index > 0; index--)
			{
				list[index] = list[index - 1];
			}
			list[0] = newInt;
		}
		if (count < 10)
		{
			count++;
		}
	}
	
	/**
	 * Remove class removes the specified integer that is intToRemove. The method takes the integer out
	 * and if necessary shifts the other elements of the array over.
	 * 
	 * @param intToRemove
	 */
	
	public void remove(int intToRemove)
	{
		for(int index1 = (count - 1); index1 > 0; index1--)
		{
			if(list[index1] == intToRemove)
			{
				int spot = index1;
				for(int index2 = spot; index2 < (count - 1); index2++)
				{
					list[index2] = list[index2 + 1];
				}
				count--;
			}
		}
		
	}
	
	/**
	 * Simple method that returns the number of elements in the array.
	 * 
	 * @return count
	 */
	
	public int count()
	{	
		return count;
	}
	
	/**
	 * toString method that prints the elements of the array with a space in between each element
	 * 
	 * @return str
	 */
	
	public String toString()
	{
		String str = "";
		if (count == 0)
		{
			return "Array is empty";
		}
		else
		{
			for(int index = 0; index < (count - 1); index ++)
					{
						str += list[index];
						str += " ";
					}
			str += list[count - 1];
		}
		return str;
	}
	
	/**
	 * Search method searches the array for the element searchInt and returns the index of the element that was searched
	 * or returns -1 if the element is not in the array.
	 * 
	 * @param searchInt
	 * @return indexToReturn
	 */
	
	public int search(int searchInt)
	{
		int indexToReturn = -1;
		for(int index = 0; index < count; index++ )
		{
			if (searchInt == list[index])
			{
				indexToReturn = index;
			}
		}
		return indexToReturn;
	}
}

















