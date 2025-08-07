# Spring Boot for Beginners

A comprehensive guide to Spring Framework and Spring Boot fundamentals, covering core concepts, IoC, application context, and beans.

## Table of Contents

- [Introduction to Spring and Spring Boot](#introduction-to-spring-and-spring-boot)
- [Spring vs Spring Boot](#spring-vs-spring-boot)
- [Inversion of Control and Dependency Injection](#inversion-of-control-and-dependency-injection)
- [Spring IoC Application Context](#spring-ioc-application-context)
- [Beans](#beans)

---

## Introduction to Spring and Spring Boot

### What is Spring Framework?

The Spring Framework is a comprehensive programming and configuration model for modern Java-based enterprise applications. It provides:

- **Dependency Injection (DI)**: Manages object dependencies automatically
- **Aspect-Oriented Programming (AOP)**: Separates cross-cutting concerns
- **Data Access**: Simplified database operations
- **Web Framework**: Building web applications and REST APIs
- **Security**: Comprehensive security framework
- **Testing**: Excellent testing support

### What is Spring Boot?

Spring Boot is an extension of the Spring Framework that simplifies the development of Spring applications by providing:

- **Auto-configuration**: Automatically configures Spring applications based on dependencies
- **Starter Dependencies**: Pre-configured dependency sets for common use cases
- **Embedded Servers**: Built-in Tomcat, Jetty, or Undertow servers
- **Production-ready Features**: Health checks, metrics, externalized configuration
- **No XML Configuration**: Convention over configuration approach

### Key Benefits

| Spring Framework                | Spring Boot                   |
| ------------------------------- | ----------------------------- |
| Comprehensive but complex setup | Rapid application development |
| Manual configuration required   | Auto-configuration            |
| External server deployment      | Embedded server included      |
| XML or Java configuration       | Convention over configuration |

---

## Spring vs Spring Boot

### Spring Framework Characteristics

**Traditional Spring Application Setup:**

```java
// Traditional Spring configuration (XML or Java Config)
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.example")
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydb");
        dataSource.setUsername("user");
        dataSource.setPassword("password");
        return dataSource;
    }
}
```

### Spring Boot Characteristics

**Spring Boot Application Setup:**

```java
// Spring Boot - Minimal configuration required
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}

// Simple REST Controller
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }
}
```

### Comparison Table

| Aspect                    | Spring Framework             | Spring Boot                   |
| ------------------------- | ---------------------------- | ----------------------------- |
| **Configuration**         | Manual XML/Java config       | Auto-configuration            |
| **Dependency Management** | Manual dependency resolution | Starter dependencies          |
| **Server**                | External server required     | Embedded server included      |
| **Development Time**      | Longer setup time            | Rapid development             |
| **Learning Curve**        | Steeper                      | Gentler                       |
| **Flexibility**           | High customization           | Convention over configuration |

### When to Use What?

**Use Spring Framework when:**

- You need fine-grained control over configuration
- Working with legacy systems
- Specific customization requirements
- Learning Spring concepts from ground up

**Use Spring Boot when:**

- Rapid application development
- Microservices architecture
- Getting started with Spring
- Production-ready applications quickly

---

## Inversion of Control and Dependency Injection

### Understanding Inversion of Control (IoC)

**Without IoC (Traditional Approach):**

```java
// Tight coupling - class creates its own dependencies
public class OrderService {
    private EmailService emailService;
    private PaymentService paymentService;

    public OrderService() {
        this.emailService = new EmailService(); // Tight coupling
        this.paymentService = new PaymentService(); // Hard to test
    }

    public void processOrder(Order order) {
        paymentService.processPayment(order);
        emailService.sendConfirmation(order);
    }
}
```

**With IoC (Spring Approach):**

```java
// Loose coupling - dependencies are injected
@Service
public class OrderService {
    private final EmailService emailService;
    private final PaymentService paymentService;

    // Constructor injection (recommended)
    public OrderService(EmailService emailService, PaymentService paymentService) {
        this.emailService = emailService;
        this.paymentService = paymentService;
    }

    public void processOrder(Order order) {
        paymentService.processPayment(order);
        emailService.sendConfirmation(order);
    }
}
```

### Types of Dependency Injection

#### 1. Constructor Injection (Recommended)

```java
@Service
public class UserService {
    private final UserRepository userRepository;
    private final EmailService emailService;

    public UserService(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }
}
```

**Advantages:**

- Immutable dependencies
- Required dependencies are obvious
- Better for testing
- Fail-fast if dependencies are missing

#### 2. Setter Injection

```java
@Service
public class UserService {
    private UserRepository userRepository;
    private EmailService emailService;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }
}
```

#### 3. Field Injection (Not Recommended)

```java
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmailService emailService;
}
```

### Benefits of IoC and DI

1. **Loose Coupling**: Classes don't depend on concrete implementations
2. **Testability**: Easy to mock dependencies for unit testing
3. **Flexibility**: Easy to swap implementations
4. **Maintainability**: Changes in one class don't affect others
5. **Reusability**: Components can be reused in different contexts

---

## Spring IoC Application Context

### What is Application Context?

The Application Context is the central interface in Spring's IoC container that:

- **Manages Beans**: Creates, configures, and manages bean lifecycle
- **Dependency Resolution**: Resolves and injects dependencies
- **Configuration Loading**: Loads configuration from various sources
- **Event Publishing**: Publishes and handles application events

### Types of Application Context

#### 1. AnnotationConfigApplicationContext

```java
// Java-based configuration
@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }
}

// Creating context
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.performAction();
    }
}
```

#### 2. ClassPathXmlApplicationContext

```java
// XML-based configuration
ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
UserService userService = context.getBean("userService", UserService.class);
```

#### 3. Spring Boot Application Context

```java
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        // Spring Boot creates and manages ApplicationContext automatically
        ApplicationContext context = SpringApplication.run(MyApplication.class, args);

        // Accessing beans
        UserService userService = context.getBean(UserService.class);
        userService.performAction();
    }
}
```

### Bean Lifecycle in Application Context

```java
@Component
public class MyBean implements InitializingBean, DisposableBean {

    public MyBean() {
        System.out.println("1. Constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("2. PostConstruct method called");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("3. InitializingBean.afterPropertiesSet() called");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("4. PreDestroy method called");
    }

    @Override
    public void destroy() {
        System.out.println("5. DisposableBean.destroy() called");
    }
}
```

### Working with Application Context

```java
@Component
public class ApplicationContextDemo implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public void demonstrateContext() {
        // Get bean by type
        UserService userService = applicationContext.getBean(UserService.class);

        // Get bean by name
        Object myBean = applicationContext.getBean("myBean");

        // Check if bean exists
        boolean exists = applicationContext.containsBean("userService");

        // Get all beans of a type
        Map<String, UserService> allUserServices =
            applicationContext.getBeansOfType(UserService.class);
    }
}
```

---

## Beans

### What are Spring Beans?

A Spring Bean is an object that is:

- **Instantiated**: Created by the Spring IoC container
- **Assembled**: Configured and managed by the container
- **Managed**: Lifecycle controlled by the container

### Creating Beans

#### 1. Using @Component and Stereotypes

```java
// Generic component
@Component
public class MyComponent {
    public void doSomething() {
        System.out.println("Component doing something...");
    }
}

// Service layer
@Service
public class UserService {
    public void createUser(String name) {
        System.out.println("Creating user: " + name);
    }
}

// Data access layer
@Repository
public class UserRepository {
    public void save(User user) {
        System.out.println("Saving user to database");
    }
}

// Web layer
@Controller
public class UserController {
    public String home() {
        return "home";
    }
}

// REST API
@RestController
public class UserRestController {
    @GetMapping("/users")
    public List<User> getUsers() {
        return Arrays.asList(new User("John"), new User("Jane"));
    }
}
```

#### 2. Using @Bean in Configuration Classes

```java
@Configuration
public class AppConfig {

    @Bean
    public DataSource dataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:h2:mem:testdb");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }

    @Bean
    public UserService userService(UserRepository userRepository) {
        return new UserService(userRepository);
    }

    @Bean
    @Primary // Makes this the primary bean when multiple beans of same type exist
    public EmailService emailService() {
        return new EmailService();
    }

    @Bean
    @Qualifier("smsService")
    public NotificationService smsNotificationService() {
        return new SmsNotificationService();
    }
}
```

### Bean Scopes

```java
@Component
@Scope("singleton") // Default scope
public class SingletonBean {
    // Only one instance per Spring container
}

@Component
@Scope("prototype")
public class PrototypeBean {
    // New instance every time it's requested
}

// Web application scopes
@Component
@Scope("request")
public class RequestScopedBean {
    // One instance per HTTP request
}

@Component
@Scope("session")
public class SessionScopedBean {
    // One instance per HTTP session
}
```

### Bean Lifecycle Management

```java
@Component
public class LifecycleBean {

    private DataSource dataSource;

    public LifecycleBean(DataSource dataSource) {
        this.dataSource = dataSource;
        System.out.println("Constructor: Bean created");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct: Initializing bean");
        // Initialization logic here
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("PreDestroy: Cleaning up bean");
        // Cleanup logic here
    }
}
```

### Bean Dependencies and Injection

```java
@Service
public class OrderService {

    private final PaymentService paymentService;
    private final InventoryService inventoryService;
    private final EmailService emailService;

    // Constructor injection (recommended)
    public OrderService(PaymentService paymentService,
                       InventoryService inventoryService,
                       EmailService emailService) {
        this.paymentService = paymentService;
        this.inventoryService = inventoryService;
        this.emailService = emailService;
    }

    public void processOrder(Order order) {
        // Check inventory
        if (inventoryService.isAvailable(order.getProductId(), order.getQuantity())) {
            // Process payment
            PaymentResult result = paymentService.processPayment(order.getPayment());

            if (result.isSuccessful()) {
                // Update inventory
                inventoryService.reduceStock(order.getProductId(), order.getQuantity());

                // Send confirmation
                emailService.sendOrderConfirmation(order);

                System.out.println("Order processed successfully");
            }
        }
    }
}
```

### Working with Multiple Beans of Same Type

```java
// Multiple implementations of same interface
public interface NotificationService {
    void sendNotification(String message);
}

@Service("emailNotification")
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email: " + message);
    }
}

@Service("smsNotification")
public class SmsNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS: " + message);
    }
}

// Using specific beans
@Service
public class NotificationManager {

    private final NotificationService emailService;
    private final NotificationService smsService;

    public NotificationManager(@Qualifier("emailNotification") NotificationService emailService,
                             @Qualifier("smsNotification") NotificationService smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
    }

    public void sendAllNotifications(String message) {
        emailService.sendNotification(message);
        smsService.sendNotification(message);
    }
}
```

### Best Practices for Beans

1. **Use Constructor Injection**: More reliable and testable
2. **Prefer @Component Stereotypes**: Use @Service, @Repository, @Controller for clarity
3. **Keep Beans Focused**: Single responsibility principle
4. **Use @Qualifier**: When multiple beans of same type exist
5. **Lifecycle Methods**: Use @PostConstruct and @PreDestroy when needed
6. **Avoid Circular Dependencies**: Design carefully to prevent circular references

---

## Summary

Spring Boot simplifies Spring development by providing:

- **Auto-configuration**: Reduces boilerplate configuration
- **Starter Dependencies**: Easy dependency management
- **Embedded Servers**: No need for external application servers
- **Production Features**: Health checks, metrics, and monitoring

Key concepts to remember:

1. **IoC Container**: Manages object lifecycle and dependencies
2. **Dependency Injection**: Promotes loose coupling and testability
3. **Application Context**: Central hub for bean management
4. **Beans**: Spring-managed objects with various scopes and lifecycles

This foundation prepares you for building robust, maintainable Spring Boot applications.
