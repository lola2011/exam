package kg.entities;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "message", nullable = false)
    private String name;
    @Column(name = "image")
    private String image;
    @OneToOne
    @JoinColumn(name = "likes_id")
    private Likes likes;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;

    }

    public Posts() {

    }

    public Likes getLikes() {
        return likes;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    public Posts(String name, String image, Likes likes) {
        this.name = name;
        this.image = image;
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image=" + image +
                ", likes=" + likes +
                '}';
    }
}
