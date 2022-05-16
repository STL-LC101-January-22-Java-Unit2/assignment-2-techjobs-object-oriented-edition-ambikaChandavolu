package org.launchcode.techjobs.oo.test;

import static org.junit.Assert.*;

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

}
