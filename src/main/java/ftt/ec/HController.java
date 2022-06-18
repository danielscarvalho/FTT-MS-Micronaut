package ftt.ec;

import java.util.Date;
import java.util.Random;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello") 
public class HController {

    @Get(produces = MediaType.TEXT_PLAIN) 
    public String index() {
        return "Hello World - " + new Date() ; 
    }
}

@Controller("/") 
class RootController {

    @Get(produces = MediaType.TEXT_PLAIN) 
    public String index() {
        return "Hi ROOT - " + new Date() ; 
    }
}

@Controller("/random") 
class RandomController {

    @Get(produces = MediaType.TEXT_PLAIN) 
    public String index() {
    	
    	Random r = new Random();
    	
        return  String.valueOf(r.nextInt());
    }
}