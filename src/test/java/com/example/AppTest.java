package com.example;

import org.junit.Test;
import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
    @Test
    public void TestAdd(){
       App app=new App();
        int result=app.add(2,3);
        System.out.println("2+3="+result);
        Assert.assertEquals(5,result);    
         }

}
