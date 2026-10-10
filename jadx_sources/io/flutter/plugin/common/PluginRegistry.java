package io.flutter.plugin.common;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes60.dex */
public interface PluginRegistry {

    /* JADX INFO: loaded from: classes23.dex */
    public interface ActivityResultListener {
        boolean onActivityResult(int i11, int i12, @Nullable Intent intent);
    }

    public interface NewIntentListener {
        boolean onNewIntent(@NonNull Intent intent);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface RequestPermissionsResultListener {
        boolean onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr);
    }

    public interface UserLeaveHintListener {
        void onUserLeaveHint();
    }

    public interface WindowFocusChangedListener {
        void onWindowFocusChanged(boolean z11);
    }
}
