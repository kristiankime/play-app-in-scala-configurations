package controller

import play.api.mvc.Action
import play.api.mvc.AnyContent
import play.api.mvc.Controller

 trait ControllerTwo extends Controller {
	
	def info : Action[AnyContent]
  
}