package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="ActivityType")
public class ActivityType
{
    @Id
    @Column (name ="ActivityTypeId")
    private int activityTypeId;

    @Column (name = "ActivityTypeName")
    private String activityTypeName;

    public int getActivityTypeId()
    {
        return activityTypeId;
    }

    public void setActivityTypeId(int activityTypeId)
    {
        this.activityTypeId = activityTypeId;
    }

    public String getActivityTypeName()
    {
        return activityTypeName;
    }

    public void setActivityTypeName(String activityTypeName)
    {
        this.activityTypeName = activityTypeName;
    }
}
