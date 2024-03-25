package classes.features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewFileFeature {
    public void newFileMethod() throws IOException {
        Path filePath = Files.writeString(
                Files.createTempFile(
                        Path.of("/tmp"),
                        "java11",
                        ".txt"
                ),
                "This is Java11 created file"
        );
        String fileContent = Files.readString(filePath);
        System.out.println("Created file Content : " + fileContent);
    }
}
