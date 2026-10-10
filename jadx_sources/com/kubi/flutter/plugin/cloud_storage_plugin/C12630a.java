package com.kubi.flutter.plugin.cloud_storage_plugin;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.otc.entity.OtcAd;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.flutter.plugin.cloud_storage_plugin.a */
/* JADX INFO: compiled from: CloudStoragePlugin.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0005J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0005J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0005R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m90084d2 = {"Lcom/kubi/flutter/plugin/cloud_storage_plugin/a;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "binding", "onDetachedFromEngine", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onAttachedToActivity", "(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", DbParams.KEY_CHANNEL_RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "Lio/flutter/plugin/common/MethodChannel;", "Lio/flutter/plugin/common/MethodChannel;", AppsFlyerProperties.CHANNEL, "Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;", "c", "Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;", "delegate", "d", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "activityPluginBinding", "cloud_storage_plugin_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCloudStoragePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudStoragePlugin.kt\ncom/kubi/flutter/plugin/cloud_storage_plugin/CloudStoragePlugin\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1#2:83\n*E\n"})
public final class C12630a implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public MethodChannel channel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Delegate delegate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public ActivityPluginBinding activityPluginBinding;

    /* JADX INFO: renamed from: a */
    public final void m23886a(ActivityPluginBinding binding) {
        this.activityPluginBinding = binding;
        Delegate delegate = this.delegate;
        if (delegate != null) {
            binding.addActivityResultListener(delegate);
            delegate.m23874d(binding.getActivity());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m23887b() {
        Delegate delegate = this.delegate;
        if (delegate != null) {
            ActivityPluginBinding activityPluginBinding = this.activityPluginBinding;
            if (activityPluginBinding != null) {
                activityPluginBinding.removeActivityResultListener(delegate);
            }
            delegate.m23874d(null);
            this.activityPluginBinding = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(@NotNull ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        m23886a(binding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NotNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.kubi.flutter.plugin/cloud_storage_plugin");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.delegate = new Delegate();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.delegate = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        String str;
        Object objM103844constructorimpl3;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str2 = call.method;
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1685054749) {
                if (iHashCode != 611701321) {
                    if (iHashCode == 1222624725 && str2.equals("getCloudStorageValue")) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            objM103844constructorimpl3 = Result.m103844constructorimpl((String) call.argument("key"));
                        } catch (Throwable th2) {
                            Result.Companion companion2 = Result.INSTANCE;
                            objM103844constructorimpl3 = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                        }
                        if (Result.m103850isFailureimpl(objM103844constructorimpl3)) {
                            objM103844constructorimpl3 = null;
                        }
                        String str3 = (String) objM103844constructorimpl3;
                        str = str3 != null ? str3 : "";
                        if (str.length() == 0) {
                            result.error(OtcAd.KYC_NOT_PASS, "getCloudStorageValue: key is empty.", null);
                            return;
                        }
                        Delegate delegate = this.delegate;
                        if (delegate != null) {
                            delegate.m23873c(str, result);
                            return;
                        }
                        return;
                    }
                } else if (str2.equals("setCloudStorageValue")) {
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        objM103844constructorimpl = Result.m103844constructorimpl((String) call.argument("key"));
                    } catch (Throwable th3) {
                        Result.Companion companion4 = Result.INSTANCE;
                        objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
                    }
                    if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                        objM103844constructorimpl = null;
                    }
                    String str4 = (String) objM103844constructorimpl;
                    if (str4 == null) {
                        str4 = "";
                    }
                    try {
                        objM103844constructorimpl2 = Result.m103844constructorimpl((String) call.argument("value"));
                    } catch (Throwable th4) {
                        Result.Companion companion5 = Result.INSTANCE;
                        objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th4));
                    }
                    if (Result.m103850isFailureimpl(objM103844constructorimpl2)) {
                        objM103844constructorimpl2 = null;
                    }
                    String str5 = (String) objM103844constructorimpl2;
                    str = str5 != null ? str5 : "";
                    if (str4.length() == 0) {
                        result.error(OtcAd.KYC_NOT_PASS, "setCloudStorageValue: key is empty.", null);
                        return;
                    }
                    Delegate delegate2 = this.delegate;
                    if (delegate2 != null) {
                        delegate2.m23875e(str4, str, result);
                        return;
                    }
                    return;
                }
            } else if (str2.equals("cloudStorageAvailable")) {
                Delegate delegate3 = this.delegate;
                if (delegate3 != null) {
                    delegate3.m23872b(result);
                    return;
                }
                return;
            }
        }
        result.notImplemented();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(@NotNull ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        m23886a(binding);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        m23887b();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        m23887b();
    }
}
