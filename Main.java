import java.util.ArrayList;
import static java.lang.System.out;
import java.util.Scanner;
    public class Main
    {
/* User [] userInfo = new User [3];
        userInfo [0] = new User ("Chilli", "https://tinyurl.com/ybt9z6uw", "Rozonda","Thomas", "chilli@tlc.com","http://tlc.com");
        userInfo [1] = new User ("Tboz", "https://tinyurl.com/ydynfnee", "Tionne", "Watkins", "tboz@tlc.com", "http://tlc.com");
        userInfo [2] = new User ("LeftEye", "https://tinyurl.com/y8bpluhn", "Lisa", "Lopez", "lefteye@tlc.com", "http://tlc.com");

        for (int l=0; l < userInfo.length; l ++)
        { userInfo[l].printUser();
            System.out.println("");
        }


        Post [] post = new Post [5];
        post [0] = new Post (userInfo[0].getUsername(), "https://genius.com/Tlc-waterfalls-lyrics",  "Don't go chasing waterfalls");
        post [1] = new Post (userInfo[0].getUsername(), "https://genius.com/Tlc-creep-lyrics",  "The 22nd of loneliness and we've been through so many things");
        post [2] = new Post (userInfo[1].getUsername(), "https://genius.com/Tlc-diggin-on-you-lyrics",  "I was chilling with my Kool-aid when Miss Chilli came to relay");
        post [3] = new Post (userInfo[1].getUsername(), "https://genius.com/Tlc-red-light-special-lyrics",  "Take a good look at it, look at it now");
        post [4] = new Post (userInfo[2].getUsername(), "https://genius.com/Tlc-kick-your-game-lyrics", "I've been watchin' you, watchin' me" +
                "And I know you want it" );

        for (int i=0; i < post.length; i ++)
        { post[i].printPost(); */

        public static void printPostInfo (ArrayList<Post> p)
        { for (int i=0; i<p.size(); i++)
        {
            p.get(i).printPost();
        }

        }

        public static void printUsername (ArrayList <User> u)
        {for (int i = 0; i < u.size(); i++)
        {
            out.println((i+1) + ":" + u.get(i).getUsername());


        }
        }

        public static Boolean findUserName(ArrayList <User> u, String username)
        {

            for (int i = 0; i < u.size(); i++)

            {
                if(username.equals(u.get(i).getUsername()))
                {
                    return true;
                }

            }
            return false;
        }

        public static void locateMemberPost (String memberName, ArrayList <Post> p)
        {
            for (int i=(p.size()-1); i>0; i--)

                if (memberName.equals(p.get(i).getPostBody()))
                {
                    p.get(i).printPost();
                    break;

                }

        }

       public static void userId (ArrayList <User> u)
        {
            for (int i = 0; i < u.size(); i++)
            {
                u.get(i).printUser();

            }
        }

        public static void main (String [] args)
        {
            Scanner keyboard = new Scanner(System.in);
            boolean quit = false;
            String currentUser = "Chilli ";
            String username = "";
            //String web = "";
            String g = "";

            User x=new User( "Chilli ", "https://tinyurl.com/ybt9z6uw", "Rozonda", "Thomas", "chilli@tlc.com");
            User y=new User( "LeftEye ", "https://tinyurl.com/ydynfnee", "Tionne", "Watkins", "tboz@tlc.com");
            User z=new User( "Tboz ", "https://tinyurl.com/y8bpluhn", "Lisa", "Lopez", "lefteye@tlc.com");

            ArrayList <User> userInfo = new ArrayList <User> ();
            userInfo.add(x);
            userInfo.add(y);
            userInfo.add(z);

            Post xOne = new Post (x.getUsername(), "https://genius.com/Tlc-waterfalls-lyrics",  "Don't go chasing waterfalls");
            Post yTwo = new Post (y.getUsername(), "https://genius.com/Tlc-creep-lyrics",  "The 22nd of loneliness and we've been through so many things");
            Post zThree = new Post (z.getUsername(), "https://genius.com/Tlc-diggin-on-you-lyrics",  "I was chilling with my Kool-aid when Miss Chilli came to relay");
            Post zFour = new Post (z.getUsername(), "https://genius.com/Tlc-red-light-special-lyrics",  "Take a good look at it, look at it now");
            Post xFive = new Post (x.getUsername(), "https://genius.com/Tlc-kick-your-game-lyrics", "I've been watchin' you, watchin' me" +
                    "And I know you want it" );


            ArrayList <Post> postInfo = new ArrayList <Post> ();
            postInfo.add(xOne);
            postInfo.add(yTwo);
            postInfo.add(zThree);
            postInfo.add(zFour);
            postInfo.add(xFive);

                do {
                    out.println("Welcome to Microblog Yay");
                    out.println("Main Main");
                    out.println("1) Create a new user");
                    out.println("2) Become an existing user");
                    out.println("3) Create a post as the current user");
                    out.println("4) Print all posts");
                    out.println("5) Print all users");
                    out.println("6) Exit");
                    out.println();
                    out.println("Your are currently user" + " "+ currentUser + ":" + " Enter choice [1-6].");
                    int option= keyboard.nextInt();
                    keyboard.nextLine();
                    out.println();

                    switch (option) {
                        case 1:
                            out.println("Create Username");
                            username = keyboard.next();
                            out.println("Enter Avatar Url");
                            String avatar = keyboard.next();
                            out.println("Enter First Name");
                            String firstName = keyboard.next();
                            out.println("Enter Last Name.");
                            String lastName = keyboard.next();
                            out.println("Enter Email Address.");
                            String email = keyboard.next();
                            //out.println("Enter url Link.");
                            //String url = keyboard.next();
                            currentUser = username;

                            User owner = new User(username, avatar, firstName, lastName, email);
                            userInfo.add(owner);
                            break;
                        case 2:
                            printUsername(userInfo);
                            out.println("Select Existing User: Select A Number.");
                            option = keyboard.nextInt();
                            for (int i = 0; i < userInfo.size(); i++) {
                                if (option == (i + 1))

                                {
                                    currentUser = userInfo.get(i).getUsername();
                                    g = userInfo.get(i).getUrl();
                                }
                            }

                            break;
                        case 3:
                            String answer = "";
                            String web = "";
                            //userPost.setName(currentUser);
                            //userPost.setInput();
                            out.println("What's on Your Mind?");
                            answer = keyboard.nextLine();
                            out.println("Link a web url to post? Enter Yes or No");
                            String pb = keyboard.nextLine();
                            if (pb.equals("Yes") || pb.equals("yes") || pb.equals("YES")) {
                                out.println("Enter Website");
                                web = keyboard.nextLine();

                            } else {
                                out.println("N/A");
                            }
                            Post userPost = new Post(currentUser, web, answer);
                            //userPost.printLinkUrl();
                            postInfo.add(userPost);
                            break;
                        case 4:
                            for (int i = 0; i < postInfo.size(); i++) {
                                postInfo.get(i).printPost();
                            }
                            break;
                        case 5:
                            for (int i = 0; i < userInfo.size(); i++) {
                                userInfo.get(i).printUser();
                            }
                            break;
                        case 6:
                            quit = true;
                            break;
                        default:
                            out.println("Invalid Option.");
                    }
                    out.println();
                } while (!quit);
                out.println("Good Bye!");
            }

    }
