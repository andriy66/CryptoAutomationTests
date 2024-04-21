package utils;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

public class UrlGeneratorUtil {
    public static String generateUrl(String baseUrl, Map<String, String> params) {
        try {
            URI uri = new URI(baseUrl);
            String query = buildQueryString(params);

            if (uri.getQuery() != null && !uri.getQuery().isEmpty()) {
                baseUrl += "&" + query;
            } else {
                baseUrl += "?" + query;
            }
            return baseUrl;

        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String buildQueryString(Map<String, String> params) {
        StringBuilder queryString = new StringBuilder();

        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (queryString.length() > 0) {
                queryString.append("&");
            }
            queryString.append(entry.getKey()).append("=").append(entry.getValue());
        }

        return queryString.toString();
    }
}
