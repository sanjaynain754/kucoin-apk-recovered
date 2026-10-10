package com.kubi.safe;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.safe.b */
/* JADX INFO: compiled from: BiometricUtils.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ!\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/safe/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "d", "(Landroid/content/Context;)Z", "c", "b", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "api", "e", "(Landroid/content/Context;I)Z", "keychain_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C23646b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C23646b f46336a = new C23646b();

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m56344f(C23646b c23646b, Context context, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = Build.VERSION.SDK_INT;
        }
        return c23646b.m56349e(context, i11);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m56345a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return FingerprintManagerCompat.from(context).isHardwareDetected();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m56346b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m56345a(context);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m56347c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return FingerprintManagerCompat.from(context).hasEnrolledFingerprints() && m56346b(context);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m56348d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService instanceof KeyguardManager ? (KeyguardManager) systemService : null;
        return keyguardManager != null && keyguardManager.isKeyguardSecure();
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: e */
    public final boolean m56349e(@NotNull Context context, int api) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (api < 23 || !m56348d(context)) {
            return false;
        }
        if (api >= 28) {
            return context.checkSelfPermission("android.permission.USE_BIOMETRIC") == 0;
        }
        return context.checkSelfPermission("android.permission.USE_FINGERPRINT") == 0;
    }
}
