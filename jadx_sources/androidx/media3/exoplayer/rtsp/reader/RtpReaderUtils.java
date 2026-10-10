package androidx.media3.exoplayer.rtsp.reader;

import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes34.dex */
class RtpReaderUtils {
    public static long toSampleTimeUs(long j11, long j12, long j13, int i11) {
        return j11 + Util.scaleLargeTimestamp(j12 - j13, 1000000L, i11);
    }

    private RtpReaderUtils() {
    }
}
