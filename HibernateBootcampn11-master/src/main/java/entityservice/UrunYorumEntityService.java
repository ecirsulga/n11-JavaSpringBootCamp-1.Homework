package entityservice;

import dao.UrunYorumDao;
import entity.UrunYorum;
import java.util.List;

public class UrunYorumEntityService {

    private UrunYorumDao urunYorumDao;

    public UrunYorumEntityService() {
        urunYorumDao = new UrunYorumDao();
    }

    public List<UrunYorum> findAll(){
        return urunYorumDao.findAll();
    }

    public UrunYorum findById(long id)
    {
        return urunYorumDao.findById(id);
    }
}
