package Models;

/**
 * Created by danaru on 10/04/15.
 */
public class Tarification
{
    private double percent;
    private double bon;

    //region GET - SET

    public double getBon() {
        return bon;
    }

    public void setBon(double bon) {
        this.bon = bon;
    }
    public double getPercent() {
        return percent;
    }

    public void setPercent(double ppercent) {
        percent = ppercent;
    }
    //endregion


    public Tarification() {}



    public void Calcul(Prix prix)
    {

    }
}
