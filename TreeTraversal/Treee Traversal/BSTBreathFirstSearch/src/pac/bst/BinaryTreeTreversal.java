package pac.bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTreversal {

    public Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        private Node(int value) {
            this.value = value;
        }
    }

	public Node getRoot() {
        return root;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

public ArrayList<Integer> BFS()
{   Node currentNode=root;
    ArrayList<Integer>list=new ArrayList<>();
    Queue<Node>q=new LinkedList<>();
    q.add(currentNode);
    while(q.size()>0)
    {
      currentNode=q.remove();
      list.add(currentNode.value);
      if(currentNode.left==null) {
    	  list.add(null);
      }
      if(currentNode.right==null) {
    	  list.add(null);
      }
      if(currentNode.left!=null)
      {
          q.add(currentNode.left);
      }
      
      if(currentNode.right!=null)
      {
           q.add(currentNode.right);
      } 
    }
    return list;
}


}
