import configuration.DevConfiguration
import configuration.ProdConfiguration
import play.api.Play

/**
 * This file contains the "trick" which allows us to do compile time configuration based on a run time setting.
 * Here we use a property from the application.conf (or equivalent file) to switch.
 * Switching could also be done on environment variables as follows:
 *     scala.util.Properties.envOrElse("MODE", "dev")
 */
package object configuration {

	val ApplicationConfig = Play.current.configuration.getString("application.mode", Some(Set("dev", "prod"))) match {
		case Some("dev") => DevConfiguration;
		case Some("prod") => ProdConfiguration;
		case mode => throw new IllegalStateException("Specified mode " + mode + " was not understood")
	}

}