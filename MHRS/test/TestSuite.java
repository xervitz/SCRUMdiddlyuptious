/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import mhrs.ConditionTest;
import mhrs.FamilyMemberTest;
import mhrs.MHPageTest;
import mhrs.ProcedureTest;
import mhrs.SearchController;

/**
 *
 * @author Benjamin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    ConditionTest.class,
    FamilyMemberTest.class,
    MHPageTest.class,
    ProcedureTest.class,
    SearchController.class
})
public class TestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
