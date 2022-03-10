package practice;


import java.util.*;

class CombinationSum2 {
    
    public static void main(String[] args)
    {
        int[] arr = {2,5,2,1,2};
        combinationSum(arr,5);
    }
    public static void combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans =  new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int sum = 0;
        int start=0;        
        combinations(candidates,sum,target,start ,new ArrayList<>(),ans);
        System.out.println(ans);
        //return ans;
    }
    
    public static void combinations(int[] arr, int sum , int target,int start, List<Integer> res,List<List<Integer>> ans)
    {
        if(target==0)
        {
            if(!ans.contains(res))
            {
                ans.add(new ArrayList<>(res));
            }
            return;
        }
        if(target<0)
        {
           // res.clear();
            return;
        }
        
        else
        {
            for(int i=start;i<arr.length;i++)
            {
                
                res.add(arr[i]);
                //sum=sum+arr[i];
                System.out.println(res);
                combinations(arr,sum,target-arr[i],i+1,res,ans);
                res.remove(res.size()-1);
                
            }
            
        }
    
        
    }
}