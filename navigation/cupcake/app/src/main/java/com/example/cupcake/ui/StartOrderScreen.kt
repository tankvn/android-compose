package com.example.cupcake.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.cupcake.R

@Composable
fun StartOrderScreen() {
    Text(text = stringResource(R.string.start_order))
}

@Preview
@Composable
fun StartOrderPreview() {
    StartOrderScreen()
}