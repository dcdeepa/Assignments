/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.*;

/**
 *
 * @author jmd
 */
public class practice2 {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans1 = subSet(arr);
        System.out.println(ans1);
    }
    
    //static List<List<Integer>> ans = new ArrayList<List<Integer>>();
    
    public static List<List<Integer>> subSet(int[] arr) {
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> ar = new ArrayList<>();
        boolean b = true;
        findSubSet(arr,0,n,b,ar,ans);
        return ans;
    }
    
    public static void findSubSet(int[] arr, int i, int n ,boolean b,List<Integer> ar,List<List<Integer>> ans )
    {
        if (i==n)
        {
            List<Integer> a = new ArrayList<>();
            for(int k : ar)
            {
                a.add(k);
            }
            if(!ans.contains(a))
            {
                ans.add(a);
            }
            //ar.clear();
            return;
        }
        
        //ar.add(arr[i]);
        findSubSet(arr,i+1,n,ar.add(arr[i]),ar,ans);
        ar.remove(ar.size()-1);
        findSubSet(arr,i+1,n,true,ar,ans);
    }
}
