package com.aakansha.ex_04_TestNGExample.Parallel.test_level;

import org.testng.annotations.Test;

public class DBSmoke {
    @Test
    public void test_DB_Smoke(){
        System.out.println(Thread.currentThread().getId());
    }
}