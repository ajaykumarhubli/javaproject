package com.in28minutes.maven;

import static org.junit.Assert.*;
// Changes made to trigger jenkn build.
// One more change for testing build.
import org.junit.Test;

public class AppTest 
{
	@Test
	public void testApp()
    {
        assertEquals(0,new App().calculateSomething());
    }
}
