package eachproperty;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/demo")
public class DemoController {

    private Widget widget;

    public DemoController(Widget w) {
        widget = w;
    }

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
}