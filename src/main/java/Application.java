public class Application {
    public static void main(String[] args) {
        User user = User.builder()
                .username("tokyo07")
                .pass("123!")
                .build();

        System.out.println(user.toString());

    }
}
