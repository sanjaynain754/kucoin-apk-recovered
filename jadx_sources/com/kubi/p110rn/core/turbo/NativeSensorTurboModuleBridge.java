package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeSensorTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0013H\u0016J6\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0013H\u0016J \u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006%"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeSensorTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeSensorTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeSensorTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeSensorTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeSensorTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "fastFetchJsonTest", "Lcom/facebook/react/bridge/WritableMap;", "keyName", "defaultValue", "Lcom/facebook/react/bridge/ReadableMap;", "fastFetchIntegerTest", "", "fastFetchStringTest", "fastFetchBoolTest", "", "sensorsTrackTurbo", "eventId", "properties", "sensorsExpose", "pageId", "blockId", "locationId", "siteId", "fetchKcAbTest", "experimentKey", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeSensorTurboModuleBridge extends NativeSensorTurboModuleSpec {

    @NotNull
    private final NativeSensorTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeSensorTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeSensorTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchKcAbTest$lambda$0(Promise promise, NativeSensorTurboModuleBridge nativeSensorTurboModuleBridge, String str) {
        if (promise != null) {
            promise.resolve(nativeSensorTurboModuleBridge.impl.wrapResult(str));
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSensorTurboModuleSpec
    @Nullable
    public WritableMap fastFetchBoolTest(@NotNull String keyName, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        NativeSensorTurboModuleAbs nativeSensorTurboModuleAbs = this.impl;
        return nativeSensorTurboModuleAbs.wrapResult(nativeSensorTurboModuleAbs.fastFetchBoolTest(keyName, defaultValue));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSensorTurboModuleSpec
    @Nullable
    public WritableMap fastFetchIntegerTest(@NotNull String keyName, double defaultValue) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        NativeSensorTurboModuleAbs nativeSensorTurboModuleAbs = this.impl;
        return nativeSensorTurboModuleAbs.wrapResult(nativeSensorTurboModuleAbs.fastFetchIntegerTest(keyName, defaultValue));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSensorTurboModuleSpec
    @Nullable
    public WritableMap fastFetchJsonTest(@NotNull String keyName, @NotNull ReadableMap defaultValue) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        NativeSensorTurboModuleAbs nativeSensorTurboModuleAbs = this.impl;
        return nativeSensorTurboModuleAbs.wrapResult(nativeSensorTurboModuleAbs.fastFetchJsonTest(keyName, defaultValue));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSensorTurboModuleSpec
    @Nullable
    public WritableMap fastFetchStringTest(@NotNull String keyName, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        NativeSensorTurboModuleAbs nativeSensorTurboModuleAbs = this.impl;
        return nativeSensorTurboModuleAbs.wrapResult(nativeSensorTurboModuleAbs.fastFetchStringTest(keyName, defaultValue));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSensorTurboModuleSpec
    public void fetchKcAbTest(@NotNull String experimentKey, @NotNull String defaultValue, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(experimentKey, "experimentKey");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.fetchKcAbTest(experimentKey, defaultValue, new Function1() { // from class: com.kubi.rn.core.turbo.m3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSensorTurboModuleBridge.fetchKcAbTest$lambda$0(promise, this, (String) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeSensorTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSensorTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Sensor";
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSensorTurboModuleSpec
    @Nullable
    public WritableMap sensorsExpose(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @Nullable String siteId, @Nullable ReadableMap properties) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        NativeSensorTurboModuleAbs nativeSensorTurboModuleAbs = this.impl;
        return nativeSensorTurboModuleAbs.wrapResult(nativeSensorTurboModuleAbs.sensorsExpose(pageId, blockId, locationId, siteId, properties));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSensorTurboModuleSpec
    @Nullable
    public WritableMap sensorsTrackTurbo(@NotNull String eventId, @Nullable ReadableMap properties) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        NativeSensorTurboModuleAbs nativeSensorTurboModuleAbs = this.impl;
        return nativeSensorTurboModuleAbs.wrapResult(nativeSensorTurboModuleAbs.sensorsTrackTurbo(eventId, properties));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
