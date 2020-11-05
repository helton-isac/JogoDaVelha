package com.hitg.jogodavelha.model

import org.junit.Assert
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@Nested
class GameTestJU5 {

    @Nested
    @DisplayName("Given a game")
    class SetGame() {

        lateinit var game: Game

        @BeforeEach
        fun beforeEach() {
            game = Game("Heider", "Android")
        }

        @Nested
        @DisplayName("When a player does three cells in a row")
        inner class SetThreeCellsInARow() {

            @BeforeEach
            fun beforeEach() {
                val player = game.player1
                val cell = Cell(player)
                game.cells[0][0] = cell
                game.cells[0][1] = cell
                game.cells[0][2] = cell
            }

            @DisplayName("Then the hasThreeSameHorizontalCells should return true")
            @Test
            fun checkHasThreeSameHorizontalCells() {
                val hasThreeSameHorizontalCells = game.hasThreeSameHorizontalCells()
                Assert.assertTrue(hasThreeSameHorizontalCells)
            }
        }
    }
}