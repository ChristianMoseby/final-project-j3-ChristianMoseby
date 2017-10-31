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

    @Column (name = "ActivityTypeId")
    private int activityTypeId;

    @Column (name = "StatusId")
    private int statusId;

    @Column (name = "PriceId")
    private int priceId;

    @Column (name = "TimeOfYearId")
    private int timeOfYearId;

    @Column (name = "TimeOfDayId")
    private int timeOfDayId;

    @Column (name = "Website")
    private String website;

    @Column (name = "Photo")
    private byte [] photo;

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

    public String getWebsite()
    {
        return website;
    }

    public void setWebsite(String website)
    {
        this.website = website;
    }

    public byte[] getPhoto()
    {
        return photo;
    }

    public void setPhoto(byte[] photo)
    {
        this.photo = photo;
    }
}
