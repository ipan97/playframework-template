package controllers.backend;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by Ipan Taupik Rahman.
 * Date: 11/01/18
 * Time: 18:28
 * Project play-java-ebean-example
 * Package controllers.backend
 */
public class AuthController extends Controller {

    public Result index() {
        return ok(views.html.backend.login.render());
    }
}
