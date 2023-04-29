package problem_2659;

import java.util.Arrays;

class Solution {

    static class CircleArray {

        static class Node {
            int value;
            Node next;
            Node prev;
            Node(int value) {
                this.value = value;
            }
        }

        int size;
        Node first;

        CircleArray(int[] nums) {
            size = nums.length;
            first = new Node(nums[0]);
            Node now = first;
            for (int i = 1; i < nums.length; i++) {
                now.next = new Node(nums[i]);
                now.next.prev = now;
                now = now.next;
            }
            now.next = first;
            first.prev = now;
        }

        public Node remove(Node node) {
            if (size == 1) {
                first = null;
            } else {
                Node previous = node.prev;
                Node next = node.next;
                if (previous == next) {
                    next.next = next;
                    next.prev = next;
                } else {
                    previous.next = next;
                    next.prev = previous;
                }
                first = next;
            }
            size--;
            return first;
        }
    }
    public long countOperationsToEmptyArray(int[] nums) {
        int[] sorted = Arrays.stream(nums).sorted().toArray();
        CircleArray circleArray = new CircleArray(nums);
        long res = nums.length;

        CircleArray.Node right = circleArray.first;
        CircleArray.Node left = circleArray.first;

        for (int min : sorted) {
            long count = 0;

            while (min != right.value && min != left.value) {
                right = right.next;
                left = left.prev;
                count++;
            }
            if (min == right.value) {
                res += count;
                right = circleArray.remove(right);
                left = right;
            } else {
                res += circleArray.size - count;
                right = circleArray.remove(left);
                left = right;
            }
        }
        return res;
    }
}
