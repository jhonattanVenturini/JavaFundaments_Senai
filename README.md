# JavaFundamentals_Senai: Oracle OCA Java SE 8 Certification Preparation 📚

---

## 🔍 About This Repository

This repository contains course materials designed for learning **Java Fundamentals**, with a focus on preparing for the **Oracle Certified Associate (OCA) Java SE 8 Programmer** certification. The content includes key Java programming concepts, with a special emphasis on `loops`, `control flow`, and other core Java fundamentals.

This is perfect for beginners who want to solidify their understanding of Java before taking the Oracle certification exam.

---

## 📋 Course Topics

The Java fundamentals covered in this course are aligned with the Oracle Java SE 8 certification exam objectives. This includes:

- **Introduction to Java**: Setting up the development environment, understanding basic syntax, and running your first Java program.
- **Loops & Control Flow**: Mastering `for`, `while`, and `do-while` loops, and using `break` and `continue` to control loop flow.
- **Conditionals**: Using `if`, `else`, and `switch` statements to control the flow of execution based on conditions.
- **Arrays & Collections**: Understanding `arrays` and basic collection types (e.g., `lists`, `sets`, `maps`).
- **Object-Oriented Programming (OOP)**: A brief introduction to key OOP concepts like `classes`, `objects`, `methods`, and `constructors`.

---

## ⚙️ How to Get Started

### 1. Clone the Repository

First, clone this repository to your local machine:

```bash
git clone https://github.com/YOUR_USERNAME/JavaFundamentals_Senai.git
cd JavaFundamentals_Senai
```

### 2. Open in IntelliJ IDEA

After cloning the repository, open it in IntelliJ IDEA:

1. Open `IntelliJ IDEA`.
2. Click **Open** and navigate to the folder where you cloned the repository.
3. IntelliJ IDEA should automatically detect it as a Java project.

### 3. Compile and Run the Code

Once your project is set up, you can run the Java files:

#### Using IntelliJ IDEA:

1. Right-click on the `class` with the `main()` method.
2. Click **Run 'ClassName.main()'**.

#### Using Command Line:

Compile the code:

```bash
javac FileName.java
```

Run the compiled code:

```bash
java FileName
```

---

## 💻 Code Examples

Here are some basic examples to help you understand loops in Java:

### 1. For Loop 🖥️

The `for` loop is used when the number of iterations is known in advance.

```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration number: " + i);
        }
    }
}
```

**Explanation:**
This code uses a `for` loop to print the numbers 1 to 5. The loop starts with `i = 1`, runs while `i <= 5`, and increments `i` after each iteration.

### 2. While Loop 🔄

The `while` loop is used when the number of iterations is not known beforehand.

```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Iteration number: " + i);
            i++;
        }
    }
}
```

**Explanation:**
In this example, the loop runs as long as the condition `i <= 5` is true. The loop continues until `i` becomes greater than 5.

### 3. Do-While Loop 🔁

The `do-while` loop always runs at least once, regardless of the condition.

```java
public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Iteration number: " + i);
            i++;
        } while (i <= 5);
    }
}
```

**Explanation:**
In a `do-while` loop, the code inside the loop runs first, and then the condition is checked. If the condition is true, it repeats; otherwise, it stops.

---

## 📝 Exercises

1. **For Loop Exercise**
   Write a program that uses a `for` loop to print all even numbers between 1 and 20.

2. **While Loop Exercise**
   Write a program that uses a `while` loop to print the squares of numbers from 1 to 10.

3. **Do-While Loop Exercise**
   Write a program that uses a `do-while` loop to prompt the user for input until they type `"exit"`.

---

## 🛠️ Contributing

We welcome contributions to improve and extend the course material! Whether you want to add new exercises, improve explanations, or fix issues with the code, your help is appreciated.

**How to Contribute:**

1. Fork the repository.
2. Clone your forked repository to your local machine:
   ```bash
   git clone https://github.com/YOUR_USERNAME/JavaFundamentals_Senai.git
   ```
3. Create a new branch for your changes:
   ```bash
   git checkout -b new-feature
   ```
4. Make your changes, then commit them:
   ```bash
   git commit -m "Added new exercise for do-while loop"
   ```
5. Push your changes:
   ```bash
   git push origin new-feature
   ```
6. Open a **Pull Request** on GitHub.

---

## 📄 License

This repository is licensed under the **MIT License**. See the `LICENSE` file for more details.

---

## 🙌 Acknowledgments

A special thank you to **SENAI** for the course structure.

The exercises are designed to help learners prepare for the **Oracle Java SE 8 Certification**.

---

## 📅 Future Improvements

In the future, we aim to include more advanced topics, such as:

- **Object-Oriented Programming (OOP)** concepts
- **Collections Framework**
- **Exception Handling**
