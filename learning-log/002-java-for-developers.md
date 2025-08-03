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

### Object-Oriented Programming

17. [Java Packages](#java-packages)
18. [Java Access Modifiers](#java-access-modifiers)

### Strings

19. [Working with Strings](#working-with-strings)
20. [How Strings are Stored - String Pool](#how-strings-are-stored---string-pool)
21. [Strings are Immutable](#strings-are-immutable)
22. [String Literal vs String Object](#string-literal-vs-string-object)
23. [Comparing Strings with ==](#comparing-strings-with-==)
24. [Comparing Strings with .equals()](#comparing-strings-with-equals)
25. [Useful String Static Methods](#useful-string-static-methods)

### Practice and Assessment

26. [Practice Problems](#practice-problems)
27. [Code Reference](#code-reference-combined-usage-of-all-loops)

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

        System.out.println("Number as string: " + numberStr);
        System.out.println("Decimal as string: " + decimalStr);
        System.out.println("Boolean as string: " + flagStr);
        System.out.println("Character as string: " + charStr);

        // Converting arrays to strings
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String fromCharArray = String.valueOf(charArray);
        System.out.println("From char array: " + fromCharArray);

        // Subset of char array
        char[] largeArray = {'A', 'B', 'C', 'D', 'E', 'F'};
        String subset = String.valueOf(largeArray, 1, 3); // "BCD"
        System.out.println("Subset: " + subset);

        // Handling null objects
        Object nullObject = null;
        String nullStr = String.valueOf(nullObject); // Returns "null"
        System.out.println("Null object: " + nullStr);
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
        System.out.println(message);

        // Number formatting
        int number = 1234567;
        System.out.println("With commas: " + String.format("%,d", number));
        System.out.println("Padded: " + String.format("%010d", number));
        System.out.println("Hex: " + String.format("%x", number));
        System.out.println("Octal: " + String.format("%o", number));

        // Floating point formatting
        double pi = Math.PI;
        System.out.println("Pi (2 decimals): " + String.format("%.2f", pi));
        System.out.println("Pi (scientific): " + String.format("%.2e", pi));

        // String formatting
        String text = "Hello";
        System.out.println("Left aligned: '" + String.format("%-10s", text) + "'");
        System.out.println("Right aligned: '" + String.format("%10s", text) + "'");

        // Date formatting
        java.util.Date now = new java.util.Date();
        System.out.println("Date: " + String.format("%tF", now)); // ISO date
        System.out.println("Time: " + String.format("%tT", now)); // ISO time
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
        System.out.println("Sentence: " + sentence);

        // Joining with different delimiters
        String csvLine = String.join(",", words);
        String pipeSeparated = String.join(" | ", words);
        System.out.println("CSV: " + csvLine);
        System.out.println("Pipe separated: " + pipeSeparated);

        // Joining collections
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        String fruitList = String.join(", ", fruits);
        System.out.println("Fruits: " + fruitList);

        // Joining with complex delimiters
        String[] paths = {"home", "user", "documents", "file.txt"};
        String filePath = String.join("/", paths);
        System.out.println("File path: " + filePath);

        // Creating SQL-like queries
        List<String> columns = Arrays.asList("id", "name", "email", "age");
        String selectQuery = "SELECT " + String.join(", ", columns) + " FROM users";
        System.out.println("SQL Query: " + selectQuery);
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
