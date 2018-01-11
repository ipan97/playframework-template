package controllers.backend;

import play.mvc.Result;

/**
 * Created by Ipan Taupik Rahman.
 * Date: 11/01/18
 * Time: 16:30
 * Project play-java-ebean-example
 * Package controllers.backend
 */
public class HomeController extends AuthController {

    @Override
    public Result index() {
        return ok(views.html.backend.index.render());
    }
}
