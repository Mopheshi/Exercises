class Node:
    def __init__(self, val=None, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def preorder(root):
    if not root:
        return
    print(root.val)
    preorder(root.left)
    preorder(root.right)


def inorder(root):
    if not root:
        return
    inorder(root.left)
    print(root.val)
    inorder(root.right)


def postorder(root):
    if not root:
        return
    postorder(root.left)
    postorder(root.right)
    print(root.val)


"""
Here, we first define a Node class to represent each node of the binary tree. The class has a value (val), as well as
left and right child nodes.

Next, we define three separate functions for preorder, inorder, and postorder traversal. Each function takes the root
of the binary tree as input.

In the preorder function, we first print the value of the root node, then recursively call the function on the left and
right child nodes.

In the inorder function, we first recursively call the function on the left child node, then print the value of the root
node, and finally recursively call the function on the right child node.

In the postorder function, we first recursively call the function on the left and right child nodes, and then print the
value of the root node.
"""

root = Node(1, Node(2, Node(4), Node(5)), Node(3, Node(6), Node(7)))

print("Preorder traversal:")
preorder(root)

print("Inorder traversal:")
inorder(root)

print("Postorder traversal:")
postorder(root)
