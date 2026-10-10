package com.kubi.p110rn.brandindicator;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCBrandRefreshIndicatorViewManager.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0014J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/rn/brandindicator/KCBrandRefreshIndicatorViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/kubi/rn/brandindicator/KCBrandRefreshIndicatorView;", "<init>", "()V", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setPlaying", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "playing", "", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCBrandRefreshIndicatorViewManager extends SimpleViewManager<KCBrandRefreshIndicatorView> {

    @NotNull
    public static final String COMPONENT_NAME = "KCBrandRefreshIndicator";

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public KCBrandRefreshIndicatorView createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new KCBrandRefreshIndicatorView(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return COMPONENT_NAME;
    }

    @ReactProp(defaultBoolean = false, name = "playing")
    public final void setPlaying(@NotNull KCBrandRefreshIndicatorView view, boolean playing) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPlaying(playing);
    }
}
