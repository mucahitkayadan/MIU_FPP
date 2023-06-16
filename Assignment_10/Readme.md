# Answer 1
` 50, 10, 8, 5, 9, 30, 26, 31, 150, 100, 79, 126, 152, 151, 180 `
# Answer 2
` 5, 8, 9, 10, 26, 30, 31, 50, 79, 100, 126, 150, 151, 152, 180 `
# Answer 3
` 5, 9, 8, 26, 31, 30, 10, 79, 126, 100, 180, 151, 152, 150, 50 `
# Answer 4
I implemented the code as follows:
```java
        BinarySearchTree homeWork = new BinarySearchTree();
        homeWork.root = homeWork.new TreeNode(6);
        homeWork.root.left = homeWork.new TreeNode(3);
        homeWork.root.left.left = homeWork.new TreeNode(1);
        homeWork.root.left.right = homeWork.new TreeNode(4);
        homeWork.root.right = homeWork.new TreeNode(9);
        homeWork.root.right.left = homeWork.new TreeNode(6);
        homeWork.root.right.right = homeWork.new TreeNode(10);
        homeWork.deleteNode(bst.root, 9);
```
## inOrderTraversal(6); //root is 6
``` Runtime Stack
InOrderTraversal(6);  
InOrderTraversal(3);
InOrderTraversal(1); 
InOrderTraversal(null); 
InOrderTraversal(null);
InOrderTraversal(4);
InOrderTraversal(null); 
InOrderTraversal(null);
InOrderTraversal(9); 
InOrderTraversal(6);
InOrderTraversal(null); 
InOrderTraversal(null);
InOrderTraversal(10);
InOrderTraversal(null); 
InOrderTraversal(null); 
```

## deleteNode(6, 9); 
```
deleteNode(6, 9);
deleteNode(9, 9);
findSuccessor(9);
deleteNode(10, 10);

```
