package com.mnp.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun HelloWorld(innerPadding: PaddingValues){
    Column (
        //modifier = Modifier.padding(innerPadding)
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        repeat(10){counter ->
            Text(
                text = "$counter. Hello World!",
                fontSize = 30.sp
            )
        }
    }
}