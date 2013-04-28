package configuration

import controller.ControllerOne
import controller.ControllerTwo

/**
 * This trait specifies what it means to be an application in this context.
 */
abstract trait ApplicationConfiguration {

	val controllerOne: ControllerOne

	val controllerTwo: ControllerTwo

}