package de.htwg.se.model.fieldComponent.fieldBaseImpl

import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec
import de.htwg.se.model.moveComponent.Move

class ComputerModeStrategySpec extends AnyWordSpec {
  "ComputerModeStrategy" should {
    var field1 = new Field(1, 2, Stone.Empty)
    var field2 = new Field(1, 2, Stone.Empty)
    var field3 = new Field(1, 2, Stone.Empty)
    var field4 = new Field(1, 2, Stone.Empty)
    field2 = field2.put(Some(Move('i', 0, 0)))
    field2 = field2.put(Some(Move('i', 0, 1)))
    field4 = field4.put(Some(Move('i', 0, 1)))

    "have a valid computer input" in {

      ComputerModeStrategy().put(0, 0, field1) should be(field2)
    }
    "have a invalid computer input" in {
      ComputerModeStrategy().put(0, 1, field3) should be(field4)
    }
  }
}
