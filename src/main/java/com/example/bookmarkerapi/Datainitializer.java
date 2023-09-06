package com.example.bookmarkerapi;

import com.example.bookmarkerapi.domain.Bookmark;
import com.example.bookmarkerapi.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class Datainitializer implements CommandLineRunner {
    private final BookmarkRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Bookmark(null,"Wikipedia","https://www.wikipedia.org", Instant.now()));

        repository.save(new Bookmark(null, "Google", "https://www.google.com", Instant.now()));

        repository.save(new Bookmark(null, "YouTube", "https://www.youtube.com", Instant.now()));

        repository.save(new Bookmark(null, "Facebook", "https://www.facebook.com", Instant.now()));

        repository.save(new Bookmark(null, "Twitter", "https://www.twitter.com", Instant.now()));

        repository.save(new Bookmark(null, "LinkedIn", "https://www.linkedin.com", Instant.now()));

        repository.save(new Bookmark(null, "GitHub", "https://www.github.com", Instant.now()));

        repository.save(new Bookmark(null, "Amazon", "https://www.amazon.com", Instant.now()));

        repository.save(new Bookmark(null, "Netflix", "https://www.netflix.com", Instant.now()));

        repository.save(new Bookmark(null,"IMDb","https://www.imdb.com", Instant.now()));

        repository.save(new Bookmark(null,"PayPal","https://www.paypal.com", Instant.now()));
    }
}
