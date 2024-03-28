package BinaryTree;

import ArraysProgram.SortAnArrayZerosOneTwo;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(6);
        root.right=new Node(7);
        root.left.left=new Node(8);
        root.left.right=new Node(9);
        root.right.left=new Node(10);
        root.right.right=new Node(11);
        //preOrderTraversal(root);
        //inorderTraversals(root);
       // postorderTraversals(root);
        //levelOrderTraversals(root);
       // System.out.println(countNode(root));
        System.out.println(SumOfNode(root));
    }
    public static void preOrderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"  ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);


    }
public static void inorderTraversals(Node root){
        if(root==null){
            return ;
        }
        inorderTraversals(root.left);
      System.out.println(root.data);
      inorderTraversals(root.right);
}
public static void postorderTraversals(Node root){
        if(root==null){
            return;
        }
        postorderTraversals(root.left);
        postorderTraversals(root.right);
    System.out.println(root.data);
}
public static void levelOrderTraversals(Node root){
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()){
        Node temp=q.remove();
        System.out.print(temp.data+" ");
        if(temp.left!=null){
            q.add(temp.left);

        }
        if(temp.right!=null){
            q.add(temp.right);
        }

    }
}
public  static int countNode(Node root){
        if(root==null){
            return 0;
        }
        int left=countNode(root.left);
        int right=countNode(root.right);
        return left+right+1;
}
    public  static int SumOfNode(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=countNode(root.left);
        int rightSum=countNode(root.right);
        return leftSum+rightSum+root.data;
    }
    


}
