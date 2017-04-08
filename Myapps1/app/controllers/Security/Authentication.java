package controllers.Security;


import com.google.inject.Inject;
import play.mvc.Http;
import play.mvc.Result;
import services.UserService;

import java.util.concurrent.CompletionStage;

public class Authentication extends play.mvc.Action.Simple{

    private final UserService userService;

    @Inject
    public Authentication(UserService userService) {
        this.userService = userService;
    }

    @Override
    public CompletionStage<Result> call(Http.Context ctx) {
        return null;
    }
}
