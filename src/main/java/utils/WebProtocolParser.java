package utils;

import model.WebProtocol;

public class WebProtocolParser implements Parser {
    private static final Integer PROTOCOL_INDEX = 0;
    private static final Integer PROTOCOL_VERSION_INDEX = 1;
    private static final String VERSION_SEPARATOR = "/";

    public WebProtocol parse(String protocol) {
        String[] split = protocol.split(VERSION_SEPARATOR);

        String type = split[PROTOCOL_INDEX];
        String version = split[PROTOCOL_VERSION_INDEX];

        return new WebProtocol(type, version);
    }
}