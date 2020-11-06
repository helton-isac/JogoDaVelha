package com.hitg.jogodavelha.ui.game

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hitg.jogodavelha.R

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    }

    // método para setar o jogadores que serão preenchidos pelo dialog
    fun onPlayersSet(player1: String, player2: String) {
    }

    // Exibe o dialog solicitando o nome dos jogadores
    fun promptForPlayers() {
    }
}