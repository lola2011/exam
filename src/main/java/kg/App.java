package kg;

import kg.db.GenericsDB;
import kg.entities.Likes;
import kg.entities.Posts;
import kg.entities.Users;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Likes like1=new Likes(true,false);
        Likes like2=new Likes(false,true);

        GenericsDB<Likes> likesGenericsDB= new GenericsDB<>();
        likesGenericsDB.create(like1);
        likesGenericsDB.create(like2);
        Posts posts=new Posts("season","winter",like1);
        Posts posts1=new Posts("holiday","Turkey",like1);
        Posts posts2=new Posts("courses","exam",like2);
        Posts posts3=new Posts("cookie","chocolate",like2);
GenericsDB<Posts>postsGenericsDB=new GenericsDB<>();
postsGenericsDB.create(posts);
postsGenericsDB.create(posts1);
postsGenericsDB.create(posts2);
postsGenericsDB.create(posts3);


        Users user1=new Users("Leyla","leyla2020","flower5","female",posts);
        Users user2= new Users("Ali","tr2020","12345","male",posts1);
        Users user3= new Users("Aylin","young20","12345","female",posts2);
        Users user4= new Users("Said","secret","89766565","male",posts3);
List<Users> usersList=new LinkedList<>();
usersList.add(user1);
usersList.add(user2);
usersList.add(user3);
usersList.add(user4);

        GenericsDB<Users> Instagram= new GenericsDB<>();
        Instagram.create(user1);
        Instagram.create(user2);
        Instagram.create(user3);
        Instagram.create(user4);


// ya naputala s samogo nachala,teper i ne razobrat,otpravlayu to chto yest...............,to yest nichego
    }
}
