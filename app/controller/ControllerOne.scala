package controller

import play.api.mvc.Action
import play.api.mvc.AnyContent
import play.api.mvc.Controller

trait ControllerOne extends Controller {

	def index: Action[AnyContent]

}