package com.example.composenavigation0003.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.composenavigation0003.R
import com.example.composenavigation0003.ui.components.NormalText

@Composable
fun Home(navController: NavController? = null) {

    Column(
        Modifier
            .fillMaxSize()
            .padding(top = 24.dp, bottom = 12.dp)) {
        TextField(
            value = "",
            onValueChange = {

            },
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            shape = RoundedCornerShape(5.dp),
            leadingIcon = {
                Icon (imageVector = Icons.Default.Search,"" )
            }
        )

        LazyColumn{
            var i = 0
            this.items((0..4).toList()){
                TaskCard("Item ${++i}")
            }
        }
    }

}

@Composable
fun TaskCard(task: String, navController: NavController? = null) {
    Card(elevation = 4.dp,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(top = 8.dp)
            .clickable {
                navController?.navigate("task")
            })
    {
        Row(modifier = Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.ic_todo),
                contentDescription = "",
            modifier = Modifier
                .padding(end = 32.dp)
                .size(32.dp))
            NormalText(text = task)

        }

    }

}

@Preview
@Composable
fun HomePreview() {
    Home()

}