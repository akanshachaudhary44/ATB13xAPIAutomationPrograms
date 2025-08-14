package com.aakansha.ex_04_TestNGExample.Parallel.class_level_cross_browser_Testing;

import org.testng.annotations.Test;

public class FireFoxTest {
    @Test
    public void test_firefox(){
        System.out.println("2");
        System.out.println(Thread.currentThread().getId());

    }
}