import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        User user = new User("Rosisvaldo", "Santos", "Técnico");

        Gson gson = new Gson();

        try {

            String json = gson.toJson(user);

            System.out.println(json);

            User userToJson = gson.fromJson(json, User.class);

            System.out.println(userToJson.getUser());
            System.out.println(userToJson.getJob());
            System.out.println(userToJson.getLocation());

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }


    }
}
