package br.senai.sp.jandira.loginpage.screens

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.loginpage.R

@Composable
fun TelaLogin(controleNavegacao: NavHostController) {

    var emailState = remember {
        mutableStateOf("")
    }
    var senhaState = remember {
        mutableStateOf("")
    }

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
            Text(text = stringResource(id = R.string.sign_intro)
                , color = Color(0xAA000000))
        }
        Column (

        ){
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                shape = RoundedCornerShape(12.dp),
                value = emailState.value,
                onValueChange = {
                    emailState.value = it
                },
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
                value = senhaState.value,
                onValueChange = {
                    senhaState.value = it
                },
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
                    onClick = { controleNavegacao.navigate("home") },
                    modifier = Modifier
                        .height(60.dp)
                        .width(180.dp),
                    colors = ButtonDefaults
                        .buttonColors(containerColor = Color(0xF1C107F5)),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(text = stringResource(id = R.string.text_button))
                }
                Row (
                    modifier = Modifier
                        .padding(12.dp),
                ){


                    Text(text = stringResource(id = R.string.notice_sign))
                    Text(text = stringResource(id = R.string.sign_button), color = Color(0xF1C107F5),
                        modifier = Modifier.clickable { controleNavegacao.navigate("sign") })
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

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TelaLoginPreview() {
    TelaLogin(controleNavegacao = rememberNavController())
    
}




