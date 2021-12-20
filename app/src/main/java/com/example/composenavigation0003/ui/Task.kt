package com.example.composenavigation0003.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.composenavigation0003.ui.components.TitleText

@Composable
fun Task(navController: NavController? = null) {

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(12.dp)) {

        TitleText(title = "Task details")
        LazyColumn{
            var i = 0
            this.items((0..5).toList()){
                TaskCard("Detail item ${++i}")
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun TaskPreview() {
    Task()

}