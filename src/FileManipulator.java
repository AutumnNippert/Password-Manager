import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.StringWriter;

public class FileManipulator {
    public void jsonFileWrite(){
        JSONObject user = new JSONObject();

        user.put("username", acc.username);
        user.put("password", acc.password);

        StringWriter out = new StringWriter();
        try {
            user.writeJSONString(out);
            System.out.println("You have successfully created a new user!");
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        String jsonText = out.toString();
        try (
                java.io.FileWriter file = new java.io.FileWriter("users.json")) {
            file.write(jsonText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
