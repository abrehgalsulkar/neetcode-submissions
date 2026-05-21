class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> maxHeap2 = new PriorityQueue<>( (a, b) -> Long.compare(1L*b[0]*b[0] + 1L*b[1]*b[1], 1L*a[0]*a[0] + 1L*a[1]*a[1]));

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];

            if(maxHeap2.size() < k) {
                maxHeap2.add(new int[]{x,y});
            } else {
                int dist2 = (x*x) + (y*y);

                int[] top = maxHeap2.peek();

                int x1= top[0];
                int y1 = top[1];
                int dist1 = (x1*x1) + (y1*y1);

                if(dist1 > dist2) {
                    maxHeap2.poll();
                    maxHeap2.add(new int[]{x,y});
                }
            }
        }

        int[][] output = new int[k][2];

        for(int i = 0; i < k; i++) {
            int[]top = maxHeap2.poll();

            output[i][0] = top[0];
            output[i][1] = top[1];
        }
        return output;
    }
}