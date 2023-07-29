import java.util.HashMap;
import java.util.Map;

public class ShortUrlGenerator {
    private Map<String, String> urlMap;
    private static final String BASE_URL = "http://tinyurl.com/";

    public ShortUrlGenerator() {
        urlMap = new HashMap<>();
    }

    public String generateTinyUrl(String longUrl) {
        String shortUrl = BASE_URL + getRandomCode();
        urlMap.put(shortUrl, longUrl);
        return shortUrl;
    }

    public String getLongUrl(String shortUrl) {
        return urlMap.getOrDefault(shortUrl, "URL not found.");
    }

    private String getRandomCode() {
        // For simplicity, we are using a random number between 1000 to 9999 as the code.
        return String.valueOf((int) (Math.random() * 9000) + 1000);
    }
}
