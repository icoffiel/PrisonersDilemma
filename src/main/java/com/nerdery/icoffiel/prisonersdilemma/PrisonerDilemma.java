package com.nerdery.icoffiel.prisonersdilemma;

import java.util.Optional;

import com.nerdery.icoffiel.prisonersdilemma.model.Interrogation;

public class PrisonerDilemma {

	public static void main(String[] args) {
		// Check the arguments
		if(args.length < 2 || args.length > 4) {
			System.out.println("usage: java -jar prisonersdilemma.jar <partnerName> <partnerDiscipline> [partnerpreviousResponse] [playerPreviousResponse]");
			System.exit(1);
		}
		
		// Create the models
		Interrogation interrogate = new Interrogation(args[0], args[1], getOptional(args, 2), getOptional(args, 3));
		
		// Start the interrogation and print the result!
		System.out.println(interrogate.prisoner());
	}
	
	/**
	 * Return an {@code Optional} argument.
	 * 
	 * @param args The command line parameters.
	 * @param index The index to check for on the arguments.
	 * @return An {@code Optional} representing the command line argument passed.
	 */
	private static Optional<String> getOptional(String[] args, int index) {
		if(args.length >= index + 1) {
			return Optional.ofNullable(args[index]);
		}
		return Optional.empty();
	}

}
