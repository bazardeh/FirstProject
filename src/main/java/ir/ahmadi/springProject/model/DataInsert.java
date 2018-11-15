package ir.ahmadi.springProject.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class DataInsert {
    private long id;
    private String codUser;
    private Timestamp toDate;
    private Boolean statusLogin;
    private Timestamp fromDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "codUser", nullable = true, length = 50)
    public String getCodUser() {
        return codUser;
    }

    public void setCodUser(String codUser) {
        this.codUser = codUser;
    }

    @Basic
    @Column(name = "toDate", nullable = true)
    public Timestamp getToDate() {
        return toDate;
    }

    public void setToDate(Timestamp toDate) {
        this.toDate = toDate;
    }

    @Basic
    @Column(name = "statusLogin", nullable = true)
    public Boolean getStatusLogin() {
        return statusLogin;
    }

    public void setStatusLogin(Boolean statusLogin) {
        this.statusLogin = statusLogin;
    }

    @Basic
    @Column(name = "fromDate", nullable = true)
    public Timestamp getFromDate() {
        return fromDate;
    }

    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataInsert that = (DataInsert) o;
        return id == that.id &&
                Objects.equals(codUser, that.codUser) &&
                Objects.equals(toDate, that.toDate) &&
                Objects.equals(statusLogin, that.statusLogin) &&
                Objects.equals(fromDate, that.fromDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codUser, toDate, statusLogin, fromDate);
    }
}
