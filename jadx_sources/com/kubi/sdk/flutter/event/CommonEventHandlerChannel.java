package com.kubi.sdk.flutter.event;

import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.sdk.flutter.delegate.IChannelRegister;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44127a;
import ro.C44128b;

/* JADX INFO: compiled from: CommonEventHandlerChannel.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\u001a\u0010\r\u001a\u00020\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fJ\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0010H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/sdk/flutter/event/CommonEventHandlerChannel;", "Lcom/kubi/sdk/flutter/delegate/IChannelRegister;", "<init>", "()V", AppsFlyerProperties.CHANNEL, "Lio/flutter/plugin/common/MethodChannel;", "registerWith", "", "context", "Landroid/content/Context;", "flutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "unregister", "notifyEvent", ReportDataTable.COLUMN_PARAMS, "", "", "", "checkWaring", "name", "Companion", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CommonEventHandlerChannel implements IChannelRegister {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f46691b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public MethodChannel f46692a;

    /* JADX INFO: compiled from: CommonEventHandlerChannel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/flutter/event/CommonEventHandlerChannel$Companion;", "", "<init>", "()V", "TAG", "", "CHANNEL_NAME", "METHOD_NOTIFY_EVENT", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m56822a(String str) {
        if (this.f46692a == null) {
            C44127a.m97245e("CommonEventHandlerChannel", str + " be called before register!");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m56823b(@NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        MethodChannel methodChannel = this.f46692a;
        if (methodChannel != null) {
            methodChannel.invokeMethod("notify_event", params);
        }
        C44128b.m97259c("CommonEventHandlerChannel", "[notifyEvent] hashCode:" + hashCode() + ", params:" + params);
        m56822a("notifyEvent");
    }

    @Override // com.kubi.sdk.flutter.delegate.IChannelRegister
    public void registerWith(@NotNull Context context, @NotNull FlutterEngine flutterEngine) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flutterEngine, "flutterEngine");
        this.f46692a = new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), "kc.basic.event", StandardMethodCodec.INSTANCE);
    }

    @Override // com.kubi.sdk.flutter.delegate.IChannelRegister
    public void unregister() {
        MethodChannel methodChannel = this.f46692a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f46692a = null;
    }
}
