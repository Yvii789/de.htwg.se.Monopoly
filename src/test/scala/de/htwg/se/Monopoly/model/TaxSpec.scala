package de.htwg.se.Monopoly.model

import org.scalatest._
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TaxSpec extends WordSpec with Matchers {
  "A Tax" when {
    "create" should {
      val tax = Tax(22, "DiesIstEineSteuer", 200)
      "have a name, index, amount" in {
        tax.index should be (22)
        tax.name should be ("DiesIstEineSteuer")
        tax.taxAmount should be (200)
      }
    }
    "actOnPlayer" should {
      val tax = Tax(22, "DiesIstEineSteuer", 200)
      val player = new Player("Yvonne")
      "return a string" in {
        tax.actOnPlayer(player) should be ("DiesIstEineSteuer: 200")
      }
    }
    "unapply" should {
      val tax = Tax(22, "DiesIstEineSteuer", 200)
      "test for unapply method" in {
        Tax.unapply(tax).get should be ((22, "DiesIstEineSteuer", 200))
      }
    }
  }
}