package com.kubi.advert.jsapi;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.auto.service.AutoService;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.advert.jsapi.KCTurboTrackModuleImpl;
import com.kubi.p110rn.core.biz.KCTurboFileModuleImpl;
import com.kubi.p110rn.core.turbo.NativeTrackTurboModuleAbs;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.util.C24267r0;
import com.tencent.bugly.proguard.C33675gh;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import d00.InterfaceC36567d0;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p624sq.C44536b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: KCTurboTrackModuleImpl.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J!\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\rJ+\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0013J'\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016¢\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016¢\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016¢\u0006\u0002\u0010\u001aJ+\u0010\u001c\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010 J!\u0010!\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\"J!\u0010#\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\"J!\u0010$\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001d\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\rJ\u001d\u0010%\u001a\u0004\u0018\u00010\t2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0'H\u0016¢\u0006\u0002\u0010(J!\u0010)\u001a\u0004\u0018\u00010\t2\u0006\u0010*\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\"¨\u0006+"}, m90084d2 = {"Lcom/kubi/advert/jsapi/KCTurboTrackModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeTrackTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "bridge", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTrackModule;", "afTrack", "", "eventId", "", ReportDataTable.COLUMN_PARAMS, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;", "kunlunTrack", "eventName", "dimensions", "Lcom/facebook/react/bridge/ReadableMap;", C33675gh.f70007m, "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/Boolean;", "kunlunEventTrack", "category", "code", "", "(Ljava/lang/String;Ljava/lang/String;D)Ljava/lang/Boolean;", "kunlunTechTrack", "(Ljava/lang/String;D)Ljava/lang/Boolean;", "kunlunBizTrack", "kunlunLog", "message", FirebaseAnalytics.Param.LEVEL, "tag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;", "fbTrack", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/Boolean;", "firebaseTrack", "firebaseAddBreadcrumb", "setKunlunMonitorApis", "apiList", "", "(Ljava/util/List;)Ljava/lang/Boolean;", "clsTrack", "content", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeTrackTurboModuleAbs.class})
public final class KCTurboTrackModuleImpl extends NativeTrackTurboModuleAbs {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboTrackModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit afTrack$lambda$2(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    private final InterfaceC36567d0 bridge() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36567d0) Router.f46192a.m56192n(InterfaceC36567d0.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36567d0) objM103844constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fbTrack$lambda$14(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit firebaseAddBreadcrumb$lambda$18(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit firebaseTrack$lambda$16(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit kunlunBizTrack$lambda$10(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit kunlunEventTrack$lambda$6(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit kunlunLog$lambda$12(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit kunlunTechTrack$lambda$8(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit kunlunTrack$lambda$4(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setKunlunMonitorApis$lambda$20(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleAbs
    @Nullable
    public Boolean afTrack(@NotNull String eventId, @Nullable String params) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        InterfaceC36567d0 interfaceC36567d0Bridge = bridge();
        if (interfaceC36567d0Bridge == null) {
            return null;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36567d0Bridge.mo81849c(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, eventId, params, new Function2() { // from class: ia.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboTrackModuleImpl.afTrack$lambda$2(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.valueOf(booleanRef.element);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleAbs
    @Nullable
    public Boolean clsTrack(@NotNull String content, @Nullable ReadableMap dimensions) {
        Map<String, Object> mapM58526j;
        Intrinsics.checkNotNullParameter(content, "content");
        if (dimensions != null) {
            try {
                mapM58526j = C24267r0.m58526j(dimensions);
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } else {
            mapM58526j = null;
        }
        if (mapM58526j == null) {
            mapM58526j = MapsKt.emptyMap();
        }
        return Boolean.valueOf(C44536b.m98550d(content, mapM58526j));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleAbs
    @Nullable
    public Boolean fbTrack(@NotNull String eventName, @Nullable ReadableMap params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        InterfaceC36567d0 interfaceC36567d0Bridge = bridge();
        if (interfaceC36567d0Bridge == null) {
            return null;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36567d0Bridge.mo81852f(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, eventName, params != null ? C24267r0.m58526j(params) : null, new Function2() { // from class: ia.j
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboTrackModuleImpl.fbTrack$lambda$14(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.valueOf(booleanRef.element);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleAbs
    @Nullable
    public Boolean firebaseAddBreadcrumb(@NotNull String message, @Nullable String category) {
        Intrinsics.checkNotNullParameter(message, "message");
        InterfaceC36567d0 interfaceC36567d0Bridge = bridge();
        if (interfaceC36567d0Bridge == null) {
            return null;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36567d0Bridge.mo81848b(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, message, category, new Function2() { // from class: ia.d
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboTrackModuleImpl.firebaseAddBreadcrumb$lambda$18(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.valueOf(booleanRef.element);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleAbs
    @Nullable
    public Boolean firebaseTrack(@NotNull String eventName, @Nullable ReadableMap params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        InterfaceC36567d0 interfaceC36567d0Bridge = bridge();
        if (interfaceC36567d0Bridge == null) {
            return null;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36567d0Bridge.mo81854h(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, eventName, params != null ? C24267r0.m58526j(params) : null, new Function2() { // from class: ia.h
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboTrackModuleImpl.firebaseTrack$lambda$16(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.valueOf(booleanRef.element);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleAbs
    @Nullable
    public Boolean kunlunBizTrack(@NotNull String category, double code) {
        Intrinsics.checkNotNullParameter(category, "category");
        InterfaceC36567d0 interfaceC36567d0Bridge = bridge();
        if (interfaceC36567d0Bridge == null) {
            return null;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36567d0Bridge.mo81855i(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, category, (long) code, new Function2() { // from class: ia.k
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboTrackModuleImpl.kunlunBizTrack$lambda$10(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.valueOf(booleanRef.element);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleAbs
    @Nullable
    public Boolean kunlunEventTrack(@NotNull String eventName, @NotNull String category, double code) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(category, "category");
        InterfaceC36567d0 interfaceC36567d0Bridge = bridge();
        if (interfaceC36567d0Bridge == null) {
            return null;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36567d0Bridge.mo81847a(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, eventName, category, (long) code, new Function2() { // from class: ia.f
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboTrackModuleImpl.kunlunEventTrack$lambda$6(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.valueOf(booleanRef.element);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleAbs
    @Nullable
    public Boolean kunlunLog(@NotNull String message, @Nullable String level, @Nullable String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        InterfaceC36567d0 interfaceC36567d0Bridge = bridge();
        if (interfaceC36567d0Bridge == null) {
            return null;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36567d0Bridge.mo81856j(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, message, level, tag, new Function2() { // from class: ia.g
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboTrackModuleImpl.kunlunLog$lambda$12(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.valueOf(booleanRef.element);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleAbs
    @Nullable
    public Boolean kunlunTechTrack(@NotNull String category, double code) {
        Intrinsics.checkNotNullParameter(category, "category");
        InterfaceC36567d0 interfaceC36567d0Bridge = bridge();
        if (interfaceC36567d0Bridge == null) {
            return null;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36567d0Bridge.mo81851e(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, category, (long) code, new Function2() { // from class: ia.i
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboTrackModuleImpl.kunlunTechTrack$lambda$8(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.valueOf(booleanRef.element);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleAbs
    @Nullable
    public Boolean kunlunTrack(@NotNull String eventName, @Nullable ReadableMap dimensions, @Nullable ReadableMap metrics) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        InterfaceC36567d0 interfaceC36567d0Bridge = bridge();
        if (interfaceC36567d0Bridge == null) {
            return null;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36567d0Bridge.mo81850d(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, eventName, dimensions != null ? C24267r0.m58526j(dimensions) : null, metrics != null ? C24267r0.m58526j(metrics) : null, new Function2() { // from class: ia.e
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboTrackModuleImpl.kunlunTrack$lambda$4(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.valueOf(booleanRef.element);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTrackTurboModuleAbs
    @Nullable
    public Boolean setKunlunMonitorApis(@NotNull List<String> apiList) {
        Intrinsics.checkNotNullParameter(apiList, "apiList");
        InterfaceC36567d0 interfaceC36567d0Bridge = bridge();
        if (interfaceC36567d0Bridge == null) {
            return null;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36567d0Bridge.mo81853g(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, apiList, new Function2() { // from class: ia.c
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboTrackModuleImpl.setKunlunMonitorApis$lambda$20(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.valueOf(booleanRef.element);
    }
}
