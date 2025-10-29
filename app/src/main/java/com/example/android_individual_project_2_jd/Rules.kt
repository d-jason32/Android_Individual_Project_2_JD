package com.example.android_individual_project_2_jd

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController



@Composable
fun Rules(
    nav: NavHostController,
    modifier: Modifier = Modifier
) {

    Surface(
        color = Color.LightGray,
    ) {
        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Make the font larger
            Text(
                "RULES",
                // Center the words on the splash screen
                textAlign = TextAlign.Center,

                // makes the font larger
                fontSize = 30.sp,

                // Make the font bold
                fontWeight = FontWeight.Bold
            )

            // Add a picture of the logo
            PlantPicture()

            Text(
                text = "1. You will be asked 5 questions.\n\n" +
                        "2. One question will have multiple choices.\n\n" +
                        "3. One question has multiple answers.\n\n" +
                        "4. Choose the answer and submit.\n\n",

                color = Color.Black,
                style = MaterialTheme.typography.bodyLarge,
                lineHeight = 22.sp
            )

            // Button to go to the register account page
            ElevatedButton(
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray
                ),
                onClick = { nav.navigate("home") }
            ) {
                Text("Go back")
            }


        }
    }
}