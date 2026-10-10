package com.kubi.p110rn.protocol;

import android.annotation.SuppressLint;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.gson.reflect.TypeToken;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.p110rn.exception.RNException;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager;
import com.kubi.sdk.protocol.p118rn.KRNProtocolManager;
import com.kubi.sdk.util.C24267r0;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KRNProtocolBridge.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J4\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001e\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006 "}, m90084d2 = {"Lcom/kubi/rn/protocol/KRNProtocolBridge;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "getName", "", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "param", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "handleNewInterface", "source", "handleNewInterfaceCallback", "module", FirebaseAnalytics.Param.METHOD, DbParams.KEY_CHANNEL_RESULT, "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/kubi/sdk/protocol/ProtocolException;", "handleOldInterface", "resolveOldInterfaceResult", "handleOldInterfaceError", "parseArguments", "", "arguments", "trackError", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKRNProtocolBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KRNProtocolBridge.kt\ncom/kubi/rn/protocol/KRNProtocolBridge\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n71#2,4:192\n71#2,4:210\n71#2,4:214\n149#3:196\n504#4,7:197\n463#4:204\n413#4:205\n1252#5,4:206\n*S KotlinDebug\n*F\n+ 1 KRNProtocolBridge.kt\ncom/kubi/rn/protocol/KRNProtocolBridge\n*L\n45#1:192,4\n185#1:210,4\n187#1:214,4\n154#1:196\n177#1:197,7\n177#1:204\n177#1:205\n177#1:206,4\n*E\n"})
public final class KRNProtocolBridge extends ReactContextBaseJavaModule {

    @NotNull
    private final ReactApplicationContext reactContext;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleNewInterface$lambda$1(KRNProtocolBridge kRNProtocolBridge, String str, String str2, Promise promise, Object obj, ProtocolException protocolException) {
        kRNProtocolBridge.handleNewInterfaceCallback(str, str2, obj, protocolException, promise);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KRNProtocolBridge(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    private final void handleNewInterface(String source, ReadableMap param, final Promise promise) {
        final String string = param.getString("name");
        final String string2 = param.getString("module");
        if (string != null && string.length() != 0 && string2 != null && string2.length() != 0) {
            KCJSApiProtocolManager.f47500a.m57895c(this.reactContext, source, string2, string, parseArguments(param.getMap("arguments")), new Function2() { // from class: com.kubi.rn.protocol.f
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return KRNProtocolBridge.handleNewInterface$lambda$1(this.f46110b, string2, string, promise, obj, (ProtocolException) obj2);
                }
            });
            return;
        }
        C23985b.f47489a.m57876c("bridge", "unified interface missing required params - module: " + string2 + ", name: " + string, null);
        promise.reject("-9001", "Missing required parameters: module or name");
    }

    private final void handleNewInterfaceCallback(String module, String method, Object result, ProtocolException error, Promise promise) {
        Map mapMapOf;
        if (error == null) {
            mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("code", 0), TuplesKt.m90091to("msg", "success"), TuplesKt.m90091to("success", Boolean.TRUE), TuplesKt.m90091to("data", result));
        } else {
            C23985b.f47489a.m57876c("bridge", "unified interface error - module: " + module + ", name: " + method + ", code: " + error.getCode(), error.getThrowable());
            trackError(error);
            Pair pairM90091to = TuplesKt.m90091to("code", -1);
            String code = error.getCode();
            if (code == null) {
                Throwable throwable = error.getThrowable();
                code = throwable != null ? throwable.getMessage() : null;
                if (code == null) {
                    code = "";
                }
            }
            mapMapOf = MapsKt.mapOf(pairM90091to, TuplesKt.m90091to("msg", code), TuplesKt.m90091to("success", Boolean.FALSE), TuplesKt.m90091to("data", error.getData()));
        }
        promise.resolve(C24267r0.m58522f(mapMapOf));
    }

