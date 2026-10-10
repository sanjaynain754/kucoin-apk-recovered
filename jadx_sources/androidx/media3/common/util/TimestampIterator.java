package androidx.media3.common.util;

import androidx.media3.common.C2711C;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface TimestampIterator {
    TimestampIterator copyOf();

    boolean hasNext();

    long next();

    default long getLastTimestampUs() {
        return C2711C.TIME_UNSET;
    }
}
