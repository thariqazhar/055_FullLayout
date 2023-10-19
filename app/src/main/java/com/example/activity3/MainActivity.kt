package com.example.activity3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.activity3.ui.theme.Activity3Theme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Activity3Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    HomeScreen(judul = "Thariq Azhar")
                }
            }
        }
    }
}


@Composable
fun HomeScreen(judul:String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()) {
        Text(
            text = judul,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(16.dp)
        )

        box1()

        Spacer(modifier = Modifier.padding(13.dp))

        Location()

        Spacer(modifier = Modifier.padding(13.dp))

        Detail()
    }
}

@Composable
fun box1() {
    val image = painterResource(R.drawable.bg1)
    val warna = Color(0xFFD6F2FE)
    Box(modifier = Modifier
        .clip(RoundedCornerShape(25.dp))
        .background(color = warna)
        .fillMaxWidth())
    {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth())
        {
            Text(
                text = ""
            )
            Image(
                painter = image,
                contentDescription = "",
                modifier = Modifier
                    .size(200.dp)
            )
            Text(
                text = "Rain",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
            Text(
                text = "",
                fontSize = 20.sp
            )
        }
    }
}

@Composable
fun Location() {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier) {
        Text(
            text = "19°C",
            fontWeight = FontWeight.Bold,
            fontSize = 50.sp,
        )

        Spacer(modifier = Modifier.padding(3.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.location),
                contentDescription = "Background Image",
                modifier = Modifier
                    .size(30.dp)
            )

            Text(
                text = " Yogyakarta",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        }

        Spacer(modifier = Modifier.padding(3.dp))

        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier) {
            Text(
                text = "Kasihan, Kabupaten Bantul,",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )

            Text(
                text = "Daerah Istimewa Yogyakarta",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun Detail() {
    val warna = Color(0xFFD6F2FE)
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(25.dp))
            .background(color = warna)) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth().padding(25.dp)
                    .fillMaxWidth()) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier) {
                    Text(
                        text = "Humidity")
                    Text(
                        text = "98%",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp)

                    Spacer(modifier = Modifier.padding(15.dp))

                    Text(
                        text = "Sunrise")
                    Text(
                        text = "05.00 AM",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp)
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(3.dp)) {
                    Text(
                        text = "UV Index")
                    Text(
                        text = "9 / 10",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp)

                    Spacer(modifier = Modifier.padding(15.dp))

                    Text(
                        text = "Sunset")
                    Text(
                        text = "05.40 PM",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Activity3Theme {
        HomeScreen(judul = "Thariq Azhar")
    }
}