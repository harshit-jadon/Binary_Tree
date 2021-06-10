package com.bridgelabz.binarytree;

public class MyBinaryTree<K extends Comparable<K>> {
   MyBinaryNode<K> root = null;

   public MyBinaryNode<K> add(MyBinaryNode<K> rootNode, K key) {
      if (rootNode == null)
         return new MyBinaryNode<K>(key);

      int result = rootNode.key.compareTo(key);

      if (result == 0)
         return rootNode;

      if (result > 0)
         rootNode.left = add(rootNode.left, key);
      else
         rootNode.right = add(rootNode.right, key);
      return rootNode;



   }
   public void addNodes(K key) {
      this.root = add(root, key);
   }
   public int getSize() {
      return size(this.root);
   }

   public int size(MyBinaryNode<K> rootNode) {
      if (rootNode == null)
         return 0;
      return 1 + size(rootNode.left) + size(rootNode.right);
   }

}
