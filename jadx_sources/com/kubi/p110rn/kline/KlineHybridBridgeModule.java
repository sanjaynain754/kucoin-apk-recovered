package com.kubi.p110rn.kline;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.p110rn.core.biz.KCTurboFileModuleImpl;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: KlineHybridBridgeModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0010H\u0002J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/rn/kline/KlineHybridBridgeModule;", "Lcom/kubi/rn/kline/NativeKlineHybridBridgeSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "stageVisibleRequested", "", "miniVisibleRequested", "setFlutterStageVisible", "", ViewProps.VISIBLE, "setFlutterMiniVisible", "refreshFlutterMiniTradeOverlays", "symbol", "", "scope", "onHostResume", "onHostPause", "onHostDestroy", "invalidate", "updateStageVisibility", "source", "updateMiniVisibility", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KlineHybridBridgeModule extends NativeKlineHybridBridgeSpec implements LifecycleEventListener {

    @NotNull
    private static final String TAG = "KlineHybridBridge";
    private volatile boolean miniVisibleRequested;

    @NotNull
    private final ReactApplicationContext reactContext;
    private volatile boolean stageVisibleRequested;

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        updateStageVisibility(false, "hostDestroy");
        updateMiniVisibility(false, "hostDestroy");
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        updateStageVisibility(false, "hostPause");
        updateMiniVisibility(false, "hostPause");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineHybridBridgeModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.stageVisibleRequested = true;
        this.miniVisibleRequested = true;
        reactContext.addLifecycleEventListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshFlutterMiniTradeOverlays$lambda$0(String str, String str2, KlineHybridBridgeModule klineHybridBridgeModule) {
        C44128b.m97259c("KlineHybridBridge", "refreshFlutterMiniTradeOverlays symbol=" + str + " scope=" + str2);
        KlineFlutterMiniHostView.INSTANCE.requestTradeOverlayRefresh(str, str2, klineHybridBridgeModule.reactContext);
    }

    private final void updateMiniVisibility(final boolean visible, final String source) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.kubi.rn.kline.s
            @Override // java.lang.Runnable
            public final void run() {
                KlineHybridBridgeModule.updateMiniVisibility$lambda$2(visible, source, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMiniVisibility$lambda$2(boolean z11, String str, KlineHybridBridgeModule klineHybridBridgeModule) {
        KlineFlutterMiniHostView.Companion companion = KlineFlutterMiniHostView.INSTANCE;
        KlineFlutterMiniHostView activeHost = companion.getActiveHost();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setFlutterMiniVisible visible=");
        sb2.append(z11);
        sb2.append(" source=");
        sb2.append(str);
        sb2.append(" activeHost=");
        sb2.append(activeHost != null);
        C44128b.m97259c("KlineHybridBridge", sb2.toString());
        companion.requestMiniVisible(z11, klineHybridBridgeModule.reactContext);
    }

    private final void updateStageVisibility(final boolean visible, final String source) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.kubi.rn.kline.q
            @Override // java.lang.Runnable
            public final void run() {
                KlineHybridBridgeModule.updateStageVisibility$lambda$1(visible, source);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateStageVisibility$lambda$1(boolean z11, String str) {
        KlineFlutterStageHostView activeHost = KlineFlutterStageHostView.INSTANCE.getActiveHost();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setFlutterStageVisible visible=");
        sb2.append(z11);
        sb2.append(" source=");
        sb2.append(str);
        sb2.append(" activeHost=");
        sb2.append(activeHost != null);
        C44128b.m97259c("KlineHybridBridge", sb2.toString());
        if (activeHost != null) {
            activeHost.setStageVisible(z11);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.reactContext.removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        if (this.stageVisibleRequested) {
            updateStageVisibility(true, "hostResume");
        }
        if (this.miniVisibleRequested) {
            updateMiniVisibility(true, "hostResume");
        }
    }

    @Override // com.kubi.p110rn.kline.NativeKlineHybridBridgeSpec
    public void refreshFlutterMiniTradeOverlays(@NotNull final String symbol, @NotNull final String scope) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(scope, "scope");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.kubi.rn.kline.r
            @Override // java.lang.Runnable
            public final void run() {
                KlineHybridBridgeModule.refreshFlutterMiniTradeOverlays$lambda$0(symbol, scope, this);
            }
        });
    }

    @Override // com.kubi.p110rn.kline.NativeKlineHybridBridgeSpec
    public void setFlutterMiniVisible(boolean visible) {
        this.miniVisibleRequested = visible;
        updateMiniVisibility(visible, KCTurboFileModuleImpl.SOURCE_RN);
    }

    @Override // com.kubi.p110rn.kline.NativeKlineHybridBridgeSpec
    public void setFlutterStageVisible(boolean visible) {
        this.stageVisibleRequested = visible;
        updateStageVisibility(visible, KCTurboFileModuleImpl.SOURCE_RN);
    }
}
