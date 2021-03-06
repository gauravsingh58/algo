package page24.q2312;

import java.util.Scanner;

public class Main {

  static class Node {
    Node left, right;
    int data;

    public Node(int data) {
      left = null;
      right = null;
      this.data = data;
    }
  }

  static class BST {
    Node root = null;

    public void add(int data) {
      if(root == null) root = new Node(data);
      else if(root.data != data) add(root, data);
    }

    private void add(Node n, int data) {
      if(n.data > data)
        if(n.left == null) n.left = new Node(data);
        else add(n.left, data);
      else if(n.data < data)
        if(n.right == null) n.right = new Node(data);
        else add(n.right, data);
    }

    public int getHeight() {
      return height(root);
    }

    private int height(Node n) {
      if(n == null) return 0;
      return Math.max(height(n.left), height(n.right)) + 1;
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    BST bst = new BST();int n;
    while((n=in.nextInt()) != 0) {
      bst.add(n);
    }
    System.out.println(bst.getHeight());
  }

}
