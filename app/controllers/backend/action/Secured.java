package controllers.backend.action;

import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

/**
 * Created by Ipan Taupik Rahman.
 * Date: 11/01/18
 * Time: 18:34
 * Project play-java-ebean-example
 * Package configs
 */
public class Secured extends Security.Authenticator {

    public Secured() {
        super();
    }

    @Override
    public String getUsername(Http.Context ctx) {
        return super.getUsername(ctx);
    }

    @Override
    public Result onUnauthorized(Http.Context ctx) {
        return super.onUnauthorized(ctx);
    }
}
