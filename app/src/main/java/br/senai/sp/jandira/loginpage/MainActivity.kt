package br.senai.sp.jandira.loginpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.loginpage.screens.TelaHome
import br.senai.sp.jandira.loginpage.screens.TelaLogin
import br.senai.sp.jandira.loginpage.screens.TelaSign
import br.senai.sp.jandira.loginpage.ui.theme.LoginPageTheme

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
                    val controleNavegacao = rememberNavController()
                    NavHost(navController = controleNavegacao,
                        startDestination = "login"
                    ){
                        composable(route = "login"){ TelaLogin(controleNavegacao) }
                        composable(route = "sign"){ TelaSign(controleNavegacao) }
                        composable(route = "home"){ TelaHome(controleNavegacao) }
                    }

                }
            }
        }
    }
}





