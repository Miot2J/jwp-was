package model;

import enums.HttpMethod;

public class RequestLine {
    private final HttpMethod httpMethod;
    private final String path;
    private final String queryString;
    private final WebProtocol webProtocol;

    public RequestLine(String httpMethod, String path, String queryString, WebProtocol webProtocol) {
        this.httpMethod = HttpMethod.getHttpMethod(httpMethod);
        this.path = path;
        this.queryString = queryString;
        this.webProtocol = webProtocol;
    }

    public RequestLine(String httpMethod, String path, WebProtocol webProtocol) {
        this.httpMethod = HttpMethod.getHttpMethod(httpMethod);
        this.path = path;
        this.queryString = null;
        this.webProtocol = webProtocol;
    }

    public HttpMethod getHttpMethod() {
        return httpMethod;
    }

    public String getPath() {
        return path;
    }

    public String getQueryString() {
        return queryString;
    }

    public WebProtocol getWebProtocol() {
        return webProtocol;
    }

    public Boolean hasQueryString() {
        return queryString != null;
    }
}