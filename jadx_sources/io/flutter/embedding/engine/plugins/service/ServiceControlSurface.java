package io.flutter.embedding.engine.plugins.service;

import android.app.Service;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes23.dex */
public interface ServiceControlSurface {
    void attachToService(@NonNull Service service, @Nullable Lifecycle lifecycle, boolean z11);

    void detachFromService();

    void onMoveToBackground();

    void onMoveToForeground();
}
