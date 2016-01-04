# PrisonersDilemma
## Requirements
* Java 1.8
* Gradle 2+

## Building
To build run the Gradle command:
```
gradle build
```

## Running
To run use the following command:
```
java -jar build/libs/PrisonersDilemma-1.0.jar <partnerName> <partnerDiscipline> [partnerPreviousResponse] [playerPreviousResponse]
```

* Argument 1 <partnerName>: This is the name of the opponent or the player who was your partner in crime.
* Argument 2 <partnerDiscipline>: This is the discipline of your opponent. It will be one of the following: [client-side, jvm, mobile, .net, php, ruby, other] ("other" refers to any contestant outside of development.)
* Argument 3 (optional) [partnerPreviousResponse]: This is the response of your opponent from your previous match with that opponent. Is one of “confess” or “silent”. This will not be provided in your first match with this opponent.
* Argument 4 (optional) [playerPreviousResponse]: This is your response from the previous match with this opponent. Is one of “confess” or “silent”. This will not be provided in your first match with this opponent.
Return value: (confess|silent). Your script must return the string ‘confess’ or ‘silent’ indicating your response to the interrogation concerning your partner. Confess means you want to betray your partner, whereas “silent” means you choose to remain silent.
The Contest