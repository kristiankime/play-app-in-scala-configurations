/**
 * All the controllers are pulled from the selected configuration (see the configuration package object)
 * and placed here. This allows the usual routing aka "controller.ControllerOne.index" in the routes file.
 * 
 * Note the reason this package is "controller" and not "controllers" is that the play_2.10 jar already
 * contains a controllers package object. 
 * 
 * It seems as though this will be removed but the result is unclear
 * 
 * https://github.com/playframework/Play20/pull/489
 * https://github.com/playframework/Play20/pull/735
 */
package object controller {

	val ControllerOne = configuration.ApplicationConfig.controllerOne

	val ControllerTwo = configuration.ApplicationConfig.controllerTwo
}
