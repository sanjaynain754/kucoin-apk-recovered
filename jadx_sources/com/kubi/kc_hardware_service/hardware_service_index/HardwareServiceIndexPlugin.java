package com.kubi.kc_hardware_service.hardware_service_index;

import android.content.Context;
import android.os.Vibrator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.messaging.Constants;
import com.kubi.kc_hardware_service.hardware_service_index.HardwareServiceIndexPlugin;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p563qk.C43768a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HardwareServiceIndexPlugin.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001)B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ+\u0010!\u001a\u00020\u00072\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00070\u001e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010'¨\u0006*"}, m90084d2 = {"Lcom/kubi/kc_hardware_service/hardware_service_index/HardwareServiceIndexPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "binding", "onDetachedFromEngine", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", DbParams.KEY_CHANNEL_RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "Landroid/content/Context;", "context", "Lio/flutter/plugin/common/BinaryMessenger;", "messenger", "c", "(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V", "", "feedbackConstant", "d", "(ILio/flutter/plugin/common/MethodChannel$Result;)V", TypedValues.TransitionType.S_DURATION, "f", "Lkotlin/Function1;", "Landroid/os/Vibrator;", TUIConstants.TIMPush.NOTIFICATION.ACTION, CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlin/jvm/functions/Function1;Lio/flutter/plugin/common/MethodChannel$Result;)V", "Lio/flutter/plugin/common/MethodChannel;", "b", "Lio/flutter/plugin/common/MethodChannel;", AppsFlyerProperties.CHANNEL, "Landroid/os/Vibrator;", "vibrator", "Companion", "hardware_service_index_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class HardwareServiceIndexPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public MethodChannel channel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Vibrator vibrator;

    /* JADX INFO: compiled from: HardwareServiceIndexPlugin.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kc_hardware_service/hardware_service_index/HardwareServiceIndexPlugin$Companion;", "", "<init>", "()V", "registerWith", "", "engine", "Lio/flutter/embedding/engine/FlutterEngine;", "hardware_service_index_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        public final void registerWith(@NotNull FlutterEngine engine) {
            Intrinsics.checkNotNullParameter(engine, "engine");
            engine.getPlugins().add(new HardwareServiceIndexPlugin());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m31870h(Function1<? super Vibrator, Unit> action, MethodChannel.Result result) {
        try {
            Vibrator vibrator = this.vibrator;
            if (vibrator == null) {
                result.error("UNAVAILABLE", "Vibrator service not available", null);
                return;
            }
            if (vibrator.hasVibrator()) {
                action.invoke(vibrator);
            }
            result.success(null);
        } catch (Exception e11) {
            result.error("VIBRATE_ERROR", "Failed to perform vibration: " + e11.getMessage(), null);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m31865e(int i11, Vibrator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.vibrate(i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m31866g(int i11, Vibrator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.vibrate(i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m31867c(Context context, BinaryMessenger messenger) {
        Object systemService = context.getSystemService("vibrator");
        this.vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        MethodChannel methodChannel = new MethodChannel(messenger, "kcHardwareService");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    /* JADX INFO: renamed from: d */
    public final void m31868d(final int feedbackConstant, MethodChannel.Result result) {
        m31870h(new Function1() { // from class: qk.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HardwareServiceIndexPlugin.m31865e(feedbackConstant, (Vibrator) obj);
            }
        }, result);
    }

    /* JADX INFO: renamed from: f */
    public final void m31869f(final int duration, MethodChannel.Result result) {
        m31870h(new Function1() { // from class: qk.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HardwareServiceIndexPlugin.m31866g(duration, (Vibrator) obj);
            }
        }, result);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NotNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        m31867c(applicationContext, binaryMessenger);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AppsFlyerProperties.CHANNEL);
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@NotNull MethodCall call, @NotNull MethodChannel.Result result) throws JSONException {
        ClipboardContentFormat clipboardContentFormatFromValue;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        Object obj = call.arguments;
        String str = call.method;
        if (str != null) {
            boolean z11 = false;
            z11 = false;
            switch (str.hashCode()) {
                case -810769316:
                    if (str.equals("kcClipboard.setData")) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                        String string = ((JSONObject) obj).getString("text");
                        C43768a c43768a = C43768a.f96779a;
                        Intrinsics.checkNotNull(string);
                        c43768a.m96435c(string);
                        result.success(null);
                        return;
                    }
                    break;
                case -314771757:
                    if (str.equals("hasVibrator")) {
                        Vibrator vibrator = this.vibrator;
                        if (vibrator != null && vibrator.hasVibrator()) {
                            z11 = true;
                        }
                        result.success(Boolean.valueOf(z11));
                        return;
                    }
                    break;
                case 451310959:
                    if (str.equals("vibrate")) {
                        Vibrator vibrator2 = this.vibrator;
                        if (vibrator2 == null) {
                            result.error("UNAVAILABLE", "Vibrator service not available", null);
                            return;
                        }
                        if (vibrator2.hasVibrator()) {
                            Integer num = (Integer) call.argument(TypedValues.TransitionType.S_DURATION);
                            vibrator2.vibrate(num != null ? num.intValue() : 0);
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case 823516079:
                    if (str.equals("vibrateWithType")) {
                        Object obj2 = call.arguments;
                        Map map = obj2 instanceof Map ? (Map) obj2 : null;
                        Object obj3 = map != null ? map.get("type") : null;
                        String str2 = obj3 instanceof String ? (String) obj3 : null;
                        if (str2 == null) {
                            result.error("INVALID_ARGUMENTS", "Type argument is required and must be a String", null);
                            return;
                        }
                        switch (str2.hashCode()) {
                            case -1867169789:
                                if (str2.equals("success")) {
                                    m31869f(50, result);
                                    return;
                                }
                                break;
                            case -1715965556:
                                if (str2.equals("selection")) {
                                    m31868d(3, result);
                                    return;
                                }
                                break;
                            case -1184809658:
                                if (str2.equals("impact")) {
                                    m31868d(1, result);
                                    return;
                                }
                                break;
                            case -1078030475:
                                if (str2.equals("medium")) {
                                    m31869f(40, result);
                                    return;
                                }
                                break;
                            case 96784904:
                                if (str2.equals(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                                    m31869f(500, result);
                                    return;
                                }
                                break;
                            case 99152071:
                                if (str2.equals("heavy")) {
                                    m31869f(100, result);
                                    return;
                                }
                                break;
                            case 102970646:
                                if (str2.equals("light")) {
                                    m31869f(10, result);
                                    return;
                                }
                                break;
                            case 1124446108:
                                if (str2.equals("warning")) {
                                    m31869f(250, result);
                                    return;
                                }
                                break;
                        }
                        result.error("TYPE_NOT_IMPLEMENTED", "Type " + str2 + " is not implemented in HardwareServicePlugin", null);
                        return;
                    }
                    break;
                case 1296208728:
                    if (str.equals("kcClipboard.hasStrings")) {
                        result.success(Boolean.valueOf(C43768a.f96779a.m96433a()));
                        return;
                    }
                    break;
                case 1424088400:
                    if (str.equals("kcClipboard.getData")) {
                        String str3 = (String) obj;
                        if (str3 != null) {
                            try {
                                clipboardContentFormatFromValue = ClipboardContentFormat.INSTANCE.fromValue(str3);
                            } catch (NoSuchFieldException unused) {
                                result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "No such clipboard content format: " + str3, null);
                                clipboardContentFormatFromValue = null;
                            }
                        } else {
                            clipboardContentFormatFromValue = null;
                        }
                        CharSequence charSequenceM96434b = C43768a.f96779a.m96434b(clipboardContentFormatFromValue);
                        if (charSequenceM96434b != null) {
                            result.success(charSequenceM96434b);
                            return;
                        } else {
                            result.success(null);
                            return;
                        }
                    }
                    break;
            }
        }
        result.error("METHOD_NOT_IMPLEMENTED", "Method " + call.method + " is not implemented in HardwareServicePlugin", null);
    }
}
