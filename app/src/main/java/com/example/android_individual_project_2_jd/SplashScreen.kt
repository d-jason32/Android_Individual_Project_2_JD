package com.example.android_individual_project_2_jd

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(
    nav: NavHostController
) {
    LaunchedEffect(Unit) {
        delay(2000)
        nav.navigate("onboarding") {
            popUpTo("splash") { inclusive = true }
        }
    }

    Surface(
        color = Color.LightGray,
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Make the font larger
            Text(
                "Long Island Plant and Tree Identifier",
                // Center the words on the splash screen
                textAlign = TextAlign.Center,

                // makes the font larger
                fontSize = 30.sp,

                // Make the font bold
                fontWeight = FontWeight.Bold
            )

            // Add a picture of the logo
            PlantPicture()


        }
    }
}
