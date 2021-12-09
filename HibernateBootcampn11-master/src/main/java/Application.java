import entity.Kategori;
import entity.Urun;
import entity.UrunYorum;
import entityservice.KategoriEntityService;
import entityservice.UrunEntityService;
import entityservice.UrunYorumEntityService;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        /*UrunYorumEntityService urunYorumEntityService = new UrunYorumEntityService();
        List<UrunYorum>  urunYorumList = urunYorumEntityService.findAll();
        System.out.println(urunYorumList);*/

        /*UrunEntityService urunEntityService = new UrunEntityService();
        Urun  urun = urunEntityService.findById(2L);
        System.out.println(urun);*/

        UrunYorumEntityService urunYorumEntityService = new UrunYorumEntityService();
        UrunYorum  urunYorum = urunYorumEntityService.findById(2L);
        System.out.println(urunYorum);
        System.out.println(urunYorum.getKullaniciId());
    }
}
