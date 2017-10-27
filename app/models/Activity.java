package models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Activity")

public class Activity
{
    @Id
    @Column (name = "ActivityId")
    private int activityId;

    @Column (name = "ActivityName")
    private String activityName;

    @Id
    @Column (name = "ActivityTypeId")
    private int activityTypeId;

    @Id
    @Column (name = "StatusId")
    private int statusId;

    @Id
    @Column (name = "PriceId")
    private int priceId;

    @Id
    @Column (name = "TimeOfYearId")
    private int timeOfYearId;

    @Id
    @Column (name = "TimeOfDayId")
    private int timeOfDayId;

    public int getActivityId()
    {
        return activityId;
    }

    public void setActivityId(int activityId)
    {
        this.activityId = activityId;
    }

    public String getActivityName()
    {
        return activityName;
    }

    public void setActivityName(String activityName)
    {
        this.activityName = activityName;
    }

    public int getActivityTypeId()
    {
        return activityTypeId;
    }

    public void setActivityTypeId(int activityTypeId)
    {
        this.activityTypeId = activityTypeId;
    }

    public int getStatusId()
    {
        return statusId;
    }

    public void setStatusId(int statusId)
    {
        this.statusId = statusId;
    }

    public int getPriceId()
    {
        return priceId;
    }

    public void setPriceId(int priceId)
    {
        this.priceId = priceId;
    }

    public int getTimeOfYearId()
    {
        return timeOfYearId;
    }

    public void setTimeOfYearId(int timeOfYearId)
    {
        this.timeOfYearId = timeOfYearId;
    }

    public int getTimeOfDayId()
    {
        return timeOfDayId;
    }

    public void setTimeOfDayId(int timeOfDayId)
    {
        this.timeOfDayId = timeOfDayId;
    }
}
