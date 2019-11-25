package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.util.Objects;

import static org.junit.Assert.*;

public class JobTest {

    Job testClassOne;
    Job testClassTwo;

    @Before
    public void Job() {
        testClassOne = new Job();
        testClassTwo = new Job();
    }


    @Test
    public void testSettingJobId() {
        int testClassOneIdPlusOne = testClassOne.getId() + 1;
        assertEquals(testClassOneIdPlusOne, testClassTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testClassFull = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertTrue(testClassFull instanceof Job);
        assertEquals( "Product tester", testClassFull.getName());
        assertEquals("ACME", testClassFull.getEmployer().getValue());
        assertEquals("Desert", testClassFull.getLocation().getValue());
        assertEquals("Quality control", testClassFull.getPositionType().getValue());
        assertEquals("Persistence", testClassFull.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job sameJobOne = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        Job sameJobTwo = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        int sameJobOneId = sameJobOne.getId();
        int sameJobTwoId = sameJobTwo.getId();

        assertEquals(false, sameJobOneId == sameJobTwoId);

    }
}


