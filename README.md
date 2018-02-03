# Microblog 2

This is micro-blogging app, where users can post short updates to a private social
media site.

### A post shows the following information:
1. The user who posted it
2. The order in which it was posted
3. The contents of the post
4. Optionally, a web address to a site they linked

### Users have:
1. The web address (url) to their avatar picture
2. The username
3. The person's real first name and last name
4. The person's email address
Every user sees all posts on this private site.

### Create A Main Menu
1) Create a new user
2) Become an existing user
3) Create a post as the current user
4) Print all posts
5) Print all users

If the user asks to create a new user, you ask for the fields that make up the user (typed in
from the keyboard) and create a new user instance from that.

You'll need to keep a list of users in an array. It's okay to make an array bigger than you expect
to use, so you don't need to use ArrayList yet (unless you want to).
Once they finish entering the user, go back to the main menu.

If the user asks to become an existing user, print a list of their names, and let the user pick
which one to become. You can do this by number or by name, your choice. Then return to the
main menu.

If the user asks to create a post, find the last post made by that user, and print it to the screen.
Then ask the user to type in the next post. When they're done entering it, and you've saved it
in the posts array, go back to the main menu.

If the user asks to print all posts, go through the post array and print all the fields of all the
posts. 
