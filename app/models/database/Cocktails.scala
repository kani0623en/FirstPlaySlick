package models.database

/**
 * Created by gradifex on 4/9/14.
 */
//import play.api.db.slick.Config.driver.simple._
import scala.slick.driver.H2Driver.simple._

class Cocktails(tag: Tag) extends Table[(Int, String, String)](tag, "SUPPLIERS") {
  def id = column[Int]("SUP_ID", O.PrimaryKey)
  def name = column[String]("SUP_NAME")
  def street = column[String]("STREET")
  def * = (id, name, street)
}
val cocktails = TableQuery[Cocktails]