package com.kubi.sdk.flutter.delegate;

import android.content.Context;
import android.util.Log;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.appsflyer.AppsFlyerProperties;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;
import ro.C44127a;

/* JADX INFO: compiled from: FuturesPositionHandlerChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/flutter/delegate/FuturesPositionHandlerChannel;", "Lcom/kubi/sdk/flutter/delegate/IChannelRegister;", "<init>", "()V", AppsFlyerProperties.CHANNEL, "Lio/flutter/plugin/common/MethodChannel;", "registerWith", "", "context", "Landroid/content/Context;", "flutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "unregister", "onPositionsListUpdate", JPushConstants.Analysis.KEY_JSON, "", "logLong", "tag", "msg", "Companion", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FuturesPositionHandlerChannel implements IChannelRegister {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f46653b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public MethodChannel f46654a;

    /* JADX INFO: compiled from: FuturesPositionHandlerChannel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/flutter/delegate/FuturesPositionHandlerChannel$Companion;", "", "<init>", "()V", "TAG", "", "CHANNEL_NAME", "FUNC_ON_POSITIONS_LIST_UPDATE", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m56776a(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        int length = msg.length();
        int i11 = 0;
        while (i11 < length) {
            int iCoerceAtMost = RangesKt.coerceAtMost(i11 + 3000, length);
            String strSubstring = msg.substring(i11, iCoerceAtMost);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Log.d(tag, strSubstring);
            i11 = iCoerceAtMost;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m56777b(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        MethodChannel methodChannel = this.f46654a;
        if (methodChannel != null) {
            methodChannel.invokeMethod("onPositionsListUpdate", json);
        }
        m56776a("FuturesPositionHandlerChannel", String.valueOf(json));
        if (this.f46654a == null) {
            C44127a.m97245e("FuturesPositionHandlerChannel", "onPositionsListUpdate be called before register!");
        }
    }

    @Override // com.kubi.sdk.flutter.delegate.IChannelRegister
    public void registerWith(@NotNull Context context, @NotNull FlutterEngine flutterEngine) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flutterEngine, "flutterEngine");
        if (this.f46654a == null) {
            this.f46654a = new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), "kc.kline.positions", StandardMethodCodec.INSTANCE);
        }
    }

    @Override // com.kubi.sdk.flutter.delegate.IChannelRegister
    public void unregister() {
        MethodChannel methodChannel = this.f46654a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f46654a = null;
    }
}
