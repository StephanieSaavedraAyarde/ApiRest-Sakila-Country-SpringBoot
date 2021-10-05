package bo.edu.ucb.ingsoft.country;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

/**
 +-------------+--------------+------+-----+---------+----------------+
| Field       | Type         | Null | Key | Default | Extra          |
+-------------+--------------+------+-----+---------+----------------+
| country_id  | int(11)      | NO   | PRI | NULL    | auto_increment |
| country     | varchar(50)  | NO   |     | NULL    |                |
| last_update | Date         | NO   |     | NULL    |                |
+-------------+--------------+------+-----+---------+----------------+
 */

@Entity(name="country")
public class Country {
    @Id
    @Column(name="country_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer country_id;
    
    @Column(name="country")
    private String country;
    @Column(name="last_update")
    private Date last_update;

    public Country () {
    }

    public Integer getCountryId() {
        return country_id;
    }

    public void setCountryId(Integer country_id) {
        this.country_id = country_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getLastUpdate() {
        return last_update;
    }

    public void setLastUpdate(Date last_update) {
        this.last_update = last_update;
    }

}