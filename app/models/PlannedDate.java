package models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table (name= "PlannedDate")

public class PlannedDate

{
    @Id
    @Column
   private int plannedDateId;

    @Column
   private Date plannedDateTime;

    @Column
   private int activityId;

    public int getPlannedDateId()
    {
        return plannedDateId;
    }

    public void setPlannedDateId(int plannedDateId)
    {
        this.plannedDateId = plannedDateId;
    }

    public Date getPlannedDateTime()
    {
        return plannedDateTime;
    }

    public void setPlannedDateTime(Date plannedDateTime)
    {
        this.plannedDateTime = plannedDateTime;
    }

    public int getActivityId()
    {
        return activityId;
    }

    public void setActivityId(int activityId)
    {
        this.activityId = activityId;
    }
}
