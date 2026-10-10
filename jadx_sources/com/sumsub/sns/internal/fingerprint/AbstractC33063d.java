package com.sumsub.sns.internal.fingerprint;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.hardware.SensorManager;
import android.hardware.input.InputManager;
import android.media.MediaCodecList;
import android.media.RingtoneManager;
import android.os.Environment;
import android.os.StatFs;
import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.C33177u;
import com.sumsub.sns.internal.fingerprint.infoproviders.C33204a;
import com.sumsub.sns.internal.fingerprint.infoproviders.C33208c;
import com.sumsub.sns.internal.fingerprint.infoproviders.C33210d;
import com.sumsub.sns.internal.fingerprint.infoproviders.C33212e;
import com.sumsub.sns.internal.fingerprint.infoproviders.C33214f;
import com.sumsub.sns.internal.fingerprint.infoproviders.C33216g;
import com.sumsub.sns.internal.fingerprint.infoproviders.C33218h;
import com.sumsub.sns.internal.fingerprint.infoproviders.C33222j;
import com.sumsub.sns.internal.fingerprint.infoproviders.C33226l;
import com.sumsub.sns.internal.fingerprint.infoproviders.C33228m;
import com.sumsub.sns.internal.fingerprint.infoproviders.C33232o;
import com.sumsub.sns.internal.fingerprint.infoproviders.C33234p;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.AbstractC33266c;
import java.io.File;
import p852kotlin.Result;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33063d {
    /* JADX INFO: renamed from: a */
    public static C33214f m71440a(final Context context) {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC33063d.m71445d(context);
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = null;
        }
        RingtoneManager ringtoneManager = (RingtoneManager) objM71616a;
        Object objM71616a2 = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC33063d.m71441b(context);
            }
        });
        if (Result.m103850isFailureimpl(objM71616a2)) {
            objM71616a2 = null;
        }
        AssetManager assetManager = (AssetManager) objM71616a2;
        Object objM71616a3 = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC33063d.m71443c(context);
            }
        });
        return new C33214f(ringtoneManager, assetManager, (Configuration) (Result.m103850isFailureimpl(objM71616a3) ? null : objM71616a3));
    }

    /* JADX INFO: renamed from: b */
    public static final AssetManager m71441b(Context context) {
        return context.getAssets();
    }

    /* JADX INFO: renamed from: c */
    public static final StatFs m71444c() {
        return new StatFs(Environment.getRootDirectory().getAbsolutePath());
    }

    /* JADX INFO: renamed from: p */
    public static final StatFs m71457p(Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        if (!externalFilesDir.canRead()) {
            externalFilesDir = null;
        }
        if (externalFilesDir != null) {
            return new StatFs(externalFilesDir.getAbsolutePath());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final MediaCodecList m71442b() {
        return new MediaCodecList(1);
    }

    /* JADX INFO: renamed from: c */
    public static final Configuration m71443c(Context context) {
        return context.getResources().getConfiguration();
    }

    /* JADX INFO: renamed from: d */
    public static final RingtoneManager m71445d(Context context) {
        return new RingtoneManager(context);
    }

    /* JADX INFO: renamed from: e */
    public static C33216g m71446e(final Context context) {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC33063d.m71447f(context);
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = null;
        }
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) objM71616a;
        Object objM71616a2 = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC33063d.m71448g(context);
            }
        });
        return new C33216g(devicePolicyManager, (KeyguardManager) (Result.m103850isFailureimpl(objM71616a2) ? null : objM71616a2));
    }

    /* JADX INFO: renamed from: f */
    public static final DevicePolicyManager m71447f(Context context) {
        return (DevicePolicyManager) context.getSystemService("device_policy");
    }

    /* JADX INFO: renamed from: g */
    public static final KeyguardManager m71448g(Context context) {
        return (KeyguardManager) context.getSystemService("keyguard");
    }

    /* JADX INFO: renamed from: h */
    public static C33062c m71449h(final Context context) {
        return new C33062c(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC33063d.m71450i(context);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static final C33064e m71450i(Context context) {
        return new C33064e(new C33177u(new C33212e(), m71455n(context), m71458q(context), m71453l(context), new C33204a(context), new C33208c(), m71451j(context), new C33228m(), m71439a(), m71446e(context), m71460s(context), m71440a(context)));
    }

    /* JADX INFO: renamed from: j */
    public static C33218h m71451j(final Context context) {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC33063d.m71452k(context);
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = null;
        }
        return new C33218h((ActivityManager) objM71616a);
    }

    /* JADX INFO: renamed from: k */
    public static final ActivityManager m71452k(Context context) {
        return (ActivityManager) context.getSystemService("activity");
    }

    /* JADX INFO: renamed from: l */
    public static C33222j m71453l(final Context context) {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC33063d.m71454m(context);
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = null;
        }
        return new C33222j((InputManager) objM71616a);
    }

    /* JADX INFO: renamed from: m */
    public static final InputManager m71454m(Context context) {
        return (InputManager) context.getSystemService("input");
    }

    /* JADX INFO: renamed from: n */
    public static C33226l m71455n(final Context context) {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC33063d.m71456o(context);
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = null;
        }
        ActivityManager activityManager = (ActivityManager) objM71616a;
        Object objM71616a2 = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC33063d.m71444c();
            }
        });
        if (Result.m103850isFailureimpl(objM71616a2)) {
            objM71616a2 = null;
        }
        StatFs statFs = (StatFs) objM71616a2;
        Object objM71616a3 = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC33063d.m71457p(context);
            }
        });
        return new C33226l(activityManager, statFs);
    }

    /* JADX INFO: renamed from: o */
    public static final ActivityManager m71456o(Context context) {
        return (ActivityManager) context.getSystemService("activity");
    }

    /* JADX INFO: renamed from: q */
    public static C33232o m71458q(final Context context) {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC33063d.m71459r(context);
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = null;
        }
        return new C33232o((SensorManager) objM71616a);
    }

    /* JADX INFO: renamed from: s */
    public static C33234p m71460s(final Context context) {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC33063d.m71461t(context);
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = null;
        }
        return new C33234p((ContentResolver) objM71616a);
    }

    /* JADX INFO: renamed from: r */
    public static final SensorManager m71459r(Context context) {
        return (SensorManager) context.getSystemService("sensor");
    }

    /* JADX INFO: renamed from: t */
    public static final ContentResolver m71461t(Context context) {
        return context.getContentResolver();
    }

    /* JADX INFO: renamed from: a */
    public static C33210d m71439a() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC33063d.m71442b();
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = null;
        }
        return new C33210d((MediaCodecList) objM71616a);
    }
}
