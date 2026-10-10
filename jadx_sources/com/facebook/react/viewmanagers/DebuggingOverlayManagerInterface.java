package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes45.dex */
public interface DebuggingOverlayManagerInterface<T extends View> {
    void clearElementsHighlights(T t11);

    void highlightElements(T t11, ReadableArray readableArray);

    void highlightTraceUpdates(T t11, ReadableArray readableArray);
}
