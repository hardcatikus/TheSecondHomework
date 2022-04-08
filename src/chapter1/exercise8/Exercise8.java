package chapter1.exercise8;

public class Exercise8 {
    public static void main(String[] args) {
        String line = "this line is not empty";
        printAllSubstrings(line);
    }

    public static void printAllSubstrings(String line){
        for(int end=line.length(); end > 0; end--){
            for(int start=0; start < end; start++){
                System.out.println("[" + line.substring(start,end)+"]");
            }
        }
    }
}
