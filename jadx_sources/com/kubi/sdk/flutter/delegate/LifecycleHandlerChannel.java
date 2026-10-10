package com.kubi.sdk.flutter.delegate;

import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44127a;

/* JADX INFO: compiled from: LifecycleHandlerChannel.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel;", "Lcom/kubi/sdk/flutter/delegate/IChannelRegister;", "<init>", "()V", AppsFlyerProperties.CHANNEL, "Lio/flutter/plugin/common/MethodChannel;", "registerWith", "", "context", "Landroid/content/Context;", "flutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "unregister", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "Companion", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LifecycleHandlerChannel implements IChannelRegister {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f46658b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public MethodChannel f46659a;

    /* JADX INFO: compiled from: LifecycleHandlerChannel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel$Companion;", "", "<init>", "()V", "TAG", "", "LIFECYCLE_CHANNEL_NAME", "NATIVE_APPEAR", "NATIVE_DISAPPEAR", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m56789a() {
        C44127a.m97243c("LifecycleHandlerChannel", "LifecycleHandlerChannel.onHide");
        MethodChannel methodChannel = this.f46659a;
        if (methodChannel != null) {
            methodChannel.invokeMethod("pageDisappear", null);
        }
        if (this.f46659a == null) {
            C44127a.m97245e("LifecycleHandlerChannel", "LifecycleHandlerChannel be called before register!");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m56790b() {
        C44127a.m97243c("LifecycleHandlerChannel", "LifecycleHandlerChannel.onShow");
        MethodChannel methodChannel = this.f46659a;
        if (methodChannel != null) {
            methodChannel.invokeMethod("pageAppear", null);
        }
        if (this.f46659a == null) {
            C44127a.m97245e("LifecycleHandlerChannel", "LifecycleHandlerChannel be called before register!");
        }
    }

    @Override // com.kubi.sdk.flutter.delegate.IChannelRegister
    public void registerWith(@NotNull Context context, @NotNull FlutterEngine flutterEngine) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flutterEngine, "flutterEngine");
        this.f46659a = new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), "com.kc/native_lifecycle", StandardMethodCodec.INSTANCE);
    }

    @Override // com.kubi.sdk.flutter.delegate.IChannelRegister
    public void unregister() {
        MethodChannel methodChannel = this.f46659a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f46659a = null;
    }
}
