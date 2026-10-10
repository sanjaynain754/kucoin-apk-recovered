package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzet;
import com.google.android.gms.internal.auth.zzev;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzev<MessageType extends zzev<MessageType, BuilderType>, BuilderType extends zzet<MessageType, BuilderType>> extends zzdq<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzha zzc = zzha.zza();

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r1 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzev zzd(zzev zzevVar, byte[] bArr) throws zzfb {
        byte bByteValue;
        zzev zzevVarZzo = zzo(zzevVar, bArr, 0, bArr.length, zzel.zza);
        if (zzevVarZzo != null && (bByteValue = ((Byte) zzevVarZzo.zzn(1, null, null)).byteValue()) != 1) {
            if (bByteValue != 0) {
                boolean zZzi = zzgf.zza().zzb(zzevVarZzo.getClass()).zzi(zzevVarZzo);
                zzevVarZzo.zzn(2, true != zZzi ? null : zzevVarZzo, null);
            }
            zzfb zzfbVarZza = new zzgy(zzevVarZzo).zza();
            zzfbVarZza.zze(zzevVarZzo);
            throw zzfbVarZza;
        }
        return zzevVarZzo;
    }

    public final zzev zzc() {
        return (zzev) zzn(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzfy
    public final /* synthetic */ zzfx zze() {
        return (zzev) zzn(6, null, null);
    }

    public abstract Object zzn(int i11, Object obj, Object obj2);

    public static zzev zzb(Class cls) {
        Map map = zzb;
        zzev zzevVar = (zzev) map.get(cls);
        if (zzevVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzevVar = (zzev) map.get(cls);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException("Class initialization cannot fail.", e11);
            }
        }
        if (zzevVar != null) {
            return zzevVar;
        }
        zzev zzevVar2 = (zzev) ((zzev) zzhj.zze(cls)).zzn(6, null, null);
        if (zzevVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzevVar2);
        return zzevVar2;
    }

    public static Object zzh(zzfx zzfxVar, String str, Object[] objArr) {
        return new zzgh(zzfxVar, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgf.zza().zzb(getClass()).zzh(this, (zzev) obj);
    }

    public final void zzj() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzl(int i11) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean zzm() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public static zzez zzf() {
        return zzgg.zze();
    }

    public static Object zzg(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static void zzk(Class cls, zzev zzevVar) {
        zzevVar.zzj();
        zzb.put(cls, zzevVar);
    }

    private static zzev zzo(zzev zzevVar, byte[] bArr, int i11, int i12, zzel zzelVar) throws zzfb {
        zzev zzevVarZzc = zzevVar.zzc();
        try {
            zzgi zzgiVarZzb = zzgf.zza().zzb(zzevVarZzc.getClass());
            zzgiVarZzb.zzg(zzevVarZzc, bArr, 0, i12, new zzdt(zzelVar));
            zzgiVarZzb.zze(zzevVarZzc);
            return zzevVarZzc;
        } catch (zzfb e11) {
            e11.zze(zzevVarZzc);
            throw e11;
        } catch (zzgy e12) {
            zzfb zzfbVarZza = e12.zza();
            zzfbVarZza.zze(zzevVarZzc);
            throw zzfbVarZza;
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzfb) {
                throw ((zzfb) e13.getCause());
            }
            zzfb zzfbVar = new zzfb(e13);
            zzfbVar.zze(zzevVarZzc);
            throw zzfbVar;
        } catch (IndexOutOfBoundsException unused) {
            zzfb zzfbVarZzf = zzfb.zzf();
            zzfbVarZzf.zze(zzevVarZzc);
            throw zzfbVarZzf;
        }
    }

    public final int hashCode() {
        if (!zzm()) {
            int i11 = this.zza;
            if (i11 == 0) {
                int iZza = zza();
                this.zza = iZza;
                return iZza;
            }
            return i11;
        }
        return zza();
    }

    public final String toString() {
        return zzfz.zza(this, super.toString());
    }

    public final int zza() {
        return zzgf.zza().zzb(getClass()).zza(this);
    }

    public final void zzi() {
        zzgf.zza().zzb(getClass()).zze(this);
        zzj();
    }
}
