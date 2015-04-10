package Models;

/**
 * Created by danaru on 10/04/15.
 */
public class BonDeReduction extends Tarification
{
    public BonDeReduction(double value)
    {
        super.setBon(value);
    }

    @Override
    public void Calcul(Prix pprix)
    {
        pprix.setValue(pprix.getValue() - getBon());
    }
}
