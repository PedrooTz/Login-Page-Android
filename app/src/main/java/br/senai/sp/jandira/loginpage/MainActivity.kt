package br.senai.sp.jandira.loginpage

import android.graphics.drawable.Icon
import android.media.Image
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
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
import androidx.compose.ui.res.painterResource
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
                    GreetingLogin()

                }
            }
        }
    }
}

@Composable
fun GreetingLogin() {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
        ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
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
            Text(
                text = "Login",
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xF1C107F5)
            )
            Text(text = "Please sign in to continue", color = Color(0xAA000000))
        }
        Column (

        ){
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                shape = RoundedCornerShape(12.dp),
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

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 16.dp),
                shape = RoundedCornerShape(12.dp),
                value = "",
                onValueChange = {},
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "email",
                        tint = Color(0xF1C107F5),
                        modifier = Modifier
                            .size(32.dp)
                    )
                },
                label = {
                    Text(text = "pedro123")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xF1C107F5),
                    focusedBorderColor = Color(0xF1C107F5)
                )
            )


        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),

            horizontalArrangement = Arrangement.End
        ) {
            Column(
                modifier = Modifier
                    .padding(24.dp),
                horizontalAlignment = Alignment.End
            ) {

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(60.dp)
                        .width(180.dp),
                    colors = ButtonDefaults
                        .buttonColors(containerColor = Color(0xF1C107F5)),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(text = "SIGN IN")
                }
                Row (
                    modifier = Modifier
                        .padding(12.dp),
                ){


                    Text(text = "Don't have an account?")
                    Text(text = "Sign Up", color = Color(0xF1C107F5))
                }
                }

                }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {

            Card(
                modifier = Modifier
                    .height(50.dp)
                    .width(150.dp),
                colors = CardDefaults.cardColors(containerColor = Color(color = 0xF1C107F5)),
                shape = RoundedCornerShape(topStart = 0.dp, topEnd = 28.dp)
            ) {}

        }


    }


}









@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LoginPageTheme {
        GreetingLogin()

    }
}




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingShow(){
    LoginPageTheme {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
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
                    .padding(4.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Sign Up",
                        fontSize = 36.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xF1C107F5)
                    )
                    Text(text = "Create a new account", color = Color(0xAA000000))
                }

            }
            Card (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(height = 110.dp, width = 100.dp)
                    .padding(top = 12.dp), shape = CircleShape,
                border = BorderStroke(2.dp, Color(0xF1C107F5))
            ){

                androidx.compose.foundation.Image(
                    modifier = Modifier
                        .size(height = 100.dp, width = 100.dp)
                        .offset(y = 6.dp),
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = ""
                )
            }

            androidx.compose.foundation.Image(
                modifier = Modifier
                    .offset(x = 220.dp, y = -25.dp)
                    .size(height = 30.dp, width = 30.dp),
                painter = painterResource(id = R.drawable.cam),
                contentDescription = "")
            Column (
                modifier = Modifier
                    .padding(bottom = 1.dp),

            ){
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 18.dp),
                    shape = RoundedCornerShape(12.dp),
                    value = "",
                    onValueChange = {},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "nome",
                            tint = Color(0xF1C107F5),
                            modifier = Modifier
                                .size(32.dp)
                        )
                    },
                    label = {
                        Text(text = "Nome")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xF1C107F5),
                        focusedBorderColor = Color(0xF1C107F5)
                    )
                )

                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 18.dp, vertical = 10.dp),
                    shape = RoundedCornerShape(12.dp),
                    value = "",
                    onValueChange = {},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Phone,
                            contentDescription = "phone",
                            tint = Color(0xF1C107F5),
                            modifier = Modifier
                                .size(32.dp)
                        )
                    },
                    label = {
                        Text(text = "Phone")
                    },

                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xF1C107F5),
                        focusedBorderColor = Color(0xF1C107F5)
                    )
                )
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 18.dp,),
                    shape = RoundedCornerShape(12.dp),
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
                        Text(text = "E-mail")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xF1C107F5),
                        focusedBorderColor = Color(0xF1C107F5)
                    )
                )

                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 18.dp, vertical = 10.dp),
                    shape = RoundedCornerShape(12.dp),
                    value = "",
                    onValueChange = {},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "password",
                            tint = Color(0xF1C107F5),
                            modifier = Modifier
                                .size(32.dp)
                        )
                    },
                    label = {
                        Text(text = "Password")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xF1C107F5),
                        focusedBorderColor = Color(0xF1C107F5)
                    )
                )
                Row (
                    modifier = Modifier
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){

                    Checkbox(checked = false, onCheckedChange = {},
                        colors = CheckboxDefaults.colors(checkedColor = Color(0xF1C107F5), uncheckedColor = Color(0xF1C107F5))

                    )
                    Text(text = "Over 18?")
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),

                horizontalArrangement = Arrangement.End
            ) {
                Column(
                    modifier = Modifier
                        .padding(12.dp),
                    horizontalAlignment = Alignment.End
                ) {

                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .height(50.dp)
                            .width(350.dp)
                            .padding(2.dp),
                        colors = ButtonDefaults
                            .buttonColors(containerColor = Color(0xF1C107F5)),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text(text = "CREATE ACCOUNT")
                    }
                    Row (
                    ){
                        Text(text = "Already have an account?")
                        Text(text = "Sign Up", color = Color(0xF1C107F5))
                    }
                }

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {

                Card(
                    modifier = Modifier
                        .height(50.dp)
                        .width(150.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(color = 0xF1C107F5)),
                    shape = RoundedCornerShape(topStart = 0.dp, topEnd = 28.dp)
                ) {}

            }


        }


    }

    }
