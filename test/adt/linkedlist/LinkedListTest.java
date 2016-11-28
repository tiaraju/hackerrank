package adt.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import adt.linkedlist.LinkedList;
import adt.linkedlist.Node;

public class LinkedListTest {
	LinkedList<Integer> list;
	
	@Before
	public void setUp(){
		list = new LinkedList<Integer>();

	}
	@Test
	public void testCreate(){
		LinkedList<Integer> ll = new LinkedList<Integer>();
		Assert.assertTrue(ll != null);
	}
	@Test
	public void testInsert(){
		Assert.assertTrue(list.size() == 0);
		Node<Integer> node = new Node<Integer>(10);
		list.addNode(node);
		Assert.assertTrue(list.size() == 1);
	}
	
	@Test
	public void testToString(){
		String expected = "012";
		list.addNode(new Node<Integer>(0));
		list.addNode(new Node<Integer>(1));
		list.addNode(new Node<Integer>(2));
		Assert.assertEquals(list.toString(), expected);
	}

}
