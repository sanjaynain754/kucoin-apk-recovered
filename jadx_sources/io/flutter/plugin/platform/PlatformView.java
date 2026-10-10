package io.flutter.plugin.platform;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes60.dex */
public interface PlatformView {
    void dispose();

    @Nullable
    View getView();

    @SuppressLint({"NewApi"})
    default void onFlutterViewAttached(@NonNull View view) {
    }

    @SuppressLint({"NewApi"})
    default void onFlutterViewDetached() {
    }

    @SuppressLint({"NewApi"})
    default void onInputConnectionLocked() {
    }

    @SuppressLint({"NewApi"})
    default void onInputConnectionUnlocked() {
    }
}
