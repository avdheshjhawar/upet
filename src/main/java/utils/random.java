package utils;

public class random {
    /**
     * Random integer generation
     **/
    public static int genInt(int from, int to) {
        int tmp = 0;
        if (to >= from)
            tmp = (int) (from + Math.round((Math.random() * (to - from))));
        return tmp;
    }

    /**
     * Random string generation
     **/
    public static String genString(int length) {
        String s = "";
        for (int i = 0; i < length; i++) {
            s = s + (char) genInt(97, 120);
        }
        return s;
    }

    /**
     * Random firstname generation
     **/
    public static String firstName() {
        return "Test" + genString(4);
    }

    /**
     * Random lastname generation
     **/
    public static String lastName() {
        return "User" + genString(4);
    }

    /**
     * Random email generation
     **/
    public static String email() {
        return "test-user-" + genInt(100, 1000) + "@upet.co";
    }

}