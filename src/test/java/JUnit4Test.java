/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.testtask1.Main;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author missa
 */
@org.junit.runner.RunWith(org.junit.runners.Suite.class)
@org.junit.runners.Suite.SuiteClasses({})
public class JUnit4Test extends Main{

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("Before MainTest.class");
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("After MainTest.class");
    }
    
    @Test
    public void ignoredTest() {
        System.out.println("will not print it");
    }
 
    @Test(timeout = 500)
    public void timeStampTest() {
        while (true);
    }
        
    @Test
    public void testing() throws Exception {
       
    
    }
            
}
