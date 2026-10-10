package io.flutter.embedding.android;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes60.dex */
public interface ExclusiveAppComponent<T> {
    void detachFromFlutterEngine();

    @NonNull
    T getAppComponent();
}
