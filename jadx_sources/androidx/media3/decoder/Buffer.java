package androidx.media3.decoder;

import androidx.annotation.CallSuper;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public abstract class Buffer {
    private int flags;

    @CallSuper
    public void clear() {
        this.flags = 0;
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final void addFlag(int i11) {
        this.flags = i11 | this.flags;
    }

    public final void clearFlag(int i11) {
        this.flags = (~i11) & this.flags;
    }

    public final boolean getFlag(int i11) {
        return (this.flags & i11) == i11;
    }

    public final boolean hasSupplementalData() {
        return getFlag(268435456);
    }

    public final boolean isFirstSample() {
        return getFlag(C2711C.BUFFER_FLAG_FIRST_SAMPLE);
    }

    public final boolean isLastSample() {
        return getFlag(C2711C.BUFFER_FLAG_LAST_SAMPLE);
    }

    public final boolean notDependedOn() {
        return getFlag(67108864);
    }

    public final void setFlags(int i11) {
        this.flags = i11;
    }
}
