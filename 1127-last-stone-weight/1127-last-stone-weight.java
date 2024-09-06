class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int s : stones) {
            maxHeap.offer(s);
        }

        while (!maxHeap.isEmpty()) {
            int first = maxHeap.poll();
            if (maxHeap.isEmpty())  return first;  //when only one stone left
            int second = maxHeap.poll();

            int balance = Math.abs(first - second);
            if (balance != 0) maxHeap.offer(balance);
        }

        return 0;
    }
}