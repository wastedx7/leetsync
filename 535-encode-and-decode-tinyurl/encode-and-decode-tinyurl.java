public class Codec {

    Map<String, String> keyToUrl = new HashMap<>();
    Map<String, String> urlToKey = new HashMap<>();
    private static final String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String base_host = "http://tinyurl.com/";

    private String getRandomKey(){
        StringBuilder str = new StringBuilder();
        for(int i=0; i<6; i++){
            int randomIndex = (int) (Math.random() * chars.length());
            str.append(chars.charAt(randomIndex));
        }
        return str.toString();
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key = getRandomKey();
        urlToKey.put(longUrl, key);
        keyToUrl.put(key, longUrl);
        return base_host + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String key = shortUrl.replace(base_host, "");
        return keyToUrl.get(key);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));