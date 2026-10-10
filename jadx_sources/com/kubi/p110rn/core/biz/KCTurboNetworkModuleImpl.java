package com.kubi.p110rn.core.biz;

import android.content.Context;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.auto.service.AutoService;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.core.turbo.NativeNetworkTurboModuleAbs;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.util.C24267r0;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import d00.InterfaceC36579n;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: KCTurboNetworkModuleImpl.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002JB\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t0\u0011H\u0016J6\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t0\u0011H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016JB\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t0\u0011H\u0016JB\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t0\u0011H\u0016J*\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J.\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u001a2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0002J\u0012\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"H\u0002¨\u0006$"}, m90084d2 = {"Lcom/kubi/rn/core/biz/KCTurboNetworkModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeNetworkTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "bridge", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiNetworkModule;", "request", "", "url", "", FirebaseAnalytics.Param.METHOD, "data", "Lcom/facebook/react/bridge/ReadableMap;", "headers", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "httpRequest", "config", "getClientNetworkConfig", "uploadFile", "file", ReportDataTable.COLUMN_PARAMS, "uploadFileV2", "safeUploadFileLog", "", "", "safeUploadV2UrlLog", "safeUploadV2ConfigLog", "logValue", "value", "throwableLog", "throwable", "", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeNetworkTurboModuleAbs.class})
public final class KCTurboNetworkModuleImpl extends NativeNetworkTurboModuleAbs {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int MAX_LOG_LENGTH = 2000;

    @Deprecated
    @NotNull
    public static final String TAG = "KCTurboNetworkModule";

