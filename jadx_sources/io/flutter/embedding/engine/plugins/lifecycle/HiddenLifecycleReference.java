package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes60.dex */
@Keep
public class HiddenLifecycleReference {

    @NonNull
    private final Lifecycle lifecycle;

    @NonNull
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public HiddenLifecycleReference(@NonNull Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }
}
