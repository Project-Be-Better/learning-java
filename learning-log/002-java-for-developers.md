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
12. [Enums](#enums)
13. [Enum Methods](#enum-methods)
14. [Implicit and Explicit Type Casting](#implicit-and-explicit-type-casting)
15. [Global and Local Variables](#global-and-local-variables)
16. [Wrapper Classes](#wrapper-classes)

### User Input

17. [Taking User Input](#taking-user-input)
18. [Scanner Class](#scanner-class)
19. [Reading Different Data Types](#reading-different-data-types)

### Object-Oriented Programming

20. [Java Packages](#java-packages)
21. [Java Access Modifiers](#java-access-modifiers)

### Strings

22. [Working with Strings](#working-with-strings)
23. [How Strings are Stored - String Pool](#how-strings-are-stored---string-pool)
24. [Strings are Immutable](#strings-are-immutable)
25. [String Literal vs String Object](#string-literal-vs-string-object)
26. [Comparing Strings with ==](#comparing-strings-with-==)
27. [Comparing Strings with .equals()](#comparing-strings-with-equals)
28. [Useful String Static Methods](#useful-string-static-methods)

### Dates

29. [LocalDateTime](#localdatetime)
30. [LocalDate and LocalTime](#localdate-and-localtime)
31. [Creating Specific Dates](#creating-specific-dates)
32. [Zone IDs](#zone-ids)
33. [Other Date Classes](#other-date-classes)

### Big Decimal

34. [The Problem With Double](#the-problem-with-double)
35. [BigDecimal](#bigdecimal)
36. [Exploring BigDecimal Methods](#exploring-bigdecimal-methods)

### Practice and Assessment

37. [Practice Problems](#practice-problems)
38. [Code Reference](#code-reference-combined-usage-of-all-loops)

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
