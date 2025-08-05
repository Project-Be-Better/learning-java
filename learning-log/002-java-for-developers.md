# Java for Developers

## Table of Contents

### Loops and Control Flow

1. [`for` Loops](#for-loops)
2. [Enhanced `for` Loop (For-Each)](#3-enhanced-for-loop-for-each)
3. [`while` Loop](#4-while-loop)
4. [`do-while` Loop](#5-do-while-loop)
5. [Break Keyword and Loops](#break-keyword-and-loops)
6. [Continue](#continue)

### Beyond the Basics

7. [Understanding Public Static Void Main](#understanding-public-static-void-main)
8. [Program Arguments](#program-arguments)
9. [Type Inference with `var`](#type-inference-with-var)
10. [Return Keyword and Void Methods](#return-keyword-and-void-methods)
11. [Final Keyword](#final-keyword)
12. [Static Keyword](#static-keyword)
13. [Static Initialization Block](#static-initialization-block)
14. [Instance Block Initializer](#instance-block-initializer)
15. [Static Import](#static-import)
16. [Enums](#enums)
17. [Enum Methods](#enum-methods)
18. [Implicit and Explicit Type Casting](#implicit-and-explicit-type-casting)
19. [Global and Local Variables](#global-and-local-variables)
20. [Wrapper Classes](#wrapper-classes)

### Working With Files

13. [Creating Files](#creating-files)
14. [Writing To Files](#writing-to-files)
15. [Reading From Files](#reading-from-files)
16. [Try With Resources](#try-with-resources)

### User Input

17. [Taking User Input](#taking-user-input)
18. [Scanner Class](#scanner-class)
19. [Reading Different Data Types](#reading-different-data-types)

### Exception Handling

20. [Exception Handling Fundamentals](#exception-handling-fundamentals)
21. [What Is An Exception](#what-is-an-exception)
22. [Try-Catch Blocks](#try-catch-blocks)
23. [Multiple Catch Blocks](#multiple-catch-blocks)
24. [Using OR Within Catch](#using-or-within-catch)
25. [The Exception Class](#the-exception-class)
26. [Finally Keyword](#finally-keyword)
27. [Exception Hierarchy](#exception-hierarchy)
28. [Unchecked Exceptions](#unchecked-exceptions)
29. [Checked Exceptions](#checked-exceptions)
30. [Throw and Throws](#throw-and-throws)
31. [Throwing Exceptions](#throwing-exceptions)
32. [When To Use Checked vs Unchecked Exceptions](#when-to-use-checked-vs-unchecked-exceptions)
33. [Creating Custom Exceptions](#creating-custom-exceptions)

### Object-Oriented Programming

34. [Java Packages](#java-packages)
35. [Java Access Modifiers](#java-access-modifiers)

### Classes And Objects

36. [Intro](#OOP)
37. [Your First Class](#your-first-class)
38. [Setters](#setters)
39. [Getters](#getters)
40. [Constructors](#constructors)
41. [Default Constructors](#default-constructors)
42. [Multiple Constructors](#multiple-constructors)
43. [This Inside Constructors](#this-inside-constructors)
44. [ToString](#tostring)
45. [The This Keyword](#the-this-keyword)
46. [Everything In Java Is An Object](#everything-in-java-is-an-object)
47. [@Override](#override)
48. [Comparing Objects With ==](#comparing-objects-with-==)
49. [Comparing Objects With .Equals](#comparing-objects-with-equals)
50. [Generating Equals Method](#generating-equals-method)
51. [Equals Explained](#equals-explained)
52. [Generating Code](#generating-code)
53. [Person And Cats Example](#person-and-cats-example)
54. [Pojos](#pojos)

### Strings

55. [Working with Strings](#working-with-strings)
56. [How Strings are Stored - String Pool](#how-strings-are-stored---string-pool)
57. [Strings are Immutable](#strings-are-immutable)
58. [String Literal vs String Object](#string-literal-vs-string-object)
59. [Comparing Strings with ==](#comparing-strings-with-==)
60. [Comparing Strings with .equals()](#comparing-strings-with-equals)
61. [Useful String Static Methods](#useful-string-static-methods)

### Dates

62. [LocalDateTime](#localdatetime)
63. [LocalDate and LocalTime](#localdate-and-localtime)
64. [Creating Specific Dates](#creating-specific-dates)
65. [Zone IDs](#zone-ids)
66. [Other Date Classes](#other-date-classes)

### Big Decimal

67. [The Problem With Double](#the-problem-with-double)
68. [BigDecimal](#bigdecimal)
69. [Exploring BigDecimal Methods](#exploring-bigdecimal-methods)

### Organizing Code

70. [Introduction to Code Organization](#introduction-to-code-organization)
71. [Packages](#packages)
72. [Models](#models)
73. [Service Classes](#service-classes)
74. [Data Access Object (DAO)](#data-access-object-dao)
75. [Connecting DAO and Service](#connecting-dao-and-service)
76. [N-Tier Architecture](#n-tier-architecture)
77. [Utility Classes](#utility-classes)

### Practice and Assessment

78. [Practice Problems](#practice-problems)
79. [Code Reference](#code-reference-combined-usage-of-all-loops)

---

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

# Break Keyword and Loops

## What is `break`?

The `break` keyword is used to exit or terminate a loop prematurely when a certain condition is met.

### Syntax

```java
for (int i = 0; i < 10; i++) {
    if (condition) {
        break; // Exits the loop immediately
    }
    // This code won't execute if break is triggered
}
```

### Example with `for` Loop

```java
// Find the first number divisible by 7
for (int i = 1; i <= 100; i++) {
    if (i % 7 == 0) {
        System.out.println("First number divisible by 7: " + i);
        break; // Exit the loop
    }
}
```

### Example with `while` Loop

```java
int attempts = 0;
while (true) {
    attempts++;
    System.out.println("Attempt: " + attempts);

    if (attempts >= 5) {
        System.out.println("Maximum attempts reached!");
        break; // Exit infinite loop
    }
}
```

### Nested Loops and `break`

```java
// break only exits the innermost loop
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (j == 2) {
            break; // Only exits inner loop
        }
        System.out.println("i=" + i + ", j=" + j);
    }
}
```

### Labeled `break` for Nested Loops

```java
outer: for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (i == 2 && j == 2) {
            break outer; // Exits both loops
        }
        System.out.println("i=" + i + ", j=" + j);
    }
}
```

### Use Cases

- **Search operations**: Stop when target is found
- **Input validation**: Exit when valid input is received
- **Error handling**: Exit on critical errors
- **Resource management**: Stop processing when limits are reached

# Continue

## What is `continue`?

The `continue` keyword skips the current iteration of a loop and moves to the next iteration.

### Syntax

```java
for (int i = 0; i < 10; i++) {
    if (condition) {
        continue; // Skip to next iteration
    }
    // This code is skipped if continue is triggered
}
```

### Example with `for` Loop

```java
// Print only odd numbers from 1 to 10
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue; // Skip even numbers
    }
    System.out.println("Odd number: " + i);
}
```

### Example with `while` Loop

```java
int i = 0;
while (i < 10) {
    i++;
    if (i % 3 == 0) {
        continue; // Skip multiples of 3
    }
    System.out.println("Number: " + i);
}
```

### Example with Enhanced `for` Loop

```java
String[] words = {"hello", "", "world", null, "java"};
for (String word : words) {
    if (word == null || word.isEmpty()) {
        continue; // Skip null or empty strings
    }
    System.out.println("Valid word: " + word);
}
```

### `break` vs `continue` Comparison

| Keyword    | Action                       | Loop Behavior                      |
| ---------- | ---------------------------- | ---------------------------------- |
| `break`    | Exits the loop completely    | Loop terminates                    |
| `continue` | Skips current iteration only | Loop continues with next iteration |

### Use Cases

- **Data filtering**: Skip invalid or unwanted data
- **Conditional processing**: Process only items meeting criteria
- **Error handling**: Skip problematic items without stopping entire process
- **Performance optimization**: Skip expensive operations when not needed

# Understanding Public Static Void Main

## The `main` Method Breakdown

```java
public static void main(String[] args) {
    // Program entry point
}
```

Let's break down each keyword:

### `public`

- **Access modifier**: Can be called from anywhere
- **Required**: JVM needs to access this method from outside the class
- **Alternative**: No other access modifier works for main method

### `static`

- **Class-level method**: Belongs to the class, not an instance
- **No object needed**: JVM can call it without creating an object
- **Memory allocation**: Loaded when class is first referenced

```java
public class Example {
    static int counter = 0; // Static variable

    public static void main(String[] args) {
        // Can access static members directly
        counter++;
        staticMethod(); // ✅ Works
        // nonStaticMethod(); // ❌ Won't work without object
    }

    static void staticMethod() {
        System.out.println("Static method called");
    }

    void nonStaticMethod() {
        System.out.println("Non-static method");
    }
}
```

### `void`

- **Return type**: Method doesn't return any value
- **Alternative**: Could be `int` for exit codes (advanced usage)

```java
// Alternative main method signatures (less common)
public static int main(String[] args) {
    // Return exit code
    return 0; // Success
}
```

### `main`

- **Method name**: Predefined by JVM specification
- **Case-sensitive**: Must be exactly "main"
- **Entry point**: First method JVM looks for when starting program

### `String[] args`

- **Parameter**: Array of command-line arguments
- **Alternative names**: `String[] arguments`, `String args[]`, `String... args`

```java
public class MainVariations {
    // All these are valid main method signatures:
    public static void main(String[] args) { }
    public static void main(String args[]) { }
    public static void main(String... args) { } // Varargs
}
```

## Why These Keywords Matter

### JVM Requirements

1. **public**: JVM must access from outside the class
2. **static**: JVM calls without creating object instance
3. **void**: Standard return type (though int is possible)
4. **main**: Predefined entry point name

### Common Mistakes

```java
// ❌ These won't work as entry points:
private static void main(String[] args) { } // Not public
public void main(String[] args) { }         // Not static
public static int main() { }                // Wrong parameters
public static void Main(String[] args) { }  // Wrong capitalization
```

# Program Arguments

## What are Program Arguments?

Program arguments (command-line arguments) are values passed to a Java program when it starts execution.

### Accessing Arguments

```java
public class ArgumentsExample {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}
```

### Running with Arguments

```bash
# Compile
javac ArgumentsExample.java

# Run with arguments
java ArgumentsExample hello world 123
```

**Output:**

```
Number of arguments: 3
Argument 0: hello
Argument 1: world
Argument 2: 123
```

### Practical Examples

**Calculator Program**

```java
public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator <num1> <operator> <num2>");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        String operator = args[1];
        double num2 = Double.parseDouble(args[2]);

        switch (operator) {
            case "+":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Result: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Result: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Unknown operator: " + operator);
        }
    }
}
```

**File Processor**

```java
public class FileProcessor {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide filename(s)");
            return;
        }

        for (String filename : args) {
            System.out.println("Processing file: " + filename);
            // File processing logic here
        }
    }
}
```

### Best Practices

1. **Validate arguments**: Always check length and format
2. **Provide usage instructions**: Help users understand how to use your program
3. **Handle errors gracefully**: Catch parsing exceptions
4. **Use meaningful names**: `args` is standard but you can use descriptive names

```java
public class BestPracticeExample {
    public static void main(String[] commandLineArgs) {
        if (commandLineArgs.length < 1) {
            printUsage();
            System.exit(1);
        }

        try {
            processArguments(commandLineArgs);
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid number format");
            printUsage();
            System.exit(1);
        }
    }

    private static void printUsage() {
        System.out.println("Usage: java Program <number1> [number2] [number3]...");
    }

    private static void processArguments(String[] args) {
        for (String arg : args) {
            int number = Integer.parseInt(arg);
            System.out.println("Processing number: " + number);
        }
    }
}
```

# Type Inference with `var`

## What is Type Inference?

Type inference allows the compiler to automatically determine the type of a variable based on the assigned value. Java introduced the `var` keyword in Java 10.

### Basic Syntax

```java
// Traditional explicit typing
String name = "John";
int age = 25;
List<String> names = new ArrayList<>();

// Type inference with var
var name = "John";           // Inferred as String
var age = 25;                // Inferred as int
var names = new ArrayList<String>(); // Inferred as ArrayList<String>
```

### Rules for Using `var`

#### 1. Local Variables Only

```java
public class VarExample {
    // var field; // ❌ Cannot use var for fields

    public void method() {
        var localVar = "Hello"; // ✅ OK for local variables
    }

    // public void method(var param) { } // ❌ Cannot use var for parameters
}
```

#### 2. Must Initialize at Declaration

```java
// ❌ These won't compile:
var x;              // No initialization
var y = null;       // Cannot infer from null

// ✅ These work:
var name = "John";  // Inferred as String
var count = 0;      // Inferred as int
```

#### 3. Cannot Use with Arrays Directly

```java
// ❌ Won't compile:
var array = {1, 2, 3};

// ✅ These work:
var array = new int[]{1, 2, 3};
var numbers = new ArrayList<Integer>();
```

### Practical Examples

#### Collections

```java
// Instead of:
Map<String, List<Integer>> studentGrades = new HashMap<String, List<Integer>>();

// Use:
var studentGrades = new HashMap<String, List<Integer>>();
```

#### Complex Type Names

```java
// Instead of:
BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"));

// Use:
var reader = new BufferedReader(new FileReader("file.txt"));
```

#### Loop Variables

```java
var numbers = List.of(1, 2, 3, 4, 5);

// Enhanced for loop
for (var number : numbers) {
    System.out.println(number);
}

// Traditional for loop
for (var i = 0; i < numbers.size(); i++) {
    System.out.println(numbers.get(i));
}
```

### When to Use `var`

#### Good Use Cases

```java
// 1. When type is obvious from right side
var message = "Hello World";
var count = 42;
var isValid = true;

// 2. Complex generic types
var cache = new ConcurrentHashMap<String, List<UserPreference>>();

// 3. Builder patterns
var request = HttpRequest.newBuilder()
    .uri(URI.create("https://api.example.com"))
    .build();
```

#### When NOT to Use `var`

```java
// 1. When it reduces readability
var data = getData(); // What type does getData() return?

// 2. When you need explicit casting
var number = (byte) 42; // Better to be explicit: byte number = 42;

// 3. When working with primitives that might be confusing
var zero = 0;    // Is this int, long, short?
var pi = 3.14;   // Is this float or double?
```

### Best Practices

#### 1. Enhance Readability

```java
// Good: Type is clear from context
var users = getUsersFromDatabase();
var config = new ApplicationConfig();

// Better with explicit type when unclear
UserService userService = createUserService();
```

#### 2. Use with Method Chaining

```java
var result = Stream.of("apple", "banana", "cherry")
    .filter(fruit -> fruit.length() > 5)
    .map(String::toUpperCase)
    .collect(Collectors.toList());
```

#### 3. Combine with Good Variable Names

```java
// ❌ Poor naming
var x = getCustomerData();

// ✅ Good naming
var customerData = getCustomerData();
var userPreferences = loadUserPreferences();
```

# Return Keyword and Void Methods

## Understanding `return`

The `return` keyword is used to exit a method and optionally return a value to the caller.

### Return with Values

```java
public class ReturnExamples {
    // Method returning an integer
    public int add(int a, int b) {
        return a + b; // Returns the sum
    }

    // Method returning a String
    public String getName() {
        return "John Doe";
    }

    // Method with conditional returns
    public String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else {
            return "F";
        }
    }
}
```

### Return in `void` Methods

```java
public class VoidMethods {
    // void method without return
    public void printMessage() {
        System.out.println("Hello World");
        // return is optional here
    }

    // void method with early return
    public void processAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
            return; // Exit early
        }

        if (age < 18) {
            System.out.println("Minor");
        } else {
            System.out.println("Adult");
        }
    }

    // Multiple return points in void method
    public void validateInput(String input) {
        if (input == null) {
            System.out.println("Input cannot be null");
            return;
        }

        if (input.trim().isEmpty()) {
            System.out.println("Input cannot be empty");
            return;
        }

        System.out.println("Valid input: " + input);
    }
}
```

### Return in Loops

```java
public class LoopReturns {
    // Using return to exit method from within loop
    public int findFirstEven(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                return number; // Exit method immediately
            }
        }
        return -1; // Not found
    }

    // Multiple returns in different conditions
    public String checkArray(int[] array) {
        if (array == null) {
            return "Array is null";
        }

        if (array.length == 0) {
            return "Array is empty";
        }

        for (int num : array) {
            if (num < 0) {
                return "Contains negative numbers";
            }
        }

        return "All positive numbers";
    }
}
```

### Return vs Break vs Continue

```java
public class ControlFlowComparison {
    public void demonstrateReturn() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                return; // Exits the entire method
            }
            System.out.println("Return: " + i);
        }
        System.out.println("This won't print"); // Never reached
    }

    public void demonstrateBreak() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Exits only the loop
            }
            System.out.println("Break: " + i);
        }
        System.out.println("This will print"); // This executes
    }

    public void demonstrateContinue() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // Skips current iteration
            }
            System.out.println("Continue: " + i);
        }
        System.out.println("This will print"); // This executes
    }
}
```

### Best Practices

#### 1. Single Return Point vs Multiple Returns

```java
// Multiple returns (often more readable)
public String getStatus(int code) {
    if (code == 200) return "OK";
    if (code == 404) return "Not Found";
    if (code == 500) return "Server Error";
    return "Unknown";
}

// Single return point
public String getStatusSingle(int code) {
    String status;
    if (code == 200) {
        status = "OK";
    } else if (code == 404) {
        status = "Not Found";
    } else if (code == 500) {
        status = "Server Error";
    } else {
        status = "Unknown";
    }
    return status;
}
```

#### 2. Early Returns for Validation

```java
public void processUser(User user) {
    // Early returns for validation
    if (user == null) {
        return;
    }

    if (user.getName() == null || user.getName().isEmpty()) {
        return;
    }

    // Main processing logic
    System.out.println("Processing user: " + user.getName());
}
```

# Final Keyword

## What is `final`?

The `final` keyword in Java is used to restrict modification, inheritance, or overriding. It can be applied to variables, methods, and classes.

### 1. Final Variables

#### Local Final Variables

```java
public void method() {
    final int x = 10;
    // x = 20; // ❌ Compilation error - cannot reassign

    final List<String> names = new ArrayList<>();
    names.add("John"); // ✅ OK - modifying content
    // names = new ArrayList<>(); // ❌ Cannot reassign reference
}
```

#### Final Instance Variables

```java
public class Person {
    private final String name;
    private final int birthYear;

    // Must initialize in constructor
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    // public void setName(String name) {
    //     this.name = name; // ❌ Cannot modify final field
    // }
}
```

#### Final Static Variables (Constants)

```java
public class Constants {
    public static final double PI = 3.14159;
    public static final String APP_NAME = "MyApplication";
    public static final int MAX_USERS = 1000;

    // Alternative initialization in static block
    public static final String VERSION;
    static {
        VERSION = "1.0.0";
    }
}
```

### 2. Final Methods

```java
public class BaseClass {
    // Final method cannot be overridden
    public final void criticalMethod() {
        System.out.println("This method cannot be overridden");
    }

    public void normalMethod() {
        System.out.println("This can be overridden");
    }
}

public class ChildClass extends BaseClass {
    // @Override
    // public void criticalMethod() { // ❌ Cannot override final method
    //     System.out.println("Trying to override");
    // }

    @Override
    public void normalMethod() { // ✅ OK
        System.out.println("Overridden method");
    }
}
```

### 3. Final Classes

```java
// Final class cannot be extended
public final class ImmutableClass {
    private final String value;

    public ImmutableClass(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

// public class ChildClass extends ImmutableClass { // ❌ Cannot extend final class
// }
```

### Real-World Examples

#### 1. Configuration Class

```java
public final class DatabaseConfig {
    public static final String DEFAULT_HOST = "localhost";
    public static final int DEFAULT_PORT = 5432;
    public static final int CONNECTION_TIMEOUT = 30000;

    private final String host;
    private final int port;
    private final String database;

    public DatabaseConfig(String host, int port, String database) {
        this.host = host;
        this.port = port;
        this.database = database;
    }

    public String getConnectionUrl() {
        return String.format("jdbc:postgresql://%s:%d/%s", host, port, database);
    }
}
```

#### 2. Immutable Data Class

```java
public final class Money {
    private final double amount;
    private final String currency;

    public Money(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() { return amount; }
    public String getCurrency() { return currency; }

    // Return new instance instead of modifying
    public Money add(Money other) {
        if (!this.currency.equals(other.currency)) {
            throw new IllegalArgumentException("Cannot add different currencies");
        }
        return new Money(this.amount + other.amount, this.currency);
    }
}
```

#### 3. Final with Collections

```java
public class ShoppingCart {
    // Final reference, but content can change
    private final List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item); // ✅ Modifying content is OK
    }

    public List<String> getItems() {
        // Return unmodifiable view to maintain encapsulation
        return Collections.unmodifiableList(items);
    }

    // public void setItems(List<String> newItems) {
    //     this.items = newItems; // ❌ Cannot reassign final reference
    // }
}
```

### Final with Method Parameters

```java
public class ParameterExample {
    public void processData(final List<String> data, final String prefix) {
        // data = new ArrayList<>(); // ❌ Cannot reassign final parameter
        // prefix = "new prefix";    // ❌ Cannot reassign final parameter

        data.add("item"); // ✅ Can modify content

        for (final String item : data) {
            // item = "modified"; // ❌ Cannot modify final loop variable
            System.out.println(prefix + item);
        }
    }
}
```

### Benefits of Using `final`

1. **Thread Safety**: Final fields are thread-safe after construction
2. **Immutability**: Helps create immutable objects
3. **Performance**: JVM optimizations possible
4. **Code Clarity**: Shows intent - this shouldn't change
5. **Compile-time Checking**: Prevents accidental modifications

### Best Practices

```java
public class BestPractices {
    // 1. Use final for constants
    private static final Logger LOGGER = LoggerFactory.getLogger(BestPractices.class);

    // 2. Make fields final when possible
    private final String id;
    private final LocalDateTime createdAt;

    // 3. Use final for method parameters when appropriate
    public String formatMessage(final String template, final Object... args) {
        return String.format(template, args);
    }

    // 4. Consider final for local variables
    public void processFile(String filename) {
        final Path path = Paths.get(filename);
        final String content = readFile(path);
        // Process content...
    }
}
```

# Creating Files

## Introduction to File Operations

Working with files is a fundamental aspect of Java programming. Java provides comprehensive APIs for creating, reading, writing, and manipulating files through various classes in the `java.io` and `java.nio.file` packages.

### Why File Operations Matter

File operations allow programs to:

- Persist data beyond program execution
- Read configuration files and user data
- Generate reports and logs
- Communicate with other systems through files
- Store and retrieve application state

## Basic File Creation

### Using File Class (Legacy Approach)

```java
import java.io.File;
import java.io.IOException;

public class BasicFileCreation {
    public static void main(String[] args) {
        // Creating a File object (doesn't create actual file yet)
        File file = new File("example.txt");

        try {
            // Check if file exists
            if (file.exists()) {
                System.out.println("File already exists: " + file.getName());
                // File already exists: example.txt
            } else {
                // Create the actual file
                boolean created = file.createNewFile();
                if (created) {
                    System.out.println("File created successfully: " + file.getAbsolutePath());
                    // File created successfully: C:\path\to\your\directory\example.txt
                } else {
                    System.out.println("Failed to create file");
                }
            }

            // File information
            System.out.println("File name: " + file.getName()); // example.txt
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Parent directory: " + file.getParent());
            System.out.println("Is file: " + file.isFile()); // true
            System.out.println("Is directory: " + file.isDirectory()); // false
            System.out.println("Can read: " + file.canRead()); // true
            System.out.println("Can write: " + file.canWrite()); // true
            System.out.println("File size: " + file.length() + " bytes"); // 0 bytes

        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }
}
```

### Using NIO.2 Files Class (Modern Approach)

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

public class ModernFileCreation {
    public static void main(String[] args) {
        // Creating Path objects
        Path filePath = Paths.get("modern-example.txt");
        Path directoryPath = Paths.get("data", "files"); // data/files
        Path fileInDirectory = Paths.get("data", "files", "config.txt"); // data/files/config.txt

        try {
            // Create a simple file
            if (!Files.exists(filePath)) {
                Files.createFile(filePath);
                System.out.println("File created: " + filePath.toAbsolutePath());
                // File created: C:\path\to\your\directory\modern-example.txt
            } else {
                System.out.println("File already exists: " + filePath.getFileName());
            }

            // Create directory structure
            if (!Files.exists(directoryPath)) {
                Files.createDirectories(directoryPath); // Creates all parent directories
                System.out.println("Directory created: " + directoryPath);
                // Directory created: data\files
            }

            // Create file in directory
            if (!Files.exists(fileInDirectory)) {
                Files.createFile(fileInDirectory);
                System.out.println("File created in directory: " + fileInDirectory);
                // File created in directory: data\files\config.txt
            }

            // File attributes
            System.out.println("\n=== File Information ===");
            System.out.println("File name: " + filePath.getFileName()); // modern-example.txt
            System.out.println("Parent: " + filePath.getParent()); // Current directory or null
            System.out.println("Is regular file: " + Files.isRegularFile(filePath)); // true
            System.out.println("Is directory: " + Files.isDirectory(filePath)); // false
            System.out.println("Is readable: " + Files.isReadable(filePath)); // true
            System.out.println("Is writable: " + Files.isWritable(filePath)); // true
            System.out.println("File size: " + Files.size(filePath) + " bytes"); // 0 bytes

        } catch (IOException e) {
            System.out.println("Error with file operations: " + e.getMessage());
        }
    }
}
```

### Creating Temporary Files

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class TemporaryFiles {
    public static void main(String[] args) {
        try {
            // Create temporary file with default settings
            Path tempFile1 = Files.createTempFile("temp", ".txt");
            System.out.println("Temp file 1: " + tempFile1);
            // Temp file 1: C:\Users\username\AppData\Local\Temp\temp1234567890.txt

            // Create temporary file with custom prefix and suffix
            Path tempFile2 = Files.createTempFile("myapp-", "-data.json");
            System.out.println("Temp file 2: " + tempFile2);
            // Temp file 2: C:\Users\username\AppData\Local\Temp\myapp-9876543210-data.json

            // Create temporary directory
            Path tempDir = Files.createTempDirectory("temp-dir-");
            System.out.println("Temp directory: " + tempDir);
            // Temp directory: C:\Users\username\AppData\Local\Temp\temp-dir-1122334455

            // Create file in temporary directory
            Path fileInTempDir = tempDir.resolve("temp-config.properties");
            Files.createFile(fileInTempDir);
            System.out.println("File in temp dir: " + fileInTempDir);

            // Temporary files are automatically deleted on JVM exit
            // But you can also delete them manually
            System.out.println("\n=== Cleanup ===");
            Files.deleteIfExists(fileInTempDir);
            Files.deleteIfExists(tempDir);
            Files.deleteIfExists(tempFile1);
            Files.deleteIfExists(tempFile2);
            System.out.println("Temporary files cleaned up");

        } catch (IOException e) {
            System.out.println("Error with temporary files: " + e.getMessage());
        }
    }
}
```

### Creating Files with Different Options

```java
import java.nio.file.*;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.io.IOException;
import java.util.Set;

public class FileCreationOptions {
    public static void main(String[] args) {
        try {
            // Create file with write operation (creates if doesn't exist)
            Path file1 = Paths.get("created-with-write.txt");
            Files.write(file1, "Hello World".getBytes(), StandardOpenOption.CREATE);
            System.out.println("File created with write: " + file1);
            // File created with write: created-with-write.txt

            // Create file only if it doesn't exist
            Path file2 = Paths.get("create-new-only.txt");
            try {
                Files.write(file2, "Content".getBytes(), StandardOpenOption.CREATE_NEW);
                System.out.println("New file created: " + file2);
            } catch (FileAlreadyExistsException e) {
                System.out.println("File already exists: " + file2);
            }

            // Create file with specific permissions (Unix/Linux/Mac)
            if (System.getProperty("os.name").toLowerCase().contains("nix") ||
                System.getProperty("os.name").toLowerCase().contains("nux") ||
                System.getProperty("os.name").toLowerCase().contains("mac")) {

                Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-r--r--");
                FileAttribute<Set<PosixFilePermission>> fileAttribute =
                    PosixFilePermissions.asFileAttribute(permissions);

                Path file3 = Paths.get("file-with-permissions.txt");
                Files.createFile(file3, fileAttribute);
                System.out.println("File with permissions created: " + file3);
            } else {
                System.out.println("Permission setting example works on Unix-like systems");
            }

            // Create multiple nested directories
            Path nestedPath = Paths.get("level1", "level2", "level3", "deep-file.txt");
            Files.createDirectories(nestedPath.getParent());
            Files.createFile(nestedPath);
            System.out.println("Nested file created: " + nestedPath);
            // Nested file created: level1\level2\level3\deep-file.txt

        } catch (IOException e) {
            System.out.println("Error in file creation: " + e.getMessage());
        }
    }
}
```

# Writing To Files

## File Writing Fundamentals

Writing data to files is essential for persisting information, creating logs, generating reports, and saving user data. Java provides multiple approaches for writing to files, each suitable for different use cases.

### Basic File Writing with FileWriter

```java
import java.io.FileWriter;
import java.io.IOException;

public class BasicFileWriting {
    public static void main(String[] args) {
        String filename = "basic-output.txt";

        try {
            // Create FileWriter (overwrites existing file)
            FileWriter writer = new FileWriter(filename);

            // Write different types of data
            writer.write("Hello, World!\n");
            writer.write("This is line 2\n");
            writer.write("Number: " + 42 + "\n");
            writer.write("Boolean: " + true + "\n");

            // Important: Close the writer to flush data
            writer.close();

            System.out.println("Data written to " + filename);
            // Data written to basic-output.txt

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
```

### Appending to Files

```java
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileAppending {
    public static void main(String[] args) {
        String logFile = "application.log";

        try {
            // FileWriter with append mode (true parameter)
            FileWriter writer = new FileWriter(logFile, true);

            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            writer.write("[" + timestamp + "] Application started\n");
            writer.write("[" + timestamp + "] User logged in\n");
            writer.write("[" + timestamp + "] Processing data...\n");

            writer.close();
            System.out.println("Log entries appended to " + logFile);
            // Log entries appended to application.log

            // Append more data in a separate operation
            FileWriter writer2 = new FileWriter(logFile, true);
            writer2.write("[" + timestamp + "] Processing complete\n");
            writer2.write("[" + timestamp + "] Application finished\n");
            writer2.close();

        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }
}
```

### Writing with BufferedWriter (Performance Optimization)

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileWriting {
    public static void main(String[] args) {
        String filename = "buffered-output.txt";

        try {
            // BufferedWriter for better performance with frequent writes
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

            // Write multiple lines efficiently
            writer.write("=== Student Report ===\n");
            writer.newLine(); // Platform-independent newline

            String[] students = {"Alice Johnson", "Bob Smith", "Charlie Brown", "Diana Prince"};
            int[] scores = {95, 87, 92, 88};

            for (int i = 0; i < students.length; i++) {
                writer.write("Student: " + students[i]);
                writer.newLine();
                writer.write("Score: " + scores[i]);
                writer.newLine();
                writer.write("Grade: " + getLetterGrade(scores[i]));
                writer.newLine();
                writer.write("---");
                writer.newLine();
            }

            // Calculate and write summary
            double average = calculateAverage(scores);
            writer.newLine();
            writer.write("Class Average: " + String.format("%.2f", average));
            writer.newLine();
            writer.write("Total Students: " + students.length);

            writer.close();
            System.out.println("Student report written to " + filename);
            // Student report written to buffered-output.txt

        } catch (IOException e) {
            System.out.println("Error writing buffered file: " + e.getMessage());
        }
    }

    private static String getLetterGrade(int score) {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }

    private static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }
}
```

### Modern File Writing with NIO.2

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ModernFileWriting {
    public static void main(String[] args) {
        try {
            // Method 1: Write string directly
            Path file1 = Paths.get("nio-simple.txt");
            String content = "Hello from NIO.2!\nThis is modern file writing.";
            Files.writeString(file1, content);
            System.out.println("String written to " + file1);
            // String written to nio-simple.txt

            // Method 2: Write bytes
            Path file2 = Paths.get("nio-bytes.txt");
            byte[] data = "Binary data example".getBytes();
            Files.write(file2, data);
            System.out.println("Bytes written to " + file2);
            // Bytes written to nio-bytes.txt

            // Method 3: Write lines collection
            Path file3 = Paths.get("nio-lines.txt");
            List<String> lines = Arrays.asList(
                "Line 1: Introduction",
                "Line 2: Content",
                "Line 3: Conclusion",
                "Line 4: End"
            );
            Files.write(file3, lines);
            System.out.println("Lines written to " + file3);
            // Lines written to nio-lines.txt

            // Method 4: Write with options (append)
            Path file4 = Paths.get("nio-append.txt");
            Files.writeString(file4, "Initial content\n");
            Files.writeString(file4, "Appended content\n", StandardOpenOption.APPEND);
            Files.writeString(file4, "More appended content\n", StandardOpenOption.APPEND);
            System.out.println("Content appended to " + file4);
            // Content appended to nio-append.txt

            // Method 5: Write with create options
            Path file5 = Paths.get("nio-create-new.txt");
            try {
                Files.writeString(file5, "New file content", StandardOpenOption.CREATE_NEW);
                System.out.println("New file created: " + file5);
            } catch (IOException e) {
                System.out.println("File already exists or error: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error in NIO file writing: " + e.getMessage());
        }
    }
}
```

### Writing Structured Data (CSV, JSON-like)

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StructuredDataWriting {
    public static void main(String[] args) {
        // Generate sample data
        List<Employee> employees = generateEmployeeData();

        // Write CSV format
        writeEmployeesCSV(employees, "employees.csv");

        // Write custom format
        writeEmployeesCustom(employees, "employees.txt");

        // Write configuration file
        writeConfigFile("app-config.properties");
    }

    private static List<Employee> generateEmployeeData() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice Johnson", "Developer", 75000, LocalDate.of(2020, 3, 15)));
        employees.add(new Employee(2, "Bob Smith", "Manager", 85000, LocalDate.of(2018, 7, 22)));
        employees.add(new Employee(3, "Charlie Brown", "Analyst", 65000, LocalDate.of(2021, 1, 10)));
        employees.add(new Employee(4, "Diana Prince", "Designer", 70000, LocalDate.of(2019, 11, 5)));
        return employees;
    }

    private static void writeEmployeesCSV(List<Employee> employees, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            // Write CSV header
            writer.write("ID,Name,Position,Salary,HireDate");
            writer.newLine();

            // Write employee data
            for (Employee emp : employees) {
                writer.write(emp.getId() + ",");
                writer.write("\"" + emp.getName() + "\","); // Quotes for names with spaces
                writer.write(emp.getPosition() + ",");
                writer.write(emp.getSalary() + ",");
                writer.write(emp.getHireDate().toString());
                writer.newLine();
            }

            System.out.println("CSV data written to " + filename);
            // CSV data written to employees.csv

        } catch (IOException e) {
            System.out.println("Error writing CSV: " + e.getMessage());
        }
    }

    private static void writeEmployeesCustom(List<Employee> employees, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("EMPLOYEE REPORT");
            writer.newLine();
            writer.write("================");
            writer.newLine();
            writer.newLine();

            for (Employee emp : employees) {
                writer.write("Employee ID: " + emp.getId());
                writer.newLine();
                writer.write("Name: " + emp.getName());
                writer.newLine();
                writer.write("Position: " + emp.getPosition());
                writer.newLine();
                writer.write("Salary: $" + String.format("%,d", emp.getSalary()));
                writer.newLine();
                writer.write("Hire Date: " + emp.getHireDate());
                writer.newLine();
                writer.write("Years of Service: " + emp.getYearsOfService());
                writer.newLine();
                writer.write("------------------------");
                writer.newLine();
                writer.newLine();
            }

            // Summary statistics
            double avgSalary = employees.stream().mapToInt(Employee::getSalary).average().orElse(0);
            writer.write("SUMMARY");
            writer.newLine();
            writer.write("Total Employees: " + employees.size());
            writer.newLine();
            writer.write("Average Salary: $" + String.format("%,.2f", avgSalary));
            writer.newLine();

            System.out.println("Custom format report written to " + filename);
            // Custom format report written to employees.txt

        } catch (IOException e) {
            System.out.println("Error writing custom format: " + e.getMessage());
        }
    }

    private static void writeConfigFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("# Application Configuration");
            writer.newLine();
            writer.write("# Generated on " + LocalDate.now());
            writer.newLine();
            writer.newLine();

            writer.write("app.name=Employee Management System");
            writer.newLine();
            writer.write("app.version=1.0.0");
            writer.newLine();
            writer.write("app.debug=false");
            writer.newLine();
            writer.newLine();

            writer.write("# Database settings");
            writer.newLine();
            writer.write("db.host=localhost");
            writer.newLine();
            writer.write("db.port=5432");
            writer.newLine();
            writer.write("db.name=employee_db");
            writer.newLine();
            writer.newLine();

            writer.write("# Security settings");
            writer.newLine();
            writer.write("security.enabled=true");
            writer.newLine();
            writer.write("security.timeout=3600");
            writer.newLine();

            System.out.println("Configuration file written to " + filename);
            // Configuration file written to app-config.properties

        } catch (IOException e) {
            System.out.println("Error writing config file: " + e.getMessage());
        }
    }

    // Employee class for demonstration
    static class Employee {
        private int id;
        private String name;
        private String position;
        private int salary;
        private LocalDate hireDate;

        public Employee(int id, String name, String position, int salary, LocalDate hireDate) {
            this.id = id;
            this.name = name;
            this.position = position;
            this.salary = salary;
            this.hireDate = hireDate;
        }

        // Getters
        public int getId() { return id; }
        public String getName() { return name; }
        public String getPosition() { return position; }
        public int getSalary() { return salary; }
        public LocalDate getHireDate() { return hireDate; }

        public long getYearsOfService() {
            return java.time.temporal.ChronoUnit.YEARS.between(hireDate, LocalDate.now());
        }
    }
}
```

# Reading From Files

## File Reading Fundamentals

Reading data from files is crucial for loading configuration, processing data, and retrieving stored information. Java provides multiple approaches for reading files, each optimized for different scenarios and data types.

### Basic File Reading with FileReader

```java
import java.io.FileReader;
import java.io.IOException;

public class BasicFileReading {
    public static void main(String[] args) {
        String filename = "sample-input.txt";

        // First, create a sample file to read
        createSampleFile(filename);

        try {
            // Create FileReader
            FileReader reader = new FileReader(filename);

            System.out.println("Reading file character by character:");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character); // Prints each character
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void createSampleFile(String filename) {
        try (java.io.FileWriter writer = new java.io.FileWriter(filename)) {
            writer.write("Hello, World!\n");
            writer.write("This is a sample file.\n");
            writer.write("Line 3 with numbers: 123\n");
            writer.write("Final line.");
        } catch (IOException e) {
            System.out.println("Error creating sample file: " + e.getMessage());
        }
    }
}
```

### Reading with BufferedReader (Recommended)

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReading {
    public static void main(String[] args) {
        String filename = "buffered-input.txt";

        // Create sample content
        createDetailedSampleFile(filename);

        try {
            // BufferedReader for efficient line-by-line reading
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            System.out.println("Reading file line by line:");
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
            // Output:
            // 1: Student Report
            // 2: =============
            // 3:
            // 4: Alice Johnson - Score: 95 - Grade: A
            // ... etc

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void createDetailedSampleFile(String filename) {
        try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(filename))) {
            writer.write("Student Report");
            writer.newLine();
            writer.write("=============");
            writer.newLine();
            writer.newLine();
            writer.write("Alice Johnson - Score: 95 - Grade: A");
            writer.newLine();
            writer.write("Bob Smith - Score: 87 - Grade: B");
            writer.newLine();
            writer.write("Charlie Brown - Score: 92 - Grade: A");
            writer.newLine();
            writer.write("Diana Prince - Score: 88 - Grade: B");
            writer.newLine();
            writer.newLine();
            writer.write("Class Average: 90.5");
        } catch (IOException e) {
            System.out.println("Error creating detailed sample: " + e.getMessage());
        }
    }
}
```

### Modern File Reading with NIO.2

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class ModernFileReading {
    public static void main(String[] args) {
        try {
            // Create sample files for demonstration
            createVariousSampleFiles();

            // Method 1: Read entire file as string
            Path file1 = Paths.get("nio-sample.txt");
            String content = Files.readString(file1);
            System.out.println("=== Entire file content ===");
            System.out.println(content);
            // Complete file content printed as single string

            // Method 2: Read all lines as List
            Path file2 = Paths.get("nio-lines.txt");
            List<String> lines = Files.readAllLines(file2);
            System.out.println("\n=== Reading as lines ===");
            for (int i = 0; i < lines.size(); i++) {
                System.out.println("Line " + (i + 1) + ": " + lines.get(i));
            }
            // Line 1: First line
            // Line 2: Second line
            // Line 3: Third line

            // Method 3: Read as bytes
            Path file3 = Paths.get("nio-binary.txt");
            byte[] bytes = Files.readAllBytes(file3);
            System.out.println("\n=== File size in bytes ===");
            System.out.println("File size: " + bytes.length + " bytes");
            System.out.println("First 10 characters: " + new String(bytes, 0, Math.min(10, bytes.length)));

            // Method 4: Stream processing (for large files)
            Path file4 = Paths.get("nio-large.txt");
            System.out.println("\n=== Stream processing ===");
            Files.lines(file4)
                .filter(line -> line.contains("important"))
                .forEach(line -> System.out.println("Important: " + line));
            // Only lines containing "important" are printed

        } catch (IOException e) {
            System.out.println("Error in modern file reading: " + e.getMessage());
        }
    }

    private static void createVariousSampleFiles() throws IOException {
        // Create simple content file
        Files.writeString(Paths.get("nio-sample.txt"),
            "Hello NIO.2!\nThis is modern file reading.\nJava makes it easy!");

        // Create lines file
        List<String> lines = List.of("First line", "Second line", "Third line");
        Files.write(Paths.get("nio-lines.txt"), lines);

        // Create binary content file
        Files.writeString(Paths.get("nio-binary.txt"),
            "Binary data: \u0001\u0002\u0003 and text data mixed");

        // Create large file with some important lines
        StringBuilder largeContent = new StringBuilder();
        for (int i = 1; i <= 50; i++) {
            if (i % 10 == 0) {
                largeContent.append("Line ").append(i).append(": This is important information\n");
            } else {
                largeContent.append("Line ").append(i).append(": Regular content\n");
            }
        }
        Files.writeString(Paths.get("nio-large.txt"), largeContent.toString());
    }
}
```

### Reading and Parsing Structured Data

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StructuredDataReading {
    public static void main(String[] args) {
        // Create sample structured files
        createStructuredFiles();

        // Read CSV data
        List<Employee> employees = readEmployeesFromCSV("employees-input.csv");
        displayEmployees(employees);

        // Read configuration file
        Map<String, String> config = readConfigFile("app-config-input.properties");
        displayConfiguration(config);

        // Read log file
        analyzeLogFile("application-input.log");
    }

    private static List<Employee> readEmployeesFromCSV(String filename) {
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            // Skip header line
            String headerLine = reader.readLine();
            System.out.println("CSV Header: " + headerLine);

            String line;
            while ((line = reader.readLine()) != null) {
                // Parse CSV line
                String[] parts = line.split(",");
                if (parts.length >= 5) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1].replace("\"", ""); // Remove quotes
                    String position = parts[2];
                    int salary = Integer.parseInt(parts[3]);
                    String hireDate = parts[4];

                    employees.add(new Employee(id, name, position, salary, hireDate));
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing number in CSV: " + e.getMessage());
        }

        return employees;
    }

    private static Map<String, String> readConfigFile(String filename) {
        Map<String, String> config = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();

                // Skip comments and empty lines
                if (line.isEmpty() || line.startsWith("#")) {
                    continue;
                }

                // Parse key=value pairs
                int equalIndex = line.indexOf('=');
                if (equalIndex > 0) {
                    String key = line.substring(0, equalIndex).trim();
                    String value = line.substring(equalIndex + 1).trim();
                    config.put(key, value);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading config: " + e.getMessage());
        }

        return config;
    }

    private static void analyzeLogFile(String filename) {
        System.out.println("\n=== Log File Analysis ===");

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int totalLines = 0;
            int errorLines = 0;
            int warningLines = 0;
            List<String> errors = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                totalLines++;

                if (line.contains("ERROR")) {
                    errorLines++;
                    errors.add(line);
                } else if (line.contains("WARN")) {
                    warningLines++;
                }
            }

            System.out.println("Total log entries: " + totalLines); // Total log entries: 8
            System.out.println("Error entries: " + errorLines); // Error entries: 2
            System.out.println("Warning entries: " + warningLines); // Warning entries: 1

            if (!errors.isEmpty()) {
                System.out.println("\nError details:");
                for (String error : errors) {
                    System.out.println("  " + error);
                }
            }

        } catch (IOException e) {
            System.out.println("Error analyzing log: " + e.getMessage());
        }
    }

    private static void displayEmployees(List<Employee> employees) {
        System.out.println("\n=== Employees Read from CSV ===");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println("Total employees: " + employees.size()); // Total employees: 4
    }

    private static void displayConfiguration(Map<String, String> config) {
        System.out.println("\n=== Configuration Settings ===");
        for (Map.Entry<String, String> entry : config.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        System.out.println("Total settings: " + config.size()); // Total settings: 8
    }

    private static void createStructuredFiles() {
        // Create CSV file
        try (java.io.PrintWriter writer = new java.io.PrintWriter("employees-input.csv")) {
            writer.println("ID,Name,Position,Salary,HireDate");
            writer.println("1,\"Alice Johnson\",Developer,75000,2020-03-15");
            writer.println("2,\"Bob Smith\",Manager,85000,2018-07-22");
            writer.println("3,\"Charlie Brown\",Analyst,65000,2021-01-10");
            writer.println("4,\"Diana Prince\",Designer,70000,2019-11-05");
        } catch (IOException e) {
            System.out.println("Error creating CSV: " + e.getMessage());
        }

        // Create config file
        try (java.io.PrintWriter writer = new java.io.PrintWriter("app-config-input.properties")) {
            writer.println("# Application Configuration");
            writer.println("app.name=Employee Management System");
            writer.println("app.version=1.0.0");
            writer.println("app.debug=false");
            writer.println("");
            writer.println("# Database settings");
            writer.println("db.host=localhost");
            writer.println("db.port=5432");
            writer.println("db.name=employee_db");
            writer.println("security.enabled=true");
        } catch (IOException e) {
            System.out.println("Error creating config: " + e.getMessage());
        }

        // Create log file
        try (java.io.PrintWriter writer = new java.io.PrintWriter("application-input.log")) {
            writer.println("[2024-08-04 10:00:00] INFO Application started");
            writer.println("[2024-08-04 10:00:05] INFO User alice logged in");
            writer.println("[2024-08-04 10:05:12] WARN Database connection slow");
            writer.println("[2024-08-04 10:10:30] INFO Processing 100 records");
            writer.println("[2024-08-04 10:15:45] ERROR Failed to connect to external API");
            writer.println("[2024-08-04 10:16:00] INFO Retrying connection");
            writer.println("[2024-08-04 10:16:15] INFO Connection restored");
            writer.println("[2024-08-04 10:20:00] ERROR Validation failed for record ID 12345");
        } catch (IOException e) {
            System.out.println("Error creating log: " + e.getMessage());
        }
    }

    // Simple Employee class for demonstration
    static class Employee {
        private int id;
        private String name;
        private String position;
        private int salary;
        private String hireDate;

        public Employee(int id, String name, String position, int salary, String hireDate) {
            this.id = id;
            this.name = name;
            this.position = position;
            this.salary = salary;
            this.hireDate = hireDate;
        }

        @Override
        public String toString() {
            return String.format("Employee{id=%d, name='%s', position='%s', salary=%d, hireDate='%s'}",
                id, name, position, salary, hireDate);
        }
    }
}
```

# Try With Resources

## Introduction to Try-With-Resources

The try-with-resources statement, introduced in Java 7, is a powerful feature that automatically manages resources that implement the `AutoCloseable` interface. It ensures that resources are properly closed even if an exception occurs, eliminating the need for explicit `finally` blocks for resource cleanup.

### Basic Try-With-Resources Syntax

```java
import java.io.FileWriter;
import java.io.IOException;

public class BasicTryWithResources {
    public static void main(String[] args) {
        // Traditional approach (Java 6 and earlier)
        traditionalFileWriting();

        // Modern approach with try-with-resources
        modernFileWriting();
    }

    private static void traditionalFileWriting() {
        System.out.println("=== Traditional Approach ===");
        FileWriter writer = null;
        try {
            writer = new FileWriter("traditional-output.txt");
            writer.write("Hello from traditional approach!");
            System.out.println("File written successfully"); // File written successfully
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Manual resource cleanup - easy to forget!
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }

    private static void modernFileWriting() {
        System.out.println("\n=== Try-With-Resources Approach ===");

        // Resources declared in try parentheses are automatically closed
        try (FileWriter writer = new FileWriter("modern-output.txt")) {
            writer.write("Hello from try-with-resources!");
            System.out.println("File written successfully"); // File written successfully

            // No need for explicit close() - handled automatically

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // writer.close() is called automatically here, even if exception occurs
    }
}
```

### Multiple Resources in Try-With-Resources

```java
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class MultipleResourcesExample {
    public static void main(String[] args) {
        // Create source file first
        createSourceFile();

        // Copy file using multiple resources
        copyFileWithMultipleResources();

        // Read and process file
        readAndProcessFile();
    }

    private static void createSourceFile() {
        try (FileWriter writer = new FileWriter("source.txt")) {
            writer.write("Line 1: Original content\n");
            writer.write("Line 2: More data here\n");
            writer.write("Line 3: Additional information\n");
            writer.write("Line 4: Final line\n");
        } catch (IOException e) {
            System.out.println("Error creating source file: " + e.getMessage());
        }
    }

    private static void copyFileWithMultipleResources() {
        System.out.println("=== Copying File with Multiple Resources ===");

        // Multiple resources in single try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader("source.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("destination.txt"))) {

            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                // Add line numbers to copied content
                writer.write(lineNumber + ": " + line);
                writer.newLine();
                lineNumber++;
            }

            System.out.println("File copied successfully with line numbers");
            // File copied successfully with line numbers

        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
        // Both reader and writer are automatically closed
    }

    private static void readAndProcessFile() {
        System.out.println("\n=== Reading and Processing File ===");

        try (BufferedReader reader = new BufferedReader(new FileReader("destination.txt"))) {

            System.out.println("Copied file contents:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                // 1: Line 1: Original content
                // 2: Line 2: More data here
                // 3: Line 3: Additional information
                // 4: Line 4: Final line
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
```

### Try-With-Resources with NIO.2

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.stream.Stream;

public class NIOTryWithResources {
    public static void main(String[] args) {
        // Create sample data
        createLargeDataFile();

        // Process large file with streaming
        processLargeFileWithStream();

        // Directory operations
        processDirectoryContents();
    }

    private static void createLargeDataFile() {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("large-data.txt"))) {

            writer.write("# Large Data File\n");
            writer.write("# Generated data for streaming example\n\n");

            for (int i = 1; i <= 1000; i++) {
                if (i % 100 == 0) {
                    writer.write("MILESTONE: Reached " + i + " entries\n");
                } else if (i % 50 == 0) {
                    writer.write("CHECKPOINT: Entry " + i + " - halfway mark\n");
                } else {
                    writer.write("DATA: Record " + i + " - value=" + (i * 10) + "\n");
                }
            }

            System.out.println("Large data file created with 1000+ lines");

        } catch (IOException e) {
            System.out.println("Error creating large file: " + e.getMessage());
        }
    }

    private static void processLargeFileWithStream() {
        System.out.println("\n=== Processing Large File with Stream ===");

        Path filePath = Paths.get("large-data.txt");

        // Stream is AutoCloseable - works with try-with-resources
        try (Stream<String> lines = Files.lines(filePath)) {

            // Find and count milestones
            long milestoneCount = lines
                .filter(line -> line.startsWith("MILESTONE"))
                .peek(line -> System.out.println("Found: " + line))
                .count();

            System.out.println("Total milestones found: " + milestoneCount);
            // Found: MILESTONE: Reached 100 entries
            // Found: MILESTONE: Reached 200 entries
            // ... etc
            // Total milestones found: 10

        } catch (IOException e) {
            System.out.println("Error processing large file: " + e.getMessage());
        }

        // Analyze data entries
        try (Stream<String> lines = Files.lines(filePath)) {

            lines
                .filter(line -> line.startsWith("DATA"))
                .mapToInt(line -> {
                    // Extract value from "DATA: Record X - value=Y"
                    String[] parts = line.split("value=");
                    return parts.length > 1 ? Integer.parseInt(parts[1]) : 0;
                })
                .filter(value -> value > 5000) // High values only
                .limit(5) // First 5 high values
                .forEach(value -> System.out.println("High value: " + value));
            // High value: 5010
            // High value: 5020
            // High value: 5030
            // High value: 5040
            // High value: 5050

        } catch (IOException e) {
            System.out.println("Error analyzing data: " + e.getMessage());
        }
    }

    private static void processDirectoryContents() {
        System.out.println("\n=== Processing Directory Contents ===");

        Path currentDir = Paths.get(".");

        // List directory contents
        try (Stream<Path> paths = Files.list(currentDir)) {

            System.out.println("Files in current directory:");
            paths
                .filter(Files::isRegularFile)
                .filter(path -> path.toString().endsWith(".txt"))
                .forEach(path -> {
                    try {
                        long size = Files.size(path);
                        System.out.println(path.getFileName() + " (" + size + " bytes)");
                        // source.txt (67 bytes)
                        // destination.txt (89 bytes)
                        // large-data.txt (45123 bytes)
                    } catch (IOException e) {
                        System.out.println(path.getFileName() + " (size unknown)");
                    }
                });

        } catch (IOException e) {
            System.out.println("Error listing directory: " + e.getMessage());
        }
    }
}
```

### Custom Resources with AutoCloseable

```java
import java.io.IOException;

public class CustomAutoCloseableExample {
    public static void main(String[] args) {
        // Using custom resources with try-with-resources
        demonstrateCustomResources();

        // Database connection simulation
        demonstrateDatabaseConnection();
    }

    private static void demonstrateCustomResources() {
        System.out.println("=== Custom AutoCloseable Resources ===");

        try (FileProcessor processor = new FileProcessor("data-processor");
             NetworkConnection connection = new NetworkConnection("api.example.com")) {

            processor.processFile("input.txt");
            connection.sendData("Hello, Server!");

            System.out.println("Operations completed successfully");
            // File processor initialized: data-processor
            // Network connection established to: api.example.com
            // Processing file: input.txt
            // Sending data: Hello, Server!
            // Operations completed successfully

        } catch (Exception e) {
            System.out.println("Error in operations: " + e.getMessage());
        }
        // Resources automatically closed in reverse order:
        // Network connection closed
        // File processor closed: data-processor
    }

    private static void demonstrateDatabaseConnection() {
        System.out.println("\n=== Database Connection Example ===");

        try (DatabaseConnection db = new DatabaseConnection("localhost", 5432, "testdb");
             ResultSetWrapper results = db.executeQuery("SELECT * FROM users")) {

            while (results.hasNext()) {
                String user = results.next();
                System.out.println("User: " + user);
            }
            // Database connected to: localhost:5432/testdb
            // Executing query: SELECT * FROM users
            // User: alice
            // User: bob
            // User: charlie

        } catch (Exception e) {
            System.out.println("Database error: " + e.getMessage());
        }
        // Result set closed
        // Database connection closed
    }
}

// Custom AutoCloseable implementations
class FileProcessor implements AutoCloseable {
    private String processorName;

    public FileProcessor(String name) {
        this.processorName = name;
        System.out.println("File processor initialized: " + name);
    }

    public void processFile(String filename) {
        System.out.println("Processing file: " + filename);
        // Simulate file processing
    }

    @Override
    public void close() {
        System.out.println("File processor closed: " + processorName);
    }
}

class NetworkConnection implements AutoCloseable {
    private String serverAddress;

    public NetworkConnection(String address) throws IOException {
        this.serverAddress = address;
        System.out.println("Network connection established to: " + address);

        // Simulate potential connection failure
        if (address.equals("invalid.server")) {
            throw new IOException("Cannot connect to server");
        }
    }

    public void sendData(String data) {
        System.out.println("Sending data: " + data);
    }

    @Override
    public void close() {
        System.out.println("Network connection closed");
    }
}

class DatabaseConnection implements AutoCloseable {
    private String connectionString;

    public DatabaseConnection(String host, int port, String database) {
        this.connectionString = host + ":" + port + "/" + database;
        System.out.println("Database connected to: " + connectionString);
    }

    public ResultSetWrapper executeQuery(String sql) {
        System.out.println("Executing query: " + sql);
        return new ResultSetWrapper();
    }

    @Override
    public void close() {
        System.out.println("Database connection closed");
    }
}

class ResultSetWrapper implements AutoCloseable {
    private String[] mockData = {"alice", "bob", "charlie"};
    private int currentIndex = 0;

    public boolean hasNext() {
        return currentIndex < mockData.length;
    }

    public String next() {
        return mockData[currentIndex++];
    }

    @Override
    public void close() {
        System.out.println("Result set closed");
    }
}
```

### Error Handling in Try-With-Resources

```java
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesErrorHandling {
    public static void main(String[] args) {
        // Demonstrate exception handling scenarios
        demonstrateResourceException();
        demonstrateBodyException();
        demonstrateBothExceptions();
    }

    private static void demonstrateResourceException() {
        System.out.println("=== Resource Creation Exception ===");

        try (FileWriter writer = new FileWriter("/invalid/path/file.txt")) {
            writer.write("This won't execute");
        } catch (IOException e) {
            System.out.println("Caught resource exception: " + e.getMessage());
            // Caught resource exception: The system cannot find the path specified
        }
    }

    private static void demonstrateBodyException() {
        System.out.println("\n=== Try Body Exception ===");

        try (FileWriter writer = new FileWriter("valid-file.txt")) {
            writer.write("Some content");

            // Simulate an exception in try body
            if (true) { // Condition to force exception
                throw new RuntimeException("Something went wrong in processing");
            }

            writer.write("This won't execute");

        } catch (IOException e) {
            System.out.println("Caught IO exception: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught runtime exception: " + e.getMessage());
            // Caught runtime exception: Something went wrong in processing
        }
        // FileWriter is still closed automatically despite the exception
    }

    private static void demonstrateBothExceptions() {
        System.out.println("\n=== Both Resource and Body Exceptions ===");

        try (ProblematicResource resource = new ProblematicResource()) {
            System.out.println("Using problematic resource");

            // This will cause an exception
            resource.doSomethingRisky();

        } catch (Exception e) {
            System.out.println("Primary exception: " + e.getMessage());
            // Primary exception: Operation failed

            // Check for suppressed exceptions (from close() method)
            Throwable[] suppressed = e.getSuppressed();
            for (Throwable t : suppressed) {
                System.out.println("Suppressed exception: " + t.getMessage());
                // Suppressed exception: Error closing problematic resource
            }
        }
    }
}

// Resource that throws exceptions in both usage and closing
class ProblematicResource implements AutoCloseable {

    public ProblematicResource() {
        System.out.println("Problematic resource created");
    }

    public void doSomethingRisky() throws Exception {
        throw new Exception("Operation failed");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Attempting to close problematic resource");
        throw new Exception("Error closing problematic resource");
    }
}
```

### Best Practices and Performance Benefits

```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TryWithResourcesBestPractices {
    public static void main(String[] args) {
        // Create test data
        createTestData();

        // Demonstrate best practices
        demonstrateResourceOrdering();
        demonstrateNestedResources();
        demonstrateResourceReuse();
    }

    private static void createTestData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test-data.txt"))) {
            for (int i = 1; i <= 100; i++) {
                writer.write("Line " + i + ": Test data entry number " + i);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error creating test data: " + e.getMessage());
        }
    }

    private static void demonstrateResourceOrdering() {
        System.out.println("=== Resource Ordering (Closed in Reverse Order) ===");

        try (// Resources are closed in reverse order of declaration
             ResourceWithLogging resource1 = new ResourceWithLogging("First");
             ResourceWithLogging resource2 = new ResourceWithLogging("Second");
             ResourceWithLogging resource3 = new ResourceWithLogging("Third")) {

            System.out.println("All resources created, now using them...");
            resource1.doWork();
            resource2.doWork();
            resource3.doWork();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Output shows closing order: Third, Second, First
    }

    private static void demonstrateNestedResources() {
        System.out.println("\n=== Avoiding Nested Try-With-Resources ===");

        // ❌ Don't do this - unnecessarily nested
        try (BufferedReader reader1 = new BufferedReader(new FileReader("test-data.txt"))) {
            String firstLine = reader1.readLine();

            try (BufferedWriter writer1 = new BufferedWriter(new FileWriter("output1.txt"))) {
                writer1.write("First line was: " + firstLine);
            }
        } catch (IOException e) {
            System.out.println("Nested approach error: " + e.getMessage());
        }

        // ✅ Better - single try-with-resources
        try (BufferedReader reader2 = new BufferedReader(new FileReader("test-data.txt"));
             BufferedWriter writer2 = new BufferedWriter(new FileWriter("output2.txt"))) {

            String line;
            int count = 0;
            while ((line = reader2.readLine()) != null && count < 5) {
                writer2.write("Line " + (count + 1) + ": " + line);
                writer2.newLine();
                count++;
            }

            System.out.println("Processed " + count + " lines efficiently");
            // Processed 5 lines efficiently

        } catch (IOException e) {
            System.out.println("Single try-with-resources error: " + e.getMessage());
        }
    }

    private static void demonstrateResourceReuse() {
        System.out.println("\n=== Resource Management Tips ===");

        // Tip 1: Use appropriate buffer sizes
        try (BufferedReader reader = new BufferedReader(new FileReader("test-data.txt"), 8192)) { // 8KB buffer

            long lineCount = reader.lines().count();
            System.out.println("Total lines counted with large buffer: " + lineCount);
            // Total lines counted with large buffer: 100

        } catch (IOException e) {
            System.out.println("Buffer demo error: " + e.getMessage());
        }

        // Tip 2: Use NIO.2 for simpler code when possible
        try {
            long fileSize = Files.size(Paths.get("test-data.txt"));
            long lineCount = Files.lines(Paths.get("test-data.txt")).count(); // Auto-closed stream

            System.out.println("File size: " + fileSize + " bytes, Lines: " + lineCount);
            // File size: 2900 bytes, Lines: 100

        } catch (IOException e) {
            System.out.println("NIO.2 demo error: " + e.getMessage());
        }

        // Tip 3: Consider using Files utility methods for simple operations
        try {
            String content = Files.readString(Paths.get("output2.txt"));
            System.out.println("Quick read complete, content length: " + content.length());
            // Quick read complete, content length: 123

        } catch (IOException e) {
            System.out.println("Quick read error: " + e.getMessage());
        }
    }
}

// Helper class for demonstrating resource ordering
class ResourceWithLogging implements AutoCloseable {
    private String name;

    public ResourceWithLogging(String name) {
        this.name = name;
        System.out.println("Created resource: " + name);
    }

    public void doWork() {
        System.out.println("Resource " + name + " is working");
    }

    @Override
    public void close() {
        System.out.println("Closing resource: " + name);
    }
}
```

# Taking User Input

## Introduction to User Input in Java

Getting user input is essential for creating interactive Java applications. Java provides several ways to read user input, with the `Scanner` class being the most commonly used and beginner-friendly approach.

### Why User Input Matters

User input allows programs to:

- Interact with users dynamically
- Process real-time data
- Create personalized experiences
- Build interactive applications like calculators, games, and forms

## Scanner Class

The `Scanner` class is part of `java.util` package and provides methods to read different types of input from various sources, including keyboard input from the console.

### Basic Scanner Setup

```java
import java.util.Scanner;

public class BasicScanner {
    public static void main(String[] args) {
        // Create Scanner object to read from standard input (keyboard)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!"); // Hello, John! (if user enters "John")

        // Good practice: close the scanner
        scanner.close();
    }
}
```

### Scanner Constructor Options

```java
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScannerSources {
    public static void main(String[] args) {
        // Reading from console (standard input)
        Scanner consoleScanner = new Scanner(System.in);

        // Reading from a string
        String data = "John 25 Engineer";
        Scanner stringScanner = new Scanner(data);
        String name = stringScanner.next(); // "John"
        int age = stringScanner.nextInt(); // 25
        String profession = stringScanner.next(); // "Engineer"

        System.out.println("Name: " + name + ", Age: " + age + ", Profession: " + profession);
        // Name: John, Age: 25, Profession: Engineer

        // Reading from a file
        try {
            Scanner fileScanner = new Scanner(new File("data.txt"));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println("File content: " + line);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        stringScanner.close();
        consoleScanner.close();
    }
}
```

### Scanner Delimiter Customization

```java
import java.util.Scanner;

public class ScannerDelimiters {
    public static void main(String[] args) {
        // Default delimiter is whitespace
        String csvData = "apple,banana,orange,grape";
        Scanner scanner = new Scanner(csvData);

        // Change delimiter to comma
        scanner.useDelimiter(",");

        System.out.println("Fruits:");
        while (scanner.hasNext()) {
            String fruit = scanner.next();
            System.out.println("- " + fruit); // - apple, - banana, - orange, - grape
        }

        scanner.close();

        // Using regex as delimiter
        String phoneData = "123-456-7890";
        Scanner phoneScanner = new Scanner(phoneData);
        phoneScanner.useDelimiter("-");

        System.out.println("\nPhone number parts:");
        while (phoneScanner.hasNext()) {
            System.out.println(phoneScanner.next()); // 123, 456, 7890
        }

        phoneScanner.close();
    }
}
```

## Reading Different Data Types

The Scanner class provides specific methods for reading different data types, each with proper error handling considerations.

### String Input Methods

```java
import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // next() - reads until whitespace
        System.out.print("Enter your first name: ");
        String firstName = scanner.next(); // Stops at space, tab, or newline
        System.out.println("First name: " + firstName); // "John" (if input is "John Doe")

        // nextLine() - reads entire line including spaces
        System.out.print("Enter your full name: ");
        scanner.nextLine(); // Consume remaining newline from previous input
        String fullName = scanner.nextLine(); // Reads until newline
        System.out.println("Full name: " + fullName); // "John Doe Smith"

        // Reading multiple words with next()
        System.out.print("Enter three colors separated by spaces: ");
        String color1 = scanner.next(); // "red"
        String color2 = scanner.next(); // "blue"
        String color3 = scanner.next(); // "green"
        System.out.println("Colors: " + color1 + ", " + color2 + ", " + color3);
        // Colors: red, blue, green

        scanner.close();
    }
}
```

### Numeric Input Methods

```java
import java.util.Scanner;
import java.util.InputMismatchException;

public class NumericInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading integers
        System.out.print("Enter your age: ");
        try {
            int age = scanner.nextInt();
            System.out.println("You are " + age + " years old"); // You are 25 years old
        } catch (InputMismatchException e) {
            System.out.println("Invalid integer input");
            scanner.nextLine(); // Clear invalid input
        }

        // Reading different numeric types
        System.out.print("Enter a byte value (0-127): ");
        byte byteValue = scanner.nextByte(); // 100
        System.out.println("Byte value: " + byteValue); // Byte value: 100

        System.out.print("Enter a short value: ");
        short shortValue = scanner.nextShort(); // 32000
        System.out.println("Short value: " + shortValue); // Short value: 32000

        System.out.print("Enter a long value: ");
        long longValue = scanner.nextLong(); // 1234567890L
        System.out.println("Long value: " + longValue); // Long value: 1234567890

        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat(); // 3.14f
        System.out.println("Float value: " + floatValue); // Float value: 3.14

        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble(); // 3.14159
        System.out.println("Double value: " + doubleValue); // Double value: 3.14159

        scanner.close();
    }
}
```

### Boolean Input

```java
import java.util.Scanner;

public class BooleanInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading boolean values
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean(); // true or false
        System.out.println("Student status: " + isStudent); // Student status: true

        // Custom boolean input handling
        System.out.print("Do you like programming? (yes/no): ");
        scanner.nextLine(); // Consume newline
        String response = scanner.nextLine().toLowerCase();
        boolean likesProgramming = response.equals("yes") || response.equals("y");
        System.out.println("Likes programming: " + likesProgramming); // Likes programming: true

        scanner.close();
    }
}
```

### Input Validation and Error Handling

```java
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Safe integer input with validation
        int age = getValidInteger(scanner, "Enter your age (0-120): ", 0, 120);
        System.out.println("Valid age entered: " + age); // Valid age entered: 25

        // Safe double input
        double salary = getValidDouble(scanner, "Enter your salary: ", 0.0, Double.MAX_VALUE);
        System.out.println("Salary: $" + String.format("%.2f", salary)); // Salary: $50000.00

        // Non-empty string input
        String name = getNonEmptyString(scanner, "Enter your name: ");
        System.out.println("Name: " + name); // Name: John Doe

        scanner.close();
    }

    public static int getValidInteger(Scanner scanner, String prompt, int min, int max) {
        int value;
        while (true) {
            System.out.print(prompt);
            try {
                value = scanner.nextInt();
                if (value >= min && value <= max) {
                    break;
                } else {
                    System.out.println("Please enter a value between " + min + " and " + max);
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        return value;
    }

    public static double getValidDouble(Scanner scanner, String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            try {
                value = scanner.nextDouble();
                if (value >= min && value <= max) {
                    break;
                } else {
                    System.out.println("Please enter a value between " + min + " and " + max);
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        return value;
    }

    public static String getNonEmptyString(Scanner scanner, String prompt) {
        String value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextLine().trim();
            if (!value.isEmpty()) {
                break;
            } else {
                System.out.println("Input cannot be empty. Please try again.");
            }
        }
        return value;
    }
}
```

### Practical Applications

#### 1. Simple Calculator

```java
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble(); // 10.5

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0); // +

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble(); // 5.2

        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = num1 + num2; // 15.7
                break;
            case '-':
                result = num1 - num2; // 5.3
                break;
            case '*':
                result = num1 * num2; // 54.6
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2; // 2.019...
                } else {
                    System.out.println("Error: Division by zero!");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                validOperation = false;
        }

        if (validOperation) {
            System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operator, num2, result);
            // Result: 10.50 + 5.20 = 15.70
        }

        scanner.close();
    }
}
```

#### 2. Student Grade Manager

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> grades = new ArrayList<>();

        System.out.println("=== Student Grade Manager ===");
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine(); // "Alice Johnson"

        System.out.print("How many grades to enter? ");
        int numGrades = scanner.nextInt(); // 4

        for (int i = 1; i <= numGrades; i++) {
            System.out.print("Enter grade " + i + " (0-100): ");
            double grade = scanner.nextDouble(); // 85.5, 92.0, 78.5, 96.0

            if (grade >= 0 && grade <= 100) {
                grades.add(grade);
            } else {
                System.out.println("Invalid grade. Please enter a value between 0 and 100.");
                i--; // Repeat this iteration
            }
        }

        // Calculate statistics
        double sum = 0;
        double highest = grades.get(0);
        double lowest = grades.get(0);

        for (double grade : grades) {
            sum += grade;
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }

        double average = sum / grades.size();

        // Display results
        System.out.println("\n=== Grade Report for " + studentName + " ===");
        System.out.println("Grades entered: " + grades); // [85.5, 92.0, 78.5, 96.0]
        System.out.printf("Average: %.2f%n", average); // Average: 88.00
        System.out.println("Highest grade: " + highest); // Highest grade: 96.0
        System.out.println("Lowest grade: " + lowest); // Lowest grade: 78.5
        System.out.println("Letter grade: " + getLetterGrade(average)); // Letter grade: B+

        scanner.close();
    }

    public static String getLetterGrade(double average) {
        if (average >= 97) return "A+";
        else if (average >= 93) return "A";
        else if (average >= 90) return "A-";
        else if (average >= 87) return "B+";
        else if (average >= 83) return "B";
        else if (average >= 80) return "B-";
        else if (average >= 77) return "C+";
        else if (average >= 73) return "C";
        else if (average >= 70) return "C-";
        else if (average >= 67) return "D+";
        else if (average >= 65) return "D";
        else return "F";
    }
}
```

#### 3. Interactive Menu System

```java
import java.util.Scanner;

public class InteractiveMenu {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        System.out.println("=== Restaurant Ordering System ===");

        while (running) {
            showMenu();
            int choice = getValidChoice(); // User enters: 2

            switch (choice) {
                case 1:
                    viewMenu();
                    break;
                case 2:
                    placeOrder(); // This executes
                    break;
                case 3:
                    checkOrderStatus();
                    break;
                case 4:
                    System.out.println("Thank you for visiting!");
                    running = false;
                    break;
            }
        }

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("\n--- Main Menu ---");
        System.out.println("1. View Menu");
        System.out.println("2. Place Order");
        System.out.println("3. Check Order Status");
        System.out.println("4. Exit");
        System.out.print("Enter your choice (1-4): ");
    }

    private static int getValidChoice() {
        while (true) {
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (choice >= 1 && choice <= 4) {
                    return choice;
                } else {
                    System.out.print("Invalid choice. Please enter 1-4: ");
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Please enter a number (1-4): ");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }

    private static void viewMenu() {
        System.out.println("\n--- Restaurant Menu ---");
        System.out.println("1. Burger - $8.99");
        System.out.println("2. Pizza - $12.99");
        System.out.println("3. Pasta - $10.99");
        System.out.println("4. Salad - $7.99");
        System.out.println("5. Drink - $2.99");
    }

    private static void placeOrder() {
        System.out.println("\n--- Place Order ---");
        viewMenu();

        System.out.print("Enter item number (1-5): ");
        int itemChoice = getValidItemChoice(); // User enters: 2

        System.out.print("Enter quantity: ");
        int quantity = getValidQuantity(); // User enters: 2

        String[] items = {"Burger", "Pizza", "Pasta", "Salad", "Drink"};
        double[] prices = {8.99, 12.99, 10.99, 7.99, 2.99};

        String selectedItem = items[itemChoice - 1]; // "Pizza"
        double itemPrice = prices[itemChoice - 1]; // 12.99
        double totalPrice = itemPrice * quantity; // 25.98

        System.out.println("\n--- Order Summary ---");
        System.out.println("Item: " + selectedItem); // Item: Pizza
        System.out.println("Quantity: " + quantity); // Quantity: 2
        System.out.printf("Unit Price: $%.2f%n", itemPrice); // Unit Price: $12.99
        System.out.printf("Total: $%.2f%n", totalPrice); // Total: $25.98
        System.out.println("Order placed successfully!");
    }

    private static int getValidItemChoice() {
        while (true) {
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice >= 1 && choice <= 5) {
                    return choice;
                } else {
                    System.out.print("Invalid item. Please enter 1-5: ");
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Please enter a number (1-5): ");
                scanner.nextLine();
            }
        }
    }

    private static int getValidQuantity() {
        while (true) {
            try {
                int quantity = scanner.nextInt();
                scanner.nextLine();

                if (quantity > 0) {
                    return quantity;
                } else {
                    System.out.print("Quantity must be positive. Please try again: ");
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Please enter a positive number: ");
                scanner.nextLine();
            }
        }
    }

    private static void checkOrderStatus() {
        System.out.println("\n--- Order Status ---");
        System.out.print("Enter order ID: ");
        String orderId = scanner.nextLine(); // "ORD123"
        System.out.println("Order " + orderId + " is being prepared. Estimated time: 15 minutes.");
        // Order ORD123 is being prepared. Estimated time: 15 minutes.
    }
}
```

### Best Practices and Common Pitfalls

#### 1. Scanner Resource Management

```java
import java.util.Scanner;

public class ScannerBestPractices {
    public static void main(String[] args) {
        // ✅ Good: Use try-with-resources for automatic closing
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");
        } // Scanner automatically closed here

        // ✅ Alternative: Manual closing
        Scanner scanner2 = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner2.nextInt();
            System.out.println("You are " + age + " years old");
        } finally {
            scanner2.close(); // Ensure scanner is closed
        }
    }
}
```

#### 2. Handling Mixed Input Types

```java
import java.util.Scanner;

public class MixedInputHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ❌ Common problem: nextLine() after numeric input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Leaves newline in buffer
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reads empty string!

        System.out.println("Age: " + age + ", Name: '" + name + "'"); // Name is empty

        // ✅ Solution: Consume the leftover newline
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age2 = scanner2.nextInt();
        scanner2.nextLine(); // Consume leftover newline
        System.out.print("Enter your name: ");
        String name2 = scanner2.nextLine(); // Now reads correctly

        System.out.println("Age: " + age2 + ", Name: '" + name2 + "'"); // Works correctly

        scanner.close();
        scanner2.close();
    }
}
```

#### 3. Input Validation Strategies

```java
import java.util.Scanner;

public class ValidationStrategies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Strategy 1: hasNextXxx() methods for checking
        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("Valid integer: " + number);
        } else {
            System.out.println("Not a valid integer");
            scanner.nextLine(); // Clear invalid input
        }

        // Strategy 2: Exception handling
        System.out.print("Enter another number: ");
        try {
            double value = scanner.nextDouble();
            System.out.println("Valid number: " + value);
        } catch (Exception e) {
            System.out.println("Invalid number format");
            scanner.nextLine(); // Clear invalid input
        }

        // Strategy 3: String input with parsing
        System.out.print("Enter an integer (string method): ");
        scanner.nextLine(); // Clear buffer
        String input = scanner.nextLine();
        try {
            int parsed = Integer.parseInt(input);
            System.out.println("Parsed integer: " + parsed);
        } catch (NumberFormatException e) {
            System.out.println("Could not parse as integer: " + input);
        }

        scanner.close();
    }
}
```

### Scanner vs Other Input Methods

```java
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputMethodComparison {
    public static void main(String[] args) throws IOException {
        // Method 1: Scanner (most common, feature-rich)
        System.out.println("=== Using Scanner ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text with Scanner: ");
        String scannerInput = scanner.nextLine(); // "Hello World"
        System.out.println("Scanner result: " + scannerInput); // Scanner result: Hello World

        // Method 2: BufferedReader (faster for large inputs)
        System.out.println("\n=== Using BufferedReader ===");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter text with BufferedReader: ");
        String readerInput = reader.readLine(); // "Hello Java"
        System.out.println("BufferedReader result: " + readerInput); // BufferedReader result: Hello Java

        // Method 3: Console class (for password input)
        System.out.println("\n=== Using Console ===");
        java.io.Console console = System.console();
        if (console != null) {
            String consoleInput = console.readLine("Enter text with Console: ");
            System.out.println("Console result: " + consoleInput);

            // For passwords (input hidden)
            char[] password = console.readPassword("Enter password: ");
            System.out.println("Password length: " + password.length);
        } else {
            System.out.println("Console not available (running in IDE)");
        }

        scanner.close();
        reader.close();
    }
}
```

# Exception Handling Fundamentals

## Introduction to Exception Handling

Exception handling is a fundamental programming concept that allows you to gracefully handle runtime errors and unexpected situations in your Java programs. Rather than letting your program crash, exception handling provides a structured way to detect, handle, and recover from errors.

### Why Exception Handling Matters

Exception handling enables you to:

- Prevent program crashes from unexpected errors
- Provide meaningful error messages to users
- Implement fallback strategies when operations fail
- Create robust, production-ready applications
- Debug and troubleshoot issues more effectively

### Common Scenarios Requiring Exception Handling

```java
public class CommonExceptionScenarios {
    public static void main(String[] args) {
        // File operations - file might not exist
        // readFile("nonexistent.txt");

        // Network operations - connection might fail
        // connectToServer("unreachable-server.com");

        // User input - user might enter invalid data
        // int age = Integer.parseInt("not-a-number");

        // Array access - index might be out of bounds
        // int[] numbers = {1, 2, 3};
        // int value = numbers[10]; // IndexOutOfBoundsException

        // Division operations - divisor might be zero
        // int result = 10 / 0; // ArithmeticException

        System.out.println("These commented examples would cause exceptions");
    }
}
```

## What Is An Exception

An exception is an event that occurs during program execution that disrupts the normal flow of instructions. In Java, exceptions are objects that represent error conditions or unexpected situations.

### Exception Basics

```java
public class ExceptionBasics {
    public static void main(String[] args) {
        System.out.println("Program starts");

        // This will cause an ArithmeticException
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result); // This line never executes
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!"); // Error: Cannot divide by zero!
        }

        System.out.println("Program continues after exception handling"); // Program continues after exception handling
    }
}
```

### What Happens Without Exception Handling

```java
public class WithoutExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Starting program"); // Starting program

        // This will crash the program
        int[] numbers = {1, 2, 3};
        int value = numbers[5]; // ArrayIndexOutOfBoundsException

        System.out.println("This line will never execute"); // Never reached
    }
}
```

### Anatomy of an Exception

```java
public class ExceptionAnatomy {
    public static void main(String[] args) {
        try {
            String text = null;
            int length = text.length(); // NullPointerException
        } catch (NullPointerException e) {
            // Exception object contains useful information
            System.out.println("Exception type: " + e.getClass().getSimpleName()); // NullPointerException
            System.out.println("Exception message: " + e.getMessage()); // null (or implementation-specific message)
            System.out.println("Stack trace:");
            e.printStackTrace(); // Prints detailed stack trace
        }
    }
}
```

### Exception vs Error vs Runtime Issues

```java
public class ExceptionTypes {
    public static void main(String[] args) {
        // 1. Compile-time errors (not exceptions)
        // int x = "hello"; // Won't compile

        // 2. Runtime exceptions (can be handled)
        try {
            int[] arr = new int[5];
            arr[10] = 100; // ArrayIndexOutOfBoundsException at runtime
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
            // Array index out of bounds: Index 10 out of bounds for length 5
        }

        // 3. Logical errors (program runs but produces wrong results)
        int temperature = 25;
        if (temperature > 30) { // Logic might be wrong for the intended purpose
            System.out.println("It's hot");
        } else {
            System.out.println("It's not hot"); // It's not hot
        }
    }
}
```

## Try-Catch Blocks

The try-catch block is the fundamental mechanism for handling exceptions in Java. The `try` block contains code that might throw an exception, while the `catch` block handles the exception if it occurs.

### Basic Try-Catch Syntax

```java
public class BasicTryCatch {
    public static void main(String[] args) {
        // Basic syntax
        try {
            // Code that might throw an exception
            int result = 100 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Cannot divide by zero!"); // Cannot divide by zero!
        }

        // Program continues normally
        System.out.println("Program execution continues"); // Program execution continues
    }
}
```

### Try-Catch with User Input

```java
import java.util.Scanner;
import java.util.InputMismatchException;

public class UserInputExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        try {
            int age = scanner.nextInt(); // May throw InputMismatchException
            System.out.println("Your age is: " + age); // Your age is: 25 (if valid input)

            if (age < 0) {
                System.out.println("Age cannot be negative");
            } else if (age > 150) {
                System.out.println("That seems too old to be realistic");
            } else {
                System.out.println("Valid age entered");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number."); // If user enters "abc"
        }

        scanner.close();
    }
}
```

### File Operations with Try-Catch

```java
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileOperationExceptions {
    public static void main(String[] args) {
        String filename = "data.txt";

        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = reader.readLine();
            System.out.println("First line: " + line); // First line: [content of file]

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename); // File not found: data.txt
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage()); // Error reading file: [specific error]
        }
    }
}
```

### Array Operations with Try-Catch

```java
public class ArrayExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Safe array access
        for (int i = 0; i <= 10; i++) {
            try {
                int value = numbers[i];
                System.out.println("Index " + i + ": " + value);
                // Index 0: 10, Index 1: 20, ..., Index 4: 50
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index " + i + " is out of bounds");
                // Index 5 is out of bounds, Index 6 is out of bounds, etc.
            }
        }
    }
}
```

### String Operations with Try-Catch

```java
public class StringExceptionHandling {
    public static void main(String[] args) {
        String[] testStrings = {"123", "456", "abc", null, "789"};

        for (String str : testStrings) {
            try {
                int number = Integer.parseInt(str);
                int doubled = number * 2;
                System.out.println(str + " * 2 = " + doubled);
                // 123 * 2 = 246, 456 * 2 = 912, 789 * 2 = 1578
            } catch (NumberFormatException e) {
                System.out.println("'" + str + "' is not a valid number"); // 'abc' is not a valid number
            } catch (NullPointerException e) {
                System.out.println("Cannot parse null string"); // Cannot parse null string
            }
        }
    }
}
```

## Multiple Catch Blocks

When code can throw different types of exceptions, you can use multiple catch blocks to handle each exception type differently. This allows for more specific error handling and better user experience.

### Basic Multiple Catch Blocks

```java
public class MultipleCatchBlocks {
    public static void main(String[] args) {
        String[] data = {"10", "0", "abc", null};

        for (String item : data) {
            try {
                int number = Integer.parseInt(item);
                int result = 100 / number;
                System.out.println("100 / " + number + " = " + result);
                // 100 / 10 = 10
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + item);
                // Invalid number format: abc
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
                // Cannot divide by zero
            } catch (NullPointerException e) {
                System.out.println("Cannot parse null value");
                // Cannot parse null value
            }
        }
    }
}
```

### File Processing with Multiple Exceptions

```java
import java.io.*;
import java.util.Scanner;

public class FileProcessingExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = scanner.nextLine(); // user enters: "data.txt"

        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }

            reader.close();
            System.out.println("File processed successfully");

        } catch (FileNotFoundException e) {
            System.out.println("Error: File '" + filename + "' was not found");
            System.out.println("Please check the filename and try again");
        } catch (SecurityException e) {
            System.out.println("Error: Permission denied to read file '" + filename + "'");
        } catch (IOException e) {
            System.out.println("Error: Problem reading from file '" + filename + "'");
            System.out.println("Details: " + e.getMessage());
        }

        scanner.close();
    }
}
```

### Network Operations with Multiple Exceptions

```java
import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.net.SocketTimeoutException;

public class NetworkExceptionHandling {
    public static void main(String[] args) {
        String[] urls = {
            "https://www.google.com",
            "invalid-url",
            "https://nonexistent-site-12345.com"
        };

        for (String urlString : urls) {
            try {
                URL url = new URL(urlString);
                var connection = url.openConnection();
                connection.setConnectTimeout(5000); // 5 seconds
                connection.connect();

                System.out.println("Successfully connected to: " + urlString);
                // Successfully connected to: https://www.google.com

            } catch (MalformedURLException e) {
                System.out.println("Invalid URL format: " + urlString);
                // Invalid URL format: invalid-url
            } catch (UnknownHostException e) {
                System.out.println("Cannot resolve host: " + urlString);
                // Cannot resolve host: https://nonexistent-site-12345.com
            } catch (SocketTimeoutException e) {
                System.out.println("Connection timeout for: " + urlString);
            } catch (IOException e) {
                System.out.println("Connection error for " + urlString + ": " + e.getMessage());
            }
        }
    }
}
```

### Order of Catch Blocks Matters

```java
public class CatchBlockOrder {
    public static void main(String[] args) {
        try {
            String text = null;
            int length = text.length(); // NullPointerException (which extends RuntimeException)
        }
        // ✅ Correct order: Most specific first
        catch (NullPointerException e) {
            System.out.println("Null pointer exception"); // This executes
        }
        catch (RuntimeException e) {
            System.out.println("Runtime exception"); // More general
        }
        catch (Exception e) {
            System.out.println("General exception"); // Most general
        }

        // ❌ This would cause compilation error:
        /*
        try {
            // some code
        } catch (Exception e) {          // Too general first
            // handle
        } catch (NullPointerException e) { // Unreachable code!
            // This will never execute
        }
        */
    }
}
```

### Practical Calculator with Multiple Exceptions

```java
import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculatorExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble(); // 10.5

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0); // /

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble(); // 0

            double result = performOperation(num1, operator, num2);
            System.out.printf("%.2f %c %.2f = %.2f%n", num1, operator, num2, result);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input: Please enter valid numbers");
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
            // Math error: Cannot divide by zero
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operator: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        scanner.close();
    }

    private static double performOperation(double a, char op, double b) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Unsupported operator: " + op);
        }
    }
}
```

## Using OR Within Catch

Java 7 introduced the ability to catch multiple exception types in a single catch block using the pipe (`|`) operator. This feature, called multi-catch, reduces code duplication when handling different exceptions in the same way.

### Basic Multi-Catch Syntax

```java
public class MultiCatchBasics {
    public static void main(String[] args) {
        String[] testData = {"123", "abc", null, "0"};

        for (String data : testData) {
            try {
                int number = Integer.parseInt(data);
                int result = 100 / number;
                System.out.println("100 / " + number + " = " + result); // 100 / 123 = 0
            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println("Invalid operation with data: " + data);
                // Invalid operation with data: abc
                // Invalid operation with data: 0
            } catch (NullPointerException e) {
                System.out.println("Null data encountered"); // Null data encountered
            }
        }
    }
}
```

### File Operations with Multi-Catch

```java
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileMultiCatch {
    public static void main(String[] args) {
        String[] filenames = {"existing.txt", "readonly.txt", "nonexistent.txt"};

        for (String filename : filenames) {
            try {
                // Try to read and process file
                String content = Files.readString(Paths.get(filename));
                System.out.println("File " + filename + " content: " + content.substring(0, Math.min(50, content.length())));

            } catch (FileNotFoundException | SecurityException e) {
                System.out.println("Cannot access file " + filename + ": " + e.getClass().getSimpleName());
                // Cannot access file nonexistent.txt: FileNotFoundException
            } catch (IOException e) {
                System.out.println("IO error reading " + filename + ": " + e.getMessage());
            }
        }
    }
}
```

### Network and Parsing Multi-Catch

```java
import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;

public class NetworkParsingMultiCatch {
    public static void main(String[] args) {
        String[] urlStrings = {
            "https://api.github.com/users/octocat",
            "invalid-url-format",
            "https://httpbin.org/status/500"
        };

        for (String urlString : urlStrings) {
            try {
                URL url = new URL(urlString);
                var connection = url.openConnection();

                // Simulate parsing response
                String response = "mock response data";
                int statusCode = Integer.parseInt(response.substring(0, 3)); // This might fail

                System.out.println("Successfully processed: " + urlString);

            } catch (MalformedURLException | NumberFormatException e) {
                System.out.println("Format error processing " + urlString + ": " + e.getClass().getSimpleName());
                // Format error processing invalid-url-format: MalformedURLException
            } catch (IOException e) {
                System.out.println("Network error for " + urlString + ": " + e.getMessage());
            }
        }
    }
}
```

### Database Operations Multi-Catch

```java
import java.sql.*;

public class DatabaseMultiCatch {
    public static void main(String[] args) {
        String[] queries = {
            "SELECT * FROM users WHERE id = 1",
            "INVALID SQL QUERY",
            "SELECT * FROM nonexistent_table"
        };

        String dbUrl = "jdbc:h2:mem:testdb";

        for (String query : queries) {
            try (Connection conn = DriverManager.getConnection(dbUrl);
                 Statement stmt = conn.createStatement()) {

                ResultSet rs = stmt.executeQuery(query);
                System.out.println("Query executed successfully: " + query.substring(0, 20) + "...");

            } catch (SQLException | IllegalArgumentException e) {
                System.out.println("Database error with query '" + query + "': " + e.getClass().getSimpleName());
                // Database error with query 'INVALID SQL QUERY': SQLException
            }
        }
    }
}
```

### Multi-Catch vs Traditional Approach

```java
public class MultiCatchComparison {
    public static void main(String[] args) {
        String input = "abc123";

        // Traditional approach - code duplication
        try {
            int number = Integer.parseInt(input);
            double sqrt = Math.sqrt(number);
            if (sqrt < 0) throw new IllegalArgumentException("Negative sqrt");
        } catch (NumberFormatException e) {
            System.out.println("Error processing input: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error processing input: " + e.getMessage());
        }

        // Multi-catch approach - cleaner
        try {
            int number = Integer.parseInt(input);
            double sqrt = Math.sqrt(number);
            if (sqrt < 0) throw new IllegalArgumentException("Negative sqrt");
        } catch (NumberFormatException | IllegalArgumentException e) {
            System.out.println("Error processing input: " + e.getMessage());
            // Error processing input: For input string: "abc123"
        }
    }
}
```

### Advanced Multi-Catch with Custom Processing

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class AdvancedMultiCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a mathematical expression (e.g., 10/2): ");
        String expression = scanner.nextLine(); // "10/0" or "abc/def"

        try {
            double result = evaluateExpression(expression);
            System.out.println("Result: " + result);

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid expression format. Please use format: number/number");
            System.out.println("Error type: " + e.getClass().getSimpleName());
            // Error type: NumberFormatException (for "abc/def")
        } catch (ArithmeticException e) {
            System.out.println("Mathematical error: " + e.getMessage());
            // Mathematical error: Division by zero (for "10/0")
        }

        scanner.close();
    }

    private static double evaluateExpression(String expression) {
        String[] parts = expression.split("/");

        if (parts.length != 2) {
            throw new ArrayIndexOutOfBoundsException("Expression must contain exactly one '/' operator");
        }

        double num1 = Double.parseDouble(parts[0].trim());
        double num2 = Double.parseDouble(parts[1].trim());

        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }

        return num1 / num2;
    }
}
```

### Multi-Catch Limitations and Best Practices

```java
public class MultiCatchLimitations {
    public static void main(String[] args) {
        // ✅ Good: Related exceptions that need same handling
        try {
            // some operation
            throw new IllegalArgumentException("test");
        } catch (IllegalArgumentException | IllegalStateException e) {
            // Both are programming errors that should be handled similarly
            System.out.println("Invalid program state: " + e.getMessage());
            // Invalid program state: test
        }

        // ❌ Avoid: Unrelated exceptions in multi-catch
        /*
        try {
            // some operation
        } catch (IOException | IllegalArgumentException e) {
            // These are very different types of errors
            // Better to handle them separately
        }
        */

        // ✅ Good: Separate handling for different error types
        try {
            // file operation that might fail
            throw new java.io.FileNotFoundException("File not found");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File issue: " + e.getMessage()); // File issue: File not found
        } catch (IllegalArgumentException e) {
            System.out.println("Program logic issue: " + e.getMessage());
        }
    }
}
```

## The Exception Class

The `Exception` class is the superclass of all exceptions in Java. Understanding the Exception class hierarchy and its methods is crucial for effective exception handling and debugging.

### Exception Class Hierarchy

```java
public class ExceptionHierarchy {
    public static void main(String[] args) {
        // Demonstrate different exception types and their hierarchy
        Exception[] exceptions = {
            new Exception("Generic exception"),
            new RuntimeException("Runtime exception"),
            new IllegalArgumentException("Illegal argument"),
            new NullPointerException("Null pointer"),
            new NumberFormatException("Number format error"),
            new java.io.IOException("IO exception"),
            new java.io.FileNotFoundException("File not found")
        };

        for (Exception e : exceptions) {
            System.out.println("Exception: " + e.getClass().getSimpleName());
            System.out.println("  Message: " + e.getMessage());
            System.out.println("  Superclass: " + e.getClass().getSuperclass().getSimpleName());
            System.out.println("  Is RuntimeException: " + (e instanceof RuntimeException));
            System.out.println();
        }

        /*
        Output shows hierarchy:
        Exception: Exception
          Message: Generic exception
          Superclass: Throwable
          Is RuntimeException: false

        Exception: RuntimeException
          Message: Runtime exception
          Superclass: Exception
          Is RuntimeException: true

        Exception: IllegalArgumentException
          Message: Illegal argument
          Superclass: RuntimeException
          Is RuntimeException: true
        ...
        */
    }
}
```

### Essential Exception Methods

```java
import java.io.FileReader;
import java.io.IOException;

public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            // This will throw a FileNotFoundException
            FileReader file = new FileReader("nonexistent.txt");
        } catch (Exception e) {
            // Demonstrate all important Exception methods

            System.out.println("=== Exception Information ===");

            // getMessage() - returns the detail message
            System.out.println("Message: " + e.getMessage());
            // Message: nonexistent.txt (The system cannot find the file specified)

            // getClass() - returns the runtime class
            System.out.println("Exception Type: " + e.getClass().getName());
            // Exception Type: java.io.FileNotFoundException

            System.out.println("Simple Name: " + e.getClass().getSimpleName());
            // Simple Name: FileNotFoundException

            // toString() - returns class name and message
            System.out.println("toString(): " + e.toString());
            // toString(): java.io.FileNotFoundException: nonexistent.txt

            // getLocalizedMessage() - returns localized message
            System.out.println("Localized Message: " + e.getLocalizedMessage());

            // getCause() - returns the cause of the exception
            System.out.println("Cause: " + e.getCause());
            // Cause: null (no underlying cause)

            // printStackTrace() - prints the stack trace
            System.out.println("\n=== Stack Trace ===");
            e.printStackTrace();
        }
    }
}
```

### Custom Exception with Full Information

```java
public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            validateAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("=== Custom Exception Details ===");
            System.out.println("Message: " + e.getMessage()); // Message: Age cannot be negative: -5
            System.out.println("Invalid Value: " + e.getInvalidValue()); // Invalid Value: -5
            System.out.println("Suggestion: " + e.getSuggestion()); // Suggestion: Please enter an age between 0 and 150
            System.out.println();
            e.printStackTrace();
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative: " + age, age, "Please enter an age between 0 and 150");
        }
        if (age > 150) {
            throw new InvalidAgeException("Age too high: " + age, age, "Please enter a realistic age");
        }
        System.out.println("Valid age: " + age);
    }
}

// Custom exception class with additional information
class InvalidAgeException extends Exception {
    private final int invalidValue;
    private final String suggestion;

    public InvalidAgeException(String message, int invalidValue, String suggestion) {
        super(message);
        this.invalidValue = invalidValue;
        this.suggestion = suggestion;
    }

    public int getInvalidValue() {
        return invalidValue;
    }

    public String getSuggestion() {
        return suggestion;
    }
}
```

### Exception Chaining and Cause

```java
import java.io.IOException;

public class ExceptionChaining {
    public static void main(String[] args) {
        try {
            processFile("important.txt");
        } catch (DataProcessingException e) {
            System.out.println("=== Exception Chain ===");
            System.out.println("Main exception: " + e.getMessage());
            // Main exception: Failed to process file: important.txt

            System.out.println("Original cause: " + e.getCause().getMessage());
            // Original cause: File processing error

            System.out.println("Root cause type: " + e.getCause().getCause().getClass().getSimpleName());
            // Root cause type: IOException

            // Print full chain
            System.out.println("\n=== Full Exception Chain ===");
            Throwable current = e;
            int level = 0;
            while (current != null) {
                System.out.println("Level " + level + ": " + current.getClass().getSimpleName() + " - " + current.getMessage());
                current = current.getCause();
                level++;
            }

            /*
            Level 0: DataProcessingException - Failed to process file: important.txt
            Level 1: FileOperationException - File processing error
            Level 2: IOException - Simulated IO error
            */
        }
    }

    public static void processFile(String filename) throws DataProcessingException {
        try {
            readFile(filename);
        } catch (FileOperationException e) {
            // Wrap the exception with more context
            throw new DataProcessingException("Failed to process file: " + filename, e);
        }
    }

    public static void readFile(String filename) throws FileOperationException {
        try {
            // Simulate file reading that fails
            throw new IOException("Simulated IO error");
        } catch (IOException e) {
            // Wrap the IOException
            throw new FileOperationException("File processing error", e);
        }
    }
}

// Custom exception classes
class DataProcessingException extends Exception {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}

class FileOperationException extends Exception {
    public FileOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
```

### Exception State and Information

```java
import java.util.Date;

public class ExceptionState {
    public static void main(String[] args) {
        try {
            simulateError();
        } catch (DetailedException e) {
            System.out.println("=== Detailed Exception Information ===");
            System.out.println("Timestamp: " + e.getTimestamp()); // Timestamp: [current time]
            System.out.println("Thread: " + e.getThreadName()); // Thread: main
            System.out.println("Method: " + e.getMethodName()); // Method: simulateError
            System.out.println("Error Code: " + e.getErrorCode()); // Error Code: ERR_001
            System.out.println("Severity: " + e.getSeverity()); // Severity: HIGH
            System.out.println();

            // Stack trace analysis
            StackTraceElement[] stackTrace = e.getStackTrace();
            System.out.println("=== Stack Trace Analysis ===");
            for (int i = 0; i < Math.min(3, stackTrace.length); i++) {
                StackTraceElement element = stackTrace[i];
                System.out.printf("Frame %d: %s.%s() line %d%n",
                    i, element.getClassName(), element.getMethodName(), element.getLineNumber());
            }
        }
    }

    public static void simulateError() throws DetailedException {
        throw new DetailedException("Simulated error for demonstration", "ERR_001", "HIGH");
    }
}

// Enhanced exception with additional state information
class DetailedException extends Exception {
    private final Date timestamp;
    private final String threadName;
    private final String methodName;
    private final String errorCode;
    private final String severity;

    public DetailedException(String message, String errorCode, String severity) {
        super(message);
        this.timestamp = new Date();
        this.threadName = Thread.currentThread().getName();
        this.methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        this.errorCode = errorCode;
        this.severity = severity;
    }

    public Date getTimestamp() { return timestamp; }
    public String getThreadName() { return threadName; }
    public String getMethodName() { return methodName; }
    public String getErrorCode() { return errorCode; }
    public String getSeverity() { return severity; }
}
```

## Finally Keyword

The `finally` block is a crucial part of exception handling that ensures certain code executes regardless of whether an exception occurs or not. It's commonly used for cleanup operations like closing files, database connections, or releasing resources.

### Basic Finally Block

```java
import java.util.Scanner;

public class BasicFinally {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt(); // May throw InputMismatchException
            System.out.println("You entered: " + number); // You entered: 42

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); // Error: [exception message]

        } finally {
            // This block ALWAYS executes
            System.out.println("Finally block executed"); // Finally block executed

            if (scanner != null) {
                scanner.close();
                System.out.println("Scanner closed"); // Scanner closed
            }
        }

        System.out.println("Program continues"); // Program continues
    }
}
```

### Finally with File Operations

```java
import java.io.*;

public class FileOperationsFinally {
    public static void main(String[] args) {
        String filename = "test.txt";
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;

        try {
            writer = new FileWriter(filename);
            bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("Hello, World!"); // May throw IOException
            bufferedWriter.write("\nSecond line");

            System.out.println("File written successfully"); // File written successfully

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());

        } finally {
            // Cleanup resources - this ALWAYS executes
            System.out.println("Cleaning up resources..."); // Cleaning up resources...

            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                    System.out.println("BufferedWriter closed"); // BufferedWriter closed
                }
            } catch (IOException e) {
                System.out.println("Error closing BufferedWriter: " + e.getMessage());
            }

            try {
                if (writer != null) {
                    writer.close();
                    System.out.println("FileWriter closed"); // FileWriter closed
                }
            } catch (IOException e) {
                System.out.println("Error closing FileWriter: " + e.getMessage());
            }
        }
    }
}
```

### Finally vs Try-with-Resources

```java
import java.io.*;

public class FinallyVsTryWithResources {
    public static void main(String[] args) {
        // Traditional approach with finally
        traditionalApproach("traditional.txt");

        // Modern approach with try-with-resources
        modernApproach("modern.txt");
    }

    public static void traditionalApproach(String filename) {
        System.out.println("=== Traditional Finally Approach ===");

        FileWriter writer = null;
        try {
            writer = new FileWriter(filename);
            writer.write("Traditional approach content");
            System.out.println("Traditional file written"); // Traditional file written

        } catch (IOException e) {
            System.out.println("Error in traditional approach: " + e.getMessage());

        } finally {
            if (writer != null) {
                try {
                    writer.close();
                    System.out.println("Traditional writer closed"); // Traditional writer closed
                } catch (IOException e) {
                    System.out.println("Error closing traditional writer: " + e.getMessage());
                }
            }
        }
    }

    public static void modernApproach(String filename) {
        System.out.println("\n=== Modern Try-with-Resources Approach ===");

        // Resources are automatically closed
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Modern approach content");
            System.out.println("Modern file written"); // Modern file written

        } catch (IOException e) {
            System.out.println("Error in modern approach: " + e.getMessage());
        }
        // No finally needed - FileWriter is automatically closed
        System.out.println("Modern writer automatically closed"); // Modern writer automatically closed
    }
}
```

### Finally with Multiple Return Points

```java
public class FinallyWithReturns {
    public static void main(String[] args) {
        System.out.println("Result 1: " + testMethod(5)); // Result 1: Finally executed - Value: 5
        System.out.println("Result 2: " + testMethod(-3)); // Result 2: Finally executed - Value: -3
        System.out.println("Result 3: " + testMethod(0)); // Result 3: Finally executed - Value: 0
    }

    public static String testMethod(int value) {
        try {
            if (value < 0) {
                System.out.println("Negative value detected");
                return "Negative";
            }

            if (value == 0) {
                throw new IllegalArgumentException("Zero not allowed");
            }

            System.out.println("Positive value: " + value);
            return "Positive";

        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
            return "Exception";

        } finally {
            // This ALWAYS executes, regardless of return statements
            System.out.println("Finally executed - Value: " + value);
        }
    }
}
```

### Finally for Resource Management

```java
import java.sql.*;

public class DatabaseFinally {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Simulate database connection
            connection = DriverManager.getConnection("jdbc:h2:mem:testdb");
            statement = connection.createStatement();

            // Create and populate table
            statement.execute("CREATE TABLE users (id INT, name VARCHAR(50))");
            statement.execute("INSERT INTO users VALUES (1, 'Alice'), (2, 'Bob')");

            // Query data
            resultSet = statement.executeQuery("SELECT * FROM users");

            System.out.println("=== Query Results ===");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id") +
                                 ", Name: " + resultSet.getString("name"));
                // ID: 1, Name: Alice
                // ID: 2, Name: Bob
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());

        } finally {
            // Cleanup database resources in reverse order
            System.out.println("Cleaning up database resources...");

            if (resultSet != null) {
                try {
                    resultSet.close();
                    System.out.println("ResultSet closed"); // ResultSet closed
                } catch (SQLException e) {
                    System.out.println("Error closing ResultSet: " + e.getMessage());
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                    System.out.println("Statement closed"); // Statement closed
                } catch (SQLException e) {
                    System.out.println("Error closing Statement: " + e.getMessage());
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Connection closed"); // Connection closed
                } catch (SQLException e) {
                    System.out.println("Error closing Connection: " + e.getMessage());
                }
            }
        }
    }
}
```

### Finally with Exception in Finally Block

```java
public class FinallyExceptionHandling {
    public static void main(String[] args) {
        System.out.println("=== Finally Block Exception Example ===");

        try {
            riskyMethod();
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getMessage());
            // Caught in main: Exception in finally block
        }
    }

    public static void riskyMethod() throws Exception {
        try {
            System.out.println("In try block"); // In try block
            throw new RuntimeException("Original exception");

        } catch (RuntimeException e) {
            System.out.println("In catch block: " + e.getMessage()); // In catch block: Original exception

        } finally {
            System.out.println("In finally block"); // In finally block

            // Exception in finally block suppresses the original exception
            throw new Exception("Exception in finally block");
        }
    }
}
```

### Best Practices with Finally

```java
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FinallyBestPractices {
    public static void main(String[] args) {
        // ✅ Good: Simple resource management
        demonstrateGoodPractice();

        // ❌ Avoid: Complex logic in finally
        // demonstratePoorPractice();
    }

    public static void demonstrateGoodPractice() {
        System.out.println("=== Good Finally Practice ===");

        List<String> lines = new ArrayList<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            System.out.println("File read successfully, lines: " + lines.size());

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            // Error reading file: data.txt (The system cannot find the file specified)

        } finally {
            // ✅ Good: Simple, focused cleanup
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("Reader closed successfully"); // Reader closed successfully
                } catch (IOException e) {
                    System.out.println("Warning: Error closing reader: " + e.getMessage());
                }
            }
        }
    }

    /*
    // ❌ Poor practice - don't do this
    public static void demonstratePoorPractice() {
        try {
            // some operation
        } finally {
            // ❌ Don't put complex business logic in finally
            // ❌ Don't throw exceptions from finally
            // ❌ Don't modify return values in finally
        }
    }
    */
}
```

## Exception Hierarchy

Understanding Java's exception hierarchy is crucial for effective exception handling. The hierarchy determines which exceptions you must handle and which ones you can optionally handle.

### The Complete Exception Hierarchy

```java
public class ExceptionHierarchyDemo {
    public static void main(String[] args) {
        // Demonstrate the exception hierarchy
        System.out.println("=== Java Exception Hierarchy ===");
        System.out.println("Throwable");
        System.out.println("├── Error (Unchecked)");
        System.out.println("│   ├── OutOfMemoryError");
        System.out.println("│   ├── StackOverflowError");
        System.out.println("│   └── VirtualMachineError");
        System.out.println("└── Exception");
        System.out.println("    ├── RuntimeException (Unchecked)");
        System.out.println("    │   ├── NullPointerException");
        System.out.println("    │   ├── IllegalArgumentException");
        System.out.println("    │   ├── ArrayIndexOutOfBoundsException");
        System.out.println("    │   └── NumberFormatException");
        System.out.println("    └── Checked Exceptions");
        System.out.println("        ├── IOException");
        System.out.println("        ├── SQLException");
        System.out.println("        └── ClassNotFoundException");

        // Demonstrate hierarchy in practice
        demonstrateHierarchy();
    }

    public static void demonstrateHierarchy() {
        System.out.println("\n=== Hierarchy in Practice ===");

        // Create instances of different exception types
        Throwable[] exceptions = {
            new Error("System error"),
            new Exception("Generic exception"),
            new RuntimeException("Runtime exception"),
            new IllegalArgumentException("Invalid argument"),
            new NullPointerException("Null reference"),
            new java.io.IOException("IO error"),
            new java.sql.SQLException("Database error")
        };

        for (Throwable throwable : exceptions) {
            analyzeException(throwable);
        }
    }

    public static void analyzeException(Throwable throwable) {
        System.out.println("\nAnalyzing: " + throwable.getClass().getSimpleName());
        System.out.println("  Is Error: " + (throwable instanceof Error));
        System.out.println("  Is Exception: " + (throwable instanceof Exception));
        System.out.println("  Is RuntimeException: " + (throwable instanceof RuntimeException));
        System.out.println("  Must be handled: " + mustBeHandled(throwable));

        // Show inheritance chain
        Class<?> current = throwable.getClass();
        System.out.print("  Inheritance: ");
        while (current != null && !current.equals(Object.class)) {
            System.out.print(current.getSimpleName());
            current = current.getSuperclass();
            if (current != null && !current.equals(Object.class)) {
                System.out.print(" → ");
            }
        }
        System.out.println();
    }

    public static boolean mustBeHandled(Throwable throwable) {
        // Checked exceptions must be handled
        return (throwable instanceof Exception) &&
               !(throwable instanceof RuntimeException) &&
               !(throwable instanceof Error);
    }
}
```

### Catching Based on Hierarchy

```java
import java.io.IOException;
import java.io.FileNotFoundException;

public class HierarchyCatching {
    public static void main(String[] args) {
        // Demonstrate catching based on hierarchy
        testFileOperations();
        testRuntimeExceptions();
        testGeneralExceptions();
    }

    public static void testFileOperations() {
        System.out.println("=== File Operations Exception Hierarchy ===");

        try {
            // This could throw FileNotFoundException (extends IOException)
            throw new FileNotFoundException("File not found: config.txt");

        } catch (FileNotFoundException e) {
            // Catches FileNotFoundException specifically
            System.out.println("File not found: " + e.getMessage());
            // File not found: File not found: config.txt

        } catch (IOException e) {
            // Would catch other IOExceptions but not FileNotFoundException
            // (because FileNotFoundException was caught above)
            System.out.println("IO error: " + e.getMessage());
        }
    }

    public static void testRuntimeExceptions() {
        System.out.println("\n=== Runtime Exception Hierarchy ===");

        String[] testCases = {"123", "abc", null};

        for (String testCase : testCases) {
            try {
                int length = testCase.length(); // May throw NullPointerException
                int number = Integer.parseInt(testCase); // May throw NumberFormatException
                System.out.println("Success: " + testCase + " → " + number);
                // Success: 123 → 123

            } catch (NullPointerException e) {
                System.out.println("Null value encountered"); // Null value encountered

            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + testCase); // Invalid number format: abc

            } catch (RuntimeException e) {
                // Catches any other RuntimeException not caught above
                System.out.println("Other runtime error: " + e.getClass().getSimpleName());
            }
        }
    }

    public static void testGeneralExceptions() {
        System.out.println("\n=== General Exception Handling ===");

        try {
            // Simulate various exceptions
            simulateException("runtime");

        } catch (RuntimeException e) {
            System.out.println("Runtime exception: " + e.getMessage());
            // Runtime exception: Simulated runtime exception

        } catch (Exception e) {
            System.out.println("General exception: " + e.getMessage());

        } catch (Throwable e) {
            // Catches everything including Errors (rarely used)
            System.out.println("Throwable: " + e.getMessage());
        }
    }

    public static void simulateException(String type) {
        switch (type) {
            case "runtime":
                throw new RuntimeException("Simulated runtime exception");
            case "checked":
                // Would need throws declaration for checked exceptions
                // throw new IOException("Simulated IO exception");
                break;
            case "error":
                throw new Error("Simulated error");
            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
```

### Custom Exception Hierarchy

```java
// Create a custom exception hierarchy for a banking application
public class BankingExceptionHierarchy {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 1000.0);

        // Test various banking operations
        testBankingOperations(account);
    }

    public static void testBankingOperations(BankAccount account) {
        String[] operations = {
            "withdraw:500",    // Valid
            "withdraw:2000",   // Insufficient funds
            "withdraw:-100",   // Invalid amount
            "deposit:abc"      // Invalid format
        };

        for (String operation : operations) {
            try {
                String[] parts = operation.split(":");
                String action = parts[0];
                String amountStr = parts[1];

                if ("withdraw".equals(action)) {
                    double amount = Double.parseDouble(amountStr);
                    account.withdraw(amount);
                    System.out.println("Withdrawal successful: $" + amount);
                    // Withdrawal successful: $500.0
                } else if ("deposit".equals(action)) {
                    double amount = Double.parseDouble(amountStr);
                    account.deposit(amount);
                    System.out.println("Deposit successful: $" + amount);
                }

            } catch (InsufficientFundsException e) {
                System.out.println("Banking error: " + e.getMessage() +
                                 " (Available: $" + e.getAvailableAmount() + ")");
                // Banking error: Insufficient funds for withdrawal: $2000.0 (Available: $500.0)

            } catch (InvalidAmountException e) {
                System.out.println("Invalid amount: " + e.getMessage());
                // Invalid amount: Amount must be positive: -100.0

            } catch (BankingException e) {
                System.out.println("Banking operation failed: " + e.getMessage());

            } catch (NumberFormatException e) {
                System.out.println("Invalid number format in operation: " + operation);
                // Invalid number format in operation: deposit:abc

            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }

        System.out.println("Final balance: $" + account.getBalance()); // Final balance: $500.0
    }
}

// Custom exception hierarchy
class BankingException extends Exception {
    public BankingException(String message) {
        super(message);
    }

    public BankingException(String message, Throwable cause) {
        super(message, cause);
    }
}

class AccountException extends BankingException {
    private final String accountNumber;

    public AccountException(String message, String accountNumber) {
        super(message);
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class InsufficientFundsException extends AccountException {
    private final double requestedAmount;
    private final double availableAmount;

    public InsufficientFundsException(String accountNumber, double requestedAmount, double availableAmount) {
        super("Insufficient funds for withdrawal: $" + requestedAmount, accountNumber);
        this.requestedAmount = requestedAmount;
        this.availableAmount = availableAmount;
    }

    public double getRequestedAmount() { return requestedAmount; }
    public double getAvailableAmount() { return availableAmount; }
}

class InvalidAmountException extends BankingException {
    private final double invalidAmount;

    public InvalidAmountException(double amount) {
        super("Amount must be positive: " + amount);
        this.invalidAmount = amount;
    }

    public double getInvalidAmount() { return invalidAmount; }
}

// Supporting class
class BankAccount {
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws BankingException {
        if (amount <= 0) {
            throw new InvalidAmountException(amount);
        }
        if (amount > balance) {
            throw new InsufficientFundsException(accountNumber, amount, balance);
        }
        balance -= amount;
    }

    public void deposit(double amount) throws BankingException {
        if (amount <= 0) {
            throw new InvalidAmountException(amount);
        }
        balance += amount;
    }

    public double getBalance() { return balance; }
}
```

## Unchecked Exceptions

Unchecked exceptions are exceptions that the compiler doesn't force you to handle. They extend `RuntimeException` and typically represent programming errors or conditions that can be avoided with proper coding practices.

### Common Unchecked Exceptions

```java
import java.util.ArrayList;
import java.util.List;

public class CommonUncheckedExceptions {
    public static void main(String[] args) {
        // Demonstrate common unchecked exceptions
        demonstrateNullPointerException();
        demonstrateArrayIndexOutOfBounds();
        demonstrateIllegalArgumentException();
        demonstrateNumberFormatException();
        demonstrateClassCastException();
    }

    public static void demonstrateNullPointerException() {
        System.out.println("=== NullPointerException ===");

        String text = null;
        try {
            int length = text.length(); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null pointer error: " + e.getMessage());
            // Null pointer error: null (or implementation-specific message)
        }

        // How to avoid:
        String safeText = "Hello";
        if (safeText != null) {
            System.out.println("Safe length: " + safeText.length()); // Safe length: 5
        }
    }

    public static void demonstrateArrayIndexOutOfBounds() {
        System.out.println("\n=== ArrayIndexOutOfBoundsException ===");

        int[] numbers = {1, 2, 3, 4, 5};

        try {
            int value = numbers[10]; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
            // Array index error: Index 10 out of bounds for length 5
        }

        // How to avoid:
        int index = 2;
        if (index >= 0 && index < numbers.length) {
            System.out.println("Safe access: " + numbers[index]); // Safe access: 3
        }
    }

    public static void demonstrateIllegalArgumentException() {
        System.out.println("\n=== IllegalArgumentException ===");

        try {
            calculateSquareRoot(-25); // IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: " + e.getMessage());
            // Invalid argument: Cannot calculate square root of negative number: -25.0
        }

        // Proper usage:
        double result = calculateSquareRoot(25);
        System.out.println("Square root of 25: " + result); // Square root of 25: 5.0
    }

    public static void demonstrateNumberFormatException() {
        System.out.println("\n=== NumberFormatException ===");

        String[] inputs = {"123", "abc", "45.67", ""};

        for (String input : inputs) {
            try {
                int number = Integer.parseInt(input);
                System.out.println("Parsed: " + input + " → " + number); // Parsed: 123 → 123
            } catch (NumberFormatException e) {
                System.out.println("Cannot parse: '" + input + "' - " + e.getMessage());
                // Cannot parse: 'abc' - For input string: "abc"
                // Cannot parse: '45.67' - For input string: "45.67"
                // Cannot parse: '' - For input string: ""
            }
        }
    }

    public static void demonstrateClassCastException() {
        System.out.println("\n=== ClassCastException ===");

        List<Object> objects = new ArrayList<>();
        objects.add("Hello");
        objects.add(42);
        objects.add(3.14);

        for (Object obj : objects) {
            try {
                String str = (String) obj; // ClassCastException for non-String objects
                System.out.println("String: " + str); // String: Hello
            } catch (ClassCastException e) {
                System.out.println("Cannot cast " + obj.getClass().getSimpleName() +
                                 " to String: " + obj);
                // Cannot cast Integer to String: 42
                // Cannot cast Double to String: 3.14
            }
        }
    }

    public static double calculateSquareRoot(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number: " + value);
        }
        return Math.sqrt(value);
    }
}
```

### Best Practices for Unchecked Exceptions

```java
import java.util.List;
import java.util.ArrayList;

public class UncheckedExceptionBestPractices {
    public static void main(String[] args) {
        // Demonstrate best practices for handling unchecked exceptions
        testValidationBestPractices();
        testCollectionBestPractices();
        testStringBestPractices();
    }

    public static void testValidationBestPractices() {
        System.out.println("=== Input Validation Best Practices ===");

        // ✅ Good: Validate inputs early
        try {
            validateAndProcessAge(25);
            System.out.println("Age 25 processed successfully"); // Age 25 processed successfully

            validateAndProcessAge(-5); // Will throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
            // Validation error: Age must be between 0 and 150: -5
        }
    }

    public static void testCollectionBestPractices() {
        System.out.println("\n=== Collection Safety Best Practices ===");

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // ✅ Good: Safe collection access
        String name = safeGetFromList(names, 1);
        System.out.println("Safe access result: " + name); // Safe access result: Bob

        String invalidName = safeGetFromList(names, 10);
        System.out.println("Invalid index result: " + invalidName); // Invalid index result: null
    }

    public static void testStringBestPractices() {
        System.out.println("\n=== String Safety Best Practices ===");

        String[] testStrings = {"Hello", null, "", "World"};

        for (String str : testStrings) {
            String result = safeStringOperation(str);
            System.out.println("String '" + str + "' → '" + result + "'");
            // String 'Hello' → 'HELLO'
            // String 'null' → 'NULL_INPUT'
            // String '' → 'EMPTY_INPUT'
            // String 'World' → 'WORLD'
        }
    }

    // ✅ Good: Early validation with meaningful error messages
    public static void validateAndProcessAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150: " + age);
        }

        // Process age...
        System.out.println("Processing age: " + age);
    }

    // ✅ Good: Safe collection access
    public static <T> T safeGetFromList(List<T> list, int index) {
        if (list == null) {
            return null;
        }

        if (index < 0 || index >= list.size()) {
            return null;
        }

        return list.get(index);
    }

    // ✅ Good: Null-safe string operations
    public static String safeStringOperation(String input) {
        if (input == null) {
            return "NULL_INPUT";
        }

        if (input.isEmpty()) {
            return "EMPTY_INPUT";
        }

        return input.toUpperCase();
    }
}
```

### When to Catch Unchecked Exceptions

```java
import java.util.Scanner;
import java.util.InputMismatchException;

public class WhenToCatchUnchecked {
    public static void main(String[] args) {
        // Example 1: User input - should catch to provide better UX
        handleUserInput();

        // Example 2: External data processing - should catch for robustness
        processExternalData();

        // Example 3: Configuration parsing - should catch and provide defaults
        loadConfiguration();
    }

    public static void handleUserInput() {
        System.out.println("=== User Input Handling ===");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");

        try {
            // User might enter non-numeric input
            int age = scanner.nextInt(); // InputMismatchException (unchecked)

            if (age < 0 || age > 150) {
                throw new IllegalArgumentException("Invalid age range");
            }

            System.out.println("Your age: " + age); // Your age: 25

        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number");
            scanner.nextLine(); // Clear invalid input
        } catch (IllegalArgumentException e) {
            System.out.println("Age must be between 0 and 150");
        }

        scanner.close();
    }

    public static void processExternalData() {
        System.out.println("\n=== External Data Processing ===");

        // Simulate processing data from external source
        String[] externalData = {"123", "456", "invalid", "789", null};
        List<Integer> validNumbers = new ArrayList<>();

        for (String data : externalData) {
            try {
                // External data might be invalid
                if (data != null) {
                    int number = Integer.parseInt(data); // NumberFormatException (unchecked)
                    validNumbers.add(number);
                }
            } catch (NumberFormatException e) {
                // Log and continue processing other data
                System.out.println("Skipping invalid data: " + data);
                // Skipping invalid data: invalid
            }
        }

        System.out.println("Valid numbers found: " + validNumbers);
        // Valid numbers found: [123, 456, 789]
    }

    public static void loadConfiguration() {
        System.out.println("\n=== Configuration Loading ===");

        // Simulate loading configuration with potential parsing errors
        String[] configValues = {"timeout=5000", "retries=abc", "maxSize="};

        int timeout = getConfigInt("timeout", configValues, 3000);
        int retries = getConfigInt("retries", configValues, 3);
        int maxSize = getConfigInt("maxSize", configValues, 1000);

        System.out.println("Configuration loaded:");
        System.out.println("  Timeout: " + timeout + "ms"); // Timeout: 5000ms
        System.out.println("  Retries: " + retries); // Retries: 3 (default)
        System.out.println("  Max Size: " + maxSize); // Max Size: 1000 (default)
    }

    public static int getConfigInt(String key, String[] config, int defaultValue) {
        for (String configLine : config) {
            if (configLine.startsWith(key + "=")) {
                try {
                    String value = configLine.substring(key.length() + 1);
                    return Integer.parseInt(value); // NumberFormatException (unchecked)
                } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
                    System.out.println("Invalid config for " + key + ", using default: " + defaultValue);
                    // Invalid config for retries, using default: 3
                    // Invalid config for maxSize, using default: 1000
                }
            }
        }
        return defaultValue;
    }
}
```

## Checked Exceptions

Checked exceptions are exceptions that must be handled at compile time. They extend `Exception` but not `RuntimeException`. The compiler forces you to either handle them with try-catch or declare them in the method signature with `throws`.

### Common Checked Exceptions

```java
import java.io.*;
import java.sql.*;
import java.net.*;

public class CommonCheckedExceptions {
    public static void main(String[] args) {
        // Demonstrate common checked exceptions
        demonstrateIOException();
        demonstrateSQLException();
        demonstrateClassNotFoundException();
        demonstrateInterruptedException();
    }

    // IOException and its subclasses
    public static void demonstrateIOException() {
        System.out.println("=== IOException Examples ===");

        // File operations
        try {
            FileReader file = new FileReader("nonexistent.txt"); // FileNotFoundException
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine(); // IOException
            System.out.println("Read: " + line);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            // File not found: nonexistent.txt (The system cannot find the file specified)
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        }

        // Network operations
        try {
            URL url = new URL("https://www.example.com");
            InputStream stream = url.openStream(); // IOException
            System.out.println("Connection opened successfully");
            stream.close();
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Network error: " + e.getMessage());
        }
    }

    public static void demonstrateSQLException() {
        System.out.println("\n=== SQLException Examples ===");

        try {
            // Database operations (simulated)
            Connection conn = DriverManager.getConnection("jdbc:invalid:url"); // SQLException
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            while (rs.next()) {
                System.out.println("User: " + rs.getString("name"));
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            // Database error: No suitable driver found for jdbc:invalid:url
        }
    }

    public static void demonstrateClassNotFoundException() {
        System.out.println("\n=== ClassNotFoundException Examples ===");

        try {
            // Dynamically load class
            Class<?> clazz = Class.forName("com.nonexistent.MyClass"); // ClassNotFoundException
            Object instance = clazz.getDeclaredConstructor().newInstance();
            System.out.println("Class loaded: " + clazz.getName());

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
            // Class not found: com.nonexistent.MyClass
        } catch (Exception e) {
            System.out.println("Other error: " + e.getMessage());
        }
    }

    public static void demonstrateInterruptedException() {
        System.out.println("\n=== InterruptedException Examples ===");

        try {
            System.out.println("Starting sleep...");
            Thread.sleep(1000); // InterruptedException
            System.out.println("Sleep completed"); // Sleep completed
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted: " + e.getMessage());
            Thread.currentThread().interrupt(); // Restore interrupt status
        }
    }
}
```

### Handling vs Propagating Checked Exceptions

```java
import java.io.*;
import java.util.Properties;

public class CheckedExceptionHandling {
    public static void main(String[] args) {
        // Example 1: Handle the exception at this level
        loadConfigurationWithHandling();

        // Example 2: Propagate the exception to caller
        try {
            String config = loadConfigurationWithPropagation();
            System.out.println("Configuration loaded: " + config.length() + " characters");
        } catch (IOException e) {
            System.out.println("Failed to load configuration: " + e.getMessage());
            // Failed to load configuration: config.properties (The system cannot find the file specified)
        }
    }

    // Approach 1: Handle checked exception within the method
    public static Properties loadConfigurationWithHandling() {
        System.out.println("=== Handling Checked Exception Locally ===");

        Properties props = new Properties();

        try (FileInputStream fis = new FileInputStream("config.properties")) {
            props.load(fis); // IOException
            System.out.println("Configuration loaded successfully");

        } catch (FileNotFoundException e) {
            System.out.println("Config file not found, using defaults: " + e.getMessage());
            // Config file not found, using defaults: config.properties (The system cannot find the file specified)

            // Set default values
            props.setProperty("timeout", "5000");
            props.setProperty("retries", "3");

        } catch (IOException e) {
            System.out.println("Error reading config file, using defaults: " + e.getMessage());

            // Set default values
            props.setProperty("timeout", "5000");
            props.setProperty("retries", "3");
        }

        return props;
    }

    // Approach 2: Propagate checked exception to caller
    public static String loadConfigurationWithPropagation() throws IOException {
        System.out.println("\n=== Propagating Checked Exception ===");

        // Let the caller handle the IOException
        try (FileReader reader = new FileReader("config.properties");
             BufferedReader buffered = new BufferedReader(reader)) {

            StringBuilder content = new StringBuilder();
            String line;

            while ((line = buffered.readLine()) != null) {
                content.append(line).append("\n");
            }

            return content.toString();
        }
        // IOException is propagated to the caller
    }
}
```

### Try-with-Resources for Checked Exceptions

```java
import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class TryWithResourcesChecked {
    public static void main(String[] args) {
        // Demonstrate try-with-resources with checked exceptions
        demonstrateFileOperations();
        demonstrateDatabaseOperations();
        demonstrateMultipleResources();
    }

    public static void demonstrateFileOperations() {
        System.out.println("=== File Operations with Try-with-Resources ===");

        // Traditional approach
        traditionalFileHandling();

        // Modern approach with try-with-resources
        modernFileHandling();
    }

    public static void traditionalFileHandling() {
        System.out.println("Traditional approach:");

        FileWriter writer = null;
        try {
            writer = new FileWriter("output.txt");
            writer.write("Hello, traditional world!");
            System.out.println("File written successfully"); // File written successfully

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());

        } finally {
            if (writer != null) {
                try {
                    writer.close();
                    System.out.println("File closed"); // File closed
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }

    public static void modernFileHandling() {
        System.out.println("\nModern approach:");

        // Resources automatically closed, even if exception occurs
        try (FileWriter writer = new FileWriter("output_modern.txt")) {
            writer.write("Hello, modern world!");
            System.out.println("Modern file written successfully"); // Modern file written successfully

        } catch (IOException e) {
            System.out.println("Error with modern file handling: " + e.getMessage());
        }
        // FileWriter automatically closed here
        System.out.println("Modern file automatically closed"); // Modern file automatically closed
    }

    public static void demonstrateDatabaseOperations() {
        System.out.println("\n=== Database Operations with Try-with-Resources ===");

        String url = "jdbc:h2:mem:testdb";

        // Multiple resources managed automatically
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            // Setup test data
            stmt.execute("CREATE TABLE users (id INT, name VARCHAR(50))");
            stmt.execute("INSERT INTO users VALUES (1, 'Alice'), (2, 'Bob')");

            // Query and display results
            try (ResultSet rs = stmt.executeQuery("SELECT * FROM users")) {
                System.out.println("Database query results:");
                while (rs.next()) {
                    System.out.println("  ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
                    // ID: 1, Name: Alice
                    // ID: 2, Name: Bob
                }
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
        // All database resources automatically closed
        System.out.println("Database resources automatically closed");
    }

    public static void demonstrateMultipleResources() {
        System.out.println("\n=== Multiple Resources Management ===");

        // Copy file content using multiple resources
        try (FileReader reader = new FileReader("output.txt");
             FileWriter writer = new FileWriter("copy.txt");
             BufferedReader buffered = new BufferedReader(reader)) {

            String line;
            while ((line = buffered.readLine()) != null) {
                writer.write(line + "\n");
            }

            System.out.println("File copied successfully"); // File copied successfully

        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }
        // All resources (reader, writer, buffered) automatically closed
        System.out.println("All copy resources automatically closed");
    }
}
```

### Custom Checked Exceptions

```java
import java.io.IOException;

public class CustomCheckedExceptions {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // Test user operations with custom checked exceptions
        testUserOperations(userService);
    }

    public static void testUserOperations(UserService service) {
        String[] testEmails = {
            "valid@example.com",
            "invalid-email",
            "existing@example.com",
            "blocked@spam.com"
        };

        for (String email : testEmails) {
            try {
                User user = service.createUser(email, "password123");
                System.out.println("User created: " + user.getEmail());
                // User created: valid@example.com

            } catch (InvalidEmailException e) {
                System.out.println("Email validation failed: " + e.getMessage());
                System.out.println("  Invalid email: " + e.getInvalidEmail());
                // Email validation failed: Email format is invalid: invalid-email
                //   Invalid email: invalid-email

            } catch (UserAlreadyExistsException e) {
                System.out.println("User registration failed: " + e.getMessage());
                System.out.println("  Existing user: " + e.getExistingEmail());
                // User registration failed: User already exists: existing@example.com
                //   Existing user: existing@example.com

            } catch (UserRegistrationException e) {
                System.out.println("Registration error: " + e.getMessage());
                System.out.println("  Error code: " + e.getErrorCode());
                // Registration error: Email domain is blocked: blocked@spam.com
                //   Error code: BLOCKED_DOMAIN

            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }
}

// Custom checked exception hierarchy
class UserRegistrationException extends Exception {
    private final String errorCode;

    public UserRegistrationException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public UserRegistrationException(String message, String errorCode, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}

class InvalidEmailException extends UserRegistrationException {
    private final String invalidEmail;

    public InvalidEmailException(String invalidEmail) {
        super("Email format is invalid: " + invalidEmail, "INVALID_FORMAT");
        this.invalidEmail = invalidEmail;
    }

    public String getInvalidEmail() {
        return invalidEmail;
    }
}

class UserAlreadyExistsException extends UserRegistrationException {
    private final String existingEmail;

    public UserAlreadyExistsException(String existingEmail) {
        super("User already exists: " + existingEmail, "USER_EXISTS");
        this.existingEmail = existingEmail;
    }

    public String getExistingEmail() {
        return existingEmail;
    }
}

// Supporting classes
class UserService {
    public User createUser(String email, String password) throws UserRegistrationException {
        // Validate email format
        if (!isValidEmail(email)) {
            throw new InvalidEmailException(email);
        }

        // Check if user already exists
        if (userExists(email)) {
            throw new UserAlreadyExistsException(email);
        }

        // Check for blocked domains
        if (isBlockedDomain(email)) {
            throw new UserRegistrationException("Email domain is blocked: " + email, "BLOCKED_DOMAIN");
        }

        // Create and return new user
        return new User(email, password);
    }

    private boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    private boolean userExists(String email) {
        return email.equals("existing@example.com");
    }

    private boolean isBlockedDomain(String email) {
        return email.endsWith("@spam.com");
    }
}

class User {
    private final String email;
    private final String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() { return email; }
}
```

## Throw and Throws

The `throw` and `throws` keywords are fundamental to Java's exception handling mechanism. `throw` is used to explicitly throw an exception, while `throws` is used to declare that a method might throw certain exceptions.

### Using `throw` to Throw Exceptions

```java
import java.util.Scanner;

public class ThrowKeywordDemo {
    public static void main(String[] args) {
        // Demonstrate throwing exceptions explicitly
        testAgeValidation();
        testDivisionOperation();
        testPasswordValidation();
    }

    public static void testAgeValidation() {
        System.out.println("=== Age Validation with throw ===");

        int[] testAges = {25, -5, 200, 0};

        for (int age : testAges) {
            try {
                validateAge(age);
                System.out.println("Valid age: " + age); // Valid age: 25, Valid age: 0
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid age " + age + ": " + e.getMessage());
                // Invalid age -5: Age cannot be negative: -5
                // Invalid age 200: Age cannot exceed 150: 200
            }
        }
    }

    public static void testDivisionOperation() {
        System.out.println("\n=== Division Operation with throw ===");

        double[][] testCases = {{10, 2}, {15, 0}, {-8, 4}};

        for (double[] testCase : testCases) {
            try {
                double result = safeDivide(testCase[0], testCase[1]);
                System.out.println(testCase[0] + " / " + testCase[1] + " = " + result);
                // 10.0 / 2.0 = 5.0
                // -8.0 / 4.0 = -2.0
            } catch (ArithmeticException e) {
                System.out.println("Division error: " + e.getMessage());
                // Division error: Cannot divide by zero
            }
        }
    }

    public static void testPasswordValidation() {
        System.out.println("\n=== Password Validation with throw ===");

        String[] passwords = {"SecurePass123!", "weak", "NOLOWERCASE123!", "nouppercase123!"};

        for (String password : passwords) {
            try {
                validatePassword(password);
                System.out.println("Password accepted: " + password); // Password accepted: SecurePass123!
            } catch (SecurityException e) {
                System.out.println("Password rejected '" + password + "': " + e.getMessage());
                // Password rejected 'weak': Password too short: minimum 8 characters required
                // Password rejected 'NOLOWERCASE123!': Password must contain lowercase letters
                // Password rejected 'nouppercase123!': Password must contain uppercase letters
            }
        }
    }

    // Method that throws exceptions using 'throw'
    public static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative: " + age);
        }
        if (age > 150) {
            throw new IllegalArgumentException("Age cannot exceed 150: " + age);
        }
        // Valid age - no exception thrown
    }

    public static double safeDivide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return dividend / divisor;
    }

    public static void validatePassword(String password) {
        if (password.length() < 8) {
            throw new SecurityException("Password too short: minimum 8 characters required");
        }

        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if (!Character.isLetterOrDigit(c)) hasSpecial = true;
        }

        if (!hasUpper) throw new SecurityException("Password must contain uppercase letters");
        if (!hasLower) throw new SecurityException("Password must contain lowercase letters");
        if (!hasDigit) throw new SecurityException("Password must contain digits");
        if (!hasSpecial) throw new SecurityException("Password must contain special characters");
    }
}
```

### Using `throws` to Declare Exceptions

```java
import java.io.*;
import java.sql.*;

public class ThrowsKeywordDemo {
    public static void main(String[] args) {
        // Methods with throws declarations must be handled by caller
        FileManager fileManager = new FileManager();

        // Example 1: Handle IOException from file operations
        try {
            String content = fileManager.readFile("data.txt");
            System.out.println("File content: " + content);
        } catch (IOException e) {
            System.out.println("File operation failed: " + e.getMessage());
            // File operation failed: data.txt (The system cannot find the file specified)
        }

        // Example 2: Handle multiple exceptions
        DatabaseManager dbManager = new DatabaseManager();
        try {
            dbManager.connectAndQuery("SELECT * FROM users");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            // Database error: No suitable driver found for jdbc:invalid:database
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
        }
    }
}

class FileManager {
    // Method declares it might throw IOException
    public String readFile(String filename) throws IOException {
        // Checked exception must be declared with throws
        FileReader reader = new FileReader(filename); // May throw FileNotFoundException
        BufferedReader buffered = new BufferedReader(reader);

        StringBuilder content = new StringBuilder();
        String line;

        while ((line = buffered.readLine()) != null) { // May throw IOException
            content.append(line).append("\n");
        }

        buffered.close();
        return content.toString();
    }

    // Method that throws multiple exceptions
    public void writeFile(String filename, String content) throws IOException, SecurityException {
        // Check permissions first
        if (filename.startsWith("/system/")) {
            throw new SecurityException("Cannot write to system directory");
        }

        FileWriter writer = new FileWriter(filename); // May throw IOException
        writer.write(content);
        writer.close();
    }

    // Method that doesn't declare RuntimeExceptions (unchecked)
    public void validateFilename(String filename) {
        if (filename == null || filename.trim().isEmpty()) {
            // RuntimeExceptions don't need to be declared
            throw new IllegalArgumentException("Filename cannot be null or empty");
        }
    }
}

class DatabaseManager {
    // Method declaring multiple checked exceptions
    public void connectAndQuery(String sql) throws SQLException, ClassNotFoundException {
        // Load database driver
        Class.forName("com.mysql.cj.jdbc.Driver"); // May throw ClassNotFoundException

        // Connect to database
        Connection conn = DriverManager.getConnection("jdbc:invalid:database"); // May throw SQLException

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql); // May throw SQLException

        // Process results...
        rs.close();
        stmt.close();
        conn.close();
    }

    // Method that handles some exceptions internally and propagates others
    public void safeConnect() throws SQLException {
        try {
            Class.forName("com.h2.Driver"); // Handle ClassNotFoundException internally
            Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb");
            System.out.println("Database connected successfully"); // Database connected successfully
            conn.close();
        } catch (ClassNotFoundException e) {
            // Handle internally - convert to RuntimeException
            throw new RuntimeException("Database driver not found", e);
        }
        // SQLException is still propagated to caller
    }
}
```

### Exception Propagation Chain

```java
import java.io.IOException;

public class ExceptionPropagation {
    public static void main(String[] args) {
        // Demonstrate exception propagation through call chain
        try {
            method1();
        } catch (CustomBusinessException e) {
            System.out.println("Caught in main: " + e.getMessage());
            System.out.println("Business error code: " + e.getErrorCode());
            // Caught in main: Business operation failed: File processing error
            // Business error code: PROC_001

            // Show the full exception chain
            Throwable cause = e.getCause();
            while (cause != null) {
                System.out.println("Caused by: " + cause.getClass().getSimpleName() + " - " + cause.getMessage());
                cause = cause.getCause();
            }
            // Caused by: ProcessingException - File processing error
            // Caused by: IOException - Simulated file error
        }
    }

    // Level 1: Business layer
    public static void method1() throws CustomBusinessException {
        try {
            method2();
        } catch (ProcessingException e) {
            // Wrap and re-throw with business context
            throw new CustomBusinessException("Business operation failed: " + e.getMessage(), "PROC_001", e);
        }
    }

    // Level 2: Service layer
    public static void method2() throws ProcessingException {
        try {
            method3();
        } catch (IOException e) {
            // Wrap and re-throw with processing context
            throw new ProcessingException("File processing error", e);
        }
    }

    // Level 3: Data access layer
    public static void method3() throws IOException {
        // Simulate a low-level IOException
        throw new IOException("Simulated file error");
    }
}

// Custom exception classes
class CustomBusinessException extends Exception {
    private final String errorCode;

    public CustomBusinessException(String message, String errorCode, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public String getErrorCode() { return errorCode; }
}

class ProcessingException extends Exception {
    public ProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
```

## Throwing Exceptions

Creating and throwing custom exceptions allows you to build robust error handling systems that provide meaningful feedback and enable proper recovery strategies.

### Creating and Throwing Custom Exceptions

```java
import java.time.LocalDate;
import java.util.regex.Pattern;

public class ThrowingCustomExceptions {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Test account operations
        testAccountOperations(bank);

        // Test loan applications
        testLoanApplications(bank);
    }

    public static void testAccountOperations(BankingSystem bank) {
        System.out.println("=== Banking Operations ===");

        try {
            Account account = bank.createAccount("John Doe", "john@example.com", 25);
            System.out.println("Account created: " + account.getAccountNumber());
            // Account created: ACC-20240804-001

            bank.deposit(account, 1000.0);
            System.out.println("Deposit successful, balance: $" + account.getBalance());
            // Deposit successful, balance: $1000.0

            bank.withdraw(account, 500.0);
            System.out.println("Withdrawal successful, balance: $" + account.getBalance());
            // Withdrawal successful, balance: $500.0

            // This will throw an exception
            bank.withdraw(account, 1000.0);

        } catch (InvalidAccountDataException e) {
            System.out.println("Account data error: " + e.getMessage());
            System.out.println("Field: " + e.getInvalidField());
            System.out.println("Value: " + e.getInvalidValue());

        } catch (InsufficientFundsException e) {
            System.out.println("Transaction failed: " + e.getMessage());
            System.out.println("Requested: $" + e.getRequestedAmount());
            System.out.println("Available: $" + e.getAvailableBalance());
            // Transaction failed: Insufficient funds for withdrawal
            // Requested: $1000.0
            // Available: $500.0

        } catch (BankingException e) {
            System.out.println("Banking error: " + e.getMessage());
        }
    }

    public static void testLoanApplications(BankingSystem bank) {
        System.out.println("\n=== Loan Applications ===");

        Object[][] loanApplications = {
            {"Alice Smith", "alice@example.com", 30, 75000.0, 25000.0},  // Valid
            {"Bob Jones", "invalid-email", 25, 50000.0, 100000.0},       // Invalid email
            {"Charlie Brown", "charlie@example.com", 17, 30000.0, 5000.0}, // Too young
            {"Diana Prince", "diana@example.com", 35, 30000.0, 200000.0}  // Amount too high
        };

        for (Object[] data : loanApplications) {
            try {
                String name = (String) data[0];
                String email = (String) data[1];
                int age = (Integer) data[2];
                double income = (Double) data[3];
                double loanAmount = (Double) data[4];

                LoanApplication loan = bank.applyForLoan(name, email, age, income, loanAmount);
                System.out.println("Loan approved: " + loan.getApplicationId() + " for $" + loanAmount);
                // Loan approved: LOAN-20240804-001 for $25000.0

            } catch (InvalidAccountDataException e) {
                System.out.println("Application rejected - Invalid data: " + e.getMessage());
                // Application rejected - Invalid data: Invalid email format: invalid-email

            } catch (LoanEligibilityException e) {
                System.out.println("Application rejected - Eligibility: " + e.getMessage());
                System.out.println("Reason: " + e.getRejectionReason());
                // Application rejected - Eligibility: Loan application rejected: Age requirement not met
                // Reason: MINIMUM_AGE_NOT_MET

            } catch (BankingException e) {
                System.out.println("Application error: " + e.getMessage());
            }
        }
    }
}

// Custom exception hierarchy for banking system
class BankingException extends Exception {
    private final String errorCode;
    private final LocalDate timestamp;

    public BankingException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
        this.timestamp = LocalDate.now();
    }

    public BankingException(String message, String errorCode, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
        this.timestamp = LocalDate.now();
    }

    public String getErrorCode() { return errorCode; }
    public LocalDate getTimestamp() { return timestamp; }
}

class InvalidAccountDataException extends BankingException {
    private final String invalidField;
    private final String invalidValue;

    public InvalidAccountDataException(String field, String value, String message) {
        super(message, "INVALID_DATA");
        this.invalidField = field;
        this.invalidValue = value;
    }

    public String getInvalidField() { return invalidField; }
    public String getInvalidValue() { return invalidValue; }
}

class InsufficientFundsException extends BankingException {
    private final double requestedAmount;
    private final double availableBalance;

    public InsufficientFundsException(double requested, double available) {
        super("Insufficient funds for withdrawal", "INSUFFICIENT_FUNDS");
        this.requestedAmount = requested;
        this.availableBalance = available;
    }

    public double getRequestedAmount() { return requestedAmount; }
    public double getAvailableBalance() { return availableBalance; }
}

class LoanEligibilityException extends BankingException {
    private final String rejectionReason;

    public LoanEligibilityException(String message, String reason) {
        super(message, "LOAN_REJECTED");
        this.rejectionReason = reason;
    }

    public String getRejectionReason() { return rejectionReason; }
}

// Banking system implementation
class BankingSystem {
    private static int accountCounter = 1;
    private static int loanCounter = 1;

    public Account createAccount(String name, String email, int age) throws InvalidAccountDataException {
        // Validate input data
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidAccountDataException("name", name, "Name cannot be empty");
        }

        if (!isValidEmail(email)) {
            throw new InvalidAccountDataException("email", email, "Invalid email format: " + email);
        }

        if (age < 18) {
            throw new InvalidAccountDataException("age", String.valueOf(age), "Minimum age is 18: " + age);
        }

        String accountNumber = "ACC-" + LocalDate.now().toString().replace("-", "") + "-" +
                              String.format("%03d", accountCounter++);
        return new Account(accountNumber, name, email, age);
    }

    public void deposit(Account account, double amount) throws BankingException {
        if (amount <= 0) {
            throw new BankingException("Deposit amount must be positive: " + amount, "INVALID_AMOUNT");
        }

        account.setBalance(account.getBalance() + amount);
    }

    public void withdraw(Account account, double amount) throws BankingException {
        if (amount <= 0) {
            throw new BankingException("Withdrawal amount must be positive: " + amount, "INVALID_AMOUNT");
        }

        if (amount > account.getBalance()) {
            throw new InsufficientFundsException(amount, account.getBalance());
        }

        account.setBalance(account.getBalance() - amount);
    }

    public LoanApplication applyForLoan(String name, String email, int age, double income, double loanAmount)
            throws BankingException {

        // Validate basic data
        if (!isValidEmail(email)) {
            throw new InvalidAccountDataException("email", email, "Invalid email format: " + email);
        }

        // Check eligibility criteria
        if (age < 18) {
            throw new LoanEligibilityException("Loan application rejected: Age requirement not met", "MINIMUM_AGE_NOT_MET");
        }

        if (income < 25000) {
            throw new LoanEligibilityException("Loan application rejected: Minimum income requirement not met", "MINIMUM_INCOME_NOT_MET");
        }

        // Loan amount cannot exceed 4x annual income
        if (loanAmount > income * 4) {
            throw new LoanEligibilityException("Loan application rejected: Amount exceeds income ratio", "AMOUNT_TOO_HIGH");
        }

        String applicationId = "LOAN-" + LocalDate.now().toString().replace("-", "") + "-" +
                              String.format("%03d", loanCounter++);
        return new LoanApplication(applicationId, name, email, loanAmount);
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email != null && Pattern.matches(emailRegex, email);
    }
}

// Supporting classes
class Account {
    private final String accountNumber;
    private final String holderName;
    private final String email;
    private final int age;
    private double balance;

    public Account(String accountNumber, String holderName, String email, int age) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.email = email;
        this.age = age;
        this.balance = 0.0;
    }

    // Getters and setters
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public String getEmail() { return email; }
    public int getAge() { return age; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}

class LoanApplication {
    private final String applicationId;
    private final String applicantName;
    private final String email;
    private final double amount;

    public LoanApplication(String applicationId, String applicantName, String email, double amount) {
        this.applicationId = applicationId;
        this.applicantName = applicantName;
        this.email = email;
        this.amount = amount;
    }

    public String getApplicationId() { return applicationId; }
    public String getApplicantName() { return applicantName; }
    public String getEmail() { return email; }
    public double getAmount() { return amount; }
}
```

## When To Use Checked vs Unchecked Exceptions

Choosing between checked and unchecked exceptions is crucial for creating maintainable and robust Java applications. This decision affects both the compiler requirements and the overall design of your error handling strategy.

### Guidelines for Choosing Exception Types

```java
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class ExceptionTypeGuidelines {
    public static void main(String[] args) {
        // Demonstrate when to use checked vs unchecked exceptions
        demonstrateCheckedExceptionUsage();
        demonstrateUncheckedExceptionUsage();
        demonstrateDesignDecisions();
    }

    public static void demonstrateCheckedExceptionUsage() {
        System.out.println("=== When to Use Checked Exceptions ===");

        FileProcessor processor = new FileProcessor();

        // Example 1: Recoverable I/O operations
        try {
            String content = processor.readConfigFile("config.properties");
            System.out.println("Config loaded: " + content.length() + " characters");
        } catch (ConfigurationException e) {
            // Caller can recover by using default configuration
            System.out.println("Using default config due to: " + e.getMessage());
            // Using default config due to: Configuration file not found: config.properties
            processor.useDefaultConfiguration();
        }

        // Example 2: Network operations that might fail
        NetworkService service = new NetworkService();
        try {
            String response = service.sendRequest("https://api.example.com/data");
            System.out.println("Response received: " + response);
        } catch (NetworkException e) {
            // Caller can retry or use cached data
            System.out.println("Network failed, using cache: " + e.getMessage());
            String cachedData = service.getCachedData();
            System.out.println("Using cached data: " + cachedData);
        }
    }

    public static void demonstrateUncheckedExceptionUsage() {
        System.out.println("\n=== When to Use Unchecked Exceptions ===");

        CalculationService calc = new CalculationService();

        // Example 1: Programming errors (invalid arguments)
        try {
            double result = calc.calculateSquareRoot(-25);
            System.out.println("Square root: " + result);
        } catch (IllegalArgumentException e) {
            // This represents a programming error
            System.out.println("Programming error: " + e.getMessage());
            // Programming error: Cannot calculate square root of negative number: -25.0
        }

        // Example 2: Precondition violations
        List<String> items = new ArrayList<>();
        try {
            calc.processItems(null); // Programming error
        } catch (IllegalArgumentException e) {
            System.out.println("Contract violation: " + e.getMessage());
            // Contract violation: Items list cannot be null
        }

        // Example 3: State-related errors
        BankAccount account = new BankAccount(100.0);
        try {
            account.withdraw(200.0); // Invalid state operation
        } catch (IllegalStateException e) {
            System.out.println("Invalid operation: " + e.getMessage());
            // Invalid operation: Insufficient funds: requested=200.0, available=100.0
        }
    }

    public static void demonstrateDesignDecisions() {
        System.out.println("\n=== Design Decision Examples ===");

        // Good design: Use checked for recoverable conditions
        EmailService emailService = new EmailService();
        String[] recipients = {"valid@example.com", "invalid-email", "blocked@spam.com"};

        for (String email : recipients) {
            try {
                emailService.sendEmail(email, "Test Subject", "Test Body");
                System.out.println("Email sent to: " + email); // Email sent to: valid@example.com
            } catch (EmailDeliveryException e) {
                // Checked exception - caller can decide how to handle
                System.out.println("Email delivery failed for " + email + ": " + e.getMessage());
                // Email delivery failed for invalid-email: Invalid email format
                // Email delivery failed for blocked@spam.com: Email domain is blocked

                // Caller can log, retry, or notify user
                emailService.logFailedDelivery(email, e.getMessage());
            }
        }
    }
}

// Examples of good checked exception usage
class ConfigurationException extends Exception {
    public ConfigurationException(String message) {
        super(message);
    }

    public ConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}

class NetworkException extends Exception {
    public NetworkException(String message, Throwable cause) {
        super(message, cause);
    }
}

class EmailDeliveryException extends Exception {
    public EmailDeliveryException(String message) {
        super(message);
    }
}

// Supporting classes demonstrating good exception design
class FileProcessor {
    // ✅ Good: Checked exception for recoverable I/O failure
    public String readConfigFile(String filename) throws ConfigurationException {
        try {
            // Simulate file reading
            if (filename.equals("config.properties")) {
                throw new IOException("File not found");
            }
            return "config content";
        } catch (IOException e) {
            throw new ConfigurationException("Configuration file not found: " + filename, e);
        }
    }

    public void useDefaultConfiguration() {
        System.out.println("Default configuration applied");
    }
}

class NetworkService {
    // ✅ Good: Checked exception for network operations
    public String sendRequest(String url) throws NetworkException {
        try {
            // Simulate network request
            if (url.contains("example.com")) {
                throw new IOException("Connection timeout");
            }
            return "response data";
        } catch (IOException e) {
            throw new NetworkException("Network request failed: " + url, e);
        }
    }

    public String getCachedData() {
        return "cached response data";
    }
}

class CalculationService {
    // ✅ Good: Unchecked exception for programming errors
    public double calculateSquareRoot(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number: " + value);
        }
        return Math.sqrt(value);
    }

    // ✅ Good: Unchecked exception for contract violations
    public void processItems(List<String> items) {
        if (items == null) {
            throw new IllegalArgumentException("Items list cannot be null");
        }

        // Process items...
        System.out.println("Processing " + items.size() + " items");
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // ✅ Good: Unchecked exception for invalid state
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds: requested=" + amount + ", available=" + balance);
        }
        balance -= amount;
    }

    public double getBalance() { return balance; }
}

class EmailService {
    // ✅ Good: Checked exception for external service failures
    public void sendEmail(String recipient, String subject, String body) throws EmailDeliveryException {
        // Validate email format
        if (!isValidEmail(recipient)) {
            throw new EmailDeliveryException("Invalid email format");
        }

        // Check for blocked domains
        if (recipient.endsWith("@spam.com")) {
            throw new EmailDeliveryException("Email domain is blocked");
        }

        // Simulate sending email
        System.out.println("Sending email to: " + recipient);
    }

    public void logFailedDelivery(String recipient, String reason) {
        System.out.println("Logged failed delivery: " + recipient + " - " + reason);
    }

    private boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }
}
```

## Creating Custom Exceptions

Custom exceptions allow you to create domain-specific error handling that provides meaningful information and enables appropriate recovery strategies. Well-designed custom exceptions improve code maintainability and debugging.

### Basic Custom Exception Design

```java
import java.time.LocalDateTime;
import java.util.Map;
import java.util.HashMap;

public class CustomExceptionDesign {
    public static void main(String[] args) {
        // Demonstrate custom exception design principles
        testBasicCustomExceptions();
        testAdvancedCustomExceptions();
        testExceptionHierarchy();
    }

    public static void testBasicCustomExceptions() {
        System.out.println("=== Basic Custom Exceptions ===");

        UserManager userManager = new UserManager();

        try {
            User user = userManager.createUser("", "invalid-email", 16);
        } catch (UserValidationException e) {
            System.out.println("User creation failed:");
            System.out.println("  Error: " + e.getMessage());
            System.out.println("  Field: " + e.getInvalidField());
            System.out.println("  Value: " + e.getInvalidValue());
            System.out.println("  Timestamp: " + e.getTimestamp());
            /*
            User creation failed:
              Error: Username cannot be empty
              Field: username
              Value:
              Timestamp: 2024-08-04T10:30:45.123
            */
        }
    }

    public static void testAdvancedCustomExceptions() {
        System.out.println("\n=== Advanced Custom Exceptions ===");

        PaymentProcessor processor = new PaymentProcessor();

        try {
            processor.processPayment("CARD123", 1500.00, "USD");
        } catch (PaymentException e) {
            System.out.println("Payment failed:");
            System.out.println("  Error: " + e.getMessage());
            System.out.println("  Transaction ID: " + e.getTransactionId());
            System.out.println("  Error Code: " + e.getErrorCode());
            System.out.println("  Is Retryable: " + e.isRetryable());
            System.out.println("  Additional Info: " + e.getAdditionalInfo());
            /*
            Payment failed:
              Error: Payment amount exceeds daily limit
              Transaction ID: TXN-20240804-001
              Error Code: LIMIT_EXCEEDED
              Is Retryable: false
              Additional Info: {dailyLimit=1000.0, requestedAmount=1500.0, remainingLimit=1000.0}
            */
        }
    }

    public static void testExceptionHierarchy() {
        System.out.println("\n=== Custom Exception Hierarchy ===");

        OrderProcessor orderProcessor = new OrderProcessor();

        String[] testOrders = {"ORD001", "INVALID", "ORD002"};

        for (String orderId : testOrders) {
            try {
                orderProcessor.processOrder(orderId);
                System.out.println("Order processed: " + orderId);
            } catch (OrderNotFoundException e) {
                System.out.println("Order not found: " + e.getMessage());
                System.out.println("  Missing order: " + e.getOrderId());
            } catch (OrderValidationException e) {
                System.out.println("Validation error: " + e.getMessage());
                System.out.println("  Validation rules failed: " + e.getFailedRules());
            } catch (OrderProcessingException e) {
                System.out.println("Processing error: " + e.getMessage());
                System.out.println("  Error category: " + e.getErrorCategory());
            }
        }
    }
}

// Basic custom exception with essential information
class UserValidationException extends Exception {
    private final String invalidField;
    private final String invalidValue;
    private final LocalDateTime timestamp;

    public UserValidationException(String message, String field, String value) {
        super(message);
        this.invalidField = field;
        this.invalidValue = value;
        this.timestamp = LocalDateTime.now();
    }

    public String getInvalidField() { return invalidField; }
    public String getInvalidValue() { return invalidValue; }
    public LocalDateTime getTimestamp() { return timestamp; }
}

// Advanced custom exception with rich context information
class PaymentException extends Exception {
    private final String transactionId;
    private final String errorCode;
    private final boolean retryable;
    private final Map<String, Object> additionalInfo;

    public PaymentException(String message, String transactionId, String errorCode, boolean retryable) {
        super(message);
        this.transactionId = transactionId;
        this.errorCode = errorCode;
        this.retryable = retryable;
        this.additionalInfo = new HashMap<>();
    }

    public PaymentException(String message, String transactionId, String errorCode,
                           boolean retryable, Map<String, Object> additionalInfo) {
        super(message);
        this.transactionId = transactionId;
        this.errorCode = errorCode;
        this.retryable = retryable;
        this.additionalInfo = new HashMap<>(additionalInfo);
    }

    public String getTransactionId() { return transactionId; }
    public String getErrorCode() { return errorCode; }
    public boolean isRetryable() { return retryable; }
    public Map<String, Object> getAdditionalInfo() { return new HashMap<>(additionalInfo); }

    public void addInfo(String key, Object value) {
        additionalInfo.put(key, value);
    }
}

// Custom exception hierarchy for order processing
abstract class OrderProcessingException extends Exception {
    private final String errorCategory;
    private final LocalDateTime occurredAt;

    public OrderProcessingException(String message, String errorCategory) {
        super(message);
        this.errorCategory = errorCategory;
        this.occurredAt = LocalDateTime.now();
    }

    public OrderProcessingException(String message, String errorCategory, Throwable cause) {
        super(message, cause);
        this.errorCategory = errorCategory;
        this.occurredAt = LocalDateTime.now();
    }

    public String getErrorCategory() { return errorCategory; }
    public LocalDateTime getOccurredAt() { return occurredAt; }
}

class OrderNotFoundException extends OrderProcessingException {
    private final String orderId;

    public OrderNotFoundException(String orderId) {
        super("Order not found: " + orderId, "NOT_FOUND");
        this.orderId = orderId;
    }

    public String getOrderId() { return orderId; }
}

class OrderValidationException extends OrderProcessingException {
    private final java.util.List<String> failedRules;

    public OrderValidationException(String message, java.util.List<String> failedRules) {
        super(message, "VALIDATION");
        this.failedRules = new java.util.ArrayList<>(failedRules);
    }

    public java.util.List<String> getFailedRules() { return new java.util.ArrayList<>(failedRules); }
}

// Supporting classes
class UserManager {
    public User createUser(String username, String email, int age) throws UserValidationException {
        if (username == null || username.trim().isEmpty()) {
            throw new UserValidationException("Username cannot be empty", "username", username);
        }

        if (email == null || !email.contains("@")) {
            throw new UserValidationException("Invalid email format", "email", email);
        }

        if (age < 18) {
            throw new UserValidationException("User must be at least 18 years old", "age", String.valueOf(age));
        }

        return new User(username, email, age);
    }
}

class PaymentProcessor {
    private static int transactionCounter = 1;

    public void processPayment(String cardId, double amount, String currency) throws PaymentException {
        String transactionId = "TXN-" + LocalDateTime.now().toLocalDate().toString().replace("-", "") +
                              "-" + String.format("%03d", transactionCounter++);

        // Check daily limit
        double dailyLimit = 1000.0;
        if (amount > dailyLimit) {
            Map<String, Object> info = new HashMap<>();
            info.put("dailyLimit", dailyLimit);
            info.put("requestedAmount", amount);
            info.put("remainingLimit", dailyLimit);

            throw new PaymentException(
                "Payment amount exceeds daily limit",
                transactionId,
                "LIMIT_EXCEEDED",
                false,
                info
            );
        }

        // Simulate other payment validations
        System.out.println("Payment processed: " + transactionId);
    }
}

class OrderProcessor {
    public void processOrder(String orderId) throws OrderProcessingException {
        if (orderId.equals("INVALID")) {
            java.util.List<String> failedRules = java.util.Arrays.asList(
                "Order ID format invalid",
                "Order ID too short"
            );
            throw new OrderValidationException("Order validation failed", failedRules);
        }

        if (!orderId.startsWith("ORD")) {
            throw new OrderNotFoundException(orderId);
        }

        System.out.println("Order processing completed: " + orderId);
    }
}

class User {
    private final String username;
    private final String email;
    private final int age;

    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    // Getters...
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public int getAge() { return age; }
}
```

Perfect! I've successfully added the comprehensive Exception Handling section to your Java documentation. The new content includes:

## What was added:

### 1. **Exception Handling Fundamentals** - Introduction and common scenarios

### 2. **What Is An Exception** - Basic concepts, anatomy, and types

### 3. **Try-Catch Blocks** - Fundamental exception handling with practical examples

### 4. **Multiple Catch Blocks** - Handling different exception types with proper ordering

### 5. **Using OR Within Catch** - Multi-catch syntax with practical applications

### 6. **The Exception Class** - Exception hierarchy, methods, and chaining

### 7. **Finally Keyword** - Resource cleanup and guaranteed execution

### 8. **Exception Hierarchy** - Complete hierarchy understanding with inheritance

### 9. **Unchecked Exceptions** - RuntimeException usage and best practices

### 10. **Checked Exceptions** - Compile-time exceptions and handling strategies

### 11. **Throw and Throws** - Creating and declaring exceptions

### 12. **Throwing Exceptions** - Custom exception creation with banking examples

### 13. **When To Use Checked vs Unchecked** - Decision guidelines with practical examples

### 14. **Creating Custom Exceptions** - Advanced custom exception design

## Key Features:

- **Result comments**: Every code example shows expected outputs
- **Comprehensive examples**: Real-world scenarios like banking, file processing, networking
- **Best practices**: Proper exception design and handling strategies
- **Progressive complexity**: From basic try-catch to advanced custom exception hierarchies
- **Practical applications**: Banking systems, user management, payment processing
- **Performance considerations**: Resource management with try-with-resources
- **Error recovery strategies**: How to handle and recover from various exception types

The documentation now provides complete coverage of Java exception handling, from basic concepts to advanced custom exception design, maintaining the same high quality and detailed approach as the rest of your Java reference material!

# Static Keyword

## What is the `static` Keyword?

The `static` keyword in Java is used to create class-level members that belong to the class itself rather than to any specific instance. Static members can be accessed without creating an object of the class.

### Understanding Static vs Instance

```java
public class StaticBasics {
    // Static variables (class variables)
    private static int staticCounter = 0;
    private static final String COMPANY_NAME = "TechCorp";

    // Instance variables
    private int instanceId;
    private String name;

    // Static methods
    public static void displayCompanyInfo() {
        System.out.println("Company: " + COMPANY_NAME);
        System.out.println("Total objects created: " + staticCounter);
        // System.out.println(name); // ❌ Cannot access instance variable from static method
    }

    // Instance methods
    public void displayInstanceInfo() {
        System.out.println("Instance ID: " + instanceId);
        System.out.println("Name: " + name);
        System.out.println("Company: " + COMPANY_NAME); // ✅ Can access static from instance
        System.out.println("Total objects: " + staticCounter); // ✅ Can access static from instance
    }

    // Constructor
    public StaticBasics(String name) {
        this.name = name;
        this.instanceId = ++staticCounter; // Increment static counter
    }

    public static void main(String[] args) {
        System.out.println("=== Static vs Instance Demo ===");

        // Access static members without creating objects
        StaticBasics.displayCompanyInfo();
        // Company: TechCorp
        // Total objects created: 0

        // Create instances
        StaticBasics obj1 = new StaticBasics("Alice");
        StaticBasics obj2 = new StaticBasics("Bob");
        StaticBasics obj3 = new StaticBasics("Charlie");

        // Access static method through class (preferred)
        StaticBasics.displayCompanyInfo();
        // Company: TechCorp
        // Total objects created: 3

        // Access static method through instance (works but not recommended)
        obj1.displayCompanyInfo();

        // Instance methods require object
        obj1.displayInstanceInfo();
        // Instance ID: 1
        // Name: Alice
        // Company: TechCorp
        // Total objects: 3

        obj2.displayInstanceInfo();
        // Instance ID: 2
        // Name: Bob
        // Company: TechCorp
        // Total objects: 3
    }
}
```

### Static Variables (Class Variables)

```java
public class StaticVariablesDemo {
    // Static variables are shared among all instances
    private static int totalStudents = 0;
    private static final String SCHOOL_NAME = "Java Academy";
    private static double averageGrade = 0.0;

    // Instance variables are unique to each object
    private int studentId;
    private String name;
    private double grade;

    public StaticVariablesDemo(String name, double grade) {
        this.name = name;
        this.grade = grade;
        this.studentId = ++totalStudents; // Each student gets unique ID
        updateAverageGrade();
    }

    // Static method to calculate average
    private static void updateAverageGrade() {
        // In real application, you'd need to track all grades
        // This is simplified for demonstration
        System.out.println("Updating average grade calculation...");
    }

    // Static getter methods
    public static int getTotalStudents() {
        return totalStudents;
    }

    public static String getSchoolName() {
        return SCHOOL_NAME;
    }

    public static double getAverageGrade() {
        return averageGrade;
    }

    // Instance methods
    public String getName() { return name; }
    public int getStudentId() { return studentId; }
    public double getGrade() { return grade; }

    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("School: " + SCHOOL_NAME);
        System.out.println("Total students: " + totalStudents);
    }

    public static void main(String[] args) {
        System.out.println("=== Static Variables Demo ===");

        System.out.println("Initial total students: " + StaticVariablesDemo.getTotalStudents()); // 0
        System.out.println("School: " + StaticVariablesDemo.getSchoolName()); // Java Academy

        // Create students
        StaticVariablesDemo student1 = new StaticVariablesDemo("Alice", 85.5);
        StaticVariablesDemo student2 = new StaticVariablesDemo("Bob", 92.0);
        StaticVariablesDemo student3 = new StaticVariablesDemo("Charlie", 78.5);

        System.out.println("\nAfter creating students:");
        System.out.println("Total students: " + StaticVariablesDemo.getTotalStudents()); // 3

        System.out.println("\nStudent information:");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
}
```

### Static Methods

```java
public class StaticMethodsDemo {
    private static final double PI = 3.14159;
    private String instanceVariable = "Instance data";

    // Static utility methods
    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    public static double calculateCircleCircumference(double radius) {
        return 2 * PI * radius;
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // Static method accessing other static members
    public static void displayMathInfo() {
        System.out.println("PI value: " + PI);
        System.out.println("Circle area (radius 5): " + calculateCircleArea(5));
        System.out.println("Circle circumference (radius 5): " + calculateCircleCircumference(5));

        // System.out.println(instanceVariable); // ❌ Cannot access instance variable
    }

    // Instance method can access both static and instance members
    public void displayAllInfo() {
        System.out.println("Instance variable: " + instanceVariable);
        System.out.println("Static PI: " + PI);
        System.out.println("Calling static method: " + calculateCircleArea(3));
    }

    public static void main(String[] args) {
        System.out.println("=== Static Methods Demo ===");

        // Call static methods without creating objects
        System.out.println("Circle area (radius 10): " + calculateCircleArea(10)); // 314.159
        System.out.println("5! = " + factorial(5)); // 120
        System.out.println("Is 17 prime? " + isPrime(17)); // true
        System.out.println("Is 15 prime? " + isPrime(15)); // false

        displayMathInfo();

        // For instance method, need to create object
        StaticMethodsDemo demo = new StaticMethodsDemo();
        demo.displayAllInfo();
    }
}
```

## When To Use Static

Understanding when to use static members is crucial for good Java design. Here are the key scenarios and best practices.

### 1. Utility Methods and Helper Functions

```java
public class MathUtils {
    // Utility methods should be static
    public static double max(double a, double b) {
        return a > b ? a : b;
    }

    public static double min(double a, double b) {
        return a < b ? a : b;
    }

    public static double average(double... numbers) {
        if (numbers.length == 0) return 0;
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

public class StringUtils {
    // String utility methods
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean isNullOrBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    public static int countWords(String str) {
        if (isNullOrBlank(str)) return 0;
        return str.trim().split("\\s+").length;
    }
}
```

### 2. Constants and Configuration Values

```java
public class AppConstants {
    // Application-wide constants
    public static final String APP_NAME = "My Java Application";
    public static final String VERSION = "1.0.0";
    public static final int MAX_RETRY_ATTEMPTS = 3;
    public static final double TAX_RATE = 0.08;

    // Database configuration
    public static final String DEFAULT_DB_URL = "jdbc:mysql://localhost:3306/myapp";
    public static final int CONNECTION_TIMEOUT = 30000;
    public static final int MAX_CONNECTIONS = 100;

    // File paths
    public static final String LOG_FILE_PATH = "logs/application.log";
    public static final String CONFIG_FILE_PATH = "config/app.properties";

    // Regular expressions
    public static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    public static final String PHONE_REGEX = "^\\+?[1-9]\\d{1,14}$";
}

public class HttpStatus {
    // HTTP status codes as static constants
    public static final int OK = 200;
    public static final int CREATED = 201;
    public static final int BAD_REQUEST = 400;
    public static final int UNAUTHORIZED = 401;
    public static final int FORBIDDEN = 403;
    public static final int NOT_FOUND = 404;
    public static final int INTERNAL_SERVER_ERROR = 500;

    // Method to get status message
    public static String getStatusMessage(int code) {
        switch (code) {
            case OK: return "OK";
            case CREATED: return "Created";
            case BAD_REQUEST: return "Bad Request";
            case UNAUTHORIZED: return "Unauthorized";
            case FORBIDDEN: return "Forbidden";
            case NOT_FOUND: return "Not Found";
            case INTERNAL_SERVER_ERROR: return "Internal Server Error";
            default: return "Unknown Status";
        }
    }
}
```

### 3. Factory Methods and Object Creation

```java
// Factory pattern using static methods
public class DatabaseConnection {
    private String url;
    private String username;
    private String password;

    private DatabaseConnection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    // Static factory methods
    public static DatabaseConnection createMySQLConnection(String host, int port, String database) {
        String url = String.format("jdbc:mysql://%s:%d/%s", host, port, database);
        return new DatabaseConnection(url, "root", "password");
    }

    public static DatabaseConnection createPostgreSQLConnection(String host, int port, String database) {
        String url = String.format("jdbc:postgresql://%s:%d/%s", host, port, database);
        return new DatabaseConnection(url, "postgres", "password");
    }

    public static DatabaseConnection createTestConnection() {
        return new DatabaseConnection("jdbc:h2:mem:testdb", "sa", "");
    }

    public void connect() {
        System.out.println("Connecting to: " + url);
        System.out.println("Username: " + username);
    }

    public String getUrl() { return url; }
}

// Singleton pattern using static
public class Logger {
    private static Logger instance;
    private String logLevel = "INFO";

    private Logger() {
        // Private constructor prevents instantiation
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public static void info(String message) {
        getInstance().log("INFO", message);
    }

    public static void error(String message) {
        getInstance().log("ERROR", message);
    }

    public static void debug(String message) {
        getInstance().log("DEBUG", message);
    }

    private void log(String level, String message) {
        System.out.println(String.format("[%s] %s", level, message));
    }
}
```

### 4. Counter and Statistics Tracking

```java
public class WebsiteStats {
    private static int totalVisitors = 0;
    private static int currentOnlineUsers = 0;
    private static int totalPageViews = 0;

    // Static methods to track statistics
    public static void recordVisitor() {
        totalVisitors++;
        currentOnlineUsers++;
    }

    public static void recordPageView() {
        totalPageViews++;
    }

    public static void userLoggedOut() {
        if (currentOnlineUsers > 0) {
            currentOnlineUsers--;
        }
    }

    // Static getters for statistics
    public static int getTotalVisitors() { return totalVisitors; }
    public static int getCurrentOnlineUsers() { return currentOnlineUsers; }
    public static int getTotalPageViews() { return totalPageViews; }

    public static void displayStats() {
        System.out.println("=== Website Statistics ===");
        System.out.println("Total Visitors: " + totalVisitors);
        System.out.println("Currently Online: " + currentOnlineUsers);
        System.out.println("Total Page Views: " + totalPageViews);
        System.out.println("Average Pages per Visitor: " +
                          (totalVisitors > 0 ? (double)totalPageViews / totalVisitors : 0));
    }
}
```

### 5. When NOT to Use Static

```java
public class StaticAntiPatterns {
    // ❌ BAD: Don't make everything static just to avoid creating objects
    public static class BadUserService {
        private static List<String> users = new ArrayList<>(); // Shared state is problematic

        public static void addUser(String user) {
            users.add(user); // Not thread-safe, hard to test
        }

        public static List<String> getUsers() {
            return users; // Exposes mutable state
        }
    }

    // ✅ GOOD: Use instance methods for stateful operations
    public static class GoodUserService {
        private List<String> users = new ArrayList<>();

        public void addUser(String user) {
            users.add(user);
        }

        public List<String> getUsers() {
            return new ArrayList<>(users); // Return defensive copy
        }
    }

    // ❌ BAD: Static methods that depend on instance state
    public static class BadCalculator {
        private double lastResult;

        // This doesn't make sense - static method trying to use instance variable
        // public static double getLastResult() {
        //     return lastResult; // ❌ Won't compile
        // }
    }

    // ✅ GOOD: Separate static utilities from stateful operations
    public static class Calculator {
        private double lastResult;

        // Instance method for stateful operation
        public double calculate(double a, double b, String operation) {
            lastResult = performCalculation(a, b, operation);
            return lastResult;
        }

        public double getLastResult() {
            return lastResult;
        }

        // Static utility method - pure function
        public static double performCalculation(double a, double b, String operation) {
            switch (operation) {
                case "+": return a + b;
                case "-": return a - b;
                case "*": return a * b;
                case "/": return b != 0 ? a / b : Double.NaN;
                default: throw new IllegalArgumentException("Unknown operation: " + operation);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Good vs Bad Static Usage ===");

        // Using utility method (good)
        double result = Calculator.performCalculation(10, 5, "+");
        System.out.println("Static calculation: " + result); // 15.0

        // Using instance for stateful operations (good)
        Calculator calc = new Calculator();
        calc.calculate(10, 5, "*");
        System.out.println("Last result: " + calc.getLastResult()); // 50.0
    }
}
```

# Static Initialization Block

## Understanding Static Initialization Blocks

Static initialization blocks are special code blocks that execute when a class is first loaded by the JVM. They run before any static methods are called and before any objects of the class are created.

### Basic Static Initialization Block

```java
public class StaticInitializationDemo {
    // Static variables
    private static final String APPLICATION_NAME;
    private static final String VERSION;
    private static int initializationCounter = 0;
    private static long startupTime;

    // Static initialization block - runs when class is first loaded
    static {
        System.out.println("Static initialization block executing...");

        APPLICATION_NAME = "Java Learning App";
        VERSION = "1.0.0";
        startupTime = System.currentTimeMillis();
        initializationCounter++;

        System.out.println("Application initialized: " + APPLICATION_NAME + " v" + VERSION);
        System.out.println("Startup time: " + startupTime);
    }

    // Multiple static blocks are allowed and execute in order
    static {
        System.out.println("Second static block executing...");
        System.out.println("Initialization counter: " + initializationCounter);
    }

    // Static method
    public static void displayInfo() {
        System.out.println("App: " + APPLICATION_NAME);
        System.out.println("Version: " + VERSION);
        System.out.println("Initialized " + initializationCounter + " times");
    }

    // Constructor
    public StaticInitializationDemo() {
        System.out.println("Constructor called - object created");
    }

    public static void main(String[] args) {
        System.out.println("=== Static Initialization Block Demo ===");
        System.out.println("Main method started");

        // Static block has already executed by now
        StaticInitializationDemo.displayInfo();

        // Creating objects - static block won't run again
        System.out.println("\nCreating objects:");
        StaticInitializationDemo obj1 = new StaticInitializationDemo();
        StaticInitializationDemo obj2 = new StaticInitializationDemo();

        // Static block executes only once, no matter how many objects are created
        StaticInitializationDemo.displayInfo();
    }
}
```

### Complex Static Initialization

```java
import java.util.*;
import java.io.*;

public class ConfigurationManager {
    // Static collections and configuration
    private static final Map<String, String> CONFIG_PROPERTIES = new HashMap<>();
    private static final List<String> SUPPORTED_LANGUAGES = new ArrayList<>();
    private static final Set<String> ADMIN_USERS = new HashSet<>();
    private static boolean configurationLoaded = false;
    private static String configurationSource;

    // Complex static initialization block
    static {
        System.out.println("Loading application configuration...");

        try {
            // Initialize supported languages
            SUPPORTED_LANGUAGES.add("English");
            SUPPORTED_LANGUAGES.add("Spanish");
            SUPPORTED_LANGUAGES.add("French");
            SUPPORTED_LANGUAGES.add("German");
            SUPPORTED_LANGUAGES.add("Japanese");

            // Initialize admin users
            ADMIN_USERS.add("admin");
            ADMIN_USERS.add("superuser");
            ADMIN_USERS.add("root");

            // Load configuration from properties (simulated)
            loadConfiguration();

            // Set default values if not loaded
            setDefaultConfiguration();

            configurationLoaded = true;
            configurationSource = "Static initialization";

            System.out.println("Configuration loaded successfully!");
            System.out.println("Supported languages: " + SUPPORTED_LANGUAGES.size());
            System.out.println("Admin users configured: " + ADMIN_USERS.size());
            System.out.println("Configuration properties: " + CONFIG_PROPERTIES.size());

        } catch (Exception e) {
            System.err.println("Error during static initialization: " + e.getMessage());
            configurationLoaded = false;
        }
    }

    // Helper method for static initialization
    private static void loadConfiguration() {
        // Simulate loading from properties file
        CONFIG_PROPERTIES.put("app.name", "My Application");
        CONFIG_PROPERTIES.put("app.version", "2.0.0");
        CONFIG_PROPERTIES.put("database.url", "jdbc:mysql://localhost:3306/myapp");
        CONFIG_PROPERTIES.put("max.connections", "100");
        CONFIG_PROPERTIES.put("timeout.seconds", "30");
        CONFIG_PROPERTIES.put("debug.enabled", "false");
    }

    private static void setDefaultConfiguration() {
        // Set defaults if not already configured
        CONFIG_PROPERTIES.putIfAbsent("language", "English");
        CONFIG_PROPERTIES.putIfAbsent("theme", "light");
        CONFIG_PROPERTIES.putIfAbsent("auto.save", "true");
    }

    // Static methods to access configuration
    public static String getProperty(String key) {
        return CONFIG_PROPERTIES.get(key);
    }

    public static String getProperty(String key, String defaultValue) {
        return CONFIG_PROPERTIES.getOrDefault(key, defaultValue);
    }

    public static boolean isAdmin(String username) {
        return ADMIN_USERS.contains(username);
    }

    public static boolean isLanguageSupported(String language) {
        return SUPPORTED_LANGUAGES.contains(language);
    }

    public static List<String> getSupportedLanguages() {
        return new ArrayList<>(SUPPORTED_LANGUAGES);
    }

    public static boolean isConfigurationLoaded() {
        return configurationLoaded;
    }

    public static void displayConfiguration() {
        System.out.println("\n=== Configuration Status ===");
        System.out.println("Loaded: " + configurationLoaded);
        System.out.println("Source: " + configurationSource);
        System.out.println("\n=== Properties ===");
        CONFIG_PROPERTIES.forEach((key, value) ->
            System.out.println(key + " = " + value));
    }

    public static void main(String[] args) {
        System.out.println("=== Configuration Manager Demo ===");

        // Access configuration (static block already executed)
        System.out.println("App Name: " + getProperty("app.name"));
        System.out.println("Version: " + getProperty("app.version"));
        System.out.println("Debug enabled: " + getProperty("debug.enabled", "false"));

        // Test admin check
        System.out.println("Is 'admin' an admin? " + isAdmin("admin"));
        System.out.println("Is 'user' an admin? " + isAdmin("user"));

        // Test language support
        System.out.println("Is Spanish supported? " + isLanguageSupported("Spanish"));
        System.out.println("Is Chinese supported? " + isLanguageSupported("Chinese"));

        displayConfiguration();
    }
}
```

### Static Block Execution Order

```java
public class StaticExecutionOrder {
    // Static variables are initialized in order of declaration
    private static String first = initializeFirst();
    private static String second = initializeSecond();

    // Static block executes after static variable initialization
    static {
        System.out.println("Static block 1 executing");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }

    private static String third = initializeThird();

    // Another static block
    static {
        System.out.println("Static block 2 executing");
        System.out.println("Third: " + third);
    }

    // Static variable initialization methods
    private static String initializeFirst() {
        System.out.println("Initializing first variable");
        return "FIRST";
    }

    private static String initializeSecond() {
        System.out.println("Initializing second variable");
        return "SECOND";
    }

    private static String initializeThird() {
        System.out.println("Initializing third variable");
        return "THIRD";
    }

    // Constructor
    public StaticExecutionOrder() {
        System.out.println("Constructor executing");
    }

    public static void main(String[] args) {
        System.out.println("=== Static Execution Order Demo ===");
        System.out.println("Main method started");

        System.out.println("\nCreating first object:");
        StaticExecutionOrder obj1 = new StaticExecutionOrder();

        System.out.println("\nCreating second object:");
        StaticExecutionOrder obj2 = new StaticExecutionOrder();
    }
}
```

# Instance Block Initializer

## Understanding Instance Initialization Blocks

Instance initialization blocks (also called instance initializers) are code blocks that execute every time an object is created, before the constructor runs. They're useful for common initialization code shared across multiple constructors.

### Basic Instance Initialization Block

```java
public class InstanceInitializerDemo {
    // Instance variables
    private String name;
    private int id;
    private long creationTime;
    private static int objectCount = 0;

    // Instance initialization block - runs before every constructor
    {
        System.out.println("Instance initialization block executing...");
        creationTime = System.currentTimeMillis();
        objectCount++;
        System.out.println("Object #" + objectCount + " being created");
        System.out.println("Creation time: " + creationTime);
    }

    // Another instance block - they execute in order
    {
        System.out.println("Second instance block executing...");
        // Common validation or setup code can go here
        if (objectCount > 10) {
            System.out.println("Warning: Many objects created!");
        }
    }

    // Default constructor
    public InstanceInitializerDemo() {
        System.out.println("Default constructor executing");
        this.name = "Unknown";
        this.id = objectCount;
    }

    // Parameterized constructor
    public InstanceInitializerDemo(String name) {
        System.out.println("Parameterized constructor executing");
        this.name = name;
        this.id = objectCount;
    }

    // Another constructor
    public InstanceInitializerDemo(String name, int customId) {
        System.out.println("Custom constructor executing");
        this.name = name;
        this.id = customId;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id + ", Created: " + creationTime);
    }

    public static void main(String[] args) {
        System.out.println("=== Instance Initialization Block Demo ===");

        System.out.println("\n--- Creating object with default constructor ---");
        InstanceInitializerDemo obj1 = new InstanceInitializerDemo();
        obj1.displayInfo();

        System.out.println("\n--- Creating object with parameterized constructor ---");
        InstanceInitializerDemo obj2 = new InstanceInitializerDemo("Alice");
        obj2.displayInfo();

        System.out.println("\n--- Creating object with custom constructor ---");
        InstanceInitializerDemo obj3 = new InstanceInitializerDemo("Bob", 100);
        obj3.displayInfo();
    }
}
```

### Complex Instance Initialization Example

```java
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatabaseConnection {
    // Instance variables
    private String connectionId;
    private String databaseUrl;
    private String username;
    private LocalDateTime connectionTime;
    private Map<String, String> connectionProperties;
    private List<String> executionLog;
    private boolean isConnected;

    // Static tracking
    private static int totalConnections = 0;
    private static List<String> allConnectionIds = new ArrayList<>();

    // Instance initialization block - common setup for all constructors
    {
        System.out.println("=== Connection Initialization Block ===");

        // Generate unique connection ID
        connectionId = "CONN_" + System.currentTimeMillis() + "_" + (++totalConnections);
        allConnectionIds.add(connectionId);

        // Initialize connection time
        connectionTime = LocalDateTime.now();

        // Initialize collections
        connectionProperties = new HashMap<>();
        executionLog = new ArrayList<>();

        // Set default properties
        connectionProperties.put("timeout", "30000");
        connectionProperties.put("autoReconnect", "true");
        connectionProperties.put("charset", "UTF-8");
        connectionProperties.put("pool.minSize", "5");
        connectionProperties.put("pool.maxSize", "20");

        // Log initialization
        executionLog.add("Connection initialized at " +
                        connectionTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        executionLog.add("Connection ID assigned: " + connectionId);

        System.out.println("Connection ID: " + connectionId);
        System.out.println("Initialization time: " + connectionTime);
        System.out.println("Default properties loaded: " + connectionProperties.size());
    }

    // Another instance block for validation
    {
        System.out.println("=== Connection Validation Block ===");

        // Validate system resources
        long freeMemory = Runtime.getRuntime().freeMemory();
        if (freeMemory < 1000000) { // Less than 1MB
            System.out.println("Warning: Low memory available");
            executionLog.add("Warning: Low memory during initialization");
        }

        // Check total connections
        if (totalConnections > 50) {
            System.out.println("Warning: High number of connections created");
            executionLog.add("Warning: Connection count exceeded threshold");
        }

        System.out.println("Validation complete");
    }

    // Default constructor - local database
    public DatabaseConnection() {
        System.out.println("=== Default Constructor ===");
        this.databaseUrl = "jdbc:h2:mem:localdb";
        this.username = "sa";
        finishInitialization();
    }

    // MySQL constructor
    public DatabaseConnection(String host, int port, String database, String username, String password) {
        System.out.println("=== MySQL Constructor ===");
        this.databaseUrl = String.format("jdbc:mysql://%s:%d/%s", host, port, database);
        this.username = username;

        // MySQL specific properties
        connectionProperties.put("serverTimezone", "UTC");
        connectionProperties.put("useSSL", "false");
        connectionProperties.put("allowPublicKeyRetrieval", "true");

        finishInitialization();
    }

    // PostgreSQL constructor
    public DatabaseConnection(String host, String database, String username) {
        System.out.println("=== PostgreSQL Constructor ===");
        this.databaseUrl = String.format("jdbc:postgresql://%s:5432/%s", host, database);
        this.username = username;

        // PostgreSQL specific properties
        connectionProperties.put("ssl", "false");
        connectionProperties.put("loggerLevel", "INFO");

        finishInitialization();
    }

    // Common initialization completion
    private void finishInitialization() {
        executionLog.add("Constructor completed for: " + username);
        executionLog.add("Database URL set: " + databaseUrl);
        isConnected = false; // Not actually connected yet

        System.out.println("Database URL: " + databaseUrl);
        System.out.println("Username: " + username);
        System.out.println("Ready to connect");
    }

    // Method to simulate connection
    public void connect() {
        if (!isConnected) {
            System.out.println("Connecting to database...");
            isConnected = true;
            executionLog.add("Connected at " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME));
        } else {
            System.out.println("Already connected");
        }
    }

    public void disconnect() {
        if (isConnected) {
            System.out.println("Disconnecting...");
            isConnected = false;
            executionLog.add("Disconnected at " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME));
        }
    }

    // Getters
    public String getConnectionId() { return connectionId; }
    public String getDatabaseUrl() { return databaseUrl; }
    public String getUsername() { return username; }
    public boolean isConnected() { return isConnected; }
    public static int getTotalConnections() { return totalConnections; }

    public void displayConnectionInfo() {
        System.out.println("\n=== Connection Information ===");
        System.out.println("ID: " + connectionId);
        System.out.println("URL: " + databaseUrl);
        System.out.println("User: " + username);
        System.out.println("Connected: " + isConnected);
        System.out.println("Created: " + connectionTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        System.out.println("\nProperties:");
        connectionProperties.forEach((key, value) ->
            System.out.println("  " + key + " = " + value));

        System.out.println("\nExecution Log:");
        executionLog.forEach(entry -> System.out.println("  " + entry));
    }

    public static void displayGlobalStats() {
        System.out.println("\n=== Global Connection Statistics ===");
        System.out.println("Total connections created: " + totalConnections);
        System.out.println("All connection IDs: " + allConnectionIds);
    }

    public static void main(String[] args) {
        System.out.println("=== Instance Initialization Demo ===");

        System.out.println("\n1. Creating default connection:");
        DatabaseConnection conn1 = new DatabaseConnection();
        conn1.connect();
        conn1.displayConnectionInfo();

        System.out.println("\n2. Creating MySQL connection:");
        DatabaseConnection conn2 = new DatabaseConnection("localhost", 3306, "myapp", "root", "password");
        conn2.connect();
        conn2.displayConnectionInfo();

        System.out.println("\n3. Creating PostgreSQL connection:");
        DatabaseConnection conn3 = new DatabaseConnection("localhost", "testdb", "postgres");
        conn3.displayConnectionInfo();

        DatabaseConnection.displayGlobalStats();
    }
}
```

### Instance vs Static vs Constructor Execution Order

```java
public class ExecutionOrderDemo {
    // Static variables
    private static String staticVar = initStaticVar();

    // Instance variables
    private String instanceVar = initInstanceVar();

    // Static block
    static {
        System.out.println("3. Static initialization block");
    }

    // Instance block
    {
        System.out.println("5. Instance initialization block 1");
    }

    // Another instance block
    {
        System.out.println("6. Instance initialization block 2");
        instanceVar = instanceVar + " (modified in block)";
    }

    // Static variable initializer
    private static String initStaticVar() {
        System.out.println("2. Static variable initializer");
        return "STATIC_VALUE";
    }

    // Instance variable initializer
    private String initInstanceVar() {
        System.out.println("4. Instance variable initializer");
        return "INSTANCE_VALUE";
    }

    // Constructor
    public ExecutionOrderDemo() {
        System.out.println("7. Constructor executing");
        System.out.println("   Static var: " + staticVar);
        System.out.println("   Instance var: " + instanceVar);
    }

    public ExecutionOrderDemo(String message) {
        System.out.println("7. Parameterized constructor executing: " + message);
        System.out.println("   Static var: " + staticVar);
        System.out.println("   Instance var: " + instanceVar);
    }

    public static void main(String[] args) {
        System.out.println("1. Main method started");

        System.out.println("\n--- Creating first object ---");
        ExecutionOrderDemo obj1 = new ExecutionOrderDemo();

        System.out.println("\n--- Creating second object ---");
        ExecutionOrderDemo obj2 = new ExecutionOrderDemo("Hello");
    }
}
```

# Static Import

## Understanding Static Import

Static import allows you to access static members of a class directly without qualifying them with the class name. This can make code more readable when frequently using static methods or constants from utility classes.

### Basic Static Import Syntax

```java
// Regular imports
import java.util.List;
import java.util.ArrayList;

// Static imports - import specific static members
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.System.out;

// Static import all static members from a class
import static java.lang.Math.*;

public class StaticImportBasics {
    public static void main(String[] args) {
        System.out.println("=== Static Import Demo ===");

        // Without static import - need class qualification
        double area1 = java.lang.Math.PI * java.lang.Math.pow(5, 2);
        System.out.println("Area without static import: " + area1);

        // With static import - direct access to static members
        double area2 = PI * pow(5, 2);
        out.println("Area with static import: " + area2); // Using statically imported 'out'

        // Other math operations using static imports
        double hypotenuse = sqrt(pow(3, 2) + pow(4, 2));
        out.println("Hypotenuse: " + hypotenuse); // 5.0

        // Using multiple static imports
        double volume = (4.0 / 3.0) * PI * pow(3, 3);
        out.println("Sphere volume (radius 3): " + volume);
    }
}
```

### Static Import with Utility Classes

```java
// Custom utility class
public class MathUtils {
    public static final double GOLDEN_RATIO = 1.618033988749;
    public static final double EULER_NUMBER = 2.718281828459;

    public static double average(double... numbers) {
        if (numbers.length == 0) return 0;
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static double max(double... numbers) {
        if (numbers.length == 0) return Double.NaN;
        double maximum = numbers[0];
        for (double num : numbers) {
            if (num > maximum) maximum = num;
        }
        return maximum;
    }

    public static double min(double... numbers) {
        if (numbers.length == 0) return Double.NaN;
        double minimum = numbers[0];
        for (double num : numbers) {
            if (num < minimum) minimum = num;
        }
        return minimum;
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}

// Using static imports with custom utility class
import static MathUtils.*;
import static java.lang.System.out;

public class CustomStaticImportDemo {
    public static void main(String[] args) {
        out.println("=== Custom Static Import Demo ===");

        // Using static imported constants
        out.println("Golden Ratio: " + GOLDEN_RATIO);
        out.println("Euler's Number: " + EULER_NUMBER);

        // Using static imported methods
        double[] scores = {85.5, 92.0, 78.5, 96.0, 88.5};

        out.println("\nScores: " + java.util.Arrays.toString(scores));
        out.println("Average: " + average(scores));
        out.println("Maximum: " + max(scores));
        out.println("Minimum: " + min(scores));

        // Mathematical operations
        out.println("\nFactorial calculations:");
        for (int i = 1; i <= 5; i++) {
            out.println(i + "! = " + factorial(i));
        }

        // Prime number checking
        out.println("\nPrime number check:");
        int[] numbers = {2, 3, 4, 5, 15, 17, 25, 29};
        for (int num : numbers) {
            out.println(num + " is prime: " + isPrime(num));
        }
    }
}
```

### Static Import with Collections and Arrays

```java
import static java.util.Collections.*;
import static java.util.Arrays.*;
import static java.lang.System.out;

import java.util.*;

public class CollectionsStaticImport {
    public static void main(String[] args) {
        out.println("=== Collections Static Import Demo ===");

        // Create and manipulate lists using static imports
        List<Integer> numbers = new ArrayList<>();
        addAll(numbers, 5, 2, 8, 1, 9, 3);
        out.println("Original list: " + numbers);

        // Sort using static import
        sort(numbers);
        out.println("Sorted list: " + numbers);

        // Reverse using static import
        reverse(numbers);
        out.println("Reversed list: " + numbers);

        // Shuffle using static import
        shuffle(numbers);
        out.println("Shuffled list: " + numbers);

        // Binary search using static import
        sort(numbers); // Need to sort first
        int index = binarySearch(numbers, 5);
        out.println("Index of 5: " + index);

        // Min and max using static import
        out.println("Min: " + min(numbers));
        out.println("Max: " + max(numbers));

        // Working with arrays using static imports
        int[] array = {10, 5, 8, 3, 7, 1};
        out.println("\nOriginal array: " + toString(array));

        sort(array); // Arrays.sort statically imported
        out.println("Sorted array: " + toString(array));

        // Binary search on array
        int arrayIndex = binarySearch(array, 7);
        out.println("Index of 7 in array: " + arrayIndex);

        // Fill array
        int[] filledArray = new int[5];
        fill(filledArray, 42);
        out.println("Filled array: " + toString(filledArray));

        // Copy array
        int[] copiedArray = copyOf(array, array.length);
        out.println("Copied array: " + toString(copiedArray));
    }
}
```

### Static Import Best Practices and Pitfalls

```java
// Example of good and bad static import usage

// StringUtils.java - Utility class
public class StringUtils {
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isBlank(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static String reverse(String str) {
        if (isEmpty(str)) return str;
        return new StringBuilder(str).reverse().toString();
    }

    public static String capitalize(String str) {
        if (isEmpty(str)) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static int count(String str, char ch) {
        if (isEmpty(str)) return 0;
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }
        return count;
    }
}

// Good static import usage
import static StringUtils.isEmpty;
import static StringUtils.isBlank;
import static java.lang.System.out;

public class GoodStaticImportExample {
    public static void main(String[] args) {
        out.println("=== Good Static Import Practices ===");

        String[] testStrings = {"", "  ", "Hello", null, "Java Programming"};

        for (String str : testStrings) {
            out.println("String: '" + str + "'");
            out.println("  isEmpty: " + isEmpty(str));
            out.println("  isBlank: " + isBlank(str));
            out.println();
        }
    }
}

// Problematic static import usage
import static StringUtils.*; // ❌ Importing all static members
import static java.lang.Math.*; // ❌ Too broad, potential conflicts
import static java.lang.System.*; // ❌ Very broad import

public class ProblematicStaticImportExample {
    public static void main(String[] args) {
        // ❌ Problems with broad static imports:

        // 1. Namespace pollution - unclear where methods come from
        out.println("Using out - but from where?");

        // 2. Potential naming conflicts
        // If multiple classes have same static method names

        // 3. Reduced readability - hard to know method origins
        String text = "hello world";
        out.println("Reversed: " + reverse(text)); // Which reverse method?
        out.println("Capitalized: " + capitalize(text)); // From which class?

        // 4. IDE confusion and harder maintenance
        double result = pow(2, 3); // Math.pow but not obvious
        out.println("Power result: " + result);
    }
}

// Better approach - selective static imports
import static StringUtils.isEmpty;
import static StringUtils.capitalize;
import static java.lang.Math.pow;
import static java.lang.Math.PI;
import static java.lang.System.out;

public class BetterStaticImportExample {
    public static void main(String[] args) {
        out.println("=== Better Static Import Practices ===");

        // ✅ Clear and selective imports
        String text = "hello world";

        if (!isEmpty(text)) {
            out.println("Original: " + text);
            out.println("Capitalized: " + capitalize(text));
        }

        // ✅ Mathematical calculations with clear static imports
        double circleArea = PI * pow(5, 2);
        out.println("Circle area (radius 5): " + circleArea);

        // ✅ When in doubt, use class qualification for clarity
        String reversed = StringUtils.reverse(text); // Explicit for clarity
        out.println("Reversed: " + reversed);
    }
}
```

### Static Import with Enums

```java
// Priority enum
public enum Priority {
    LOW(1), MEDIUM(2), HIGH(3), CRITICAL(4);

    private final int level;

    Priority(int level) {
        this.level = level;
    }

    public int getLevel() { return level; }

    public static Priority fromLevel(int level) {
        for (Priority p : values()) {
            if (p.level == level) return p;
        }
        throw new IllegalArgumentException("Invalid priority level: " + level);
    }
}

// Task class using Priority
public class Task {
    private String title;
    private Priority priority;

    public Task(String title, Priority priority) {
        this.title = title;
        this.priority = priority;
    }

    public String getTitle() { return title; }
    public Priority getPriority() { return priority; }

    @Override
    public String toString() {
        return String.format("Task{title='%s', priority=%s}", title, priority);
    }
}

// Using static import with enums
import static Priority.*;
import static java.lang.System.out;
import java.util.*;

public class EnumStaticImportDemo {
    public static void main(String[] args) {
        out.println("=== Enum Static Import Demo ===");

        // Create tasks using statically imported enum constants
        List<Task> tasks = Arrays.asList(
            new Task("Fix bug in login", HIGH),           // Instead of Priority.HIGH
            new Task("Update documentation", LOW),        // Instead of Priority.LOW
            new Task("Security audit", CRITICAL),         // Instead of Priority.CRITICAL
            new Task("Code review", MEDIUM),              // Instead of Priority.MEDIUM
            new Task("Database backup", HIGH)             // Instead of Priority.HIGH
        );

        out.println("All tasks:");
        tasks.forEach(out::println);

        // Filter high priority tasks
        out.println("\nHigh priority tasks:");
        tasks.stream()
             .filter(task -> task.getPriority() == HIGH) // Using statically imported HIGH
             .forEach(out::println);

        // Filter critical tasks
        out.println("\nCritical tasks:");
        tasks.stream()
             .filter(task -> task.getPriority() == CRITICAL) // Using statically imported CRITICAL
             .forEach(out::println);

        // Sort by priority level
        out.println("\nTasks sorted by priority:");
        tasks.stream()
             .sorted(Comparator.comparing(task -> task.getPriority().getLevel()))
             .forEach(out::println);
    }
}
```

## Static Import Summary

### ✅ When to Use Static Import:

- Frequently used mathematical constants (`Math.PI`, `Math.E`)
- Common utility methods (`Math.sqrt`, `Math.pow`)
- System output (`System.out`)
- Enum constants when heavily used
- Well-known static methods from utility classes

### ❌ When to Avoid Static Import:

- Importing all static members (`import static Class.*`)
- When it reduces code readability
- When method origin becomes unclear
- When there are potential naming conflicts
- For rarely used static members

### 🏆 Best Practices:

1. **Be selective** - Import only frequently used static members
2. **Maintain clarity** - Don't sacrifice readability for brevity
3. **Avoid conflicts** - Be careful with common method names
4. **Use judiciously** - Static import should enhance, not complicate code
5. **Document when necessary** - Add comments if static import usage might be unclear

# Enums

## What are Enums?

Enums (enumerations) are a special type in Java that represents a fixed set of constants. They provide type safety and make code more readable.

### Basic Enum Declaration

```java
public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public enum Status {
    PENDING, APPROVED, REJECTED, CANCELLED
}
```

### Using Enums

```java
public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        Status orderStatus = Status.PENDING;

        System.out.println("Today is: " + today);
        System.out.println("Order status: " + orderStatus);

        // Enum comparison
        if (today == Day.MONDAY) {
            System.out.println("It's Monday!");
        }

        // Switch statement with enums
        switch (today) {
            case MONDAY:
                System.out.println("Start of work week");
                break;
            case FRIDAY:
                System.out.println("TGIF!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Midweek");
        }
    }
}
```

### Enums with Fields and Constructors

```java
public enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6);

    private final double mass;   // in kilograms
    private final double radius; // in meters

    // Enum constructor is always private
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() { return mass; }
    public double getRadius() { return radius; }

    // Calculate surface gravity
    public double surfaceGravity() {
        final double G = 6.67300E-11;
        return G * mass / (radius * radius);
    }
}
```

### Practical Enum Examples

#### 1. HTTP Status Codes

```java
public enum HttpStatus {
    OK(200, "OK"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    BAD_REQUEST(400, "Bad Request");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() { return code; }
    public String getMessage() { return message; }

    public static HttpStatus fromCode(int code) {
        for (HttpStatus status : values()) {
            if (status.code == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown status code: " + code);
    }
}
```

#### 2. Order Processing

```java
public enum OrderStatus {
    CREATED("Order has been created"),
    PAID("Payment confirmed"),
    SHIPPED("Order has been shipped"),
    DELIVERED("Order delivered successfully"),
    CANCELLED("Order was cancelled");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean canTransitionTo(OrderStatus newStatus) {
        switch (this) {
            case CREATED:
                return newStatus == PAID || newStatus == CANCELLED;
            case PAID:
                return newStatus == SHIPPED || newStatus == CANCELLED;
            case SHIPPED:
                return newStatus == DELIVERED;
            default:
                return false;
        }
    }
}
```

#### 3. Configuration Levels

```java
public enum LogLevel {
    DEBUG(1, "DEBUG"),
    INFO(2, "INFO"),
    WARN(3, "WARN"),
    ERROR(4, "ERROR");

    private final int priority;
    private final String displayName;

    LogLevel(int priority, String displayName) {
        this.priority = priority;
        this.displayName = displayName;
    }

    public boolean shouldLog(LogLevel messageLevel) {
        return messageLevel.priority >= this.priority;
    }

    public String getDisplayName() {
        return displayName;
    }
}
```

### Enum with Abstract Methods

```java
public enum Operation {
    PLUS("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public abstract double apply(double x, double y);

    public String getSymbol() {
        return symbol;
    }
}

// Usage
public class Calculator {
    public static void main(String[] args) {
        double result = Operation.PLUS.apply(5, 3);
        System.out.println("5 + 3 = " + result);
    }
}
```

### Enum Best Practices

#### 1. Use Enums Instead of Constants

```java
// ❌ Bad: Using constants
public class OrderStatusConstants {
    public static final int STATUS_PENDING = 1;
    public static final int STATUS_APPROVED = 2;
    public static final int STATUS_REJECTED = 3;
}

// ✅ Good: Using enum
public enum OrderStatus {
    PENDING, APPROVED, REJECTED
}
```

#### 2. Implement Interfaces

```java
public interface Describable {
    String getDescription();
}

public enum Priority implements Describable {
    LOW("Low priority"),
    MEDIUM("Medium priority"),
    HIGH("High priority"),
    CRITICAL("Critical priority");

    private final String description;

    Priority(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
```

# Enum Methods

## Built-in Enum Methods

All enums automatically inherit several useful methods from `java.lang.Enum`:

### 1. `values()` Method

Returns an array containing all enum constants.

```java
public enum Color {
    RED, GREEN, BLUE, YELLOW
}

public class EnumMethodsExample {
    public static void main(String[] args) {
        // Get all enum values
        Color[] colors = Color.values();

        System.out.println("All colors:");
        for (Color color : colors) {
            System.out.println(color);
        }

        // Enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (Color color : Color.values()) {
            System.out.println("Color: " + color);
        }
    }
}
```

### 2. `valueOf()` Method

Converts a string to an enum constant.

```java
public class ValueOfExample {
    public static void main(String[] args) {
        // Convert string to enum
        Color red = Color.valueOf("RED");
        System.out.println("Parsed color: " + red);

        // Case sensitive - this would throw IllegalArgumentException
        try {
            Color invalid = Color.valueOf("red"); // Wrong case
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Safe parsing with validation
        String userInput = "BLUE";
        Color userColor = parseColorSafely(userInput);
        if (userColor != null) {
            System.out.println("Valid color: " + userColor);
        }
    }

    public static Color parseColorSafely(String colorName) {
        try {
            return Color.valueOf(colorName.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid color: " + colorName);
            return null;
        }
    }
}
```

### 3. `name()` Method

Returns the name of the enum constant as declared.

```java
public enum Status {
    ACTIVE, INACTIVE, SUSPENDED
}

public class NameMethodExample {
    public static void main(String[] args) {
        Status status = Status.ACTIVE;

        String name = status.name();
        System.out.println("Enum name: " + name); // Output: ACTIVE

        // Useful for serialization or database storage
        saveStatusToDatabase(status.name());
    }

    public static void saveStatusToDatabase(String statusName) {
        System.out.println("Saving status: " + statusName);
    }
}
```

### 4. `ordinal()` Method

Returns the position of the enum constant (zero-based).

```java
public enum Priority {
    LOW, MEDIUM, HIGH, CRITICAL
}

public class OrdinalExample {
    public static void main(String[] args) {
        for (Priority priority : Priority.values()) {
            System.out.println(priority + " has ordinal: " + priority.ordinal());
        }

        // Comparing priorities using ordinal
        Priority p1 = Priority.HIGH;
        Priority p2 = Priority.MEDIUM;

        if (p1.ordinal() > p2.ordinal()) {
            System.out.println(p1 + " has higher priority than " + p2);
        }
    }
}
```

### 5. `compareTo()` Method

Compares enum constants based on their ordinal values.

```java
public class CompareToExample {
    public static void main(String[] args) {
        Priority high = Priority.HIGH;
        Priority medium = Priority.MEDIUM;
        Priority critical = Priority.CRITICAL;

        System.out.println("HIGH vs MEDIUM: " + high.compareTo(medium)); // Positive
        System.out.println("MEDIUM vs HIGH: " + medium.compareTo(high)); // Negative
        System.out.println("HIGH vs HIGH: " + high.compareTo(high));     // Zero

        // Sorting enums
        List<Priority> priorities = Arrays.asList(
            Priority.MEDIUM, Priority.CRITICAL, Priority.LOW, Priority.HIGH
        );

        Collections.sort(priorities);
        System.out.println("Sorted priorities: " + priorities);
    }
}
```

## Custom Enum Methods

You can add your own methods to enums:

### Example: Enhanced Status Enum

```java
public enum TaskStatus {
    TODO("To Do", false),
    IN_PROGRESS("In Progress", false),
    TESTING("Testing", false),
    DONE("Done", true),
    CANCELLED("Cancelled", true);

    private final String displayName;
    private final boolean terminal;

    TaskStatus(String displayName, boolean terminal) {
        this.displayName = displayName;
        this.terminal = terminal;
    }

    // Custom methods
    public String getDisplayName() {
        return displayName;
    }

    public boolean isTerminal() {
        return terminal;
    }

    public boolean canTransitionTo(TaskStatus newStatus) {
        if (this.terminal) {
            return false; // Terminal states cannot transition
        }

        switch (this) {
            case TODO:
                return newStatus == IN_PROGRESS || newStatus == CANCELLED;
            case IN_PROGRESS:
                return newStatus == TESTING || newStatus == CANCELLED;
            case TESTING:
                return newStatus == DONE || newStatus == IN_PROGRESS;
            default:
                return false;
        }
    }

    public TaskStatus getNext() {
        switch (this) {
            case TODO: return IN_PROGRESS;
            case IN_PROGRESS: return TESTING;
            case TESTING: return DONE;
            default: return this; // No next state
        }
    }

    // Static utility methods
    public static TaskStatus fromDisplayName(String displayName) {
        for (TaskStatus status : values()) {
            if (status.displayName.equalsIgnoreCase(displayName)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown display name: " + displayName);
    }

    public static List<TaskStatus> getActiveStatuses() {
        return Arrays.stream(values())
                .filter(status -> !status.terminal)
                .collect(Collectors.toList());
    }
}
```

### Usage Example

```java
public class TaskManager {
    public static void main(String[] args) {
        TaskStatus currentStatus = TaskStatus.TODO;

        System.out.println("Current status: " + currentStatus.getDisplayName());
        System.out.println("Is terminal: " + currentStatus.isTerminal());

        // Transition through states
        while (!currentStatus.isTerminal()) {
            TaskStatus nextStatus = currentStatus.getNext();
            if (currentStatus.canTransitionTo(nextStatus)) {
                System.out.println("Transitioning from " + currentStatus.getDisplayName()
                                 + " to " + nextStatus.getDisplayName());
                currentStatus = nextStatus;
            } else {
                break;
            }
        }

        // Show active statuses
        System.out.println("\nActive statuses:");
        TaskStatus.getActiveStatuses().forEach(status ->
            System.out.println("- " + status.getDisplayName()));
    }
}
```

### Advanced Enum Pattern: State Machine

```java
public enum ConnectionState {
    DISCONNECTED {
        @Override
        public ConnectionState connect() {
            System.out.println("Connecting...");
            return CONNECTING;
        }
    },
    CONNECTING {
        @Override
        public ConnectionState connect() {
            return this; // Already connecting
        }

        @Override
        public ConnectionState connectionEstablished() {
            System.out.println("Connection established");
            return CONNECTED;
        }

        @Override
        public ConnectionState disconnect() {
            System.out.println("Connection cancelled");
            return DISCONNECTED;
        }
    },
    CONNECTED {
        @Override
        public ConnectionState disconnect() {
            System.out.println("Disconnecting...");
            return DISCONNECTED;
        }
    };

    // Default implementations (can be overridden)
    public ConnectionState connect() {
        System.out.println("Cannot connect from state: " + this);
        return this;
    }

    public ConnectionState disconnect() {
        System.out.println("Cannot disconnect from state: " + this);
        return this;
    }

    public ConnectionState connectionEstablished() {
        System.out.println("Unexpected connection established in state: " + this);
        return this;
    }
}
```

This demonstrates how enums can implement sophisticated state machines with behavior specific to each state.

# Implicit and Explicit Type Casting

## What is Type Casting?

Type casting is the process of converting one data type to another. Java supports two types of casting: implicit (automatic) and explicit (manual).

### Data Type Hierarchy

```
byte → short → int → long → float → double
       char  → int
```

## Implicit Casting (Widening)

Automatic conversion from smaller to larger data types. No data loss occurs.

### Examples of Implicit Casting

```java
public class ImplicitCasting {
    public static void main(String[] args) {
        // Numeric promotions
        byte b = 10;
        short s = b;    // byte to short
        int i = s;      // short to int
        long l = i;     // int to long
        float f = l;    // long to float
        double d = f;   // float to double

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        // Character to int
        char c = 'A';
        int asciiValue = c; // char to int (ASCII value)
        System.out.println("Character 'A' has ASCII value: " + asciiValue);

        // Mixed operations
        int x = 10;
        double y = 3.5;
        double result = x + y; // int is promoted to double
        System.out.println("10 + 3.5 = " + result);
    }
}
```

## Explicit Casting (Narrowing)

Manual conversion from larger to smaller data types. Potential data loss may occur.

### Basic Explicit Casting

```java
public class ExplicitCasting {
    public static void main(String[] args) {
        // Narrowing conversions require explicit casting
        double d = 123.456;
        float f = (float) d;    // double to float
        long l = (long) f;      // float to long (truncates decimal)
        int i = (int) l;        // long to int
        short s = (short) i;    // int to short
        byte b = (byte) s;      // short to byte

        System.out.println("Original double: " + d);
        System.out.println("float: " + f);
        System.out.println("long: " + l);
        System.out.println("int: " + i);
        System.out.println("short: " + s);
        System.out.println("byte: " + b);

        // Data loss example
        int largeNumber = 1000;
        byte smallByte = (byte) largeNumber;
        System.out.println("1000 as byte: " + smallByte); // -24 (overflow)

        // Decimal truncation
        double decimal = 9.99;
        int truncated = (int) decimal;
        System.out.println("9.99 as int: " + truncated); // 9
    }
}
```

### Best Practices for Type Casting

```java
public class SafeCasting {
    public static void main(String[] args) {
        // Check range before casting
        long value = 200L;

        if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
            byte safeByte = (byte) value;
            System.out.println("Safe cast to byte: " + safeByte);
        } else {
            System.out.println("Value too large for byte");
        }

        // Use wrapper class methods for string conversion
        String numberString = "123";
        try {
            int parsed = Integer.parseInt(numberString);
            System.out.println("Parsed number: " + parsed);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}
```

# Global and Local Variables

## Understanding Variable Scope

Variable scope determines where a variable can be accessed in your program.

### Local Variables

Variables declared inside methods, constructors, or blocks.

```java
public class LocalVariables {
    public static void main(String[] args) {
        int localVar = 10; // Local to main method

        if (true) {
            int blockVar = 20; // Local to this block
            System.out.println("Block variable: " + blockVar);
        }
        // blockVar not accessible here

        for (int i = 0; i < 3; i++) {
            int loopVar = i * 2; // Local to loop iteration
            System.out.println("Loop var: " + loopVar);
        }
        // i and loopVar not accessible here
    }
}
```

### Instance Variables

Variables declared at class level, belonging to object instances.

```java
public class InstanceVariables {
    private String name;        // Instance variable
    private int age;           // Instance variable
    private static int count = 0; // Static variable (class-level)

    public InstanceVariables(String name, int age) {
        this.name = name;   // 'this' refers to current object
        this.age = age;
        count++;            // Increment shared counter
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println("Total objects created: " + count);
    }
}
```

# Wrapper Classes

## What are Wrapper Classes?

Wrapper classes provide object representations of primitive data types.

### Primitive Types and Their Wrappers

| Primitive | Wrapper Class |
| --------- | ------------- |
| `boolean` | `Boolean`     |
| `byte`    | `Byte`        |
| `short`   | `Short`       |
| `int`     | `Integer`     |
| `long`    | `Long`        |
| `float`   | `Float`       |
| `double`  | `Double`      |
| `char`    | `Character`   |

### Autoboxing and Unboxing

```java
public class AutoboxingExample {
    public static void main(String[] args) {
        // Autoboxing: primitive to wrapper
        Integer boxedInt = 100;        // int to Integer
        Double boxedDouble = 3.14;     // double to Double

        // Unboxing: wrapper to primitive
        int primitiveInt = boxedInt;           // Integer to int
        double primitiveDouble = boxedDouble;  // Double to double

        // Collections require wrapper classes
        java.util.List<Integer> numbers = new java.util.ArrayList<>();
        numbers.add(10);    // Autoboxing: int to Integer
        numbers.add(20);

        // Utility methods
        int parsed = Integer.parseInt("123");
        String converted = Integer.toString(456);

        System.out.println("Parsed: " + parsed);
        System.out.println("Converted: " + converted);
        System.out.println("Max Integer: " + Integer.MAX_VALUE);
    }
}
```

### Common Pitfalls

```java
public class WrapperPitfalls {
    public static void main(String[] args) {
        // Null pointer exception risk
        Integer nullInt = null;
        try {
            int value = nullInt; // NullPointerException!
        } catch (NullPointerException e) {
            System.out.println("Cannot unbox null wrapper");
        }

        // Reference vs value equality
        Integer a = new Integer(100);
        Integer b = new Integer(100);
        Integer c = 100; // Cached
        Integer d = 100; // Cached

        System.out.println("a == b: " + (a == b));         // false
        System.out.println("a.equals(b): " + a.equals(b)); // true
        System.out.println("c == d: " + (c == d));         // true (cached)
    }
}
```

# OOP

## Introduction to Classes and Objects

Classes and objects are the fundamental building blocks of object-oriented programming (OOP) in Java. Understanding these concepts is crucial for creating well-structured, maintainable, and reusable code.

### What is Object-Oriented Programming?

Object-oriented programming is a programming paradigm that organizes code around objects rather than functions and logic. It provides a way to structure programs so that properties and behaviors are bundled into individual objects.

#### Key Benefits of OOP:

- **Modularity**: Code is organized into discrete objects
- **Reusability**: Objects can be reused across different parts of an application
- **Maintainability**: Changes to one object don't affect others
- **Abstraction**: Complex implementation details are hidden
- **Encapsulation**: Data and methods are bundled together

### Real-World Object Examples

```java
public class ObjectExamples {
    public static void main(String[] args) {
        // Think of objects as real-world entities
        demonstrateRealWorldObjects();
    }

    private static void demonstrateRealWorldObjects() {
        System.out.println("=== Real-World Object Examples ===");

        // A car has properties (attributes) and behaviors (methods)
        System.out.println("Car Object:");
        System.out.println("  Properties: brand, model, year, color, mileage");
        System.out.println("  Behaviors: start(), stop(), accelerate(), brake()");

        // A bank account has properties and behaviors
        System.out.println("\nBank Account Object:");
        System.out.println("  Properties: accountNumber, balance, ownerName, accountType");
        System.out.println("  Behaviors: deposit(), withdraw(), checkBalance(), transfer()");

        // A student has properties and behaviors
        System.out.println("\nStudent Object:");
        System.out.println("  Properties: studentId, name, age, grade, courses");
        System.out.println("  Behaviors: enroll(), study(), takeExam(), graduate()");
    }
}
```

### Classes vs Objects

```java
public class ClassVsObjectDemo {
    public static void main(String[] args) {
        System.out.println("=== Understanding Classes vs Objects ===");

        // CLASS: A blueprint or template
        System.out.println("CLASS = Blueprint/Template");
        System.out.println("- Defines what properties an object will have");
        System.out.println("- Defines what behaviors an object can perform");
        System.out.println("- Does not consume memory until instantiated");

        System.out.println("\nOBJECT = Instance of a Class");
        System.out.println("- Actual entity created from the class blueprint");
        System.out.println("- Has actual values for properties");
        System.out.println("- Can perform the behaviors defined in the class");
        System.out.println("- Consumes memory");

        // Example: Cookie cutter (class) vs actual cookies (objects)
        System.out.println("\n=== Cookie Analogy ===");
        System.out.println("Class = Cookie cutter (defines shape and structure)");
        System.out.println("Objects = Individual cookies made from the cutter");
        System.out.println("- Each cookie has the same shape (structure)");
        System.out.println("- But each can have different flavors, decorations (values)");
    }
}
```

# Your First Class

## Creating Your First Java Class

A class in Java is a blueprint for creating objects. It defines the properties (fields) and behaviors (methods) that objects of that class will have.

### Basic Class Structure

```java
// Basic class structure
public class Person {
    // Fields (properties/attributes)
    String name;
    int age;
    String email;

    // Methods (behaviors)
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }

    public void celebrateBirthday() {
        age++;
        System.out.println("Happy birthday! I'm now " + age + " years old.");
    }
}
```

### Creating and Using Objects

```java
public class PersonDemo {
    public static void main(String[] args) {
        // Creating objects (instances) of the Person class
        Person person1 = new Person();
        Person person2 = new Person();

        // Setting properties for person1
        person1.name = "Alice";
        person1.age = 25;
        person1.email = "alice@example.com";

        // Setting properties for person2
        person2.name = "Bob";
        person2.age = 30;
        person2.email = "bob@example.com";

        // Using methods
        person1.introduce(); // Hi, I'm Alice and I'm 25 years old.
        person2.introduce(); // Hi, I'm Bob and I'm 30 years old.

        // Modifying object state
        person1.celebrateBirthday(); // Happy birthday! I'm now 26 years old.

        // Demonstrating that objects are independent
        System.out.println("After birthday:");
        System.out.println("Person 1 age: " + person1.age); // 26
        System.out.println("Person 2 age: " + person2.age); // 30 (unchanged)
    }
}
```

### Complete Example: Student Class

```java
public class Student {
    // Fields
    int studentId;
    String name;
    String major;
    double gpa;
    int creditHours;

    // Methods
    public void displayInfo() {
        System.out.println("=== Student Information ===");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + String.format("%.2f", gpa));
        System.out.println("Credit Hours: " + creditHours);
    }

    public void addCreditHours(int hours) {
        creditHours += hours;
        System.out.println("Added " + hours + " credit hours. Total: " + creditHours);
    }

    public void updateGPA(double newGPA) {
        System.out.println("GPA updated from " + String.format("%.2f", gpa) +
                          " to " + String.format("%.2f", newGPA));
        gpa = newGPA;
    }

    public String getClassification() {
        if (creditHours < 30) {
            return "Freshman";
        } else if (creditHours < 60) {
            return "Sophomore";
        } else if (creditHours < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    public boolean isEligibleForGraduation() {
        return creditHours >= 120 && gpa >= 2.0;
    }
}
```

### Using the Student Class

```java
public class StudentDemo {
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student();
        Student student2 = new Student();

        // Initialize student1
        student1.studentId = 12345;
        student1.name = "Emma Johnson";
        student1.major = "Computer Science";
        student1.gpa = 3.75;
        student1.creditHours = 85;

        // Initialize student2
        student2.studentId = 67890;
        student2.name = "Michael Chen";
        student2.major = "Engineering";
        student2.gpa = 3.45;
        student2.creditHours = 115;

        // Display information
        student1.displayInfo();
        // === Student Information ===
        // ID: 12345
        // Name: Emma Johnson
        // Major: Computer Science
        // GPA: 3.75
        // Credit Hours: 85

        System.out.println();
        student2.displayInfo();

        // Use methods
        System.out.println("\n=== Student Operations ===");

        // Check classifications
        System.out.println(student1.name + " is a " + student1.getClassification());
        // Emma Johnson is a Junior
        System.out.println(student2.name + " is a " + student2.getClassification());
        // Michael Chen is a Senior

        // Add credit hours
        student1.addCreditHours(15); // Added 15 credit hours. Total: 100
        student2.addCreditHours(10); // Added 10 credit hours. Total: 125

        // Update GPA
        student1.updateGPA(3.85); // GPA updated from 3.75 to 3.85

        // Check graduation eligibility
        System.out.println("\n=== Graduation Eligibility ===");
        System.out.println(student1.name + " eligible for graduation: " +
                          student1.isEligibleForGraduation()); // false (only 100 hours)
        System.out.println(student2.name + " eligible for graduation: " +
                          student2.isEligibleForGraduation()); // true

        // Final classifications after adding hours
        System.out.println("\n=== Updated Classifications ===");
        System.out.println(student1.name + " is now a " + student1.getClassification());
        // Emma Johnson is now a Junior
        System.out.println(student2.name + " is now a " + student2.getClassification());
        // Michael Chen is now a Senior
    }
}
```

### Bank Account Example

```java
public class BankAccount {
    // Fields
    String accountNumber;
    String accountHolderName;
    double balance;
    String accountType;
    boolean isActive;

    // Methods
    public void displayAccountInfo() {
        System.out.println("=== Account Information ===");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + String.format("%.2f", balance));
        System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
    }

    public void deposit(double amount) {
        if (amount > 0 && isActive) {
            balance += amount;
            System.out.println("Deposited $" + String.format("%.2f", amount) +
                              ". New balance: $" + String.format("%.2f", balance));
        } else if (!isActive) {
            System.out.println("Cannot deposit to inactive account");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (!isActive) {
            System.out.println("Cannot withdraw from inactive account");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Available balance: $" +
                              String.format("%.2f", balance));
        } else {
            balance -= amount;
            System.out.println("Withdrew $" + String.format("%.2f", amount) +
                              ". New balance: $" + String.format("%.2f", balance));
        }
    }

    public void transfer(BankAccount targetAccount, double amount) {
        if (amount <= balance && isActive && targetAccount.isActive) {
            this.withdraw(amount);
            targetAccount.deposit(amount);
            System.out.println("Transferred $" + String.format("%.2f", amount) +
                              " to " + targetAccount.accountHolderName);
        } else {
            System.out.println("Transfer failed - check account status and balance");
        }
    }

    public void closeAccount() {
        isActive = false;
        System.out.println("Account " + accountNumber + " has been closed");
    }
}
```

### Using Bank Account Objects

```java
public class BankAccountDemo {
    public static void main(String[] args) {
        // Create bank account objects
        BankAccount aliceAccount = new BankAccount();
        BankAccount bobAccount = new BankAccount();

        // Initialize Alice's account
        aliceAccount.accountNumber = "ACC-001";
        aliceAccount.accountHolderName = "Alice Johnson";
        aliceAccount.balance = 1500.00;
        aliceAccount.accountType = "Checking";
        aliceAccount.isActive = true;

        // Initialize Bob's account
        bobAccount.accountNumber = "ACC-002";
        bobAccount.accountHolderName = "Bob Smith";
        bobAccount.balance = 2000.00;
        bobAccount.accountType = "Savings";
        bobAccount.isActive = true;

        // Display initial account information
        aliceAccount.displayAccountInfo();
        System.out.println();
        bobAccount.displayAccountInfo();

        System.out.println("\n=== Banking Operations ===");

        // Perform banking operations
        aliceAccount.deposit(250.00);
        // Deposited $250.00. New balance: $1750.00

        bobAccount.withdraw(300.00);
        // Withdrew $300.00. New balance: $1700.00

        // Transfer money
        aliceAccount.transfer(bobAccount, 200.00);
        // Withdrew $200.00. New balance: $1550.00
        // Deposited $200.00. New balance: $1900.00
        // Transferred $200.00 to Bob Smith

        // Try invalid operations
        aliceAccount.withdraw(2000.00);
        // Insufficient funds. Available balance: $1550.00

        bobAccount.deposit(-50.00);
        // Invalid deposit amount

        System.out.println("\n=== Final Account Status ===");
        aliceAccount.displayAccountInfo();
        System.out.println();
        bobAccount.displayAccountInfo();
    }
}
```

# Setters

## Introduction to Setter Methods

Setter methods (also called mutator methods) are used to modify the values of private fields in a class. They provide controlled access to change object properties while maintaining encapsulation principles.

### Why Use Setter Methods?

```java
public class WhySettersDemo {
    public static void main(String[] args) {
        System.out.println("=== Why Setter Methods Are Important ===");

        // Problem with public fields
        PersonWithPublicFields person1 = new PersonWithPublicFields();
        person1.age = -25;  // Invalid age, but no validation!
        person1.email = "invalid-email";  // Invalid format

        System.out.println("Person with public fields:");
        System.out.println("Age: " + person1.age);  // -25 (invalid!)
        System.out.println("Email: " + person1.email);  // invalid-email

        // Solution with setter methods
        PersonWithSetters person2 = new PersonWithSetters();
        person2.setAge(-25);  // Will be validated and handled properly
        person2.setEmail("invalid-email");  // Will be validated

        System.out.println("\nPerson with setter methods:");
        System.out.println("Age: " + person2.getAge());  // Valid age or default
        System.out.println("Email: " + person2.getEmail());  // Valid email or default
    }
}

// Bad example - public fields
class PersonWithPublicFields {
    public String name;
    public int age;
    public String email;
}

// Good example - private fields with setters
class PersonWithSetters {
    private String name;
    private int age;
    private String email;

    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }

    // Setter methods with validation
    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("Invalid age: " + age + ". Age not updated.");
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Invalid email format: " + email + ". Email not updated.");
        }
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim();
        } else {
            System.out.println("Invalid name. Name not updated.");
        }
    }
}
```

### Basic Setter Method Structure

```java
public class Employee {
    // Private fields (encapsulation)
    private String employeeId;
    private String name;
    private String department;
    private double salary;
    private boolean isActive;

    // Basic setter methods
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // Getter methods for accessing private fields
    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public boolean isActive() { return isActive; }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + String.format("%.2f", salary));
        System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
    }
}
```

### Setter Methods with Validation

```java
public class Product {
    private String productId;
    private String name;
    private double price;
    private int quantity;
    private String category;
    private boolean available;

    // Setter with ID format validation
    public void setProductId(String productId) {
        if (productId != null && productId.matches("^PROD-\\d{4}$")) {
            this.productId = productId;
        } else {
            System.out.println("Invalid product ID format. Must be PROD-XXXX (e.g., PROD-1234)");
        }
    }

    // Setter with name validation
    public void setName(String name) {
        if (name != null && name.trim().length() >= 2) {
            this.name = name.trim();
        } else {
            System.out.println("Product name must be at least 2 characters long");
        }
    }

    // Setter with price validation
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative. Current price unchanged.");
        }
    }

    // Setter with quantity validation
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
            // Automatically update availability based on quantity
            this.available = quantity > 0;
        } else {
            System.out.println("Quantity cannot be negative");
        }
    }

    // Setter with category validation
    public void setCategory(String category) {
        String[] validCategories = {"Electronics", "Clothing", "Books", "Home", "Sports"};
        boolean isValidCategory = false;

        if (category != null) {
            for (String validCat : validCategories) {
                if (validCat.equalsIgnoreCase(category)) {
                    this.category = validCat;
                    isValidCategory = true;
                    break;
                }
            }
        }

        if (!isValidCategory) {
            System.out.println("Invalid category. Valid categories: Electronics, Clothing, Books, Home, Sports");
        }
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Getter methods
    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public String getCategory() { return category; }
    public boolean isAvailable() { return available; }

    // Utility methods
    public void displayProductInfo() {
        System.out.println("=== Product Information ===");
        System.out.println("ID: " + (productId != null ? productId : "Not set"));
        System.out.println("Name: " + (name != null ? name : "Not set"));
        System.out.println("Price: $" + String.format("%.2f", price));
        System.out.println("Quantity: " + quantity);
        System.out.println("Category: " + (category != null ? category : "Not set"));
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
}
```

### Advanced Setter Examples

```java
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private double minimumBalance;
    private boolean frozen;

    // Constructor to set initial values
    public BankAccount() {
        this.balance = 0.0;
        this.minimumBalance = 100.0; // Default minimum balance
        this.frozen = false;
    }

    // Setter with account number format validation
    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && accountNumber.matches("^\\d{10}$")) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Account number must be exactly 10 digits");
        }
    }

    // Setter with name validation
    public void setAccountHolderName(String name) {
        if (name != null && name.trim().length() >= 2 && name.matches("^[a-zA-Z\\s]+$")) {
            this.accountHolderName = name.trim();
        } else {
            System.out.println("Account holder name must contain only letters and spaces, minimum 2 characters");
        }
    }

    // Setter with balance validation and minimum balance check
    public void setBalance(double balance) {
        if (frozen) {
            System.out.println("Cannot modify balance - account is frozen");
            return;
        }

        if (balance >= 0) {
            if (balance < minimumBalance) {
                System.out.println("Warning: Balance $" + String.format("%.2f", balance) +
                                 " is below minimum balance of $" + String.format("%.2f", minimumBalance));
            }
            this.balance = balance;
            System.out.println("Balance updated to $" + String.format("%.2f", balance));
        } else {
            System.out.println("Balance cannot be negative");
        }
    }

    // Setter with account type validation
    public void setAccountType(String accountType) {
        if (accountType != null) {
            String upperType = accountType.toUpperCase();
            if (upperType.equals("CHECKING") || upperType.equals("SAVINGS") || upperType.equals("BUSINESS")) {
                this.accountType = upperType;

                // Set minimum balance based on account type
                switch (upperType) {
                    case "CHECKING":
                        this.minimumBalance = 100.0;
                        break;
                    case "SAVINGS":
                        this.minimumBalance = 500.0;
                        break;
                    case "BUSINESS":
                        this.minimumBalance = 1000.0;
                        break;
                }
                System.out.println("Account type set to " + upperType +
                                 ". Minimum balance: $" + String.format("%.2f", minimumBalance));
            } else {
                System.out.println("Invalid account type. Valid types: CHECKING, SAVINGS, BUSINESS");
            }
        }
    }

    // Setter for minimum balance with validation
    public void setMinimumBalance(double minimumBalance) {
        if (minimumBalance >= 0) {
            this.minimumBalance = minimumBalance;
            if (balance < minimumBalance) {
                System.out.println("Warning: Current balance is below new minimum balance");
            }
        } else {
            System.out.println("Minimum balance cannot be negative");
        }
    }

    // Setter for frozen status
    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
        System.out.println("Account " + (frozen ? "frozen" : "unfrozen"));
    }

    // Getter methods
    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public double getBalance() { return balance; }
    public String getAccountType() { return accountType; }
    public double getMinimumBalance() { return minimumBalance; }
    public boolean isFrozen() { return frozen; }

    // Utility method
    public void displayAccountInfo() {
        System.out.println("=== Account Information ===");
        System.out.println("Account Number: " + (accountNumber != null ? accountNumber : "Not set"));
        System.out.println("Account Holder: " + (accountHolderName != null ? accountHolderName : "Not set"));
        System.out.println("Account Type: " + (accountType != null ? accountType : "Not set"));
        System.out.println("Balance: $" + String.format("%.2f", balance));
        System.out.println("Minimum Balance: $" + String.format("%.2f", minimumBalance));
        System.out.println("Status: " + (frozen ? "Frozen" : "Active"));
    }
}
```

### Using Setter Methods - Complete Example

```java
public class SetterMethodsDemo {
    public static void main(String[] args) {
        // Demonstrate product setters with validation
        System.out.println("=== Product Setter Validation Demo ===");
        Product laptop = new Product();

        // Valid inputs
        laptop.setProductId("PROD-1234");  // Valid format
        laptop.setName("Gaming Laptop");   // Valid name
        laptop.setPrice(1299.99);         // Valid price
        laptop.setQuantity(15);           // Valid quantity
        laptop.setCategory("Electronics"); // Valid category

        laptop.displayProductInfo();

        System.out.println("\n=== Testing Invalid Inputs ===");

        // Invalid inputs - these will show error messages
        laptop.setProductId("INVALID-ID");  // Invalid product ID format. Must be PROD-XXXX (e.g., PROD-1234)
        laptop.setName("");                // Product name must be at least 2 characters long
        laptop.setPrice(-50.0);            // Price cannot be negative. Current price unchanged.
        laptop.setQuantity(-5);            // Quantity cannot be negative
        laptop.setCategory("InvalidCategory"); // Invalid category. Valid categories: Electronics, Clothing, Books, Home, Sports

        System.out.println("\n=== Bank Account Setter Demo ===");
        BankAccount account = new BankAccount();

        // Valid account setup
        account.setAccountNumber("1234567890");  // Valid 10-digit number
        account.setAccountHolderName("John Doe"); // Valid name
        account.setAccountType("SAVINGS");       // Account type set to SAVINGS. Minimum balance: $500.00
        account.setBalance(750.00);              // Balance updated to $750.00

        account.displayAccountInfo();

        System.out.println("\n=== Testing Account Validation ===");

        // Test various validations
        account.setBalance(300.00);  // Warning: Balance $300.00 is below minimum balance of $500.00
        account.setFrozen(true);     // Account frozen
        account.setBalance(800.00);  // Cannot modify balance - account is frozen
        account.setFrozen(false);    // Account unfrozen
        account.setBalance(800.00);  // Balance updated to $800.00

        // Test invalid inputs
        account.setAccountNumber("123");  // Account number must be exactly 10 digits
        account.setAccountHolderName("John123");  // Account holder name must contain only letters and spaces, minimum 2 characters
        account.setAccountType("INVALID"); // Invalid account type. Valid types: CHECKING, SAVINGS, BUSINESS
    }
}
```

# Getters

## Introduction to Getter Methods

Getter methods (also called accessor methods) are used to retrieve the values of private fields in a class. They provide controlled access to read object properties while maintaining encapsulation principles.

### Why Use Getter Methods?

```java
public class GetterMethodsIntro {
    public static void main(String[] args) {
        System.out.println("=== Why Getter Methods Are Important ===");

        // With getter methods, we can:
        // 1. Control access to private fields
        // 2. Add validation or formatting
        // 3. Calculate derived values
        // 4. Log access attempts
        // 5. Maintain encapsulation

        Employee emp = new Employee();
        emp.setName("Alice Johnson");
        emp.setSalary(75000);
        emp.setDepartment("Engineering");
        emp.setYearsOfService(5);

        // Using getter methods
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Salary: " + emp.getFormattedSalary());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Employee Level: " + emp.getEmployeeLevel());
    }
}
```

### Basic Getter Method Structure

```java
public class Student {
    // Private fields
    private int studentId;
    private String name;
    private String major;
    private double gpa;
    private int creditHours;
    private boolean isEnrolled;

    // Basic getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public boolean isEnrolled() {  // Note: boolean getters often use "is" prefix
        return isEnrolled;
    }

    // Setter methods (for completeness)
    public void setStudentId(int studentId) { this.studentId = studentId; }
    public void setName(String name) { this.name = name; }
    public void setMajor(String major) { this.major = major; }
    public void setGpa(double gpa) { this.gpa = gpa; }
    public void setCreditHours(int creditHours) { this.creditHours = creditHours; }
    public void setEnrolled(boolean enrolled) { this.isEnrolled = enrolled; }
}
```

### Advanced Getter Methods with Calculations

```java
public class Employee {
    private String name;
    private double salary;
    private String department;
    private int yearsOfService;
    private boolean isFullTime;
    private double hoursPerWeek;

    // Basic getters
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public String getDepartment() { return department; }
    public int getYearsOfService() { return yearsOfService; }
    public boolean isFullTime() { return isFullTime; }
    public double getHoursPerWeek() { return hoursPerWeek; }

    // Calculated getters
    public double getAnnualSalary() {
        return salary * 12;  // Assuming salary is monthly
    }

    public double getHourlyRate() {
        if (hoursPerWeek > 0) {
            return (salary * 12) / (hoursPerWeek * 52);  // Annual salary / annual hours
        }
        return 0;
    }

    public String getEmployeeLevel() {
        if (yearsOfService >= 10) {
            return "Senior";
        } else if (yearsOfService >= 5) {
            return "Mid-level";
        } else {
            return "Junior";
        }
    }

    public String getFormattedSalary() {
        return "$" + String.format("%,.2f", salary);
    }

    public String getEmploymentStatus() {
        return isFullTime ? "Full-time" : "Part-time";
    }

    public boolean isEligibleForBonus() {
        return yearsOfService >= 1 && isFullTime;
    }

    public double getVacationDays() {
        if (yearsOfService >= 5) {
            return 20;
        } else if (yearsOfService >= 2) {
            return 15;
        } else {
            return 10;
        }
    }

    // Setter methods
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setDepartment(String department) { this.department = department; }
    public void setYearsOfService(int yearsOfService) { this.yearsOfService = yearsOfService; }
    public void setFullTime(boolean fullTime) { this.isFullTime = fullTime; }
    public void setHoursPerWeek(double hoursPerWeek) { this.hoursPerWeek = hoursPerWeek; }
}
```

### Getter Methods with Validation and Formatting

```java
public class Product {
    private String productId;
    private String name;
    private double price;
    private int quantity;
    private String category;
    private java.time.LocalDate manufactureDate;
    private double weight;  // in kg

    // Basic getters with null checks
    public String getProductId() {
        return productId != null ? productId : "Unknown";
    }

    public String getName() {
        return name != null ? name : "Unnamed Product";
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category != null ? category : "Uncategorized";
    }

    public java.time.LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public double getWeight() {
        return weight;
    }

    // Formatted getters
    public String getFormattedPrice() {
        return "$" + String.format("%.2f", price);
    }

    public String getFormattedWeight() {
        if (weight < 1) {
            return String.format("%.0f g", weight * 1000);  // Convert to grams
        } else {
            return String.format("%.2f kg", weight);
        }
    }

    public String getAvailabilityStatus() {
        if (quantity > 50) {
            return "In Stock";
        } else if (quantity > 0) {
            return "Low Stock";
        } else {
            return "Out of Stock";
        }
    }

    public String getProductAge() {
        if (manufactureDate != null) {
            long days = java.time.temporal.ChronoUnit.DAYS.between(manufactureDate, java.time.LocalDate.now());
            if (days < 30) {
                return "New (" + days + " days old)";
            } else if (days < 365) {
                return "Recent (" + (days / 30) + " months old)";
            } else {
                return "Mature (" + (days / 365) + " years old)";
            }
        }
        return "Unknown age";
    }

    // Calculated getters
    public double getTotalValue() {
        return price * quantity;
    }

    public boolean isExpensive() {
        return price > 100;
    }

    public boolean isHeavy() {
        return weight > 5.0;  // More than 5 kg
    }

    public String getProductSummary() {
        return String.format("%s (%s) - %s - %s - Qty: %d",
                           getName(),
                           getProductId(),
                           getFormattedPrice(),
                           getAvailabilityStatus(),
                           quantity);
    }

    // Setter methods
    public void setProductId(String productId) { this.productId = productId; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setCategory(String category) { this.category = category; }
    public void setManufactureDate(java.time.LocalDate manufactureDate) { this.manufactureDate = manufactureDate; }
    public void setWeight(double weight) { this.weight = weight; }
}
```

### Getters with Security and Access Control

```java
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String pin;
    private java.time.LocalDateTime lastAccessed;
    private boolean isLocked;
    private int failedLoginAttempts;

    // Public getters (safe to expose)
    public String getAccountHolderName() {
        updateLastAccessed();
        return accountHolderName;
    }

    public String getMaskedAccountNumber() {
        updateLastAccessed();
        if (accountNumber != null && accountNumber.length() >= 4) {
            return "****-****-" + accountNumber.substring(accountNumber.length() - 4);
        }
        return "****-****";
    }

    public String getAccountStatus() {
        return isLocked ? "Locked" : "Active";
    }

    // Secured getters (require authentication)
    public double getBalance(String enteredPin) {
        if (authenticatePin(enteredPin)) {
            updateLastAccessed();
            return balance;
        } else {
            System.out.println("Access denied - incorrect PIN");
            return -1;  // Indicates error
        }
    }

    public String getFullAccountNumber(String enteredPin) {
        if (authenticatePin(enteredPin)) {
            updateLastAccessed();
            return accountNumber;
        } else {
            System.out.println("Access denied - incorrect PIN");
            return null;
        }
    }

    // Formatted getters
    public String getFormattedBalance(String enteredPin) {
        double bal = getBalance(enteredPin);
        return bal >= 0 ? "$" + String.format("%,.2f", bal) : "Access Denied";
    }

    public String getLastAccessedTime() {
        if (lastAccessed != null) {
            return lastAccessed.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        }
        return "Never accessed";
    }

    // Status getters
    public boolean isAccountLocked() {
        return isLocked;
    }

    public int getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    public boolean isHighRiskAccount() {
        return failedLoginAttempts >= 3 || isLocked;
    }

    // Helper methods
    private boolean authenticatePin(String enteredPin) {
        if (isLocked) {
            System.out.println("Account is locked");
            return false;
        }

        if (pin != null && pin.equals(enteredPin)) {
            failedLoginAttempts = 0;  // Reset on successful login
            return true;
        } else {
            failedLoginAttempts++;
            if (failedLoginAttempts >= 3) {
                isLocked = true;
                System.out.println("Account locked due to multiple failed attempts");
            }
            return false;
        }
    }

    private void updateLastAccessed() {
        lastAccessed = java.time.LocalDateTime.now();
    }

    // Setter methods (with appropriate validation)
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public void setAccountHolderName(String accountHolderName) { this.accountHolderName = accountHolderName; }
    public void setBalance(double balance) { this.balance = balance; }
    public void setPin(String pin) { this.pin = pin; }
    public void unlockAccount(String adminCode) {
        if ("ADMIN123".equals(adminCode)) {
            isLocked = false;
            failedLoginAttempts = 0;
            System.out.println("Account unlocked by administrator");
        }
    }
}
```

### Complete Getter Methods Demo

```java
public class GetterMethodsDemo {
    public static void main(String[] args) {
        // Employee getter methods demo
        System.out.println("=== Employee Getter Methods Demo ===");
        Employee emp = new Employee();
        emp.setName("Sarah Wilson");
        emp.setSalary(6500);  // Monthly salary
        emp.setDepartment("Software Engineering");
        emp.setYearsOfService(7);
        emp.setFullTime(true);
        emp.setHoursPerWeek(40);

        // Basic getters
        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Years of Service: " + emp.getYearsOfService());

        // Calculated getters
        System.out.println("Monthly Salary: " + emp.getFormattedSalary());
        System.out.println("Annual Salary: $" + String.format("%,.2f", emp.getAnnualSalary()));
        System.out.println("Hourly Rate: $" + String.format("%.2f", emp.getHourlyRate()));
        System.out.println("Employee Level: " + emp.getEmployeeLevel());
        System.out.println("Employment Status: " + emp.getEmploymentStatus());
        System.out.println("Eligible for Bonus: " + emp.isEligibleForBonus());
        System.out.println("Vacation Days: " + emp.getVacationDays());

        // Product getter methods demo
        System.out.println("\n=== Product Getter Methods Demo ===");
        Product laptop = new Product();
        laptop.setProductId("PROD-5678");
        laptop.setName("Ultra Gaming Laptop");
        laptop.setPrice(1599.99);
        laptop.setQuantity(25);
        laptop.setCategory("Electronics");
        laptop.setWeight(2.3);
        laptop.setManufactureDate(java.time.LocalDate.of(2024, 3, 15));

        // Basic and formatted getters
        System.out.println("Product ID: " + laptop.getProductId());
        System.out.println("Name: " + laptop.getName());
        System.out.println("Price: " + laptop.getFormattedPrice());
        System.out.println("Weight: " + laptop.getFormattedWeight());
        System.out.println("Availability: " + laptop.getAvailabilityStatus());
        System.out.println("Age: " + laptop.getProductAge());
        System.out.println("Total Value: $" + String.format("%,.2f", laptop.getTotalValue()));
        System.out.println("Is Expensive: " + laptop.isExpensive());
        System.out.println("Summary: " + laptop.getProductSummary());

        // Bank account getter methods demo
        System.out.println("\n=== Bank Account Getter Methods Demo ===");
        BankAccount account = new BankAccount();
        account.setAccountNumber("1234567890");
        account.setAccountHolderName("Michael Chen");
        account.setBalance(5420.75);
        account.setPin("1234");

        // Public getters
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Masked Account: " + account.getMaskedAccountNumber());
        System.out.println("Account Status: " + account.getAccountStatus());
        System.out.println("Last Accessed: " + account.getLastAccessedTime());

        // Secured getters with correct PIN
        System.out.println("\n--- With Correct PIN ---");
        System.out.println("Balance: " + account.getFormattedBalance("1234"));
        System.out.println("Full Account Number: " + account.getFullAccountNumber("1234"));

        // Secured getters with incorrect PIN
        System.out.println("\n--- With Incorrect PIN ---");
        account.getBalance("wrong");  // Access denied - incorrect PIN
        account.getBalance("wrong");  // Access denied - incorrect PIN
        account.getBalance("wrong");  // Account locked due to multiple failed attempts

        System.out.println("Account Status: " + account.getAccountStatus());
        System.out.println("Failed Attempts: " + account.getFailedLoginAttempts());
        System.out.println("High Risk Account: " + account.isHighRiskAccount());

        // Unlock account
        account.unlockAccount("ADMIN123");
        System.out.println("Account Status after unlock: " + account.getAccountStatus());
    }
}
```

# Constructors

## Introduction to Constructors

A constructor is a special method that is called when an object is created. It initializes the object's state by setting initial values for the object's fields. Constructors have the same name as the class and have no return type.

### Why Constructors Are Important

```java
public class ConstructorImportanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Why Constructors Are Important ===");

        // Without constructors, objects start with default values
        PersonWithoutConstructor person1 = new PersonWithoutConstructor();
        System.out.println("Person without constructor:");
        person1.displayInfo();  // Will show null/0 values

        // With constructors, objects start with meaningful values
        PersonWithConstructor person2 = new PersonWithConstructor("Alice", 25, "alice@example.com");
        System.out.println("\nPerson with constructor:");
        person2.displayInfo();  // Will show initialized values

        // Constructors ensure objects are created in a valid state
        BankAccount account = new BankAccount("1234567890", "John Doe", 1000.0);
        account.displayInfo();  // Account is ready to use immediately
    }
}

// Example without constructor
class PersonWithoutConstructor {
    String name;
    int age;
    String email;

    void displayInfo() {
        System.out.println("Name: " + name);      // null
        System.out.println("Age: " + age);        // 0
        System.out.println("Email: " + email);    // null
    }
}

// Example with constructor
class PersonWithConstructor {
    String name;
    int age;
    String email;

    // Constructor
    public PersonWithConstructor(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}
```

### Basic Constructor Syntax

```java
public class Student {
    // Fields
    private String studentId;
    private String name;
    private String major;
    private double gpa;

    // Constructor
    public Student(String studentId, String name, String major, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.gpa = gpa;

        // Constructor can also perform validation
        if (gpa < 0.0 || gpa > 4.0) {
            System.out.println("Warning: Invalid GPA provided. Setting to 0.0");
            this.gpa = 0.0;
        }
    }

    // Getter methods
    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getMajor() { return major; }
    public double getGpa() { return gpa; }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + String.format("%.2f", gpa));
    }
}

// Using the constructor
class StudentDemo {
    public static void main(String[] args) {
        // Creating students using constructor
        Student student1 = new Student("S001", "Emma Watson", "Computer Science", 3.85);
        Student student2 = new Student("S002", "James Bond", "Engineering", 3.42);
        Student student3 = new Student("S003", "Invalid GPA Student", "Math", 5.0); // Invalid GPA

        student1.displayStudentInfo();
        // Student ID: S001
        // Name: Emma Watson
        // Major: Computer Science
        // GPA: 3.85

        System.out.println();
        student2.displayStudentInfo();

        System.out.println();
        student3.displayStudentInfo();  // GPA will be 0.0 due to validation
    }
}
```

### Constructor with Validation and Initialization

```java
public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double salary;
    private java.time.LocalDate hireDate;
    private boolean isActive;

    // Constructor with comprehensive initialization
    public Employee(String employeeId, String name, String department, double salary) {
        // Validate and set employee ID
        if (employeeId != null && employeeId.matches("^EMP\\d{4}$")) {
            this.employeeId = employeeId;
        } else {
            System.out.println("Invalid employee ID format. Using default.");
            this.employeeId = "EMP0000";
        }

        // Validate and set name
        if (name != null && name.trim().length() >= 2) {
            this.name = name.trim();
        } else {
            System.out.println("Invalid name. Using 'Unknown Employee'.");
            this.name = "Unknown Employee";
        }

        // Validate and set department
        String[] validDepartments = {"Engineering", "Sales", "Marketing", "HR", "Finance"};
        boolean validDept = false;
        if (department != null) {
            for (String dept : validDepartments) {
                if (dept.equalsIgnoreCase(department)) {
                    this.department = dept;
                    validDept = true;
                    break;
                }
            }
        }
        if (!validDept) {
            System.out.println("Invalid department. Using 'General'.");
            this.department = "General";
        }

        // Validate and set salary
        if (salary >= 30000 && salary <= 500000) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary range. Using minimum salary.");
            this.salary = 30000;
        }

        // Set default values
        this.hireDate = java.time.LocalDate.now();
        this.isActive = true;

        System.out.println("Employee created successfully: " + this.name + " (" + this.employeeId + ")");
    }

    // Getter methods
    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public java.time.LocalDate getHireDate() { return hireDate; }
    public boolean isActive() { return isActive; }

    public void displayEmployeeInfo() {
        System.out.println("=== Employee Information ===");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + String.format("%,.2f", salary));
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
    }
}
```

### Complex Constructor Example - BankAccount

```java
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private double interestRate;
    private java.time.LocalDateTime creationDate;
    private boolean isActive;
    private int transactionCount;

    // Constructor with full initialization and validation
    public BankAccount(String accountNumber, String accountHolderName,
                      String accountType, double initialDeposit) {

        // Initialize creation date first
        this.creationDate = java.time.LocalDateTime.now();
        this.transactionCount = 0;

        // Validate account number
        if (accountNumber != null && accountNumber.matches("^\\d{10}$")) {
            this.accountNumber = accountNumber;
        } else {
            // Generate a default account number
            this.accountNumber = generateAccountNumber();
            System.out.println("Invalid account number provided. Generated: " + this.accountNumber);
        }

        // Validate account holder name
        if (accountHolderName != null &&
            accountHolderName.trim().length() >= 2 &&
            accountHolderName.matches("^[a-zA-Z\\s]+$")) {
            this.accountHolderName = accountHolderName.trim();
        } else {
            throw new IllegalArgumentException("Invalid account holder name. Must contain only letters and spaces.");
        }

        // Validate and set account type with interest rates
        if (accountType != null) {
            switch (accountType.toUpperCase()) {
                case "CHECKING":
                    this.accountType = "CHECKING";
                    this.interestRate = 0.01;  // 1%
                    break;
                case "SAVINGS":
                    this.accountType = "SAVINGS";
                    this.interestRate = 0.025; // 2.5%
                    break;
                case "BUSINESS":
                    this.accountType = "BUSINESS";
                    this.interestRate = 0.015; // 1.5%
                    break;
                default:
                    System.out.println("Invalid account type. Defaulting to CHECKING.");
                    this.accountType = "CHECKING";
                    this.interestRate = 0.01;
            }
        } else {
            this.accountType = "CHECKING";
            this.interestRate = 0.01;
        }

        // Validate initial deposit based on account type
        double minimumDeposit = getMinimumDepositForType(this.accountType);
        if (initialDeposit >= minimumDeposit) {
            this.balance = initialDeposit;
            this.isActive = true;
            this.transactionCount = 1; // Initial deposit counts as transaction
            System.out.println("Account created with initial deposit of $" +
                             String.format("%.2f", initialDeposit));
        } else {
            System.out.println("Insufficient initial deposit for " + this.accountType +
                             " account. Minimum required: $" + minimumDeposit);
            this.balance = 0;
            this.isActive = false;
        }

        // Log account creation
        System.out.println("Bank account initialized for " + this.accountHolderName +
                          " (" + this.accountNumber + ")");
    }

    // Helper method for minimum deposit requirements
    private double getMinimumDepositForType(String accountType) {
        switch (accountType) {
            case "CHECKING": return 100.0;
            case "SAVINGS": return 500.0;
            case "BUSINESS": return 1000.0;
            default: return 100.0;
        }
    }

    // Helper method to generate account number
    private String generateAccountNumber() {
        long timestamp = System.currentTimeMillis();
        return String.valueOf(timestamp).substring(3, 13); // Get 10 digits
    }

    // Getter methods
    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public double getBalance() { return balance; }
    public String getAccountType() { return accountType; }
    public double getInterestRate() { return interestRate; }
    public java.time.LocalDateTime getCreationDate() { return creationDate; }
    public boolean isActive() { return isActive; }
    public int getTransactionCount() { return transactionCount; }

    public void displayAccountInfo() {
        System.out.println("=== Bank Account Information ===");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + String.format("%.2f", balance));
        System.out.println("Interest Rate: " + String.format("%.2f%%", interestRate * 100));
        System.out.println("Created: " + creationDate.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
        System.out.println("Transactions: " + transactionCount);
    }
}
```

### Constructor Demo and Usage

```java
public class ConstructorDemo {
    public static void main(String[] args) {
        System.out.println("=== Constructor Validation Demo ===");

        // Employee constructor examples
        System.out.println("--- Employee Creation ---");

        // Valid employee
        Employee emp1 = new Employee("EMP1234", "John Smith", "Engineering", 75000);
        emp1.displayEmployeeInfo();

        System.out.println();

        // Employee with validation issues
        Employee emp2 = new Employee("INVALID", "", "InvalidDept", -5000);
        // Invalid employee ID format. Using default.
        // Invalid name. Using 'Unknown Employee'.
        // Invalid department. Using 'General'.
        // Invalid salary range. Using minimum salary.
        // Employee created successfully: Unknown Employee (EMP0000)

        System.out.println("\n=== Bank Account Constructor Demo ===");

        // Valid bank accounts
        System.out.println("--- Valid Accounts ---");

        BankAccount account1 = new BankAccount("1234567890", "Alice Johnson", "SAVINGS", 750.0);
        account1.displayAccountInfo();

        System.out.println();

        BankAccount account2 = new BankAccount("9876543210", "Bob Wilson", "BUSINESS", 1500.0);
        account2.displayAccountInfo();

        System.out.println("\n--- Account Creation Issues ---");

        // Account with insufficient initial deposit
        BankAccount account3 = new BankAccount("1111111111", "Charlie Brown", "SAVINGS", 100.0);
        // Insufficient initial deposit for SAVINGS account. Minimum required: $500.0

        // Account with invalid account number (will generate new one)
        BankAccount account4 = new BankAccount("123", "David Lee", "CHECKING", 200.0);
        // Invalid account number provided. Generated: [timestamp-based number]

        // Account with invalid account type
        BankAccount account5 = new BankAccount("5555555555", "Eva Martinez", "PREMIUM", 300.0);
        // Invalid account type. Defaulting to CHECKING.

        try {
            // Account with invalid name (will throw exception)
            BankAccount account6 = new BankAccount("6666666666", "123Invalid", "CHECKING", 150.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
            // Exception caught: Invalid account holder name. Must contain only letters and spaces.
        }

        System.out.println("\n=== Student Constructor Demo ===");

        Student student1 = new Student("STU001", "Sarah Davis", "Computer Science", 3.7);
        student1.displayStudentInfo();

        System.out.println();

        Student student2 = new Student("STU002", "Mike Johnson", "Mathematics", 4.5); // Invalid GPA
        // Warning: Invalid GPA provided. Setting to 0.0
        student2.displayStudentInfo();
    }
}
```

# Default Constructors

## Understanding Default Constructors

A default constructor is a constructor that takes no parameters. If you don't provide any constructor in your class, Java automatically provides a default constructor that initializes fields to their default values.

### Automatic Default Constructor

```java
// When you don't define any constructor, Java provides one automatically
public class AutoDefaultConstructorExample {
    String name;        // null
    int age;           // 0
    boolean isActive;  // false
    double salary;     // 0.0

    // Java automatically provides:
    // public AutoDefaultConstructorExample() { }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Active: " + isActive);
        System.out.println("Salary: " + salary);
    }
}

// Demo of automatic default constructor
class AutoDefaultDemo {
    public static void main(String[] args) {
        System.out.println("=== Automatic Default Constructor ===");

        AutoDefaultConstructorExample obj = new AutoDefaultConstructorExample();
        obj.displayInfo();
        // Name: null
        // Age: 0
        // Active: false
        // Salary: 0.0
    }
}
```

### Explicit Default Constructor

```java
public class Person {
    private String name;
    private int age;
    private String email;
    private boolean isEmployed;

    // Explicit default constructor with meaningful defaults
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.email = "no-email@example.com";
        this.isEmployed = false;

        System.out.println("Person created with default values");
    }

    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public boolean isEmployed() { return isEmployed; }

    // Setter methods
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setEmail(String email) { this.email = email; }
    public void setEmployed(boolean employed) { this.isEmployed = employed; }

    public void displayInfo() {
        System.out.println("=== Person Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Employed: " + isEmployed);
    }
}
```

### Default Constructor with Initialization Logic

```java
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private java.time.LocalDateTime creationDate;
    private boolean isActive;
    private String status;

    // Default constructor with initialization logic
    public BankAccount() {
        // Generate default account number
        this.accountNumber = generateDefaultAccountNumber();

        // Set default values
        this.accountHolderName = "New Account Holder";
        this.balance = 0.0;
        this.accountType = "CHECKING";
        this.creationDate = java.time.LocalDateTime.now();
        this.isActive = true;
        this.status = "PENDING_SETUP";

        // Log creation
        System.out.println("New bank account created with default settings");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Please complete account setup by providing holder information");
    }

    // Helper method to generate account number
    private String generateDefaultAccountNumber() {
        // Generate a simple account number based on timestamp
        long timestamp = System.currentTimeMillis();
        return "ACC" + String.valueOf(timestamp).substring(7);
    }

    // Method to complete account setup
    public void completeSetup(String holderName, String accountType, double initialDeposit) {
        if (holderName != null && !holderName.trim().isEmpty()) {
            this.accountHolderName = holderName.trim();
        }

        if (accountType != null &&
            (accountType.equals("CHECKING") || accountType.equals("SAVINGS") || accountType.equals("BUSINESS"))) {
            this.accountType = accountType;
        }

        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
        }

        this.status = "ACTIVE";
        System.out.println("Account setup completed for " + this.accountHolderName);
    }

    // Getter methods
    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public double getBalance() { return balance; }
    public String getAccountType() { return accountType; }
    public String getStatus() { return status; }

    public void displayAccountInfo() {
        System.out.println("=== Bank Account Information ===");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + String.format("%.2f", balance));
        System.out.println("Created: " + creationDate.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        System.out.println("Status: " + status);
    }
}
```

### Default Constructor with Configuration

```java
public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double salary;
    private java.time.LocalDate hireDate;
    private boolean isActive;
    private String jobTitle;
    private int vacationDays;

    // Default constructor with company defaults
    public Employee() {
        // Generate temporary employee ID
        this.employeeId = generateTempEmployeeId();

        // Set default values according to company policy
        this.name = "New Employee";
        this.department = "UNASSIGNED";
        this.salary = 40000.0;  // Starting salary
        this.hireDate = java.time.LocalDate.now();
        this.isActive = true;
        this.jobTitle = "Entry Level";
        this.vacationDays = 10;  // Default vacation days for new employees

        System.out.println("New employee record created with default settings");
        System.out.println("Temporary Employee ID: " + employeeId);
        System.out.println("Please update employee information using setter methods");
    }

    private String generateTempEmployeeId() {
        return "TEMP" + System.currentTimeMillis() % 10000;
    }

    // Convenience method for quick setup
    public void setupEmployee(String name, String department, String jobTitle, double salary) {
        setName(name);
        setDepartment(department);
        setJobTitle(jobTitle);
        setSalary(salary);

        // Generate proper employee ID after setup
        this.employeeId = generateProperEmployeeId();
        System.out.println("Employee setup completed. New ID: " + employeeId);
    }

    private String generateProperEmployeeId() {
        String deptCode = department.substring(0, Math.min(3, department.length())).toUpperCase();
        return "EMP" + deptCode + String.format("%04d", (int)(Math.random() * 9999));
    }

    // Setter methods with validation
    public void setName(String name) {
        if (name != null && name.trim().length() >= 2) {
            this.name = name.trim();
        }
    }

    public void setDepartment(String department) {
        String[] validDepartments = {"ENGINEERING", "SALES", "MARKETING", "HR", "FINANCE", "OPERATIONS"};
        if (department != null) {
            for (String dept : validDepartments) {
                if (dept.equalsIgnoreCase(department)) {
                    this.department = dept;
                    // Adjust vacation days based on department
                    if (dept.equals("ENGINEERING") || dept.equals("FINANCE")) {
                        this.vacationDays = 15;  // Tech departments get more vacation
                    }
                    return;
                }
            }
        }
        System.out.println("Invalid department. Using UNASSIGNED.");
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle != null && !jobTitle.trim().isEmpty()) {
            this.jobTitle = jobTitle.trim();
        }
    }

    public void setSalary(double salary) {
        if (salary >= 30000 && salary <= 200000) {
            this.salary = salary;
        } else {
            System.out.println("Salary out of range. Using default.");
        }
    }

    // Getter methods
    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public String getJobTitle() { return jobTitle; }
    public int getVacationDays() { return vacationDays; }

    public void displayEmployeeInfo() {
        System.out.println("=== Employee Information ===");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + String.format("%,.2f", salary));
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Vacation Days: " + vacationDays);
        System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
    }
}
```

### When Default Constructor Is Not Provided

```java
// When you provide ANY constructor, Java doesn't provide default constructor
class StudentWithParameterizedConstructor {
    private String name;
    private int age;

    // Parameterized constructor
    public StudentWithParameterizedConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // No default constructor available!
    // This would cause compilation error:
    // StudentWithParameterizedConstructor student = new StudentWithParameterizedConstructor();

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Solution: Provide both constructors
class StudentWithBothConstructors {
    private String name;
    private int age;
    private String major;

    // Default constructor
    public StudentWithBothConstructors() {
        this.name = "Unknown Student";
        this.age = 18;
        this.major = "Undeclared";
    }

    // Parameterized constructor
    public StudentWithBothConstructors(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Major: " + major);
    }
}
```

### Default Constructor Demo

```java
public class DefaultConstructorDemo {
    public static void main(String[] args) {
        System.out.println("=== Automatic Default Constructor Demo ===");

        AutoDefaultConstructorExample autoDefault = new AutoDefaultConstructorExample();
        autoDefault.displayInfo();

        System.out.println("\n=== Explicit Default Constructor Demo ===");

        Person person = new Person();  // Person created with default values
        person.displayInfo();

        // Update person information
        person.setName("John Doe");
        person.setAge(30);
        person.setEmail("john.doe@example.com");
        person.setEmployed(true);

        System.out.println("\nAfter updating:");
        person.displayInfo();

        System.out.println("\n=== Bank Account Default Constructor Demo ===");

        BankAccount account = new BankAccount();
        // New bank account created with default settings
        // Account Number: ACC1234567
        // Please complete account setup by providing holder information

        account.displayAccountInfo();

        // Complete the setup
        account.completeSetup("Alice Johnson", "SAVINGS", 500.0);
        // Account setup completed for Alice Johnson

        System.out.println("\nAfter setup completion:");
        account.displayAccountInfo();

        System.out.println("\n=== Employee Default Constructor Demo ===");

        Employee emp1 = new Employee();
        // New employee record created with default settings
        // Temporary Employee ID: TEMP1234
        // Please update employee information using setter methods

        emp1.displayEmployeeInfo();

        // Setup employee
        emp1.setupEmployee("Sarah Wilson", "ENGINEERING", "Software Developer", 75000);
        // Employee setup completed. New ID: EMPENG5678

        System.out.println("\nAfter employee setup:");
        emp1.displayEmployeeInfo();

        System.out.println("\n=== Multiple Employee Creation ===");

        Employee emp2 = new Employee();
        emp2.setupEmployee("Mike Chen", "FINANCE", "Financial Analyst", 65000);

        Employee emp3 = new Employee();
        emp3.setupEmployee("Lisa Brown", "MARKETING", "Marketing Manager", 70000);

        System.out.println("\nAll employees created:");
        emp1.displayEmployeeInfo();
        System.out.println();
        emp2.displayEmployeeInfo();
        System.out.println();
        emp3.displayEmployeeInfo();

        System.out.println("\n=== Constructor Availability Demo ===");

        // This works - both constructors available
        StudentWithBothConstructors student1 = new StudentWithBothConstructors();
        StudentWithBothConstructors student2 = new StudentWithBothConstructors("Alice", 20, "Computer Science");

        student1.displayInfo();  // Name: Unknown Student, Age: 18, Major: Undeclared
        student2.displayInfo();  // Name: Alice, Age: 20, Major: Computer Science

        // This would NOT work (compilation error):
        // StudentWithParameterizedConstructor student3 = new StudentWithParameterizedConstructor();

        // This works:
        StudentWithParameterizedConstructor student4 = new StudentWithParameterizedConstructor("Bob", 22);
        student4.displayInfo();  // Name: Bob, Age: 22
    }
}
```

# Multiple Constructors

## Constructor Overloading

Java allows you to define multiple constructors in a class with different parameter lists. This is called constructor overloading and provides flexibility in object creation.

### Basic Constructor Overloading

```java
public class Person {
    private String name;
    private int age;
    private String email;
    private String phone;
    private String address;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.email = "no-email@example.com";
        this.phone = "000-000-0000";
        this.address = "No address provided";
        System.out.println("Person created with default values");
    }

    // Constructor with name only
    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.email = "no-email@example.com";
        this.phone = "000-000-0000";
        this.address = "No address provided";
        System.out.println("Person created with name: " + name);
    }

    // Constructor with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.email = "no-email@example.com";
        this.phone = "000-000-0000";
        this.address = "No address provided";
        System.out.println("Person created with name: " + name + ", age: " + age);
    }

    // Constructor with name, age, and email
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = "000-000-0000";
        this.address = "No address provided";
        System.out.println("Person created with name: " + name + ", age: " + age + ", email: " + email);
    }

    // Constructor with all parameters
    public Person(String name, int age, String email, String phone, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.address = address;
        System.out.println("Person created with all details for: " + name);
    }

    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    public void displayInfo() {
        System.out.println("=== Person Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }
}
```

### Constructor Overloading with Validation

```java
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private double interestRate;
    private boolean isActive;

    // Default constructor
    public BankAccount() {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = "New Account Holder";
        this.balance = 0.0;
        this.accountType = "CHECKING";
        this.interestRate = 0.01;
        this.isActive = false;  // Requires setup
        System.out.println("Default bank account created. Account Number: " + accountNumber);
    }

    // Constructor with account holder name
    public BankAccount(String accountHolderName) {
        this();  // Call default constructor first
        if (isValidName(accountHolderName)) {
            this.accountHolderName = accountHolderName;
            System.out.println("Account created for: " + accountHolderName);
        } else {
            System.out.println("Invalid name provided. Using default.");
        }
    }

    // Constructor with name and initial deposit
    public BankAccount(String accountHolderName, double initialDeposit) {
        this(accountHolderName);  // Call previous constructor
        if (initialDeposit >= 100) {  // Minimum deposit requirement
            this.balance = initialDeposit;
            this.isActive = true;
            System.out.println("Initial deposit of $" + String.format("%.2f", initialDeposit) + " added");
        } else {
            System.out.println("Minimum deposit of $100 required. Account remains inactive.");
        }
    }

    // Constructor with name, deposit, and account type
    public BankAccount(String accountHolderName, double initialDeposit, String accountType) {
        this(accountHolderName, initialDeposit);  // Call previous constructor
        if (isValidAccountType(accountType)) {
            this.accountType = accountType.toUpperCase();
            setInterestRateForType();
            System.out.println("Account type set to: " + this.accountType);
        } else {
            System.out.println("Invalid account type. Using CHECKING.");
        }
    }

    // Constructor with all parameters
    public BankAccount(String accountNumber, String accountHolderName,
                      double initialDeposit, String accountType) {
        this(accountHolderName, initialDeposit, accountType);  // Call previous constructor
        if (isValidAccountNumber(accountNumber)) {
            this.accountNumber = accountNumber;
            System.out.println("Custom account number set: " + accountNumber);
        } else {
            System.out.println("Invalid account number format. Using generated number.");
        }
    }

    // Helper methods for validation
    private boolean isValidName(String name) {
        return name != null && name.trim().length() >= 2 && name.matches("^[a-zA-Z\\s]+$");
    }

    private boolean isValidAccountType(String type) {
        return type != null &&
               (type.equalsIgnoreCase("CHECKING") ||
                type.equalsIgnoreCase("SAVINGS") ||
                type.equalsIgnoreCase("BUSINESS"));
    }

    private boolean isValidAccountNumber(String accountNum) {
        return accountNum != null && accountNum.matches("^\\d{10}$");
    }

    private String generateAccountNumber() {
        return String.valueOf(System.currentTimeMillis()).substring(3, 13);
    }

    private void setInterestRateForType() {
        switch (accountType) {
            case "CHECKING":
                this.interestRate = 0.01;   // 1%
                break;
            case "SAVINGS":
                this.interestRate = 0.025;  // 2.5%
                break;
            case "BUSINESS":
                this.interestRate = 0.015;  // 1.5%
                break;
        }
    }

    // Getter methods
    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public double getBalance() { return balance; }
    public String getAccountType() { return accountType; }
    public double getInterestRate() { return interestRate; }
    public boolean isActive() { return isActive; }

    public void displayAccountInfo() {
        System.out.println("=== Bank Account Information ===");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + String.format("%.2f", balance));
        System.out.println("Interest Rate: " + String.format("%.2f%%", interestRate * 100));
        System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
    }
}
```

### Multiple Constructors Demo

```java
public class MultipleConstructorsDemo {
    public static void main(String[] args) {
        System.out.println("=== Person Constructor Overloading Demo ===");

        // Using different constructors
        Person person1 = new Person();  // Default constructor
        Person person2 = new Person("Alice Johnson");  // Name only
        Person person3 = new Person("Bob Smith", 30);  // Name and age
        Person person4 = new Person("Carol Davis", 25, "carol@example.com");  // Name, age, email
        Person person5 = new Person("David Wilson", 35, "david@example.com",
                                   "555-1234", "123 Main St");  // All parameters

        System.out.println("\n--- Person Information ---");
        person1.displayInfo();
        System.out.println();
        person2.displayInfo();
        System.out.println();
        person3.displayInfo();

        System.out.println("\n=== Bank Account Constructor Overloading Demo ===");

        // Using different BankAccount constructors
        System.out.println("--- Default Constructor ---");
        BankAccount account1 = new BankAccount();
        account1.displayAccountInfo();

        System.out.println("\n--- Name Only Constructor ---");
        BankAccount account2 = new BankAccount("Emma Johnson");
        account2.displayAccountInfo();

        System.out.println("\n--- Name and Deposit Constructor ---");
        BankAccount account3 = new BankAccount("Frank Miller", 250.0);
        account3.displayAccountInfo();

        System.out.println("\n--- Name, Deposit, and Type Constructor ---");
        BankAccount account4 = new BankAccount("Grace Lee", 750.0, "SAVINGS");
        account4.displayAccountInfo();

        System.out.println("\n--- All Parameters Constructor ---");
        BankAccount account5 = new BankAccount("1234567890", "Henry Brown", 1500.0, "BUSINESS");
        account5.displayAccountInfo();

        System.out.println("\n--- Constructor with Validation Issues ---");
        BankAccount account6 = new BankAccount("", 50.0, "INVALID_TYPE");  // Multiple issues
        account6.displayAccountInfo();
    }
}
```

# This Inside Constructors

## Using 'this()' for Constructor Chaining

Constructor chaining allows one constructor to call another constructor in the same class using `this()`. This helps avoid code duplication and ensures consistent initialization.

### Basic Constructor Chaining

```java
public class Student {
    private String studentId;
    private String name;
    private String major;
    private double gpa;
    private int creditHours;
    private boolean isEnrolled;

    // Most comprehensive constructor
    public Student(String studentId, String name, String major, double gpa, int creditHours, boolean isEnrolled) {
        // Validation and initialization logic
        this.studentId = (studentId != null) ? studentId : generateStudentId();
        this.name = (name != null && !name.trim().isEmpty()) ? name.trim() : "Unknown Student";
        this.major = (major != null) ? major : "Undeclared";
        this.gpa = (gpa >= 0.0 && gpa <= 4.0) ? gpa : 0.0;
        this.creditHours = (creditHours >= 0) ? creditHours : 0;
        this.isEnrolled = isEnrolled;

        System.out.println("Student created: " + this.name + " (" + this.studentId + ")");
    }

    // Constructor chaining - calls the main constructor with defaults
    public Student(String studentId, String name, String major) {
        this(studentId, name, major, 0.0, 0, true);  // Default GPA=0, creditHours=0, enrolled=true
        System.out.println("Student created with basic information");
    }

    // Constructor chaining - calls previous constructor with default major
    public Student(String studentId, String name) {
        this(studentId, name, "Undeclared");  // Default major
        System.out.println("Student created with name only");
    }

    // Constructor chaining - calls previous constructor with generated ID
    public Student(String name) {
        this(null, name);  // ID will be generated in main constructor
        System.out.println("Student created with generated ID");
    }

    // Default constructor - calls previous constructor with default name
    public Student() {
        this("New Student");  // Default name
        System.out.println("Default student created");
    }

    private String generateStudentId() {
        return "STU" + String.valueOf(System.currentTimeMillis()).substring(7);
    }

    // Getter methods
    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getMajor() { return major; }
    public double getGpa() { return gpa; }
    public int getCreditHours() { return creditHours; }
    public boolean isEnrolled() { return isEnrolled; }

    public void displayStudentInfo() {
        System.out.println("=== Student Information ===");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + String.format("%.2f", gpa));
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Enrolled: " + (isEnrolled ? "Yes" : "No"));
    }
}
```

### Advanced Constructor Chaining with Validation

```java
public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private String jobTitle;
    private double salary;
    private java.time.LocalDate hireDate;
    private boolean isFullTime;
    private String manager;

    // Master constructor with all parameters and validation
    public Employee(String employeeId, String name, String department, String jobTitle,
                   double salary, java.time.LocalDate hireDate, boolean isFullTime, String manager) {

        // Validate and set employee ID
        if (employeeId != null && employeeId.matches("^EMP\\d{4}$")) {
            this.employeeId = employeeId;
        } else {
            this.employeeId = generateEmployeeId();
            System.out.println("Invalid employee ID. Generated: " + this.employeeId);
        }

        // Validate and set name
        if (name != null && name.trim().length() >= 2) {
            this.name = name.trim();
        } else {
            throw new IllegalArgumentException("Employee name must be at least 2 characters");
        }

        // Validate and set department
        String[] validDepartments = {"ENGINEERING", "SALES", "MARKETING", "HR", "FINANCE"};
        boolean isValidDept = false;
        if (department != null) {
            for (String dept : validDepartments) {
                if (dept.equalsIgnoreCase(department)) {
                    this.department = dept;
                    isValidDept = true;
                    break;
                }
            }
        }
        if (!isValidDept) {
            this.department = "GENERAL";
            System.out.println("Invalid department. Set to GENERAL");
        }

        this.jobTitle = (jobTitle != null) ? jobTitle : "Employee";
        this.salary = Math.max(salary, 30000);  // Minimum salary
        this.hireDate = (hireDate != null) ? hireDate : java.time.LocalDate.now();
        this.isFullTime = isFullTime;
        this.manager = manager;

        System.out.println("Employee initialized: " + this.name + " in " + this.department);
    }

    // Constructor without manager (defaults to null)
    public Employee(String employeeId, String name, String department, String jobTitle,
                   double salary, java.time.LocalDate hireDate, boolean isFullTime) {
        this(employeeId, name, department, jobTitle, salary, hireDate, isFullTime, null);
        System.out.println("Employee created without assigned manager");
    }

    // Constructor without hire date (defaults to today)
    public Employee(String employeeId, String name, String department, String jobTitle,
                   double salary, boolean isFullTime) {
        this(employeeId, name, department, jobTitle, salary, null, isFullTime);
        System.out.println("Employee created with today's hire date");
    }

    // Constructor with default full-time status
    public Employee(String employeeId, String name, String department, String jobTitle, double salary) {
        this(employeeId, name, department, jobTitle, salary, true);  // Default to full-time
        System.out.println("Employee created as full-time by default");
    }

    // Constructor with default job title and salary
    public Employee(String employeeId, String name, String department) {
        this(employeeId, name, department, "Entry Level", 40000.0);  // Default title and salary
        System.out.println("Employee created with entry-level defaults");
    }

    // Constructor with generated employee ID
    public Employee(String name, String department) {
        this(null, name, department);  // ID will be generated
        System.out.println("Employee created with generated ID");
    }

    private String generateEmployeeId() {
        return "EMP" + String.format("%04d", (int)(Math.random() * 9999));
    }

    // Getter methods
    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getJobTitle() { return jobTitle; }
    public double getSalary() { return salary; }
    public java.time.LocalDate getHireDate() { return hireDate; }
    public boolean isFullTime() { return isFullTime; }
    public String getManager() { return manager; }

    public void displayEmployeeInfo() {
        System.out.println("=== Employee Information ===");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + String.format("%,.2f", salary));
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Employment Type: " + (isFullTime ? "Full-time" : "Part-time"));
        System.out.println("Manager: " + (manager != null ? manager : "Not assigned"));
    }
}
```

### Constructor Chaining Demo

```java
public class ConstructorChainingDemo {
    public static void main(String[] args) {
        System.out.println("=== Student Constructor Chaining Demo ===");

        // Each constructor calls the next one in the chain
        System.out.println("--- Default Constructor Chain ---");
        Student student1 = new Student();
        // Default student created
        // Student created with generated ID
        // Student created with name only
        // Student created with basic information
        // Student created: New Student (STU1234567)

        student1.displayStudentInfo();

        System.out.println("\n--- Name Only Constructor Chain ---");
        Student student2 = new Student("Alice Johnson");
        // Student created with generated ID
        // Student created with name only
        // Student created with basic information
        // Student created: Alice Johnson (STU7891234)

        System.out.println("\n--- Name and ID Constructor Chain ---");
        Student student3 = new Student("STU001", "Bob Smith");
        // Student created with name only
        // Student created with basic information
        // Student created: Bob Smith (STU001)

        System.out.println("\n--- Full Information Constructor ---");
        Student student4 = new Student("STU002", "Carol Davis", "Computer Science", 3.5, 45, true);
        // Student created: Carol Davis (STU002)

        student4.displayStudentInfo();

        System.out.println("\n=== Employee Constructor Chaining Demo ===");

        System.out.println("--- Name and Department Only ---");
        Employee emp1 = new Employee("John Doe", "ENGINEERING");
        // Employee created with generated ID
        // Employee created with entry-level defaults
        // Employee created as full-time by default
        // Employee created with today's hire date
        // Employee created without assigned manager
        // Employee initialized: John Doe in ENGINEERING

        emp1.displayEmployeeInfo();

        System.out.println("\n--- With Custom Salary ---");
        Employee emp2 = new Employee("EMP1234", "Jane Smith", "MARKETING", "Marketing Specialist", 55000.0);
        // Employee created as full-time by default
        // Employee created with today's hire date
        // Employee created without assigned manager
        // Employee initialized: Jane Smith in MARKETING

        System.out.println("\n--- Full Employee Information ---");
        Employee emp3 = new Employee("EMP5678", "Mike Wilson", "SALES", "Sales Manager",
                                   75000.0, java.time.LocalDate.of(2023, 6, 15), true, "Sarah Johnson");
        // Employee initialized: Mike Wilson in SALES

        emp3.displayEmployeeInfo();

        System.out.println("\n--- Constructor with Validation Issues ---");
        try {
            Employee emp4 = new Employee("INVALID_ID", "", "INVALID_DEPT", "Manager", 25000.0);
            // Invalid employee ID. Generated: EMP7890
            // Invalid department. Set to GENERAL
            // This will throw exception due to empty name
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
```

# ToString

## Understanding toString() Method

The `toString()` method is a special method that returns a string representation of an object. Every class in Java inherits this method from the Object class, but it's often overridden to provide meaningful information about the object's state.

### Default toString() Behavior

```java
public class DefaultToStringExample {
    private String name;
    private int age;

    public DefaultToStringExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Not overriding toString() - uses default implementation

    public static void main(String[] args) {
        DefaultToStringExample obj = new DefaultToStringExample("John", 25);

        System.out.println("Object without custom toString():");
        System.out.println(obj);  // Prints: DefaultToStringExample@hashcode
        System.out.println(obj.toString());  // Same as above

        // The default toString() returns: ClassName@HashCode
        System.out.println("Class name: " + obj.getClass().getSimpleName());
        System.out.println("Hash code: " + obj.hashCode());
    }
}
```

### Custom toString() Implementation

```java
public class Person {
    private String name;
    private int age;
    private String email;
    private String phone;

    public Person(String name, int age, String email, String phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    // Custom toString() method
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    // Alternative toString() format
    public String toStringFormatted() {
        return String.format("Person: %s (Age: %d, Email: %s, Phone: %s)",
                           name, age, email, phone);
    }

    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }

    public static void main(String[] args) {
        Person person = new Person("Alice Johnson", 28, "alice@example.com", "555-1234");

        System.out.println("Custom toString() output:");
        System.out.println(person);  // Automatically calls toString()
        // Person{name='Alice Johnson', age=28, email='alice@example.com', phone='555-1234'}

        System.out.println("\nFormatted toString() output:");
        System.out.println(person.toStringFormatted());
        // Person: Alice Johnson (Age: 28, Email: alice@example.com, Phone: 555-1234)
    }
}
```

### Advanced toString() Examples

```java
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private java.time.LocalDateTime creationDate;
    private boolean isActive;

    public BankAccount(String accountNumber, String accountHolderName,
                      String accountType, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = initialBalance;
        this.creationDate = java.time.LocalDateTime.now();
        this.isActive = true;
    }

    // Comprehensive toString() method
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + String.format("%.2f", balance) +
                ", accountType='" + accountType + '\'' +
                ", creationDate=" + creationDate.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) +
                ", isActive=" + isActive +
                '}';
    }

    // Business-friendly toString()
    public String toBusinessString() {
        return String.format("Account %s (%s) - %s: $%,.2f [%s]",
                           accountNumber,
                           accountHolderName,
                           accountType,
                           balance,
                           isActive ? "Active" : "Inactive");
    }

    // Summary toString()
    public String toSummaryString() {
        return String.format("%s - $%,.2f", accountHolderName, balance);
    }

    // Getter methods
    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public double getBalance() { return balance; }
    public String getAccountType() { return accountType; }
    public boolean isActive() { return isActive; }
}
```

### toString() with Collections

```java
import java.util.*;

public class Student {
    private String studentId;
    private String name;
    private String major;
    private double gpa;
    private List<String> courses;
    private Map<String, String> grades;

    public Student(String studentId, String name, String major, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
        this.courses = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public void addCourse(String course, String grade) {
        courses.add(course);
        grades.put(course, grade);
    }

    // toString() that handles collections
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("studentId='").append(studentId).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", major='").append(major).append('\'');
        sb.append(", gpa=").append(String.format("%.2f", gpa));

        if (!courses.isEmpty()) {
            sb.append(", courses=").append(courses);
        }

        if (!grades.isEmpty()) {
            sb.append(", grades=").append(grades);
        }

        sb.append('}');
        return sb.toString();
    }

    // Detailed toString() for academic records
    public String toAcademicString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Academic Record ===\n");
        sb.append("Student ID: ").append(studentId).append("\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Major: ").append(major).append("\n");
        sb.append("GPA: ").append(String.format("%.2f", gpa)).append("\n");

        if (!courses.isEmpty()) {
            sb.append("Courses and Grades:\n");
            for (String course : courses) {
                String grade = grades.get(course);
                sb.append("  - ").append(course).append(": ").append(grade).append("\n");
            }
        } else {
            sb.append("No courses enrolled\n");
        }

        return sb.toString();
    }

    // Compact toString()
    public String toCompactString() {
        return String.format("%s (%s) - %s, GPA: %.2f", name, studentId, major, gpa);
    }
}
```

### toString() Best Practices and Examples

```java
public class Product {
    private String productId;
    private String name;
    private double price;
    private int quantity;
    private String category;
    private List<String> tags;
    private Date manufactureDate;

    public Product(String productId, String name, double price, int quantity, String category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.tags = new ArrayList<>();
        this.manufactureDate = new Date();
    }

    public void addTag(String tag) {
        tags.add(tag);
    }

    // Standard toString() - includes all important fields
    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + String.format("%.2f", price) +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                ", tags=" + tags +
                ", manufactureDate=" + new java.text.SimpleDateFormat("yyyy-MM-dd").format(manufactureDate) +
                '}';
    }

    // Business toString() - customer-facing format
    public String toBusinessString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" - $").append(String.format("%.2f", price));
        sb.append(" (").append(quantity > 0 ? "In Stock" : "Out of Stock").append(")");

        if (!tags.isEmpty()) {
            sb.append(" Tags: ").append(String.join(", ", tags));
        }

        return sb.toString();
    }

    // Inventory toString() - for internal use
    public String toInventoryString() {
        return String.format("ID: %s | %s | $%.2f | Qty: %d | Category: %s",
                           productId, name, price, quantity, category);
    }

    // JSON-like toString()
    public String toJsonLikeString() {
        return String.format(
            "{\n" +
            "  \"productId\": \"%s\",\n" +
            "  \"name\": \"%s\",\n" +
            "  \"price\": %.2f,\n" +
            "  \"quantity\": %d,\n" +
            "  \"category\": \"%s\",\n" +
            "  \"tags\": %s,\n" +
            "  \"inStock\": %s\n" +
            "}",
            productId, name, price, quantity, category, tags, quantity > 0
        );
    }
}
```

### toString() Demo

```java
public class ToStringDemo {
    public static void main(String[] args) {
        System.out.println("=== Default toString() vs Custom toString() ===");

        // Default toString() example
        DefaultToStringExample defaultObj = new DefaultToStringExample("John", 25);
        System.out.println("Default toString(): " + defaultObj);
        // Default toString(): DefaultToStringExample@15db9742

        // Custom toString() example
        Person person = new Person("Alice Johnson", 28, "alice@example.com", "555-1234");
        System.out.println("Custom toString(): " + person);
        // Custom toString(): Person{name='Alice Johnson', age=28, email='alice@example.com', phone='555-1234'}

        System.out.println("\n=== Bank Account toString() Examples ===");

        BankAccount account = new BankAccount("1234567890", "Bob Smith", "SAVINGS", 2500.75);
        System.out.println("Standard toString():");
        System.out.println(account);

        System.out.println("\nBusiness toString():");
        System.out.println(account.toBusinessString());
        // Account 1234567890 (Bob Smith) - SAVINGS: $2,500.75 [Active]

        System.out.println("Summary toString():");
        System.out.println(account.toSummaryString());
        // Bob Smith - $2,500.75

        System.out.println("\n=== Student toString() with Collections ===");

        Student student = new Student("STU001", "Emma Davis", "Computer Science", 3.85);
        student.addCourse("Java Programming", "A");
        student.addCourse("Data Structures", "A-");
        student.addCourse("Database Systems", "B+");

        System.out.println("Standard toString():");
        System.out.println(student);

        System.out.println("\nAcademic toString():");
        System.out.println(student.toAcademicString());

        System.out.println("Compact toString():");
        System.out.println(student.toCompactString());
        // Emma Davis (STU001) - Computer Science, GPA: 3.85

        System.out.println("\n=== Product toString() Examples ===");

        Product laptop = new Product("PROD001", "Gaming Laptop", 1299.99, 15, "Electronics");
        laptop.addTag("Gaming");
        laptop.addTag("High Performance");
        laptop.addTag("RGB");

        System.out.println("Standard toString():");
        System.out.println(laptop);

        System.out.println("\nBusiness toString():");
        System.out.println(laptop.toBusinessString());
        // Gaming Laptop - $1299.99 (In Stock) Tags: Gaming, High Performance, RGB

        System.out.println("\nInventory toString():");
        System.out.println(laptop.toInventoryString());
        // ID: PROD001 | Gaming Laptop | $1299.99 | Qty: 15 | Category: Electronics

        System.out.println("\nJSON-like toString():");
        System.out.println(laptop.toJsonLikeString());

        System.out.println("\n=== toString() in Collections ===");

        List<Person> people = Arrays.asList(
            new Person("John Doe", 30, "john@example.com", "555-0001"),
            new Person("Jane Smith", 25, "jane@example.com", "555-0002"),
            new Person("Mike Wilson", 35, "mike@example.com", "555-0003")
        );

        System.out.println("List of people:");
        for (Person p : people) {
            System.out.println("  " + p);
        }

        // toString() is automatically called when printing collections
        System.out.println("\nCollection toString():");
        System.out.println(people);
    }
}
```

# The This Keyword

## Understanding the 'this' Keyword

The `this` keyword is a reference to the current object. It's used to refer to instance variables and methods of the current class, and to distinguish between instance variables and parameters when they have the same name.

### Basic Usage of 'this'

```java
public class Person {
    private String name;
    private int age;
    private String email;

    // Constructor using 'this' to distinguish between parameters and instance variables
    public Person(String name, int age, String email) {
        this.name = name;    // this.name refers to instance variable, name refers to parameter
        this.age = age;      // this.age refers to instance variable, age refers to parameter
        this.email = email;  // this.email refers to instance variable, email refers to parameter
    }

    // Setter methods using 'this'
    public void setName(String name) {
        this.name = name;  // Without 'this', both would refer to the parameter
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method using 'this' to call another method
    public void updatePersonalInfo(String name, int age, String email) {
        this.setName(name);   // Calling setter method using 'this'
        this.setAge(age);     // 'this' is optional here, but makes intent clear
        this.setEmail(email);

        // this.displayInfo(); // Calling another method of the same class
    }

    // Method that returns 'this' for method chaining
    public Person withName(String name) {
        this.name = name;
        return this;  // Returns the current object
    }

    public Person withAge(int age) {
        this.age = age;
        return this;
    }

    public Person withEmail(String email) {
        this.email = email;
        return this;
    }

    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }

    public void displayInfo() {
        System.out.println("Person Information:");
        System.out.println("Name: " + this.name);    // 'this' is optional here
        System.out.println("Age: " + this.age);
        System.out.println("Email: " + this.email);
    }

    // Method that compares current object with another
    public boolean isSameAge(Person other) {
        return this.age == other.age;  // 'this' refers to current object
    }

    public boolean hasSameName(Person other) {
        return this.name != null && this.name.equals(other.name);
    }
}
```

### Advanced Usage of 'this'

```java
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private double interestRate;
    private boolean isActive;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = "CHECKING";  // Default
        this.interestRate = 0.01;       // Default
        this.isActive = true;           // Default

        // Call initialization method using 'this'
        this.validateAccount();
    }

    // Method using 'this' extensively
    private void validateAccount() {
        if (this.accountNumber == null || this.accountNumber.length() != 10) {
            throw new IllegalArgumentException("Invalid account number");
        }

        if (this.accountHolderName == null || this.accountHolderName.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be empty");
        }

        if (this.balance < 0) {
            System.out.println("Warning: Account created with negative balance");
        }

        System.out.println("Account validation completed for: " + this.accountHolderName);
    }

    // Method chaining using 'this'
    public BankAccount setAccountType(String accountType) {
        this.accountType = accountType;
        this.updateInterestRate();  // Call another method using 'this'
        return this;  // Return current object for chaining
    }

    public BankAccount setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    public BankAccount activate() {
        this.isActive = true;
        return this;
    }

    public BankAccount deactivate() {
        this.isActive = false;
        return this;
    }

    // Method that uses 'this' to pass current object to another method
    public void transferTo(BankAccount targetAccount, double amount) {
        if (this.canWithdraw(amount)) {  // Call method on current object
            this.withdraw(amount);
            targetAccount.deposit(amount);

            // Log the transfer
            this.logTransaction("Transfer out", amount);
            targetAccount.logTransaction("Transfer in", amount);
        }
    }

    private boolean canWithdraw(double amount) {
        return this.isActive && this.balance >= amount;
    }

    private void withdraw(double amount) {
        this.balance -= amount;
        System.out.println("Withdrew $" + String.format("%.2f", amount) + " from " + this.accountHolderName);
    }

    private void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited $" + String.format("%.2f", amount) + " to " + this.accountHolderName);
    }

    private void logTransaction(String type, double amount) {
        System.out.println("Transaction logged for " + this.accountHolderName +
                          ": " + type + " $" + String.format("%.2f", amount));
    }

    private void updateInterestRate() {
        switch (this.accountType) {
            case "CHECKING":
                this.interestRate = 0.01;
                break;
            case "SAVINGS":
                this.interestRate = 0.025;
                break;
            case "BUSINESS":
                this.interestRate = 0.015;
                break;
        }
    }

    // Method that compares current object with another using 'this'
    public boolean hasSameAccountType(BankAccount other) {
        return this.accountType.equals(other.accountType);
    }

    public boolean hasHigherBalance(BankAccount other) {
        return this.balance > other.balance;
    }

    // toString() method using 'this'
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + this.accountNumber + '\'' +
                ", accountHolderName='" + this.accountHolderName + '\'' +
                ", balance=" + this.balance +
                ", accountType='" + this.accountType + '\'' +
                ", interestRate=" + this.interestRate +
                ", isActive=" + this.isActive +
                '}';
    }

    // Getter methods
    public String getAccountNumber() { return this.accountNumber; }
    public String getAccountHolderName() { return this.accountHolderName; }
    public double getBalance() { return this.balance; }
    public String getAccountType() { return this.accountType; }
    public boolean isActive() { return this.isActive; }
}
```

### 'this' in Constructor Chaining

```java
public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double salary;
    private boolean isFullTime;

    // Constructor chaining using 'this()'
    public Employee() {
        this("Unknown", "GENERAL", 40000.0);  // Call another constructor
    }

    public Employee(String name) {
        this(name, "GENERAL", 40000.0);  // Call another constructor
    }

    public Employee(String name, String department) {
        this(name, department, 40000.0);  // Call another constructor
    }

    // Main constructor
    public Employee(String name, String department, double salary) {
        this.employeeId = generateEmployeeId();
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.isFullTime = true;  // Default

        // Call validation method using 'this'
        this.validateEmployeeData();
    }

    private String generateEmployeeId() {
        return "EMP" + System.currentTimeMillis() % 10000;
    }

    private void validateEmployeeData() {
        if (this.name == null || this.name.trim().isEmpty()) {
            this.name = "Unknown Employee";
        }

        if (this.salary < 30000) {
            System.out.println("Warning: Salary below minimum threshold for " + this.name);
        }
    }

    // Method that creates a copy of current object
    public Employee createCopy() {
        Employee copy = new Employee(this.name, this.department, this.salary);
        copy.employeeId = "COPY_" + this.employeeId;
        copy.isFullTime = this.isFullTime;
        return copy;
    }

    // Method that compares current object with another
    public int compareSalary(Employee other) {
        if (this.salary > other.salary) {
            return 1;
        } else if (this.salary < other.salary) {
            return -1;
        } else {
            return 0;
        }
    }

    // Method chaining example
    public Employee updateSalary(double newSalary) {
        this.salary = newSalary;
        return this;
    }

    public Employee changeDepartment(String newDepartment) {
        this.department = newDepartment;
        return this;
    }

    public Employee setFullTime(boolean fullTime) {
        this.isFullTime = fullTime;
        return this;
    }

    // Getter methods using 'this' (optional but explicit)
    public String getEmployeeId() { return this.employeeId; }
    public String getName() { return this.name; }
    public String getDepartment() { return this.department; }
    public double getSalary() { return this.salary; }
    public boolean isFullTime() { return this.isFullTime; }

    public void displayInfo() {
        System.out.println("Employee: " + this.name + " (" + this.employeeId + ")");
        System.out.println("Department: " + this.department);
        System.out.println("Salary: $" + String.format("%.2f", this.salary));
        System.out.println("Full-time: " + this.isFullTime);
    }
}
```

### 'this' Keyword Demo

```java
public class ThisKeywordDemo {
    public static void main(String[] args) {
        System.out.println("=== Basic 'this' Usage Demo ===");

        // Creating person with constructor that uses 'this'
        Person person1 = new Person("Alice Johnson", 28, "alice@example.com");
        person1.displayInfo();

        // Using setter methods that use 'this'
        person1.setName("Alice Smith");  // Using 'this' to distinguish parameter from field
        person1.setAge(29);

        System.out.println("\nAfter updates:");
        person1.displayInfo();

        System.out.println("\n=== Method Chaining with 'this' ===");

        // Method chaining - each method returns 'this'
        Person person2 = new Person("", 0, "")
                .withName("Bob Wilson")
                .withAge(35)
                .withEmail("bob@example.com");

        person2.displayInfo();

        System.out.println("\n=== Object Comparison using 'this' ===");

        Person person3 = new Person("Carol Davis", 28, "carol@example.com");

        System.out.println("person1 and person3 same age: " + person1.isSameAge(person3));  // true
        System.out.println("person1 and person3 same name: " + person1.hasSameName(person3)); // false

        System.out.println("\n=== Bank Account 'this' Demo ===");

        // Bank account with validation using 'this'
        BankAccount account1 = new BankAccount("1234567890", "John Doe", 1500.0);

        // Method chaining using 'this'
        account1.setAccountType("SAVINGS")
                .setBalance(2000.0)
                .activate();

        System.out.println("Account 1: " + account1);

        BankAccount account2 = new BankAccount("9876543210", "Jane Smith", 1000.0);
        account2.setAccountType("CHECKING");

        System.out.println("\nAccount comparison:");
        System.out.println("Same account type: " + account1.hasSameAccountType(account2)); // false
        System.out.println("Account1 has higher balance: " + account1.hasHigherBalance(account2)); // true

        System.out.println("\n=== Transfer using 'this' ===");
        account1.transferTo(account2, 500.0);

        System.out.println("After transfer:");
        System.out.println("Account1 balance: $" + String.format("%.2f", account1.getBalance()));
        System.out.println("Account2 balance: $" + String.format("%.2f", account2.getBalance()));

        System.out.println("\n=== Employee Constructor Chaining with 'this()' ===");

        // Different constructor calls using 'this()'
        Employee emp1 = new Employee();  // Uses this() to call another constructor
        Employee emp2 = new Employee("Alice Johnson");  // Uses this() to call another constructor
        Employee emp3 = new Employee("Bob Smith", "ENGINEERING");  // Uses this() to call main constructor
        Employee emp4 = new Employee("Carol Davis", "MARKETING", 65000.0);  // Main constructor

        System.out.println("Employee 1:");
        emp1.displayInfo();

        System.out.println("\nEmployee 2:");
        emp2.displayInfo();

        System.out.println("\n=== Method Chaining with Employee ===");

        // Method chaining using 'this'
        emp4.updateSalary(70000.0)
            .changeDepartment("SALES")
            .setFullTime(false);

        System.out.println("Employee 4 after chaining:");
        emp4.displayInfo();

        System.out.println("\n=== Employee Comparison ===");

        int salaryComparison = emp3.compareSalary(emp4);
        if (salaryComparison > 0) {
            System.out.println(emp3.getName() + " has higher salary than " + emp4.getName());
        } else if (salaryComparison < 0) {
            System.out.println(emp3.getName() + " has lower salary than " + emp4.getName());
        } else {
            System.out.println(emp3.getName() + " and " + emp4.getName() + " have same salary");
        }

        System.out.println("\n=== Creating Employee Copy ===");

        Employee empCopy = emp4.createCopy();
        System.out.println("Original employee:");
        emp4.displayInfo();
        System.out.println("\nCopied employee:");
        empCopy.displayInfo();
    }
}
```

# Everything In Java Is An Object

## Understanding Object-Oriented Nature of Java

In Java, almost everything is an object. This fundamental concept is crucial for understanding how Java works and how to write effective object-oriented code.

### What Are Objects in Java?

```java
public class EverythingIsObjectDemo {
    public static void main(String[] args) {
        System.out.println("=== Understanding Objects in Java ===");

        // Strings are objects
        String text = "Hello World";
        System.out.println("String is an object: " + (text instanceof Object));  // true
        System.out.println("String class: " + text.getClass().getName());  // java.lang.String
        System.out.println("String methods available: length(), charAt(), substring(), etc.");

        // Arrays are objects
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array is an object: " + (numbers instanceof Object));  // true
        System.out.println("Array class: " + numbers.getClass().getName());  // [I (array of int)
        System.out.println("Array has length property: " + numbers.length);

        // Even wrapper classes for primitives are objects
        Integer num = 42;
        System.out.println("Integer wrapper is an object: " + (num instanceof Object));  // true
        System.out.println("Integer class: " + num.getClass().getName());  // java.lang.Integer

        // Collections are objects
        java.util.List<String> list = new java.util.ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        System.out.println("ArrayList is an object: " + (list instanceof Object));  // true
        System.out.println("ArrayList class: " + list.getClass().getName());  // java.util.ArrayList

        // Custom classes create objects
        Person person = new Person("John Doe");
        System.out.println("Custom Person is an object: " + (person instanceof Object));  // true
        System.out.println("Person class: " + person.getClass().getName());  // Person

        // Even classes are objects (Class objects)
        Class<?> stringClass = String.class;
        System.out.println("Class is an object: " + (stringClass instanceof Object));  // true
        System.out.println("Class class: " + stringClass.getClass().getName());  // java.lang.Class
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

### Primitives vs Objects

```java
public class PrimitivesVsObjects {
    public static void main(String[] args) {
        System.out.println("=== Primitives vs Objects ===");

        // Primitives are NOT objects
        int primitiveInt = 42;
        double primitiveDouble = 3.14;
        boolean primitiveBoolean = true;
        char primitiveChar = 'A';

        // These are the 8 primitive types in Java:
        // byte, short, int, long, float, double, boolean, char

        System.out.println("Primitive int value: " + primitiveInt);
        // System.out.println(primitiveInt instanceof Object);  // Compilation error!
        // Primitives don't have methods or inherit from Object

        // Wrapper classes ARE objects
        Integer objectInteger = 42;  // Autoboxing: int -> Integer
        Double objectDouble = 3.14;   // Autoboxing: double -> Double
        Boolean objectBoolean = true; // Autoboxing: boolean -> Boolean
        Character objectChar = 'A';   // Autoboxing: char -> Character

        System.out.println("Object Integer: " + objectInteger);
        System.out.println("Integer is object: " + (objectInteger instanceof Object));  // true

        // Wrapper objects have methods
        System.out.println("Integer methods:");
        System.out.println("  toString(): " + objectInteger.toString());
        System.out.println("  compareTo(): " + objectInteger.compareTo(50));
        System.out.println("  intValue(): " + objectInteger.intValue());

        // Autoboxing and Unboxing
        demonstrateAutoboxing();

        // Object methods available on all objects
        demonstrateObjectMethods();
    }

    private static void demonstrateAutoboxing() {
        System.out.println("\n=== Autoboxing and Unboxing ===");

        // Autoboxing: primitive -> wrapper object
        int primitive = 100;
        Integer wrapper = primitive;  // Automatic conversion
        System.out.println("Autoboxing: int " + primitive + " -> Integer " + wrapper);

        // Unboxing: wrapper object -> primitive
        Integer wrapperObj = 200;
        int primitiveValue = wrapperObj;  // Automatic conversion
        System.out.println("Unboxing: Integer " + wrapperObj + " -> int " + primitiveValue);

        // Collections only work with objects, not primitives
        java.util.List<Integer> numberList = new java.util.ArrayList<>();
        numberList.add(10);   // Autoboxing: int -> Integer
        numberList.add(20);
        numberList.add(30);

        int sum = 0;
        for (Integer num : numberList) {
            sum += num;  // Unboxing: Integer -> int
        }
        System.out.println("Sum from list: " + sum);
    }

    private static void demonstrateObjectMethods() {
        System.out.println("\n=== Object Methods Available to All Objects ===");

        String text = "Hello World";
        Integer number = 42;
        java.util.List<String> list = new java.util.ArrayList<>();

        // Every object inherits these methods from Object class:

        // toString() - string representation
        System.out.println("toString() examples:");
        System.out.println("  String: " + text.toString());
        System.out.println("  Integer: " + number.toString());
        System.out.println("  ArrayList: " + list.toString());

        // getClass() - runtime class information
        System.out.println("\ngetClass() examples:");
        System.out.println("  String class: " + text.getClass());
        System.out.println("  Integer class: " + number.getClass());
        System.out.println("  ArrayList class: " + list.getClass());

        // hashCode() - hash code for the object
        System.out.println("\nhashCode() examples:");
        System.out.println("  String hashCode: " + text.hashCode());
        System.out.println("  Integer hashCode: " + number.hashCode());
        System.out.println("  ArrayList hashCode: " + list.hashCode());

        // equals() - object equality
        String text1 = "Hello";
        String text2 = "Hello";
        String text3 = new String("Hello");

        System.out.println("\nequals() examples:");
        System.out.println("  text1.equals(text2): " + text1.equals(text2));  // true
        System.out.println("  text1.equals(text3): " + text1.equals(text3));  // true
        System.out.println("  text1 == text2: " + (text1 == text2));  // true (string pool)
        System.out.println("  text1 == text3: " + (text1 == text3));  // false (different objects)
    }
}
```

### Object Hierarchy and Inheritance

```java
public class ObjectHierarchyDemo {
    public static void main(String[] args) {
        System.out.println("=== Object Hierarchy in Java ===");

        // All classes inherit from Object (directly or indirectly)
        demonstrateInheritanceFromObject();

        // Using Object references
        demonstrateObjectReferences();

        // Polymorphism with Object
        demonstratePolymorphism();
    }

    private static void demonstrateInheritanceFromObject() {
        System.out.println("--- Inheritance from Object ---");

        // Create different types of objects
        Student student = new Student("John", "CS");
        Employee employee = new Employee("Jane", "Engineering");
        BankAccount account = new BankAccount("123456", "Bob");

        // All inherit from Object
        System.out.println("Student inherits from Object: " + (student instanceof Object));
        System.out.println("Employee inherits from Object: " + (employee instanceof Object));
        System.out.println("BankAccount inherits from Object: " + (account instanceof Object));

        // All have Object methods
        System.out.println("\nObject methods available:");
        System.out.println("Student toString(): " + student.toString());
        System.out.println("Employee getClass(): " + employee.getClass().getSimpleName());
        System.out.println("BankAccount hashCode(): " + account.hashCode());
    }

    private static void demonstrateObjectReferences() {
        System.out.println("\n--- Object References ---");

        // Object reference can hold any object
        Object obj1 = "This is a String";
        Object obj2 = 42;  // Autoboxed to Integer
        Object obj3 = new Student("Alice", "Math");
        Object obj4 = new java.util.ArrayList<String>();

        System.out.println("Object references:");
        System.out.println("obj1 (String): " + obj1);
        System.out.println("obj2 (Integer): " + obj2);
        System.out.println("obj3 (Student): " + obj3);
        System.out.println("obj4 (ArrayList): " + obj4);

        // Type checking with instanceof
        System.out.println("\nType checking:");
        System.out.println("obj1 is String: " + (obj1 instanceof String));
        System.out.println("obj2 is Integer: " + (obj2 instanceof Integer));
        System.out.println("obj3 is Student: " + (obj3 instanceof Student));
        System.out.println("obj4 is List: " + (obj4 instanceof java.util.List));

        // Casting back to specific types
        if (obj1 instanceof String) {
            String str = (String) obj1;
            System.out.println("Cast to String, length: " + str.length());
        }

        if (obj3 instanceof Student) {
            Student student = (Student) obj3;
            System.out.println("Cast to Student, name: " + student.getName());
        }
    }

    private static void demonstratePolymorphism() {
        System.out.println("\n--- Polymorphism with Object ---");

        // Array of Objects can hold different types
        Object[] objects = {
            "Hello World",
            42,
            3.14,
            true,
            new Student("Charlie", "Physics"),
            new Employee("Diana", "Marketing"),
            new java.util.Date()
        };

        System.out.println("Processing array of different object types:");
        for (int i = 0; i < objects.length; i++) {
            Object obj = objects[i];
            System.out.printf("objects[%d]: %s (Type: %s)%n",
                            i, obj.toString(), obj.getClass().getSimpleName());
        }

        // Polymorphic method calls
        System.out.println("\nPolymorphic method calls:");
        for (Object obj : objects) {
            processObject(obj);  // Same method handles different types
        }
    }

    // Polymorphic method that works with any Object
    private static void processObject(Object obj) {
        System.out.println("Processing: " + obj.getClass().getSimpleName());

        // Use instanceof to handle different types differently
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println("  String length: " + str.length());
        } else if (obj instanceof Number) {
            Number num = (Number) obj;
            System.out.println("  Number value: " + num.doubleValue());
        } else if (obj instanceof Student) {
            Student student = (Student) obj;
            System.out.println("  Student name: " + student.getName());
        } else if (obj instanceof Employee) {
            Employee employee = (Employee) obj;
            System.out.println("  Employee name: " + employee.getName());
        } else {
            System.out.println("  Generic object: " + obj.toString());
        }
    }
}

// Supporting classes
class Student {
    private String name;
    private String major;

    public Student(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public String getName() { return name; }
    public String getMajor() { return major; }

    @Override
    public String toString() {
        return "Student{name='" + name + "', major='" + major + "'}";
    }
}

class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "'}";
    }
}

class BankAccount {
    private String accountNumber;
    private String holderName;

    public BankAccount(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }

    @Override
    public String toString() {
        return "BankAccount{accountNumber='" + accountNumber + "', holderName='" + holderName + "'}";
    }
}
```

### Practical Implications

```java
public class PracticalImplications {
    public static void main(String[] args) {
        System.out.println("=== Practical Implications of Everything Being Objects ===");

        // Collections can only store objects, not primitives
        demonstrateCollections();

        // Generics work with objects
        demonstrateGenerics();

        // Reflection works with objects
        demonstrateReflection();

        // Object-oriented design patterns
        demonstrateDesignPatterns();
    }

    private static void demonstrateCollections() {
        System.out.println("--- Collections and Objects ---");

        // Collections store objects, not primitives
        java.util.List<Integer> numbers = new java.util.ArrayList<>();
        numbers.add(10);  // Autoboxing: int -> Integer
        numbers.add(20);
        numbers.add(30);

        // Mixed object collection
        java.util.List<Object> mixedList = new java.util.ArrayList<>();
        mixedList.add("String");
        mixedList.add(42);
        mixedList.add(3.14);
        mixedList.add(new Student("Alice", "CS"));

        System.out.println("Numbers list: " + numbers);
        System.out.println("Mixed list: " + mixedList);

        // Iterating through mixed objects
        for (Object item : mixedList) {
            System.out.println("Item: " + item + " (Type: " + item.getClass().getSimpleName() + ")");
        }
    }

    private static void demonstrateGenerics() {
        System.out.println("\n--- Generics with Objects ---");

        // Generic classes work with objects
        Container<String> stringContainer = new Container<>("Hello World");
        Container<Integer> intContainer = new Container<>(42);
        Container<Student> studentContainer = new Container<>(new Student("Bob", "Math"));

        System.out.println("String container: " + stringContainer.getValue());
        System.out.println("Integer container: " + intContainer.getValue());
        System.out.println("Student container: " + studentContainer.getValue());

        // Generic methods
        printObjectInfo("This is a string");
        printObjectInfo(123);
        printObjectInfo(new Employee("Carol", "HR"));
    }

    private static <T> void printObjectInfo(T obj) {
        System.out.println("Object: " + obj + " (Class: " + obj.getClass().getSimpleName() + ")");
    }

    private static void demonstrateReflection() {
        System.out.println("\n--- Reflection with Objects ---");

        try {
            // Get class information at runtime
            Student student = new Student("David", "Physics");
            Class<?> studentClass = student.getClass();

            System.out.println("Class name: " + studentClass.getName());
            System.out.println("Simple name: " + studentClass.getSimpleName());
            System.out.println("Package: " + studentClass.getPackage());

            // Get methods
            System.out.println("Methods:");
            java.lang.reflect.Method[] methods = studentClass.getDeclaredMethods();
            for (java.lang.reflect.Method method : methods) {
                System.out.println("  " + method.getName());
            }

            // Get fields
            System.out.println("Fields:");
            java.lang.reflect.Field[] fields = studentClass.getDeclaredFields();
            for (java.lang.reflect.Field field : fields) {
                System.out.println("  " + field.getName() + " (" + field.getType().getSimpleName() + ")");
            }

        } catch (Exception e) {
            System.out.println("Reflection error: " + e.getMessage());
        }
    }

    private static void demonstrateDesignPatterns() {
        System.out.println("\n--- Object-Oriented Design Patterns ---");

        // Factory pattern - creates objects
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.createShape("CIRCLE");
        Shape rectangle = factory.createShape("RECTANGLE");

        System.out.println("Created shapes:");
        circle.draw();
        rectangle.draw();

        // Observer pattern - objects communicate
        NewsAgency agency = new NewsAgency();
        NewsChannel cnn = new NewsChannel("CNN");
        NewsChannel bbc = new NewsChannel("BBC");

        agency.addObserver(cnn);
        agency.addObserver(bbc);
        agency.setNews("Breaking: Everything in Java is an Object!");
    }
}

// Supporting classes for demonstrations
class Container<T> {
    private T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

// Shape hierarchy for factory pattern
interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class ShapeFactory {
    public Shape createShape(String type) {
        switch (type.toUpperCase()) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                throw new IllegalArgumentException("Unknown shape type: " + type);
        }
    }
}

// Observer pattern classes
class NewsAgency {
    private java.util.List<NewsChannel> observers = new java.util.ArrayList<>();
    private String news;

    public void addObserver(NewsChannel channel) {
        observers.add(channel);
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    private void notifyObservers() {
        for (NewsChannel channel : observers) {
            channel.update(news);
        }
    }
}

class NewsChannel {
    private String name;

    public NewsChannel(String name) {
        this.name = name;
    }

    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
}
```

# Pojos

## Introduction to POJOs

POJO stands for "Plain Old Java Object" - a term that describes simple Java classes that don't depend on any special frameworks or libraries. POJOs are fundamental building blocks in Java applications and form the basis for data transfer objects, domain models, and entity classes.

### What Makes a Class a POJO?

```java
public class WhatIsAPOJO {
    public static void main(String[] args) {
        System.out.println("=== Understanding POJOs ===");

        // POJO characteristics:
        System.out.println("A POJO is a Java class that:");
        System.out.println("1. Has private fields");
        System.out.println("2. Has public getter and setter methods");
        System.out.println("3. Has a no-argument constructor");
        System.out.println("4. May have additional constructors");
        System.out.println("5. Implements Serializable (optional but common)");
        System.out.println("6. Doesn't extend or implement special framework classes/interfaces");
        System.out.println("7. Contains only business logic (no framework-specific code)");

        // Example POJO usage
        SimplePerson person = new SimplePerson();
        person.setName("John Doe");
        person.setAge(30);
        person.setEmail("john@example.com");

        System.out.println("\n=== POJO in Action ===");
        System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());
        // Person: John Doe, Age: 30
    }
}

// Simple POJO example
class SimplePerson {
    private String name;
    private int age;
    private String email;

    // No-argument constructor
    public SimplePerson() {}

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
```

### POJO vs JavaBean

```java
import java.io.Serializable;

public class POJOvsJavaBean {
    public static void main(String[] args) {
        System.out.println("=== POJO vs JavaBean Comparison ===");

        // Regular POJO
        RegularPOJO pojo = new RegularPOJO();
        pojo.setName("POJO Example");
        pojo.setActive(true);

        // JavaBean (stricter POJO)
        PersonBean bean = new PersonBean();
        bean.setFirstName("John");
        bean.setLastName("Doe");
        bean.setAge(25);

        System.out.println("POJO: " + pojo.getName() + " (Active: " + pojo.isActive() + ")");
        System.out.println("JavaBean: " + bean.getFirstName() + " " + bean.getLastName() +
                          ", Age: " + bean.getAge());

        demonstrateDifferences();
    }

    private static void demonstrateDifferences() {
        System.out.println("\n=== Key Differences ===");
        System.out.println("POJO:");
        System.out.println("  - Simple Java class");
        System.out.println("  - No specific rules");
        System.out.println("  - May or may not be serializable");
        System.out.println("  - Flexible constructor requirements");

        System.out.println("\nJavaBean:");
        System.out.println("  - Follows JavaBean specification");
        System.out.println("  - Must be serializable");
        System.out.println("  - Must have no-argument constructor");
        System.out.println("  - Must follow getter/setter naming conventions");
        System.out.println("  - Properties must be private with public accessors");
    }
}

// Regular POJO - flexible rules
class RegularPOJO {
    private String name;
    private boolean active;

    // Constructor with parameters (optional)
    public RegularPOJO(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    // Default constructor
    public RegularPOJO() {}

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public boolean isActive() { return active; }  // Note: boolean uses 'is' prefix
    public void setActive(boolean active) { this.active = active; }
}

// JavaBean - strict rules
class PersonBean implements Serializable {
    private static final long serialVersionUID = 1L;  // Required for Serializable

    private String firstName;
    private String lastName;
    private int age;

    // Must have no-argument constructor
    public PersonBean() {}

    // Getter/setter pairs following JavaBean naming convention
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
```

### Comprehensive POJO Examples

```java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Product POJO for e-commerce application
public class Product {
    private Long id;
    private String name;
    private String description;
    private double price;
    private int stockQuantity;
    private String category;
    private String sku;  // Stock Keeping Unit
    private boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<String> tags;

    // Default constructor
    public Product() {
        this.tags = new ArrayList<>();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.active = true;
    }

    // Constructor with essential fields
    public Product(String name, double price, int stockQuantity, String category) {
        this();  // Call default constructor
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.category = category;
    }

    // Full constructor
    public Product(Long id, String name, String description, double price,
                  int stockQuantity, String category, String sku) {
        this(name, price, stockQuantity, category);  // Call partial constructor
        this.id = id;
        this.description = description;
        this.sku = sku;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
        this.updatedAt = LocalDateTime.now();
    }

    public String getDescription() { return description; }
    public void setDescription(String description) {
        this.description = description;
        this.updatedAt = LocalDateTime.now();
    }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        this.price = price;
        this.updatedAt = LocalDateTime.now();
    }

    public int getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
        this.updatedAt = LocalDateTime.now();
    }

    public String getCategory() { return category; }
    public void setCategory(String category) {
        this.category = category;
        this.updatedAt = LocalDateTime.now();
    }

    public String getSku() { return sku; }
    public void setSku(String sku) {
        this.sku = sku;
        this.updatedAt = LocalDateTime.now();
    }

    public boolean isActive() { return active; }
    public void setActive(boolean active) {
        this.active = active;
        this.updatedAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    public List<String> getTags() { return new ArrayList<>(tags); }  // Return copy for encapsulation
    public void setTags(List<String> tags) {
        this.tags = new ArrayList<>(tags);
        this.updatedAt = LocalDateTime.now();
    }

    // Business methods
    public void addTag(String tag) {
        if (tag != null && !tags.contains(tag)) {
            tags.add(tag);
            updatedAt = LocalDateTime.now();
        }
    }

    public void removeTag(String tag) {
        if (tags.remove(tag)) {
            updatedAt = LocalDateTime.now();
        }
    }

    public boolean isInStock() {
        return stockQuantity > 0;
    }

    public boolean isLowStock(int threshold) {
        return stockQuantity <= threshold;
    }

    public double getTotalValue() {
        return price * stockQuantity;
    }

    // Override equals and hashCode for proper object comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return Objects.equals(id, product.id) &&
               Objects.equals(sku, product.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sku);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + String.format("%.2f", price) +
                ", stockQuantity=" + stockQuantity +
                ", category='" + category + '\'' +
                ", active=" + active +
                '}';
    }
}
```

### Employee POJO with Nested Objects

```java
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Address POJO (nested in Employee)
class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    public Address() {}

    public Address(String street, String city, String state, String zipCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    // Getters and setters
    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getFullAddress() {
        return String.format("%s, %s, %s %s, %s", street, city, state, zipCode, country);
    }

    @Override
    public String toString() {
        return getFullAddress();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Address address = (Address) obj;
        return Objects.equals(street, address.street) &&
               Objects.equals(city, address.city) &&
               Objects.equals(state, address.state) &&
               Objects.equals(zipCode, address.zipCode) &&
               Objects.equals(country, address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, state, zipCode, country);
    }
}

// Employee POJO with complex structure
public class Employee {
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate hireDate;
    private LocalDate birthDate;
    private String jobTitle;
    private String department;
    private double salary;
    private Address address;
    private Employee manager;
    private List<Employee> directReports;
    private boolean active;

    // Default constructor
    public Employee() {
        this.directReports = new ArrayList<>();
        this.active = true;
        this.hireDate = LocalDate.now();
    }

    // Essential constructor
    public Employee(String firstName, String lastName, String email, String jobTitle, double salary) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getters and setters
    public Long getEmployeeId() { return employeeId; }
    public void setEmployeeId(Long employeeId) { this.employeeId = employeeId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public LocalDate getHireDate() { return hireDate; }
    public void setHireDate(LocalDate hireDate) { this.hireDate = hireDate; }

    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    public String getJobTitle() { return jobTitle; }
    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public Employee getManager() { return manager; }
    public void setManager(Employee manager) { this.manager = manager; }

    public List<Employee> getDirectReports() { return new ArrayList<>(directReports); }
    public void setDirectReports(List<Employee> directReports) {
        this.directReports = new ArrayList<>(directReports);
    }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    // Computed properties
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public long getYearsOfService() {
        return ChronoUnit.YEARS.between(hireDate, LocalDate.now());
    }

    public int getAge() {
        return birthDate != null ? (int) ChronoUnit.YEARS.between(birthDate, LocalDate.now()) : 0;
    }

    public boolean isManager() {
        return !directReports.isEmpty();
    }

    public int getTeamSize() {
        return directReports.size();
    }

    // Business methods
    public void addDirectReport(Employee employee) {
        if (employee != null && !directReports.contains(employee)) {
            directReports.add(employee);
            employee.setManager(this);
        }
    }

    public void removeDirectReport(Employee employee) {
        if (directReports.remove(employee)) {
            employee.setManager(null);
        }
    }

    public void promoteEmployee(String newJobTitle, double newSalary) {
        this.jobTitle = newJobTitle;
        this.salary = newSalary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return Objects.equals(employeeId, employee.employeeId) ||
               Objects.equals(email, employee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, email);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", fullName='" + getFullName() + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + String.format("%.2f", salary) +
                ", yearsOfService=" + getYearsOfService() +
                ", teamSize=" + getTeamSize() +
                '}';
    }
}
```

### POJO Best Practices and Patterns

```java
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

// Builder Pattern with POJO
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String id;  // Immutable after creation
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime lastLoginAt;

    // Private constructor - forces use of builder
    private User(Builder builder) {
        this.id = builder.id;
        this.username = builder.username;
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.active = builder.active;
        this.createdAt = builder.createdAt;
        this.lastLoginAt = builder.lastLoginAt;
    }

    // Getters only - setters through builder or specific methods
    public String getId() { return id; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public boolean isActive() { return active; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public LocalDateTime getLastLoginAt() { return lastLoginAt; }

    // Controlled setters for specific business operations
    public void updateProfile(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void updateEmail(String email) {
        this.email = email;
    }

    public void recordLogin() {
        this.lastLoginAt = LocalDateTime.now();
    }

    public void activate() {
        this.active = true;
    }

    public void deactivate() {
        this.active = false;
    }

    // Computed properties
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getDisplayName() {
        return getFullName() + " (" + username + ")";
    }

    // Builder pattern implementation
    public static class Builder {
        private String id;
        private String username;
        private String email;
        private String firstName;
        private String lastName;
        private boolean active = true;  // Default value
        private LocalDateTime createdAt = LocalDateTime.now();  // Default value
        private LocalDateTime lastLoginAt;

        public Builder() {
            this.id = UUID.randomUUID().toString();  // Auto-generate ID
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder active(boolean active) {
            this.active = active;
            return this;
        }

        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder lastLoginAt(LocalDateTime lastLoginAt) {
            this.lastLoginAt = lastLoginAt;
            return this;
        }

        public User build() {
            // Validation before building
            if (username == null || username.trim().isEmpty()) {
                throw new IllegalArgumentException("Username is required");
            }
            if (email == null || email.trim().isEmpty()) {
                throw new IllegalArgumentException("Email is required");
            }

            return new User(this);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", active=" + active +
                ", createdAt=" + createdAt +
                '}';
    }
}
```

### POJO Usage Demonstration

```java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class POJODemo {
    public static void main(String[] args) {
        System.out.println("=== POJO Demonstration ===");

        // Product POJO examples
        demonstrateProductPOJO();

        // Employee POJO examples
        demonstrateEmployeePOJO();

        // User Builder Pattern examples
        demonstrateUserBuilder();

        // POJO collections
        demonstratePOJOCollections();
    }

    private static void demonstrateProductPOJO() {
        System.out.println("\n--- Product POJO Examples ---");

        // Creating products using different constructors
        Product laptop = new Product("Gaming Laptop", 1299.99, 15, "Electronics");
        laptop.setDescription("High-performance gaming laptop with RGB lighting");
        laptop.setSku("LAPTOP-001");
        laptop.addTag("Gaming");
        laptop.addTag("RGB");
        laptop.addTag("High Performance");

        Product phone = new Product();
        phone.setName("Smartphone");
        phone.setPrice(699.99);
        phone.setStockQuantity(50);
        phone.setCategory("Electronics");
        phone.addTag("Mobile");
        phone.addTag("5G");

        System.out.println("Laptop: " + laptop);
        System.out.println("Phone: " + phone);
        System.out.println("Laptop in stock: " + laptop.isInStock());
        System.out.println("Laptop total value: $" + String.format("%.2f", laptop.getTotalValue()));
    }

    private static void demonstrateEmployeePOJO() {
        System.out.println("\n--- Employee POJO Examples ---");

        // Create employees
        Employee manager = new Employee("Sarah", "Johnson", "sarah.johnson@company.com",
                                      "Engineering Manager", 95000);
        manager.setEmployeeId(1L);
        manager.setDepartment("Engineering");
        manager.setBirthDate(LocalDate.of(1985, 3, 15));

        Employee developer1 = new Employee("John", "Smith", "john.smith@company.com",
                                         "Senior Developer", 80000);
        developer1.setEmployeeId(2L);
        developer1.setDepartment("Engineering");

        Employee developer2 = new Employee("Alice", "Brown", "alice.brown@company.com",
                                         "Junior Developer", 60000);
        developer2.setEmployeeId(3L);
        developer2.setDepartment("Engineering");

        // Set up reporting structure
        manager.addDirectReport(developer1);
        manager.addDirectReport(developer2);

        // Create addresses
        Address managerAddress = new Address("123 Main St", "Seattle", "WA", "98101", "USA");
        manager.setAddress(managerAddress);

        System.out.println("Manager: " + manager);
        System.out.println("Manager's team size: " + manager.getTeamSize());
        System.out.println("Manager's years of service: " + manager.getYearsOfService());
        System.out.println("Manager's address: " + manager.getAddress());

        System.out.println("\nDeveloper 1: " + developer1);
        System.out.println("Developer 1's manager: " + developer1.getManager().getFullName());
    }

    private static void demonstrateUserBuilder() {
        System.out.println("\n--- User Builder Pattern Examples ---");

        // Using builder pattern for flexible object creation
        User user1 = new User.Builder()
                .username("johndoe")
                .email("john.doe@example.com")
                .firstName("John")
                .lastName("Doe")
                .build();

        User user2 = new User.Builder()
                .username("admin")
                .email("admin@company.com")
                .firstName("System")
                .lastName("Administrator")
                .active(true)
                .createdAt(LocalDateTime.now().minusMonths(6))
                .build();

        System.out.println("User 1: " + user1);
        System.out.println("User 1 display name: " + user1.getDisplayName());

        System.out.println("User 2: " + user2);

        // Demonstrate business methods
        user1.recordLogin();
        user1.updateProfile("Jonathan", "Doe");
        System.out.println("User 1 after updates: " + user1);

        // Try invalid user creation
        try {
            User invalidUser = new User.Builder()
                    .username("")  // Invalid username
                    .email("test@example.com")
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }

    private static void demonstratePOJOCollections() {
        System.out.println("\n--- POJO Collections Examples ---");

        // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 999.99, 10, "Electronics"));
        products.add(new Product("Mouse", 29.99, 100, "Electronics"));
        products.add(new Product("Keyboard", 79.99, 50, "Electronics"));
        products.add(new Product("Monitor", 299.99, 25, "Electronics"));

        // Process products
        System.out.println("Product Inventory:");
        double totalInventoryValue = 0;
        for (Product product : products) {
            System.out.println("  " + product.getName() + ": " +
                             product.getStockQuantity() + " units @ $" +
                             String.format("%.2f", product.getPrice()));
            totalInventoryValue += product.getTotalValue();
        }
        System.out.println("Total inventory value: $" + String.format("%.2f", totalInventoryValue));

        // Filter low stock products
        System.out.println("\nLow stock products (≤ 20 units):");
        for (Product product : products) {
            if (product.isLowStock(20)) {
                System.out.println("  " + product.getName() + ": " + product.getStockQuantity() + " units");
            }
        }
    }
}
```

## JavaBeans

### Introduction to JavaBeans

JavaBeans are a specific type of POJO that follow the JavaBean specification. This specification defines a set of conventions for creating reusable software components in Java. JavaBeans are widely used in enterprise frameworks, GUI development, and serialization scenarios.

### JavaBean Specification Requirements

```java
import java.io.Serializable;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class JavaBeanRequirements {
    public static void main(String[] args) {
        System.out.println("=== JavaBean Specification Requirements ===");
        System.out.println("1. Must implement Serializable interface");
        System.out.println("2. Must have a public no-argument constructor");
        System.out.println("3. Properties must be private with public getters/setters");
        System.out.println("4. Getter methods must start with 'get' (or 'is' for boolean)");
        System.out.println("5. Setter methods must start with 'set'");
        System.out.println("6. Must follow JavaBean naming conventions");
        System.out.println("7. Should support property change events (optional but recommended)");

        // Demonstrate a compliant JavaBean
        PersonBean person = new PersonBean();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(30);
        person.setActive(true);

        System.out.println("\n=== JavaBean Example ===");
        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Active: " + person.isActive());
    }
}

// Compliant JavaBean example
class PersonBean implements Serializable {
    private static final long serialVersionUID = 1L;  // Required for Serializable

    // Private properties
    private String firstName;
    private String lastName;
    private int age;
    private boolean active;

    // Required: Public no-argument constructor
    public PersonBean() {
        // Default values can be set here
        this.active = true;
    }

    // Getter methods (must start with 'get' or 'is' for boolean)
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public boolean isActive() { return active; }  // Note: 'is' prefix for boolean

    // Setter methods (must start with 'set')
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }
    public void setActive(boolean active) { this.active = active; }
}
```

### JavaBean Naming Conventions

```java
import java.io.Serializable;
import java.time.LocalDate;

public class JavaBeanNamingDemo {
    public static void main(String[] args) {
        System.out.println("=== JavaBean Naming Convention Examples ===");

        NamingConventionBean bean = new NamingConventionBean();

        // Setting properties using setter methods
        bean.setName("Product Name");
        bean.setPrice(99.99);
        bean.setAvailabile(true);  // Note: boolean property
        bean.setItemCount(50);
        bean.setBirthDate(LocalDate.of(1990, 5, 15));
        bean.setXmlData("<xml>data</xml>");  // Special case: XML
        bean.setId(12345L);

        // Reading properties using getter methods
        System.out.println("Name: " + bean.getName());
        System.out.println("Price: $" + bean.getPrice());
        System.out.println("Available: " + bean.isAvailabile());  // 'is' for boolean
        System.out.println("Item Count: " + bean.getItemCount());
        System.out.println("Birth Date: " + bean.getBirthDate());
        System.out.println("XML Data: " + bean.getXmlData());
        System.out.println("ID: " + bean.getId());

        // Demonstrate property name derivation
        System.out.println("\n=== Property Name Derivation ===");
        System.out.println("Method: getName() → Property: name");
        System.out.println("Method: setPrice(double) → Property: price");
        System.out.println("Method: isAvailabile() → Property: availabile");
        System.out.println("Method: getItemCount() → Property: itemCount");
        System.out.println("Method: getXmlData() → Property: xmlData (special case)");
    }
}

class NamingConventionBean implements Serializable {
    private static final long serialVersionUID = 1L;

    // Properties with different naming scenarios
    private String name;          // Simple property
    private double price;         // Numeric property
    private boolean availabile;   // Boolean property (uses 'is' getter)
    private int itemCount;        // CamelCase property
    private LocalDate birthDate;  // Date property
    private String xmlData;       // Acronym property
    private Long id;              // Wrapper type property

    // No-argument constructor
    public NamingConventionBean() {}

    // Standard getters and setters following JavaBean conventions

    // String property
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // Numeric property
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Boolean property - uses 'is' prefix for getter
    public boolean isAvailabile() { return availabile; }
    public void setAvailabile(boolean availabile) { this.availabile = availabile; }

    // CamelCase property
    public int getItemCount() { return itemCount; }
    public void setItemCount(int itemCount) { this.itemCount = itemCount; }

    // Date property
    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    // Acronym property - first letter lowercase, rest uppercase
    public String getXmlData() { return xmlData; }
    public void setXmlData(String xmlData) { this.xmlData = xmlData; }

    // Wrapper type property
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}
```

### JavaBeans with Property Change Support

```java
import java.io.Serializable;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeDemo {
    public static void main(String[] args) {
        System.out.println("=== JavaBean Property Change Events ===");

        AdvancedPersonBean person = new AdvancedPersonBean();

        // Add property change listener
        person.addPropertyChangeListener(evt -> {
            System.out.println("Property changed: " + evt.getPropertyName() +
                             " from '" + evt.getOldValue() + "' to '" + evt.getNewValue() + "'");
        });

        // Add specific property listener
        person.addPropertyChangeListener("salary", evt -> {
            System.out.println("Salary change detected: $" + evt.getOldValue() + " → $" + evt.getNewValue());
        });

        // Make changes to properties
        System.out.println("Setting initial values...");
        person.setName("John Doe");
        person.setAge(30);
        person.setSalary(50000.0);

        System.out.println("\nUpdating values...");
        person.setName("John Smith");
        person.setAge(31);
        person.setSalary(55000.0);
    }
}

class AdvancedPersonBean implements Serializable {
    private static final long serialVersionUID = 1L;

    // Property change support for event notifications
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    // Properties
    private String name;
    private int age;
    private double salary;

    // No-argument constructor
    public AdvancedPersonBean() {}

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

    // Setters with property change support
    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        pcs.firePropertyChange("name", oldName, name);
    }

    public void setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        pcs.firePropertyChange("age", oldAge, age);
    }

    public void setSalary(double salary) {
        double oldSalary = this.salary;
        this.salary = salary;
        pcs.firePropertyChange("salary", oldSalary, salary);
    }

    // Property change listener methods
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(propertyName, listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(propertyName, listener);
    }
}
```

### JavaBeans in Framework Integration

```java
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

// JavaBean for web forms and data binding
public class CustomerBean implements Serializable {
    private static final long serialVersionUID = 1L;

    // Properties commonly used in web applications
    private Long customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate registrationDate;
    private boolean active;
    private String customerType;
    private double creditLimit;

    // Required no-argument constructor
    public CustomerBean() {
        this.registrationDate = LocalDate.now();
        this.active = true;
        this.customerType = "STANDARD";
        this.creditLimit = 1000.0;
    }

    // Full constructor for convenience (not required by JavaBean spec)
    public CustomerBean(String firstName, String lastName, String email) {
        this();  // Call no-arg constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // All getters and setters following JavaBean conventions
    public Long getCustomerId() { return customerId; }
    public void setCustomerId(Long customerId) { this.customerId = customerId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public LocalDate getRegistrationDate() { return registrationDate; }
    public void setRegistrationDate(LocalDate registrationDate) { this.registrationDate = registrationDate; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    public String getCustomerType() { return customerType; }
    public void setCustomerType(String customerType) { this.customerType = customerType; }

    public double getCreditLimit() { return creditLimit; }
    public void setCreditLimit(double creditLimit) { this.creditLimit = creditLimit; }

    // Computed properties (read-only, no setters)
    public String getFullName() {
        return (firstName != null ? firstName : "") + " " + (lastName != null ? lastName : "");
    }

    public String getDisplayName() {
        return getFullName() + " (" + email + ")";
    }

    // Business logic methods
    public boolean canPurchase(double amount) {
        return active && amount <= creditLimit;
    }

    public void increaseCreditLimit(double increase) {
        if (increase > 0) {
            this.creditLimit += increase;
        }
    }

    // Override Object methods for proper behavior
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CustomerBean that = (CustomerBean) obj;
        return Objects.equals(customerId, that.customerId) ||
               Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, email);
    }

    @Override
    public String toString() {
        return "CustomerBean{" +
                "customerId=" + customerId +
                ", fullName='" + getFullName() + '\'' +
                ", email='" + email + '\'' +
                ", customerType='" + customerType + '\'' +
                ", active=" + active +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
```

### JavaBean Validation and Best Practices

```java
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JavaBeanValidationDemo {
    public static void main(String[] args) {
        System.out.println("=== JavaBean Validation Examples ===");

        ValidatedProductBean product = new ValidatedProductBean();

        // Test validation
        try {
            product.setName("Laptop Computer");
            product.setPrice(999.99);
            product.setCategory("Electronics");
            product.setSku("LAPTOP-001");
            product.setManufactureDate(LocalDate.now().minusMonths(1));

            System.out.println("Valid product created: " + product);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        }

        // Test invalid values
        System.out.println("\n=== Testing Invalid Values ===");

        try {
            product.setPrice(-100.0);  // Invalid negative price
        } catch (IllegalArgumentException e) {
            System.out.println("Price validation: " + e.getMessage());
        }

        try {
            product.setName("");  // Invalid empty name
        } catch (IllegalArgumentException e) {
            System.out.println("Name validation: " + e.getMessage());
        }

        try {
            product.setManufactureDate(LocalDate.now().plusDays(1));  // Future date
        } catch (IllegalArgumentException e) {
            System.out.println("Date validation: " + e.getMessage());
        }
    }
}

// JavaBean with comprehensive validation
class ValidatedProductBean implements Serializable {
    private static final long serialVersionUID = 1L;

    // Properties
    private String name;
    private double price;
    private String category;
    private String sku;
    private LocalDate manufactureDate;
    private boolean available;
    private List<String> tags;

    // No-argument constructor
    public ValidatedProductBean() {
        this.available = true;
        this.tags = new ArrayList<>();
    }

    // Validated getters and setters
    public String getName() { return name; }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (name.length() > 100) {
            throw new IllegalArgumentException("Name cannot exceed 100 characters");
        }
        this.name = name.trim();
    }

    public double getPrice() { return price; }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        if (price > 1_000_000) {
            throw new IllegalArgumentException("Price cannot exceed $1,000,000");
        }
        this.price = price;
    }

    public String getCategory() { return category; }

    public void setCategory(String category) {
        if (category == null || category.trim().isEmpty()) {
            throw new IllegalArgumentException("Category cannot be null or empty");
        }

        // Validate against allowed categories
        List<String> allowedCategories = List.of("Electronics", "Clothing", "Books", "Home", "Sports");
        if (!allowedCategories.contains(category)) {
            throw new IllegalArgumentException("Category must be one of: " + allowedCategories);
        }

        this.category = category;
    }

    public String getSku() { return sku; }

    public void setSku(String sku) {
        if (sku == null || sku.trim().isEmpty()) {
            throw new IllegalArgumentException("SKU cannot be null or empty");
        }

        // SKU format validation: LETTERS-NUMBERS
        if (!sku.matches("^[A-Z]+-\\d+$")) {
            throw new IllegalArgumentException("SKU must follow format: LETTERS-NUMBERS (e.g., LAPTOP-001)");
        }

        this.sku = sku.toUpperCase();
    }

    public LocalDate getManufactureDate() { return manufactureDate; }

    public void setManufactureDate(LocalDate manufactureDate) {
        if (manufactureDate == null) {
            throw new IllegalArgumentException("Manufacture date cannot be null");
        }

        if (manufactureDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Manufacture date cannot be in the future");
        }

        if (manufactureDate.isBefore(LocalDate.now().minusYears(50))) {
            throw new IllegalArgumentException("Manufacture date cannot be more than 50 years ago");
        }

        this.manufactureDate = manufactureDate;
    }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    public List<String> getTags() { return new ArrayList<>(tags); }  // Return defensive copy

    public void setTags(List<String> tags) {
        if (tags == null) {
            this.tags = new ArrayList<>();
        } else {
            // Validate and clean tags
            this.tags = new ArrayList<>();
            for (String tag : tags) {
                if (tag != null && !tag.trim().isEmpty()) {
                    this.tags.add(tag.trim().toLowerCase());
                }
            }
        }
    }

    // Business methods
    public void addTag(String tag) {
        if (tag != null && !tag.trim().isEmpty()) {
            String cleanTag = tag.trim().toLowerCase();
            if (!tags.contains(cleanTag)) {
                tags.add(cleanTag);
            }
        }
    }

    public void removeTag(String tag) {
        if (tag != null) {
            tags.remove(tag.trim().toLowerCase());
        }
    }

    public boolean hasTag(String tag) {
        return tag != null && tags.contains(tag.trim().toLowerCase());
    }

    // Computed properties
    public String getFormattedPrice() {
        return String.format("$%.2f", price);
    }

    public int getAgeInDays() {
        if (manufactureDate == null) return 0;
        return (int) java.time.temporal.ChronoUnit.DAYS.between(manufactureDate, LocalDate.now());
    }

    @Override
    public String toString() {
        return "ValidatedProductBean{" +
                "name='" + name + '\'' +
                ", price=" + getFormattedPrice() +
                ", category='" + category + '\'' +
                ", sku='" + sku + '\'' +
                ", available=" + available +
                ", ageInDays=" + getAgeInDays() +
                '}';
    }
}
```

### JavaBeans Usage in Real Applications

```java
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class JavaBeanApplicationDemo {
    public static void main(String[] args) {
        // Simulate web form processing
        simulateWebFormProcessing();

        // Simulate database mapping
        simulateDatabaseMapping();

        // Simulate serialization
        simulateSerialization();
    }

    private static void simulateWebFormProcessing() {
        System.out.println("=== Web Form Processing Simulation ===");

        // Simulate form data coming from HTTP request
        UserRegistrationBean registration = new UserRegistrationBean();

        // Set form fields (typically done by web framework)
        registration.setUsername("johndoe");
        registration.setEmail("john.doe@example.com");
        registration.setPassword("securepassword123");
        registration.setFirstName("John");
        registration.setLastName("Doe");
        registration.setAgreeToTerms(true);

        // Validate form (typical web application flow)
        if (registration.isValid()) {
            System.out.println("Registration successful: " + registration.getDisplayName());
            System.out.println("User created at: " + registration.getCreatedAt());
        } else {
            System.out.println("Registration failed: " + registration.getValidationErrors());
        }
    }

    private static void simulateDatabaseMapping() {
        System.out.println("\n=== Database Mapping Simulation ===");

        // JavaBeans are commonly used with ORM frameworks
        OrderBean order = new OrderBean();
        order.setOrderId(12345L);
        order.setCustomerEmail("customer@example.com");
        order.setTotalAmount(299.99);
        order.setStatus("PENDING");

        // Add order items
        OrderItemBean item1 = new OrderItemBean();
        item1.setProductName("Wireless Headphones");
        item1.setQuantity(1);
        item1.setUnitPrice(199.99);

        OrderItemBean item2 = new OrderItemBean();
        item2.setProductName("Phone Case");
        item2.setQuantity(2);
        item2.setUnitPrice(49.99);

        order.getItems().add(item1);
        order.getItems().add(item2);

        System.out.println("Order created: " + order);
        System.out.println("Order total: $" + order.calculateTotal());
    }

    private static void simulateSerialization() {
        System.out.println("\n=== Serialization Simulation ===");

        ConfigurationBean config = new ConfigurationBean();
        config.setApplicationName("MyApp");
        config.setVersion("1.0.0");
        config.setDebugMode(false);
        config.setMaxConnections(100);
        config.setDatabaseUrl("jdbc:mysql://localhost:3306/myapp");

        System.out.println("Configuration ready for serialization: " + config);
        System.out.println("Serializable: " + (config instanceof Serializable));
    }
}

// JavaBean for user registration forms
class UserRegistrationBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private boolean agreeToTerms;
    private LocalDateTime createdAt;
    private List<String> validationErrors;

    public UserRegistrationBean() {
        this.createdAt = LocalDateTime.now();
        this.validationErrors = new ArrayList<>();
    }

    // Standard getters and setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public boolean isAgreeToTerms() { return agreeToTerms; }
    public void setAgreeToTerms(boolean agreeToTerms) { this.agreeToTerms = agreeToTerms; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public List<String> getValidationErrors() { return new ArrayList<>(validationErrors); }

    // Business methods
    public String getDisplayName() {
        return firstName + " " + lastName + " (" + username + ")";
    }

    public boolean isValid() {
        validationErrors.clear();

        if (username == null || username.trim().length() < 3) {
            validationErrors.add("Username must be at least 3 characters");
        }

        if (email == null || !email.contains("@")) {
            validationErrors.add("Valid email address is required");
        }

        if (password == null || password.length() < 8) {
            validationErrors.add("Password must be at least 8 characters");
        }

        if (!agreeToTerms) {
            validationErrors.add("Must agree to terms and conditions");
        }

        return validationErrors.isEmpty();
    }
}

// JavaBean for order processing
class OrderBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long orderId;
    private String customerEmail;
    private double totalAmount;
    private String status;
    private LocalDateTime orderDate;
    private List<OrderItemBean> items;

    public OrderBean() {
        this.orderDate = LocalDateTime.now();
        this.items = new ArrayList<>();
        this.status = "DRAFT";
    }

    // Standard getters and setters
    public Long getOrderId() { return orderId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }

    public String getCustomerEmail() { return customerEmail; }
    public void setCustomerEmail(String customerEmail) { this.customerEmail = customerEmail; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDateTime orderDate) { this.orderDate = orderDate; }

    public List<OrderItemBean> getItems() { return items; }
    public void setItems(List<OrderItemBean> items) { this.items = items; }

    // Business methods
    public double calculateTotal() {
        return items.stream()
                   .mapToDouble(item -> item.getQuantity() * item.getUnitPrice())
                   .sum();
    }

    @Override
    public String toString() {
        return "OrderBean{orderId=" + orderId + ", customer='" + customerEmail +
               "', items=" + items.size() + ", status='" + status + "'}";
    }
}

class OrderItemBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String productName;
    private int quantity;
    private double unitPrice;

    public OrderItemBean() {}

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }

    public double getTotalPrice() {
        return quantity * unitPrice;
    }
}

// JavaBean for application configuration
class ConfigurationBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String applicationName;
    private String version;
    private boolean debugMode;
    private int maxConnections;
    private String databaseUrl;

    public ConfigurationBean() {
        this.debugMode = false;
        this.maxConnections = 10;
    }

    public String getApplicationName() { return applicationName; }
    public void setApplicationName(String applicationName) { this.applicationName = applicationName; }

    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }

    public boolean isDebugMode() { return debugMode; }
    public void setDebugMode(boolean debugMode) { this.debugMode = debugMode; }

    public int getMaxConnections() { return maxConnections; }
    public void setMaxConnections(int maxConnections) { this.maxConnections = maxConnections; }

    public String getDatabaseUrl() { return databaseUrl; }
    public void setDatabaseUrl(String databaseUrl) { this.databaseUrl = databaseUrl; }

    @Override
    public String toString() {
        return "ConfigurationBean{" +
                "applicationName='" + applicationName + '\'' +
                ", version='" + version + '\'' +
                ", debugMode=" + debugMode +
                ", maxConnections=" + maxConnections +
                '}';
    }
}
```

# Working with Strings

## What are Strings?

Strings in Java represent sequences of characters. They are one of the most commonly used data types and are essential for text processing, user interaction, and data manipulation.

### String Basics

```java
public class StringBasics {
    public static void main(String[] args) {
        // Different ways to create strings
        String str1 = "Hello World";           // String literal
        String str2 = new String("Hello");     // String object
        String str3 = new String();            // Empty string
        String str4 = "";                      // Empty string literal

        // String properties
        System.out.println("String: " + str1);
        System.out.println("Length: " + str1.length());
        System.out.println("Is empty: " + str1.isEmpty());
        System.out.println("Is blank: " + str1.isBlank()); // Java 11+

        // Character access
        System.out.println("First character: " + str1.charAt(0));
        System.out.println("Last character: " + str1.charAt(str1.length() - 1));
    }
}
```

### Common String Operations

```java
public class StringOperations {
    public static void main(String[] args) {
        String text = "Java Programming";

        // Case operations
        System.out.println("Original: " + text);
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // Substring operations
        System.out.println("Substring (0,4): " + text.substring(0, 4)); // "Java"
        System.out.println("Substring (5): " + text.substring(5));       // "Programming"

        // Search operations
        System.out.println("Index of 'a': " + text.indexOf('a'));        // 1
        System.out.println("Last index of 'a': " + text.lastIndexOf('a')); // 3
        System.out.println("Contains 'gram': " + text.contains("gram"));  // true
        System.out.println("Starts with 'Java': " + text.startsWith("Java")); // true
        System.out.println("Ends with 'ing': " + text.endsWith("ing"));   // true

        // Trimming and replacing
        String messy = "  Hello World  ";
        System.out.println("Trimmed: '" + messy.trim() + "'");
        System.out.println("Replace 'a' with '@': " + text.replace('a', '@'));
        System.out.println("Replace 'Java' with 'Python': " + text.replace("Java", "Python"));
    }
}
```

### String Concatenation

```java
public class StringConcatenation {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        int age = 30;

        // Method 1: Using + operator
        String message1 = "Hello, " + firstName + " " + lastName + "! You are " + age + " years old.";
        System.out.println("Method 1: " + message1);

        // Method 2: Using concat() method
        String message2 = "Hello, ".concat(firstName).concat(" ").concat(lastName);
        System.out.println("Method 2: " + message2);

        // Method 3: Using StringBuilder (efficient for multiple operations)
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ")
          .append(firstName)
          .append(" ")
          .append(lastName)
          .append("! You are ")
          .append(age)
          .append(" years old.");
        String message3 = sb.toString();
        System.out.println("Method 3: " + message3);

        // Method 4: Using String.format()
        String message4 = String.format("Hello, %s %s! You are %d years old.",
                                       firstName, lastName, age);
        System.out.println("Method 4: " + message4);

        // Method 5: Using printf-style formatting
        System.out.printf("Method 5: Hello, %s %s! You are %d years old.%n",
                         firstName, lastName, age);
    }
}
```

### Practical String Examples

```java
public class PracticalStringExamples {
    public static void main(String[] args) {
        // Email validation (basic)
        String email = "user@example.com";
        boolean isValidEmail = email.contains("@") && email.contains(".");
        System.out.println("Email valid: " + isValidEmail);

        // Parsing CSV data
        String csvLine = "John,Doe,30,Engineer";
        String[] parts = csvLine.split(",");
        System.out.println("Name: " + parts[0] + " " + parts[1]);
        System.out.println("Age: " + parts[2]);
        System.out.println("Job: " + parts[3]);

        // Creating initials
        String fullName = "John Michael Doe";
        String[] names = fullName.split(" ");
        StringBuilder initials = new StringBuilder();
        for (String name : names) {
            initials.append(name.charAt(0)).append(".");
        }
        System.out.println("Initials: " + initials.toString());

        // Word count
        String sentence = "This is a sample sentence for word counting";
        String[] words = sentence.split("\\s+"); // Split by whitespace
        System.out.println("Word count: " + words.length);

        // Palindrome check
        String word = "racecar";
        String reversed = new StringBuilder(word).reverse().toString();
        boolean isPalindrome = word.equals(reversed);
        System.out.println(word + " is palindrome: " + isPalindrome);
    }
}
```

# How Strings are Stored - String Pool

## Understanding the String Pool

The String Pool (String Constant Pool) is a special memory area in the JVM where string literals are stored. It's designed to optimize memory usage by reusing identical string objects.

### String Pool Mechanics

```java
public class StringPoolDemo {
    public static void main(String[] args) {
        // String literals go to the pool
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Hello";

        // All three references point to the same object in the pool
        System.out.println("str1 == str2: " + (str1 == str2)); // true
        System.out.println("str2 == str3: " + (str2 == str3)); // true
        System.out.println("str1 == str3: " + (str1 == str3)); // true

        // Memory addresses are the same
        System.out.println("str1 identity: " + System.identityHashCode(str1));
        System.out.println("str2 identity: " + System.identityHashCode(str2));
        System.out.println("str3 identity: " + System.identityHashCode(str3));

        // String objects created with 'new' bypass the pool initially
        String str4 = new String("Hello");
        System.out.println("str1 == str4: " + (str1 == str4)); // false
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // true

        System.out.println("str1 identity: " + System.identityHashCode(str1));
        System.out.println("str4 identity: " + System.identityHashCode(str4));
    }
}
```

### String Interning

```java
public class StringInterning {
    public static void main(String[] args) {
        // Creating strings outside the pool
        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println("Before interning:");
        System.out.println("str1 == str2: " + (str1 == str2)); // false
        System.out.println("str1 identity: " + System.identityHashCode(str1));
        System.out.println("str2 identity: " + System.identityHashCode(str2));

        // Manually interning strings
        String str3 = str1.intern(); // Returns reference from pool
        String str4 = str2.intern(); // Returns same reference from pool

        System.out.println("\nAfter interning:");
        System.out.println("str3 == str4: " + (str3 == str4)); // true
        System.out.println("str3 identity: " + System.identityHashCode(str3));
        System.out.println("str4 identity: " + System.identityHashCode(str4));

        // Comparing with literal
        String literal = "Java";
        System.out.println("str3 == literal: " + (str3 == literal)); // true

        // Demonstrating pool behavior with concatenation
        String a = "Hello";
        String b = "World";
        String c = "HelloWorld";
        String d = a + b; // Runtime concatenation - not pooled
        String e = "Hello" + "World"; // Compile-time concatenation - pooled

        System.out.println("\nConcatenation examples:");
        System.out.println("c == d: " + (c == d)); // false
        System.out.println("c == e: " + (c == e)); // true
        System.out.println("d.intern() == c: " + (d.intern() == c)); // true
    }
}
```

### Memory Implications

```java
public class StringMemoryDemo {
    public static void main(String[] args) {
        // Memory efficient - only one "Hello" object in pool
        String[] literals = new String[1000];
        for (int i = 0; i < literals.length; i++) {
            literals[i] = "Hello"; // All reference same object
        }

        // Memory inefficient - 1000 different "Hello" objects
        String[] objects = new String[1000];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = new String("Hello"); // Each creates new object
        }

        // Verify they're different
        System.out.println("literals[0] == literals[999]: " +
                          (literals[0] == literals[999])); // true
        System.out.println("objects[0] == objects[999]: " +
                          (objects[0] == objects[999])); // false

        // But content is the same
        System.out.println("objects[0].equals(objects[999]): " +
                          objects[0].equals(objects[999])); // true
    }
}
```

### Pool Location and Garbage Collection

```java
public class StringPoolGC {
    public static void main(String[] args) {
        // Before Java 7: String pool was in PermGen (limited size)
        // Java 7+: String pool moved to heap (can be garbage collected)

        System.out.println("String pool demonstration:");

        // These go to the pool automatically
        String s1 = "PooledString1";
        String s2 = "PooledString2";

        // This creates heap object, then can be interned
        String s3 = new String("HeapString").intern();

        // Pool statistics (JVM specific, may not work on all JVMs)
        try {
            // This is implementation specific
            long poolSize = getStringPoolSize(); // Hypothetical method
            System.out.println("Estimated pool size: " + poolSize);
        } catch (Exception e) {
            System.out.println("Pool size information not available");
        }

        // Demonstration of pool behavior
        demonstratePoolBehavior();
    }

    private static void demonstratePoolBehavior() {
        String base = "Dynamic";
        String suffix = "String";

        // Runtime concatenation - not automatically pooled
        String dynamic = base + suffix;

        // Literal - automatically pooled
        String literal = "DynamicString";

        System.out.println("dynamic == literal: " + (dynamic == literal)); // false
        System.out.println("dynamic.intern() == literal: " +
                          (dynamic.intern() == literal)); // true
    }

    private static long getStringPoolSize() {
        // This is a placeholder - actual implementation would be JVM specific
        // You could use JVM flags like -XX:+PrintStringTableStatistics
        return -1; // Not implemented
    }
}
```

# Strings are Immutable

## Understanding String Immutability

In Java, strings are immutable, meaning once a String object is created, its content cannot be changed. Any operation that appears to modify a string actually creates a new string object.

### Demonstrating Immutability

```java
public class StringImmutability {
    public static void main(String[] args) {
        String original = "Hello";
        String reference = original;

        System.out.println("Original string: " + original);
        System.out.println("Reference: " + reference);
        System.out.println("Same object? " + (original == reference)); // true
        System.out.println("Identity hash: " + System.identityHashCode(original));

        // "Modifying" the string - actually creates new object
        original = original + " World";

        System.out.println("\nAfter 'modification':");
        System.out.println("Original: " + original);
        System.out.println("Reference: " + reference); // Still "Hello"
        System.out.println("Same object? " + (original == reference)); // false
        System.out.println("Original identity: " + System.identityHashCode(original));
        System.out.println("Reference identity: " + System.identityHashCode(reference));
    }
}
```

### Why Strings are Immutable

```java
public class WhyImmutable {
    public static void main(String[] args) {
        // 1. Security reasons
        String fileName = "/etc/passwd";
        processFile(fileName);
        // fileName cannot be changed by the method
        System.out.println("File name after method call: " + fileName);

        // 2. Thread safety
        String sharedString = "Thread Safe";
        // Multiple threads can safely read this without synchronization

        // 3. Hashcode caching
        String key = "CacheKey";
        int hash1 = key.hashCode();
        // Hashcode is cached and won't change
        int hash2 = key.hashCode();
        System.out.println("Hash codes are same: " + (hash1 == hash2));

        // 4. String pool efficiency
        String s1 = "Pooled";
        String s2 = "Pooled";
        // Safe to share the same object because it can't be modified
        System.out.println("Sharing same object: " + (s1 == s2));
    }

    private static void processFile(String fileName) {
        // Even if we try to "modify" fileName here,
        // the original reference remains unchanged
        fileName = fileName + ".backup";
        System.out.println("Inside method: " + fileName);
    }
}
```

### Performance Implications

```java
public class ImmutabilityPerformance {
    public static void main(String[] args) {
        // Inefficient string concatenation
        demonstrateInefficient();

        // Efficient alternatives
        demonstrateEfficient();
    }

    private static void demonstrateInefficient() {
        long startTime = System.nanoTime();

        String result = "";
        for (int i = 0; i < 1000; i++) {
            result += "a"; // Creates new string object each time
        }

        long endTime = System.nanoTime();
        System.out.println("Inefficient concatenation took: " +
                          (endTime - startTime) / 1_000_000 + " ms");
        System.out.println("Result length: " + result.length());
    }

    private static void demonstrateEfficient() {
        long startTime = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("a"); // Modifies internal buffer
        }
        String result = sb.toString();

        long endTime = System.nanoTime();
        System.out.println("Efficient StringBuilder took: " +
                          (endTime - startTime) / 1_000_000 + " ms");
        System.out.println("Result length: " + result.length());
    }
}
```

### Working with Immutable Strings

```java
public class WorkingWithImmutableStrings {
    public static void main(String[] args) {
        // Pattern 1: Method chaining with reassignment
        String text = "  Hello World  ";
        text = text.trim().toLowerCase().replace(" ", "_");
        System.out.println("Processed text: " + text);

        // Pattern 2: Creating modified versions
        String original = "Java Programming";
        String uppercase = original.toUpperCase();
        String replaced = original.replace("Java", "Python");

        System.out.println("Original: " + original);
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Replaced: " + replaced);

        // Pattern 3: Building strings efficiently
        String[] words = {"Java", "is", "awesome"};
        String sentence = buildSentence(words);
        System.out.println("Built sentence: " + sentence);

        // Pattern 4: Conditional string building
        String message = createMessage("John", true, 5);
        System.out.println("Message: " + message);
    }

    private static String buildSentence(String[] words) {
        if (words.length == 0) return "";
        if (words.length == 1) return words[0];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private static String createMessage(String name, boolean isVip, int itemCount) {
        StringBuilder message = new StringBuilder();

        message.append("Hello, ");
        if (isVip) {
            message.append("VIP ");
        }
        message.append(name);
        message.append("! You have ");
        message.append(itemCount);
        message.append(" item");
        if (itemCount != 1) {
            message.append("s");
        }
        message.append(" in your cart.");

        return message.toString();
    }
}
```

### StringBuilder vs StringBuffer

```java
public class StringBuilderVsBuffer {
    public static void main(String[] args) {
        // StringBuilder - Not thread-safe, faster
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println("StringBuilder result: " + sb.toString());

        // StringBuffer - Thread-safe, slower due to synchronization
        StringBuffer sbf = new StringBuffer();
        sbf.append("Hello");
        sbf.append(" ");
        sbf.append("World");
        System.out.println("StringBuffer result: " + sbf.toString());

        // Performance comparison
        comparePerformance();
    }

    private static void comparePerformance() {
        int iterations = 10000;

        // StringBuilder performance
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("test");
        }
        String sbResult = sb.toString();
        long sbTime = System.nanoTime() - start;

        // StringBuffer performance
        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append("test");
        }
        String sbfResult = sbf.toString();
        long sbfTime = System.nanoTime() - start;

        System.out.println("StringBuilder time: " + sbTime / 1_000_000 + " ms");
        System.out.println("StringBuffer time: " + sbfTime / 1_000_000 + " ms");
        System.out.println("Results equal: " + sbResult.equals(sbfResult));
    }
}
```

# String Literal vs String Object

## Understanding the Difference

String literals and String objects behave differently in terms of memory allocation and object creation.

### Basic Differences

```java
public class StringLiteralVsObject {
    public static void main(String[] args) {
        // String literals - stored in string pool
        String literal1 = "Hello";
        String literal2 = "Hello";

        // String objects - stored in heap
        String object1 = new String("Hello");
        String object2 = new String("Hello");

        // Reference equality (==) checks memory address
        System.out.println("Literals:");
        System.out.println("literal1 == literal2: " + (literal1 == literal2)); // true

        System.out.println("\nObjects:");
        System.out.println("object1 == object2: " + (object1 == object2)); // false

        System.out.println("\nLiteral vs Object:");
        System.out.println("literal1 == object1: " + (literal1 == object1)); // false

        // Content equality (.equals()) checks actual content
        System.out.println("\nContent equality:");
        System.out.println("literal1.equals(literal2): " + literal1.equals(literal2)); // true
        System.out.println("object1.equals(object2): " + object1.equals(object2)); // true
        System.out.println("literal1.equals(object1): " + literal1.equals(object1)); // true

        // Memory addresses
        System.out.println("\nMemory addresses:");
        System.out.println("literal1: " + System.identityHashCode(literal1));
        System.out.println("literal2: " + System.identityHashCode(literal2));
        System.out.println("object1: " + System.identityHashCode(object1));
        System.out.println("object2: " + System.identityHashCode(object2));
    }
}
```

### Memory Allocation Differences

```java
public class MemoryAllocation {
    public static void main(String[] args) {
        // Scenario 1: Only literals
        String s1 = "Java";     // Creates one object in pool
        String s2 = "Java";     // Reuses existing object
        String s3 = "Java";     // Reuses existing object
        // Total objects created: 1

        System.out.println("All literals point to same object: " +
                          (s1 == s2 && s2 == s3)); // true

        // Scenario 2: Mix of literals and objects
        String s4 = "Python";           // Creates object in pool
        String s5 = new String("Python"); // Creates object in heap
        String s6 = new String("Python"); // Creates another object in heap
        // Total objects created: 3 (1 in pool, 2 in heap)

        System.out.println("Literal vs objects: " + (s4 == s5)); // false
        System.out.println("Object vs object: " + (s5 == s6)); // false

        // Scenario 3: Interning objects
        String s7 = s5.intern(); // Returns reference to pool object
        System.out.println("Literal vs interned: " + (s4 == s7)); // true

        // Memory usage demonstration
        demonstrateMemoryUsage();
    }

    private static void demonstrateMemoryUsage() {
        System.out.println("\nMemory usage demonstration:");

        // Using literals - memory efficient
        String[] literals = new String[1000];
        for (int i = 0; i < literals.length; i++) {
            literals[i] = "Shared"; // All reference same object
        }

        // Using new String() - memory wasteful
        String[] objects = new String[1000];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = new String("Individual"); // Each creates new object
        }

        System.out.println("Literals share memory: " +
                          (literals[0] == literals[999])); // true
        System.out.println("Objects don't share: " +
                          (objects[0] == objects[999])); // false
    }
}
```

### When to Use Each

```java
public class WhenToUseEach {
    public static void main(String[] args) {
        // Use string literals for:

        // 1. Constants and known values
        final String API_VERSION = "v1.0";
        final String ERROR_MESSAGE = "Invalid input";

        // 2. Simple assignments
        String greeting = "Hello";
        String name = "World";

        // 3. Comparisons with known values
        String userInput = getUserInput();
        if ("exit".equals(userInput)) {
            System.out.println("Goodbye!");
        }

        // Use new String() for:

        // 1. When you specifically need a new object
        String original = "data";
        String copy = new String(original); // Deliberate copy

        // 2. When working with character arrays
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String fromChars = new String(chars);

        // 3. When creating from bytes
        byte[] bytes = {72, 101, 108, 108, 111}; // "Hello" in ASCII
        String fromBytes = new String(bytes);

        System.out.println("From chars: " + fromChars);
        System.out.println("From bytes: " + fromBytes);

        // Common mistake to avoid
        avoidCommonMistakes();
    }

    private static String getUserInput() {
        // Simulated user input
        return "exit";
    }

    private static void avoidCommonMistakes() {
        // ❌ Unnecessary object creation
        String inefficient = new String("Hello"); // Don't do this

        // ✅ Use literal instead
        String efficient = "Hello";

        // ❌ Unnecessary interning
        String s1 = new String("test").intern(); // Don't do this

        // ✅ Use literal directly
        String s2 = "test";

        System.out.println("Both are equivalent: " + (s1 == s2)); // true

        // Performance impact
        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            String waste = new String("waste"); // Creates 100,000 objects
        }
        long inefficientTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            String reuse = "reuse"; // Reuses same object
        }
        long efficientTime = System.nanoTime() - start;

        System.out.println("Inefficient approach: " + inefficientTime / 1_000_000 + " ms");
        System.out.println("Efficient approach: " + efficientTime / 1_000_000 + " ms");
    }
}
```

### Practical Examples

```java
public class PracticalExamples {
    // Configuration constants - use literals
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String DEFAULT_ENCODING = "UTF-8";

    public static void main(String[] args) {
        // Example 1: Processing user input
        String[] userInputs = {"hello", "HELLO", "Hello"};
        String targetWord = "hello"; // Literal for comparison

        for (String input : userInputs) {
            if (targetWord.equals(input.toLowerCase())) {
                System.out.println("Match found: " + input);
            }
        }

        // Example 2: Building configuration
        String config = buildConfiguration("production", 8080, true);
        System.out.println("Config: " + config);

        // Example 3: Password handling (security consideration)
        handlePassword();
    }

    private static String buildConfiguration(String environment, int port, boolean sslEnabled) {
        // Use StringBuilder for complex string building
        StringBuilder config = new StringBuilder();
        config.append("Environment: ").append(environment).append("\n");
        config.append("Port: ").append(port).append("\n");
        config.append("SSL: ").append(sslEnabled ? "enabled" : "disabled");

        return config.toString();
    }

    private static void handlePassword() {
        // For security, sometimes you want separate objects
        // (though char[] is actually preferred for passwords)
        String password1 = new String("secret123");
        String password2 = new String("secret123");

        // These are different objects (good for security)
        System.out.println("Password objects are different: " + (password1 != password2));

        // But content is same
        System.out.println("Password content is same: " + password1.equals(password2));

        // Note: In real applications, use char[] for passwords
        // because strings are immutable and stay in memory longer
    }
}
```

# Comparing Strings with ==

## Understanding Reference Equality

The `==` operator in Java compares object references (memory addresses), not the actual content of strings. This can lead to unexpected results if not properly understood.

### Basic == Behavior

```java
public class StringReferenceComparison {
    public static void main(String[] args) {
        // String literals - same reference
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println("str1 == str2: " + (str1 == str2)); // true

        // String objects - different references
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println("str3 == str4: " + (str3 == str4)); // false

        // Literal vs object - different references
        System.out.println("str1 == str3: " + (str1 == str3)); // false

        // All have same content
        System.out.println("Content comparison:");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str3.equals(str4): " + str3.equals(str4)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true

        // Memory addresses
        System.out.println("\nMemory addresses:");
        System.out.println("str1: " + System.identityHashCode(str1));
        System.out.println("str2: " + System.identityHashCode(str2));
        System.out.println("str3: " + System.identityHashCode(str3));
        System.out.println("str4: " + System.identityHashCode(str4));
    }
}
```

### Common Pitfalls with ==

```java
public class CommonPitfalls {
    public static void main(String[] args) {
        // Pitfall 1: Comparing user input
        String userInput = new String("yes"); // Simulating user input

        if (userInput == "yes") { // ❌ Wrong!
            System.out.println("This won't print");
        }

        if (userInput.equals("yes")) { // ✅ Correct
            System.out.println("This will print");
        }

        // Pitfall 2: String concatenation at runtime
        String part1 = "Hel";
        String part2 = "lo";
        String combined = part1 + part2; // Runtime concatenation
        String literal = "Hello";

        System.out.println("combined == literal: " + (combined == literal)); // false
        System.out.println("combined.equals(literal): " + combined.equals(literal)); // true

        // Pitfall 3: Method return values
        String methodResult = getString();
        if (methodResult == "test") { // ❌ Dangerous!
            System.out.println("This might not work as expected");
        }

        if ("test".equals(methodResult)) { // ✅ Safe approach
            System.out.println("This is the correct way");
        }

        // Pitfall 4: Null safety
        String nullString = null;
        // if (nullString == "test") // This is false, but...
        // if (nullString.equals("test")) // This throws NullPointerException!

        if ("test".equals(nullString)) { // ✅ Null-safe
            System.out.println("This won't throw NPE");
        }
    }

    private static String getString() {
        return new String("test"); // Returns new object
    }
}
```

### When == Actually Works

```java
public class WhenEqualsWorks {
    public static void main(String[] args) {
        // Case 1: Compile-time string concatenation
        String s1 = "Hello" + "World"; // Compile-time concatenation
        String s2 = "HelloWorld";      // Literal
        System.out.println("Compile-time concatenation: " + (s1 == s2)); // true

        // Case 2: Final variables
        final String PART1 = "Hello";
        final String PART2 = "World";
        String s3 = PART1 + PART2; // Treated as compile-time constant
        System.out.println("Final variable concatenation: " + (s3 == s2)); // true

        // Case 3: String interning
        String s4 = new String("HelloWorld").intern();
        System.out.println("Interned string: " + (s4 == s2)); // true

        // Case 4: Same string literal across methods
        String methodString = getStringLiteral();
        String localString = "SharedLiteral";
        System.out.println("Cross-method literal: " + (methodString == localString)); // true

        // Counter-example: Runtime concatenation
        String part1 = getValue("Hello");
        String part2 = getValue("World");
        String runtime = part1 + part2;
        System.out.println("Runtime concatenation: " + (runtime == s2)); // false
    }

    private static String getStringLiteral() {
        return "SharedLiteral"; // Same literal as in main
    }

    private static String getValue(String value) {
        return value; // Returns parameter, breaking compile-time optimization
    }
}
```

### Practical Implications

```java
public class PracticalImplications {
    public static void main(String[] args) {
        // Demonstration of why == is unreliable for strings
        demonstrateUserInput();
        demonstrateConfigurationComparison();
        demonstrateCollectionBehavior();
    }

    private static void demonstrateUserInput() {
        // Simulating various ways user input might be received
        String[] inputs = {
            "test",                    // Direct literal
            new String("test"),        // New object
            "te" + "st",              // Compile-time concat (interned)
            getString() + "",          // Runtime concat
            "test".substring(0, 4),    // Method result
            "  test  ".trim()          // Processed input
        };

        System.out.println("Comparing user inputs with ==:");
        for (int i = 0; i < inputs.length; i++) {
            for (int j = i + 1; j < inputs.length; j++) {
                System.out.printf("inputs[%d] == inputs[%d]: %s%n",
                                i, j, inputs[i] == inputs[j]);
            }
        }

        System.out.println("\nAll have same content:");
        for (String input : inputs) {
            System.out.println("'" + input + "'.equals('test'): " +
                             input.equals("test"));
        }
    }

    private static void demonstrateConfigurationComparison() {
        // Configuration values might come from different sources
        String configFromFile = new String("production");    // Simulating file read
        String configFromEnv = System.getProperty("env", "production"); // System property
        String expectedConfig = "production";                // Literal

        System.out.println("\nConfiguration comparison:");
        System.out.println("configFromFile == expectedConfig: " +
                          (configFromFile == expectedConfig)); // false
        System.out.println("configFromEnv == expectedConfig: " +
                          (configFromEnv == expectedConfig)); // might be false

        // Correct way to compare
        boolean isProduction = "production".equals(configFromFile) ||
                              "production".equals(configFromEnv);
        System.out.println("Is production environment: " + isProduction);
    }

    private static void demonstrateCollectionBehavior() {
        // Collections and == behavior
        java.util.List<String> list = java.util.Arrays.asList("item1", "item2", "item3");

        String searchItem = new String("item2");

        // Using == in stream operations (wrong)
        boolean foundWithEquals = list.stream().anyMatch(item -> item == searchItem);
        System.out.println("\nFound with ==: " + foundWithEquals); // false

        // Using equals in stream operations (correct)
        boolean foundWithEqualsMethod = list.stream().anyMatch(item -> item.equals(searchItem));
        System.out.println("Found with equals(): " + foundWithEqualsMethod); // true

        // Better: use equals with literal first (null-safe)
        boolean foundSafely = list.stream().anyMatch("item2"::equals);
        System.out.println("Found safely: " + foundSafely); // true
    }

    private static String getString() {
        return "te";
    }
}
```

### Best Practices

```java
public class BestPractices {
    public static void main(String[] args) {
        String userInput = getUserInput();

        // ❌ Don't use == for string comparison
        if (userInput == "admin") {
            System.out.println("This is unreliable");
        }

        // ✅ Use equals() method
        if ("admin".equals(userInput)) {
            System.out.println("This is reliable and null-safe");
        }

        // ✅ Alternative: use equals() on variable (but handle null)
        if (userInput != null && userInput.equals("admin")) {
            System.out.println("This works but requires null check");
        }

        // ✅ For ignore case comparison
        if ("ADMIN".equalsIgnoreCase(userInput)) {
            System.out.println("Case-insensitive comparison");
        }

        // ✅ For multiple options
        if (isValidCommand(userInput)) {
            System.out.println("Valid command entered");
        }

        // When to use ==
        demonstrateValidUseOfEquals();
    }

    private static String getUserInput() {
        // Simulating user input that creates new String object
        return new String("admin");
    }

    private static boolean isValidCommand(String command) {
        // Null-safe way to check multiple options
        return "start".equals(command) ||
               "stop".equals(command) ||
               "restart".equals(command);
    }

    private static void demonstrateValidUseOfEquals() {
        // Valid use of == : checking for same object reference
        String cached = getCachedString();
        String same = getCachedString();

        if (cached == same) {
            System.out.println("Same cached object - optimization working");
        }

        // Valid use of == : checking for specific object identity
        String sentinel = "SENTINEL_VALUE";
        if (processString() == sentinel) {
            System.out.println("Returned sentinel object");
        }
    }

    private static String getCachedString() {
        // In real scenario, this might return cached objects
        return "cached";
    }

    private static String processString() {
        // Might return specific sentinel object for special cases
        return "SENTINEL_VALUE";
    }
}
```

# Comparing Strings with .equals()

## Understanding Content Equality

The `.equals()` method compares the actual content of strings character by character, making it the correct way to compare strings in most scenarios.

### Basic .equals() Usage

```java
public class StringEqualsBasics {
    public static void main(String[] args) {
        // Basic equals usage
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = "hello";

        System.out.println("Basic equals() comparisons:");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // false (case sensitive)

        // Case-insensitive comparison
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // true

        // Null safety demonstration
        String nullString = null;
        String nonNullString = "test";

        // Safe way (literal first)
        System.out.println("\"test\".equals(nullString): " + "test".equals(nullString)); // false

        // Unsafe way (might throw NullPointerException)
        try {
            System.out.println("nullString.equals(\"test\"): " + nullString.equals("test"));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }

        // Using Objects.equals() for null safety
        System.out.println("Objects.equals(nullString, \"test\"): " +
                          java.util.Objects.equals(nullString, "test")); // false
        System.out.println("Objects.equals(nullString, null): " +
                          java.util.Objects.equals(nullString, null)); // true
    }
}
```

### Advanced equals() Usage

```java
public class AdvancedStringEquals {
    public static void main(String[] args) {
        // Working with different string sources
        String literal = "programming";
        String fromArray = new String(new char[]{'p','r','o','g','r','a','m','m','i','n','g'});
        String fromBytes = new String(new byte[]{112,114,111,103,114,97,109,109,105,110,103});
        String concatenated = "program" + "ming";
        String built = new StringBuilder("program").append("ming").toString();

        System.out.println("All equal despite different sources:");
        System.out.println("literal.equals(fromArray): " + literal.equals(fromArray));
        System.out.println("literal.equals(fromBytes): " + literal.equals(fromBytes));
        System.out.println("literal.equals(concatenated): " + literal.equals(concatenated));
        System.out.println("literal.equals(built): " + literal.equals(built));

        // Unicode and special characters
        String unicode1 = "café";
        String unicode2 = "cafe\u0301"; // e with combining acute accent
        System.out.println("\nUnicode comparison:");
        System.out.println("unicode1: " + unicode1);
        System.out.println("unicode2: " + unicode2);
        System.out.println("unicode1.equals(unicode2): " + unicode1.equals(unicode2)); // false
        System.out.println("Normalized comparison: " +
                          normalize(unicode1).equals(normalize(unicode2))); // true

        // Empty and whitespace strings
        demonstrateEmptyAndWhitespace();
    }

    private static String normalize(String str) {
        // Using Unicode normalization
        return java.text.Normalizer.normalize(str, java.text.Normalizer.Form.NFC);
    }

    private static void demonstrateEmptyAndWhitespace() {
        String empty1 = "";
        String empty2 = new String();
        String space = " ";
        String tab = "\t";
        String newline = "\n";
        String whitespace = "   ";

        System.out.println("\nEmpty and whitespace comparisons:");
        System.out.println("empty1.equals(empty2): " + empty1.equals(empty2)); // true
        System.out.println("empty1.equals(space): " + empty1.equals(space)); // false
        System.out.println("space.equals(tab): " + space.equals(tab)); // false

        // Trimmed comparisons
        System.out.println("whitespace.trim().equals(empty1): " +
                          whitespace.trim().equals(empty1)); // true
    }
}
```

### Practical String Comparison Scenarios

```java
public class PracticalStringComparisons {
    public static void main(String[] args) {
        // User authentication
        authenticateUser("admin", "password123");
        authenticateUser("ADMIN", "password123"); // Case sensitivity

        // Command processing
        processCommand("START");
        processCommand("start");
        processCommand("Start");

        // File extension checking
        String[] filenames = {"document.pdf", "image.PNG", "script.js", "data.CSV"};
        for (String filename : filenames) {
            System.out.println(filename + " is image: " + isImageFile(filename));
        }

        // Configuration validation
        validateConfiguration();

        // Search functionality
        searchInText();
    }

    private static void authenticateUser(String username, String password) {
        String validUsername = "admin";
        String validPassword = "password123";

        // Case-sensitive authentication
        boolean isValid = validUsername.equals(username) && validPassword.equals(password);
        System.out.println("User '" + username + "' authentication: " +
                          (isValid ? "SUCCESS" : "FAILED"));
    }

    private static void processCommand(String command) {
        if (command == null) {
            System.out.println("Null command received");
            return;
        }

        // Case-insensitive command processing
        String cmd = command.toLowerCase();
        switch (cmd) {
            case "start":
                System.out.println("Starting system...");
                break;
            case "stop":
                System.out.println("Stopping system...");
                break;
            case "restart":
                System.out.println("Restarting system...");
                break;
            default:
                System.out.println("Unknown command: " + command);
        }
    }

    private static boolean isImageFile(String filename) {
        if (filename == null) return false;

        String lowercaseFilename = filename.toLowerCase();
        return lowercaseFilename.endsWith(".jpg") ||
               lowercaseFilename.endsWith(".jpeg") ||
               lowercaseFilename.endsWith(".png") ||
               lowercaseFilename.endsWith(".gif") ||
               lowercaseFilename.endsWith(".bmp");
    }

    private static void validateConfiguration() {
        String[] environments = {"development", "staging", "production"};
        String currentEnv = "PRODUCTION"; // Case mismatch

        boolean isValidEnv = false;
        for (String env : environments) {
            if (env.equalsIgnoreCase(currentEnv)) {
                isValidEnv = true;
                break;
            }
        }

        System.out.println("Environment '" + currentEnv + "' is valid: " + isValidEnv);
    }

    private static void searchInText() {
        String text = "Java is a powerful programming language. Java developers are in high demand.";
        String searchTerm = "java";

        // Case-sensitive search
        int caseSensitiveCount = countOccurrences(text, searchTerm);
        System.out.println("Case-sensitive occurrences of '" + searchTerm + "': " + caseSensitiveCount);

        // Case-insensitive search
        int caseInsensitiveCount = countOccurrencesIgnoreCase(text, searchTerm);
        System.out.println("Case-insensitive occurrences of '" + searchTerm + "': " + caseInsensitiveCount);
    }

    private static int countOccurrences(String text, String searchTerm) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(searchTerm, index)) != -1) {
            count++;
            index += searchTerm.length();
        }
        return count;
    }

    private static int countOccurrencesIgnoreCase(String text, String searchTerm) {
        return countOccurrences(text.toLowerCase(), searchTerm.toLowerCase());
    }
}
```

### Custom String Comparison Utilities

```java
public class StringComparisonUtils {
    public static void main(String[] args) {
        // Testing custom comparison utilities
        System.out.println("Custom comparison utilities:");

        // Null-safe equals
        System.out.println("nullSafeEquals(null, null): " + nullSafeEquals(null, null)); // true
        System.out.println("nullSafeEquals(\"test\", null): " + nullSafeEquals("test", null)); // false
        System.out.println("nullSafeEquals(\"test\", \"test\"): " + nullSafeEquals("test", "test")); // true

        // Trimmed equals
        System.out.println("trimmedEquals(\" hello \", \"hello\"): " +
                          trimmedEquals(" hello ", "hello")); // true

        // Multiple option check
        System.out.println("isAnyOf(\"red\", \"red\", \"green\", \"blue\"): " +
                          isAnyOf("red", "red", "green", "blue")); // true

        // Fuzzy matching
        System.out.println("fuzzyEquals(\"color\", \"colour\", 1): " +
                          fuzzyEquals("color", "colour", 1)); // true
    }

    public static boolean nullSafeEquals(String str1, String str2) {
        if (str1 == null && str2 == null) return true;
        if (str1 == null || str2 == null) return false;
        return str1.equals(str2);
    }

    public static boolean nullSafeEqualsIgnoreCase(String str1, String str2) {
        if (str1 == null && str2 == null) return true;
        if (str1 == null || str2 == null) return false;
        return str1.equalsIgnoreCase(str2);
    }

    public static boolean trimmedEquals(String str1, String str2) {
        if (str1 == null && str2 == null) return true;
        if (str1 == null || str2 == null) return false;
        return str1.trim().equals(str2.trim());
    }

    public static boolean isAnyOf(String target, String... options) {
        if (target == null) return false;
        for (String option : options) {
            if (target.equals(option)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAnyOfIgnoreCase(String target, String... options) {
        if (target == null) return false;
        for (String option : options) {
            if (target.equalsIgnoreCase(option)) {
                return true;
            }
        }
        return false;
    }

    public static boolean fuzzyEquals(String str1, String str2, int maxDifferences) {
        if (str1 == null && str2 == null) return true;
        if (str1 == null || str2 == null) return false;

        return calculateLevenshteinDistance(str1, str2) <= maxDifferences;
    }

    private static int calculateLevenshteinDistance(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 0; i <= str1.length(); i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= str2.length(); j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j],
                                           Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                }
            }
        }

        return dp[str1.length()][str2.length()];
    }
}
```

# Useful String Static Methods

- **Namespace**: Groups related classes under a common name
- **Directory Structure**: Packages correspond to folder structure
- **Reverse Domain Naming**: Convention uses reverse domain names (e.g., `com.company.project`)

### Package Declaration

```java
package com.AccessModifiers;

public class AccessModifier {
    // class content
}
```

### Importing Packages

```java
// Import specific class
import com.AccessModifiers.AccessModifier;

// Import all classes from package (not recommended for production)
import com.AccessModifiers.*;

// Using fully qualified name (no import needed)
com.AccessModifiers.AccessModifier modifier = new com.AccessModifiers.AccessModifier();
```

### Package Structure Example

```
src/
├── com/
│   ├── AccessModifiers/
│   │   └── AccessModifier.java
│   └── Basics/
│       ├── Chapter4AccessModifier.java
│       └── ExtendedAccessModifier.java
└── Main.java
```

### Benefits of Packages

1. **Namespace Management**: Avoid class name conflicts
2. **Access Control**: Package-private visibility
3. **Code Organization**: Logical grouping of related functionality
4. **Easier Maintenance**: Modular structure

# Java Access Modifiers

## Overview

Access modifiers control the visibility and accessibility of classes, methods, and variables in Java.

## Types of Access Modifiers

| Modifier    | Same Class | Same Package | Subclass (Different Package) | Different Package |
| ----------- | ---------- | ------------ | ---------------------------- | ----------------- |
| `private`   | ✅         | ❌           | ❌                           | ❌                |
| `default`   | ✅         | ✅           | ❌                           | ❌                |
| `protected` | ✅         | ✅           | ✅                           | ❌                |
| `public`    | ✅         | ✅           | ✅                           | ✅                |

## 1. `private` Access Modifier

### Characteristics

- Most restrictive access level
- Accessible only within the same class
- Not inherited by subclasses

### Example

```java
public class AccessModifier {
    private final int secret = 42;

    private void privateMethod() {
        System.out.println("This is private");
    }

    public void revealSecret() {
        System.out.println("The secret is " + this.secret); // ✅ Accessible
    }
}
```

### Use Cases

- Internal implementation details
- Helper methods
- Sensitive data that shouldn't be exposed

## 2. `default` (Package-Private) Access Modifier

### Characteristics

- No keyword specified
- Accessible within the same package only
- Not accessible from different packages

### Example

```java
package com.AccessModifiers;

public class AccessModifier {
    void defaultAccess() {
        System.out.println("This has default access");
    }
}
```

```java
package com.AccessModifiers;

public class SamePackageClass {
    public void testAccess() {
        AccessModifier modifier = new AccessModifier();
        modifier.defaultAccess(); // ✅ Accessible (same package)
    }
}
```

### Use Cases

- Package-internal utilities
- Classes meant for internal package use only

## 3. `protected` Access Modifier

### Characteristics

- Accessible within the same package
- Accessible to subclasses in different packages
- Not accessible to non-subclasses in different packages

### Example

```java
package com.AccessModifiers;

public class AccessModifier {
    protected void protectedAccess() {
        System.out.println("This has protected access");
    }
}
```

```java
package com.Basics;
import com.AccessModifiers.AccessModifier;

public class ExtendedAccessModifier extends AccessModifier {
    void walk() {
        this.protectedAccess(); // ✅ Accessible (inheritance)
    }
}
```

### Use Cases

- Methods intended for subclasses
- Framework extension points
- Template method patterns

## 4. `public` Access Modifier

### Characteristics

- Least restrictive access level
- Accessible from anywhere
- No access restrictions

### Example

```java
package com.AccessModifiers;

public class AccessModifier {
    public void publicAccess() {
        System.out.println("This is public");
    }
}
```

```java
package com.Basics;
import com.AccessModifiers.AccessModifier;

public class Chapter4AccessModifier {
    public void run() {
        AccessModifier modifier = new AccessModifier();
        modifier.publicAccess(); // ✅ Accessible (public)
    }
}
```

### Use Cases

- Public API methods
- Entry points (main methods)
- Utility methods for general use

## Access Modifier Best Practices

### 1. Principle of Least Privilege

- Start with the most restrictive access level
- Only increase visibility when necessary

### 2. Encapsulation

```java
public class BankAccount {
    private double balance; // Hide internal state

    public void deposit(double amount) { // Public interface
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() { // Controlled access
        return balance;
    }
}
```

### 3. Common Patterns

**Getters and Setters**

```java
public class Person {
    private String name;
    private int age;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age >= 0) this.age = age;
    }
}
```

**Factory Methods**

```java
public class DatabaseConnection {
    private DatabaseConnection() {} // Private constructor

    public static DatabaseConnection create(String url) { // Public factory
        return new DatabaseConnection();
    }
}
```

## Common Access Modifier Mistakes

### Mistake 1: Making Everything Public

```java
// ❌ Bad
public class User {
    public String password; // Exposed sensitive data
    public void deleteAllData() {} // Dangerous public method
}
```

```java
// ✅ Good
public class User {
    private String password;

    public boolean verifyPassword(String input) {
        return password.equals(input);
    }

    private void deleteAllData() {} // Internal method
}
```

### Mistake 2: Accessing Private Members from Different Classes

```java
// ❌ This won't compile
package com.Basics;
import com.AccessModifiers.AccessModifier;

public class WrongAccess {
    public void test() {
        AccessModifier modifier = new AccessModifier();
        // modifier.secret; // ❌ Cannot access private field
        // modifier.privateMethod(); // ❌ Cannot access private method
    }
}
```

# Useful String Static Methods

## Overview of String Static Methods

String class provides several useful static methods that help with string creation, formatting, and manipulation without needing a string instance.

### String.valueOf() Methods

```java
public class StringValueOf {
    public static void main(String[] args) {
        // Converting primitives to strings
        int number = 42;
        double decimal = 3.14159;
        boolean flag = true;
        char character = 'A';

        String numberStr = String.valueOf(number);
        String decimalStr = String.valueOf(decimal);
        String flagStr = String.valueOf(flag);
        String charStr = String.valueOf(character);

        System.out.println("Number as string: " + numberStr); // "42"
        System.out.println("Decimal as string: " + decimalStr); // "3.14159"
        System.out.println("Boolean as string: " + flagStr); // "true"
        System.out.println("Character as string: " + charStr); // "A"

        // Converting arrays to strings
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String fromCharArray = String.valueOf(charArray);
        System.out.println("From char array: " + fromCharArray); // "Hello"

        // Subset of char array
        char[] largeArray = {'A', 'B', 'C', 'D', 'E', 'F'};
        String subset = String.valueOf(largeArray, 1, 3); // "BCD"
        System.out.println("Subset: " + subset); // "BCD"

        // Handling null objects
        Object nullObject = null;
        String nullStr = String.valueOf(nullObject); // Returns "null"
        System.out.println("Null object: " + nullStr); // "null"
    }
}
```

### String.format() Method

```java
public class StringFormat {
    public static void main(String[] args) {
        // Basic formatting
        String name = "Alice";
        int age = 25;
        double salary = 50000.75;

        // Using placeholders
        String message = String.format("Employee: %s, Age: %d, Salary: $%.2f",
                                     name, age, salary);
        System.out.println(message); // "Employee: Alice, Age: 25, Salary: $50000.75"

        // Number formatting
        int number = 1234567;
        System.out.println("With commas: " + String.format("%,d", number)); // "1,234,567"
        System.out.println("Padded: " + String.format("%010d", number)); // "0001234567"
        System.out.println("Hex: " + String.format("%x", number)); // "12d687"
        System.out.println("Octal: " + String.format("%o", number)); // "4553207"

        // Floating point formatting
        double pi = Math.PI;
        System.out.println("Pi (2 decimals): " + String.format("%.2f", pi)); // "3.14"
        System.out.println("Pi (scientific): " + String.format("%.2e", pi)); // "3.14e+00"

        // String formatting
        String text = "Hello";
        System.out.println("Left aligned: '" + String.format("%-10s", text) + "'"); // "Hello     "
        System.out.println("Right aligned: '" + String.format("%10s", text) + "'"); // "     Hello"

        // Date formatting
        java.util.Date now = new java.util.Date();
        System.out.println("Date: " + String.format("%tF", now)); // "2024-08-15"
        System.out.println("Time: " + String.format("%tT", now)); // "14:30:45"
    }
}
```

### String.join() Method (Java 8+)

```java
import java.util.*;

public class StringJoin {
    public static void main(String[] args) {
        // Basic joining with delimiter
        String[] words = {"Java", "is", "awesome"};
        String sentence = String.join(" ", words);
        System.out.println("Sentence: " + sentence); // "Java is awesome"

        // Joining with different delimiters
        String csvLine = String.join(",", words);
        String pipeSeparated = String.join(" | ", words);
        System.out.println("CSV: " + csvLine); // "Java,is,awesome"
        System.out.println("Pipe separated: " + pipeSeparated); // "Java | is | awesome"

        // Joining collections
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        String fruitList = String.join(", ", fruits);
        System.out.println("Fruits: " + fruitList); // "apple, banana, cherry"

        // Joining with complex delimiters
        String[] paths = {"home", "user", "documents", "file.txt"};
        String filePath = String.join("/", paths);
        System.out.println("File path: " + filePath); // "home/user/documents/file.txt"

        // Creating SQL-like queries
        List<String> columns = Arrays.asList("id", "name", "email", "age");
        String selectQuery = "SELECT " + String.join(", ", columns) + " FROM users";
        System.out.println("SQL Query: " + selectQuery); // "SELECT id, name, email, age FROM users"
    }
}
```

### Real-World Applications

```java
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RealWorldStringMethods {
    public static void main(String[] args) {
        // Log message formatting
        generateLogMessages();

        // Report generation
        generateReport();

        // Data export formatting
        exportData();
    }

    private static void generateLogMessages() {
        System.out.println("=== Log Messages ===");

        String[] logLevels = {"INFO", "WARN", "ERROR"};
        String[] messages = {
            "Application started successfully",
            "Memory usage is high",
            "Database connection failed"
        };

        for (int i = 0; i < logLevels.length; i++) {
            String timestamp = LocalDateTime.now().format(
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            String logMessage = String.format("[%s] %s - %s",
                                            logLevels[i], timestamp, messages[i]);
            System.out.println(logMessage);
        }
    }

    private static void generateReport() {
        System.out.println("\n=== Sales Report ===");

        Object[][] salesData = {
            {"Q1", 150000, 12},
            {"Q2", 175000, 15},
            {"Q3", 200000, 18},
            {"Q4", 180000, 16}
        };

        // Header
        System.out.println(String.format("%-8s %12s %10s %12s",
                                        "Quarter", "Revenue", "Deals", "Avg Deal"));
        System.out.println(String.join("", Collections.nCopies(45, "-")));

        // Data rows
        for (Object[] row : salesData) {
            double avgDeal = (Double) row[1] / (Integer) row[2];
            System.out.println(String.format("%-8s $%,11.0f %10d $%,10.0f",
                                            row[0], row[1], row[2], avgDeal));
        }
    }

    private static void exportData() {
        System.out.println("\n=== Data Export (CSV) ===");

        String[] headers = {"ID", "Name", "Email", "Department", "Salary"};
        Object[][] employees = {
            {1, "John Doe", "john@company.com", "Engineering", 75000},
            {2, "Jane Smith", "jane@company.com", "Marketing", 65000},
            {3, "Bob Johnson", "bob@company.com", "Sales", 55000}
        };

        // CSV Header
        System.out.println(String.join(",", headers));

        // CSV Data
        for (Object[] employee : employees) {
            String[] stringRow = new String[employee.length];
            for (int i = 0; i < employee.length; i++) {
                stringRow[i] = String.valueOf(employee[i]);
                // Escape commas in data
                if (stringRow[i].contains(",")) {
                    stringRow[i] = "\"" + stringRow[i] + "\"";
                }
            }
            System.out.println(String.join(",", stringRow));
        }
    }
}
```

# LocalDateTime

## What is LocalDateTime?

`LocalDateTime` is a class in Java's `java.time` package that represents a date and time without timezone information. It combines date and time into a single object and is part of the modern Java Date/Time API introduced in Java 8.

### Creating LocalDateTime Objects

```java
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeBasics {
    public static void main(String[] args) {
        // Current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now); // 2024-08-04T14:30:45.123

        // Specific date and time
        LocalDateTime specificDateTime = LocalDateTime.of(2024, 12, 25, 14, 30, 0);
        System.out.println("Christmas 2024 at 2:30 PM: " + specificDateTime); // 2024-12-25T14:30

        // Using Month enum
        LocalDateTime newYear = LocalDateTime.of(2025, Month.JANUARY, 1, 0, 0, 0);
        System.out.println("New Year 2025: " + newYear); // 2025-01-01T00:00

        // With nanoseconds
        LocalDateTime precise = LocalDateTime.of(2024, 8, 15, 10, 30, 45, 123456789);
        System.out.println("Precise time: " + precise); // 2024-08-15T10:30:45.123456789
    }
}
```

### Common Operations

```java
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeOperations {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        // Getting components
        System.out.println("Year: " + dateTime.getYear()); // 2024
        System.out.println("Month: " + dateTime.getMonth()); // AUGUST
        System.out.println("Day: " + dateTime.getDayOfMonth()); // 15
        System.out.println("Hour: " + dateTime.getHour()); // 14
        System.out.println("Minute: " + dateTime.getMinute()); // 30
        System.out.println("Second: " + dateTime.getSecond()); // 45
        System.out.println("Day of week: " + dateTime.getDayOfWeek()); // THURSDAY
        System.out.println("Day of year: " + dateTime.getDayOfYear()); // 228

        // Adding time
        LocalDateTime future = dateTime.plusDays(30)
                                      .plusHours(2)
                                      .plusMinutes(15);
        System.out.println("30 days, 2 hours, 15 minutes later: " + future); // 2024-09-14T16:45:45

        // Subtracting time
        LocalDateTime past = dateTime.minusWeeks(2)
                                    .minusHours(5);
        System.out.println("2 weeks and 5 hours ago: " + past); // 2024-08-01T09:30:45

        // Truncating
        LocalDateTime truncated = dateTime.truncatedTo(ChronoUnit.HOURS);
        System.out.println("Truncated to hours: " + truncated); // 2024-08-15T14:00
    }
}
```

### Formatting and Parsing

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LocalDateTimeFormatting {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        // Predefined formatters
        System.out.println("ISO format: " + dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); // 2024-08-15T14:30:45.123

        // Custom formatters
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Custom format: " + dateTime.format(customFormatter)); // 2024-08-15 14:30:45

        DateTimeFormatter readableFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm a");
        System.out.println("Readable format: " + dateTime.format(readableFormatter)); // August 15, 2024 at 02:30 PM

        // Parsing strings to LocalDateTime
        String dateTimeString = "2024-12-25 14:30:00";
        try {
            LocalDateTime parsed = LocalDateTime.parse(dateTimeString, customFormatter);
            System.out.println("Parsed date: " + parsed); // 2024-12-25T14:30
        } catch (DateTimeParseException e) {
            System.out.println("Failed to parse: " + e.getMessage());
        }        // Common patterns
        demonstrateCommonPatterns();
    }

    private static void demonstrateCommonPatterns() {
        LocalDateTime now = LocalDateTime.now();

        // Database format
        DateTimeFormatter dbFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println("Database format: " + now.format(dbFormat)); // 2024-08-15 14:30:45.123

        // Log format
        DateTimeFormatter logFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Log format: " + now.format(logFormat)); // 2024-08-15 14:30:45

        // User-friendly format
        DateTimeFormatter userFormat = DateTimeFormatter.ofPattern("MMM dd, yyyy h:mm a");
        System.out.println("User format: " + now.format(userFormat)); // Aug 15, 2024 2:30 PM
    }
}
```

### Practical Examples

```java
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class LocalDateTimePractical {
    public static void main(String[] args) {
        // Meeting scheduler
        scheduleMeeting();

        // Age calculator
        calculateAge();

        // Business hours checker
        checkBusinessHours();
    }

    private static void scheduleMeeting() {
        LocalDateTime meetingStart = LocalDateTime.of(2024, 8, 15, 14, 0);
        LocalDateTime meetingEnd = meetingStart.plusHours(1).plusMinutes(30);

        System.out.println("Meeting Details:");
        System.out.println("Start: " + meetingStart.format(DateTimeFormatter.ofPattern("MMM dd, yyyy h:mm a"))); // Aug 15, 2024 2:00 PM
        System.out.println("End: " + meetingEnd.format(DateTimeFormatter.ofPattern("MMM dd, yyyy h:mm a"))); // Aug 15, 2024 3:30 PM

        Duration duration = Duration.between(meetingStart, meetingEnd);
        System.out.println("Duration: " + duration.toMinutes() + " minutes"); // 90 minutes
    }

    private static void calculateAge() {
        LocalDateTime birthDate = LocalDateTime.of(1995, 6, 15, 10, 30);
        LocalDateTime now = LocalDateTime.now();

        long years = ChronoUnit.YEARS.between(birthDate, now);
        long months = ChronoUnit.MONTHS.between(birthDate, now);
        long days = ChronoUnit.DAYS.between(birthDate, now);

        System.out.println("\nAge Calculation:");
        System.out.println("Years: " + years); // 29
        System.out.println("Total months: " + months); // 350
        System.out.println("Total days: " + days); // 10716
    }

    private static void checkBusinessHours() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int dayOfWeek = now.getDayOfWeek().getValue(); // 1=Monday, 7=Sunday

        boolean isBusinessDay = dayOfWeek >= 1 && dayOfWeek <= 5; // Monday to Friday
        boolean isBusinessHour = hour >= 9 && hour < 17; // 9 AM to 5 PM

        System.out.println("\nBusiness Hours Check:");
        System.out.println("Current time: " + now.format(DateTimeFormatter.ofPattern("EEEE, MMM dd h:mm a")));
        System.out.println("Is business day: " + isBusinessDay);
        System.out.println("Is business hour: " + isBusinessHour);
        System.out.println("Office is open: " + (isBusinessDay && isBusinessHour));
    }
}
```

# LocalDate and LocalTime

## LocalDate - Working with Dates Only

`LocalDate` represents a date without time information (year, month, day).

### LocalDate Basics

```java
import java.time.LocalDate;
import java.time.Month;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        // Creating LocalDate objects
        LocalDate today = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2024, 12, 25);
        LocalDate withMonth = LocalDate.of(2024, Month.DECEMBER, 25);

        System.out.println("Today: " + today); // 2024-08-15
        System.out.println("Christmas: " + specificDate); // 2024-12-25
        System.out.println("Using Month enum: " + withMonth); // 2024-12-25

        // Date operations
        LocalDate nextWeek = today.plusWeeks(1);
        LocalDate lastMonth = today.minusMonths(1);
        LocalDate nextYear = today.plusYears(1);

        System.out.println("Next week: " + nextWeek); // 2024-08-22
        System.out.println("Last month: " + lastMonth); // 2024-07-15
        System.out.println("Next year: " + nextYear); // 2025-08-15

        // Getting date components
        System.out.println("\nDate Components:");
        System.out.println("Year: " + today.getYear()); // 2024
        System.out.println("Month: " + today.getMonth()); // AUGUST
        System.out.println("Day: " + today.getDayOfMonth()); // 15
        System.out.println("Day of week: " + today.getDayOfWeek()); // THURSDAY
        System.out.println("Day of year: " + today.getDayOfYear()); // 228
        System.out.println("Is leap year: " + today.isLeapYear()); // true
    }
}
```

### LocalDate Advanced Operations

```java
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.ChronoUnit;

public class LocalDateAdvanced {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // Temporal adjusters
        LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDayOfMonth = today.with(TemporalAdjusters.lastDayOfMonth());
        LocalDate nextMonday = today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        LocalDate firstMonday = today.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        System.out.println("First day of month: " + firstDayOfMonth); // 2024-08-01
        System.out.println("Last day of month: " + lastDayOfMonth); // 2024-08-31
        System.out.println("Next Monday: " + nextMonday); // 2024-08-19
        System.out.println("First Monday of month: " + firstMonday); // 2024-08-05

        // Period calculations
        LocalDate birthDate = LocalDate.of(1995, 6, 15);
        Period age = Period.between(birthDate, today);
        System.out.println("\nAge: " + age.getYears() + " years, " +
                          age.getMonths() + " months, " + age.getDays() + " days"); // 29 years, 2 months, 0 days

        // Date comparisons
        LocalDate deadline = LocalDate.of(2024, 12, 31);
        System.out.println("\nDate Comparisons:");
        System.out.println("Today is before deadline: " + today.isBefore(deadline)); // true
        System.out.println("Today is after deadline: " + today.isAfter(deadline)); // false
        System.out.println("Days until deadline: " + ChronoUnit.DAYS.between(today, deadline)); // 138
    }
}
```

## LocalTime - Working with Time Only

`LocalTime` represents time without date information (hour, minute, second, nanosecond).

### LocalTime Basics

```java
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
    public static void main(String[] args) {
        // Creating LocalTime objects
        LocalTime now = LocalTime.now();
        LocalTime noon = LocalTime.of(12, 0);
        LocalTime precise = LocalTime.of(14, 30, 45, 123456789);
        LocalTime midnight = LocalTime.MIDNIGHT;
        LocalTime maxTime = LocalTime.MAX; // 23:59:59.999999999

        System.out.println("Current time: " + now); // 14:30:45.123
        System.out.println("Noon: " + noon); // 12:00
        System.out.println("Precise time: " + precise); // 14:30:45.123456789
        System.out.println("Midnight: " + midnight); // 00:00
        System.out.println("Max time: " + maxTime); // 23:59:59.999999999

        // Time operations
        LocalTime later = now.plusHours(2).plusMinutes(30);
        LocalTime earlier = now.minusHours(1).minusMinutes(15);

        System.out.println("2.5 hours later: " + later); // 17:00:45.123
        System.out.println("1.25 hours earlier: " + earlier); // 13:15:45.123

        // Getting time components
        System.out.println("\nTime Components:");
        System.out.println("Hour: " + now.getHour()); // 14
        System.out.println("Minute: " + now.getMinute()); // 30
        System.out.println("Second: " + now.getSecond()); // 45
        System.out.println("Nano: " + now.getNano()); // 123000000
    }
}
```

### LocalTime Practical Applications

```java
import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class LocalTimePractical {
    public static void main(String[] args) {
        // Work schedule
        workScheduleExample();

        // Time duration calculations
        durationExample();

        // Time formatting
        formattingExample();
    }

    private static void workScheduleExample() {
        LocalTime workStart = LocalTime.of(9, 0);
        LocalTime workEnd = LocalTime.of(17, 0);
        LocalTime lunchStart = LocalTime.of(12, 0);
        LocalTime lunchEnd = LocalTime.of(13, 0);

        Duration workDay = Duration.between(workStart, workEnd);
        Duration lunchBreak = Duration.between(lunchStart, lunchEnd);
        Duration actualWork = workDay.minus(lunchBreak);

        System.out.println("Work Schedule:");
        System.out.println("Start: " + workStart);
        System.out.println("End: " + workEnd);
        System.out.println("Total work day: " + workDay.toHours() + " hours");
        System.out.println("Actual work time: " + actualWork.toHours() + " hours");
    }

    private static void durationExample() {
        LocalTime start = LocalTime.of(14, 30);
        LocalTime end = LocalTime.of(16, 45);

        Duration duration = Duration.between(start, end);

        System.out.println("\nDuration Example:");
        System.out.println("Start: " + start);
        System.out.println("End: " + end);
        System.out.println("Duration: " + duration.toMinutes() + " minutes");
        System.out.println("Duration: " + duration.toHours() + " hours " +
                          (duration.toMinutes() % 60) + " minutes");
    }

    private static void formattingExample() {
        LocalTime time = LocalTime.of(14, 30, 45);

        System.out.println("\nTime Formatting:");
        System.out.println("Default: " + time);
        System.out.println("HH:mm: " + time.format(DateTimeFormatter.ofPattern("HH:mm")));
        System.out.println("h:mm a: " + time.format(DateTimeFormatter.ofPattern("h:mm a")));
        System.out.println("HH:mm:ss: " + time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
```

### Combining LocalDate and LocalTime

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class CombiningDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 8, 15);
        LocalTime time = LocalTime.of(14, 30);

        // Combine date and time
        LocalDateTime dateTime1 = date.atTime(time);
        LocalDateTime dateTime2 = time.atDate(date);
        LocalDateTime dateTime3 = LocalDateTime.of(date, time);

        System.out.println("Combined date and time:");
        System.out.println("Method 1: " + dateTime1);
        System.out.println("Method 2: " + dateTime2);
        System.out.println("Method 3: " + dateTime3);

        // Extract date and time from LocalDateTime
        LocalDateTime now = LocalDateTime.now();
        LocalDate extractedDate = now.toLocalDate();
        LocalTime extractedTime = now.toLocalTime();

        System.out.println("\nExtracted from LocalDateTime:");
        System.out.println("Date: " + extractedDate);
        System.out.println("Time: " + extractedTime);
    }
}
```

# Creating Specific Dates

## Various Ways to Create Dates

Java provides multiple ways to create specific dates depending on your needs and the information you have available.

### Basic Date Creation Methods

```java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class CreatingSpecificDates {
    public static void main(String[] args) {
        // LocalDate creation methods
        LocalDate date1 = LocalDate.of(2024, 8, 15);
        LocalDate date2 = LocalDate.of(2024, Month.AUGUST, 15);
        LocalDate date3 = LocalDate.parse("2024-08-15");
        LocalDate date4 = LocalDate.now();

        System.out.println("Basic date creation:");
        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        System.out.println("Date 3: " + date3);
        System.out.println("Date 4: " + date4);

        // LocalDateTime creation methods
        LocalDateTime dateTime1 = LocalDateTime.of(2024, 8, 15, 14, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(2024, Month.AUGUST, 15, 14, 30, 45);
        LocalDateTime dateTime3 = LocalDateTime.of(date1, LocalTime.of(14, 30));
        LocalDateTime dateTime4 = LocalDateTime.parse("2024-08-15T14:30:45");

        System.out.println("\nDateTime creation:");
        System.out.println("DateTime 1: " + dateTime1);
        System.out.println("DateTime 2: " + dateTime2);
        System.out.println("DateTime 3: " + dateTime3);
        System.out.println("DateTime 4: " + dateTime4);
    }
}
```

### Using Temporal Classes for Partial Dates

```java
import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class PartialDates {
    public static void main(String[] args) {
        // Year only
        Year currentYear = Year.now();
        Year year2024 = Year.of(2024);
        System.out.println("Current year: " + currentYear);
        System.out.println("Specific year: " + year2024);
        System.out.println("Is 2024 leap year: " + year2024.isLeap());

        // Year and Month
        YearMonth currentYearMonth = YearMonth.now();
        YearMonth december2024 = YearMonth.of(2024, Month.DECEMBER);
        System.out.println("\nYear-Month combinations:");
        System.out.println("Current year-month: " + currentYearMonth);
        System.out.println("December 2024: " + december2024);
        System.out.println("Days in December 2024: " + december2024.lengthOfMonth());

        // Month and Day (for recurring events)
        MonthDay birthday = MonthDay.of(Month.JUNE, 15);
        MonthDay christmas = MonthDay.of(12, 25);
        System.out.println("\nRecurring dates:");
        System.out.println("Birthday: " + birthday);
        System.out.println("Christmas: " + christmas);

        // Convert to full date for current year
        LocalDate birthdayThisYear = birthday.atYear(2024);
        LocalDate christmasThisYear = christmas.atYear(2024);
        System.out.println("Birthday in 2024: " + birthdayThisYear);
        System.out.println("Christmas in 2024: " + christmasThisYear);
    }
}
```

### Creating Dates with Temporal Adjusters

```java
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAdjuster;

public class TemporalAdjusterDates {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // Standard temporal adjusters
        LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDayOfMonth = today.with(TemporalAdjusters.lastDayOfMonth());
        LocalDate firstDayOfYear = today.with(TemporalAdjusters.firstDayOfYear());
        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());

        System.out.println("Standard adjusters:");
        System.out.println("Today: " + today);
        System.out.println("First day of month: " + firstDayOfMonth);
        System.out.println("Last day of month: " + lastDayOfMonth);
        System.out.println("First day of year: " + firstDayOfYear);
        System.out.println("Last day of year: " + lastDayOfYear);

        // Day-of-week adjusters
        LocalDate nextMonday = today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        LocalDate previousFriday = today.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        LocalDate firstMondayOfMonth = today.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        LocalDate lastFridayOfMonth = today.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));

        System.out.println("\nDay-of-week adjusters:");
        System.out.println("Next Monday: " + nextMonday);
        System.out.println("Previous Friday: " + previousFriday);
        System.out.println("First Monday of month: " + firstMondayOfMonth);
        System.out.println("Last Friday of month: " + lastFridayOfMonth);

        // Custom temporal adjuster
        TemporalAdjuster nextWorkday = temporal -> {
            LocalDate date = LocalDate.from(temporal);
            DayOfWeek dayOfWeek = date.getDayOfWeek();

            switch (dayOfWeek) {
                case FRIDAY:
                    return date.plusDays(3); // Skip weekend
                case SATURDAY:
                    return date.plusDays(2); // Skip Sunday
                default:
                    return date.plusDays(1); // Next day
            }
        };

        LocalDate nextWorkdayDate = today.with(nextWorkday);
        System.out.println("\nCustom adjuster:");
        System.out.println("Next workday: " + nextWorkdayDate);
    }
}
```

### Parsing Dates from Strings

```java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ParsingDates {
    public static void main(String[] args) {
        // Standard ISO format parsing
        LocalDate isoDate = LocalDate.parse("2024-08-15");
        LocalDateTime isoDateTime = LocalDateTime.parse("2024-08-15T14:30:45");

        System.out.println("ISO parsing:");
        System.out.println("Date: " + isoDate);
        System.out.println("DateTime: " + isoDateTime);

        // Custom format parsing
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate customDate = LocalDate.parse("15/08/2024", customFormatter);
        System.out.println("\nCustom format: " + customDate);

        // Multiple format support
        String[] dateStrings = {
            "2024-08-15",
            "15/08/2024",
            "Aug 15, 2024",
            "15-Aug-2024"
        };

        DateTimeFormatter[] formatters = {
            DateTimeFormatter.ISO_LOCAL_DATE,
            DateTimeFormatter.ofPattern("dd/MM/yyyy"),
            DateTimeFormatter.ofPattern("MMM dd, yyyy"),
            DateTimeFormatter.ofPattern("dd-MMM-yyyy")
        };

        System.out.println("\nMultiple format parsing:");
        for (int i = 0; i < dateStrings.length; i++) {
            try {
                LocalDate parsed = LocalDate.parse(dateStrings[i], formatters[i]);
                System.out.println(dateStrings[i] + " -> " + parsed);
            } catch (DateTimeParseException e) {
                System.out.println("Failed to parse: " + dateStrings[i]);
            }
        }

        // Safe parsing method
        System.out.println("\nSafe parsing:");
        LocalDate safeDate = safeParse("15/08/2024", "dd/MM/yyyy");
        if (safeDate != null) {
            System.out.println("Safely parsed: " + safeDate);
        }
    }

    private static LocalDate safeParse(String dateString, String pattern) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            return LocalDate.parse(dateString, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
            return null;
        }
    }
}
```

### Business Date Creation Examples

```java
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

public class BusinessDates {
    public static void main(String[] args) {
        // Quarter dates
        createQuarterDates();

        // Payment due dates
        createPaymentDates();

        // Holiday calculations
        calculateHolidays();
    }

    private static void createQuarterDates() {
        int year = 2024;
        LocalDate q1Start = LocalDate.of(year, 1, 1);
        LocalDate q2Start = LocalDate.of(year, 4, 1);
        LocalDate q3Start = LocalDate.of(year, 7, 1);
        LocalDate q4Start = LocalDate.of(year, 10, 1);

        System.out.println("Quarter dates for " + year + ":");
        System.out.println("Q1: " + q1Start);
        System.out.println("Q2: " + q2Start);
        System.out.println("Q3: " + q3Start);
        System.out.println("Q4: " + q4Start);
    }

    private static void createPaymentDates() {
        LocalDate invoiceDate = LocalDate.now();
        LocalDate paymentDue = invoiceDate.plusDays(30);

        // If due date falls on weekend, move to next Monday
        if (paymentDue.getDayOfWeek() == DayOfWeek.SATURDAY) {
            paymentDue = paymentDue.plusDays(2);
        } else if (paymentDue.getDayOfWeek() == DayOfWeek.SUNDAY) {
            paymentDue = paymentDue.plusDays(1);
        }

        System.out.println("\nPayment dates:");
        System.out.println("Invoice date: " + invoiceDate);
        System.out.println("Payment due: " + paymentDue);
    }

    private static void calculateHolidays() {
        int year = 2024;

        // Fixed holidays
        LocalDate newYear = LocalDate.of(year, 1, 1);
        LocalDate christmas = LocalDate.of(year, 12, 25);

        // Variable holidays (US examples)
        LocalDate presidentsDay = LocalDate.of(year, 2, 1)
                .with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.MONDAY));
        LocalDate laborDay = LocalDate.of(year, 9, 1)
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        LocalDate thanksgiving = LocalDate.of(year, 11, 1)
                .with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.THURSDAY));

        System.out.println("\nHolidays for " + year + ":");
        System.out.println("New Year: " + newYear);
        System.out.println("Presidents Day: " + presidentsDay);
        System.out.println("Labor Day: " + laborDay);
        System.out.println("Thanksgiving: " + thanksgiving);
        System.out.println("Christmas: " + christmas);
    }
}
```

# Zone IDs

## Understanding Time Zones

Time zones are essential when working with dates and times across different geographical locations. Java provides robust support for time zones through the `ZoneId` class and related APIs.

### Basic Zone ID Operations

```java
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class ZoneIdBasics {
    public static void main(String[] args) {
        // System default zone
        ZoneId systemDefault = ZoneId.systemDefault();
        System.out.println("System default zone: " + systemDefault); // "America/New_York" (example)

        // Creating specific zones
        ZoneId utc = ZoneId.of("UTC");
        ZoneId newYork = ZoneId.of("America/New_York");
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZoneId london = ZoneId.of("Europe/London");

        System.out.println("UTC: " + utc); // "UTC"
        System.out.println("New York: " + newYork); // "America/New_York"
        System.out.println("Tokyo: " + tokyo); // "Asia/Tokyo"
        System.out.println("London: " + london); // "Europe/London"

        // Zone offsets
        ZoneOffset fixedOffset = ZoneOffset.of("+05:30"); // India Standard Time
        ZoneOffset utcOffset = ZoneOffset.UTC;

        System.out.println("Fixed offset: " + fixedOffset); // "+05:30"
        System.out.println("UTC offset: " + utcOffset); // "Z"        // Getting all available zones (first 10)
        Set<String> allZones = ZoneId.getAvailableZoneIds();
        System.out.println("\nFirst 10 available zones:");
        allZones.stream().sorted().limit(10).forEach(System.out::println);

        System.out.println("Total zones available: " + allZones.size());
    }
}
```

### Working with ZonedDateTime

```java
import java.time.*;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        // Current time in different zones
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneId.of("UTC"));
        ZonedDateTime nyNow = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime tokyoNow = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime systemNow = ZonedDateTime.now();

        System.out.println("Current time in different zones:");
        System.out.println("UTC: " + utcNow); // 2024-08-15T18:30:45.123Z
        System.out.println("New York: " + nyNow); // 2024-08-15T14:30:45.123-04:00[America/New_York]
        System.out.println("Tokyo: " + tokyoNow); // 2024-08-16T03:30:45.123+09:00[Asia/Tokyo]
        System.out.println("System: " + systemNow); // 2024-08-15T14:30:45.123-04:00[America/New_York]

        // Creating specific zoned date time
        LocalDateTime localDateTime = LocalDateTime.of(2024, 8, 15, 14, 30);
        ZonedDateTime zonedInNY = localDateTime.atZone(ZoneId.of("America/New_York"));
        ZonedDateTime zonedInTokyo = localDateTime.atZone(ZoneId.of("Asia/Tokyo"));

        System.out.println("\nSame local time in different zones:");
        System.out.println("New York: " + zonedInNY); // 2024-08-15T14:30-04:00[America/New_York]
        System.out.println("Tokyo: " + zonedInTokyo); // 2024-08-15T14:30+09:00[Asia/Tokyo]

        // Converting between zones
        ZonedDateTime meetingTimeNY = ZonedDateTime.of(2024, 8, 15, 14, 0, 0, 0,
                                                      ZoneId.of("America/New_York"));
        ZonedDateTime meetingTimeTokyo = meetingTimeNY.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime meetingTimeLondon = meetingTimeNY.withZoneSameInstant(ZoneId.of("Europe/London"));

        System.out.println("\nMeeting time conversions:");
        System.out.println("New York: " + meetingTimeNY.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm z")));
        System.out.println("Tokyo: " + meetingTimeTokyo.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm z")));
        System.out.println("London: " + meetingTimeLondon.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm z")));
    }
}
```

### Time Zone Conversions and Calculations

```java
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeZoneConversions {
    public static void main(String[] args) {
        // Flight schedule example
        flightScheduleExample();

        // Business hours across time zones
        businessHoursExample();

        // Daylight saving time handling
        daylightSavingExample();
    }

    private static void flightScheduleExample() {
        // Flight from New York to Tokyo
        ZonedDateTime departureNY = ZonedDateTime.of(2024, 8, 15, 10, 30, 0, 0,
                                                    ZoneId.of("America/New_York"));

        // Flight duration: 14 hours
        ZonedDateTime arrivalNYTime = departureNY.plusHours(14);
        ZonedDateTime arrivalTokyoTime = arrivalNYTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm z");

        System.out.println("Flight Schedule:");
        System.out.println("Departure (NY): " + departureNY.format(formatter));
        System.out.println("Arrival (NY time): " + arrivalNYTime.format(formatter));
        System.out.println("Arrival (Tokyo time): " + arrivalTokyoTime.format(formatter));

        Duration flightDuration = Duration.between(departureNY, arrivalNYTime);
        System.out.println("Flight duration: " + flightDuration.toHours() + " hours");
    }

    private static void businessHoursExample() {
        // Check if it's business hours in different cities
        ZonedDateTime currentTime = ZonedDateTime.now();

        String[] cities = {"America/New_York", "Europe/London", "Asia/Tokyo", "Australia/Sydney"};

        System.out.println("\nBusiness hours check:");
        for (String city : cities) {
            ZonedDateTime cityTime = currentTime.withZoneSameInstant(ZoneId.of(city));
            boolean isBusinessHours = isBusinessHours(cityTime);

            System.out.printf("%-20s: %s (%s)%n",
                            city.substring(city.lastIndexOf('/') + 1),
                            cityTime.format(DateTimeFormatter.ofPattern("HH:mm")),
                            isBusinessHours ? "Open" : "Closed");
        }
    }

    private static boolean isBusinessHours(ZonedDateTime time) {
        int hour = time.getHour();
        DayOfWeek dayOfWeek = time.getDayOfWeek();

        boolean isWeekday = dayOfWeek.getValue() >= 1 && dayOfWeek.getValue() <= 5;
        boolean isWorkingHour = hour >= 9 && hour < 17;

        return isWeekday && isWorkingHour;
    }

    private static void daylightSavingExample() {
        // Daylight saving transition in New York (Spring forward)
        ZoneId newYork = ZoneId.of("America/New_York");

        // Before DST transition (Standard Time)
        ZonedDateTime beforeDST = ZonedDateTime.of(2024, 3, 10, 1, 30, 0, 0, newYork);

        // After DST transition (Daylight Time)
        ZonedDateTime afterDST = ZonedDateTime.of(2024, 3, 10, 3, 30, 0, 0, newYork);

        System.out.println("\nDaylight Saving Time Example:");
        System.out.println("Before DST: " + beforeDST);
        System.out.println("After DST: " + afterDST);
        System.out.println("Zone rules: " + newYork.getRules());

        // The hour from 2:00 to 3:00 AM doesn't exist on this day
        try {
            ZonedDateTime nonExistent = ZonedDateTime.of(2024, 3, 10, 2, 30, 0, 0, newYork);
            System.out.println("This shouldn't print: " + nonExistent);
        } catch (DateTimeException e) {
            System.out.println("2:30 AM doesn't exist on this day: " + e.getMessage());
        }
    }
}
```

### Working with Zone Offsets

```java
import java.time.*;
import java.time.format.DateTimeFormatter;

public class ZoneOffsetExample {
    public static void main(String[] args) {
        // Creating zone offsets
        ZoneOffset plus5_30 = ZoneOffset.of("+05:30"); // India
        ZoneOffset minus5 = ZoneOffset.of("-05:00");    // EST
        ZoneOffset utc = ZoneOffset.UTC;

        System.out.println("Zone offsets:");
        System.out.println("India: " + plus5_30);
        System.out.println("EST: " + minus5);
        System.out.println("UTC: " + utc);

        // Creating OffsetDateTime
        LocalDateTime localDateTime = LocalDateTime.of(2024, 8, 15, 14, 30);
        OffsetDateTime utcTime = localDateTime.atOffset(utc);
        OffsetDateTime indiaTime = localDateTime.atOffset(plus5_30);
        OffsetDateTime estTime = localDateTime.atOffset(minus5);

        System.out.println("\nSame local time with different offsets:");
        System.out.println("UTC: " + utcTime);
        System.out.println("India: " + indiaTime);
        System.out.println("EST: " + estTime);

        // Converting to same instant
        Instant instant = utcTime.toInstant();
        OffsetDateTime indiaEquivalent = instant.atOffset(plus5_30);
        OffsetDateTime estEquivalent = instant.atOffset(minus5);

        System.out.println("\nSame instant in different offsets:");
        System.out.println("UTC: " + utcTime);
        System.out.println("India equivalent: " + indiaEquivalent);
        System.out.println("EST equivalent: " + estEquivalent);

        // Time zone vs offset difference
        demonstrateZoneVsOffset();
    }

    private static void demonstrateZoneVsOffset() {
        LocalDateTime dateTime = LocalDateTime.of(2024, 7, 15, 14, 30);

        // Using zone (handles DST automatically)
        ZonedDateTime nyZoned = dateTime.atZone(ZoneId.of("America/New_York"));

        // Using fixed offset (doesn't handle DST)
        OffsetDateTime nyOffset = dateTime.atOffset(ZoneOffset.of("-04:00")); // EDT

        System.out.println("\nZone vs Offset in summer:");
        System.out.println("Zoned (auto DST): " + nyZoned);
        System.out.println("Offset (fixed): " + nyOffset);

        // In winter, EST is -05:00
        LocalDateTime winterDateTime = LocalDateTime.of(2024, 1, 15, 14, 30);
        ZonedDateTime nyWinterZoned = winterDateTime.atZone(ZoneId.of("America/New_York"));

        System.out.println("\nWinter time (zone auto-adjusts):");
        System.out.println("Winter zoned: " + nyWinterZoned);
    }
}
```

# Other Date Classes

## Legacy Date Classes (Pre-Java 8)

While Java 8+ introduced the modern date-time API, it's important to understand legacy classes for maintaining older code and integration with legacy systems.

### Date Class

```java
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class LegacyDateExample {
    public static void main(String[] args) {
        // Creating Date objects
        Date now = new Date();
        Date specificDate = new Date(124, 7, 15); // Year 2024 (124 years since 1900), Month 7 (August, 0-based)
        Date epochTime = new Date(0); // January 1, 1970

        System.out.println("Legacy Date examples:");
        System.out.println("Current date: " + now);
        System.out.println("Specific date: " + specificDate);
        System.out.println("Epoch time: " + epochTime);

        // Date formatting with SimpleDateFormat
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat readableFormatter = new SimpleDateFormat("MMMM dd, yyyy 'at' hh:mm a");

        System.out.println("\nFormatted dates:");
        System.out.println("Standard format: " + formatter.format(now));
        System.out.println("Readable format: " + readableFormatter.format(now));

        // Parsing dates
        try {
            Date parsed = formatter.parse("2024-08-15 14:30:00");
            System.out.println("Parsed date: " + parsed);
        } catch (ParseException e) {
            System.out.println("Failed to parse date: " + e.getMessage());
        }

        // Date operations (limited)
        Date future = new Date(now.getTime() + (7 * 24 * 60 * 60 * 1000L)); // Add 7 days
        System.out.println("One week later: " + formatter.format(future));
    }
}
```

### Calendar Class

```java
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class CalendarExample {
    public static void main(String[] args) {
        // Creating Calendar instances
        Calendar now = Calendar.getInstance();
        Calendar specificCal = new GregorianCalendar(2024, Calendar.AUGUST, 15, 14, 30);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEEE");

        System.out.println("Calendar examples:");
        System.out.println("Current: " + formatter.format(now.getTime()));
        System.out.println("Specific: " + formatter.format(specificCal.getTime()));

        // Getting calendar fields
        System.out.println("\nCalendar fields:");
        System.out.println("Year: " + now.get(Calendar.YEAR));
        System.out.println("Month: " + (now.get(Calendar.MONTH) + 1)); // 0-based, so add 1
        System.out.println("Day: " + now.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour: " + now.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + now.get(Calendar.MINUTE));
        System.out.println("Day of week: " + now.get(Calendar.DAY_OF_WEEK));

        // Calendar operations
        Calendar future = (Calendar) now.clone();
        future.add(Calendar.DAY_OF_MONTH, 30);
        future.add(Calendar.HOUR_OF_DAY, 2);

        System.out.println("\nAfter adding 30 days and 2 hours:");
        System.out.println(formatter.format(future.getTime()));

        // Setting specific fields
        Calendar custom = Calendar.getInstance();
        custom.set(Calendar.YEAR, 2024);
        custom.set(Calendar.MONTH, Calendar.DECEMBER);
        custom.set(Calendar.DAY_OF_MONTH, 25);
        custom.set(Calendar.HOUR_OF_DAY, 0);
        custom.set(Calendar.MINUTE, 0);
        custom.set(Calendar.SECOND, 0);

        System.out.println("Christmas 2024: " + formatter.format(custom.getTime()));
    }
}
```

### Converting Between Legacy and Modern APIs

```java
import java.time.*;
import java.util.Date;
import java.util.Calendar;

public class DateConversions {
    public static void main(String[] args) {
        // Modern to Legacy conversions
        LocalDateTime modernDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        // LocalDateTime to Date (via Instant)
        Date dateFromLocal = Date.from(modernDateTime.atZone(ZoneId.systemDefault()).toInstant());

        // ZonedDateTime to Date
        Date dateFromZoned = Date.from(zonedDateTime.toInstant());

        System.out.println("Modern to Legacy:");
        System.out.println("Modern DateTime: " + modernDateTime);
        System.out.println("Converted to Date: " + dateFromLocal);
        System.out.println("Zoned to Date: " + dateFromZoned);

        // Legacy to Modern conversions
        Date legacyDate = new Date();

        // Date to LocalDateTime
        LocalDateTime localFromDate = legacyDate.toInstant()
                                                .atZone(ZoneId.systemDefault())
                                                .toLocalDateTime();

        // Date to ZonedDateTime
        ZonedDateTime zonedFromDate = legacyDate.toInstant()
                                               .atZone(ZoneId.systemDefault());

        // Date to Instant
        Instant instantFromDate = legacyDate.toInstant();

        System.out.println("\nLegacy to Modern:");
        System.out.println("Legacy Date: " + legacyDate);
        System.out.println("To LocalDateTime: " + localFromDate);
        System.out.println("To ZonedDateTime: " + zonedFromDate);
        System.out.println("To Instant: " + instantFromDate);

        // Calendar conversions
        Calendar calendar = Calendar.getInstance();
        ZonedDateTime zonedFromCalendar = calendar.toInstant()
                                                 .atZone(calendar.getTimeZone().toZoneId());

        System.out.println("\nCalendar conversion:");
        System.out.println("Calendar: " + calendar.getTime());
        System.out.println("To ZonedDateTime: " + zonedFromCalendar);
    }
}
```

## Specialized Date Classes

### Instant Class

```java
import java.time.Instant;
import java.time.Duration;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class InstantExample {
    public static void main(String[] args) {
        // Creating Instant objects
        Instant now = Instant.now();
        Instant epoch = Instant.EPOCH; // 1970-01-01T00:00:00Z
        Instant fromMillis = Instant.ofEpochMilli(System.currentTimeMillis());
        Instant fromSeconds = Instant.ofEpochSecond(1692115800L); // Unix timestamp

        System.out.println("Instant examples:");
        System.out.println("Now: " + now);
        System.out.println("Epoch: " + epoch);
        System.out.println("From millis: " + fromMillis);
        System.out.println("From seconds: " + fromSeconds);

        // Instant operations
        Instant later = now.plusSeconds(3600); // Add 1 hour
        Instant earlier = now.minusSeconds(1800); // Subtract 30 minutes

        System.out.println("\nInstant operations:");
        System.out.println("1 hour later: " + later);
        System.out.println("30 minutes earlier: " + earlier);

        // Duration between instants
        Duration duration = Duration.between(earlier, later);
        System.out.println("Duration: " + duration.toMinutes() + " minutes");

        // Converting to other types
        LocalDateTime localDateTime = now.atZone(ZoneId.systemDefault()).toLocalDateTime();
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("UTC"));

        System.out.println("\nConversions:");
        System.out.println("To LocalDateTime: " + localDateTime);
        System.out.println("To ZonedDateTime: " + zonedDateTime);

        // Machine-readable vs human-readable
        System.out.println("\nTimestamp representations:");
        System.out.println("Epoch seconds: " + now.getEpochSecond());
        System.out.println("Epoch millis: " + now.toEpochMilli());
        System.out.println("ISO string: " + now.toString());
    }
}
```

### Period and Duration Classes

```java
import java.time.*;
import java.time.temporal.ChronoUnit;

public class PeriodDurationExample {
    public static void main(String[] args) {
        // Period - date-based amount of time
        Period oneMonth = Period.ofMonths(1);
        Period twoWeeks = Period.ofWeeks(2);
        Period complex = Period.of(1, 6, 15); // 1 year, 6 months, 15 days

        System.out.println("Period examples:");
        System.out.println("One month: " + oneMonth);
        System.out.println("Two weeks: " + twoWeeks);
        System.out.println("Complex period: " + complex);

        // Duration - time-based amount of time
        Duration oneHour = Duration.ofHours(1);
        Duration thirtyMinutes = Duration.ofMinutes(30);
        Duration precise = Duration.of(90, ChronoUnit.SECONDS);

        System.out.println("\nDuration examples:");
        System.out.println("One hour: " + oneHour);
        System.out.println("Thirty minutes: " + thirtyMinutes);
        System.out.println("90 seconds: " + precise);

        // Using Period with dates
        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plus(complex);
        LocalDate pastDate = today.minus(oneMonth);

        System.out.println("\nUsing Period with dates:");
        System.out.println("Today: " + today);
        System.out.println("Future date: " + futureDate);
        System.out.println("Past date: " + pastDate);

        // Using Duration with time
        LocalTime currentTime = LocalTime.now();
        LocalTime laterTime = currentTime.plus(oneHour);
        LocalTime earlierTime = currentTime.minus(thirtyMinutes);

        System.out.println("\nUsing Duration with time:");
        System.out.println("Current time: " + currentTime);
        System.out.println("Later time: " + laterTime);
        System.out.println("Earlier time: " + earlierTime);

        // Calculating periods and durations
        LocalDate birthday = LocalDate.of(1995, 6, 15);
        Period age = Period.between(birthday, today);
        System.out.println("\nAge calculation:");
        System.out.println("Age: " + age.getYears() + " years, " +
                          age.getMonths() + " months, " + age.getDays() + " days");

        LocalDateTime start = LocalDateTime.of(2024, 8, 15, 9, 0);
        LocalDateTime end = LocalDateTime.of(2024, 8, 15, 17, 30);
        Duration workDay = Duration.between(start, end);
        System.out.println("\nWork day duration:");
        System.out.println("Duration: " + workDay.toHours() + " hours " +
                          (workDay.toMinutes() % 60) + " minutes");
    }
}
```

### Practical Date Application

```java
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class DateApplicationExample {
    public static void main(String[] args) {
        // Event scheduling system
        EventScheduler scheduler = new EventScheduler();

        // Add some events
        scheduler.addEvent("Team Meeting", LocalDateTime.of(2024, 8, 15, 10, 0));
        scheduler.addEvent("Project Deadline", LocalDateTime.of(2024, 8, 20, 17, 0));
        scheduler.addEvent("Conference Call", LocalDateTime.of(2024, 8, 16, 14, 30));

        // Display upcoming events
        scheduler.displayUpcomingEvents();

        // Age calculator
        AgeCalculator.calculateAge(LocalDate.of(1995, 6, 15));

        // Business day calculator
        BusinessDayCalculator.calculateBusinessDays(
            LocalDate.of(2024, 8, 15),
            LocalDate.of(2024, 8, 30)
        );
    }
}

class EventScheduler {
    private List<Event> events = new ArrayList<>();

    public void addEvent(String name, LocalDateTime dateTime) {
        events.add(new Event(name, dateTime));
    }

    public void displayUpcomingEvents() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' h:mm a");

        System.out.println("Upcoming Events:");
        events.stream()
              .filter(event -> event.getDateTime().isAfter(now))
              .sorted((e1, e2) -> e1.getDateTime().compareTo(e2.getDateTime()))
              .forEach(event -> {
                  long daysUntil = ChronoUnit.DAYS.between(now.toLocalDate(),
                                                          event.getDateTime().toLocalDate());
                  System.out.printf("%-20s: %s (%d days from now)%n",
                                   event.getName(),
                                   event.getDateTime().format(formatter),
                                   daysUntil);
              });
    }

    private static class Event {
        private String name;
        private LocalDateTime dateTime;

        public Event(String name, LocalDateTime dateTime) {
            this.name = name;
            this.dateTime = dateTime;
        }

        public String getName() { return name; }
        public LocalDateTime getDateTime() { return dateTime; }
    }
}

class AgeCalculator {
    public static void calculateAge(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthDate, today);
        long totalDays = ChronoUnit.DAYS.between(birthDate, today);

        System.out.println("\nAge Calculation:");
        System.out.println("Birth date: " + birthDate);
        System.out.println("Age: " + age.getYears() + " years, " +
                          age.getMonths() + " months, " + age.getDays() + " days");
        System.out.println("Total days lived: " + totalDays);

        // Calculate next birthday
        LocalDate nextBirthday = birthDate.withYear(today.getYear());
        if (nextBirthday.isBefore(today) || nextBirthday.equals(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }
        long daysUntilBirthday = ChronoUnit.DAYS.between(today, nextBirthday);
        System.out.println("Days until next birthday: " + daysUntilBirthday);
    }
}

class BusinessDayCalculator {
    public static void calculateBusinessDays(LocalDate startDate, LocalDate endDate) {
        long totalDays = ChronoUnit.DAYS.between(startDate, endDate);
        long businessDays = 0;

        LocalDate current = startDate;
        while (!current.isAfter(endDate)) {
            DayOfWeek dayOfWeek = current.getDayOfWeek();
            if (dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY) {
                businessDays++;
            }
            current = current.plusDays(1);
        }

        System.out.println("\nBusiness Day Calculation:");
        System.out.println("Start date: " + startDate);
        System.out.println("End date: " + endDate);
        System.out.println("Total days: " + totalDays);
        System.out.println("Business days: " + businessDays);
        System.out.println("Weekend days: " + (totalDays - businessDays));
    }
}
```

# The Problem With Double

## Understanding Floating-Point Precision Issues

The `double` and `float` data types in Java use IEEE 754 floating-point representation, which can lead to precision issues when dealing with decimal numbers. This is particularly problematic in financial calculations where exact precision is required.

### Demonstrating the Problem

```java
public class DoublePrecisionProblem {
    public static void main(String[] args) {
        // Basic precision issues
        double result1 = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 = " + result1); // 0.30000000000000004
        System.out.println("Is 0.1 + 0.2 == 0.3? " + (result1 == 0.3)); // false

        // Financial calculation problems
        double price = 0.1;
        double tax = 0.02;
        double total = price + tax;
        System.out.println("Price: $" + price); // $0.1
        System.out.println("Tax: $" + tax); // $0.02
        System.out.println("Total: $" + total); // $0.12000000000000001

        // Multiplication precision issues
        double value = 0.1;
        double result2 = value * 3;
        System.out.println("0.1 * 3 = " + result2); // 0.30000000000000004

        // Subtraction precision issues
        double a = 1.0;
        double b = 0.9;
        double difference = a - b;
        System.out.println("1.0 - 0.9 = " + difference); // 0.09999999999999998

        // Cumulative errors in loops
        System.out.println("\nCumulative errors in loops:");
        double sum = 0.0;
        for (int i = 0; i < 10; i++) {
            sum += 0.1;
        }
        System.out.println("Sum of 0.1 ten times: " + sum); // 0.9999999999999999
        System.out.println("Is sum == 1.0? " + (sum == 1.0)); // false
    }
}
```

### Real-World Financial Problems

```java
public class FinancialCalculationProblems {
    public static void main(String[] args) {
        // Banking calculation example
        demonstrateBankingProblem();

        // Currency conversion issues
        demonstrateCurrencyProblem();

        // Interest calculation errors
        demonstrateInterestProblem();
    }

    private static void demonstrateBankingProblem() {
        System.out.println("=== Banking Calculation Problem ===");

        double accountBalance = 100.00;
        double withdrawalAmount = 99.99;
        double remainingBalance = accountBalance - withdrawalAmount;

        System.out.println("Account balance: $" + accountBalance); // $100.0
        System.out.println("Withdrawal: $" + withdrawalAmount); // $99.99
        System.out.println("Remaining: $" + remainingBalance); // $0.009999999999999787

        // This could cause issues in banking systems
        if (remainingBalance == 0.01) {
            System.out.println("Balance is exactly 1 cent");
        } else {
            System.out.println("Balance is NOT exactly 1 cent!"); // This executes
        }
    }

    private static void demonstrateCurrencyProblem() {
        System.out.println("\n=== Currency Conversion Problem ===");

        double usdAmount = 123.45;
        double exchangeRate = 1.18; // USD to EUR
        double eurAmount = usdAmount * exchangeRate;

        System.out.println("USD: $" + usdAmount); // $123.45
        System.out.println("Exchange rate: " + exchangeRate); // 1.18
        System.out.println("EUR: €" + eurAmount); // €145.671 (imprecise)

        // Rounding issues
        double rounded = Math.round(eurAmount * 100.0) / 100.0;
        System.out.println("Rounded EUR: €" + rounded); // Still might be imprecise
    }

    private static void demonstrateInterestProblem() {
        System.out.println("\n=== Interest Calculation Problem ===");

        double principal = 1000.00;
        double rate = 0.05; // 5% annual rate
        double periods = 12; // monthly compounding

        // Compound interest calculation
        double amount = principal;
        for (int i = 0; i < periods; i++) {
            amount += amount * (rate / 12);
        }

        System.out.println("Principal: $" + principal); // $1000.0
        System.out.println("Final amount: $" + amount); // Imprecise result

        // Expected vs actual
        double expected = 1051.16; // Calculated separately
        System.out.println("Expected: $" + expected); // $1051.16
        System.out.println("Difference: $" + Math.abs(amount - expected)); // Small but significant
    }
}
```

### Why This Happens

```java
public class WhyDoubleProblemsOccur {
    public static void main(String[] args) {
        // Binary representation limitations
        System.out.println("=== Binary Representation Issues ===");

        // Some decimal numbers cannot be represented exactly in binary
        System.out.println("0.1 in binary is infinite: 0.0001100110011...");
        System.out.println("0.2 in binary is infinite: 0.0011001100110011...");
        System.out.println("0.3 in binary is infinite: 0.010011001100110011...");

        // Demonstration of representation limits
        double value = 0.1;
        System.out.println("Exact representation of 0.1: " + String.format("%.17f", value));
        // 0.10000000000000001

        // IEEE 754 standard limitations
        System.out.println("\n=== IEEE 754 Limitations ===");
        System.out.println("Double precision: 64 bits");
        System.out.println("Sign: 1 bit, Exponent: 11 bits, Mantissa: 52 bits");
        System.out.println("Limited precision for decimal fractions");

        // Demonstrating machine epsilon
        double epsilon = 1.0;
        while (1.0 + epsilon != 1.0) {
            epsilon /= 2.0;
        }
        epsilon *= 2.0;
        System.out.println("Machine epsilon for double: " + epsilon); // ~2.22e-16
    }
}
```

### Common Workarounds (That Don't Always Work)

```java
public class CommonWorkarounds {
    public static void main(String[] args) {
        // Workaround 1: Rounding (still has issues)
        System.out.println("=== Rounding Workaround ===");
        double result1 = 0.1 + 0.2;
        double rounded = Math.round(result1 * 100.0) / 100.0;
        System.out.println("0.1 + 0.2 rounded: " + rounded); // 0.3
        System.out.println("Is rounded == 0.3? " + (rounded == 0.3)); // true (luck)

        // But rounding has its own issues
        double problematic = 0.1 + 0.2 + 0.3;
        double roundedProblematic = Math.round(problematic * 100.0) / 100.0;
        System.out.println("0.1 + 0.2 + 0.3: " + problematic); // 0.6000000000000001
        System.out.println("Rounded: " + roundedProblematic); // 0.6

        // Workaround 2: Epsilon comparison (better but complex)
        System.out.println("\n=== Epsilon Comparison ===");
        double a = 0.1 + 0.2;
        double b = 0.3;
        double epsilon = 1e-10;

        boolean isEqual = Math.abs(a - b) < epsilon;
        System.out.println("Using epsilon comparison: " + isEqual); // true

        // Workaround 3: Converting to integers (limited scope)
        System.out.println("\n=== Integer Conversion ===");
        int cents1 = (int) Math.round(0.1 * 100); // 10 cents
        int cents2 = (int) Math.round(0.2 * 100); // 20 cents
        int totalCents = cents1 + cents2; // 30 cents
        double totalDollars = totalCents / 100.0; // 0.3 dollars

        System.out.println("Using cents: " + totalDollars); // 0.3
        System.out.println("Is exact? " + (totalDollars == 0.3)); // true

        // But this approach has limitations with complex calculations
    }
}
```

# BigDecimal

## What is BigDecimal?

`BigDecimal` is a class in Java that provides exact decimal arithmetic. It's designed to handle decimal numbers with arbitrary precision, making it ideal for financial calculations, scientific computations, and any scenario where exact decimal precision is required.

### Creating BigDecimal Objects

```java
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalBasics {
    public static void main(String[] args) {
        // Creating BigDecimal objects - different methods

        // 1. From String (RECOMMENDED)
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");

        // 2. Using valueOf for int/long
        BigDecimal bd3 = BigDecimal.valueOf(100);
        BigDecimal bd4 = BigDecimal.valueOf(1234567890L);

        // 3. Using valueOf for double (safer than constructor)
        BigDecimal bd5 = BigDecimal.valueOf(0.1); // Converts through string internally

        // 4. From int/double constructor (AVOID for double)
        BigDecimal bd6 = new BigDecimal(100); // OK for int
        BigDecimal bd7 = new BigDecimal(0.1); // AVOID - inherits double precision issues

        System.out.println("From string '0.1': " + bd1); // 0.1
        System.out.println("From string '0.2': " + bd2); // 0.2
        System.out.println("From valueOf(100): " + bd3); // 100
        System.out.println("From valueOf(0.1): " + bd5); // 0.1
        System.out.println("From double constructor: " + bd7); // 0.1000000000000000055511151231257827021181583404541015625

        // Predefined constants
        System.out.println("\nPredefined constants:");
        System.out.println("ZERO: " + BigDecimal.ZERO); // 0
        System.out.println("ONE: " + BigDecimal.ONE); // 1
        System.out.println("TEN: " + BigDecimal.TEN); // 10
    }
}
```

### Basic BigDecimal Operations

```java
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static void main(String[] args) {
        // Basic arithmetic operations
        BigDecimal a = new BigDecimal("10.25");
        BigDecimal b = new BigDecimal("3.75");

        // Addition
        BigDecimal sum = a.add(b);
        System.out.println("Addition: " + a + " + " + b + " = " + sum); // 14.00

        // Subtraction
        BigDecimal difference = a.subtract(b);
        System.out.println("Subtraction: " + a + " - " + b + " = " + difference); // 6.50

        // Multiplication
        BigDecimal product = a.multiply(b);
        System.out.println("Multiplication: " + a + " × " + b + " = " + product); // 38.4375

        // Division (requires rounding mode)
        BigDecimal quotient = a.divide(b, 4, RoundingMode.HALF_UP);
        System.out.println("Division: " + a + " ÷ " + b + " = " + quotient); // 2.7333

        // Powers
        BigDecimal squared = a.pow(2);
        System.out.println("Power: " + a + "² = " + squared); // 105.0625

        // Absolute value
        BigDecimal negative = new BigDecimal("-15.75");
        BigDecimal absolute = negative.abs();
        System.out.println("Absolute: |" + negative + "| = " + absolute); // 15.75

        // Negate
        BigDecimal negated = a.negate();
        System.out.println("Negate: -(" + a + ") = " + negated); // -10.25
    }
}
```

### Solving the Double Problem with BigDecimal

```java
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SolvingDoubleProblem {
    public static void main(String[] args) {
        // Problem 1: Basic precision - SOLVED
        System.out.println("=== Problem 1: Basic Precision ===");

        // With double (problematic)
        double doubleResult = 0.1 + 0.2;
        System.out.println("Double: 0.1 + 0.2 = " + doubleResult); // 0.30000000000000004

        // With BigDecimal (exact)
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");
        BigDecimal bdResult = bd1.add(bd2);
        System.out.println("BigDecimal: 0.1 + 0.2 = " + bdResult); // 0.3

        // Problem 2: Financial calculations - SOLVED
        System.out.println("\n=== Problem 2: Financial Calculations ===");

        BigDecimal price = new BigDecimal("19.99");
        BigDecimal taxRate = new BigDecimal("0.08"); // 8% tax
        BigDecimal tax = price.multiply(taxRate);
        BigDecimal total = price.add(tax);

        System.out.println("Price: $" + price); // $19.99
        System.out.println("Tax: $" + tax.setScale(2, RoundingMode.HALF_UP)); // $1.60
        System.out.println("Total: $" + total.setScale(2, RoundingMode.HALF_UP)); // $21.59

        // Problem 3: Currency conversion - SOLVED
        System.out.println("\n=== Problem 3: Currency Conversion ===");

        BigDecimal usdAmount = new BigDecimal("123.45");
        BigDecimal exchangeRate = new BigDecimal("1.18");
        BigDecimal eurAmount = usdAmount.multiply(exchangeRate);

        System.out.println("USD: $" + usdAmount); // $123.45
        System.out.println("EUR: €" + eurAmount.setScale(2, RoundingMode.HALF_UP)); // €145.67

        // Problem 4: Interest calculation - SOLVED
        System.out.println("\n=== Problem 4: Interest Calculation ===");

        BigDecimal principal = new BigDecimal("1000.00");
        BigDecimal monthlyRate = new BigDecimal("0.05").divide(new BigDecimal("12"), 10, RoundingMode.HALF_UP);
        BigDecimal amount = principal;

        for (int i = 0; i < 12; i++) {
            BigDecimal interest = amount.multiply(monthlyRate);
            amount = amount.add(interest);
        }

        System.out.println("Principal: $" + principal); // $1000.00
        System.out.println("Final amount: $" + amount.setScale(2, RoundingMode.HALF_UP)); // $1051.16
    }
}
```

### Comparison Operations

```java
import java.math.BigDecimal;

public class BigDecimalComparison {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("10.50");
        BigDecimal b = new BigDecimal("10.5"); // Same value, different scale
        BigDecimal c = new BigDecimal("15.25");

        // Using compareTo() - RECOMMENDED
        System.out.println("=== Using compareTo() ===");
        System.out.println("a.compareTo(b): " + a.compareTo(b)); // 0 (equal values)
        System.out.println("a.compareTo(c): " + a.compareTo(c)); // -1 (a < c)
        System.out.println("c.compareTo(a): " + c.compareTo(a)); // 1 (c > a)

        // Comparison methods
        System.out.println("\n=== Comparison Methods ===");
        System.out.println("a equals b (value): " + (a.compareTo(b) == 0)); // true
        System.out.println("a less than c: " + (a.compareTo(c) < 0)); // true
        System.out.println("c greater than a: " + (c.compareTo(a) > 0)); // true

        // equals() vs compareTo() difference
        System.out.println("\n=== equals() vs compareTo() ===");
        System.out.println("a.equals(b): " + a.equals(b)); // false (different scale)
        System.out.println("a.compareTo(b) == 0: " + (a.compareTo(b) == 0)); // true (same value)

        // Min and Max
        BigDecimal min = a.min(c);
        BigDecimal max = a.max(c);
        System.out.println("\nMin of " + a + " and " + c + ": " + min); // 10.50
        System.out.println("Max of " + a + " and " + c + ": " + max); // 15.25
    }
}
```

### Scale and Precision

```java
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ScaleAndPrecision {
    public static void main(String[] args) {
        // Understanding scale and precision
        BigDecimal bd1 = new BigDecimal("123.45");
        BigDecimal bd2 = new BigDecimal("123.4500");
        BigDecimal bd3 = new BigDecimal("1234500");

        System.out.println("=== Scale and Precision ===");
        System.out.println("Value: " + bd1 + ", Scale: " + bd1.scale() + ", Precision: " + bd1.precision());
        // Value: 123.45, Scale: 2, Precision: 5
        System.out.println("Value: " + bd2 + ", Scale: " + bd2.scale() + ", Precision: " + bd2.precision());
        // Value: 123.4500, Scale: 4, Precision: 7
        System.out.println("Value: " + bd3 + ", Scale: " + bd3.scale() + ", Precision: " + bd3.precision());
        // Value: 1234500, Scale: 0, Precision: 7

        // Setting scale
        System.out.println("\n=== Setting Scale ===");
        BigDecimal original = new BigDecimal("123.456789");

        BigDecimal scaled2 = original.setScale(2, RoundingMode.HALF_UP);
        BigDecimal scaled4 = original.setScale(4, RoundingMode.HALF_UP);
        BigDecimal scaled0 = original.setScale(0, RoundingMode.HALF_UP);

        System.out.println("Original: " + original); // 123.456789
        System.out.println("Scale 2: " + scaled2); // 123.46
        System.out.println("Scale 4: " + scaled4); // 123.4568
        System.out.println("Scale 0: " + scaled0); // 123

        // Stripping trailing zeros
        System.out.println("\n=== Stripping Trailing Zeros ===");
        BigDecimal withZeros = new BigDecimal("123.4500");
        BigDecimal stripped = withZeros.stripTrailingZeros();

        System.out.println("With zeros: " + withZeros + " (scale: " + withZeros.scale() + ")"); // 123.4500 (scale: 4)
        System.out.println("Stripped: " + stripped + " (scale: " + stripped.scale() + ")"); // 123.45 (scale: 2)
    }
}
```

# Exploring BigDecimal Methods

## Comprehensive Method Overview

BigDecimal provides a rich set of methods for precise decimal arithmetic, formatting, and manipulation. Let's explore the most important and commonly used methods.

### Arithmetic Methods

```java
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.MathContext;

public class ArithmeticMethods {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("125.75");
        BigDecimal b = new BigDecimal("25.25");

        // Basic arithmetic operations
        System.out.println("=== Basic Arithmetic ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("add: " + a.add(b)); // 151.00
        System.out.println("subtract: " + a.subtract(b)); // 100.50
        System.out.println("multiply: " + a.multiply(b)); // 3175.1875

        // Division with different approaches
        System.out.println("\n=== Division Methods ===");

        // Simple division (when exact)
        BigDecimal c = new BigDecimal("100");
        BigDecimal d = new BigDecimal("4");
        System.out.println("Exact division: " + c.divide(d)); // 25

        // Division with scale and rounding
        BigDecimal result1 = a.divide(b, 3, RoundingMode.HALF_UP);
        System.out.println("Division with scale 3: " + result1); // 4.980

        // Division with MathContext
        MathContext mc = new MathContext(5, RoundingMode.HALF_UP);
        BigDecimal result2 = a.divide(b, mc);
        System.out.println("Division with MathContext: " + result2); // 4.9802

        // divideAndRemainder
        BigDecimal dividend = new BigDecimal("127");
        BigDecimal divisor = new BigDecimal("25");
        BigDecimal[] divResult = dividend.divideAndRemainder(divisor);
        System.out.println("127 ÷ 25 = " + divResult[0] + " remainder " + divResult[1]); // 5 remainder 2

        // remainder
        BigDecimal remainder = dividend.remainder(divisor);
        System.out.println("127 % 25 = " + remainder); // 2

        // Power operations
        System.out.println("\n=== Power Operations ===");
        BigDecimal base = new BigDecimal("2.5");
        System.out.println(base + "² = " + base.pow(2)); // 6.25
        System.out.println(base + "³ = " + base.pow(3)); // 15.625

        // Power with MathContext for large exponents
        BigDecimal largePower = base.pow(10, mc);
        System.out.println(base + "¹⁰ = " + largePower); // 9536.7 (rounded)
    }
}
```

### Rounding Modes Demonstration

```java
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingModes {
    public static void main(String[] args) {
        BigDecimal value1 = new BigDecimal("2.125"); // Exactly between 2.12 and 2.13
        BigDecimal value2 = new BigDecimal("2.135"); // Exactly between 2.13 and 2.14
        BigDecimal negative = new BigDecimal("-2.125");

        System.out.println("Original values: " + value1 + ", " + value2 + ", " + negative);
        System.out.println();

        // Different rounding modes
        RoundingMode[] modes = {
            RoundingMode.UP,
            RoundingMode.DOWN,
            RoundingMode.CEILING,
            RoundingMode.FLOOR,
            RoundingMode.HALF_UP,
            RoundingMode.HALF_DOWN,
            RoundingMode.HALF_EVEN
        };

        System.out.printf("%-15s %-8s %-8s %-8s%n", "Rounding Mode", value1, value2, negative);
        System.out.println("------------------------------------------------");

        for (RoundingMode mode : modes) {
            System.out.printf("%-15s %-8s %-8s %-8s%n",
                mode.name(),
                value1.setScale(2, mode),
                value2.setScale(2, mode),
                negative.setScale(2, mode)
            );
        }

        // Practical examples
        System.out.println("\n=== Practical Rounding Examples ===");

        // Financial rounding (typically HALF_UP)
        BigDecimal price = new BigDecimal("19.996");
        BigDecimal financialRound = price.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Financial rounding $" + price + " → $" + financialRound); // $19.996 → $20.00

        // Scientific rounding (typically HALF_EVEN for reducing bias)
        BigDecimal measurement = new BigDecimal("123.45");
        BigDecimal scientificRound = measurement.setScale(1, RoundingMode.HALF_EVEN);
        System.out.println("Scientific rounding " + measurement + " → " + scientificRound); // 123.45 → 123.4
    }
}
```

### Utility and Comparison Methods

```java
import java.math.BigDecimal;
import java.math.RoundingMode;

public class UtilityMethods {
    public static void main(String[] args) {
        // Absolute value and sign operations
        System.out.println("=== Sign Operations ===");
        BigDecimal positive = new BigDecimal("125.75");
        BigDecimal negative = new BigDecimal("-125.75");
        BigDecimal zero = BigDecimal.ZERO;

        System.out.println("abs(" + negative + ") = " + negative.abs()); // 125.75
        System.out.println("negate(" + positive + ") = " + positive.negate()); // -125.75
        System.out.println("signum(" + positive + ") = " + positive.signum()); // 1
        System.out.println("signum(" + negative + ") = " + negative.signum()); // -1
        System.out.println("signum(" + zero + ") = " + zero.signum()); // 0

        // Min and Max operations
        System.out.println("\n=== Min/Max Operations ===");
        BigDecimal a = new BigDecimal("45.67");
        BigDecimal b = new BigDecimal("123.45");

        System.out.println("min(" + a + ", " + b + ") = " + a.min(b)); // 45.67
        System.out.println("max(" + a + ", " + b + ") = " + a.max(b)); // 123.45

        // Scale manipulation
        System.out.println("\n=== Scale Manipulation ===");
        BigDecimal original = new BigDecimal("123.4500");

        System.out.println("Original: " + original + " (scale: " + original.scale() + ")");
        System.out.println("stripTrailingZeros: " + original.stripTrailingZeros() +
                          " (scale: " + original.stripTrailingZeros().scale() + ")");

        // Moving decimal point
        BigDecimal moveRight = original.movePointRight(2);
        BigDecimal moveLeft = original.movePointLeft(1);

        System.out.println("movePointRight(2): " + moveRight); // 12345.00
        System.out.println("movePointLeft(1): " + moveLeft); // 12.34500

        // Scale by power of 10
        BigDecimal scaled = original.scaleByPowerOfTen(3);
        System.out.println("scaleByPowerOfTen(3): " + scaled); // 123450.0

        // Unscaled value
        System.out.println("\n=== Internal Representation ===");
        BigDecimal decimal = new BigDecimal("123.45");
        System.out.println("Value: " + decimal); // 123.45
        System.out.println("Unscaled value: " + decimal.unscaledValue()); // 12345
        System.out.println("Scale: " + decimal.scale()); // 2
        System.out.println("Precision: " + decimal.precision()); // 5
    }
}
```

### Conversion Methods

```java
import java.math.BigDecimal;
import java.math.BigInteger;

public class ConversionMethods {
    public static void main(String[] args) {
        BigDecimal decimal = new BigDecimal("123.456");

        // Converting to primitive types
        System.out.println("=== Primitive Conversions ===");
        System.out.println("Original: " + decimal);
        System.out.println("intValue(): " + decimal.intValue()); // 123 (truncated)
        System.out.println("longValue(): " + decimal.longValue()); // 123
        System.out.println("floatValue(): " + decimal.floatValue()); // 123.456 (may lose precision)
        System.out.println("doubleValue(): " + decimal.doubleValue()); // 123.456 (may lose precision)

        // Exact conversions (throw exception if not exact)
        System.out.println("\n=== Exact Conversions ===");

        BigDecimal exactInt = new BigDecimal("123");
        BigDecimal exactLong = new BigDecimal("123456789");

        try {
            System.out.println("intValueExact(): " + exactInt.intValueExact()); // 123
            System.out.println("longValueExact(): " + exactLong.longValueExact()); // 123456789

            // This would throw ArithmeticException
            // decimal.intValueExact(); // Has fractional part
        } catch (ArithmeticException e) {
            System.out.println("Cannot convert to exact int: " + e.getMessage());
        }

        // BigInteger conversion
        System.out.println("\n=== BigInteger Conversion ===");
        BigDecimal forBigInt = new BigDecimal("123456789012345678901234567890");
        BigInteger bigInt = forBigInt.toBigInteger();
        System.out.println("toBigInteger(): " + bigInt);

        try {
            BigInteger exactBigInt = decimal.toBigIntegerExact();
            System.out.println("toBigIntegerExact(): " + exactBigInt);
        } catch (ArithmeticException e) {
            System.out.println("Cannot convert to exact BigInteger: " + e.getMessage());
        }

        // String representations
        System.out.println("\n=== String Representations ===");
        BigDecimal scientific = new BigDecimal("1.23456E+5");

        System.out.println("toString(): " + scientific.toString()); // 123456
        System.out.println("toPlainString(): " + scientific.toPlainString()); // 123456
        System.out.println("toEngineeringString(): " + scientific.toEngineeringString()); // 123.456E+3

        // Large number formatting
        BigDecimal large = new BigDecimal("1.23456789E+10");
        System.out.println("\nLarge number representations:");
        System.out.println("toString(): " + large.toString()); // 1.23456789E+10
        System.out.println("toPlainString(): " + large.toPlainString()); // 12345678900
        System.out.println("toEngineeringString(): " + large.toEngineeringString()); // 12.3456789E+9
    }
}
```

### Real-World BigDecimal Applications

```java
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class RealWorldApplications {
    public static void main(String[] args) {
        // Banking application
        BankingCalculator.demonstrateTransactions();

        // E-commerce pricing
        ECommercePricing.calculateOrder();

        // Financial calculations
        FinancialCalculator.calculateCompoundInterest();
    }
}

class BankingCalculator {
    public static void demonstrateTransactions() {
        System.out.println("=== Banking Transaction Example ===");

        BigDecimal balance = new BigDecimal("1000.00");
        List<BigDecimal> transactions = List.of(
            new BigDecimal("-150.75"),    // Withdrawal
            new BigDecimal("2500.00"),    // Deposit
            new BigDecimal("-45.99"),     // Purchase
            new BigDecimal("-12.50")      // Fee
        );

        System.out.println("Starting balance: $" + balance);

        for (BigDecimal transaction : transactions) {
            balance = balance.add(transaction);
            String type = transaction.signum() >= 0 ? "Deposit" : "Withdrawal";
            System.out.printf("%s: $%s, New balance: $%s%n",
                type, transaction.abs(), balance);
        }

        System.out.println("Final balance: $" + balance.setScale(2, RoundingMode.HALF_UP));
    }
}

class ECommercePricing {
    public static void calculateOrder() {
        System.out.println("\n=== E-Commerce Order Calculation ===");

        // Order items
        List<OrderItem> items = List.of(
            new OrderItem("Widget A", new BigDecimal("19.99"), 2),
            new OrderItem("Widget B", new BigDecimal("45.50"), 1),
            new OrderItem("Widget C", new BigDecimal("12.75"), 3)
        );

        BigDecimal subtotal = BigDecimal.ZERO;

        System.out.println("Order Items:");
        for (OrderItem item : items) {
            BigDecimal itemTotal = item.price.multiply(BigDecimal.valueOf(item.quantity));
            subtotal = subtotal.add(itemTotal);
            System.out.printf("%-10s: $%s × %d = $%s%n",
                item.name, item.price, item.quantity, itemTotal);
        }

        // Calculate tax
        BigDecimal taxRate = new BigDecimal("0.0875"); // 8.75%
        BigDecimal tax = subtotal.multiply(taxRate).setScale(2, RoundingMode.HALF_UP);

        // Calculate shipping
        BigDecimal shipping = subtotal.compareTo(new BigDecimal("50.00")) >= 0
            ? BigDecimal.ZERO
            : new BigDecimal("5.99");

        BigDecimal total = subtotal.add(tax).add(shipping);

        System.out.println("\nOrder Summary:");
        System.out.println("Subtotal: $" + subtotal.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Tax (8.75%): $" + tax);
        System.out.println("Shipping: $" + shipping);
        System.out.println("Total: $" + total.setScale(2, RoundingMode.HALF_UP));
    }

    static class OrderItem {
        String name;
        BigDecimal price;
        int quantity;

        OrderItem(String name, BigDecimal price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }
}

class FinancialCalculator {
    public static void calculateCompoundInterest() {
        System.out.println("\n=== Compound Interest Calculation ===");

        BigDecimal principal = new BigDecimal("10000.00");
        BigDecimal annualRate = new BigDecimal("0.05"); // 5%
        int compoundingPeriods = 12; // Monthly
        int years = 5;

        // A = P(1 + r/n)^(nt)
        BigDecimal rate = annualRate.divide(BigDecimal.valueOf(compoundingPeriods), 10, RoundingMode.HALF_UP);
        BigDecimal onePlusRate = BigDecimal.ONE.add(rate);

        int totalPeriods = compoundingPeriods * years;
        BigDecimal amount = principal;

        // Calculate compound interest period by period for accuracy
        for (int i = 0; i < totalPeriods; i++) {
            amount = amount.multiply(onePlusRate);
        }

        amount = amount.setScale(2, RoundingMode.HALF_UP);
        BigDecimal interest = amount.subtract(principal);

        System.out.println("Principal: $" + principal);
        System.out.println("Annual rate: " + annualRate.multiply(new BigDecimal("100")) + "%");
        System.out.println("Compounding: Monthly");
        System.out.println("Time: " + years + " years");
        System.out.println();
        System.out.println("Final amount: $" + amount);
        System.out.println("Interest earned: $" + interest);

        // Effective annual rate
        BigDecimal effectiveRate = amount.divide(principal, 6, RoundingMode.HALF_UP)
                                        .subtract(BigDecimal.ONE)
                                        .divide(BigDecimal.valueOf(years), 6, RoundingMode.HALF_UP)
                                        .multiply(new BigDecimal("100"));
        System.out.println("Effective annual rate: " + effectiveRate.setScale(4, RoundingMode.HALF_UP) + "%");
    }
}
```

# Introduction to Code Organization

## Why Code Organization Matters

As Java applications grow in complexity, proper code organization becomes crucial for maintainability, scalability, and team collaboration. Well-organized code follows established patterns and separates concerns to create clean, readable, and maintainable applications.

### Benefits of Good Code Organization

- **Maintainability**: Easy to find, understand, and modify code
- **Scalability**: Structure supports growth and new features
- **Team Collaboration**: Clear patterns help multiple developers work together
- **Testability**: Separated concerns make unit testing easier
- **Reusability**: Organized components can be reused across projects

### Key Principles

1. **Separation of Concerns**: Each class should have a single responsibility
2. **Layer Separation**: Business logic, data access, and presentation should be separate
3. **Package Organization**: Related classes grouped logically
4. **Consistent Naming**: Clear, descriptive names for classes and packages

# Packages

## Understanding Java Packages

Packages in Java are namespaces that organize related classes and interfaces. They provide a way to group related functionality and avoid naming conflicts.

### Package Structure Example

```java
com.company.projectname.
├── model/          // Data classes (POJOs, entities)
├── service/        // Business logic
├── dao/           // Data Access Objects
├── util/          // Utility classes
├── controller/    // Controllers (for web apps)
└── exception/     // Custom exceptions
```

### Package Declaration and Usage

```java
// File: com/company/ecommerce/model/Product.java
package com.company.ecommerce.model;

public class Product {
    private String id;
    private String name;
    private double price;

    // constructors, getters, setters
}
```

```java
// File: com/company/ecommerce/service/ProductService.java
package com.company.ecommerce.service;

import com.company.ecommerce.model.Product;
import com.company.ecommerce.dao.ProductDAO;

public class ProductService {
    private ProductDAO productDAO;

    public Product findProduct(String id) {
        return productDAO.findById(id);
    }
}
```

### Best Practices for Packages

- Use reverse domain naming: `com.companyname.projectname`
- Keep package names lowercase
- Group related functionality together
- Avoid deep nesting (generally 3-4 levels max)
- Use meaningful package names that describe the content

# Models

## What are Models (Data Classes)?

Models, also known as POJOs (Plain Old Java Objects) or entities, represent the data structure of your application. They encapsulate the properties and behavior of real-world entities.

### Characteristics of Good Models

- **Encapsulation**: Private fields with public getters/setters
- **Immutability**: Consider making fields final when appropriate
- **Validation**: Basic validation in setters
- **Meaningful Names**: Clear, descriptive class and field names

### Example: E-commerce Models

```java
// User model
package com.ecommerce.model;

import java.time.LocalDateTime;
import java.util.List;

public class User {
    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDateTime createdAt;
    private List<Order> orders;

    // Constructors
    public User() {}

    public User(String email, String firstName, String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdAt = LocalDateTime.now();
    }

    // Getters and setters with validation
    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.email = email;
    }

    // Other getters/setters...
}
```

```java
// Product model
public class Product {
    private String id;
    private String name;
    private String description;
    private double price;
    private int stockQuantity;
    private Category category;

    // Constructor with validation
    public Product(String name, double price, int stockQuantity) {
        setName(name);
        setPrice(price);
        setStockQuantity(stockQuantity);
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    // Business method
    public boolean isInStock() {
        return stockQuantity > 0;
    }
}
```

### Model Design Patterns

- **Value Objects**: Immutable objects representing values
- **Entities**: Objects with identity (usually have ID field)
- **DTOs**: Data Transfer Objects for moving data between layers

# Service Classes

## Understanding Service Classes

Service classes contain the business logic of your application. They orchestrate operations between different components and implement the core functionality.

### Service Class Responsibilities

- **Business Logic**: Core application rules and workflows
- **Transaction Management**: Coordinate multiple operations
- **Validation**: Business rule validation
- **Coordination**: Orchestrate calls to DAOs and other services

### Example: E-commerce Service Classes

```java
package com.ecommerce.service;

import com.ecommerce.model.*;
import com.ecommerce.dao.*;
import java.util.List;

public class OrderService {
    private OrderDAO orderDAO;
    private ProductDAO productDAO;
    private UserDAO userDAO;
    private PaymentService paymentService;
    private InventoryService inventoryService;

    // Constructor injection
    public OrderService(OrderDAO orderDAO, ProductDAO productDAO,
                       UserDAO userDAO, PaymentService paymentService,
                       InventoryService inventoryService) {
        this.orderDAO = orderDAO;
        this.productDAO = productDAO;
        this.userDAO = userDAO;
        this.paymentService = paymentService;
        this.inventoryService = inventoryService;
    }

    // Business logic method
    public Order createOrder(String userId, List<OrderItem> items) {
        // 1. Validate user exists
        User user = userDAO.findById(userId);
        if (user == null) {
            throw new UserNotFoundException("User not found: " + userId);
        }

        // 2. Validate products and availability
        for (OrderItem item : items) {
            Product product = productDAO.findById(item.getProductId());
            if (product == null) {
                throw new ProductNotFoundException("Product not found: " + item.getProductId());
            }

            if (!inventoryService.isAvailable(product.getId(), item.getQuantity())) {
                throw new InsufficientStockException("Not enough stock for: " + product.getName());
            }
        }

        // 3. Calculate total
        double total = calculateOrderTotal(items);

        // 4. Create order
        Order order = new Order(userId, items, total);

        // 5. Reserve inventory
        inventoryService.reserveItems(items);

        // 6. Save order
        return orderDAO.save(order);
    }

    private double calculateOrderTotal(List<OrderItem> items) {
        return items.stream()
                   .mapToDouble(item -> {
                       Product product = productDAO.findById(item.getProductId());
                       return product.getPrice() * item.getQuantity();
                   })
                   .sum();
    }
}
```

### Service Layer Best Practices

- **Single Responsibility**: Each service handles one domain area
- **Dependency Injection**: Accept dependencies through constructor
- **Exception Handling**: Throw meaningful business exceptions
- **Transaction Boundaries**: Define clear transaction scopes

# Data Access Object (DAO)

## Understanding the DAO Pattern

The Data Access Object (DAO) pattern provides an abstract interface to the database or any data storage mechanism. It separates data access logic from business logic.

### DAO Pattern Benefits

- **Separation of Concerns**: Business logic separate from data access
- **Database Independence**: Easy to switch database implementations
- **Testability**: Mock DAOs for unit testing
- **Centralized Data Access**: All database operations in one place

### DAO Interface and Implementation

```java
// Generic DAO interface
package com.ecommerce.dao;

import java.util.List;
import java.util.Optional;

public interface GenericDAO<T, ID> {
    T save(T entity);
    T update(T entity);
    void delete(ID id);
    Optional<T> findById(ID id);
    List<T> findAll();
    boolean existsById(ID id);
}
```

```java
// Product DAO interface
public interface ProductDAO extends GenericDAO<Product, String> {
    List<Product> findByCategory(String categoryId);
    List<Product> findByPriceRange(double minPrice, double maxPrice);
    List<Product> findByNameContaining(String searchTerm);
    List<Product> findInStock();
}
```

```java
// Product DAO implementation
package com.ecommerce.dao.impl;

import com.ecommerce.dao.ProductDAO;
import com.ecommerce.model.Product;
import java.sql.*;
import java.util.*;

public class ProductDAOImpl implements ProductDAO {
    private Connection connection;

    public ProductDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Product save(Product product) {
        String sql = "INSERT INTO products (id, name, description, price, stock_quantity, category_id) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, product.getId());
            stmt.setString(2, product.getName());
            stmt.setString(3, product.getDescription());
            stmt.setDouble(4, product.getPrice());
            stmt.setInt(5, product.getStockQuantity());
            stmt.setString(6, product.getCategory().getId());

            stmt.executeUpdate();
            return product;
        } catch (SQLException e) {
            throw new DataAccessException("Error saving product", e);
        }
    }

    @Override
    public Optional<Product> findById(String id) {
        String sql = "SELECT * FROM products WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return Optional.of(mapResultSetToProduct(rs));
            }
            return Optional.empty();
        } catch (SQLException e) {
            throw new DataAccessException("Error finding product by id", e);
        }
    }

    @Override
    public List<Product> findByCategory(String categoryId) {
        String sql = "SELECT * FROM products WHERE category_id = ?";
        List<Product> products = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, categoryId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                products.add(mapResultSetToProduct(rs));
            }
        } catch (SQLException e) {
            throw new DataAccessException("Error finding products by category", e);
        }

        return products;
    }

    private Product mapResultSetToProduct(ResultSet rs) throws SQLException {
        // Map database row to Product object
        Product product = new Product();
        product.setId(rs.getString("id"));
        product.setName(rs.getString("name"));
        product.setDescription(rs.getString("description"));
        product.setPrice(rs.getDouble("price"));
        product.setStockQuantity(rs.getInt("stock_quantity"));
        // Set category...
        return product;
    }
}
```

# Connecting DAO and Service

## Dependency Injection and Service-DAO Integration

Services depend on DAOs to access data. This relationship should be managed through dependency injection to maintain loose coupling.

### Constructor Injection Pattern

```java
package com.ecommerce.service;

public class UserService {
    private final UserDAO userDAO;
    private final EmailService emailService;

    // Constructor injection - dependencies passed in
    public UserService(UserDAO userDAO, EmailService emailService) {
        this.userDAO = userDAO;
        this.emailService = emailService;
    }

    public User createUser(String email, String firstName, String lastName) {
        // Business validation
        if (userDAO.existsByEmail(email)) {
            throw new UserAlreadyExistsException("User with email already exists: " + email);
        }

        // Create user
        User user = new User(email, firstName, lastName);

        // Save to database
        User savedUser = userDAO.save(user);

        // Send welcome email
        emailService.sendWelcomeEmail(savedUser);

        return savedUser;
    }
}
```

### Factory Pattern for DAO Creation

```java
package com.ecommerce.factory;

public class DAOFactory {
    private Connection connection;

    public DAOFactory(Connection connection) {
        this.connection = connection;
    }

    public UserDAO createUserDAO() {
        return new UserDAOImpl(connection);
    }

    public ProductDAO createProductDAO() {
        return new ProductDAOImpl(connection);
    }

    public OrderDAO createOrderDAO() {
        return new OrderDAOImpl(connection);
    }
}
```

### Service Factory

```java
public class ServiceFactory {
    private DAOFactory daoFactory;

    public ServiceFactory(DAOFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    public UserService createUserService() {
        return new UserService(
            daoFactory.createUserDAO(),
            createEmailService()
        );
    }

    public OrderService createOrderService() {
        return new OrderService(
            daoFactory.createOrderDAO(),
            daoFactory.createProductDAO(),
            daoFactory.createUserDAO(),
            createPaymentService(),
            createInventoryService()
        );
    }
}
```

# N-Tier Architecture

## Understanding N-Tier Architecture

N-Tier (or Multi-Tier) architecture separates an application into distinct layers, each with specific responsibilities. This promotes maintainability, scalability, and testability.

### Common Tiers in Java Applications

#### 1. Presentation Tier (UI Layer)

- **Responsibility**: User interface, input validation, display logic
- **Components**: Controllers, JSPs, HTML/CSS, JavaScript
- **Example**: Web controllers, REST endpoints

#### 2. Business/Service Tier

- **Responsibility**: Business logic, workflow orchestration
- **Components**: Service classes, business rules
- **Example**: OrderService, UserService, PaymentService

#### 3. Data Access Tier

- **Responsibility**: Database interaction, data persistence
- **Components**: DAOs, repositories, database connections
- **Example**: ProductDAO, UserDAO, database drivers

#### 4. Database Tier

- **Responsibility**: Data storage and retrieval
- **Components**: Database server, stored procedures
- **Example**: MySQL, PostgreSQL, MongoDB

### Example: E-commerce Application Architecture

```java
// 1. Presentation Layer - Controller
package com.ecommerce.controller;

public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Handle HTTP requests
    public String getProduct(String productId) {
        try {
            Product product = productService.findProduct(productId);
            return convertToJSON(product);
        } catch (ProductNotFoundException e) {
            return errorResponse("Product not found");
        }
    }
}

// 2. Business Layer - Service
package com.ecommerce.service;

public class ProductService {
    private ProductDAO productDAO;
    private CategoryDAO categoryDAO;

    public Product findProduct(String id) {
        Product product = productDAO.findById(id)
            .orElseThrow(() -> new ProductNotFoundException("Product not found: " + id));

        // Business logic: Load category details
        Category category = categoryDAO.findById(product.getCategoryId())
            .orElse(new Category("Unknown", "Unknown Category"));
        product.setCategory(category);

        return product;
    }
}

// 3. Data Access Layer - DAO
package com.ecommerce.dao;

public class ProductDAOImpl implements ProductDAO {
    private Connection connection;

    public Optional<Product> findById(String id) {
        // Database interaction code
        String sql = "SELECT * FROM products WHERE id = ?";
        // Implementation details...
    }
}
```

### Benefits of N-Tier Architecture

- **Separation of Concerns**: Each layer has a specific purpose
- **Maintainability**: Changes in one layer don't affect others
- **Testability**: Each layer can be tested independently
- **Scalability**: Layers can be scaled independently
- **Team Development**: Different teams can work on different layers

### Architecture Flow Example

```
User Request → Controller → Service → DAO → Database
            ↓           ↓        ↓      ↓
         Validation  Business  Data   Storage
                     Logic   Access
```

# Utility Classes

## Understanding Utility Classes

Utility classes contain static methods that provide common functionality used across the application. They help eliminate code duplication and provide reusable helper methods.

### Characteristics of Good Utility Classes

- **Static Methods**: All methods should be static
- **No State**: Should not maintain instance variables
- **Final Class**: Prevent inheritance with `final` keyword
- **Private Constructor**: Prevent instantiation
- **Single Purpose**: Each utility class should focus on one area

### Example: Common Utility Classes

```java
// String utilities
package com.ecommerce.util;

public final class StringUtils {

    // Private constructor prevents instantiation
    private StringUtils() {
        throw new AssertionError("Utility class cannot be instantiated");
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean isValidEmail(String email) {
        if (isNullOrEmpty(email)) return false;
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }

    public static String capitalize(String str) {
        if (isNullOrEmpty(str)) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static String maskCreditCard(String cardNumber) {
        if (isNullOrEmpty(cardNumber) || cardNumber.length() < 4) {
            return cardNumber;
        }
        return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
    }
}
```

```java
// Date utilities
public final class DateUtils {

    private DateUtils() {}

    public static LocalDateTime now() {
        return LocalDateTime.now();
    }

    public static String formatForDisplay(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy HH:mm");
        return dateTime.format(formatter);
    }

    public static boolean isBusinessDay(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY;
    }

    public static long daysBetween(LocalDate start, LocalDate end) {
        return ChronoUnit.DAYS.between(start, end);
    }
}
```

```java
// Validation utilities
public final class ValidationUtils {

    private ValidationUtils() {}

    public static void requireNonNull(Object obj, String message) {
        if (obj == null) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void requirePositive(double value, String fieldName) {
        if (value <= 0) {
            throw new IllegalArgumentException(fieldName + " must be positive");
        }
    }

    public static boolean isValidPhoneNumber(String phone) {
        if (StringUtils.isNullOrEmpty(phone)) return false;
        return phone.matches("^\\+?[1-9]\\d{1,14}$");
    }

    public static boolean isValidPassword(String password) {
        if (StringUtils.isNullOrEmpty(password)) return false;

        // At least 8 characters, one uppercase, one lowercase, one digit
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*\\d.*");
    }
}
```

```java
// File utilities
public final class FileUtils {

    private FileUtils() {}

    public static String readFileAsString(String filePath) throws IOException {
        return Files.readString(Paths.get(filePath));
    }

    public static void writeStringToFile(String content, String filePath) throws IOException {
        Files.writeString(Paths.get(filePath), content);
    }

    public static String getFileExtension(String fileName) {
        if (StringUtils.isNullOrEmpty(fileName)) return "";

        int lastDotIndex = fileName.lastIndexOf('.');
        if (lastDotIndex == -1) return "";

        return fileName.substring(lastDotIndex + 1).toLowerCase();
    }

    public static boolean isImageFile(String fileName) {
        String extension = getFileExtension(fileName);
        return Arrays.asList("jpg", "jpeg", "png", "gif", "bmp").contains(extension);
    }
}
```

### Usage Examples

```java
// Using utility classes in service layer
public class UserService {
    private UserDAO userDAO;

    public User createUser(String email, String firstName, String lastName, String phone) {
        // Validation using utilities
        ValidationUtils.requireNonNull(email, "Email cannot be null");
        ValidationUtils.requireNonNull(firstName, "First name cannot be null");

        if (!StringUtils.isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format");
        }

        if (!ValidationUtils.isValidPhoneNumber(phone)) {
            throw new IllegalArgumentException("Invalid phone number");
        }

        // Create user with formatted data
        User user = new User();
        user.setEmail(email.toLowerCase().trim());
        user.setFirstName(StringUtils.capitalize(firstName));
        user.setLastName(StringUtils.capitalize(lastName));
        user.setPhone(phone);
        user.setCreatedAt(DateUtils.now());

        return userDAO.save(user);
    }
}
```

### Best Practices for Utility Classes

1. **Keep methods pure**: No side effects, same input = same output
2. **Comprehensive documentation**: Clear JavaDoc for each method
3. **Null safety**: Handle null inputs gracefully
4. **Performance**: Consider caching for expensive operations
5. **Testing**: Write thorough unit tests for all utility methods

## Practice Problems

1. Print all even numbers from 1 to 100 using a `for` loop
2. Reverse an array using a traditional index-based loop
3. Use a `while` loop to prompt for a password until it's correct
4. Create a menu-based application using a `do-while` loop
5. Use an enhanced `for` loop to print all elements of a string array
6. Create a package structure with at least 3 different packages
7. Implement a class with all four access modifiers and test accessibility
8. Design a simple banking system using proper encapsulation

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
