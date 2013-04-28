package configuration

import controller.ControllerOne
import controller.ControllerTwo
import play.api.mvc.Action

object DevConfiguration extends ApplicationConfiguration {

	override val controllerOne = new ControllerOne {
		override def index = Action {
			Ok(views.html.index("Application booted up in dev mode."))
		}
	}

	override val controllerTwo = new ControllerTwo {
		override def info = Action {
			Ok(views.html.index("Information about your dev mode application."))
		}
	}

}