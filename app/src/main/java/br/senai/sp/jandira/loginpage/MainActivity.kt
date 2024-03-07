package br.senai.sp.jandira.loginpage

import android.graphics.drawable.Icon
import android.media.Image
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.loginpage.ui.theme.LoginPageTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginPageTheme {
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

    Column(
        modifier = Modifier
            .fillMaxSize(),


        ) {
        Row(

        ) {

            Card(
                modifier = Modifier
                    .height(50.dp)
                    .width(150.dp),
                colors = CardDefaults.cardColors(containerColor = Color(color = 0xF1C107F5)),
                shape = RoundedCornerShape(topStart = 0.dp, bottomStart = 28.dp)
            ) {

            }
        }
        Column(
            modifier = Modifier
                .padding(12.dp)

        ) {
            Text(text = "Login", fontSize = 48.sp, fontWeight = FontWeight.Bold, color = Color(0xF1C107F5))
            Text(text = "Please sign in to continue", color = Color(0xAA000000))
        }
        Column {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "email",
                        tint = Color(0xF1C107F5),
                        modifier = Modifier
                            .size(32.dp)
                    )
                },
                label = {
                    Text(text = "pedro@gmail.com")
                },

                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xF1C107F5),
                    focusedBorderColor = Color(0xF1C107F5)
                )
            )
            Row (
            ){
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(70.dp)
                        .width(160.dp),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(text = "SIGN IN")

                    
                }
            }

        }

    }


}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LoginPageTheme {
        Greeting()
    }
}