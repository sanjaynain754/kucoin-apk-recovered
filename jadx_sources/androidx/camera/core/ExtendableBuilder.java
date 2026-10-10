package androidx.camera.core;

import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.MutableConfig;

/* JADX INFO: loaded from: classes23.dex */
public interface ExtendableBuilder<T> {
    T build();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    MutableConfig getMutableConfig();
}
