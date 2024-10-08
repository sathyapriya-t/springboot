# <u>Spring Boot [Basics]</u>

There are few important concepts that we need to know before learning spring :

- Dependency Injection (DI)
- Inversion of Control (IOC)
- Annotations
- Loose Coupling/Tight Coupling
- Becoming a maintainer

### <u> Difference Between Spring and SpringBoot </u>

spring without spring boot is without annotations. Every thing in spring like bean creation and configurations are done
by spring.xml file. There are no annotations in spring. In Spring Boot, we do the creation of bean with annotations and
its easier.

### <u> Inversion of Control</u> - (Principle) </u>

Typically, java is object-oriented programming. Every is based on creation of objects. So, To interact with multiple
classes we create objects.When we are using 100s of classes creating, managing and deleting(Whole lifecycle) of objects
needs to managed by developers before spring. That's the difficult task.

So, Spring introduces the concept of Inversion of Control. Instead of developers creating the objects and managing it.
We are giving the control to the spring to do it. We are giving the control over to spring and focusing on the business
logic. This is called **Inversion of Control(IOC)**.

The technique we use to achieve the concept of IOC is **Dependency Injection(DI)**.

### <u> Dependency Injection</u> - (Design Pattern)

The concept (Design Pattern) we use to achieve IOC is Dependency Injection. Spring Boot allows an object to receive its
dependency from external source rather that creating them itself.

There are different types of DI:

- **Constructor Injection:** - better(No need to use autowired annotation, it will automatically connect)
- **Setter Injection:** - better(need to use autowired annotation or-else it will throw no qualifying bean of type)
- **Field Injection:** - no that much good(need to use autowired to connect the bean)

## <u> Annotations:</u>

**@SpringBootApplication** - This is where the spring boot project starts. It includes @EnableAutoConfiguration,
@ComponentScan, @Configuration.

1. `@EnableAutoConfiguration` - It enables the autoconfiguration mechanism
2. `@ComponentScan` - It scans the package where the application is located
3. `@Configuration` - Annotating a class with @Configuration indicates that its primary purpose is as a source of bean
   definitions

**@Component** - This annotation creates object(bean) of the class and helps with IOC(Inversion of Control). The Objects
are created in Spring IOC container which of type `ApplicationContext`. Using the Context/Container, we can get the
bean.

**@Service** - This annotation does exactly same as @Component. But This is specifically for business logics.This
creates a bean in spring IOC container.

**@Repository** - This annotation does exactly same as @Component. But This is specifically for repository data
storage.This
creates a bean in spring IOC container.

**@Autowired** - This annotation will inject the bean(Injecting class object/bean) which is created using @Component

**@Primary** - For Dependency injection, if we have 2 or more class which implements the same Interface(Loose coupling)
.That Interface
is used for dependency injection as instance variable, then spring boot will be confused which one to inject. So in that
time we need to add
this annotation. Basically if there is confusion, the class which is annotated with @Primary will be preferred.

**@Qualifier** - This annotation takes a parameter as string of bean name(Not Class name). For Dependency injection, if
we have 2 or more class which implements the same Interface(Loose coupling)
.That Interface
is used for dependency injection as instance variable, then spring boot will be confused which one to inject.In the time
you don't want to add the @Primary annotation you can add @Qualifier annotation in the injecting bean.

Example: `@Qualifier("tablet")` - notice that the parameter has bean/object name not class name

**@RestController** - This handles http request and generate responses for restful web services with data/text. This is
the specialized
version of the @controller and @ResponseBody.This basically helps to handle basic http request like PUT,GET,POST and
DELETE.

**@Controller** - This handles http request and generate response as (data + layout) class name. Data can be returned
using @ResponseBody.

**@RequestMapping** - This maps the web request to the spring Controller. It tasks two parameter. one is values which
takes the mapping request and Another is method which specifies the which http request it is.

