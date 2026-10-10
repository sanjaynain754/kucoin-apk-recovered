package com.kubi.flutter.network.channel;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import gg.C37917a;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: NetworkChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001b\u001a\u0004\u0018\u00010\u0010*\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R0\u0010%\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\"j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$¨\u0006'"}, m90084d2 = {"Lcom/kubi/flutter/network/channel/NetworkChannel;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "", "b", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "c", "", AppsFlyerProperties.CHANNEL, "handler", "e", "(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V", FirebaseAnalytics.Param.METHOD, "", "arguments", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", DbParams.KEY_CHANNEL_RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "Lio/flutter/plugin/common/MethodChannel;", "d", "(Lio/flutter/plugin/common/MethodChannel;Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/flutter/plugin/common/MethodChannel;", "networkChannel", "Lcom/kubi/flutter/network/channel/b;", "Lcom/kubi/flutter/network/channel/b;", "argumentsCodec", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "methodHandlers", "Companion", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNetworkChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkChannel.kt\ncom/kubi/flutter/network/channel/NetworkChannel\n+ 2 NetFlutterIssue.kt\ncom/kubi/flutter/network/exception/NetFlutterIssueKt\n*L\n1#1,118:1\n55#2,6:119\n*S KotlinDebug\n*F\n+ 1 NetworkChannel.kt\ncom/kubi/flutter/network/channel/NetworkChannel\n*L\n85#1:119,6\n*E\n"})
public final class NetworkChannel implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public MethodChannel networkChannel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C12604b argumentsCodec = new C12604b();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, MethodChannel.MethodCallHandler> methodHandlers = new HashMap<>();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m23801a(@NotNull String str, @NotNull String str2, @Nullable Object obj, @NotNull Continuation<Object> continuation) {
        C12603a c12603a = new C12603a(str, obj);
        MethodChannel methodChannel = this.networkChannel;
        if (methodChannel != null) {
            return m23804d(methodChannel, str2, this.argumentsCodec.m23808a(c12603a), continuation);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m23802b(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "flutter/channel_network");
        this.networkChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m23803c(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.networkChannel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.networkChannel = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m23805e(@NotNull String channel, @Nullable MethodChannel.MethodCallHandler handler) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        if (this.networkChannel == null) {
            this.methodHandlers.remove(channel);
            return;
        }
        HashMap<String, MethodChannel.MethodCallHandler> map = this.methodHandlers;
        Intrinsics.checkNotNull(handler);
        map.put(channel, handler);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            C12604b c12604b = this.argumentsCodec;
            Object arguments = call.arguments;
            Intrinsics.checkNotNullExpressionValue(arguments, "arguments");
            C12603a c12603aM23809b = c12604b.m23809b(arguments);
            MethodChannel.MethodCallHandler methodCallHandler = this.methodHandlers.get(c12603aM23809b.getChannel());
            if (methodCallHandler != null) {
                methodCallHandler.onMethodCall(new MethodCall(call.method, c12603aM23809b.getArguments()), result);
            }
        } catch (Throwable th2) {
            C44128b.m97261e("NetworkChannel", "onMethodCall:[method = " + call.method + ", error = " + th2.getMessage() + ']');
            result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, th2.getMessage(), th2.getMessage());
            if (C37917a.m85739b(th2)) {
                C44128b.m97263g("NetFlutterIssue", th2);
            } else {
                C37917a.m85740c(th2, "NetworkChannel");
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m23804d(MethodChannel methodChannel, String str, Object obj, Continuation<Object> continuation) {
        return C41686h.m91049g(C42911a.m94121c(), new NetworkChannel$send$2(methodChannel, str, obj, null), continuation);
    }
}
