package com.kodilla.patterns.strategy.social;

public class User {
    private final String username;
    protected SocialPublisher socialPublisher;

    public User(String username) {
        this.username = username;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String getUsername() {
        return username;
    }

    public String sharePost() {
        return socialPublisher.share();
    }
}
