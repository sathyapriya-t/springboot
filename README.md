# <u>Spring Boot [Basics]</u>

There are few important concepts that we need to know before learning spring :

- Dependency Injection (DI)
- Inversion of Control (IOC)
- Annotations
- Loose Coupling/Tight Coupling
- Becoming a maintainer

### <u> Inversion of Control</u> - (Principle)

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

- **Constructor Injection:**
- **Setter Injection:**
- **Field Injection:**

## <u> Annotations:</u>

We use GitHub to host code, to track issues and feature requests, as well as accept pull requests.

**@SpringBootApplication** - This is where the spring boot project starts.

**@Component** - This annotation creates object(bean) of the class and helps in IOC. The Objects are created in Spring IOC container which of type `ApplicationContext`. Using the Context/Container, we can get the bean.

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