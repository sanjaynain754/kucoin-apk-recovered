package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33675gh;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: NativeTrackTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\"\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001f\u001a\u00020 H\u0016J&\u0010!\u001a\u0004\u0018\u00010\u00102\u0006\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010%\u001a\u0004\u0018\u00010\u00102\u0006\u0010&\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001c\u0010'\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0016H\u0016J\u001c\u0010(\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0016H\u0016J\u001c\u0010)\u001a\u0004\u0018\u00010\u00102\u0006\u0010\"\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006*"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeTrackTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeTrackTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeTrackTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeTrackTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeTrackTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "afTrack", "Lcom/facebook/react/bridge/WritableMap;", "eventId", ReportDataTable.COLUMN_PARAMS, "kunlunTrack", "eventName", "dimensions", "Lcom/facebook/react/bridge/ReadableMap;", C33675gh.f70007m, "kunlunEventTrack", "category", "code", "", "kunlunBizTrack", "kunlunTechTrack", "setKunlunMonitorApis", "apiList", "Lcom/facebook/react/bridge/ReadableArray;", "kunlunLog", "message", FirebaseAnalytics.Param.LEVEL, "tag", "clsTrack", "content", "fbTrack", "firebaseTrack", "firebaseAddBreadcrumb", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeTrackTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeTrackTurboModule.kt\ncom/kubi/rn/core/turbo/NativeTrackTurboModuleBridge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n1557#2:127\n1628#2,3:128\n*S KotlinDebug\n*F\n+ 1 NativeTrackTurboModule.kt\ncom/kubi/rn/core/turbo/NativeTrackTurboModuleBridge\n*L\n102#1:127\n102#1:128,3\n*E\n"})
public final class NativeTrackTurboModuleBridge extends NativeTrackTurboModuleSpec {

    @NotNull
    private final NativeTrackTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeTrackTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeTrackTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleSpec
    @Nullable
    public WritableMap afTrack(@NotNull String eventId, @Nullable String params) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        NativeTrackTurboModuleAbs nativeTrackTurboModuleAbs = this.impl;
        return nativeTrackTurboModuleAbs.wrapResult(nativeTrackTurboModuleAbs.afTrack(eventId, params));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleSpec
    @Nullable
    public WritableMap clsTrack(@NotNull String content, @Nullable ReadableMap dimensions) {
        Intrinsics.checkNotNullParameter(content, "content");
        NativeTrackTurboModuleAbs nativeTrackTurboModuleAbs = this.impl;
        return nativeTrackTurboModuleAbs.wrapResult(nativeTrackTurboModuleAbs.clsTrack(content, dimensions));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleSpec
    @Nullable
    public WritableMap fbTrack(@NotNull String eventName, @Nullable ReadableMap params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        NativeTrackTurboModuleAbs nativeTrackTurboModuleAbs = this.impl;
        return nativeTrackTurboModuleAbs.wrapResult(nativeTrackTurboModuleAbs.fbTrack(eventName, params));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleSpec
    @Nullable
    public WritableMap firebaseAddBreadcrumb(@NotNull String message, @Nullable String category) {
        Intrinsics.checkNotNullParameter(message, "message");
        NativeTrackTurboModuleAbs nativeTrackTurboModuleAbs = this.impl;
        return nativeTrackTurboModuleAbs.wrapResult(nativeTrackTurboModuleAbs.firebaseAddBreadcrumb(message, category));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleSpec
    @Nullable
    public WritableMap firebaseTrack(@NotNull String eventName, @Nullable ReadableMap params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        NativeTrackTurboModuleAbs nativeTrackTurboModuleAbs = this.impl;
        return nativeTrackTurboModuleAbs.wrapResult(nativeTrackTurboModuleAbs.firebaseTrack(eventName, params));
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeTrackTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Track";
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleSpec
    @Nullable
    public WritableMap kunlunBizTrack(@NotNull String category, double code) {
        Intrinsics.checkNotNullParameter(category, "category");
        NativeTrackTurboModuleAbs nativeTrackTurboModuleAbs = this.impl;
        return nativeTrackTurboModuleAbs.wrapResult(nativeTrackTurboModuleAbs.kunlunBizTrack(category, code));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleSpec
    @Nullable
    public WritableMap kunlunEventTrack(@NotNull String eventName, @NotNull String category, double code) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(category, "category");
        NativeTrackTurboModuleAbs nativeTrackTurboModuleAbs = this.impl;
        return nativeTrackTurboModuleAbs.wrapResult(nativeTrackTurboModuleAbs.kunlunEventTrack(eventName, category, code));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleSpec
    @Nullable
    public WritableMap kunlunLog(@NotNull String message, @Nullable String level, @Nullable String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        NativeTrackTurboModuleAbs nativeTrackTurboModuleAbs = this.impl;
        return nativeTrackTurboModuleAbs.wrapResult(nativeTrackTurboModuleAbs.kunlunLog(message, level, tag));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleSpec
    @Nullable
    public WritableMap kunlunTechTrack(@NotNull String category, double code) {
        Intrinsics.checkNotNullParameter(category, "category");
        NativeTrackTurboModuleAbs nativeTrackTurboModuleAbs = this.impl;
        return nativeTrackTurboModuleAbs.wrapResult(nativeTrackTurboModuleAbs.kunlunTechTrack(category, code));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleSpec
    @Nullable
    public WritableMap kunlunTrack(@NotNull String eventName, @Nullable ReadableMap dimensions, @Nullable ReadableMap metrics) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        NativeTrackTurboModuleAbs nativeTrackTurboModuleAbs = this.impl;
        return nativeTrackTurboModuleAbs.wrapResult(nativeTrackTurboModuleAbs.kunlunTrack(eventName, dimensions, metrics));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleSpec
    @Nullable
    public WritableMap setKunlunMonitorApis(@NotNull ReadableArray apiList) {
        Intrinsics.checkNotNullParameter(apiList, "apiList");
        IntRange intRangeUntil = RangesKt.until(0, apiList.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            String string = apiList.getString(((IntIterator) it).nextInt());
            if (string == null) {
                string = "";
            }
            arrayList.add(string);
        }
        NativeTrackTurboModuleAbs nativeTrackTurboModuleAbs = this.impl;
        return nativeTrackTurboModuleAbs.wrapResult(nativeTrackTurboModuleAbs.setKunlunMonitorApis(arrayList));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
