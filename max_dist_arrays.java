class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int prevsmall = arrays.get(0).get(0);
        int prevbig = arrays.get(0).get(arrays.get(0).size()-1);
        int res = 0;

        for(int i=1;i<arrays.size();i++)
        {
            int currsmall = arrays.get(i).get(0);
            int currbig = arrays.get(i).get(arrays.get(i).size()-1);

            int dist1 = currbig - prevsmall;
            int dist2 = prevbig - currsmall;

            res = Math.max(res,dist1);
            res = Math.max(res,dist2);

            prevsmall = Math.min(prevsmall,currsmall);
            prevbig = Math.max(prevbig,currbig);
        }
        return res;
    }
}