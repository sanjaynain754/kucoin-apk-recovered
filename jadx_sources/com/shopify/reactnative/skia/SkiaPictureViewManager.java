package com.shopify.reactnative.skia;

import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.SkiaPictureViewManagerDelegate;
import com.facebook.react.viewmanagers.SkiaPictureViewManagerInterface;

/* JADX INFO: loaded from: classes59.dex */
public class SkiaPictureViewManager extends SkiaBaseViewManager<SkiaPictureView> implements SkiaPictureViewManagerInterface<SkiaPictureView> {
    protected SkiaPictureViewManagerDelegate mDelegate = new SkiaPictureViewManagerDelegate(this);

    @Override // com.facebook.react.uimanager.ViewManager
    public SkiaPictureViewManagerDelegate getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "SkiaPictureView";
    }

    @Override // com.facebook.react.viewmanagers.SkiaPictureViewManagerInterface
    @ReactProp(name = "debug")
    public /* bridge */ /* synthetic */ void setDebug(View view, boolean z11) {
        super.setDebug((SkiaBaseView) view, z11);
    }

    @Override // com.facebook.react.viewmanagers.SkiaPictureViewManagerInterface
    @ReactProp(name = "opaque")
    public /* bridge */ /* synthetic */ void setOpaque(View view, boolean z11) {
        super.setOpaque((SkiaBaseView) view, z11);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    @NonNull
    public SkiaPictureView createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return new SkiaPictureView(themedReactContext);
    }
}
