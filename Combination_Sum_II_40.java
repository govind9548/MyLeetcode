class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }
    private void backtrack(List<List<Integer>> result, List<Integer> templist, int[] candidates, int remain, int start){
        if(remain<0){
            return;
        }else if(remain == 0){
            result.add(new ArrayList<>(templist));
        }else{
            for(int i=start; i<candidates.length; i++){
                if(i>start && candidates[i]==candidates[i-1]) continue;
                templist.add(candidates[i]);
                backtrack(result, templist, candidates, remain-candidates[i], i+1);
                templist.remove(templist.size()-1);
            }
        }
    }
}
