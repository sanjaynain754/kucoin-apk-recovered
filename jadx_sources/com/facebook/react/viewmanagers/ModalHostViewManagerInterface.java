package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes45.dex */
public interface ModalHostViewManagerInterface<T extends View> {
    void setAnimated(T t11, boolean z11);

    void setAnimationType(T t11, @Nullable String str);

    void setHardwareAccelerated(T t11, boolean z11);

    void setIdentifier(T t11, int i11);

    void setNavigationBarTranslucent(T t11, boolean z11);

    void setPresentationStyle(T t11, @Nullable String str);

    void setStatusBarTranslucent(T t11, boolean z11);

    void setSupportedOrientations(T t11, @Nullable ReadableArray readableArray);

    void setTransparent(T t11, boolean z11);

    void setVisible(T t11, boolean z11);
}
