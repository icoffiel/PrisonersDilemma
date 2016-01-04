package com.nerdery.icoffiel.prisonersdilemma.model;

/**
 * A Prisoner that always confesses.
 * 
 * @author Iain
 *
 */
public class ConfessPrisoner implements Prisoner {

	@Override
	public String bargain() {
		return Prisoner.CONFESS;
	}

}
