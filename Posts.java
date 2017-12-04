import static java.lang.System.out;
import java.util.*;

public class Posts {
    private static int nextPostNumber = 1;
    private String username;
    private int postNumber;
    private String postBody;
    private String linkUrl;

    public Posts() {
        this.username = username;
        this.postBody = postBody;
        this.linkUrl = linkUrl;
        this.postNumber = nextPostNumber;
        nextPostNumber++;
    }

    public void postBody() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter current user's username");
        this.username = keyboard.nextLine();
        System.out.println("What's on your mind?");
        this.postBody = keyboard.nextLine();
    }


    public void printPost() {
        System.out.println(this.postNumber + " " + this.username);
        //System.out.println("This is " +  + " post");
        System.out.println(this.postBody);
        //   System.out.println(this.linkUrl);
        // System.out.println("");
    }

    public String toString() {
        return this.postNumber + " " + this.username + "/n" + this.postBody;

        /* public int getPostNumber() {

            return postNumber;
        }

        public String getPostBody() {

            return postBody;
        }

        public String getLinkUrl() {

            return linkUrl;
        }

        public String getName() {

            return name;
        } */

    }
}
