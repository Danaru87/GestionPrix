package Models;

/**
 * Created by danaru on 10/04/15.
 */
public class Prix
{
    private double value;
    private double Tarif;
    private double TarifMax;
    private double TarifMin;

    //region GET - SET
    public double getTarif() {
        return Tarif;
    }

    public void setTarif(double tarif) {
        Tarif = tarif;
    }

    public double getTarifMax() {
        return TarifMax;
    }

    public void setTarifMax(double tarifMax) {
        TarifMax = tarifMax;
    }

    public double getTarifMin() {
        return TarifMin;
    }

    public void setTarifMin(double tarifMin) {
        TarifMin = tarifMin;
    }
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    //endregion

    public Prix(double val)
    {
        value = val;
    }

    public void Afficher()
    {
        System.out.println("le prix est de "+value);
    }

    public void Calculer(Tarification tarification)
    {
        tarification.Calcul(this);
    }
}
