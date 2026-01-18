# Smart Fan Speed Controller

A beginner-friendly **Java Swing project** that demonstrates Object-Oriented Programming (OOP) concepts while building a functional **Smart Fan Controller**.  

This project allows the fan speed to automatically adjust based on **temperature input**, and provides a **graphical user interface (GUI)** to interact with the fan in real-time.

---

## 🔹 Features

- **Temperature-Based Smart Fan Control**
  - OFF when temperature < 20°C  
  - LOW speed when 20–25°C  
  - MEDIUM speed when 26–30°C  
  - HIGH speed when > 30°C  

- **Object-Oriented Programming Concepts**
  - **Inheritance:** `SmartFan` inherits from `Fan`  
  - **Method Overriding:** `SmartFan` overrides `controlFan()` and `displayInfo()`  
  - **Polymorphism:** Using `Fan fan = new SmartFan();`  

- **Graphical User Interface (GUI)**
  - `JFrame`, `JButton`, `JSlider`, and `JLabel`  
  - Slider to set temperature with **ticks and labels**  
  - Button to control fan speed dynamically  
  - Real-time display of **fan status** and **speed level**  

- **Modern Java Features**
  - Lambda expressions for **event handling**  

---

## 🔹 Project Structure

SmartFanController/
├── SmartFanApp.java # Main GUI + logic
├── Fan.java # Base class (Parent)
└── SmartFan.java # Child class (Temperature-based logic)


> Note: All classes are currently combined in one file (`SmartFanApp.java`) for simplicity.

---

## 🔹 How It Works

1. The user sets the desired temperature using the slider.  
2. Clicks the **Control Fan** button.  
3. The program calculates fan speed using **temperature-based logic**.  
4. The GUI displays the **fan status** (OFF/LOW/MEDIUM/HIGH) and **speed level (0-3)**.

**Logic Table**

| Temperature (°C) | Fan Status | Speed Level |
|-----------------|------------|------------|
| < 20            | OFF        | 0          |
| 20–25           | LOW        | 1          |
| 26–30           | MEDIUM     | 2          |
| > 30            | HIGH       | 3          |

---

## 🔹 How to Run

1. Clone the repository:
```bash
git clone https://github.com/YourUsername/SmartFanController.git
Navigate to the project folder:

cd SmartFanController
Compile the Java file:

javac SmartFanApp.java
Run the project:

java SmartFanApp
A GUI window will open allowing you to control the fan based on temperature.

🔹 Learning Outcomes
Understanding of Java OOP concepts:

Inheritance, Method Overriding, Polymorphism

Hands-on experience with Java Swing GUI

Using lambda expressions for event handling

Real-world logic implementation (temperature-based automation)

Beginner-friendly structured project for exam or portfolio

🔹 Technologies Used
Java 17+

Swing GUI Toolkit

Lambda Expressions

🔹 Author
Ahmed Malik

Student / Beginner Java Developer

www.linkedin.com/in/ahmed-malik-0644ab321

🔹 License
This project is open-source and free to use.

