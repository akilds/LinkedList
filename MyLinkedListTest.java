import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

   //Test CASE 2
	@Test
	public void linkedListCheck()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) &&
				         myLinkedList.head.getNext().equals(mySecondNode) &&
				         myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}

   //TEST CASE 3
   @Test
	public void linkedListCheck1()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) &&
				         myLinkedList.head.getNext().equals(mySecondNode) &&
				         myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

   //TEST CASE 4
   @Test
	public void linkedListCheck2()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode,mySecondNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) &&
				         myLinkedList.head.getNext().equals(mySecondNode) &&
				         myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
}
