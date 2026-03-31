package com.example.socialsparkapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
// import androidx.core.app.RemoteInput
import com.example.socialsparkapp.ui.theme.SocialSparkAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SocialSparkAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SocialSparkApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun SocialSparkApp(modifier: Modifier = Modifier) {
    var timeInput by remember { mutableStateOf("") }
    var suggestion by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf("") }

    Column(modifier = modifier.padding(16.dp)) {
        TextField(
            value = timeInput,
            onValueChange = { timeInput = it },
            label = { Text("Enter time of day") }
        )

        Spacer(Modifier.height(8.dp))

        Button(onClick = {
            if (validateInput(timeInput)) {
                suggestion = getSocialSpark(timeInput)
                errorMessage = ""
            } else {
                suggestion = ""
                errorMessage = "Invalid time. Try: morning , mid-morning , afternoon , afternoon snack time , dinner , after dinner , night ."
            }
        }) {
            Text("Get Suggestion")
        }

        Spacer(Modifier.height(8.dp))

        if (errorMessage.isNotEmpty()) {
            Text(text = errorMessage, color = Color.Red)
        } else {
            Text(text = "Suggestion: $suggestion")
        }

        Spacer(Modifier.height(8.dp))

        Button(onClick = {
            timeInput = ""
            suggestion = ""
            errorMessage = ""
        }) {
            Text("Reset")
        }
    }
}

// Validation Logic
fun validateInput(input: String): Boolean {
    val validTimes = listOf("morning", "mid-morning", "afternoon", "afternoon snack time", "dinner", "after dinner" , "night")
    return validTimes.contains(input.lowercase())
}



// Social spark logic
fun getSocialSpark(time: String): String {
    return when (time.lowercase()) {
        "morning" -> "Send a 'Good morning' text to a family member."
        "mid-morning" -> "Reach out to a colleague with a quick 'Thank you'."
        "afternoon" -> "Share a funny meme or interesting link with a friend."
        "afternoon snack time" -> "Send a quick 'thinking of you' message."
        "dinner" -> "Call a friend or relative for a 5-minute catch-up."
        "after dinner" -> "Leave a thoughtful comment on a friend's post."
        "night" -> "Leave a thoughtful comment on a friend's post."
        else -> "" // Handled by the validation logic
    }

}

@Preview(showBackground = true)
@Composable
fun SocialSparkPreview() {
    SocialSparkAppTheme {
        SocialSparkApp()
    }
}
