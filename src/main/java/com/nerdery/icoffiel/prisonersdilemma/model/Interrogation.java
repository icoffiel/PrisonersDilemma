package com.nerdery.icoffiel.prisonersdilemma.model;

import java.util.Optional;

public class Interrogation {
	
	private Prisoner prisoner;

	/**
	 * Create an interrogation with the respective parameters.
	 * 
	 * @param partnerName The name of the opponent or the player who was your partner in crime.
	 * @param partnerDiscipline The discipline of your opponent. It will be one of the following: [client-side, jvm, mobile, .net, php, ruby, other] 
	 * @param partnerPreviousResponse The response of your opponent from your previous match with that opponent. Is one of “confess” or “silent”. This will not be provided in your first match with this opponent.
	 * @param playerPreviousResponse Your response from the previous match with this opponent. Is one of “confess” or “silent”. This will not be provided in your first match with this opponent.
	 */
	public Interrogation(String partnerName, String partnerDiscipline, Optional<String> partnerPreviousResponse, Optional<String> playerPreviousResponse) {
		if(partnerPreviousResponse.isPresent()) {
			switch(partnerPreviousResponse.get()) {
				case Prisoner.CONFESS:
					// If I'm going down you're going down with me!
					prisoner = new ConfessPrisoner();
					break;
				case Prisoner.SILENT:
					// Do I really want to lie?
					prisoner = new ShouldIPrisoner();
					break;
			}
		} else {
			// Assume the other prisoner is going to cooperate.
			prisoner = new SilentPrisoner();
		}
	}

	/**
	 * Interrogate the prisoner.
	 * @return a {@code String} containing the result of the the interrogation.
	 */
	public String prisoner() {
		return prisoner.bargain();
	}

}
