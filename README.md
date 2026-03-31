# SocialSparkApp

## Purpose of SocialSparkApp
The **SocialSparkApp** is designed for suggesting social interactions based on the user’s input time of day to help the user stay socially connected. It aims to provide suggestions for specific times like:
- Morning
- Mid-Morning
- Afternoon
- Afternoon Snack Time
- Dinner
- After Dinner/Night

 <img width="297" height="492" alt="pupose of the app" src="https://github.com/user-attachments/assets/2baa19ec-a3bb-4a10-8eca-f52d39be0115" />



## Design Considerations
The **SocialSparkApp** processes input by converting it to lowercase in the `validateInput` function. This ensures that inputs like "Morning" or "Mid-Morning" are treated the same and are matched against the predefined list of valid time strings. The application uses conditional logic to validate user input, checking if the input time matches one of the predefined valid times (e.g., `morning`, `mid-morning`, etc.).

<img width="1098" height="202" alt="validinput" src="https://github.com/user-attachments/assets/99fcfaa2-8640-4759-bab5-0f9429c983b5" />


## UI Design
The Android UI, built with **Jetpack Compose**, includes a `TextField` for the user to enter a time of day. It also displays a social spark suggestion or an error message in red to indicate issues.

<img width="1158" height="632" alt="ui" src="https://github.com/user-attachments/assets/30798836-a694-4be9-b86a-01d274294aec" />


### Key Layout Features:
- **Layout Control:** Jetpack Compose provides control over spacing using modifiers like padding and composables such as `Spacer` to manage distances between UI elements.
- **Spacing:** `Spacer` components separate the input field ("Enter time of day") from the "Get Suggestion" button and the "Reset" button.
- **Simplicity:** Jetpack Compose simplifies UI development on Android, making it faster and easier to build interfaces with less code.
  

<img width="353" height="258" alt="ui design" src="https://github.com/user-attachments/assets/5b0b0d43-9628-4877-9a78-cce91cc1b8dc" />


## Error Handling
The error handling mechanism displays an error message in **red** to indicate invalid input. It also provides an encouraging message suggesting valid options, such as: *"INVALID. Try: Morning, Mid-Morning, Afternoon, Afternoon Snack Time, Dinner, or After Dinner/Night."*

<img width="1235" height="484" alt="error handling" src="https://github.com/user-attachments/assets/c86fb866-98fd-49c9-bc70-2adbfbda8606" />


## GitHub and GitHub Actions
A repository is hosted on **GitHub** to store the source code, showcase the project, and manage changes over time.
- **Git:** Used to commit and push code updates.
- **GitHub Actions:** Automatically runs tests to verify code functionality and builds the app by compiling the source code into a usable format.

<img width="968" height="653" alt="github actions" src="https://github.com/user-attachments/assets/89724b88-1a21-41a9-b9e6-18c82e949f16" />

Reference
Meta. 2026. Meta AI (Large language model). Available at: https://meta.ai/ [Accessed: 27 March 2026].

In-text 
(Meta, 2026)


Meta. 2026. Meta AI (Large language model). Available at: https://meta.ai/ [Accessed: 31 March 2026].

In-text 
(Meta, 2026)

Geeksforgeeks,2025,10 Best Practices for Android UI Design[online] Available at https://www.geeksforgeeks.org/blogs/best-practices-for-android-ui-design/ [Accessed 28 March 2026)

Geeksforgeeks,2025,spacer in Android Jetpack compose[online] Available at https://www.geeksforgeeks.org/kotlin/spacer-in-android-jetpack-compose/ [Accessed 28 March 2026]

Codeacademy, learn kotlin[online] Available at https://www.codecademy.com/learn/learn-kotlin [Accessed 28 March 2026]

Video presentation
https://youtu.be/TsXyC5KvtVc
