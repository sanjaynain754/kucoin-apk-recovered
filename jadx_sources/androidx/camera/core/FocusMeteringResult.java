package androidx.camera.core;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes23.dex */
public final class FocusMeteringResult {
    private boolean mIsFocusSuccessful;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static FocusMeteringResult create(boolean z11) {
        return new FocusMeteringResult(z11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static FocusMeteringResult emptyInstance() {
        return new FocusMeteringResult(false);
    }

    public boolean isFocusSuccessful() {
        return this.mIsFocusSuccessful;
    }

    private FocusMeteringResult(boolean z11) {
        this.mIsFocusSuccessful = z11;
    }
}
