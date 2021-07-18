# Stacks and Queues
A stack is an abstract data type that holds an ordered, linear sequence of items.(First in last out)

A Queue is a linear structure which follows a particular order in which the operations are performed.( First In First Out (FIFO))

## Challenge
In this code challenge we need to create some methods that help to create stack and queue
and add elements to them or delete elements

## Approach & Efficiency
Stack Space and time O(1), We always have a pointer to the top element, we add or delete from top.

Queue Space and time O(1), We usually have a pointer to the first and last element of the queue.


## API
Stack Class:

push():add elements to stack.

pop():delete elements from stack.

peek():return the top element in stack.

isEmpty():check if stack empty.


<br><br>
Queue Class:

enqueue():add elements to Queue.

dequeue():delete elements from Queue.

peek():return the top element in Queue.

isEmpty():check if Queue empty.