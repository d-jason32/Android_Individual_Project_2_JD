package com.example.android_individual_project_2_jd
// All the imports required for the app.

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.android_individual_project_2_jd.ui.theme.Android_Individual_Project_1_JDTheme

// Main activity for the application
// The main activity for the app will start off at the splash screen
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android_Individual_Project_1_JDTheme {
                MyApp(modifier = Modifier.fillMaxSize())
                
            }
        }
    }
}





// Function to display the splash screen
@Preview(showBackground = true, widthDp = 320, heightDp = 320)
@Composable
fun OnboardingPreview() {
    Android_Individual_Project_1_JDTheme {
        OnboardingScreen(
            onContinueClicked = {},
            onRegisterClicked = {},
        )
    }
}


@Preview
@Composable
fun MyAppPreview() {
    Android_Individual_Project_1_JDTheme {
        MyApp(Modifier.fillMaxSize())
    }
}


// Main app function to allow for navigation
@Composable
fun MyApp(modifier: Modifier = Modifier) {
    // Needed to create a navigation controller
    val nav = rememberNavController()

    Surface(modifier) {
        NavHost(
            navController = nav,
            // makes the app start at the login screen
            startDestination = "splashscreen"
        ) {
            composable("onboarding") {

                /*
                If the button on the splash screen is clicked,
                it will go to the login screen.

                If the button on the login screen is clicked, it will go
                to the register screen.

                If the button on the register screen is clicked, it will go onto the
                login screen.
                 */

                OnboardingScreen(
                    onContinueClicked = {
                        nav.navigate("login") {

                        }
                    },

                    onRegisterClicked = {
                        nav.navigate("register") {

                        }
                    }
                )
            }
            // Route for the login screen
            composable("login") { Login(nav) }

            // route for the register screen
            composable("register") { RegisterScreen(nav) }

            // route for the splash screen
            composable("splashscreen") { SplashScreen(nav) }

            // route for the home page
            composable("home") { Home(nav) }

            // route for the rules page
            composable("rules") { Rules(nav) }

            // route for the question1 page
            composable("question1") { Question1(nav) }

            // route for the question1 page
            composable("question2") { Question2(nav) }
            composable("question3") { Question3(nav) }
            composable("question4") { Question4(nav) }
            composable("question5") { Question5(nav) }
            composable("finish") { Finish(nav) }


        }
    }
}
