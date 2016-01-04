/**
 * 
 */
package com.nerdery.icoffiel.prisonersdilemma.model;

/**
 * A Prisoner that does not confess.
 * 
 * @author Iain
 *
 */
public class SilentPrisoner implements Prisoner {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String bargain() {
		return Prisoner.SILENT;
	}

}
