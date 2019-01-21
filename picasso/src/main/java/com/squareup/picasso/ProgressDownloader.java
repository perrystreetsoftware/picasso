package com.squareup.picasso;

import androidx.annotation.NonNull;

import java.io.IOException;

import okhttp3.Response;

public interface ProgressDownloader {
    @NonNull
    Response load(@NonNull okhttp3.Request request, ProgressCallback progressCallback) throws IOException;
}
