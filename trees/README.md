# Trees
A tree is a nonlinear data structure, compared to arrays, linked lists, stacks and queues which are linear data structures. A tree can be empty with no nodes or a tree is a structure consisting of one node called the root and zero or one or more subtrees.

## Challenge
We need to use our knowledge to create binary tree and binary search tree and how to insert in and search inside it.

## white Boards
Tree Max:

![](C:\Users\User\IdeaProjects\401-data-structures-and-algorithms\trees\img\c16.png)

## Approach & Efficiency
Binary tree and binary search tree: O(n) Where n is the number of nodes on one side of root.<br>
Find Max : Time O(n) because will walk through each node / Space : O(n) because use recursion.

## API
inOrder(): Traverse the left subtree, root, Traverse the right subtree.<br>
postOrder(): Traverse the left subtree,Traverse the right subtree, root.<br>
preOrder(): Root, Traverse the left subtree,Traverse the right subtree.<br>

add(): Add new node to the tree.<br>
traverse(): check the value from add() to put it in the right place.<br>
search(): search if the key inside the tree or not return boolean.<br>

findMax() : Search for the maximum number in tree.