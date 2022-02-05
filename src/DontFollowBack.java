import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DontFollowBack {
    ArrayList<String> followerList;
    ArrayList<String> followingList;

    DontFollowBack(){
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

    public static void main (String[]args) {
        ArrayList<String> notList = new ArrayList<String>();
        DontFollowBack dfb = new DontFollowBack();
        ArrayList follower= dfb.readFollowerAccounts();
        ArrayList following= dfb.readFollowingAccounts();
        for(int i = 0 ; i< following.size(); i++){
            if(!follower.contains(following.get(i))){
                notList.add((String) following.get(i));
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
