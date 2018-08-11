package json

import play.api.libs.functional.syntax._
import play.api.libs.json._

object JsonReadExamples {
  def main(args: Array[String]): Unit = {
    read1()
  }

  case class Team(teamName: String, players: List[Player], location: Location)

  case class Player(name: String, age: Int)

  case class Location(lat: Double, long: Double)

  val jsonString =
    """{
      |  "teamName" : "Real Madrid FC",
      |  "players" : [{
      |    "name" : "Ronaldo",
      |    "age" : 36
      |  }, {
      |    "name" : "Modric",
      |    "age" : 30
      |  }, {
      |    "name" : "Bale",
      |    "age" : 27
      |  }],
      |  "location" : {
      |    "lat" : 40.4168,
      |    "long" : 3.7038
      |  }
      |}
      |""".stripMargin

  def read1() = {
    val jValue = Json.parse(jsonString)

    println((jValue \ "teamName").as[String])
    println((jValue \ "location" \ "lat").as[Double])
    println((jValue \ "players")(0)))
  }
}


