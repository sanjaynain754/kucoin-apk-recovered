package com.kubi.p110rn.kline;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KlineHybridBridgePackage.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"Lcom/kubi/rn/kline/KlineHybridBridgePackage;", "Lcom/facebook/react/TurboReactPackage;", "<init>", "()V", "getModule", "Lcom/facebook/react/bridge/NativeModule;", "name", "", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getReactModuleInfoProvider", "Lcom/facebook/react/module/model/ReactModuleInfoProvider;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KlineHybridBridgePackage extends TurboReactPackage {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map getReactModuleInfoProvider$lambda$0() {
        String name = KlineHybridBridgeModule.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return MapsKt.mapOf(TuplesKt.m90091to("KlineHybridBridge", new ReactModuleInfo("KlineHybridBridge", name, false, true, false, false, true)));
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @Nullable
    public NativeModule getModule(@NotNull String name, @NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Intrinsics.areEqual(name, "KlineHybridBridge")) {
            return new KlineHybridBridgeModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    @NotNull
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: com.kubi.rn.kline.t
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return KlineHybridBridgePackage.getReactModuleInfoProvider$lambda$0();
            }
        };
    }
}
