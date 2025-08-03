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

# Java Packages

## What are Packages?

Packages in Java are namespaces that organize related classes and interfaces. They help avoid naming conflicts and provide better modularity and access control.

### Key Concepts

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
