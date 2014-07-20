package com.squareup.picasso;

public interface ProgressCallback {
	public void progress(long count, long total);
	public void decodingException(Exception e);
}
