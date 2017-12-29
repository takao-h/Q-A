/**
  * Created by ruth on 2017/12/14.
  */
object Entities {

  case class User(email: String, passWord: String, twitterAccessToken: Option[String] = None, facebook_access_token: Option[String] = None, instagram_access_token: Option[String] = None)

}

