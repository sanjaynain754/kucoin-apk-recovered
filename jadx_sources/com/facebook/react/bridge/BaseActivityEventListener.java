package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes45.dex */
public class BaseActivityEventListener implements ActivityEventListener {
    @Deprecated
    public void onActivityResult(int i11, int i12, Intent intent) {
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i11, int i12, @Nullable Intent intent) {
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }
}
