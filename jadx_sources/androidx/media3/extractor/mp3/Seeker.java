package androidx.media3.extractor.mp3;

import androidx.media3.common.C2711C;
import androidx.media3.extractor.SeekMap;

/* JADX INFO: loaded from: classes34.dex */
interface Seeker extends SeekMap {

    public static class UnseekableSeeker extends SeekMap.Unseekable implements Seeker {
        @Override // androidx.media3.extractor.mp3.Seeker
        public long getDataEndPosition() {
            return -1L;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public long getTimeUs(long j11) {
            return 0L;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public int getAverageBitrate() {
            return C2711C.RATE_UNSET_INT;
        }

        public UnseekableSeeker() {
            super(C2711C.TIME_UNSET);
        }
    }

    int getAverageBitrate();

    long getDataEndPosition();

    long getTimeUs(long j11);
}
