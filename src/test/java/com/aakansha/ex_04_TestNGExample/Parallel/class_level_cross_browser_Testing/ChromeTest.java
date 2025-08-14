package com.aakansha.ex_04_TestNGExample.Parallel.class_level_cross_browser_Testing;

import org.testng.annotations.Test;

public class ChromeTest {
    @Test
    public void test_chrome1(){
        System.out.println("1");
        System.out.println(Thread.currentThread().getId());
    }

    @Test
    public void test_chrome2(){
        System.out.println("1");
        System.out.println(Thread.currentThread().getId());
    }
}