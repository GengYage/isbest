package org.yage.basic.utils.global;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger("basic");

    public static Logger getLogger() {
        return LOGGER;
    }
}
