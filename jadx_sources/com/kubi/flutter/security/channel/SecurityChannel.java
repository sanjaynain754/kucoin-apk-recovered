package com.kubi.flutter.security.channel;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import kotlinx.coroutines.C41686h;
import mg.C42532a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SecurityChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\t\u001a\u0004\u0018\u00010\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR0\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010!j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#¨\u0006&"}, m90084d2 = {"Lcom/kubi/flutter/security/channel/SecurityChannel;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "Lio/flutter/plugin/common/MethodChannel;", "", FirebaseAnalytics.Param.METHOD, "", "arguments", "d", "(Lio/flutter/plugin/common/MethodChannel;Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "", "b", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "c", AppsFlyerProperties.CHANNEL, "handler", "e", "(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", DbParams.KEY_CHANNEL_RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "Lio/flutter/plugin/common/MethodChannel;", "Lcom/kubi/flutter/security/channel/c;", "Lcom/kubi/flutter/security/channel/c;", "methodCodec", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "methodHandlers", "Companion", "component_security_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSecurityChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecurityChannel.kt\ncom/kubi/flutter/security/channel/SecurityChannel\n+ 2 SecurityFlutterIssue.kt\ncom/kubi/flutter/security/exception/SecurityFlutterIssueKt\n*L\n1#1,136:1\n43#2,9:137\n*S KotlinDebug\n*F\n+ 1 SecurityChannel.kt\ncom/kubi/flutter/security/channel/SecurityChannel\n*L\n100#1:137,9\n*E\n"})
public final class SecurityChannel implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public MethodChannel channel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C12742c methodCodec = new C12742c();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, MethodChannel.MethodCallHandler> methodHandlers = new HashMap<>();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m24065a(@NotNull String str, @NotNull String str2, @Nullable Object obj, @NotNull Continuation<Object> continuation) {
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            return m24064d(methodChannel, this.methodCodec.m24080a(new C12741b(str, str2)), obj, continuation);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m24066b(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "flutter/channel_security");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m24067c(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.channel = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m24068e(@NotNull String channel, @Nullable MethodChannel.MethodCallHandler handler) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        if (handler != null) {
            this.methodHandlers.put(channel, handler);
        } else {
            this.methodHandlers.remove(channel);
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            C12742c c12742c = this.methodCodec;
            String method = call.method;
            Intrinsics.checkNotNullExpressionValue(method, "method");
            C12741b c12741bM24081b = c12742c.m24081b(method);
            MethodChannel.MethodCallHandler methodCallHandler = this.methodHandlers.get(c12741bM24081b.getChannel());
            if (methodCallHandler != null) {
                methodCallHandler.onMethodCall(new MethodCall(c12741bM24081b.getName(), call.arguments), result);
            }
        } catch (Throwable th2) {
            result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, th2.getMessage(), th2.getMessage());
            C42532a.m93250b(th2, "SecurityChannel");
        }
    }

    /* JADX INFO: renamed from: d */
    private final Object m24064d(MethodChannel methodChannel, String str, Object obj, Continuation<Object> continuation) {
        return C41686h.m91049g(C42911a.m94121c(), new SecurityChannel$send$2(methodChannel, str, obj, null), continuation);
    }
}
