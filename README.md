# java-swing-square
A simple Java Swing application that draws a green filled square in a JFrame.

- `src/FilledFrame.java` – the `JFrame`; stores `squareSize`, which controls the square's size.
- `src/SquarePanel.java` – the `JPanel` that draws the square with `Graphics.fillRect()`.
- `src/SquareSimp.java` – the main class; creates a `FilledFrame` and makes it visible.

## Build and run

```sh
javac -d out src/*.java
java -cp out SquareSimp
```
