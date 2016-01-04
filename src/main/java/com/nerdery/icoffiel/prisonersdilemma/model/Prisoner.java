package com.nerdery.icoffiel.prisonersdilemma.model;

public interface Prisoner {
	/**
	 * The confess String.
	 */
	public final String CONFESS = "confess";
	
	/**
	 * The silent String.
	 */
	public final String SILENT = "silent";
	
	/**
	 * Have the interrogation of the prisoner.
	 * 
	 * @return A {@code String} that contains either confess, or silent.
	 */
	public String bargain();

}
