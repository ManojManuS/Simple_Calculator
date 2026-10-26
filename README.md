# 🧮 Simple Calculator in Java
 
## 📌 About the Project

This project is a **Simple Calculator developed using Java**. It is a console-based application that performs basic arithmetic calculations and several additional mathematical operations based on the user's choice.

The program uses Java's `Scanner` class to accept user input and a `switch` statement to execute the selected operation.

## ✨ Features

The calculator supports the following 13 menu options:

1. **Addition** – Adds two numbers.
2. **Subtraction** – Subtracts the second number from the first.
3. **Multiplication** – Multiplies two numbers.
4. **Division** – Divides the first number by the second, with a division-by-zero check.
5. **Modulus** – Finds the remainder after division.
6. **Square** – Calculates the square of both numbers.
7. **Cube** – Calculates the cube of both numbers.
8. **Square Root** – Calculates the square root of both numbers.
9. **Power** – Calculates the first number raised to the power of the second.
10. **Percentage** – Calculates a percentage using the two input values.
11. **Factorial** – Calculates the factorial of both numbers.
12. **Perform All Operations** – Executes the available operations sequentially.
13. **Exit** – Terminates the program.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Input Handling:** `Scanner`
- **Control Statements:** `switch`, `for` loop, `if-else`
- **Mathematical Operations:** `Math.sqrt()` and `Math.pow()`

## 💻 Sample Output

## Output

### Choice 1: Addition
```text
Enter the Value-01
10
Enter the value-02
2
Calculator
1.Additon
2.Subtraction
3.Multiplication
4.Division
5.Modulus
6.Square
7.cube
8.Square Root
9.power
10.percentage
11.Factorial
12.Perform All Opertaion
13.Exit
Enter the choice
1
Additon of two number is:12
```

### Choice 2: Subtraction
```text
Enter the choice
2
Subtraction of two number is:8
```

### Choice 3: Multiplication
```text
Enter the choice
3
Multiplication of two number is:20
```

### Choice 4: Division
```text
Enter the choice
4
Division of number is:5
```

### Choice 5: Modulus
```text
Enter the choice
5
Modulus of two number is0
```

### Choice 6: Square
```text
Enter the choice
6
The Square of Value 1 is100
The sqaure of value 2 is4
```

### Choice 7: Cube
```text
Enter the choice
7
The cube of Value 1 is1000
The cube of value 2 is8
```

### Choice 8: Square Root
```text
Enter the choice
8
Square root of value 01 is:3
square root of value 02 is1
```

### Choice 9: Power
```text
Enter the choice
9
The Power Of Number is100.0
```

### Choice 10: Percentage
```text
Enter the choice
10
Percentage is500
```

### Choice 11: Factorial
```text
Enter the choice
11
Factorial of value-01:3628800
Factorial of value-01:2
```

### Choice 12: Perform All Operations
```text
Enter the choice
12
Additon of two number is:12
Subtraction of two number is:8
Multiplication of two number is:20
Division of number is:5
Modulus of two number is0
The Square of Value 1 is100
The sqaure of value 2 is4
The cube of Value 1 is1000
The cube of value 2 is8
Square root of value 01 is:3
square root of value 02 is1
The Power Of Number is100.0
Percentage is500
Factorial of value-01:3628800
Factorial of value-01:2
```

### Choice 13: Exit
```text
Enter the choice
13
```

### Invalid Choice
```text
Enter the choice
14
Enter Correct Input......!
```

### Division by Zero
```text
Enter the choice
4
Division Not Possible
```

### Percentage by Zero
```text
Enter the choice
10
Division Not Possible
```
## 🧠 Concepts Learned

This project demonstrates the following Java programming concepts:

- Classes and the `main()` method
- User input using the `Scanner` class
- Variables and data types
- Arithmetic operators
- `switch-case` statements
- Conditional statements (`if-else`)
- Loops (`for`)
- Mathematical methods from the `Math` class
- Basic exception prevention through input checks

## ⚠️ Limitations

- The program accepts integer inputs only.
- Integer arithmetic and factorial calculations can overflow for large values.
- Division uses integer arithmetic, so decimal results are truncated.
- Negative factorial inputs are not validated.
- Modulus by zero is not handled.
- The menu runs only once per program execution.

## 🚀 Future Improvements

- Add support for decimal numbers.
- Improve input validation and error handling.
- Prevent modulus-by-zero errors.
- Validate negative inputs for factorial and square root operations.
- Use `long` or `BigInteger` for larger factorial values.
- Add a loop so users can perform multiple calculations without restarting the program.
- Improve the percentage calculation to support decimal results.
- Organize operations into separate methods for cleaner, reusable code.

## 👨‍💻 Author

**MAOJ S**
