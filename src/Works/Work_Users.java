package Works;

import Models.AboutUsers.Group;
import Models.AboutUsers.User;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Work_Users implements Runnable{
    int [] numbers={-5,-6,-3,-1,0,11,2,3,4,5};
    @Override
    public void run() {
//        System.out.println(findMin());
//        test();
        createUserAndGroup();
    }
    public void createUserAndGroup()
    {
        Group g=new Group();
        g.setName("spu");
        User user1=new User();
        User user2=new User();
        user1.setName("aaaaa");
        user2.setName("bbbbb");
        g.users.add(user1);
        g.users.add(user2);
        g.createUserEmail();
        System.out.println(g.getName());
        for (User u:g.users
             ) {
            System.out.println(u.toString());
        }
    }

    public int findMin(){
        return Arrays.stream(numbers).min().getAsInt();
    }
    public double finAverage()
    {
        return Arrays.stream(numbers).average().getAsDouble();
    }
    public void test()
    {
        OptionalDouble res=Arrays.stream(numbers).filter(ul->ul<0).average();
        if(res.isEmpty())
        System.out.println("No result");
        else
            System.out.println(res.getAsDouble());
    }
}
