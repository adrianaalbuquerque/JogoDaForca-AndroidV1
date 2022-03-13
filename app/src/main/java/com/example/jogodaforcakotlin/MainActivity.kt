package com.example.jogodaforcakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.jogodaforcakotlin.facade.Fachada

class MainActivity : AppCompatActivity() {
    private lateinit var fachada: Fachada
    private lateinit var tvdica: TextView
    private lateinit var tvpalavra: TextView
    private lateinit var tvinfos: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //implementação on create da sua super classe
        setContentView(R.layout.activity_main) // activity da pasta layout do res, o xml

        this.fachada = Fachada()
        fachada.Padrao()
        fachada.start()

        this.tvdica = findViewById(R.id.TextViewDica)
        this.tvdica.text = fachada.diquinha()

        tvpalavra = findViewById(R.id.textViewPalavra)
        this.tvpalavra.text = fachada.palavrota()

        tvinfos = findViewById(R.id.textViewinfos)
        tvinfos.text = fachada.infos()
    }
}

// esse layout mostra como será a aplicação
//É possível alterar o layout de 3 formas: Code, Split e Design
//E nesse layout só vai ter uma tela em branco com "hello world"

