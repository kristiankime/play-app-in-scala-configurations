package configuration

import controller.ControllerOne
import controller.ControllerTwo
import play.api.mvc.Action

object ProdConfiguration extends ApplicationConfiguration {

	override val controllerOne = new Object with ControllerOne {
		override def index = Action {
			Ok(views.html.index("Your new prod application is ready."))
		}
	}

	override val controllerTwo = new Object with ControllerTwo {
		override def info = Action {
			Ok(views.html.index("Information about your prod mode application."))
		}
	}

}