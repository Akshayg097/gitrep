# GuessWord

A simple Java console game where the player tries to guess letters in a hidden word.

## Project Overview
This project contains a single Java class named `guessword` that:
- stores a hidden word (`"akshay"`)
- asks the user to guess one letter at a time
- marks matching letters in their positions
- shows underscores for unrevealed letters
- congratulates the player when the word is complete

## Files
- `guessword.java` - the game logic and console input/output

## How to Run
Make sure Java is installed on your system.

1. Open a terminal in the project folder.
2. Compile the Java file:
   ```bash
   javac guessword.java
   ```
3. Run the program:
   ```bash
   java guessword
   ```

Note: In the current code, the program defines `main1` instead of `main`. To run it as a standard Java program, rename `main1` to `main`.

## Example Gameplay
```text
Guess a letter: a
Matches!
a _ _ _ _ _
Guess a letter: k
Matches!
a k _ _ _ _
...
Congratulations! You guessed the word!
```

## Features
- Single-letter input validation
- Feedback for correct and incorrect guesses
- Real-time display of guessed letters
- Win condition when all letters are found

## License
This project is provided as a basic Java learning exercise and can be freely modified for personal use.
