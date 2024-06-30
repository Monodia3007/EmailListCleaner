package eu.lilithmonodia.emaillistcleaner.emaillistcleaner.data;

import org.jetbrains.annotations.NotNull;

public class Email implements Comparable<Email>{
    private final String username;
    private final String domain;

    public Email(@NotNull String email) {
        String[] parts = email.split("@");
        if (parts.length == 2) {
            username = parts[0];
            domain = parts[1];
        } else {
            throw new IllegalArgumentException("Invalid email address: " + email);
        }
    }

    public String getUsername() {
        return username;
    }

    public String getDomain() {
        return domain;
    }

    public String toString() {
        return username + "@" + domain;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Email) {
            Email other = (Email) obj;
            return username.equals(other.username) && domain.equals(other.domain);
        }
        return false;
    }

    public int hashCode() {
        return username.hashCode() + domain.hashCode();
    }

    public int compareTo(@NotNull Email other) {
        int result = username.compareToIgnoreCase(other.username);
        if (result == 0) {
            result = domain.compareToIgnoreCase(other.domain);
        }
        return result;
    }

    public boolean isSameUser(@NotNull Email other) {
        return username.equalsIgnoreCase(other.username);
    }

    public boolean isSameDomain(@NotNull Email other) {
        return domain.equalsIgnoreCase(other.domain);
    }
}
