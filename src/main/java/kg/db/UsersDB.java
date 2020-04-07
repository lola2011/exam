package kg.db;

import kg.entities.Users;
import org.hibernate.Session;

import java.util.List;

public class UsersDB {
    public static List<Users> getAll(){
        Session session= util.HibernateUtil.getSessionFactory().openSession();
        List usersList=session.createQuery("from kg.entities.Users u  order by u.name ASC",Users.class ).list();
        session.close();
        return usersList;
    }


}
