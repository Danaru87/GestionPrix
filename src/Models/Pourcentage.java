package Models;

/**
 * Created by danaru on 10/04/15.
 */
public class Pourcentage extends Tarification
{

    public Pourcentage(Prix pprix, double ppercent)
    {
        super.setPercent(ppercent);
    }

    @Override
    public void Calcul(Prix pprix)
    {
        pprix.setValue(pprix.getValue() - (pprix.getValue() * getPercent()) / (double) (100));
    }
}
