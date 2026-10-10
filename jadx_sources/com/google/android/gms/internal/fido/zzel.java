package com.google.android.gms.internal.fido;

import android.os.Build;
import dalvik.system.VMStack;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzel extends zzeg {
    private static final boolean zza = zza.zza();
    private static final boolean zzb;
    private static final zzef zzc;

    public static boolean zzt() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new Class[0]);
            return zza.class.getName().equals(zzq());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    final class zza {
        public static boolean zza() {
            return zzel.zzt();
        }
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    public zzef zzh() {
        return zzc;
    }

    static {
        String str = Build.FINGERPRINT;
        boolean z11 = true;
        if (str != null && !"robolectric".equals(str)) {
            z11 = false;
        }
        zzb = z11;
        zzc = new zzef() { // from class: com.google.android.gms.internal.fido.zzel.1
            @Override // com.google.android.gms.internal.fido.zzef
            public zzdj zza(Class<?> cls, int i11) {
                return zzdj.zza;
            }

            @Override // com.google.android.gms.internal.fido.zzef
            public String zzb(Class cls) {
                StackTraceElement stackTraceElementZza;
                if (zzel.zza) {
                    try {
                        if (cls.equals(zzel.zzp())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (zzel.zzb && (stackTraceElementZza = zzfj.zza(cls, 1)) != null) {
                    return stackTraceElementZza.getClassName();
                }
                return null;
            }
        };
    }

    public static Class<?> zzp() {
        return VMStack.getStackClass2();
    }

    public static String zzq() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    public zzdp zze(String str) {
        return zzeo.zzb(str);
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    public zzev zzj() {
        return zzep.zzb();
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    public String zzm() {
        return "platform: Android";
    }
}
