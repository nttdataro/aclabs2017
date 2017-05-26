package ro.nttdata.ligaaclabs.dojo.web.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * RESTConfiguration
 * <p>
 * This class provides the application path that serves as the base URI for all
 * resources.
 *
 */
@ApplicationPath("/api")
public class RESTConfiguration extends Application {

	/**
	 * Empty default constructor.
	 * 
	 */
	public RESTConfiguration() {
		super();
	}

}
