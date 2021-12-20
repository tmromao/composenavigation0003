package com.example.composenavigation0003.ui


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainComponent() {

    val navController = rememberNavController()

    Surface(
        modifier = Modifier.fillMaxSize()

    )
    {
        NavHost(navController = navController, startDestination = "home"){
            composable("home"){
                Home(navController)
            }
            composable("task"){
                Task()
            }
        }

    }


}

@Preview
@Composable
fun MainPreview() {
    MainComponent()
}