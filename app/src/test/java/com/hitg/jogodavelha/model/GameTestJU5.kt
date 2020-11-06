package com.hitg.jogodavelha.model

import org.junit.Assert
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@DisplayName("GameTest with jUnit5")
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
        @DisplayName("When a player does three cells in the first row")
        inner class SetThreeCellsInTheFirstRow() {

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

        @Nested
        @DisplayName("When a player does three cells in the second row")
        inner class SetThreeCellsInTheSecondRow() {

            @BeforeEach
            fun beforeEach() {
                val player = game.player1
                val cell = Cell(player)
                game.cells[1][0] = cell
                game.cells[1][1] = cell
                game.cells[1][2] = cell
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