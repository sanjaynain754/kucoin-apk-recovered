package com.kubi.p110rn.kline;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KlineChartScrollViewManager.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/rn/kline/KlineChartScrollViewManager;", "Lcom/facebook/react/views/scroll/ReactScrollViewManager;", "<init>", "()V", "getName", "", "createViewInstance", "Lcom/kubi/rn/kline/KlineChartScrollView;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KlineChartScrollViewManager extends ReactScrollViewManager {

    @NotNull
    public static final String NATIVE_VIEW_NAME = "KlineChartScrollView";

    @Override // com.facebook.react.views.scroll.ReactScrollViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NATIVE_VIEW_NAME;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public KlineChartScrollView createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new KlineChartScrollView(reactContext);
    }
}
