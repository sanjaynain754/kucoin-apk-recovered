package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes45.dex */
public interface ActivityEventListener {
    void onActivityResult(Activity activity, int i11, int i12, @Nullable Intent intent);

    void onNewIntent(Intent intent);

    default void onUserLeaveHint(Activity activity) {
    }
}
