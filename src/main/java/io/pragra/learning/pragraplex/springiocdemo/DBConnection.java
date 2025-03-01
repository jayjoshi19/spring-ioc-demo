package io.pragra.learning.pragraplex.springiocdemo;

public class DBConnection {

    private String url;
    private String username;
    private String password;

    // establish connection to the db
    public void establishConnection() {
        System.out.println("Database connection established");
    }

    public void disconnectConnection() {
        System.out.println("Database connection has been disconnected");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DBConnection{");
        sb.append("url='").append(url).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
