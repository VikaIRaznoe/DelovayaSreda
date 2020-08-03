package constans;

import utills.FileReader;

import static constans.JsonPlaceHolder_Constans.Servers.JsonPlaceHolder_URL;

public class JsonPlaceHolder_Constans {
    public static class RunVariable{
        public static String server = JsonPlaceHolder_URL;
    }

    public static class Servers{
        public static String JsonPlaceHolder_URL = "https://jsonplaceholder.typicode.com";
    }


    public static class Actions{
        public static String JsonPlaceHolder_GET = "/posts";
        public static String JsonPlaceHolder_PUT = "posts/1";
        public static String JsonPlaceHolder_POST = "/posts";
        public static String JsonPlaceHolder_DELETE = "posts/1";
    }

    public static String POST_ID = FileReader.getValue("postId");
    public static String USER_ID = FileReader.getValue("userId");
}

