package com.tencent.ugc.common;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.C34741f;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes2.dex */
public class VideoFrameRetriever {
    private static final String TAG = "VideoFrameRetriever";
    private final String mFilePath;
    private MediaMetadataRetriever mMediaMetadataRetriever;

    private void createMediaMetadataRetrieverIfNeed() {
        if (this.mMediaMetadataRetriever != null) {
            return;
        }
        try {
            if (MediaExtractorBuilder.isContentUri(this.mFilePath)) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                this.mMediaMetadataRetriever = mediaMetadataRetriever;
                mediaMetadataRetriever.setDataSource(ContextUtils.getApplicationContext(), Uri.parse(this.mFilePath));
            } else if (C34741f.m76111a(this.mFilePath)) {
                MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                this.mMediaMetadataRetriever = mediaMetadataRetriever2;
                mediaMetadataRetriever2.setDataSource(this.mFilePath);
            }
        } catch (Throwable th2) {
            LiteavLog.m76083e(TAG, "MediaMetadataRetriever build fail.".concat(String.valueOf(th2)));
            release();
        }
    }

    public void release() {
        MediaMetadataRetriever mediaMetadataRetriever = this.mMediaMetadataRetriever;
        if (mediaMetadataRetriever == null) {
            return;
        }
        try {
            mediaMetadataRetriever.release();
            this.mMediaMetadataRetriever = null;
        } catch (Throwable th2) {
            LiteavLog.m76084e(TAG, "mediaMetadataRetriever release.", th2);
        }
    }

    public VideoFrameRetriever(String str) {
        this.mFilePath = str;
    }

    public Bitmap getFrameAtTime(long j11) {
        createMediaMetadataRetrieverIfNeed();
        MediaMetadataRetriever mediaMetadataRetriever = this.mMediaMetadataRetriever;
        if (mediaMetadataRetriever == null) {
            return null;
        }
        try {
            return mediaMetadataRetriever.getFrameAtTime(j11);
        } catch (Throwable th2) {
            LiteavLog.m76088i(TAG, "get frame at time.", th2);
            return null;
        }
    }
}
