package com.neetcode.solutions.stack;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/implement-stack-using-queues/
public class StackUsingQueue {

  Queue<Integer> queue;

  public StackUsingQueue() {
    queue = new LinkedList<Integer>();
  }

  public void push(int x) {
    queue.add(x);
    for (int i = 0; i < queue.size() - 1; i++) {
      queue.add(queue.poll());
    }
  }

  public int pop() {
    return queue.poll();
  }

  public int top() {
    return queue.peek();
  }

  public boolean empty() {
    return queue.size() == 0;
  }

}
