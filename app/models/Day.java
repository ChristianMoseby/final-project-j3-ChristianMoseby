package models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "TimeOfDay")

public class Day
{
    @Id
    @Column (name = "TimeOfDayId")
    private int timeOfDayId;

    @Column (name ="TimeOfDayName")
    private String timeOfDayName;

    public int getTimeOfDayId()
    {
        return timeOfDayId;
    }

    public void setTimeOfDayId(int timeOfDayId)
    {
        this.timeOfDayId = timeOfDayId;
    }

    public String getTimeOfDayName()
    {
        return timeOfDayName;
    }

    public void setTimeOfDayName(String timeOfDayName)
    {
        this.timeOfDayName = timeOfDayName;
    }
}
