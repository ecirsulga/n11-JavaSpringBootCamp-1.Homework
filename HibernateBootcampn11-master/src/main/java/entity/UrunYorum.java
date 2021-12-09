package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * id
 * adi
 * fiyat
 * kayitTarihi
 * KategoriId
 */
@Entity
@Table(
        name = "URUNYORUM"
)
public class UrunYorum {

    @SequenceGenerator(name = "generator", sequenceName = "URUNYORUM_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(length = 500, name = "YORUM")
    private String Yorum;

    @Column(name = "YORUMTARIHI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date yorumTarihi;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_KULLANICI",
            foreignKey = @ForeignKey(name = "FK_URUNYORUM_KULLANICI_ID")
    )
    private Kullanici kullaniciId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_URUN",
            foreignKey = @ForeignKey(name = "FK_URUNYORUM_URUN_ID")
    )
    private Urun urunId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYorum() {
        return Yorum;
    }

    public void setYorum(String yorum) {
        Yorum = yorum;
    }

    public Date getYorumTarihi() {
        return yorumTarihi;
    }

    public void setYorumTarihi(Date yorumTarihi) {
        this.yorumTarihi = yorumTarihi;
    }

    public Kullanici getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(Kullanici kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public Urun getUrunId() {
        return urunId;
    }

    public void setUrunId(Urun urunId) {
        this.urunId = urunId;
    }

    @Override
    public String toString() {
        return "UrunYorum{" +
                "id=" + id +
                ", Yorum='" + Yorum + '\'' +
                ", yorumTarihi=" + yorumTarihi +
                ", kullaniciId=" + kullaniciId +
                ", urunId=" + urunId +
                '}';
    }
}
