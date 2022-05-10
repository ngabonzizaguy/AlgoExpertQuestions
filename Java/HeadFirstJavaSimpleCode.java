import java.util.*;

class Node {
    Node next;
    int data;
    public Node(int data) {
        this.data = data;
    }
}

public class HeadFirstJavaSimpleCode {
    public static void main(String[] args) {
        Node n1 = new Node(5);
        System.out.println(n1.data);
    }
}