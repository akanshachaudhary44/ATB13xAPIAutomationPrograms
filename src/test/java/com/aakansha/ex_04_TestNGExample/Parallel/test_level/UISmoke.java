package com.aakansha.ex_04_TestNGExample.Parallel.test_level;

import org.testng.annotations.Test;

public class UISmoke {
    @Test
    public void test_UI_Smoke(){
        System.out.println(Thread.currentThread().getId());
    }
}