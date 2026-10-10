package dev.fluttercommunity.plus.packageinfo;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import androidx.media3.common.C2711C;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PackageInfoPlugin.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001)B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010\tR\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010'¨\u0006*"}, m90084d2 = {"Ldev/fluttercommunity/plus/packageinfo/PackageInfoPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "<init>", "()V", "", "bytes", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "([B)Ljava/lang/String;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", DbParams.KEY_CHANNEL_RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "c", "()Ljava/lang/String;", "Landroid/content/pm/PackageInfo;", "info", "", "d", "(Landroid/content/pm/PackageInfo;)J", "Landroid/content/pm/PackageManager;", "pm", "b", "(Landroid/content/pm/PackageManager;)Ljava/lang/String;", "sig", "e", "Landroid/content/Context;", "Landroid/content/Context;", "applicationContext", "Lio/flutter/plugin/common/MethodChannel;", "Lio/flutter/plugin/common/MethodChannel;", "methodChannel", "Companion", "package_info_plus_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class PackageInfoPlugin implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Context applicationContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public MethodChannel methodChannel;

    /* JADX INFO: renamed from: b */
    public final String m82043b(PackageManager pm2) {
        try {
            if (Build.VERSION.SDK_INT < 28) {
                Context context = this.applicationContext;
                Intrinsics.checkNotNull(context);
                Signature[] signatures = pm2.getPackageInfo(context.getPackageName(), 64).signatures;
                if (signatures != null && signatures.length != 0) {
                    Intrinsics.checkNotNullExpressionValue(signatures, "signatures");
                    if (ArraysKt.first(signatures) != null) {
                        byte[] byteArray = ((Signature) ArraysKt.first(signatures)).toByteArray();
                        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                        return m82046e(byteArray);
                    }
                }
                return null;
            }
            Context context2 = this.applicationContext;
            Intrinsics.checkNotNull(context2);
            SigningInfo signingInfo = pm2.getPackageInfo(context2.getPackageName(), C2711C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
            if (signingInfo == null) {
                return null;
            }
            if (signingInfo.hasMultipleSigners()) {
                Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                Intrinsics.checkNotNullExpressionValue(apkContentsSigners, "getApkContentsSigners(...)");
                byte[] byteArray2 = ((Signature) ArraysKt.first(apkContentsSigners)).toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray2, "toByteArray(...)");
                return m82046e(byteArray2);
            }
            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            Intrinsics.checkNotNullExpressionValue(signingCertificateHistory, "getSigningCertificateHistory(...)");
            byte[] byteArray3 = ((Signature) ArraysKt.first(signingCertificateHistory)).toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray3, "toByteArray(...)");
            return m82046e(byteArray3);
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private final String m82042a(byte[] bytes) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bytes.length * 2];
        int length = bytes.length;
        for (int i11 = 0; i11 < length; i11++) {
            byte b11 = bytes[i11];
            int i12 = i11 * 2;
            cArr2[i12] = cArr[(b11 & 255) >>> 4];
            cArr2[i12 + 1] = cArr[b11 & 15];
        }
        return new String(cArr2);
    }

    /* JADX INFO: renamed from: c */
    public final String m82044c() {
        Context context = this.applicationContext;
        Intrinsics.checkNotNull(context);
        PackageManager packageManager = context.getPackageManager();
        Context context2 = this.applicationContext;
        Intrinsics.checkNotNull(context2);
        String packageName = context2.getPackageName();
        return Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(packageName).getInitiatingPackageName() : packageManager.getInstallerPackageName(packageName);
    }

    /* JADX INFO: renamed from: d */
    public final long m82045d(PackageInfo info) {
        return Build.VERSION.SDK_INT >= 28 ? info.getLongVersionCode() : info.versionCode;
    }

    /* JADX INFO: renamed from: e */
    public final String m82046e(byte[] sig) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        messageDigest.update(sig);
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNull(bArrDigest);
        return m82042a(bArrDigest);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.applicationContext = binding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "dev.fluttercommunity.plus/package_info");
        this.methodChannel = methodChannel;
        Intrinsics.checkNotNull(methodChannel);
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.applicationContext = null;
        MethodChannel methodChannel = this.methodChannel;
        Intrinsics.checkNotNull(methodChannel);
        methodChannel.setMethodCallHandler(null);
        this.methodChannel = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            if (!Intrinsics.areEqual(call.method, "getAll")) {
                result.notImplemented();
                return;
            }
            Context context = this.applicationContext;
            Intrinsics.checkNotNull(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.applicationContext;
            Intrinsics.checkNotNull(context2);
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            Intrinsics.checkNotNull(packageManager);
            String strM82043b = m82043b(packageManager);
            String strM82044c = m82044c();
            HashMap map = new HashMap();
            map.put("appName", packageInfo.applicationInfo.loadLabel(packageManager).toString());
            Context context3 = this.applicationContext;
            Intrinsics.checkNotNull(context3);
            map.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, context3.getPackageName());
            map.put("version", packageInfo.versionName);
            Intrinsics.checkNotNull(packageInfo);
            map.put("buildNumber", String.valueOf(m82045d(packageInfo)));
            if (strM82043b != null) {
                map.put("buildSignature", strM82043b);
            }
            if (strM82044c != null) {
                map.put("installerStore", strM82044c);
            }
            result.success(map);
        } catch (PackageManager.NameNotFoundException e11) {
            result.error("Name not found", e11.getMessage(), null);
        }
    }
}
