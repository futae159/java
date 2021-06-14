/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author FRANCIS
 */
class Node {

    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Day23 {

    static void levelOrder(Node root) {
        //Write your code here
        Node s;
        s = root;
        Queue<Node> myQueue = new LinkedList<Node>();
        myQueue.add(s);

        //not finished
        while (!myQueue.isEmpty()) {
            s = myQueue.poll();
            System.out.print(s.data + " ");
            if (s.left != null) {
                myQueue.add(s.left);
            }
            if (s.right != null) {
                myQueue.add(s.right);
            }

        }

    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }

}
