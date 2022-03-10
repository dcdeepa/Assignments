/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author jmd
 */
import java.util.*;
public class CombinationSum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        List<List<Integer>> ans1 = combinationSum(arr,7);
        System.out.println(ans1);
    }
    
    static List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<Integer> a = new ArrayList<Integer>();
        boolean b = true;
        findCombination(b,0,n,candidates,target,0,a);   
        return ans;
    }    
    
    public static void findCombination(boolean b,int i, int n,int[] arr, int target, int curr_sum,List<Integer> a )
    {
        int sum = 0;
        for(int k : a)
        {
            sum+=k;
        }
        curr_sum = sum;
        if(i==n)
        {
            return;
        }
        if(curr_sum==target)
        {
            List<Integer> ar = new ArrayList<Integer>();
            for(int j : a)
            {
                ar.add(j);
            }
            ans.add(ar);
            return;
        }
        if(curr_sum>target)
        {
            return;
        }
        //a.add(arr[i]);
        findCombination(a.add(arr[i]),i,n,arr,target,curr_sum+arr[i],a);
        a.remove(a.size()-1);
        findCombination(true,i+1,n,arr,target,curr_sum+arr[i],a);
    }

    
}