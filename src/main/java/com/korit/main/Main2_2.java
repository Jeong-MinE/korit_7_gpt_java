package com.korit.main;

import com.korit.service.ATestService;
import com.korit.service.BTestService;
import com.korit.util.ForEachPrinter;

public class Main2_2 {
    public static void main(String[] args) {

        Integer[] nums = {1,2,3,4,5,6,7,8,9,10};
        Integer[] nums2 = {11,12,13,14,15,16,17,18,19,};
        Integer[] nums3 = {111,112,113,114,115,116,117,118,119};

        ForEachPrinter.print(nums);
        ForEachPrinter.print(nums2);
        ForEachPrinter.print(nums3);
    }
}