    private final void handleOldInterface(ReadableMap param, final Promise promise) {
        KRNProtocolManager.f47506a.m57902b(this.reactContext, new HashMap<>(param.toHashMap()), new Function2() { // from class: com.kubi.rn.protocol.g
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KRNProtocolBridge.handleOldInterface$lambda$2(this.f46114b, promise, obj, (ProtocolException) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleOldInterface$lambda$2(KRNProtocolBridge kRNProtocolBridge, Promise promise, Object obj, ProtocolException protocolException) {
        if (obj != null) {
            kRNProtocolBridge.resolveOldInterfaceResult(obj, promise);
        } else if (protocolException != null) {
            kRNProtocolBridge.handleOldInterfaceError(protocolException, promise);
        }
        return Unit.INSTANCE;
    }

    private final void handleOldInterfaceError(ProtocolException error, Promise promise) {
        C23985b.f47489a.m57876c("bridge", "open method has some error code: " + error.getCode(), error.getThrowable());
        promise.reject(C27041f.m66668h(error.getCode()), error.getThrowable());
        trackError(error);
    }

    private final Map<String, Object> parseArguments(ReadableMap arguments) {
        HashMap<String, Object> hashMap;
        if (arguments == null || (hashMap = arguments.toHashMap()) == null) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            Intrinsics.checkNotNull(value);
            linkedHashMap2.put(key, value);
        }
        return linkedHashMap2;
    }

    private final void resolveOldInterfaceResult(Object result, Promise promise) {
        if (result instanceof Boolean) {
            promise.resolve(result);
            return;
        }
        if (result instanceof Integer) {
            promise.resolve(result);
            return;
        }
        if (result instanceof Double) {
            promise.resolve(result);
            return;
        }
        if (result instanceof Float) {
            promise.resolve(result);
            return;
        }
        if (result instanceof String) {
            promise.resolve(result);
            return;
        }
        if (result instanceof Callback) {
            promise.resolve(result);
            return;
        }
        if (result instanceof Map) {
            promise.resolve(C24267r0.m58522f((Map) result));
            return;
        }
        if (result instanceof Object[]) {
            promise.resolve(C24267r0.m58517a((Object[]) result));
            return;
        }
        if (result instanceof List) {
            promise.resolve(C24267r0.m58518b((List) result));
            return;
        }
        if (result instanceof Long) {
            promise.resolve(Double.valueOf(((Number) result).longValue()));
            return;
        }
        try {
            promise.resolve(C24267r0.m58522f((Map) C27099x.m66914d(C27099x.m66919i(result, false, 2, null), new TypeToken<Map<String, ? extends Object>>() { // from class: com.kubi.rn.protocol.KRNProtocolBridge$resolveOldInterfaceResult$$inlined$fromJson$1
            }.getType())));
        } catch (Exception e11) {
            C23985b.f47489a.m57876c("bridge", "open method json serialization error: " + result, e11);
            promise.resolve(result.toString());
        }
    }

    private final void trackError(ProtocolException error) {
        Throwable throwable = error.getThrowable();
        if (throwable == null) {
            throwable = new Exception("code:" + error.getCode());
        }
        C43846g.m96568c(new RNException(throwable, "KNBRNException", false, "code:" + error.getCode()), null, 2, null);
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder.Companion companion = TechnologyEvent.EventParametersBuilder.INSTANCE;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = companion.acquire();
        eventParametersBuilderAcquire.m42391b("code", 1);
        TechnologyEvent.m42388d("KNBRNBridge", eventParametersBuilderAcquire);
        String[] strArr = {"-9001", "-9002", "-9003"};
        String code = error.getCode();
        if (code == null) {
            code = "";
        }
        if (ArraysKt.contains(strArr, code)) {
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire2 = companion.acquire();
            eventParametersBuilderAcquire2.m42391b("code", 2);
            TechnologyEvent.m42388d("KNBRNBridge", eventParametersBuilderAcquire2);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "KRNBridge";
    }

    @NotNull
    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @ReactMethod
    @SuppressLint({"KCCyclomaticComplexityCheck"})
    public final void open(@NotNull ReadableMap param, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(promise, "promise");
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42391b("code", 0);
        TechnologyEvent.m42388d("KNBRNBridge", eventParametersBuilderAcquire);
        String string = param.getString("source");
        if (string == null || string.length() == 0) {
            handleOldInterface(param, promise);
        } else {
            handleNewInterface(string, param, promise);
        }
    }
}
