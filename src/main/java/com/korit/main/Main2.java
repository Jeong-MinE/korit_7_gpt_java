package com.korit.main;

import com.korit.service.ATestService;
import com.korit.service.BTestService;
import com.korit.util.ForEachPrinter;

public class Main2 {
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5,6,7,8,9,10};
        Integer[] nums2 = {11,12,13,14,15,16,17,18,19,};
        Integer[] nums3 = {111,112,113,114,115,116,117,118,119};

        ForEachPrinter forEachPrinter = new ForEachPrinter();
        forEachPrinter.print(nums);
        forEachPrinter.print(nums2);
        forEachPrinter.print(nums3);
    }

}
