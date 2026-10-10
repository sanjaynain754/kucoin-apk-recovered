package com.kubi.p110rn.core.turbo;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeHomeFeedTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeHomeFeedTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeHomeFeedTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeHomeFeedTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeHomeFeedTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeHomeFeedTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "sendFeedTabOffsetX", TypedValues.CycleType.S_WAVE_OFFSET, "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeHomeFeedTurboModuleBridge extends NativeHomeFeedTurboModuleSpec {

    @NotNull
    private final NativeHomeFeedTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeHomeFeedTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeHomeFeedTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendFeedTabOffsetX$lambda$0(Promise promise, NativeHomeFeedTurboModuleBridge nativeHomeFeedTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeHomeFeedTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeHomeFeedTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeHomeFeedTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "HomeFeed";
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeHomeFeedTurboModuleSpec
    public void sendFeedTabOffsetX(double offset, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.sendFeedTabOffsetX(offset, new Function1() { // from class: com.kubi.rn.core.turbo.m1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeHomeFeedTurboModuleBridge.sendFeedTabOffsetX$lambda$0(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
