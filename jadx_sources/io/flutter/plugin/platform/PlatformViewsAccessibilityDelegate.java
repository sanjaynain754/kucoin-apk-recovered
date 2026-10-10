package io.flutter.plugin.platform;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.view.AccessibilityBridge;

/* JADX INFO: loaded from: classes23.dex */
public interface PlatformViewsAccessibilityDelegate {
    void attachAccessibilityBridge(@NonNull AccessibilityBridge accessibilityBridge);

    void detachAccessibilityBridge();

    @Nullable
    View getPlatformViewById(int i11);

    boolean usesVirtualDisplay(int i11);
}
