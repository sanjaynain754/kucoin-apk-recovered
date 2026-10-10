package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes45.dex */
public interface RootView {
    void handleException(Throwable th2);

    void onChildEndedNativeGesture(View view, MotionEvent motionEvent);

    @Deprecated
    default void onChildStartedNativeGesture(MotionEvent motionEvent) {
        onChildStartedNativeGesture(null, motionEvent);
    }

    void onChildStartedNativeGesture(View view, MotionEvent motionEvent);
}
