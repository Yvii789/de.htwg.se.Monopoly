package de.htwg.se.Monopoly.controller

import de.htwg.se.Monopoly.controller.GameStatus
import de.htwg.se.Monopoly.util.Command
/**
class SolveCommand(controller: Controller) extends Command {
  var memento: Grid = controller.grid
  override def doStep: Unit = {
    memento = controller.grid

  }

  override def undoStep: Unit = {
    val new_memento = controller.grid
    controller.grid = memento
    memento = new_memento
  }

  override def redoStep: Unit = {
    val new_memento = controller.grid
    controller.grid = memento
    memento = new_memento
  }
}
*/