package com.example.surf8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.surf8.ui.theme.Surf8Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surf8Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Box(){
        Image(
            modifier = Modifier
                .padding(top = 140.dp)
                .size(283.dp)
                .align(Alignment.TopCenter),
            painter = painterResource(id = R.mipmap.womenpng),
            contentDescription = "Женщина с коктелем",
            contentScale = ContentScale.FillWidth)
        Text(
            text = "My cocktails",
            modifier = Modifier
                .padding(top = 140.dp)
                .size(187.dp, 47.dp)
                .align(Alignment.Center),
            fontSize = 32.sp,
            fontWeight = FontWeight.SemiBold
        )
        Text(
            text = "Add your first \n cocktail here",
            modifier = Modifier
                .padding(top = 370.dp, start = 30.dp)
                .size(140.dp)
                .align(Alignment.Center)
        )
        Image(modifier = Modifier
            .padding(top = 440.dp)
            .size(100.dp)
            .align(Alignment.Center),
            painter = painterResource(id = R.drawable.baseline_keyboard_arrow_down_24),
            contentDescription = "красная стрелка к кнопке",
            contentScale = ContentScale.FillWidth
        )
        Image(modifier = Modifier
            .padding(top = 500.dp)
            .size(100.dp)
            .align(Alignment.Center),
            painter = painterResource(id = R.drawable.blue_24),
            contentDescription = "синяя стрелка к кнопке",
            contentScale = ContentScale.FillWidth
        )
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(bottom = 20.dp)
                .clip(CircleShape)
                .size(100.dp) //увеличил размеры кнопки
                .align(Alignment.BottomCenter),
            colors = ButtonDefaults.buttonColors(Color.Blue)
        ) {
            Text(text = "+",
                fontSize = 50.sp,
                fontWeight = FontWeight.Light,
            )
        }

    }
}
