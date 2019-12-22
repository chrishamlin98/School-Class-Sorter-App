import java.net.URI;

final class Connection {
    private final String username;
    private final String password;
    private final URI url;

    public Connection(String username, String password, URI url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public URI getUrl() {
        return url;
    }
}
