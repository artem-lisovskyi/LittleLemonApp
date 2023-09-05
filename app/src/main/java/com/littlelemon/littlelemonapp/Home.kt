package com.littlelemon.littlelemonapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    var search by remember {
        mutableStateOf("Enter search phrase")
    }

    var index by remember {
        mutableIntStateOf(0)
    }
    Column {
        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier.fillMaxWidth()
        ) {

            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo image",
                modifier = Modifier
                    .size(200.dp, 65.dp)
                    .padding(end = 48.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Profile",
                modifier = Modifier
                    .size(65.dp, 65.dp)
                    .padding(16.dp)
                    .clickable { navController.navigate(Profile.route) }
                    .clip(shape = CircleShape)

            )
        }
        Column(
            modifier = Modifier
                .background(Color(0xFF495E57))
                .padding(start = 12.dp, end = 12.dp, top = 16.dp, bottom = 16.dp)
        ) {
            Text(
                text = "Little Lemon",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFF4CE14)
            )
            Text(
                text = "Chicago",
                fontSize = 24.sp,
                color = Color(0xFFEDEFEE)
            )
            Row(
                modifier = Modifier
                    .padding(top = 18.dp)
            ) {
                Text(
                    text = "We are a family owned Mediterranean restaurant, focused on traditional recipes served with a modern twist.",
                    color = Color(0xFFEDEFEE),
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(bottom = 28.dp)
                        .fillMaxWidth(0.6f)
                )
                Image(
                    painter = painterResource(id = R.drawable.upperpanelimage),
                    contentDescription = "Upper Panel Image",
                    modifier = Modifier.clip(RoundedCornerShape(20.dp))
                )
            }
            OutlinedTextField(
                value = search,
                onValueChange = { search = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Gray)
            )
        }

        Column {
            Text(
                text = "ORDER FOR DELIVERY!",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp, start = 16.dp, end = 8.dp, bottom = 8.dp),
                fontWeight = FontWeight.Bold
            )
        }
        TabRow(
            selectedTabIndex = index,
            containerColor = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Button(
                onClick = { index = 0 },
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(20),
                modifier = Modifier
                    .wrapContentSize(unbounded = true)
                    .padding(16.dp)
            ) {
                Text(
                    text = "Starters",
                    color = Color(0xFF495E57)
                )
            }
            Button(
                onClick = { index = 1 },
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(20),
                modifier = Modifier
                    .wrapContentSize(unbounded = true)
                    .padding(16.dp)


            ) {
                Text(
                    text = "Mains",
                    color = Color(0xFF495E57)
                )

            }
            Button(
                onClick = { index = 2 },
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RoundedCornerShape(20),
                modifier = Modifier
                    .wrapContentSize(unbounded = true)
                    .padding(16.dp)


            ) {
                Text(
                    text = "Desserts",
                    color = Color(0xFF495E57)
                )

            }
        }
    }
}





