package kg.entities;

import javax.persistence.*;

@Entity
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "super")
    private Boolean SuperLike;
    @Column(name="Hate")
    private Boolean HateLike;

    public Likes(){

    }

    public Likes(Boolean superLike, Boolean hateLike) {
        SuperLike = superLike;
        HateLike = hateLike;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getSuperLike() {
        return SuperLike;
    }

    public void setSuperLike(Boolean superLike) {
        SuperLike = superLike;
    }

    public Boolean getHateLike() {
        return HateLike;
    }

    public void setHateLike(Boolean hateLike) {
        HateLike = hateLike;
    }

    @Override
    public String toString() {
        return "Likes{" +
                "id=" + id +
                ", SuperLike=" + SuperLike +
                ", HateLike=" + HateLike +
                '}';
    }
}
