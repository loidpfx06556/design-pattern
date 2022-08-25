package pattern.facade;

import java.io.File;

/**
 * https://refactoring.guru/design-patterns/facade/java/example#example-0
 */
public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}