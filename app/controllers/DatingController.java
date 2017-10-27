package controllers;

import models.ActivityType;
import models.Price;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

public class DatingController extends Controller
{
    private FormFactory formFactory;
    private JPAApi jpaApi;


    @Inject
    public DatingController(FormFactory formFactory, JPAApi jpaApi)
    {
        this.formFactory = formFactory;
        this.jpaApi = jpaApi;
    }

    @Transactional(readOnly = true)
    public Result getGenerate()
    {
        List<ActivityType> activityTypes = jpaApi.em()
                .createQuery("SELECT a FROM ActivityType a ",ActivityType.class).getResultList();

        List<Price> prices = jpaApi.em()
                .createQuery("SELECT p FROM Price p ",Price.class).getResultList();

        return ok(views.html.generate.render(activityTypes, prices));



    }




}





