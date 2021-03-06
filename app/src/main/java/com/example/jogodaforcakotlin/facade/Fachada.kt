package com.example.jogodaforcakotlin.facade

import JogoDaForca
import com.example.jogodaforcakotlin.repositorio.BancoDePalavras

class Fachada {
    private var banquitoPalavras = BancoDePalavras()
    private lateinit var jogo: JogoDaForca

    fun Padrao() {
        this.banquitoPalavras.adiciona("Casa", "Moradia")
        this.banquitoPalavras.adiciona("Bola", "Redondezas")
        this.banquitoPalavras.adiciona("Moto", "Onde Manuca voa")
    }

    fun start() {
        this.banquitoPalavras.sorteio()
        jogo = JogoDaForca(this.banquitoPalavras.palavrita(), this.banquitoPalavras.Dicaa())
        jogo.start()
    }

    fun diquinha(): String {
        var output = ""
        output += "Dica: ${jogo.getDica()}"

        return output
    }

     fun palavrota(): String {
         var output = ""
         output += "Palavra: ${jogo.getPalavra()}"

         return output
     }

    fun infos(): String {
        var output = ""

        output += "Tamanho da palavra: ${jogo.getTamanho()}\n"
        output += "Letras diferentes:   ${jogo.LetrasDistintas()}\n"
        output += "Letras utilizadas:      [${jogo.getLetrasUsadas()}]\n"
        output += "Tentativas:         ${jogo.getTentativas()}\n"
        output += "Acertos:            ${jogo.getAcertos()}\n"

        return output
    }

}