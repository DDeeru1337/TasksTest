package com.example.taskstest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.taskstest.ui.theme.TasksTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TasksTestTheme {
                println(Event(
                    title = "Study Kotlin",
                    description = "Commit to studying Kotlin at least 15 minutes per day.",
                    daypart = "Evening",
                    duration = 15))
            }
        }
    }
}
