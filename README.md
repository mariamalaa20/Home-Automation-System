# Smart Home Control System

## Project Description

A **modular smart home automation system** built with **Java**, showcasing practical implementations of key design patterns:

* **Singleton**
* **Observer**
* **Strategy**
* **Decorator**
* **Command**

This project serves as both a **functional prototype** and an **educational resource** for building clean, maintainable, and scalable architectures.

---

## Key Features

### 1. Centralized Home Control (**Singleton Pattern**)

* Single access point for managing all home operations
* Prevents creation of multiple control centers

### 2. Motion Detection System (**Observer Pattern**)

* Real-time alerts sent to cameras and alarms
* Decoupled communication between sensors and smart devices

### 3. Adaptive Heating Control (**Strategy Pattern**)

* Easily switchable heating modes (**Economic**, **Fast**)
* Runtime behavioral change without modifying the underlying structure

### 4. Smart Lighting System (**Decorator Pattern**)

* Extensible light functionalities (Basic → Colored → Brightness-controlled)
* Adds features dynamically without altering base classes

### 5. Voice Command Execution (**Command Pattern**)

* Supports parameterized operations (e.g., TV, AC control)
* Allows queuing and logging of commands for audit and replay

---

## ⚙️ Technical Requirements

| Component      | Requirement             |
| -------------- | ----------------------- |
| **JDK**        | 17 or later             |
| **Build Tool** | Maven 3.8+              |
| **IDE**        | IntelliJ IDEA / Eclipse |
| **Memory**     | Minimum 2GB RAM         |

---

## Installation & Setup

1. **Clone the repository**

   ```bash
   git clone https://github.com/yourusername/smart-home-control.git
   ```

2. **Build the project**

   ```bash
   cd smart-home-control
   mvn clean install
   ```

3. **Run the application**

   ```bash
   mvn exec:java -Dexec.mainClass="com.smarthome.Main"
   ```

---

## Project Architecture

```
src/
├── main/
│   ├── java/
│   │   ├── command/
│   │   │   ├── AirConditionerOnCommand.java
│   │   │   └── TVOnCommand.java
│   │   ├── decorator/
│   │   │   ├── BrightnessControlDecorator.java
│   │   │   └── ColoredLightDecorator.java
│   │   ├── observer/
│   │   │   ├── Alarm.java
│   │   │   └── Camera.java
│   │   ├── strategy/
│   │   │   ├── EconomicHeating.java
│   │   │   └── FastHeating.java
│   │   ├── HeatingSystem.java
│   │   ├── HomeControlCenter.java
│   │   ├── MotionSensor.java
│   │   └── VoiceAssistant.java
│   └── resources/
└── test/
    └── java/   # Unit tests
```

---

## Usage Examples

### 1. Executing Voice Commands

```java
VoiceAssistant assistant = new VoiceAssistant();
assistant.setCommand(new TVOnCommand());
assistant.executeCommand();
```

### 2. Configuring Lighting

```java
ILight smartLight = new BrightnessControlDecorator(
                    new ColoredLightDecorator(
                    new BasicLight()));
smartLight.turnOn();
```

### 3. Changing Heating Modes

```java
heatingSystem.setStrategy(new FastHeating());
heatingSystem.adjustTemperature();
```

