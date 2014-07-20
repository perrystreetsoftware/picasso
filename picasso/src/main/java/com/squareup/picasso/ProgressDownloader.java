package com.squareup.picasso;

import java.io.IOException;

import android.net.Uri;

import com.squareup.picasso.Downloader.Response;

public interface ProgressDownloader {
  Response load(Uri uri, int networkPolicy, ProgressCallback progressCallback) throws IOException;
}
