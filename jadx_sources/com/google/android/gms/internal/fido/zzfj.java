package com.google.android.gms.internal.fido;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzfj {
    private static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final zzfn zzb;

    static {
        zzfn zzfoVar;
        for (int i11 = 0; i11 < 2; i11++) {
            try {
                zzfoVar = (zzfn) Class.forName(zza[i11]).asSubclass(zzfn.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
                zzfoVar = null;
            }
            if (zzfoVar != null) {
                zzb = zzfoVar;
            }
        }
        zzfoVar = new zzfo();
        zzb = zzfoVar;
    }

    @NullableDecl
    public static StackTraceElement zza(Class cls, int i11) {
        zzfk.zza(cls, "target");
        return zzb.zza(cls, 2);
    }
}
