package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzma;
import com.google.android.gms.internal.measurement.zzme;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzme<MessageType extends zzme<MessageType, BuilderType>, BuilderType extends zzma<MessageType, BuilderType>> extends zzkr<MessageType, BuilderType> {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected zzoi zzc = zzoi.zza();

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzd(zzme zzmeVar, boolean z11) {
        byte bByteValue = ((Byte) zzmeVar.zzl(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zznt.zza().zzb(zzmeVar.getClass()).zzk(zzmeVar);
        if (z11) {
            zzmeVar.zzl(2, true != zZzk ? null : zzmeVar, null);
        }
        return zZzk;
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final /* synthetic */ zznk zzcC() {
        return (zzma) zzl(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zznm
    public final boolean zzcD() {
        return zzd(this, true);
    }

    @Override // com.google.android.gms.internal.measurement.zznm
    public final /* synthetic */ zznl zzcE() {
        return (zzme) zzl(6, null, null);
    }

    public final zzme zzch() {
        return (zzme) zzl(4, null, null);
    }

    public final zzma zzck() {
        return (zzma) zzl(5, null, null);
    }

    public final zzma zzcl() {
        zzma zzmaVar = (zzma) zzl(5, null, null);
        zzmaVar.zzbd(this);
        return zzmaVar;
    }

    public abstract Object zzl(int i11, Object obj, Object obj2);

    public static zzme zzco(Class cls) {
        Map map = zzd;
        zzme zzmeVar = (zzme) map.get(cls);
        if (zzmeVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzmeVar = (zzme) map.get(cls);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException("Class initialization cannot fail.", e11);
            }
        }
        if (zzmeVar != null) {
            return zzmeVar;
        }
        zzme zzmeVar2 = (zzme) ((zzme) zzoo.zzc(cls)).zzl(6, null, null);
        if (zzmeVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzmeVar2);
        return zzmeVar2;
    }

    public static Object zzcq(zznl zznlVar, String str, Object[] objArr) {
        return new zznv(zznlVar, str, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zznt.zza().zzb(getClass()).zzb(this, (zzme) obj);
    }

    public final boolean zzcf() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void zzcg() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final void zzcm(int i11) {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    private final int zzc(zznw zznwVar) {
        return zznt.zza().zzb(getClass()).zze(this);
    }

    public static void zzcp(Class cls, zzme zzmeVar) {
        zzmeVar.zzcg();
        zzd.put(cls, zzmeVar);
    }

    public static Object zzcr(Method method, Object obj, Object... objArr) {
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

    public static zzml zzcs() {
        return zzmf.zzd();
    }

    public static zzmm zzct() {
        return zzmz.zze();
    }

    public static zzmm zzcu(zzmm zzmmVar) {
        int size = zzmmVar.size();
        return zzmmVar.zzg(size + size);
    }

    public static zzmn zzcv() {
        return zznu.zzd();
    }

    public static zzmn zzcw(zzmn zzmnVar) {
        int size = zzmnVar.size();
        return zzmnVar.zzg(size + size);
    }

    public final int hashCode() {
        if (!zzcf()) {
            int i11 = this.zza;
            if (i11 == 0) {
                int iZzci = zzci();
                this.zza = iZzci;
                return iZzci;
            }
            return i11;
        }
        return zzci();
    }

    public final String toString() {
        return zznn.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzcB(zzll zzllVar) throws IOException {
        zznt.zza().zzb(getClass()).zzf(this, zzlm.zza(zzllVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    public final int zzcd(zznw zznwVar) {
        if (zzcf()) {
            int iZze = zznwVar.zze(this);
            if (iZze >= 0) {
                return iZze;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZze).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iZze);
            throw new IllegalStateException(sb2.toString());
        }
        int i11 = this.zzb & Integer.MAX_VALUE;
        if (i11 == Integer.MAX_VALUE) {
            int iZze2 = zznwVar.zze(this);
            if (iZze2 >= 0) {
                this.zzb = (this.zzb & Integer.MIN_VALUE) | iZze2;
                return iZze2;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZze2).length() + 42);
            sb3.append("serialized size must be non-negative, was ");
            sb3.append(iZze2);
            throw new IllegalStateException(sb3.toString());
        }
        return i11;
    }

    public final int zzci() {
        return zznt.zza().zzb(getClass()).zzc(this);
    }

    public final void zzcj() {
        zznt.zza().zzb(getClass()).zzj(this);
        zzcg();
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final int zzcn() {
        if (zzcf()) {
            int iZzc = zzc(null);
            if (iZzc >= 0) {
                return iZzc;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzc).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iZzc);
            throw new IllegalStateException(sb2.toString());
        }
        int i11 = this.zzb & Integer.MAX_VALUE;
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int iZzc2 = zzc(null);
        if (iZzc2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iZzc2;
            return iZzc2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iZzc2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iZzc2);
        throw new IllegalStateException(sb3.toString());
    }
}
