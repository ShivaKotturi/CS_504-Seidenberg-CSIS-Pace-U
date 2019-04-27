public class Node {

    private Node prev = null;
    private Node next = null;
    private String data = "";

    public Node() {

    }

    public Node(String data) {

        this.data = data;

    }

    public void setPrev(Node prev) {

        this.prev = prev;

    }

    public Node getPrev() {

        return prev;

    }

    public void setNext(Node next) {

        this.next = next;

    }

    public Node getNext() {

        return next;

    }

    public void setData(String data) {

        this.data = data;

    }

    public String getData() {

        return data;

    }

    public void clearNext() {

        next = null;

    }

}