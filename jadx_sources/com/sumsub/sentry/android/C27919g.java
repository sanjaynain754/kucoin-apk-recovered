package com.sumsub.sentry.android;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sentry.android.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C27919g {

    /* JADX INFO: renamed from: g */
    public static final Charset f57033g = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final Context f57034a;

    /* JADX INFO: renamed from: b */
    public final C27913a f57035b;

    /* JADX INFO: renamed from: c */
    public final String[] f57036c;

    /* JADX INFO: renamed from: d */
    public final String[] f57037d;

    /* JADX INFO: renamed from: e */
    public final Runtime f57038e;

    /* JADX INFO: renamed from: f */
    public final Lazy f57039f;

    public C27919g(Context context, C27913a c27913a, String[] strArr, String[] strArr2, Runtime runtime) {
        this.f57034a = context;
        this.f57035b = c27913a;
        this.f57036c = strArr;
        this.f57037d = strArr2;
        this.f57038e = runtime;
        this.f57039f = LazyKt.lazy(new Function0() { // from class: com.sumsub.sentry.android.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27919g.m69000a(this.f57045b);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final C27921i m69000a(C27919g c27919g) {
        boolean z11;
        Process processExec;
        Throwable th2;
        boolean z12;
        c27919g.f57035b.getClass();
        String str = Build.TAGS;
        Process process = null;
        boolean z13 = true;
        boolean z14 = str != null && StringsKt.contains$default((CharSequence) str, (CharSequence) "test-keys", false, 2, (Object) null);
        String[] strArr = c27919g.f57036c;
        int length = strArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                z11 = false;
                break;
            }
            String str2 = strArr[i11];
            try {
                if (new File(str2).exists()) {
                    z11 = true;
                    break;
                }
                i11++;
            } catch (RuntimeException e11) {
                C33272c c33272c = C33272c.f67812a;
                String strM71624a = AbstractC33294e.m71624a(c27919g);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                C33272c.f67814c.mo68956e(strM71624a, String.format("Error when trying to check if root file %s exists.", Arrays.copyOf(new Object[]{str2}, 1)), e11);
            }
        }
        try {
            processExec = c27919g.f57038e.exec(new String[]{"/system/xbin/which", CmcdConfiguration.KEY_STARTUP});
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), f57033g));
                try {
                    z12 = bufferedReader.readLine() != null;
                    CloseableKt.closeFinally(bufferedReader, null);
                    processExec.destroy();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(bufferedReader, th3);
                        throw th4;
                    }
                }
            } catch (IOException unused) {
                process = processExec;
                if (process != null) {
                    processExec = process;
                    processExec.destroy();
                }
                z12 = false;
            } catch (Throwable th5) {
                th2 = th5;
                try {
                    C33272c c33272c2 = C33272c.f67812a;
                    C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(c27919g), "Error when trying to check if SU exists.", th2);
                    if (processExec != null) {
                        processExec.destroy();
                    }
                    z12 = false;
                } catch (Throwable th6) {
                    if (processExec != null) {
                        processExec.destroy();
                    }
                    throw th6;
                }
            }
        } catch (IOException unused2) {
        } catch (Throwable th7) {
            processExec = null;
            th2 = th7;
        }
        PackageManager packageManager = c27919g.f57034a.getPackageManager();
        if (packageManager != null) {
            for (String str3 : c27919g.f57037d) {
                try {
                    packageManager.getPackageInfo(str3, 0);
                } catch (PackageManager.NameNotFoundException unused3) {
                }
            }
            z13 = false;
        } else {
            z13 = false;
        }
        return new C27921i(z14, z11, z12, z13);
    }

    public /* synthetic */ C27919g(Context context, C27913a c27913a, int i11) {
        this(context, (i11 & 2) != 0 ? new C27913a() : c27913a, new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, Runtime.getRuntime());
    }
}
