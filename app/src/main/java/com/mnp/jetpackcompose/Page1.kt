package com.mnp.jetpackcompose

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun Page1(modifier: Modifier = Modifier) {
    Text(
        text = "This is a Page1",
        fontSize = 30.sp,
        modifier = modifier
    )
}