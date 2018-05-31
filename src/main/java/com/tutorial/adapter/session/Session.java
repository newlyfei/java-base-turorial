package com.tutorial.adapter.session;

import java.time.Duration;
import java.time.Instant;
import java.util.Set;

public interface Session {

    String getId();

    String changeSessionId();

    <T> T getAttribute(String attributeName);


    @SuppressWarnings("unchecked")
    default <T> T getRequiredAttribute(String name) {
        T result = getAttribute(name);
        if (result == null) {
            throw new IllegalArgumentException(
                    "Required attribute '" + name + "' is missing.");
        }
        return result;
    }


    @SuppressWarnings("unchecked")
    default <T> T getAttributeOrDefault(String name, T defaultValue) {
        T result = getAttribute(name);
        return result == null ? defaultValue : result;
    }


    Set<String> getAttributeNames();

    void setAttribute(String attributeName, Object attributeValue);

    void removeAttribute(String attributeName);

    Instant getCreationTime();

    void setLastAccessedTime(Instant lastAccessedTime);

    Instant getLastAccessedTime();

    void setMaxInactiveInterval(Duration interval);

    Duration getMaxInactiveInterval();

    boolean isExpired();

}
