package kg.db;

import kg.entities.Posts;

import org.hibernate.Session;

import java.util.List;

public class PostsDB {
    public static Posts create(Posts posts){
        Session session= util.HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(posts);
        session.getTransaction().commit();
        session.close();
        return posts;
    }
    public static Posts getById(Integer id) {
        Session session = util.HibernateUtil.getSessionFactory().openSession();
        Posts posts = session.get(Posts.class, id);
        session.close();
        return posts;
    }

    public static Posts getAllPostsFirtsClient() {
        Session session= util.HibernateUtil.getSessionFactory().openSession();
        List posts=session.createQuery("From kg.entities.posts  where users_id=1", Posts.class ).list();
        session.close();
        return (Posts) posts;
    }
    }

}
