package simetric.card.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Table;
@Entity
@Table(name = "cards")
public class JpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String leftCardName;

    @Column(name = "job")
    private String leftCardJob;

    @Column(name = "ability")
    private String leftCardAbility;

    @Column(name = "photo_path")
    private String leftImage;

    public JpaEntity() {}

    public JpaEntity(String leftCardName, String leftCardJob, String leftCardAbility,String leftImage) {
        this.leftCardName = leftCardName;
        this.leftCardJob = leftCardJob;
        this.leftCardAbility = leftCardAbility;
        this.leftImage=leftImage;
    }

    @Override
    public String toString() {
        return "{" +
                "'id':" + id +
                ",'leftCardName':" + leftCardName +
                ",'leftCardJob':" + leftCardJob +
                ",'leftCardAbility':" + leftCardAbility +
                ",'leftImage':" + leftImage +
                "}";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLeftCardName() {
        return leftCardName;
    }

    public void setLeftCardName(String leftCardName) {
        this.leftCardName = leftCardName;
    }

    public String getLeftCardJob() {
        return leftCardJob;
    }

    public void setLeftCardJob(String leftCardJob) {
        this.leftCardJob = leftCardJob;
    }

    public String getLeftCardAbility() {
        return leftCardAbility;
    }

    public void setLeftCardAbility(String leftCardAbility) {
        this.leftCardAbility = leftCardAbility;
    }

    public String getLeftImage() {
        return leftImage;
    }

    public void setLeftImage(String leftImage) {
        this.leftImage = leftImage;
    }
}
