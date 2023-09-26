# Java Basics Repository

This GitHub repository contains a collection of Java programs and examples covering various fundamental topics in Java programming. Each topic is organized into its respective folder for easy access and understanding.

## Table of Contents

1. [Assignment Operator](#assignment-operator)
2. [Conditional Statements (if-else)](#conditional-statements-if-else)
3. [Incrementation & Decrementation](#incrementation-decrementation)
4. [Logical Operators](#logical-operators)
5. [Loops](#loops)
6. [Nested Loops and Pattern Programming](#nested-loops-and-pattern-programming)
7. [Operators in Java](#operators-in-java)
8. [Relational Operator](#relational-operator)
9. [Scanner Class](#scanner-class)
10. [Switch Case](#switch-case)
11. [Ternary Operator](#ternary-operator)
12. [Type Casting & Truncation](#type-casting-truncation)

## Topics Covered

### Assignment Operator
In Java, the assignment operator (=) is used to assign a value to a variable. For example:
```
int x = 10; // assigns the value 10 to the variable x
```

### Conditional Statements (if-else)
Conditional statements allow you to make decisions in your Java code. The `if` statement is used to execute a block of code if a condition is true. The `else` statement is used to execute a block of code if the condition is false. For example:
```
int age = 20;
if (age >= 18) {
    System.out.println("You are an adult.");
} else {
    System.out.println("You are a minor.");
}
```

### Incrementation & Decrementation
Incrementing (`++`) and decrementing (`--`) operators are used to increase or decrease the value of a variable by 1, respectively.
```
int count = 5;
count++; // Increment count by 1
count--; // Decrement count by 1
```

### Logical Operators
Logical operators (`&&` for AND, `||` for OR, `!` for NOT) are used to combine multiple conditions in conditional statements. They are often used to make more complex decisions..
```
boolean isAdult = true;
boolean hasLicense = false;
if (isAdult && hasLicense) {
    System.out.println("You can drive.");
}
```


### Loops
Loops in Java allow you to execute a block of code repeatedly. Common loops include `for`, `while`, and `do-while`. They are useful for tasks like iterating through arrays or processing data.

### Nested Loops and Pattern Programming
Nested loops are loops within loops. They are often used for more complex iterations, like creating patterns or working with multi-dimensional arrays.
```
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

### Operators in Java
Java has various operators such as arithmetic operators (+, -, *, /), comparison operators (==, !=, <, >), bitwise operators (&, |, ^), and more. These operators perform specific operations on operands.

### Relational Operator
Relational operators are used to compare values. Examples include `==` (equal to), `!=` (not equal to), `<` (less than), and `>` (greater than)..

### Scanner Class
The `Scanner` class is used to read input from the keyboard (user input) in Java. It allows you to interact with users by accepting input during program execution.

### Switch Case
The `switch` statement is used for multi-branching in Java. It allows you to select one of many code blocks to be executed based on the value of an expression.

### Ternary Operator
The ternary operator (`? :`) is a shorthand way to write simple `if-else` statements. It evaluates a boolean expression and returns one of two values depending on whether the expression is true or false.

### Type Casting & Truncation
Type casting is the process of converting one data type to another. It can be explicit (casting) or implicit (automatic). Truncation occurs when converting a larger data type to a smaller one, potentially losing precision.


