package com.sarvan.learn.k8s.to;

public class FindTwiceBig {

    public static int dominantIndex(int[] nums) {
        int b=-1,lb=-1,index=0;
        if (nums.length==1) return 0;
        for(int i=0;i<nums.length;i++){
            if(lb<nums[i]){
                b=lb;
                lb=nums[i];
                index=i;
            }
            else if (b<nums[i]){
                b=nums[i];
            }
        }
        System.out.println("lb:b"+lb+":"+b);
        return 2*b<=lb?index:-1;
    }

    public static void main(String[] args) {
        int [] nums={3,6,0,1};
        dominantIndex(nums);
    }
}
