/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit4;

import junit.framework.TestSuite;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author unscathed18
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({unit4.WarehouseTest.class, unit4.PackageTest.class, unit4.ContainerTest.class})
public class unit4Suite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        TestSuite suite = new TestSuite("ContainerSuite");
        //suite.addTest(container)
        //https://netbeans.org/kb/docs/java/junit-intro.html#Exercise_40
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
