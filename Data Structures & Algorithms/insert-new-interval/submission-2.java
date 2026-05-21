class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();

        if (intervals.length == 0) {
            res.add(newInterval);
            return res.toArray(new int[res.size()][]);

        }

        boolean added = false;

        for (int row = 0; row < intervals.length; row++) {
            if (intervals[row][1] < newInterval[0]) {
                res.add(new int[] { intervals[row][0], intervals[row][1] });
                //two cases from here:
                // case1: beginning is before but end is 
            } else if ((intervals[row][0] > newInterval[1])) {
                if (!added){res.add(newInterval);}
                added=true;
                res.add(new int[] { intervals[row][0], intervals[row][1] });
                //two cases from here:
            } else {
                if (intervals[row][0] < newInterval[0]) {
                    newInterval[0] = intervals[row][0];
                }
                if (intervals[row][1] > newInterval[1]) {
                    newInterval[1] = intervals[row][1];
                }
            }
        }
        if (!added){res.add(newInterval);}
        return res.toArray(new int[res.size()][]);
    }
}
