# Java for Developers

# `for` loops

## 1. `for` Loop – Basic Counting

### Syntax

```java
for (initialization; condition; update) {
    // loop body
}
```

### Example

```java
for (int i = 0; i < 5; i++) {
    System.out.println("The value of i is: " + i);
}
```

### Key Ideas

- Entry-controlled loop (condition checked before execution)
- Best used when the number of iterations is known
- Common in counting tasks and fixed-size repetitions

### Use Cases

- Looping from 1 to 100
- Generating multiplication tables
- Repeating a known task a fixed number of times

## 2. `for` Loop with Arrays (Index-based)

### Example

```java
String[] names = {"Abby", "Roy", "Eric"};
for (int i = names.length - 1; i >= 0; i--) {
    System.out.println(names[i]);
}
```

### Key Ideas

- Uses array indices to access elements
- Allows reverse traversal
- Enables reading and modification of elements
- Supports access to both values and their positions

### Use Cases

- Printing an array in reverse
- Modifying every element of an array
- Skipping or selecting alternate elements using index logic

## 3. Enhanced `for` Loop (For-Each)

### Syntax

```java
for (Type element : arrayOrCollection) {
    // use element
}
```

### Example

```java
for (String name : names) {
    System.out.println(name);
}
```

### Key Ideas

- Simplified, read-only iteration over arrays and collections
- No index access
- Cleaner syntax for read operations

### Use Cases

- Printing all items in a list
- Summing or counting values
- Filtering based on value conditions

### Limitations

- Cannot access element indices
- Cannot modify elements directly in arrays

## 4. `while` Loop

### Syntax

```java
int i = 0;
while (i < 5) {
    // loop body
    i++;
}
```

### Example

```java
int i = 1;
while (i < 5) {
    System.out.println("while loop, i: " + i);
    i++;
}
```

### Key Ideas

- Entry-controlled loop
- Condition is evaluated before executing the loop body
- Loop may not run at all if the condition is initially false

### Use Cases

- Input validation
- Repeating tasks with unknown iteration count
- Polling operations

## 5. `do-while` Loop

### Syntax

```java
int i = 1;
do {
    // loop body
    i++;
} while (i < 5);
```

### Example

```java
do {
    System.out.println("Do While Checking the value of i: " + i);
    i++;
} while (i < 5);
```

### Key Ideas

- Exit-controlled loop
- Loop body executes at least once
- Condition is evaluated after executing the loop

### Use Cases

- Menus and interactive programs
- Tasks that must be performed once before checking a condition
- Retry loops

## Comparison: `while` vs `do-while`

| Feature            | `while`                   | `do-while`                        |
| ------------------ | ------------------------- | --------------------------------- |
| Condition checked  | Before loop body          | After loop body                   |
| Minimum executions | 0                         | 1                                 |
| Primary use        | Tasks that may be skipped | Tasks that must run at least once |

## Common Mistakes and Fixes

**Mistake:** Declaring a variable inside the `while` condition

```java
while (int i < 5) { ... } // Invalid
```

**Fix:** Declare the variable before the loop

```java
int i = 0;
while (i < 5) { ... }
```

**Mistake:** Accessing an array out of bounds

```java
for (int i = names.length; i >= 0; i--) {
    System.out.println(names[i]); // IndexOutOfBoundsException when i == names.length
}
```

**Fix:** Start from `names.length - 1`

```java
for (int i = names.length - 1; i >= 0; i--) {
    System.out.println(names[i]);
}
```

## Practice Problems

1. Print all even numbers from 1 to 100 using a `for` loop
2. Reverse an array using a traditional index-based loop
3. Use a `while` loop to prompt for a password until it's correct
4. Create a menu-based application using a `do-while` loop
5. Use an enhanced `for` loop to print all elements of a string array

## Code Reference: Combined Usage of All Loops

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("The value of i is: " + i);
        }

        String[] names = {"Abby", "Roy", "Eric"};

        System.out.println("Normal Loop".toUpperCase());
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        System.out.println("Enhanced For Loop".toUpperCase());
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("While Loop".toUpperCase());
        int i = 1;
        while (i < 5) {
            System.out.println("while loop, i: " + i);
            i++;
        }

        System.out.println("Do While Loop".toUpperCase());
        do {
            System.out.println("Do While Checking the value of i: " + i);
            i++;
        } while (i < 5);
    }
}
```

If you need this in a `.docx` or `.pdf` version, I can generate it as well. Let me know how you'd like to proceed.
