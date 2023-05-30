package daily.may.problem_705;

class MyHashSet {

    static class Node {
        int key;
        Node next;
        Node (int key) { this.key = key; }
    }

    int cap;
    Node[] nodes;
    int size;

    public MyHashSet() {
        cap = 10000;
        nodes = new Node[cap];
        size = 0;
    }

    public void add(int key) {
        putVal(hash(key), key);
    }

    public void remove(int key) {
        removeNode(hash(key), key);
    }

    public boolean contains(int key) {
        return getNode(key) != null;
    }

    Node getNode(int key) {
        int ind = hash(key) % (nodes.length - 1);
        Node first = nodes[ind];
        if (first != null) {
            if (first.key == key) return first;
            Node node = first.next;
            while (node != null) {
                if (node.key == key) return node;
                node = node.next;
            }
        }
        return null;
    }

    final void removeNode(int hash, int key) {
        int ind = hash % (nodes.length - 1);
        Node first = nodes[ind];
        if (first != null) {
            Node found = null;
            Node node = first;
            if (first.key == key)
                found = first;
            else {
                while (node.next != null) {
                    if (node.next.key == key) {
                        found = node.next;
                        break;
                    }
                    node = node.next;
                }
            }
            if (found != null) {
                if (found == first)
                    nodes[ind] = found.next;
                else
                    node.next = found.next;
                --size;
            }
        }
    }

    void putVal(int hash, int key) {
        int ind = hash % (nodes.length - 1);
        Node node = nodes[ind];
        if (node == null) {
            //insert
            nodes[ind] = new Node(key);
            size++;
        } else {
            if (node.key != key) {
                while (true) {
                    Node next = node.next;
                    if (next == null) {
                        //insert
                        node.next = new Node(key);
                        size++;
                        return;
                    }
                    if (next.key == key) {
                        //already exist
                        return;
                    }
                    node = next;
                }
            }
        }
    }

    int hash(Integer key) {
        return key.hashCode();
    }
}
