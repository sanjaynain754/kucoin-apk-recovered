package com.facebook.react.bridge;

import p852kotlin.Metadata;

/* JADX INFO: compiled from: LifecycleEventListener.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/facebook/react/bridge/LifecycleEventListener;", "", "onHostResume", "", "onHostPause", "onHostDestroy", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface LifecycleEventListener {
    void onHostDestroy();

    void onHostPause();

    void onHostResume();
}
