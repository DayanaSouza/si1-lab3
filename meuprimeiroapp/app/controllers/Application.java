package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public Result bemVindo() {
    	return ok( "Bem vindo ao primeiro exemplo criado no Play Framework" );
    	}
    
    public Result cadastro(){
	    return ok(views.html.cadastro.render());
   }
    
    public Result sobre(){
	    return ok(views.html.sobre.render());
   }

    public Result login(){
	    return ok(views.html.login.render());
   }
    
    public Result novoAnuncio(){
        return ok(index.render("Your new application is ready."));
   }

}
