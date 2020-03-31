/**
 * Coursera - Algorithms Part I
 * Week 2 - Interview Questions - Stacks and Queues
 *
 * Question 1: Queue with two stacks
 *
 * Implement a queue with two stacks so that each queue operations takes a
 * constant amortized number of stack operations.
 */

/**
 * Solution:
 *
 * Use one stack for keeping track of elements queued up and another for
 * tracking elements to be dequeued. When the dequeue stack if empty, the
 * elements from the enqueue stack are popped and pushed into the dequeue
 * stack. This operation reverses the order of elements so they are in FIFO.'
 * 
 * Reference: https://github.com/eschwabe/interview-practice/blob/master/coursera/algorithms-part1/stacks-and-queues/StackQueue.java
 */

import java.util.Stack;

class StackQueue<Item> {

	// Create 2 Stacks
	private Stack<Item> input = new Stack<Item>();
	private Stack<Item> output = new Stack<Item>();

	// return size of 2 stacks
	public int size() {
		return input.size() + output.size();
	}

	// Check whether stack is empty or not.
	public boolean isEmpty() {
		return (size() == 0);
	}

	public void enqueue(Item item) {
		input.push(item);
	}

	public Item dequeue() {
		if (output.isEmpty()) {
			while (!input.isEmpty()) {
				output.push(input.pop());
			}
		}
		return output.pop();
	}

	// Main checking
	public static void main(String[] args) {
		StackQueue<Integer> squeue = new StackQueue<Integer>();
		int i = 0;
		int N = 10;
		System.out.println("Size: " + squeue.size());
	    //Enqueue check: insert elements
		for (i=0;i<N;i++)
		{
			squeue.enqueue(i);
			System.out.println("Enqueue: " + i);
		}
		System.out.println("Size: " + squeue.size());
		
		
	    //Dequeue check: remove elements
		for (i=0;i<N;i++)
		{
			System.out.println("Dequeue: " + squeue.dequeue());
		}
		System.out.println("Size: " + squeue.size());
		
				
	}

}