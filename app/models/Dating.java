package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "DatingController")

public class Dating
{
    @Id
    @Column (name = "ActivityId")
    private int activityId;

    @Id
    @Column (name= "ActivityName")
    private String activityName;

    @Id
    @Column (name = "ActivityType")
    private String activityType;

    @Id
    @Column (name = "Price")
    private String price;


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


}
