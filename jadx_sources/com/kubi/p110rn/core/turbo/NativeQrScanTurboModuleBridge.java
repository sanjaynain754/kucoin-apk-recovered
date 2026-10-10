package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.tencent.bugly.proguard.C33954u6;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: NativeQrScanTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u001a\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeQrScanTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeQrScanTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeQrScanTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeQrScanTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeQrScanTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "openQrScan", "bizType", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "scanQrCode", "supportedTypes", "Lcom/facebook/react/bridge/ReadableArray;", "callerHandlesUnknownCode", "", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeQrScanTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeQrScanTurboModule.kt\ncom/kubi/rn/core/turbo/NativeQrScanTurboModuleBridge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1557#2:89\n1628#2,3:90\n*S KotlinDebug\n*F\n+ 1 NativeQrScanTurboModule.kt\ncom/kubi/rn/core/turbo/NativeQrScanTurboModuleBridge\n*L\n82#1:89\n82#1:90,3\n*E\n"})
public final class NativeQrScanTurboModuleBridge extends NativeQrScanTurboModuleSpec {

    @NotNull
    private final NativeQrScanTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeQrScanTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeQrScanTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openQrScan$lambda$0(Promise promise, NativeQrScanTurboModuleBridge nativeQrScanTurboModuleBridge, String str) {
        if (promise != null) {
            promise.resolve(nativeQrScanTurboModuleBridge.impl.wrapResult(str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scanQrCode$lambda$2(Promise promise, NativeQrScanTurboModuleBridge nativeQrScanTurboModuleBridge, ScanQrCodeResult scanQrCodeResult) {
        if (promise != null) {
            promise.resolve(nativeQrScanTurboModuleBridge.impl.wrapResult(scanQrCodeResult));
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeQrScanTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeQrScanTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "QrScan";
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeQrScanTurboModuleSpec
    public void openQrScan(@Nullable String bizType, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.openQrScan(bizType, new Function1() { // from class: com.kubi.rn.core.turbo.r2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeQrScanTurboModuleBridge.openQrScan$lambda$0(promise, this, (String) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeQrScanTurboModuleSpec
    public void scanQrCode(@NotNull ReadableArray supportedTypes, boolean callerHandlesUnknownCode, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
        Intrinsics.checkNotNullParameter(promise, "promise");
        IntRange intRangeUntil = RangesKt.until(0, supportedTypes.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(supportedTypes.getDouble(((IntIterator) it).nextInt())));
        }
        this.impl.scanQrCode(arrayList, callerHandlesUnknownCode, new Function1() { // from class: com.kubi.rn.core.turbo.s2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeQrScanTurboModuleBridge.scanQrCode$lambda$2(promise, this, (ScanQrCodeResult) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
