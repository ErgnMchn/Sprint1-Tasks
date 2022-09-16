package FileParser;

import java.io.*;

public class FileParser {

    public static long getNumberOfOccurrences(String fileLocation, String stringToCount) {
        String line;
        int count = 0;
        String[] a = stringToCount.split(" ");


        try (BufferedReader br = new BufferedReader(new FileReader(fileLocation))) {
            while ((line = br.readLine()) != null) {
                String fileLines[] = line.split(" ");
                for (int i = 0; i < fileLines.length; i++) {
                    if (fileLines[i].equals(stringToCount)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static void replaceString(String fileLocation,String stringToSearch, String stringToReplace) {
        File file = new File(fileLocation);
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newContent = oldContent.replaceAll(stringToSearch, stringToReplace);
            writer = new FileWriter(file);
            writer.write(newContent);
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}