package br.senai.sp.jandira.loginpage.repositorio

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import br.senai.sp.jandira.loginpage.model.Categoria
import java.time.LocalDate

class CategoriaRepositorio {

    @Composable
    fun listarTodasAsCaregorias(): List<Categoria> {
        val montain = Categoria(
            id = 1,
            nome = "Montain",
            icone = Icons.Default.Email
        )
        val senha = Categoria(
            id = 2,
            nome = "Snow",
            icone = Icons.Default.Lock
        )
        return listOf(montain, senha
        )
    }
}