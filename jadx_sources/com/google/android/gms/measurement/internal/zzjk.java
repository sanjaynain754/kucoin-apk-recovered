package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.tencent.bugly.proguard.C33577c3;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjk {
    public static final zzjk zza = new zzjk(null, null, 100);
    private final EnumMap zzb;
    private final int zzc;

    public zzjk(Boolean bool, Boolean bool2, int i11) {
        EnumMap enumMap = new EnumMap(zzjj.class);
        this.zzb = enumMap;
        enumMap.put(zzjj.AD_STORAGE, zzh(null));
        enumMap.put(zzjj.ANALYTICS_STORAGE, zzh(null));
        this.zzc = i11;
    }

    public static zzjk zza(zzjh zzjhVar, zzjh zzjhVar2, int i11) {
        EnumMap enumMap = new EnumMap(zzjj.class);
        enumMap.put(zzjj.AD_STORAGE, zzjhVar);
        enumMap.put(zzjj.ANALYTICS_STORAGE, zzjhVar2);
        return new zzjk(enumMap, -10);
    }

    public static String zzd(int i11) {
        if (i11 == -30) {
            return "TCF";
        }
        if (i11 == -20) {
            return "API";
        }
        if (i11 == -10) {
            return "MANIFEST";
        }
        if (i11 == 0) {
            return "1P_API";
        }
        if (i11 == 30) {
            return "1P_INIT";
        }
        if (i11 != 90) {
            return i11 != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static zzjk zze(Bundle bundle, int i11) {
        if (bundle == null) {
            return new zzjk(null, null, i11);
        }
        EnumMap enumMap = new EnumMap(zzjj.class);
        for (zzjj zzjjVar : zzji.STORAGE.zzb()) {
            enumMap.put(zzjjVar, zzg(bundle.getString(zzjjVar.zze)));
        }
        return new zzjk(enumMap, i11);
    }

    public static zzjk zzf(String str, int i11) {
        EnumMap enumMap = new EnumMap(zzjj.class);
        zzjj[] zzjjVarArrZza = zzji.STORAGE.zza();
        for (int i12 = 0; i12 < zzjjVarArrZza.length; i12++) {
            String str2 = str == null ? "" : str;
            zzjj zzjjVar = zzjjVarArrZza[i12];
            int i13 = i12 + 2;
            if (i13 < str2.length()) {
                enumMap.put(zzjjVar, zzj(str2.charAt(i13)));
            } else {
                enumMap.put(zzjjVar, zzjh.UNINITIALIZED);
            }
        }
        return new zzjk(enumMap, i11);
    }

    public static zzjh zzg(String str) {
        if (str == null) {
            return zzjh.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return zzjh.GRANTED;
        }
        return str.equals("denied") ? zzjh.DENIED : zzjh.UNINITIALIZED;
    }

    public static zzjh zzh(Boolean bool) {
        if (bool == null) {
            return zzjh.UNINITIALIZED;
        }
        return bool.booleanValue() ? zzjh.GRANTED : zzjh.DENIED;
    }

    public static zzjh zzj(char c11) {
        if (c11 == '+') {
            return zzjh.POLICY;
        }
        if (c11 != '0') {
            return c11 != '1' ? zzjh.UNINITIALIZED : zzjh.GRANTED;
        }
        return zzjh.DENIED;
    }

    public static char zzm(zzjh zzjhVar) {
        if (zzjhVar == null) {
            return '-';
        }
        int iOrdinal = zzjhVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean zzu(int i11, int i12) {
        int i13 = -30;
        if (i11 == -20) {
            if (i12 == -30) {
                return true;
            }
            i11 = -20;
        }
        if (i11 != -30) {
            i13 = i11;
        } else if (i12 == -20) {
            return true;
        }
        return i13 == i12 || i11 < i12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjk)) {
            return false;
        }
        zzjk zzjkVar = (zzjk) obj;
        for (zzjj zzjjVar : zzji.STORAGE.zzb()) {
            if (this.zzb.get(zzjjVar) != zzjkVar.zzb.get(zzjjVar)) {
                return false;
            }
        }
        return this.zzc == zzjkVar.zzc;
    }

    public final int hashCode() {
        Iterator it = this.zzb.values().iterator();
        int iHashCode = this.zzc * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((zzjh) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(zzd(this.zzc));
        for (zzjj zzjjVar : zzji.STORAGE.zzb()) {
            sb2.append(",");
            sb2.append(zzjjVar.zze);
            sb2.append("=");
            zzjh zzjhVar = (zzjh) this.zzb.get(zzjjVar);
            if (zzjhVar == null) {
                zzjhVar = zzjh.UNINITIALIZED;
            }
            sb2.append(zzjhVar);
        }
        return sb2.toString();
    }

    public final int zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (((zzjh) it.next()) != zzjh.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public final String zzk() {
        int iOrdinal;
        StringBuilder sb2 = new StringBuilder(C33577c3.f69354k);
        for (zzjj zzjjVar : zzji.STORAGE.zza()) {
            zzjh zzjhVar = (zzjh) this.zzb.get(zzjjVar);
            char c11 = '-';
            if (zzjhVar != null && (iOrdinal = zzjhVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c11 = '1';
                } else if (iOrdinal == 2) {
                    c11 = '0';
                } else if (iOrdinal == 3) {
                    c11 = '1';
                }
            }
            sb2.append(c11);
        }
        return sb2.toString();
    }

    public final String zzl() {
        StringBuilder sb2 = new StringBuilder(C33577c3.f69354k);
        for (zzjj zzjjVar : zzji.STORAGE.zza()) {
            sb2.append(zzm((zzjh) this.zzb.get(zzjjVar)));
        }
        return sb2.toString();
    }

    public final Bundle zzn() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.zzb.entrySet()) {
            String strZzi = zzi((zzjh) entry.getValue());
            if (strZzi != null) {
                bundle.putString(((zzjj) entry.getKey()).zze, strZzi);
            }
        }
        return bundle;
    }

    public final boolean zzo(zzjj zzjjVar) {
        return ((zzjh) this.zzb.get(zzjjVar)) != zzjh.DENIED;
    }

    public final zzjh zzp() {
        zzjh zzjhVar = (zzjh) this.zzb.get(zzjj.AD_STORAGE);
        return zzjhVar == null ? zzjh.UNINITIALIZED : zzjhVar;
    }

    public final zzjh zzq() {
        zzjh zzjhVar = (zzjh) this.zzb.get(zzjj.ANALYTICS_STORAGE);
        return zzjhVar == null ? zzjh.UNINITIALIZED : zzjhVar;
    }

    public final boolean zzr(zzjk zzjkVar) {
        EnumMap enumMap = this.zzb;
        for (zzjj zzjjVar : (zzjj[]) enumMap.keySet().toArray(new zzjj[0])) {
            zzjh zzjhVar = (zzjh) enumMap.get(zzjjVar);
            zzjh zzjhVar2 = (zzjh) zzjkVar.zzb.get(zzjjVar);
            zzjh zzjhVar3 = zzjh.DENIED;
            if (zzjhVar == zzjhVar3 && zzjhVar2 != zzjhVar3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public final zzjk zzs(zzjk zzjkVar) {
        EnumMap enumMap = new EnumMap(zzjj.class);
        for (zzjj zzjjVar : zzji.STORAGE.zzb()) {
            zzjh zzjhVar = (zzjh) this.zzb.get(zzjjVar);
            zzjh zzjhVar2 = (zzjh) zzjkVar.zzb.get(zzjjVar);
            if (zzjhVar == null) {
                zzjhVar = zzjhVar2;
            } else if (zzjhVar2 != null) {
                zzjh zzjhVar3 = zzjh.UNINITIALIZED;
                if (zzjhVar == zzjhVar3) {
                    zzjhVar = zzjhVar2;
                } else if (zzjhVar2 != zzjhVar3) {
                    zzjh zzjhVar4 = zzjh.POLICY;
                    if (zzjhVar == zzjhVar4) {
                        zzjhVar = zzjhVar2;
                    } else if (zzjhVar2 != zzjhVar4) {
                        zzjh zzjhVar5 = zzjh.DENIED;
                        zzjhVar = (zzjhVar == zzjhVar5 || zzjhVar2 == zzjhVar5) ? zzjhVar5 : zzjh.GRANTED;
                    }
                }
            }
            if (zzjhVar != null) {
                enumMap.put(zzjjVar, zzjhVar);
            }
        }
        return new zzjk(enumMap, 100);
    }

    public final zzjk zzt(zzjk zzjkVar) {
        EnumMap enumMap = new EnumMap(zzjj.class);
        for (zzjj zzjjVar : zzji.STORAGE.zzb()) {
            zzjh zzjhVar = (zzjh) this.zzb.get(zzjjVar);
            if (zzjhVar == zzjh.UNINITIALIZED) {
                zzjhVar = (zzjh) zzjkVar.zzb.get(zzjjVar);
            }
            if (zzjhVar != null) {
                enumMap.put(zzjjVar, zzjhVar);
            }
        }
        return new zzjk(enumMap, this.zzc);
    }

    public static String zzi(zzjh zzjhVar) {
        int iOrdinal = zzjhVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                return null;
            }
            return "granted";
        }
        return "denied";
    }

    private zzjk(EnumMap enumMap, int i11) {
        EnumMap enumMap2 = new EnumMap(zzjj.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i11;
    }
}
