# SocialSparkApp

## Purpose of SocialSparkApp
The **SocialSparkApp** is designed for suggesting social interactions based on the user’s input time of day to help the user stay socially connected. It aims to provide suggestions for specific times like:
- Morning
- Mid-Morning
- Afternoon
- Afternoon Snack Time
- Dinner
- After Dinner/Night

## Design Considerations
The **SocialSparkApp** processes input by converting it to lowercase in the `validateInput` function. This ensures that inputs like "Morning" or "Mid-Morning" are treated the same and are matched against the predefined list of valid time strings. The application uses conditional logic to validate user input, checking if the input time matches one of the predefined valid times (e.g., `morning`, `mid-morning`, etc.).

## UI Design
The Android UI, built with **Jetpack Compose**, includes a `TextField` for the user to enter a time of day. It also displays a social spark suggestion or an error message in red to indicate issues.

### Key Layout Features:
- **Layout Control:** Jetpack Compose provides control over spacing using modifiers like padding and composables such as `Spacer` to manage distances between UI elements.
- **Spacing:** `Spacer` components separate the input field ("Enter time of day") from the "Get Suggestion" button and the "Reset" button.
- **Simplicity:** Jetpack Compose simplifies UI development on Android, making it faster and easier to build interfaces with less code.

## Error Handling
The error handling mechanism displays an error message in **red** to indicate invalid input. It also provides an encouraging message suggesting valid options, such as: *"INVALID. Try: Morning, Mid-Morning, Afternoon, Afternoon Snack Time, Dinner, or After Dinner/Night."*

## GitHub and GitHub Actions
A repository is hosted on **GitHub** to store the source code, showcase the project, and manage changes over time.
- **Git:** Used to commit and push code updates.
- **GitHub Actions:** Automatically runs tests to verify code functionality and builds the app by compiling the source code into a usable format.