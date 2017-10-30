package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity


public class Dating
{
    @Id
    @Column (name = "ActivityId")
    private int activityId;

    @Column (name= "ActivityName")
    private String activityName;

    @Column (name = "ActivityType")
    private String activityType;

    @Column (name = "Price")
    private String price;

    @Column (name = "Status")
    private String status;

    @Column (name = "TimeOfDay")
    private String timeOfDay;

    @Column (name= "TimeOfYear")
    private String timeOfYear;

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

    public String getActivityType()
    {
        return activityType;
    }

    public void setActivityType(String activityType)
    {
        this.activityType = activityType;
    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice(String price)
    {
        this.price = price;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getTimeOfDay()
    {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay)
    {
        this.timeOfDay = timeOfDay;
    }

    public String getTimeOfYear()
    {
        return timeOfYear;
    }

    public void setTimeOfYear(String timeOfYear)
    {
        this.timeOfYear = timeOfYear;
    }
}
