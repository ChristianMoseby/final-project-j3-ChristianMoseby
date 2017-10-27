package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "Price")

public class Price
{
    @Id
    @Column (name = "PriceId")
    private int priceId;

    @Column (name = "PriceName")
    private String priceName;

    public int getPriceId()
    {
        return priceId;
    }

    public void setPriceId(int priceId)
    {
        this.priceId = priceId;
    }

    public String getPriceName()
    {
        return priceName;
    }

    public void setPriceName(String priceName)
    {
        this.priceName = priceName;
    }
}
