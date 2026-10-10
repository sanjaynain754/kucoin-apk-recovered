package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.LoadingInfo;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface SequenceableLoader {

    public interface Callback<T extends SequenceableLoader> {
        void onContinueLoadingRequested(T t11);
    }

    boolean continueLoading(LoadingInfo loadingInfo);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j11);
}
