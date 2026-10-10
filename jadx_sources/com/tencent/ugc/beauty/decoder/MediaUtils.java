package com.tencent.ugc.beauty.decoder;

import android.media.MediaFormat;

/* JADX INFO: loaded from: classes2.dex */
public class MediaUtils {
    public static final String KEY_ROTATION = "rotation-degrees";

    public static void checkState(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static boolean hasEosFlag(int i11) {
        return (i11 & 4) != 0;
    }

    public static MediaFormat retriveMediaFormat(String str, boolean z11) throws SetupException {
        Extractor extractor = new Extractor(z11, str, new RangeExtractorAdvancer());
        try {
            extractor.setup();
            return extractor.getMediaFormat();
        } finally {
            extractor.release();
        }
    }
}
