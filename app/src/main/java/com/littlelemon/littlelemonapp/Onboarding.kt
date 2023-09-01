package com.littlelemon.littlelemonapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.littlelemon.littlelemonapp.ui.theme.Green
import com.littlelemon.littlelemonapp.ui.theme.Yellow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OnboardingScreen() {
    var firstName by remember {
        mutableStateOf("First name")
    }
    var secondName by remember {
        mutableStateOf("Second name")
    }
    var email by remember {
        mutableStateOf("Email")
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo image",
            alignment = Alignment.Center,
            modifier = Modifier
                .size(200.dp, 65.dp)
        )
        Text(
            text = "Let's get to know you",
            fontSize = 32.sp,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(Green)
                .wrapContentSize(Alignment.Center)
        )
        Text(
            text = "Personal information",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, bottom = 24.dp, top = 48.dp)
        )
        Column {
            Text(
                text = "First name",
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
            TextField(
                value = firstName,
                onValueChange = { newText -> firstName = newText },
                textStyle = TextStyle(fontSize = 12.sp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, bottom = 24.dp)
                    .height(50.dp)
            )


            Text(
                text = "Second name",
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
            TextField(
                value = secondName,
                onValueChange = { newText -> secondName = newText },
                textStyle = TextStyle(fontSize = 12.sp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, bottom = 24.dp)
                    .height(50.dp)
            )
            Text(
                text = "Email",
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
            TextField(
                value = email,
                onValueChange = { newText -> email = newText},
                textStyle = TextStyle(fontSize = 12.sp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, bottom = 24.dp)
                    .height(50.dp)
            )

        }
        
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Yellow),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = "Register",
                color = Color.Black)
        }
    }
}

@Preview
@Composable
fun OnboardingScreenPreview() {
    OnboardingScreen()
}