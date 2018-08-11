package controllers

import javax.inject.Inject
import javax.inject.Singleton
import play.api.mvc._

@Singleton
class HomeController @Inject()(cc: ControllerComponents)
  extends AbstractController(cc) {
    def index() = Action {
      Ok("Hello World")
        .withHeaders("Server" -> "Play")
        .withCookies(Cookie("id", scala.util.Random.nextInt().toString))
    }

    def hello(name: String) = Action {
      Ok("Hello " + name)
    }
}
