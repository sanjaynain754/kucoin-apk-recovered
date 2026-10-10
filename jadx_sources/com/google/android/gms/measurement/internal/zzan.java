package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzan {
    private final EnumMap zza;

    public zzan() {
        this.zza = new EnumMap(zzjj.class);
    }

    private zzan(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzjj.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static zzan zzd(String str) {
        EnumMap enumMap = new EnumMap(zzjj.class);
        if (str.length() >= zzjj.values().length) {
            int i11 = 0;
            if (str.charAt(0) == '1') {
                zzjj[] zzjjVarArrValues = zzjj.values();
                int length = zzjjVarArrValues.length;
                int i12 = 1;
                while (i11 < length) {
                    enumMap.put(zzjjVarArrValues[i11], zzam.zza(str.charAt(i12)));
                    i11++;
                    i12++;
                }
                return new zzan(enumMap);
            }
        }
        return new zzan();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (zzjj zzjjVar : zzjj.values()) {
            zzam zzamVar = (zzam) this.zza.get(zzjjVar);
            if (zzamVar == null) {
                zzamVar = zzam.UNSET;
            }
            sb2.append(zzamVar.zzb());
        }
        return sb2.toString();
    }

    public final zzam zza(zzjj zzjjVar) {
        zzam zzamVar = (zzam) this.zza.get(zzjjVar);
        return zzamVar == null ? zzam.UNSET : zzamVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public final void zzb(zzjj zzjjVar, int i11) {
        zzam zzamVar = zzam.UNSET;
        if (i11 == -30) {
            zzamVar = zzam.TCF;
        } else if (i11 == -20) {
            zzamVar = zzam.API;
        } else if (i11 == -10) {
            zzamVar = zzam.MANIFEST;
        } else if (i11 == 0) {
            zzamVar = zzam.API;
        } else if (i11 == 30) {
            zzamVar = zzam.INITIALIZATION;
        }
        this.zza.put(zzjjVar, zzamVar);
    }

    public final void zzc(zzjj zzjjVar, zzam zzamVar) {
        this.zza.put(zzjjVar, zzamVar);
    }
}
