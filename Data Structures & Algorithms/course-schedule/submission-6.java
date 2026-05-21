class Solution {
    private HashMap<Integer, List<Integer>> prereqs = new HashMap<>();
    private Set<Integer> visiting = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        for (int i = 0; i < numCourses; i++) {
            prereqs.put(i, new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int course = prerequisites[i][0];
            int req = prerequisites[i][1];

            prereqs.get(course).add(req);
        }

        for (int c = 0; c < numCourses; c++) {
            if(!dfs(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean dfs(int course) {
        if(visiting.contains(course)) {
            return false;
        }

        if(prereqs.get(course).isEmpty()) {
            return true;
        }

        visiting.add(course);
        for(int reqs:prereqs.get(course)) {
            if(!dfs(reqs)) {
                return false;
            }
        }
        visiting.remove(course);
        prereqs.put(course, new ArrayList<>());
        return true;
    }
}
