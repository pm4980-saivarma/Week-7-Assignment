# Week 7 Assignment

Java solutions for the **SEM-3 CodInClub** exercises on encapsulation and access control.

## Problems

- **Problem 1 - The Health Bar** (`Problem1/Character.java`)
  - Keeps health private.
  - Applies damage and healing with minimum and maximum bounds.
- **Problem 2 - The Playlist** (`Problem2/Playlist.java`)
  - Stores songs privately.
  - Returns a copy of the songs rather than the internal array.
- **Problem 3 - The Password Checker** (`Problem3/PasswordChecker.java`)
  - Stores the password privately and exposes only its strength rating.
- **Problem 4 - The Traffic Light** (`Problem4/TrafficLight.java`)
  - Cycles through `RED`, `GREEN`, and `YELLOW` using `next()`.
- **Problem 5 - The Shopping Cart** (`Problem5/Cart.java`)
  - Stores prices privately and calculates the total and item count on request.

## Compile and run

Each folder contains the Java source file and its compiled `.class` file. From the repository root:

```text
javac Problem1\Character.java
java -cp Problem1 Character

javac Problem2\Playlist.java
java -cp Problem2 Playlist

javac Problem3\PasswordChecker.java
java -cp Problem3 PasswordChecker

javac Problem4\TrafficLight.java
java -cp Problem4 TrafficLight

javac Problem5\Cart.java
java -cp Problem5 Cart
```

The `main` method in each class demonstrates the expected behavior from the problem statement.
