import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;

    public class Main
    {

        public static void main(String[] args)
        {
            Scanner keyboard = new Scanner(System.in);
            boolean quit = false;

            ArrayList<Users>allUsers= new ArrayList<Users>();
            //*("Chilli", "https://tinyurl.com/ybt9z6uw", "Rozonda","Thomas", "chilli@tlc.com","http://tlc.com");
            // {"Tboz", "https://tinyurl.com/ydynfnee", "Tionne", "Watkins", "tboz@tlc.com", "http://tlc.com");
            //("LeftEye", "https://tinyurl.com/y8bpluhn", "Lisa", "Lopez", "lefteye@tlc.com", "http://tlc.com"); */

            Users x=new Users( "Chilli ", "https://tinyurl.com/ybt9z6uw", "Rozonda", "Thomas", "chilli@tlc.com", "http://tlc.com");
            Users y=new Users( "LeftEye ", "https://tinyurl.com/ydynfnee", "Tionne", "Watkins", "tboz@tlc.com", "http://tlc.com");
            Users z=new Users( "Tboz ", "https://tinyurl.com/y8bpluhn", "Lisa", "Lopez", "lefteye@tlc.com", "http://tlc.com");

            allUsers.add(x);
            allUsers.add(y);
            allUsers.add(z);

            ArrayList<Posts>allPosts= new ArrayList<Posts>();
             /*Post [] post = new Post [5];
        post [0] = new Post (userInfo[0].getUsername(), "https://genius.com/Tlc-waterfalls-lyrics",  "Don't go chasing waterfalls");
        post [1] = new Post (userInfo[0].getUsername(), "https://genius.com/Tlc-creep-lyrics",  "The 22nd of loneliness and we've been through so many things");
        post [2] = new Post (userInfo[1].getUsername(), "https://genius.com/Tlc-diggin-on-you-lyrics",  "I was chilling with my Kool-aid when Miss Chilli came to relay");
        post [3] = new Post (userInfo[1].getUsername(), "https://genius.com/Tlc-red-light-special-lyrics",  "Take a good look at it, look at it now");
        post [4] = new Post (userInfo[2].getUsername(), "https://genius.com/Tlc-kick-your-game-lyrics", "I've been watchin' you, watchin' me" +
                "And I know you want it" ); */

            System.out.println("Please Enter An Username");
            String answer= keyboard.nextLine();
            do
            {
                System.out.println("Main Menu");
                System.out.println("1: Create a New User");
                System.out.println("2: Become An Existing User");
                System.out.println("3: Create A post As The Current User");
                System.out.println("4: Print All Posts");
                System.out.println("5: Print All Users");
                System.out.println("6: Exit");
                System.out.println();

                System.out.println("Your are currently user" + " "+ answer + " ." + "  Enter Options [1-6].");
                int option= keyboard.nextInt();
                System.out.println();
                switch (option)
                {
                    case 1:
                        System.out.println("Please Create a New Username");
                        String username= keyboard.nextLine();
                        System.out.println("Enter the url of your avatar.");
                        String url= keyboard.nextLine();
                        System.out.println("Enter Your First Name");
                        String firstName= keyboard.nextLine();
                        System.out.println("Enter Your Last Name");
                        String lastName= keyboard.nextLine();
                        System.out.println("Enter your email address.");
                        String email= keyboard.nextLine();


                        Users person = new Users("", "", "", "", "", "" );

                        allUsers.add(person);
                        break;
                    case 2:
                        for(int i=0; i< allUsers.size(); i++)
                        {

                            {
                                System.out.println(allUsers.get(i).getUsername());
                            }
                        }
                        System.out.println("Select An Username From Above");
                        keyboard.nextLine();
                        String info=keyboard.nextLine();
                        System.out.println();
                        break;

                    case 3:

                        Posts myPost= new Posts();
                        myPost.postBody();
                        myPost.printPost();
                        allPosts.add(myPost);
                        break;
                    case 4:
                        System.out.println(allPosts);
                    case 5:
                        System.out.println(allUsers);
                        break;
                    case 6:
                        quit=true;
                        break;
                    default:
                        System.out.println("Invalid Option Try Again.");
                }
                System.out.println();
            } while (!quit);
            System.out.println("Later Alligator!");
        }
    }