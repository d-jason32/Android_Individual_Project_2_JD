package com.example.android_individual_project_2_jd

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun Home(
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
                "Welcome to the Quiz Game!",
                // Center the words on the splash screen
                textAlign = TextAlign.Center,

                // makes the font larger
                fontSize = 30.sp,

                // Make the font bold
                fontWeight = FontWeight.Bold
            )

            // Add a picture of the logo
            PlantPicture()

            // Button to go to the register account page
            ElevatedButton(
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Green,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp, horizontal = 20.dp),
                onClick = { nav.navigate("question1") }
            ) {
                Text("PLAY", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            }

            // Button to go to the rules page
            ElevatedButton(
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp, horizontal = 20.dp),
                onClick = { nav.navigate("rules") }
            ) {
                Text("Read the rules!", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            }



        }
    }
}
