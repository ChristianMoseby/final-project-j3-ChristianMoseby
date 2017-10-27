package models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "TimeOfYear")

public class Year
{
    @Id
    @Column (name = "TimeOfYearId")
    private int timeOfYearId;

    @Column (name = "TimeOfYearName")
    private String timeOfYearName;

    public int getTimeOfYearId()
    {
        return timeOfYearId;
    }

    public void setTimeOfYearId(int timeOfYearId)
    {
        this.timeOfYearId = timeOfYearId;
    }

    public String getTimeOfYearName()
    {
        return timeOfYearName;
    }

    public void setTimeOfYearName(String timeOfYearName)
    {
        this.timeOfYearName = timeOfYearName;
    }
}
