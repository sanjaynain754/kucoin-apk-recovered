package io.flutter.plugin.platform;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.view.AccessibilityBridge;

/* JADX INFO: loaded from: classes23.dex */
class AccessibilityEventsDelegate {
    private AccessibilityBridge accessibilityBridge;

    public boolean onAccessibilityHoverEvent(MotionEvent motionEvent, boolean z11) {
        AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge == null) {
            return false;
        }
        return accessibilityBridge.onAccessibilityHoverEvent(motionEvent, z11);
    }

    public boolean requestSendAccessibilityEvent(@NonNull View view, @NonNull View view2, @NonNull AccessibilityEvent accessibilityEvent) {
        AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge == null) {
            return false;
        }
        return accessibilityBridge.externalViewRequestSendAccessibilityEvent(view, view2, accessibilityEvent);
    }

    public void setAccessibilityBridge(@Nullable AccessibilityBridge accessibilityBridge) {
        this.accessibilityBridge = accessibilityBridge;
    }
}
