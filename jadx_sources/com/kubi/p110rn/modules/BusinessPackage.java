package com.kubi.p110rn.modules;

import android.view.View;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManager;
import com.kubi.homern.api.IHomeRNService;
import com.kubi.p110rn.brandindicator.KCBrandRefreshIndicatorViewManager;
import com.kubi.p110rn.brandrefresh.KCBrandRefreshLayoutManager;
import com.kubi.p110rn.core.RNRouteEmitterModule;
import com.kubi.p110rn.core.biz.FuturesNavigationModule;
import com.kubi.p110rn.core.socket.KRNSocketNativeBridge;
import com.kubi.p110rn.core.turbo.NativeKRNEngineBridgeTurboModule;
import com.kubi.p110rn.kline.TradingViewLegacyStorageModule;
import com.kubi.p110rn.modules.bridge.KRNEventEmitter;
import com.kubi.p110rn.modules.bridge.KRNPhotoBridge;
import com.kubi.p110rn.modules.bridge.KRNPublicBridge;
import com.kubi.p110rn.modules.bridge.KRNSocketEventEmitter;
import com.kubi.p110rn.protocol.KRNProtocolBridge;
import com.kubi.router.core.Router;
import d00.InterfaceC36575j;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BusinessPackage.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0002J&\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\f0\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/rn/modules/BusinessPackage;", "Lcom/facebook/react/ReactPackage;", "<init>", "()V", "createNativeModules", "", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "registerKrnSocketBinaryHandler", "", "createViewManagers", "Lcom/facebook/react/uimanager/ViewManager;", "Landroid/view/View;", "Lcom/facebook/react/uimanager/ReactShadowNode;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BusinessPackage implements ReactPackage {
    private final void registerKrnSocketBinaryHandler() {
        try {
            Result.Companion companion = Result.INSTANCE;
            InterfaceC36575j interfaceC36575j = (InterfaceC36575j) Router.f46192a.m56192n(InterfaceC36575j.class);
            Unit unit = null;
            KRNSocketNativeBridge.KRNSocketHandler kRNSocketHandler = interfaceC36575j instanceof KRNSocketNativeBridge.KRNSocketHandler ? (KRNSocketNativeBridge.KRNSocketHandler) interfaceC36575j : null;
            if (kRNSocketHandler != null) {
                KRNSocketNativeBridge.setHandler(kRNSocketHandler);
                unit = Unit.INSTANCE;
            }
            Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Override // com.facebook.react.ReactPackage
    @NotNull
    public List<NativeModule> createNativeModules(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        registerKrnSocketBinaryHandler();
        return CollectionsKt.mutableListOf(new KRNProtocolBridge(reactContext), new KRNPublicBridge(reactContext), new KRNPhotoBridge(reactContext), new KRNEventEmitter(reactContext), new KRNSocketEventEmitter(reactContext), new RNRouteEmitterModule(reactContext), new FuturesNavigationModule(reactContext), new TradingViewLegacyStorageModule(reactContext), new NativeKRNEngineBridgeTurboModule(reactContext));
    }

    @Override // com.facebook.react.ReactPackage
    @NotNull
    public List<ViewManager<View, ReactShadowNode<?>>> createViewManagers(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        List<ViewManager<View, ReactShadowNode<?>>> listMutableListOf = CollectionsKt.mutableListOf(new KCBrandRefreshIndicatorViewManager(), new KCBrandRefreshLayoutManager());
        IHomeRNService.Companion companion = IHomeRNService.f26874a;
        listMutableListOf.add(companion.get().mo31239d());
        listMutableListOf.add(companion.get().mo31236a());
        listMutableListOf.add(companion.get().mo31238c());
        return listMutableListOf;
    }
}
