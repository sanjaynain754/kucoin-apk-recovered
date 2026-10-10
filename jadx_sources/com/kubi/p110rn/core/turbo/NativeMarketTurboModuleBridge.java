package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
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

/* JADX INFO: compiled from: NativeMarketTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u001eH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0010H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006 "}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeMarketTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeMarketTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeMarketTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeMarketTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeMarketTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "getAlphaFavoriteList", "Lcom/facebook/react/bridge/WritableMap;", "isAlphaFavorite", "tokenChain", "changeAlphaFavorite", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getSpotFavoriteList", "isSpotFavorite", "symbol", "changeSpotFavorite", "getFutureFavoriteList", "isFutureFavorite", "changeFutureFavorite", "getFutureTag", "Lcom/facebook/react/bridge/ReadableArray;", "getUsStockExcludes", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeMarketTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeMarketTurboModule.kt\ncom/kubi/rn/core/turbo/NativeMarketTurboModuleBridge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n1557#2:143\n1628#2,3:144\n*S KotlinDebug\n*F\n+ 1 NativeMarketTurboModule.kt\ncom/kubi/rn/core/turbo/NativeMarketTurboModuleBridge\n*L\n134#1:143\n134#1:144,3\n*E\n"})
public final class NativeMarketTurboModuleBridge extends NativeMarketTurboModuleSpec {

    @NotNull
    private final NativeMarketTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeMarketTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeMarketTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeAlphaFavorite$lambda$0(Promise promise, NativeMarketTurboModuleBridge nativeMarketTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeMarketTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleSpec
    public void changeAlphaFavorite(@NotNull String tokenChain, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(tokenChain, "tokenChain");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.changeAlphaFavorite(tokenChain, new Function1() { // from class: com.kubi.rn.core.turbo.h2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeMarketTurboModuleBridge.changeAlphaFavorite$lambda$0(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleSpec
    @Nullable
    public WritableMap changeFutureFavorite(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        NativeMarketTurboModuleAbs nativeMarketTurboModuleAbs = this.impl;
        return nativeMarketTurboModuleAbs.wrapResult(nativeMarketTurboModuleAbs.changeFutureFavorite(symbol));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleSpec
    @Nullable
    public WritableMap changeSpotFavorite(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        NativeMarketTurboModuleAbs nativeMarketTurboModuleAbs = this.impl;
        return nativeMarketTurboModuleAbs.wrapResult(nativeMarketTurboModuleAbs.changeSpotFavorite(symbol));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleSpec
    @Nullable
    public WritableMap getAlphaFavoriteList() {
        NativeMarketTurboModuleAbs nativeMarketTurboModuleAbs = this.impl;
        return nativeMarketTurboModuleAbs.wrapResult(nativeMarketTurboModuleAbs.getAlphaFavoriteList());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleSpec
    @Nullable
    public WritableMap getFutureFavoriteList() {
        NativeMarketTurboModuleAbs nativeMarketTurboModuleAbs = this.impl;
        return nativeMarketTurboModuleAbs.wrapResult(nativeMarketTurboModuleAbs.getFutureFavoriteList());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleSpec
    @Nullable
    public WritableMap getFutureTag(@NotNull ReadableArray symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        IntRange intRangeUntil = RangesKt.until(0, symbol.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            String string = symbol.getString(((IntIterator) it).nextInt());
            if (string == null) {
                string = "";
            }
            arrayList.add(string);
        }
        NativeMarketTurboModuleAbs nativeMarketTurboModuleAbs = this.impl;
        return nativeMarketTurboModuleAbs.wrapResult(nativeMarketTurboModuleAbs.getFutureTag(arrayList));
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeMarketTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Market";
    }

    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleSpec
    @Nullable
    public WritableMap getSpotFavoriteList() {
        NativeMarketTurboModuleAbs nativeMarketTurboModuleAbs = this.impl;
        return nativeMarketTurboModuleAbs.wrapResult(nativeMarketTurboModuleAbs.getSpotFavoriteList());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleSpec
    @Nullable
    public WritableMap getUsStockExcludes() {
        NativeMarketTurboModuleAbs nativeMarketTurboModuleAbs = this.impl;
        return nativeMarketTurboModuleAbs.wrapResult(nativeMarketTurboModuleAbs.getUsStockExcludes());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleSpec
    @Nullable
    public WritableMap isAlphaFavorite(@NotNull String tokenChain) {
        Intrinsics.checkNotNullParameter(tokenChain, "tokenChain");
        NativeMarketTurboModuleAbs nativeMarketTurboModuleAbs = this.impl;
        return nativeMarketTurboModuleAbs.wrapResult(nativeMarketTurboModuleAbs.isAlphaFavorite(tokenChain));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleSpec
    @Nullable
    public WritableMap isFutureFavorite(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        NativeMarketTurboModuleAbs nativeMarketTurboModuleAbs = this.impl;
        return nativeMarketTurboModuleAbs.wrapResult(nativeMarketTurboModuleAbs.isFutureFavorite(symbol));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleSpec
    @Nullable
    public WritableMap isSpotFavorite(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        NativeMarketTurboModuleAbs nativeMarketTurboModuleAbs = this.impl;
        return nativeMarketTurboModuleAbs.wrapResult(nativeMarketTurboModuleAbs.isSpotFavorite(symbol));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
