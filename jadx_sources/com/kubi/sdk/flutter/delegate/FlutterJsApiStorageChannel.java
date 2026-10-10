package com.kubi.sdk.flutter.delegate;

import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.p110rn.Constants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p373jk.C40432e;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FlutterJsApiStorageChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J \u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J \u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J \u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J \u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/sdk/flutter/delegate/FlutterJsApiStorageChannel;", "Lcom/kubi/sdk/flutter/delegate/IChannelRegister;", "<init>", "()V", AppsFlyerProperties.CHANNEL, "Lio/flutter/plugin/common/MethodChannel;", "registerWith", "", "context", "Landroid/content/Context;", "flutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "unregister", "handleMethodCall", "call", "Lio/flutter/plugin/common/MethodCall;", DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "handleGetItem", "handleSetItem", "handleRemoveItem", "Companion", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FlutterJsApiStorageChannel implements IChannelRegister {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f46620b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public MethodChannel f46621a;

    /* JADX INFO: compiled from: FlutterJsApiStorageChannel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/flutter/delegate/FlutterJsApiStorageChannel$Companion;", "", "<init>", "()V", "CHANNEL_NAME", "", "METHOD_GET_MMKV_ROOT_PATH", "METHOD_GET_ITEM", "METHOD_SET_ITEM", "METHOD_REMOVE_ITEM", "ARG_KEY", "ARG_VALUE", "ARG_BIZ", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m56709f(FlutterJsApiStorageChannel flutterJsApiStorageChannel, Context context, MethodCall call, MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        flutterJsApiStorageChannel.m56711c(context, call, result);
    }

    /* JADX INFO: renamed from: b */
    public final void m56710b(Context context, MethodCall methodCall, MethodChannel.Result result) {
        Object obj = methodCall.arguments;
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get("key") : null;
        String str = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map != null ? map.get(Constants.BIZ) : null;
        String str2 = obj3 instanceof String ? (String) obj3 : null;
        if (str == null || StringsKt.isBlank(str)) {
            result.error("invalid_argument", "getItem requires { key, biz? }", null);
            return;
        }
        C40432e c40432e = C40432e.f89748a;
        String strM89075r = c40432e.m89075r(str);
        if (strM89075r != null) {
            result.error("invalid_argument", strM89075r, null);
            return;
        }
        String strM89074q = c40432e.m89074q(str2);
        if (strM89074q != null) {
            result.error("invalid_argument", strM89074q, null);
        } else {
            result.success(c40432e.m89069i(context, str, str2));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public final void m56711c(Context context, MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -892884312:
                    if (str.equals("getMMKVRootPath")) {
                        result.success(C40432e.f89748a.m89071m(context));
                        return;
                    }
                    break;
                case -75439223:
                    if (str.equals("getItem")) {
                        m56710b(context, methodCall, result);
                        return;
                    }
                    break;
                case 1098253751:
                    if (str.equals("removeItem")) {
                        m56712d(context, methodCall, result);
                        return;
                    }
                    break;
                case 1984670357:
                    if (str.equals("setItem")) {
                        m56713e(context, methodCall, result);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }

    /* JADX INFO: renamed from: d */
    public final void m56712d(Context context, MethodCall methodCall, MethodChannel.Result result) {
        Object obj = methodCall.arguments;
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get("key") : null;
        String str = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map != null ? map.get(Constants.BIZ) : null;
        String str2 = obj3 instanceof String ? (String) obj3 : null;
        if (str == null || StringsKt.isBlank(str)) {
            result.error("invalid_argument", "removeItem requires { key, biz? }", null);
            return;
        }
        C40432e c40432e = C40432e.f89748a;
        String strM89075r = c40432e.m89075r(str);
        if (strM89075r != null) {
            result.error("invalid_argument", strM89075r, null);
            return;
        }
        String strM89074q = c40432e.m89074q(str2);
        if (strM89074q != null) {
            result.error("invalid_argument", strM89074q, null);
        } else {
            result.success(Boolean.valueOf(c40432e.m89070k(context, str, str2)));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m56713e(Context context, MethodCall methodCall, MethodChannel.Result result) {
        Object obj = methodCall.arguments;
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get("key") : null;
        String str = obj2 instanceof String ? (String) obj2 : null;
        String str2 = map != null ? map.get("value") : null;
        Object obj3 = map != null ? map.get(Constants.BIZ) : null;
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        if (str == null || StringsKt.isBlank(str) || str2 == null) {
            result.error("invalid_argument", "setItem requires { key, value, biz? }", null);
            return;
        }
        C40432e c40432e = C40432e.f89748a;
        String strM89075r = c40432e.m89075r(str);
        if (strM89075r != null) {
            result.error("invalid_argument", strM89075r, null);
            return;
        }
        String strM89074q = c40432e.m89074q(str3);
        if (strM89074q != null) {
            result.error("invalid_argument", strM89074q, null);
            return;
        }
        if (c40432e.m89072n(context, str, str2 instanceof String ? str2 : str2.toString(), str3)) {
            result.success(Boolean.TRUE);
        } else {
            result.error("set_item_failed", "setItem failed", null);
        }
    }

    @Override // com.kubi.sdk.flutter.delegate.IChannelRegister
    public void registerWith(@NotNull final Context context, @NotNull FlutterEngine flutterEngine) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flutterEngine, "flutterEngine");
        MethodChannel methodChannel = new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), "com.kucoin.jsapi.storage");
        methodChannel.setMethodCallHandler(new MethodChannel.MethodCallHandler() { // from class: com.kubi.sdk.flutter.delegate.m
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                FlutterJsApiStorageChannel.m56709f(this.f46681b, context, methodCall, result);
            }
        });
        this.f46621a = methodChannel;
    }

    @Override // com.kubi.sdk.flutter.delegate.IChannelRegister
    public void unregister() {
        MethodChannel methodChannel = this.f46621a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f46621a = null;
    }
}
