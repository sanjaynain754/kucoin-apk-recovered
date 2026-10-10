package com.reactnativecommunity.blurview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.AndroidBlurViewManagerDelegate;
import com.facebook.react.viewmanagers.AndroidBlurViewManagerInterface;
import eightbitlab.com.blurview.BlurView;

/* JADX INFO: loaded from: classes59.dex */
@ReactModule(name = "AndroidBlurView")
class BlurViewManager extends ViewGroupManager<BlurView> implements AndroidBlurViewManagerInterface<BlurView> {
    private final ViewManagerDelegate<BlurView> mDelegate = new AndroidBlurViewManagerDelegate(this);

    @Override // com.facebook.react.viewmanagers.AndroidBlurViewManagerInterface
    public void setBlurAmount(BlurView blurView, int i11) {
    }

    @Override // com.facebook.react.viewmanagers.AndroidBlurViewManagerInterface
    public void setBlurType(BlurView blurView, @Nullable String str) {
    }

    @Override // com.facebook.react.viewmanagers.AndroidBlurViewManagerInterface
    @ReactProp(defaultInt = 10, name = "downsampleFactor")
    public void setDownsampleFactor(BlurView blurView, int i11) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public BlurView createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return C27494a.m68102a(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public ViewManagerDelegate<BlurView> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "AndroidBlurView";
    }

    @Override // com.facebook.react.viewmanagers.AndroidBlurViewManagerInterface
    @ReactProp(defaultBoolean = true, name = "autoUpdate")
    public void setAutoUpdate(BlurView blurView, boolean z11) {
        C27494a.m68103b(blurView, z11);
    }

    @Override // com.facebook.react.viewmanagers.AndroidBlurViewManagerInterface
    @ReactProp(defaultInt = 10, name = "blurRadius")
    public void setBlurRadius(BlurView blurView, int i11) {
        C27494a.m68106e(blurView, i11);
    }

    @Override // com.facebook.react.viewmanagers.AndroidBlurViewManagerInterface
    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(BlurView blurView, boolean z11) {
        C27494a.m68104c(blurView, z11);
    }

    @Override // com.facebook.react.viewmanagers.AndroidBlurViewManagerInterface
    @ReactProp(customType = "Color", name = "overlayColor")
    public void setOverlayColor(BlurView blurView, Integer num) {
        C27494a.m68105d(blurView, num.intValue());
    }

    public BlurViewManager(ReactApplicationContext reactApplicationContext) {
    }
}
