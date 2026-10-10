package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
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

/* JADX INFO: compiled from: NativeUserCenterTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\"\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0010H\u0016J\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u00102\u0006\u0010!\u001a\u00020\u000bH\u0016J\n\u0010\"\u001a\u0004\u0018\u00010\u0010H\u0016J\u0014\u0010#\u001a\u0004\u0018\u00010\u00102\b\u0010$\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010%\u001a\u0004\u0018\u00010\u0010H\u0016J\n\u0010&\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010'\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010(\u001a\u0004\u0018\u00010\u00102\u0006\u0010)\u001a\u00020\u001cH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006*"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeUserCenterTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeUserCenterTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeUserCenterTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeUserCenterTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeUserCenterTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "getUserInfo", "Lcom/facebook/react/bridge/WritableMap;", "persistUserData", "userInfoJson", "removeAccounts", "ids", "Lcom/facebook/react/bridge/ReadableArray;", "logoutAccounts", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "setActiveAccount", "targetid", "extraParams", "Lcom/facebook/react/bridge/ReadableMap;", "getAlternativeAccounts", "gotoCheckLoginPage", "spmId", "getAccountInfoById", "id", "supportDeactivateAccount", "fetchTermId", "termCode", "fetchTermInfo", "getReferralCode", "openChooseResidence", "handleChooseResidenceCallback", ReportDataTable.COLUMN_PARAMS, "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeUserCenterTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeUserCenterTurboModule.kt\ncom/kubi/rn/core/turbo/NativeUserCenterTurboModuleBridge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,251:1\n1557#2:252\n1628#2,3:253\n1557#2:256\n1628#2,3:257\n*S KotlinDebug\n*F\n+ 1 NativeUserCenterTurboModule.kt\ncom/kubi/rn/core/turbo/NativeUserCenterTurboModuleBridge\n*L\n196#1:252\n196#1:253,3\n201#1:256\n201#1:257,3\n*E\n"})
public final class NativeUserCenterTurboModuleBridge extends NativeUserCenterTurboModuleSpec {

    @NotNull
    private final NativeUserCenterTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeUserCenterTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeUserCenterTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logoutAccounts$lambda$2(Promise promise, NativeUserCenterTurboModuleBridge nativeUserCenterTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeUserCenterTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openChooseResidence$lambda$4(Promise promise, NativeUserCenterTurboModuleBridge nativeUserCenterTurboModuleBridge, ReadableMap readableMap) {
        if (promise != null) {
            promise.resolve(nativeUserCenterTurboModuleBridge.impl.wrapResult(readableMap));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setActiveAccount$lambda$3(Promise promise, NativeUserCenterTurboModuleBridge nativeUserCenterTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeUserCenterTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleSpec
    @Nullable
    public WritableMap fetchTermId(@Nullable String termCode) {
        NativeUserCenterTurboModuleAbs nativeUserCenterTurboModuleAbs = this.impl;
        return nativeUserCenterTurboModuleAbs.wrapResult(nativeUserCenterTurboModuleAbs.fetchTermId(termCode));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleSpec
    @Nullable
    public WritableMap fetchTermInfo() {
        NativeUserCenterTurboModuleAbs nativeUserCenterTurboModuleAbs = this.impl;
        return nativeUserCenterTurboModuleAbs.wrapResult(nativeUserCenterTurboModuleAbs.fetchTermInfo());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleSpec
    @Nullable
    public WritableMap getAccountInfoById(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        NativeUserCenterTurboModuleAbs nativeUserCenterTurboModuleAbs = this.impl;
        return nativeUserCenterTurboModuleAbs.wrapResult(nativeUserCenterTurboModuleAbs.getAccountInfoById(id2));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleSpec
    @Nullable
    public WritableMap getAlternativeAccounts() {
        NativeUserCenterTurboModuleAbs nativeUserCenterTurboModuleAbs = this.impl;
        return nativeUserCenterTurboModuleAbs.wrapResult(nativeUserCenterTurboModuleAbs.getAlternativeAccounts());
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeUserCenterTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "UserCenter";
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleSpec
    @Nullable
    public WritableMap getReferralCode() {
        NativeUserCenterTurboModuleAbs nativeUserCenterTurboModuleAbs = this.impl;
        return nativeUserCenterTurboModuleAbs.wrapResult(nativeUserCenterTurboModuleAbs.getReferralCode());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleSpec
    @Nullable
    public WritableMap getUserInfo() {
        NativeUserCenterTurboModuleAbs nativeUserCenterTurboModuleAbs = this.impl;
        return nativeUserCenterTurboModuleAbs.wrapResult(nativeUserCenterTurboModuleAbs.getUserInfo());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleSpec
    @Nullable
    public WritableMap gotoCheckLoginPage(@Nullable String spmId) {
        NativeUserCenterTurboModuleAbs nativeUserCenterTurboModuleAbs = this.impl;
        return nativeUserCenterTurboModuleAbs.wrapResult(nativeUserCenterTurboModuleAbs.gotoCheckLoginPage(spmId));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleSpec
    @Nullable
    public WritableMap handleChooseResidenceCallback(@NotNull ReadableMap params) {
        Intrinsics.checkNotNullParameter(params, "params");
        NativeUserCenterTurboModuleAbs nativeUserCenterTurboModuleAbs = this.impl;
        return nativeUserCenterTurboModuleAbs.wrapResult(nativeUserCenterTurboModuleAbs.handleChooseResidenceCallback(params));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleSpec
    public void logoutAccounts(@NotNull ReadableArray ids, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(promise, "promise");
        IntRange intRangeUntil = RangesKt.until(0, ids.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            String string = ids.getString(((IntIterator) it).nextInt());
            if (string == null) {
                string = "";
            }
            arrayList.add(string);
        }
        this.impl.logoutAccounts(arrayList, new Function1() { // from class: com.kubi.rn.core.turbo.o5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeUserCenterTurboModuleBridge.logoutAccounts$lambda$2(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleSpec
    public void openChooseResidence(@Nullable ReadableMap extraParams, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.openChooseResidence(extraParams, new Function1() { // from class: com.kubi.rn.core.turbo.p5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeUserCenterTurboModuleBridge.openChooseResidence$lambda$4(promise, this, (ReadableMap) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleSpec
    @Nullable
    public WritableMap persistUserData(@NotNull String userInfoJson) {
        Intrinsics.checkNotNullParameter(userInfoJson, "userInfoJson");
        NativeUserCenterTurboModuleAbs nativeUserCenterTurboModuleAbs = this.impl;
        return nativeUserCenterTurboModuleAbs.wrapResult(nativeUserCenterTurboModuleAbs.persistUserData(userInfoJson));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleSpec
    @Nullable
    public WritableMap removeAccounts(@NotNull ReadableArray ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        IntRange intRangeUntil = RangesKt.until(0, ids.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            String string = ids.getString(((IntIterator) it).nextInt());
            if (string == null) {
                string = "";
            }
            arrayList.add(string);
        }
        NativeUserCenterTurboModuleAbs nativeUserCenterTurboModuleAbs = this.impl;
        return nativeUserCenterTurboModuleAbs.wrapResult(nativeUserCenterTurboModuleAbs.removeAccounts(arrayList));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleSpec
    public void setActiveAccount(@NotNull String targetid, @Nullable ReadableMap extraParams, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(targetid, "targetid");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.setActiveAccount(targetid, extraParams, new Function1() { // from class: com.kubi.rn.core.turbo.n5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeUserCenterTurboModuleBridge.setActiveAccount$lambda$3(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleSpec
    @Nullable
    public WritableMap supportDeactivateAccount() {
        NativeUserCenterTurboModuleAbs nativeUserCenterTurboModuleAbs = this.impl;
        return nativeUserCenterTurboModuleAbs.wrapResult(nativeUserCenterTurboModuleAbs.supportDeactivateAccount());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
