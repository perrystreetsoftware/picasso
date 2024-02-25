package com.squareup.picasso;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.IOException;

import okhttp3.Response;

public interface ProgressDownloader {
    @NonNull
    Response load(@NonNull okhttp3.Request request, @Nullable ProgressCallback progressCallback) throws IOException;
}
