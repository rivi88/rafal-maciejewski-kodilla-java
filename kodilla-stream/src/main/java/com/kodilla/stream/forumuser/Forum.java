package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    public static List<ForumUser> getUsersList() {
        final List<ForumUser> forumUsers = new ArrayList<>();

        forumUsers.add(new ForumUser(1, "JohnS", 'M', 2012, 7, 31, 2));
        forumUsers.add(new ForumUser(2, "DorothyN", 'F', 1989, 12, 1, 5));
        forumUsers.add(new ForumUser(3, "JohnW", 'M', 1999, 8, 2, 17));
        forumUsers.add(new ForumUser(4, "LucyR", 'F', 2012, 2, 13, 8));
        forumUsers.add(new ForumUser(5, "OwenR", 'M', 2000, 6, 14, 1));
        forumUsers.add(new ForumUser(6, "MatildaD", 'F', 2009, 5, 25, 23));
        forumUsers.add(new ForumUser(7, "CorinneF", 'F', 1996, 11, 29, 15));
        forumUsers.add(new ForumUser(8, "KhloeF", 'F', 2005, 1, 17, 7));
        forumUsers.add(new ForumUser(9, "MartinV", 'M', 1993, 9, 24, 4));


        return new ArrayList<>(forumUsers);
    }
}
