package dev.fluttercommunity.plus.share;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import te0.C44935a;
import te0.C44938d;

/* JADX INFO: compiled from: SharePlusPlugin.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m90084d2 = {"Ldev/fluttercommunity/plus/share/SharePlusPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onAttachedToActivity", "(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "onDetachedFromActivity", "onReattachedToActivityForConfigChanges", "onDetachedFromActivityForConfigChanges", "Lte0/d;", "b", "Lte0/d;", FirebaseAnalytics.Event.SHARE, "Ldev/fluttercommunity/plus/share/ShareSuccessManager;", "c", "Ldev/fluttercommunity/plus/share/ShareSuccessManager;", "manager", "Lio/flutter/plugin/common/MethodChannel;", "d", "Lio/flutter/plugin/common/MethodChannel;", "methodChannel", "e", "Companion", "share_plus_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SharePlusPlugin implements FlutterPlugin, ActivityAware {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public C44938d share;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ShareSuccessManager manager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public MethodChannel methodChannel;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(@NotNull ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        ShareSuccessManager shareSuccessManager = this.manager;
        C44938d c44938d = null;
        if (shareSuccessManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            shareSuccessManager = null;
        }
        binding.addActivityResultListener(shareSuccessManager);
        C44938d c44938d2 = this.share;
        if (c44938d2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Event.SHARE);
        } else {
            c44938d = c44938d2;
        }
        c44938d.m99381o(binding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.methodChannel = new MethodChannel(binding.getBinaryMessenger(), "dev.fluttercommunity.plus/share");
        Context applicationContext = binding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.manager = new ShareSuccessManager(applicationContext);
        Context applicationContext2 = binding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        ShareSuccessManager shareSuccessManager = this.manager;
        MethodChannel methodChannel = null;
        if (shareSuccessManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            shareSuccessManager = null;
        }
        C44938d c44938d = new C44938d(applicationContext2, null, shareSuccessManager);
        this.share = c44938d;
        ShareSuccessManager shareSuccessManager2 = this.manager;
        if (shareSuccessManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            shareSuccessManager2 = null;
        }
        C44935a c44935a = new C44935a(c44938d, shareSuccessManager2);
        MethodChannel methodChannel2 = this.methodChannel;
        if (methodChannel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("methodChannel");
        } else {
            methodChannel = methodChannel2;
        }
        methodChannel.setMethodCallHandler(c44935a);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        C44938d c44938d = this.share;
        if (c44938d == null) {
            Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Event.SHARE);
            c44938d = null;
        }
        c44938d.m99381o(null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.methodChannel;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(@NotNull ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        onAttachedToActivity(binding);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }
}
