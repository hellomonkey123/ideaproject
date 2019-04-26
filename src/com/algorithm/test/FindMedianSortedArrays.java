package com.algorithm.test;

public class FindMedianSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] tmp = new int[nums1.length + nums2.length];
        double med = 0.0;
        int j = 0;
        if(nums1 == null || nums2 == null) {
            if ((nums1.length % 2 + nums2.length % 2) != 0) {
                return (double)((nums1.length != 0) ? nums1[nums1.length / 2] : nums2[nums2.length / 2]);
            }else{
                return (double)(nums1[nums1.length / 2] + nums2[nums2.length / 2] + nums1[nums1.length / 2 - 1] + nums2[nums2.length / 2 - 1]);
            }
        }

        if ((nums1.length/2 + nums2.length/2) % 2 == 0){

            while (j <= (nums1.length/2 + nums2.length/2) / 2){
                //tmp = nums1[];
            }
            med = 0;
        }

        return med;
    }


}
