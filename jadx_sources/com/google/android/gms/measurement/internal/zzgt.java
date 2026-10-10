package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.bugly.proguard.C33820nf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgt extends zzje {
    private char zza;
    private long zzb;

    @GuardedBy("this")
    private String zzc;
    private final zzgr zzd;
    private final zzgr zze;
    private final zzgr zzf;
    private final zzgr zzg;
    private final zzgr zzh;
    private final zzgr zzi;
    private final zzgr zzj;
    private final zzgr zzk;
    private final zzgr zzl;

    @Override // com.google.android.gms.measurement.internal.zzje
    public final boolean zza() {
        return false;
    }

    @VisibleForTesting
    public final String zzn() {
        String str;
        synchronized (this) {
            try {
                if (this.zzc == null) {
                    this.zzc = this.zzu.zzc().zzb();
                }
                Preconditions.checkNotNull(this.zzc);
                str = this.zzc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public static Object zzl(String str) {
        if (str == null) {
            return null;
        }
        return new zzgs(str);
    }

    @VisibleForTesting
    public static String zzp(boolean z11, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z11) {
                return obj.toString();
            }
            Long l11 = (Long) obj;
            if (Math.abs(l11.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l11.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? C33820nf.f71144W : "";
            StringBuilder sb2 = new StringBuilder(str.length() + length + 3 + str.length() + String.valueOf(jRound2).length());
            sb2.append(str);
            sb2.append(jRound);
            sb2.append("...");
            sb2.append(str);
            sb2.append(jRound2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof zzgs) {
                return ((zzgs) obj).zza();
            }
            return z11 ? C33820nf.f71144W : obj.toString();
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z11 ? th2.getClass().getName() : th2.toString());
        String strZzq = zzq(zzib.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzq(className).equals(strZzq)) {
                sb3.append(": ");
                sb3.append(stackTraceElement);
                break;
            }
        }
        return sb3.toString();
    }

    public final zzgr zzb() {
        return this.zzd;
    }

    public final zzgr zzc() {
        return this.zze;
    }

    public final zzgr zzd() {
        return this.zzf;
    }

    public final zzgr zze() {
        return this.zzg;
    }

    public final zzgr zzf() {
        return this.zzh;
    }

    public final zzgr zzh() {
        return this.zzi;
    }

    public final zzgr zzi() {
        return this.zzj;
    }

    public final zzgr zzj() {
        return this.zzk;
    }

    public final zzgr zzk() {
        return this.zzl;
    }

    public final void zzm(int i11, boolean z11, boolean z12, String str, Object obj, Object obj2, Object obj3) {
        if (!z11 && Log.isLoggable(zzn(), i11)) {
            Log.println(i11, zzn(), zzo(false, str, obj, obj2, obj3));
        }
        if (z12 || i11 < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzhy zzhyVarZzi = this.zzu.zzi();
        if (zzhyVarZzi == null) {
            Log.println(6, zzn(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!zzhyVarZzi.zzv()) {
                Log.println(6, zzn(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i11 >= 9) {
                i11 = 8;
            }
            zzhyVarZzi.zzj(new zzgq(this, i11, str, obj, obj2, obj3));
        }
    }

    public final /* synthetic */ char zzr() {
        return this.zza;
    }

    public final /* synthetic */ void zzs(char c11) {
        this.zza = c11;
    }

    public final /* synthetic */ long zzt() {
        return this.zzb;
    }

    public zzgt(zzib zzibVar) {
        super(zzibVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzgr(this, 6, false, false);
        this.zze = new zzgr(this, 6, true, false);
        this.zzf = new zzgr(this, 6, false, true);
        this.zzg = new zzgr(this, 5, false, false);
        this.zzh = new zzgr(this, 5, true, false);
        this.zzi = new zzgr(this, 5, false, true);
        this.zzj = new zzgr(this, 4, false, false);
        this.zzk = new zzgr(this, 3, false, false);
        this.zzl = new zzgr(this, 2, false, false);
    }

    public static String zzo(boolean z11, String str, Object obj, Object obj2, Object obj3) {
        String strZzp = zzp(z11, obj);
        String strZzp2 = zzp(z11, obj2);
        String strZzp3 = zzp(z11, obj3);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strZzp)) {
            sb2.append(str2);
            sb2.append(strZzp);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(strZzp2)) {
            sb2.append(str2);
            sb2.append(strZzp2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(strZzp3)) {
            sb2.append(str3);
            sb2.append(strZzp3);
        }
        return sb2.toString();
    }

    @VisibleForTesting
    public static String zzq(String str) {
        int iLastIndexOf;
        if (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1) {
            return "";
        }
        return str.substring(0, iLastIndexOf);
    }

    public final /* synthetic */ void zzu(long j11) {
        this.zzb = 130000L;
    }
}
