/**
 * 
 */
package com.nerdery.icoffiel.prisonersdilemma.model;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;

/**
 * Set of tests for the {@code Interrogation} object
 * @author Iain
 *
 */
public class InterrogationTest {
	
	private static final String PARTNER = "John Doe";
	private static final String PARTNER_DISCIPLINE = "jvm";
	
	/**
	 * Test method for {@link com.nerdery.icoffiel.prisonersdilemma.model.Interrogation#prisoner()} that simulates the first interrogation.
	 */
	@Test
	public void testFirstRun() {
		Interrogation interrogate = new Interrogation(PARTNER, PARTNER_DISCIPLINE, Optional.empty(), Optional.empty());
		assertEquals(Prisoner.SILENT, interrogate.prisoner());
	}
	
	@Test
	public void testPreviousConfession() {
		Interrogation interrogate = new Interrogation(PARTNER, PARTNER_DISCIPLINE, Optional.of(Prisoner.CONFESS), Optional.empty());
		assertEquals(Prisoner.CONFESS, interrogate.prisoner());
	}
	
	@Test
	public void testPreviousSilence() {
		Interrogation interrogate = new Interrogation(PARTNER, PARTNER_DISCIPLINE, Optional.of(Prisoner.SILENT), Optional.empty());
		// Just check that we return something as it could be either confess or silent.
		assertNotNull(interrogate.prisoner());
	}
}
