package dev.goette.app;

import io.javalin.Javalin;
import io.javalin.core.JavalinConfig;

public class App {
    static int counter;
    public static void main(String[] args) {
        Javalin app = Javalin.create(JavalinConfig::enableCorsForAllOrigins);

        app.get("/hola",context -> {
            context.result("Hola this many requests have been handled by the server " + ++App.counter);
        });
        app.start();
    }
}
