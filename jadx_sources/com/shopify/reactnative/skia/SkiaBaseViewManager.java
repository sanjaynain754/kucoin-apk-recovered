package com.shopify.reactnative.skia;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import com.shopify.reactnative.skia.SkiaBaseView;

/* JADX INFO: loaded from: classes59.dex */
public abstract class SkiaBaseViewManager<T extends SkiaBaseView> extends ReactViewManager {
    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull ReactViewGroup reactViewGroup) {
        super.onDropViewInstance(reactViewGroup);
        ((SkiaBaseView) reactViewGroup).m68600f();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setNativeId(@NonNull ReactViewGroup reactViewGroup, @Nullable String str) {
        super.setNativeId(reactViewGroup, str);
        ((SkiaBaseView) reactViewGroup).registerView(Integer.parseInt(str));
    }

    @ReactProp(name = "debug")
    public void setDebug(T t11, boolean z11) {
        t11.setDebugMode(z11);
    }

    @ReactProp(name = "opaque")
    public void setOpaque(T t11, boolean z11) {
        t11.setOpaque(z11);
    }
}
