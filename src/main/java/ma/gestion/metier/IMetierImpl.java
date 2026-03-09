package ma.gestion.metier;

import ma.gestion.dao.IDao;

public class IMetierImpl implements IMetier {

    private IDao dao;
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return dao.getValue() * 2;
    }
}