    /* JADX INFO: compiled from: KCTurboNetworkModuleImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/rn/core/biz/KCTurboNetworkModuleImpl$Companion;", "", "<init>", "()V", "TAG", "", "MAX_LOG_LENGTH", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    private final Map<String, Object> safeUploadV2ConfigLog(Map<String, ? extends Object> config) {
        if (config == null) {
            return null;
        }
        Pair pairM90091to = TuplesKt.m90091to("uploadType", config.get("uploadType"));
        Object obj = config.get(ReportDataTable.COLUMN_PARAMS);
        Map map = obj instanceof Map ? (Map) obj : null;
        Pair pairM90091to2 = TuplesKt.m90091to("paramKeys", map != null ? map.keySet() : null);
        Object obj2 = config.get("headers");
        Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
        return MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to("headerKeys", map2 != null ? map2.keySet() : null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboNetworkModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    private final InterfaceC36579n bridge() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36579n) Router.f46192a.m56192n(InterfaceC36579n.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36579n) objM103844constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getClientNetworkConfig$lambda$5(Ref.ObjectRef objectRef, Map map, ProtocolException protocolException) {
        if (protocolException == null) {
            objectRef.element = map;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit httpRequest$lambda$4(Function1 function1, Map map, ProtocolException protocolException) {
        if (protocolException != null) {
            function1.invoke(C24267r0.m58522f(KCTurboNetworkModuleImplKt.makeRequestFailureResponse(protocolException)));
            return Unit.INSTANCE;
        }
        function1.invoke(C24267r0.m58522f(map));
        return Unit.INSTANCE;
    }

    private final String logValue(Object value) {
        String string;
        if (value == null || (string = value.toString()) == null) {
            string = "null";
        }
        if (string.length() <= 2000) {
            return string;
        }
        return StringsKt.take(string, 2000) + "...(len=" + string.length() + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit request$lambda$2(Function1 function1, Map map, ProtocolException protocolException) {
        if (protocolException != null) {
            function1.invoke(C24267r0.m58522f(KCTurboNetworkModuleImplKt.makeRequestFailureResponse(protocolException)));
            return Unit.INSTANCE;
        }
        function1.invoke(C24267r0.m58522f(map));
        return Unit.INSTANCE;
    }

    private final Map<String, Object> safeUploadFileLog(Map<String, ? extends Object> file) {
        String str = "uri";
        if (file.get("uri") == null) {
            str = "data";
            if (file.get("data") == null) {
                str = "missing";
            }
        }
        return MapsKt.mapOf(TuplesKt.m90091to("source", str), TuplesKt.m90091to("name", file.get("name")), TuplesKt.m90091to("type", file.get("type")));
    }

    private final String safeUploadV2UrlLog(String url) {
        return StringsKt.substringBefore$default(StringsKt.substringBefore$default(url, '?', (String) null, 2, (Object) null), '#', (String) null, 2, (Object) null);
    }

    private final String throwableLog(Throwable throwable) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(throwable.getClass().getName());
        sb2.append(": ");
        sb2.append(throwable.getMessage());
        sb2.append(", top=");
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        sb2.append(ArraysKt.firstOrNull(stackTrace));
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadFile$lambda$7(KCTurboNetworkModuleImpl kCTurboNetworkModuleImpl, Function1 function1, Map map, ProtocolException protocolException) {
        C44128b.m97266j(TAG, "uploadFile callback error=" + kCTurboNetworkModuleImpl.logValue(protocolException) + ", result=" + kCTurboNetworkModuleImpl.logValue(map));
        if (protocolException != null) {
            WritableNativeMap writableNativeMapM58522f = C24267r0.m58522f(KCTurboNetworkModuleImplKt.makeUploadFileFailureResponse(protocolException));
            C44128b.m97266j(TAG, "uploadFile callback payload=" + kCTurboNetworkModuleImpl.logValue(writableNativeMapM58522f));
            function1.invoke(writableNativeMapM58522f);
            return Unit.INSTANCE;
        }
        WritableNativeMap writableNativeMapM58522f2 = C24267r0.m58522f(map);
        C44128b.m97266j(TAG, "uploadFile callback payload=" + kCTurboNetworkModuleImpl.logValue(writableNativeMapM58522f2));
        function1.invoke(writableNativeMapM58522f2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadFileV2$lambda$9(KCTurboNetworkModuleImpl kCTurboNetworkModuleImpl, Function1 function1, Map map, ProtocolException protocolException) {
        C44128b.m97266j(TAG, "uploadFileV2 callback error=" + kCTurboNetworkModuleImpl.logValue(protocolException) + ", result=" + kCTurboNetworkModuleImpl.logValue(map));
        if (protocolException != null) {
            function1.invoke(C24267r0.m58522f(KCTurboNetworkModuleImplKt.makeUploadFileFailureResponse(protocolException)));
            return Unit.INSTANCE;
        }
        function1.invoke(C24267r0.m58522f(map));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeNetworkTurboModuleAbs
    public void httpRequest(@NotNull String url, @NotNull String method, @NotNull ReadableMap config, @NotNull final Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36579n interfaceC36579nBridge = bridge();
        if (interfaceC36579nBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36579nBridge.mo31786e(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, url, method, C24267r0.m58526j(config), new Function2() { // from class: com.kubi.rn.core.biz.m0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboNetworkModuleImpl.httpRequest$lambda$4(callback, (Map) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeNetworkTurboModuleAbs
    public void request(@NotNull String url, @NotNull String method, @Nullable ReadableMap data, @Nullable ReadableMap headers, @NotNull final Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36579n interfaceC36579nBridge = bridge();
        if (interfaceC36579nBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36579nBridge.mo31780b(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, url, method, data != null ? C24267r0.m58526j(data) : null, headers != null ? C24267r0.m58526j(headers) : null, new Function2() { // from class: com.kubi.rn.core.biz.n0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboNetworkModuleImpl.request$lambda$2(callback, (Map) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeNetworkTurboModuleAbs
    public void uploadFile(@NotNull String url, @NotNull ReadableMap file, @Nullable ReadableMap params, @Nullable ReadableMap headers, @NotNull final Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Map<String, ? extends Object> mapM58526j = C24267r0.m58526j(file);
            Map<String, ? extends Object> mapM58526j2 = params != null ? C24267r0.m58526j(params) : null;
            Map<String, ? extends Object> mapM58526j3 = headers != null ? C24267r0.m58526j(headers) : null;
            C44128b.m97266j(TAG, "uploadFile call url=" + url + ", file=" + logValue(mapM58526j) + ", params=" + logValue(mapM58526j2) + ", headers=" + logValue(mapM58526j3));
            InterfaceC36579n interfaceC36579nBridge = bridge();
            if (interfaceC36579nBridge != null) {
                Context reactApplicationContext = getReactApplicationContext();
                Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
                interfaceC36579nBridge.mo31784d(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, url, mapM58526j, mapM58526j2, mapM58526j3, new Function2() { // from class: com.kubi.rn.core.biz.o0
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return KCTurboNetworkModuleImpl.uploadFile$lambda$7(this.f45615b, callback, (Map) obj, (ProtocolException) obj2);
                    }
                });
                return;
            }
            C44128b.m97266j(TAG, "uploadFile bridge missing");
            Object objM58522f = C24267r0.m58522f(KCTurboNetworkModuleImplKt.makeUploadFileFailureResponse(null));
            C44128b.m97266j(TAG, "uploadFile callback payload=" + logValue(objM58522f));
            callback.invoke(objM58522f);
        } catch (Throwable th2) {
            C44128b.m97266j(TAG, "uploadFile catch throwable=" + logValue(throwableLog(th2)));
            Object objM58522f2 = C24267r0.m58522f(KCTurboNetworkModuleImplKt.makeUploadFileFailureResponse(new ProtocolException("-9002", th2, th2.getMessage(), false, 8, null)));
            C44128b.m97266j(TAG, "uploadFile callback payload=" + logValue(objM58522f2));
            callback.invoke(objM58522f2);
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeNetworkTurboModuleAbs
    public void uploadFileV2(@NotNull String url, @NotNull ReadableMap file, @Nullable String method, @Nullable ReadableMap config, @NotNull final Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Map<String, ? extends Object> mapM58526j = C24267r0.m58526j(file);
            Map<String, ? extends Object> mapM58526j2 = config != null ? C24267r0.m58526j(config) : null;
            C44128b.m97266j(TAG, "uploadFileV2 call url=" + safeUploadV2UrlLog(url) + ", method=" + method + ", file=" + logValue(safeUploadFileLog(mapM58526j)) + ", config=" + logValue(safeUploadV2ConfigLog(mapM58526j2)));
            InterfaceC36579n interfaceC36579nBridge = bridge();
            if (interfaceC36579nBridge == null) {
                C44128b.m97266j(TAG, "uploadFileV2 bridge missing");
                callback.invoke(C24267r0.m58522f(KCTurboNetworkModuleImplKt.makeUploadFileFailureResponse(null)));
            } else {
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
                interfaceC36579nBridge.mo31778a(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, url, mapM58526j, method, mapM58526j2, new Function2() { // from class: com.kubi.rn.core.biz.p0
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return KCTurboNetworkModuleImpl.uploadFileV2$lambda$9(this.f45619b, callback, (Map) obj, (ProtocolException) obj2);
                    }
                });
            }
        } catch (Throwable th2) {
            C44128b.m97266j(TAG, "uploadFileV2 catch throwable=" + logValue(throwableLog(th2)));
            callback.invoke(C24267r0.m58522f(KCTurboNetworkModuleImplKt.makeUploadFileFailureResponse(new ProtocolException("-9002", th2, th2.getMessage(), false, 8, null))));
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeNetworkTurboModuleAbs
    @Nullable
    public ReadableMap getClientNetworkConfig() {
        InterfaceC36579n interfaceC36579nBridge = bridge();
        if (interfaceC36579nBridge == null) {
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36579nBridge.mo31782c(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.rn.core.biz.q0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboNetworkModuleImpl.getClientNetworkConfig$lambda$5(objectRef, (Map) obj, (ProtocolException) obj2);
            }
        });
        return C24267r0.m58522f((Map) objectRef.element);
    }
}
