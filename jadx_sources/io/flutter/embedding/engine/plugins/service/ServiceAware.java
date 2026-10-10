package io.flutter.embedding.engine.plugins.service;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes23.dex */
public interface ServiceAware {

    /* JADX INFO: loaded from: classes60.dex */
    public interface OnModeChangeListener {
        void onMoveToBackground();

        void onMoveToForeground();
    }

    void onAttachedToService(@NonNull ServicePluginBinding servicePluginBinding);

    void onDetachedFromService();
}
