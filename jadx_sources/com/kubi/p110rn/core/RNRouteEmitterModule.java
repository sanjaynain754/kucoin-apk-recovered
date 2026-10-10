package com.kubi.p110rn.core;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.kubi.p110rn.RNConstantKt;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: RNRouteEmitterModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u0007H\u0016J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/rn/core/RNRouteEmitterModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getName", "emitEvent", "", "eventName", ReportDataTable.COLUMN_PARAMS, "Lcom/facebook/react/bridge/ReadableMap;", "emitOpenRoute", "route", "testEmit", "data", "getCurrentInstanceInfo", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RNRouteEmitterModule extends ReactContextBaseJavaModule {

    @NotNull
    public static final String EVENT_OPEN_ROUTE = "RN_OPEN_ROUTE";

    @NotNull
    private final String TAG;

    @NotNull
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNRouteEmitterModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.TAG = "RNRouteEmitterModule";
    }

    public static /* synthetic */ void emitEvent$default(RNRouteEmitterModule rNRouteEmitterModule, String str, ReadableMap readableMap, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            readableMap = null;
        }
        rNRouteEmitterModule.emitEvent(str, readableMap);
    }

    public static /* synthetic */ void emitOpenRoute$default(RNRouteEmitterModule rNRouteEmitterModule, String str, ReadableMap readableMap, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            readableMap = null;
        }
        rNRouteEmitterModule.emitOpenRoute(str, readableMap);
    }

    public final void emitEvent(@NotNull String eventName, @Nullable ReadableMap params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        boolean zHasActiveReactInstance = this.reactContext.hasActiveReactInstance();
        C44128b.m97266j(this.TAG, "emitEvent: eventName=" + eventName + ", hasActiveInstance=" + zHasActiveReactInstance);
        if (!zHasActiveReactInstance) {
            C44128b.m97270n(this.TAG, "emitEvent failed: reactContext has no active instance");
            return;
        }
        if (params == null) {
            params = Arguments.createMap();
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(eventName, params);
    }

    public final void emitOpenRoute(@NotNull String route, @Nullable ReadableMap params) {
        Intrinsics.checkNotNullParameter(route, "route");
        C44128b.m97266j(this.TAG, "emitOpenRoute: route=" + route);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("route", route);
        if (params != null) {
            writableMapCreateMap.putMap(ReportDataTable.COLUMN_PARAMS, params);
        } else {
            writableMapCreateMap.putMap(ReportDataTable.COLUMN_PARAMS, Arguments.createMap());
        }
        emitEvent(EVENT_OPEN_ROUTE, writableMapCreateMap);
    }

    @ReactMethod
    public final void getCurrentInstanceInfo(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        C44128b.m97266j(this.TAG, "getCurrentInstanceInfo called from JS");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("hasActiveInstance", this.reactContext.hasActiveReactInstance());
        writableMapCreateMap.putString(RNConstantKt.PARAM_MODULE_NAME, getName());
        promise.resolve(writableMapCreateMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RNRouteEmitter";
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @ReactMethod
    public final void testEmit(@NotNull String eventName, @Nullable ReadableMap data) {
        HashMap<String, Object> hashMap;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        C44128b.m97266j(this.TAG, "testEmit called from JS: eventName=" + eventName);
        emitEvent(eventName, (data == null || (hashMap = data.toHashMap()) == null) ? null : Arguments.makeNativeMap(hashMap));
    }
}
