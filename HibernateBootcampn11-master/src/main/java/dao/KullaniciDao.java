package dao;

import base.BaseDao;
import entity.Kullanici;
import org.hibernate.query.Query;

import java.util.List;

public class KullaniciDao extends BaseDao {

    public List<Kullanici> findAll(){

        Query query = getCurrentSession().createQuery(
                "select kullanici from Kullanıcı kullanıcı");

        return query.list();
    }
}
