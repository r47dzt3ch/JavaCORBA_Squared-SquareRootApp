# JavaCORBA_Squared-SquareRootApp 

[![GitHub license](https://img.shields.io/github/license/r47dzt3ch/JavaCORBA_Squared-SquareRootApp?style=for-the-badge)](https://github.com/r47dzt3ch/JavaCORBA_Squared-SquareRootApp/blob/main/LICENSE)
[![GitHub stars](https://img.shields.io/github/stars/r47dzt3ch/JavaCORBA_Squared-SquareRootApp?style=for-the-badge)](https://github.com/r47dzt3ch/JavaCORBA_Squared-SquareRootApp)
[![GitHub forks](https://img.shields.io/github/forks/r47dzt3ch/JavaCORBA_Squared-SquareRootApp?style=for-the-badge)](https://github.com/r47dzt3ch/JavaCORBA_Squared-SquareRootApp)
[![GitHub issues](https://img.shields.io/github/issues/r47dzt3ch/JavaCORBA_Squared-SquareRootApp?style=for-the-badge)](https://github.com/r47dzt3ch/JavaCORBA_Squared-SquareRootApp)

**Integrative Programming Project by Jerald Jose**

<p align="center">
  <a href="https://www.linkedin.com/in/jeraldjose/"><img src="https://res.cloudinary.com/dbkpjazoq/image/upload/v1688144593/social-media-icon/linkedin_wvfje7.png" width="30" height="30" width="30" height="30" width="30" height="30" alt="LinkedIn" width="30" height="30"></a>
  <a href="https://wa.me/qr/SP5SZZGGVJ3SE1"><img src="https://res.cloudinary.com/dbkpjazoq/image/upload/v1688144593/social-media-icon/whatsapp_waie0a.png" width="30" height="30" width="30" height="30" width="30" height="30" alt="WhatsApp" width="30" height="30"></a>
  <a href="https://web.facebook.com/jerald.jose.316"><img src="https://res.cloudinary.com/dbkpjazoq/image/upload/v1688144594/social-media-icon/facebook_laopcg.png" width="30" height="30" width="30" height="30" width="30" height="30" alt="Facebook" width="30" height="30"></a>
  <a href="mailto:jeraldjose16@gmail.com"><img src="https://res.cloudinary.com/dbkpjazoq/image/upload/v1688146129/social-media-icon/gmail_euusko.png" width="30" height="30" width="30" height="30" width="30" height="30" alt="Gmail" width="30" height="30"></a>
  <a href="https://jeraldjose.netlify.app/"><img src="https://img.shields.io/badge/Portfolio-jeraldjose.netlify.app-blue?style=for-the-badge&logo=netlify" width="30" height="30" width="30" height="30" alt="Portfolio" width="150"></a>
</p>

---

<img src="https://github.com/raldzyber/JavaCORBA_Squared-SquareRootApp/blob/main/corba.png" alt="Project Video" width="400">

<details>
  <summary>Video: How to Create a CORBA Application</summary>
  <a href="https://youtu.be/jFtiAhBOdgI">Watch the video here</a>
</details>

---

## ✨ Features

- [x]  Calculates the square of a number using CORBA.
- [x]  Calculates the square root of a number using CORBA.
- [x]  Client-server architecture implemented with CORBA.
- [x]  Robust error handling for invalid inputs.


## 🚀 Quick Start

This project requires a Java Development Kit (JDK) and a CORBA implementation (like JacORB).  Ensure these are installed and configured correctly before proceeding.

1. Clone the repository: `git clone https://github.com/r47dzt3ch/JavaCORBA_Squared-SquareRootApp.git`
2. Compile and run the server: `javac SquaredServer.java && java SquaredServer`
3. Compile and run the client: `javac SquaredClient.java && java SquaredClient`

## 📦 Installation

1. **Clone the repository:** Use Git to clone the project to your local machine.
   ```bash
   git clone https://github.com/r47dzt3ch/JavaCORBA_Squared-SquareRootApp.git
   ```
2. **Navigate to the project directory:**
   ```bash
   cd JavaCORBA_Squared-SquareRootApp
   ```
3. **Compile:** Compile the Java code using a JDK compiler (javac).
   ```bash
   javac *.java
   ```


## 🛠️ Usage

The application provides a menu-driven interface:

1.  **Choose an operation:** Select either "Get Square of a number" or "Get Square root of a number".
2.  **Enter a number:** Input a non-negative number.
3.  **View the result:** The application will display the calculated square or square root.

**Example (Client):**

```java
// ... (SquaredClient code execution) ...
What do you want to do today
1 - Get Square of a number
2 - Get Square root of a number
Enter Choice: 1
Enter Number: 5
Result: The Square of 5.0 is 25.0
```

## ⚙️ Configuration

- **JDK:**  Ensure you have a Java Development Kit (JDK) installed.  The project was developed with a JDK 8, but newer JDKs should also work.
- **CORBA Implementation:** You'll need a CORBA implementation (e.g., JacORB). Download and install it according to the provider's instructions.  Set necessary environment variables if needed.


## 🏗️ Project Structure

```
JavaCORBA_Squared-SquareRootApp/
├── SquaredApp/          // IDL files
│   └── Squared.idl
├── SquaredClient.java   // Client-side code
├── SquaredServer.java   // Server-side code
├── SquaredServant.java  // Server-side servant
├── corba_app.java      // (Example only - not directly part of CORBA implementation)
├── corba_screenshot.png // Screenshot
└── corba.png            // Video thumbnail
```


## 🧪 Testing

Testing was primarily done through manual execution and verification of the results.  For a more robust testing approach, consider using a unit testing framework like JUnit.


## 🚀 Deployment

1.  **Compile:** Compile all Java files.
2.  **Run the server:** Execute the `SquaredServer` class.  This will start the CORBA server, making it available to clients.
3.  **Run the client:** Execute the `SquaredClient` class.  This will connect to the server and allow you to perform calculations.


## 🤝 Contributing

Contributions are welcome! Please open an issue or submit a pull request.


## 📄 License

This project is licensed under the Eclipse Public License 2.0 - see the [LICENSE](LICENSE) file for details.


## 👨‍💻 Author

**Jerald Jose**

[jeraldjose.netlify.app](https://jeraldjose.netlify.app/)

<img src="https://github.com/raldzyber/JavaCORBA_Squared-SquareRootApp/blob/main/corba_screenshot.png" alt="Screenshot" width="600">

