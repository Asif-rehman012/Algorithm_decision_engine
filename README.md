# Algorithm Decision Engine (Java)

> A Java-based engine that recommends the best algorithm based on problem constraints like input size, time complexity, and problem type.

---

## 🔍 Overview

The **Algorithm Decision Engine** is a console-based Java application designed to help users choose the most suitable algorithm for a given problem scenario.  
It analyzes problem attributes such as input size, time complexity requirements, and problem category, then recommends the best matching algorithm from its internal database.

This project is useful for students, developers, and competitive programmers who want to learn how algorithm selection works in real-world scenarios.

---

## 🚀 Features

✅ Recommends optimal algorithms based on constraints  
✅ Contains an internal algorithm database  
✅ Uses decision logic for algorithm selection  
✅ Easily extendable (add more algorithms easily)  
✅ Built using pure Java (no external dependencies)  
✅ Good for DSA learning + interview preparation  

---
## 📸 Screenshot (Working Demo)

The screenshot below shows the **Algorithm Decision Engine** working in the console.  
It takes user input such as **problem type**, **input size**, and **constraints**, then analyzes the available algorithms from the database and displays the **best recommended algorithm**.

![Algorithm Decision Engine Working](https://raw.githubusercontent.com/Asif-rehman012/Algorithm_decision_engine/main/Screenshot%202026-02-06%20211206.png)



## 📂 Project Structure


### File Explanation

- **Algorithm.java** → Defines the structure of an algorithm  
- **AlgorithmDB.java** → Stores algorithms and their properties  
- **DecisionEngine.java** → Core logic to recommend best algorithm  
- **Problem.java** → Stores problem constraints and requirements  
- **Mainfile.java** → Entry point and console interface  

---

## 🛠️ Requirements

✔ Java JDK 8 or above  
✔ Terminal / Command Prompt  

---

## ▶️ How to Run

### 1️⃣ Clone the repository

```bash
git clone https://github.com/Asif-rehman012/Algorithm_decision_engine.git
```

### 2️⃣ Go into the project folder
```bash
cd Algorithm_decision_engine
```
### 3️⃣ Compile the Java files
```
javac *.java
```
### 4️⃣ Run the project
```
java Mainfile
```

## 🧪 Example Usage

When you run the program, it will ask you for details such as:

- **Problem Type** (Sorting, Searching, Dynamic Programming, etc.)
- **Input Size** (Small / Medium / Large)
- **Time Constraints** (Fast / Moderate / Flexible)

Based on these constraints, the engine recommends the most suitable algorithm.

---

## 🧠 How It Works

The decision engine follows these steps:

- The user enters problem constraints through the console.
- The program checks available algorithms stored inside `AlgorithmDB`.
- `DecisionEngine` compares algorithm properties and time complexity with the given constraints.
- The best matching algorithm is selected.
- The recommended algorithm is displayed to the user.

---

## 📌 Why This Project Matters?

Choosing the correct algorithm is critical for performance, especially for large input sizes.

This project demonstrates real-world algorithm decision-making using:

- Problem constraints
- Input size analysis
- Time complexity evaluation

This is an important skill for **software engineering**, **competitive programming**, and **technical interviews**.

---

## 🚀 Future Improvements

Some possible enhancements for this project:

- Add more algorithms to the database
- Add GUI support for better interaction
- Add JUnit test cases
- Add support for memory constraints
- Add graph-based decision tree model
- Convert into a Web App using Spring Boot

---

## 🤝 Contributing

Contributions are welcome! 🎉

You can contribute by:

- Adding new algorithms
- Improving decision logic
- Enhancing documentation
- Writing unit tests

Feel free to fork the repo and submit a pull request.

---

## 👤 Author

**Aasif Rehman**  
GitHub: [Asif-rehman012](https://github.com/Asif-rehman012)

## 📜 License

This project is licensed under the **MIT License**.  
You are free to use, modify, and distribute this project with proper credit.
