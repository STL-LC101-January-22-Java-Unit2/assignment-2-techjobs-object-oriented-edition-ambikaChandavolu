package org.launchcode.techjobs.oo.test;

import static org.junit.Assert.*;

import netscape.javascript.JSObject;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;
import org.junit.Test;
import org.launchcode.techjobs.oo.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertTrue(job1.getId() != job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", job.getName());
        assertTrue(job.getName() instanceof String);

        assertEquals("ACME", job.getEmployer().getValue());
        assertTrue(job.getEmployer() instanceof Employer);

        assertEquals("Desert", job.getLocation().getValue());
        assertTrue(job.getLocation() instanceof Location);

        assertEquals("Quality control", job.getPositionType().getValue());
        assertTrue(job.getPositionType() instanceof PositionType);

        assertEquals("Persistence", job.getCoreCompetency().getValue());
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char firstChar = job.toString().charAt(0);
        char lastChar = job.toString().charAt(job.toString().length()-1);
        assertEquals(firstChar, '\n');
        assertEquals(lastChar, '\n');

       /* assertTrue(job.toString().charAt(0) == '\n');
        assertTrue(job.toString().charAt(job.toString().length()-1) == '\n');
        Assert.assertEquals('\n', '\n');
        */
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: " + job.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n", job.toString());
    }




}
