package androidx.media3.exoplayer;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(35)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UnstableApi
public interface SuitableOutputChecker {

    public interface Callback {
        void onSelectedOutputSuitabilityChanged(boolean z11);
    }

    void disable();

    void enable(Callback callback);

    boolean isSelectedOutputSuitableForPlayback();
}
