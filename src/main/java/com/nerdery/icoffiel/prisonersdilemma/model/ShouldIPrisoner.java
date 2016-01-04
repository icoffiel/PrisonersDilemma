/**
 * 
 */
package com.nerdery.icoffiel.prisonersdilemma.model;

import java.util.Random;

/**
 * A Prisoner who has some (but not much) morals and confesses 10% of the time!
 * 
 * @author Iain
 *
 */
public class ShouldIPrisoner implements Prisoner {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String bargain() {
		// Create a new random number generator using the current time as the seed.
		int shouldI = getRandom();
		
		if(shouldI == 1) {
			// I just can't lie!
			return CONFESS;
		} else {
			// We're in this together!
			return SILENT;
		}
	}

	/**
	 * Return a random number between 1 and 10.
	 * 
	 * @return an {@code int} between 1 and 10.
	 */
	private int getRandom() {
		Random generator = new Random(System.currentTimeMillis());
		return generator.nextInt(10) + 1;
	}

}
