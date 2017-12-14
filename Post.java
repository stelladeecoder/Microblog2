import java.util.Scanner;
import static java.lang.System.out;

public class Post {
    private static int nextPostNumber = 1;
    private String name;
    private int postNumber;
    private String postBody;
    private String linkUrl;

    public Post(String name, String linkUrl, String postBody)
    {
        this.name = name;
        this.postBody = postBody;
        this.linkUrl = linkUrl;
        this.postNumber = nextPostNumber;
        nextPostNumber++;
    }

    public void printPost() {
        System.out.println("Post Number " + postNumber + ".");
        System.out.println("This is " + name + " post");
        System.out.println(postBody);
        System.out.println(linkUrl);
        System.out.println("");
    }

    public int getPostNumber() {
        return postNumber;
    }

    public String getPostBody() {
        return postBody;
    }
    public String postBody()
    {
        return this.postBody;
    }

    public void setPostBody(String pb)
    {
        this.postBody=pb;
    }

   /*public String getLinkUrl() {
        return linkUrl; */


    public String getName() {
        return name;
    }
    public void setName(String n)
    {
        this.name=n;
    }

    public String name()
    {
        return this.name;
    }

    public String toString()
    {
        return this.postNumber + " " + this.name+ "\n" + this.postBody;
    }

    public void setInput( )
    {
        Scanner keyboard = new Scanner (System.in);
        out.println("What's on Your Mind?");
        /*pb= keyboard.nextLine();
        this.postBody = pb;*/
    }

    public String input()
    {
        return this.input();
    }


    public void print()
    {
        out.println(this.postNumber+" " + this.name);
        out.println(this.postBody);
    }

    public String printLinkUrl()
    {
        //out.println(this.linkUrl);
        return this.printLinkUrl();
    }
}
