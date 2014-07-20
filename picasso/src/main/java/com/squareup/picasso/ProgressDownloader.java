package com.squareup.picasso;

import android.support.annotation.NonNull;

import java.io.IOException;

import okhttp3.Response;

public interface ProgressDownloader {
    @NonNull
    Response load(@NonNull okhttp3.Request request, ProgressCallback progressCallback) throws IOException;
}
