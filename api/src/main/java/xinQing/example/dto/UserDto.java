package xinQing.example.dto;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/1/4.
 */
public class UserDto implements Serializable {

    private Long id;
    private String email;

    // ...


    public UserDto() {
    }

    public UserDto(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
