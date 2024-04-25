package br.senai.sp.jandira.loginpage.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.loginpage.R
import br.senai.sp.jandira.loginpage.model.Viagem
import java.time.LocalDate

class ViagemRepositorio {

    @Composable
    fun listarTodasAsViagens(): List <Viagem> {
        val londres = Viagem(
            id = 1,
            destino = "Londres",
            descricao = "London is the capital and largest city of the United Kingdom, with a population of just under 9 milions",
            dataChegada = LocalDate.of(2019, 2, 18),
            dataPartida = LocalDate.of(2019, 2, 21),
            imagem = painterResource(id = R.drawable.london)
        )
        val porto = Viagem(
            id = 2,
            destino = "Paris",
            descricao = "Porto is the second city in Portugal, the capital of the porto District, and one of the Iberian Peninsulas major urban aress.",
            dataChegada = LocalDate.of(2024, 10, 7),
            dataPartida = LocalDate.of(2024, 10, 29),
            imagem = painterResource(id = R.drawable.london)
        )


        
        return listOf(londres, porto)
    }
}