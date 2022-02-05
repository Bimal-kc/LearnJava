import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class YouAreNotFollowing {
    ArrayList<String> followerList;
    ArrayList<String> followingList;

    YouAreNotFollowing(){
        followerList = new ArrayList<String>();
        followingList = new ArrayList<String>();
    }
    public ArrayList<String> readFollowerAccounts(){
        try {
            File file = new File("/Users/bir/Desktop/Java/src/FollowerAccounts");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while(line != null) {
                followerList.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException ioe) {
            System.out.println("File is not created yet.");
        }
        return followerList;
    }

    public ArrayList<String> readFollowingAccounts (){
        try {
            File file = new File("/Users/bir/Desktop/Java/src/FollowingAccounts");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while(line != null) {
                followingList.add(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException ioe) {
            System.out.println("File is not created yet.");
        }
        return followingList;
    }

    public static void main (String[]args){
        ArrayList<String> notList = new ArrayList<String>();
        YouAreNotFollowing yanf = new YouAreNotFollowing();
        ArrayList follower= yanf.readFollowerAccounts();
        ArrayList following= yanf.readFollowingAccounts();
        for(int i = 0 ; i< follower.size(); i++){
            if(!following.contains(follower.get(i))){
                notList.add((String) follower.get(i));
            }
        }
        for (String notLists: notList
        ) {
            System.out.println(notLists);
        }
//        dfb.readFollowerAccounts();
//        dfb.readFollowingAccounts();

    }

}