Example: `@RequestMapping(value = "/login", method = "RequestMethod.Get")`

**@RequestParam** - Extracts query parameters from the query string of the HTTP request.Typically used for optional
parameters or when you want to pass data in the URL in a key-value format.

Example: `localhost:8080/product?prodId=101`

**@PathVariable** -Extracts values from the URI path.Used when the value is part of the URL path itself, often for
identifying resources.

Example: `localhost:8080/products/101`

**@RequestHeader** - This annotation binds the request header with the method parameter and helps us to access the
header of the request. It takes a parameter as string or HttpHeaders which will specify which header parameter we can
access.

Example: `@RequestHeader(HttpHeaders.CONTENT_LENGTH)`

**CRUD Operations** - @GetMapping @PutMapping @PostMapping @DeleteMapping - All performs the crud operation http
requests.

**@Entity** - a class which of type we store in JPA repository. An entity class must have a primary key, and it is
annotated with @Id. An Entity must contain @ID(PrimaryKey) @Setter @Getter @NoArgConstructor.

1. `@Setter and @Getter` - For setting and fetching the values, if this is not present, then the values will be stored
   as null values
2. `@Id` - PrimaryKey - this is the unique identifier for a table
3. `@NoArgConstructor` - Without this bean will not be able to create.

**@Configuration and @Bean** -

1. `@Configuration` annotation is used to mark the class aa a source of bean definition.
   This class contain one or more @Bean method, Which spring will generate bean definition and manage with IOC
   Container.
2. `@Bean` annotation indicates that the method produces a bean to be managed by spring IOC container. The purpose of
   this annotation is to define a method that returns a bean to be managed by the Spring container.
3. `Inter-bean Dependencies` When @Bean methods are declared within @Configuration classes, they can call each other to
   define dependencies between beans.

**@CrossOrigin** - this annotation basically helps in sharing the same url. This is used because of security purpose.
It is used to enable Cross-Origin Resource Sharing (CORS) on specific handler classes or methods. CORS is a security
feature implemented by browsers to prevent web pages from making requests to a different domain than the one that served
the web page. This is important for protecting users from malicious websites.

**@ResponseStatus** - Annotation in Spring Boot is used to mark a method or exception class with a status code and
reason that should be returned. Used Typically in exception to automatically return certain status when an exception is
thrown.

**@ResponseEntity** - that allows you to control the entire HTTP response, including the status code, headers, and body.
It’s often used in controller methods to customize the response sent to the client. Typically used in controller methods
to return certain status code.

<p style="padding-left:80px;"> </p> 

## We Use [GitHub Flow](https://guides.github.com/introduction/flow/index.html), So All Code Changes Happen Through Pull Requests

Pull requests are the best way to propose changes to the codebase. We actively welcome your pull requests:

1. Fork the repo and create your branch from `master`.
2. If you've added code that should be tested, add tests.
3. If you've changed APIs, update the documentation.
4. Ensure the test suite passes.
5. Make sure your code lints.
6. Issue that pull request!

## Any contributions you make will be under the Software License

In short, when you submit code changes, your submissions are understood to be under the same that covers the project.
Feel free to contact the maintainers if that's a concern.

## Report bugs using GitHub's [issues](https://github.com/yourusername/yourprojectname/issues)

We use GitHub issues to track public bugs. Report a bug
by [opening a new issue](https://github.com/yourusername/yourprojectname/issues/new); it's that easy!

## Write bug reports with detail, background, and sample code

**Great Bug Reports** tend to have:

- A quick summary and/or background
- Steps to reproduce
    - Be specific!
    - Give sample code if you can.
- What you expected would happen
- What actually happens
- Notes (possibly including why you think this might be happening, or stuff you tried that didn't work)

People *love* thorough bug reports.

## Use a Consistent Coding Style

* 2 spaces for indentation rather than tabs
* You can try running `npm run lint` for style unification

## License

By contributing, you agree that your contributions will be licensed under its .