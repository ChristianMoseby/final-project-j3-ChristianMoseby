package controllers;

import models.*;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.dating;
import views.html.generate;

import javax.inject.Inject;
import java.util.List;
import java.util.Random;

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

        List<Status> statuses = jpaApi.em()
                .createQuery("SELECT s FROM Status s ",Status.class).getResultList();

        List<Day> days = jpaApi.em()
                .createQuery("SELECT d FROM Day d ", Day.class).getResultList();

        List<Year> years = jpaApi.em()
                .createQuery("SELECT y FROM Year y ",Year.class).getResultList();


        return ok(views.html.generate.render(activityTypes,prices,statuses,days,years));


    }
    @Transactional(readOnly = true)
    public Result postGenerate()
    {
        DynamicForm form = formFactory.form().bindFromRequest();
        int activityTypeId = Integer.parseInt(form.get("activityTypeId"));
        int priceId = Integer.parseInt(form.get("priceId"));
        int statusId = Integer.parseInt(form.get("statusId"));
        int timeOfDayId = Integer.parseInt(form.get("timeOfDayId"));
        int timeOfYearId =Integer.parseInt(form.get("timeOfYearId"));

        Activity activity = jpaApi.em().createQuery
                ("SELECT a FROM Activity a WHERE activityTypeId = :activityTypeId" +
                        " AND priceId = :priceId AND statusId = :statusId " +
                        " AND timeOfDayId = :timeOfDayId AND timeOfYearId =:timeOfYearId", Activity.class)
                .setParameter("activityTypeId", activityTypeId).setParameter("priceId", priceId)
                .setParameter("statusId", statusId).setParameter("timeOfDayId", timeOfDayId)
                .setParameter("timeOfYearId", timeOfYearId).getSingleResult();


        return ok(views.html.activity.render(activity));

    }

    @Transactional (readOnly = true)
    public Result getPhoto(int activityId)
    {
        Activity activity = jpaApi.em().createQuery
                ("SELECT a FROM Activity a WHERE activityId = :activityId",Activity.class)
         .setParameter("activityId",activityId).getSingleResult();

        if (activity.getPhoto() == null)
        {
            return null;
        }
        else


        return ok(activity.getPhoto()).as("image.jpg");

    }


    @Transactional (readOnly = true)
    public Result generateRandom()
    {
        DynamicForm form = formFactory.form().bindFromRequest();
        int activityTypeId = Integer.parseInt(form.get("activityTypeId"));
        int priceId = Integer.parseInt(form.get("priceId"));
        int statusId = Integer.parseInt(form.get("statusId"));
        int timeOfDayId = Integer.parseInt(form.get("timeOfDayId"));
        int timeOfYearId =Integer.parseInt(form.get("timeOfYearId"));

       List<Activity> activities = jpaApi.em().createQuery
                ("SELECT a FROM Activity a WHERE activityTypeId = :activityTypeId" +
                        " AND priceId = :priceId AND statusId = :statusId " +
                        " AND timeOfDayId = :timeOfDayId AND timeOfYearId =:timeOfYearId", Activity.class)
                .setParameter("activityTypeId", activityTypeId).setParameter("priceId", priceId)
                .setParameter("statusId", statusId).setParameter("timeOfDayId", timeOfDayId)
                .setParameter("timeOfYearId", timeOfYearId).getResultList();

       Random random = new Random();
       int activityNumber = random.nextInt(activities.size());
       Activity activity = activities.get(activityNumber);

        return ok(views.html.activity.render(activity));
    }

    public Result restart()
    {
        return redirect(routes.DatingController.getGenerate());
    }






}





