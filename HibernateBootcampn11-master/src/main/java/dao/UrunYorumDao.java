package dao;

import base.BaseDao;
import entity.UrunYorum;
import org.hibernate.query.Query;

import java.util.List;

public class UrunYorumDao extends BaseDao {

    public List<UrunYorum> findAll(){

        Query query = getCurrentSession().createQuery(
                "select urunyorum from UrunYorum urunyorum");

        return query.list();
    }

    public UrunYorum findById(Long id){

        String sql = "select urunyorum from UrunYorum urunyorum where urunyorum.id = :givenId";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("givenId", id);

        return (UrunYorum) query.uniqueResult();
    }
}
