package com.tencent.ugc.common;

import android.media.MediaExtractor;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.C34741f;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes2.dex */
public class MediaExtractorBuilder {
    private static final String CONTENT_URL_SCHEME = "content://";
    private static final String TAG = "MediaExtractorBuilder";
    private String mFilePath = "";
    private String mMimeType = "";

    public static boolean isContentUri(String str) {
        return str != null && str.startsWith(CONTENT_URL_SCHEME);
    }

    public MediaExtractor build() {
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            if (isContentUri(this.mFilePath)) {
                mediaExtractor.setDataSource(ContextUtils.getApplicationContext().getContentResolver().openFileDescriptor(Uri.parse(this.mFilePath), "r").getFileDescriptor());
            } else {
                if (!C34741f.m76111a(this.mFilePath)) {
                    mediaExtractor.release();
                    return null;
                }
                mediaExtractor.setDataSource(this.mFilePath);
            }
            if (!TextUtils.isEmpty(this.mMimeType)) {
                selectMimeType(mediaExtractor);
            }
            return mediaExtractor;
        } catch (Exception e11) {
            LiteavLog.m76083e(TAG, "setDataSource: ".concat(String.valueOf(e11)));
            mediaExtractor.release();
            return null;
        }
    }

    public MediaExtractorBuilder setMimeType(String str) {
        this.mMimeType = str;
        return this;
    }

    public MediaExtractorBuilder setPath(String str) {
        this.mFilePath = str;
        return this;
    }

    private void selectMimeType(MediaExtractor mediaExtractor) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i11 = 0; i11 < trackCount; i11++) {
            if (mediaExtractor.getTrackFormat(i11).getString("mime").startsWith(this.mMimeType)) {
                mediaExtractor.selectTrack(i11);
                return;
            }
        }
    }
}
