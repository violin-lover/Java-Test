import java.util.*;
public class Codec {

    // Encodes a URL to a shortened URL.
    HashMap<String, String> bla = new HashMap<String, String>();
    public String encode(String longUrl) {
        String map = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String token = "";
        
        for (int i = 0; i < 6; i++) {
            int num = (int)Math.floor(Math.random() * 62);
            token += map.charAt((num));
        };
        
        String sUrl = "http://tinyurl.com/" + token;
        bla.put(sUrl, longUrl);
        return sUrl;
    
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return bla.get(shortUrl);
    }
}
