package com.example.feeling.miniflickr;

import android.content.SearchRecentSuggestionsProvider;

/**
 * Created by feeling on 3/27/16.
 */
public class SuggestionProvider extends SearchRecentSuggestionsProvider {
    // part of content uri which is defined in AndroidManifest.xml
    public static final String AUTHORITY =
            "com.example.feeling.miniflickr.com.example.feeling.miniflickr.SuggestionProvider";
    // suggestion mode which gives recent queries
    public static final int MODE = DATABASE_MODE_QUERIES;

    public SuggestionProvider() {
        setupSuggestions(AUTHORITY, MODE);
    }
}
