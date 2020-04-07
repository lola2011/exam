package kg.entities;

import javax.persistence.*;

@Entity
@Table
public class Followers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "username",nullable = false, unique = true)
    private Character username;
@ManyToMany
@JoinColumn(name = "users_id")
private Users users;

    public Followers(String name, Character username, Users users) {
        this.name = name;
        this.username = username;
        this.users = users;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getUsername() {
        return username;
    }

    public void setUsername(Character username) {
        this.username = username;}

        public Followers() {
    }

    @Override
    public String toString() {
        return "Followers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username=" + username +
                ", users=" + users +
                '}';
    }
}
