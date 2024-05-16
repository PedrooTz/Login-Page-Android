package br.senai.sp.jandira.loginpage.repositorio

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import br.senai.sp.jandira.loginpage.R
import br.senai.sp.jandira.loginpage.model.Categoria
import java.time.LocalDate

class CategoriaRepositorio {

    @Composable
    fun listarTodasAsCaregorias(): List<Categoria> {
        val montain = Categoria(
            id = 1,
            nome = stringResource(id = R.string.montain),
            icone = Icons.Default.Email
        )
        val senha = Categoria(
            id = 2,
            nome = stringResource(id = R.string.snow),
            icone = Icons.Default.Lock
        )
        return listOf(montain, senha
        )
    }
}