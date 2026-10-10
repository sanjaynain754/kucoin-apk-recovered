package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeKRNEventHubBridge.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J0\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeKRNEventHubBridgeBridge;", "Lcom/kubi/rn/core/turbo/NativeKRNEventHubBridgeSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeKRNEventHubBridgeAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeKRNEventHubBridgeAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeKRNEventHubBridgeAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "getContext", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "subscribe", "topic", "sticky", "", "unsubscribe", "subscriptionId", "publish", "payload", "Lcom/facebook/react/bridge/ReadableMap;", "target", "deliveryPolicy", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeKRNEventHubBridgeBridge extends NativeKRNEventHubBridgeSpec {

    @NotNull
    private final NativeKRNEventHubBridgeAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeKRNEventHubBridgeBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeKRNEventHubBridgeAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getContext$lambda$0(Promise promise, NativeKRNEventHubBridgeBridge nativeKRNEventHubBridgeBridge, Object obj) {
        if (promise != null) {
            promise.resolve(nativeKRNEventHubBridgeBridge.impl.wrapResult(obj));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit publish$lambda$3(Promise promise, NativeKRNEventHubBridgeBridge nativeKRNEventHubBridgeBridge, Object obj) {
        if (promise != null) {
            promise.resolve(nativeKRNEventHubBridgeBridge.impl.wrapResult(obj));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$1(Promise promise, NativeKRNEventHubBridgeBridge nativeKRNEventHubBridgeBridge, Object obj) {
        if (promise != null) {
            promise.resolve(nativeKRNEventHubBridgeBridge.impl.wrapResult(obj));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unsubscribe$lambda$2(Promise promise, NativeKRNEventHubBridgeBridge nativeKRNEventHubBridgeBridge, Object obj) {
        if (promise != null) {
            promise.resolve(nativeKRNEventHubBridgeBridge.impl.wrapResult(obj));
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeKRNEventHubBridgeSpec
    public void getContext(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getContext(new Function1() { // from class: com.kubi.rn.core.turbo.r1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeKRNEventHubBridgeBridge.getContext$lambda$0(promise, this, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeKRNEventHubBridgeAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeKRNEventHubBridgeSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "KRNEventHubBridge";
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeKRNEventHubBridgeSpec
    public void publish(@NotNull String topic, @NotNull ReadableMap payload, @NotNull ReadableMap target, @NotNull String deliveryPolicy, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(deliveryPolicy, "deliveryPolicy");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.publish(topic, payload, target, deliveryPolicy, new Function1() { // from class: com.kubi.rn.core.turbo.s1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeKRNEventHubBridgeBridge.publish$lambda$3(promise, this, obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeKRNEventHubBridgeSpec
    public void subscribe(@NotNull String topic, boolean sticky, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.subscribe(topic, sticky, new Function1() { // from class: com.kubi.rn.core.turbo.t1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeKRNEventHubBridgeBridge.subscribe$lambda$1(promise, this, obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeKRNEventHubBridgeSpec
    public void unsubscribe(@NotNull String subscriptionId, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.unsubscribe(subscriptionId, new Function1() { // from class: com.kubi.rn.core.turbo.u1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeKRNEventHubBridgeBridge.unsubscribe$lambda$2(promise, this, obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
