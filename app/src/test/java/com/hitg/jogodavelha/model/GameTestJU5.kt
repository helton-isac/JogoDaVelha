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
        lateinit var player1: Player
        lateinit var player2: Player

        @BeforeEach
        fun beforeEach() {
            game = Game("Heider", "Android")
            player1 = game.player1!!
            player2 = game.player2!!
        }

        @Nested
        @DisplayName("When a player has three cells in the first row")
        inner class SetThreeCellsInTheFirstRow() {

            @BeforeEach
            fun beforeEach() {
                val cell = Cell(player1)
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
        @DisplayName("When a player has three cells in the second row")
        inner class SetThreeCellsInTheSecondRow() {

            @BeforeEach
            fun beforeEach() {
                val cell = Cell(player1)
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

        @Nested
        @DisplayName("When a player has three cells in the last row")
        inner class SetThreeCellsInTheLastRow() {

            @BeforeEach
            fun beforeEach() {
                val cell = Cell(player1)
                game.cells[2][0] = cell
                game.cells[2][1] = cell
                game.cells[2][2] = cell
            }

            @DisplayName("Then the hasThreeSameHorizontalCells should return true")
            @Test
            fun checkHasThreeSameHorizontalCells() {
                val hasThreeSameHorizontalCells = game.hasThreeSameHorizontalCells()
                Assert.assertTrue(hasThreeSameHorizontalCells)
            }
        }

        @Nested
        @DisplayName("When a player has only two cells in a row")
        inner class SetAThreeCellsInTheLastRow() {

            @BeforeEach
            fun beforeEach() {
                val cell = Cell(player1)
                val anotherCell = Cell(player2)
                game.cells[2][0] = cell
                game.cells[2][1] = cell
                game.cells[2][2] = anotherCell
            }

            @DisplayName("Then the hasThreeSameHorizontalCells should return false")
            @Test
            fun checkHasThreeSameHorizontalCells() {
                val hasThreeSameHorizontalCells = game.hasThreeSameHorizontalCells()
                Assert.assertFalse(hasThreeSameHorizontalCells)
            }
        }
    }
}