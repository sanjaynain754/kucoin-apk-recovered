package androidx.media3.p022ui;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface TimeBar {

    public interface OnScrubListener {
        void onScrubMove(TimeBar timeBar, long j11);

        void onScrubStart(TimeBar timeBar, long j11);

        void onScrubStop(TimeBar timeBar, long j11, boolean z11);
    }

    void addListener(OnScrubListener onScrubListener);

    long getPreferredUpdateDelay();

    void removeListener(OnScrubListener onScrubListener);

    void setAdGroupTimesMs(@Nullable long[] jArr, @Nullable boolean[] zArr, int i11);

    void setBufferedPosition(long j11);

    void setDuration(long j11);

    void setEnabled(boolean z11);

    void setKeyCountIncrement(int i11);

    void setKeyTimeIncrement(long j11);

    void setPosition(long j11);
}
