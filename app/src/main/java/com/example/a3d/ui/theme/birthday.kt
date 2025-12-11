package com.example.a3d.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a3d.R

@Preview(showSystemUi = true)
@Composable
fun Creating() {

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(8.dp)) {

        Pretexting(message = "Happy Birthday ", form = "Niloy")

    }
}

@Composable
fun Pretexting(message: String, form: String, modifier: Modifier = Modifier) {


    Box(modifier) {
        Image(
            painter = painterResource(R.drawable.androidparty),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 100F
        )

        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier
        ) {

            Text(
                text = message,
                fontSize = 100.sp,
                lineHeight = 160.sp,
                textAlign = TextAlign.Center
            )

            Text(
                text = form,
                fontSize = 36.sp,
                modifier = Modifier
                    .padding(16.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
        }
    }


}