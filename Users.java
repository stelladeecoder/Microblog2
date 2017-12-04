import static java.lang.System.out;
import java.util.*;

public class Users  {
    private String username;
    private String avatar;
    private String firstName;
    private String lastName;
    private String email;
    private String url;
    //private int userNextNumber = 1;
    //private int userNumber;


    public Users(String username, String avatar, String firstName, String lastName, String email, String url) {
        this.username = username;
        this.avatar = avatar;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.url = url;
        //userNumber = userNextNumber;
        //userNextNumber++;
    }
    public Users()
    {
    this.username= username;
    this.avatar= avatar;
    this.firstName = firstName;
    this.lastName= lastName;
    this.email=email;
    this.url =url;

    }

    public void setUsername() {
        this.username = username;
    }

    public String getUsername() {

        return username;
    }
    public void info()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a username");
        this.username= keyboard.nextLine();
        System.out.println("Enter your First Name");
        this.firstName =keyboard.nextLine();
        System.out.println("Enter in your Last Name");
        this.lastName= keyboard.nextLine();
        System.out.println("Enter your Email.");
        this.email= keyboard.nextLine();
        System.out.println("Enter your Avatar url.");
        this.url= keyboard.nextLine();

    /*public String getAvatar() {

        return avatar;
    }
    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }
    public String getEmail() {

        return email;
    }

    public String getUrl() {

        return url; */
    }

    public void printUser() {
        System.out.println("User:" + this.username);
        System.out.println("Avatar:" + this.avatar);
        System.out.println("Name:" + this.firstName + " " + this.lastName);
        System.out.println("Email:" + this.email);
        System.out.println("Website:" + this.url);
    }
    public String toString()
    {
        return this.username + " " + this.firstName + " " + this.lastName + "" + this.email + " " + this.url;
    }
}
