package au.com.edimoto.model;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by edicson on 12/3/17.
 */
@SuppressWarnings("JpaQlInspection")
@Entity
@Table(name = "User")
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "listUser",
                procedureName = "listUser",
                resultClasses = {User.class},
                parameters = {
                        @StoredProcedureParameter(
                                name = "p_firstName",
                                type = String.class,
                                mode = ParameterMode.IN),
                        @StoredProcedureParameter(
                                name = "p_lastName",
                                type = String.class,
                                mode = ParameterMode.IN)})
})
@NamedQueries(value = {@NamedQuery(name = "listAllFamilyNames", query = "select distinct u.lastName from User u")})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min = 2, max = 30, message = "{firstName.size}")
    private String firstName;

    @NotNull
    @Size(min = 2, max = 30, message = "{lastName.size}")
    private String lastName;

    @NotNull
    @Size(min = 5, max = 30, message = "{email.size}")
    @Email(message = "{email.valid}")
    private String userName;

    @NotNull
    @Size(min = 5, max = 25, message = "{password.size}")
    private String password;

    public User() {
    }

    public User(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }


    public User(int id, String firstName, String lastName, String userName, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
