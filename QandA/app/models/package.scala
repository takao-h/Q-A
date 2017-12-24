/**
  * Created by ruth on 2017/12/14.
  */
package object Entities {

  case class User(email: String, passWord: String, twitterAccessToken: Option[String] = None)

}
