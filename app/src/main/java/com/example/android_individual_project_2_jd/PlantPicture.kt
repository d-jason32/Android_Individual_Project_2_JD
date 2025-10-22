package com.example.android_individual_project_2_jd

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

// Composable function added to add a picture of the logo to the
// splash screen
@Composable
fun PlantPicture() {
    Image(painter = painterResource(id = R.drawable.plant),
        contentDescription = null  )
}