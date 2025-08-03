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

### Practice and Assessment

19. [Practice Problems](#practice-problems)
20. [Code Reference](#code-reference-combined-usage-of-all-loops)

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

# Java Packages

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
