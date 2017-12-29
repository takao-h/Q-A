package models

import com.google.common.collect.{Table, Tables}
import com.sun.corba.se.impl.orbutil.closure.Future
import com.sun.javadoc.Tag
import play.api.db

/**
  * Created by ruth on 2017/12/24.
  */
object Tables  extends {
  case class User(email: String, passWord: String, twitterAccessToken: Option[String] = None, facebookAccessToken: Option[String] = None, instagramAccessToken: Option[String] = None)

  class Users(tag: Tag) extends Table[User](tag, "user") {
    def email = column[String]("email", O.PrimaryKey)
    def password = column[String]("password")
    def twitterAccessToken = column[String]("twitter_access_token")
    def facebookAccessToken = column[String]("facebook_access_token")
    def instagramAccessToken = column[String]("instagram_access_token")

    def * = (email,password,twitterAccessToken,facebookAccessToken,instagramAccessToken) <> (User.tupled, User.unapply)
  }

  object Users extends TableQuery(new Users(_))

  implicit val getUserResult = {
    GetResult { r => User(r.<<, r.<<, r.<<, r.<<, r.<<) }
  }
  val f: Future[Seq[User]] = db.run(sql"select * from user".as[User])
}

