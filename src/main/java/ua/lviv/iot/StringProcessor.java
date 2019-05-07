package ua.lviv.iot;


import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {

    private String userInput;
    private List<String> logoList;

    StringProcessor() {

    }

    public final String getUserInput() {
        return userInput;
    }

    public final void setUserInput(final String userInput) {
        this.userInput = userInput;
    }

    public final List<String> getLogoList() {
        return logoList;
    }

    public final void setLogoList(final List<String> logoList) {
        this.logoList = logoList;
    }

  public void readUserInput() throws IOException {

        System.out.println("Insert text below: ");
        Scanner scanner = new Scanner(System.in);
        this.userInput = scanner.nextLine();
        System.out.println("Your result is:  " + userInput + "\n");
        scanner.close();

    }

    public final List<String> fileNameFinder() {
        logoList = new LinkedList<String>();
        String s = "logo123dsfs, logoapple123, logo12312banana, logo2131cookie, logo123americans,"
                + " logo21312something, logo31231careless, logo123cup, logo32132taste, "
                + "logo123share, logo123221gotIt, object, match, piece, little, slow, fast, come.";
        Pattern pattern = Pattern.compile("\\b+[l][o][g][o][1][2][3]+\\B");      
        Matcher matcher = pattern.matcher(s);
        
        while (matcher.find()) {
             s = s.replaceAll("\\b+[l][o][g][o][1][2][3]+\\B", "LOGO123");
            logoList.add(s);           
        }

        return logoList;
    }

    public final List<String> showResults() {
        System.out.println(logoList);
        return logoList;
        
    }
}