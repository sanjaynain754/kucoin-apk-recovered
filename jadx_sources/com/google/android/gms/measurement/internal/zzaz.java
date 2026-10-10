package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.tencent.bugly.proguard.C33844oi;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaz {
    public static final zzaz zza = new zzaz((Boolean) null, 100, (Boolean) null, (String) null);
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap zzf;

    public zzaz(Boolean bool, int i11, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(zzjj.class);
        this.zzf = enumMap;
        enumMap.put(zzjj.AD_USER_DATA, zzjk.zzh(bool));
        this.zzb = i11;
        this.zzc = zzl();
        this.zzd = bool2;
        this.zze = str;
    }

    public static zzaz zzh(Bundle bundle, int i11) {
        if (bundle == null) {
            return new zzaz((Boolean) null, i11, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(zzjj.class);
        for (zzjj zzjjVar : zzji.DMA.zza()) {
            enumMap.put(zzjjVar, zzjk.zzg(bundle.getString(zzjjVar.zze)));
        }
        return new zzaz(enumMap, i11, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static zzaz zza(zzjh zzjhVar, int i11) {
        EnumMap enumMap = new EnumMap(zzjj.class);
        enumMap.put(zzjj.AD_USER_DATA, zzjhVar);
        return new zzaz(enumMap, -10, (Boolean) null, (String) null);
    }

    public static zzaz zzg(String str) {
        if (str == null || str.length() <= 0) {
            return zza;
        }
        String[] strArrSplit = str.split(C33844oi.f71346o);
        int i11 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(zzjj.class);
        zzjj[] zzjjVarArrZza = zzji.DMA.zza();
        int length = zzjjVarArrZza.length;
        int i12 = 1;
        int i13 = 0;
        while (i13 < length) {
            enumMap.put(zzjjVarArrZza[i13], zzjk.zzj(strArrSplit[i12].charAt(0)));
            i13++;
            i12++;
        }
        return new zzaz(enumMap, i11, (Boolean) null, (String) null);
    }

    public static Boolean zzi(Bundle bundle) {
        zzjh zzjhVarZzg;
        if (bundle == null || (zzjhVarZzg = zzjk.zzg(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = zzjhVarZzg.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String zzl() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.zzb);
        for (zzjj zzjjVar : zzji.DMA.zza()) {
            sb2.append(C33844oi.f71346o);
            sb2.append(zzjk.zzm((zzjh) this.zzf.get(zzjjVar)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaz)) {
            return false;
        }
        zzaz zzazVar = (zzaz) obj;
        if (this.zzc.equalsIgnoreCase(zzazVar.zzc) && Objects.equals(this.zzd, zzazVar.zzd)) {
            return Objects.equals(this.zze, zzazVar.zze);
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        Boolean bool = this.zzd;
        if (bool == null) {
            i11 = 3;
        } else {
            i11 = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.zze;
        return this.zzc.hashCode() + (i11 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(zzjk.zzd(this.zzb));
        for (zzjj zzjjVar : zzji.DMA.zza()) {
            sb2.append(",");
            sb2.append(zzjjVar.zze);
            sb2.append("=");
            zzjh zzjhVar = (zzjh) this.zzf.get(zzjjVar);
            if (zzjhVar == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = zzjhVar.ordinal();
                if (iOrdinal == 0) {
                    sb2.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb2.append("denied");
                } else if (iOrdinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.zze;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzjh zzc() {
        zzjh zzjhVar = (zzjh) this.zzf.get(zzjj.AD_USER_DATA);
        return zzjhVar == null ? zzjh.UNINITIALIZED : zzjhVar;
    }

    public final boolean zzd() {
        Iterator it = this.zzf.values().iterator();
        while (it.hasNext()) {
            if (((zzjh) it.next()) != zzjh.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String zze() {
        return this.zzc;
    }

    public final Bundle zzf() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.zzf.entrySet()) {
            String strZzi = zzjk.zzi((zzjh) entry.getValue());
            if (strZzi != null) {
                bundle.putString(((zzjj) entry.getKey()).zze, strZzi);
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.zze;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final Boolean zzj() {
        return this.zzd;
    }

    public final String zzk() {
        return this.zze;
    }

    private zzaz(EnumMap enumMap, int i11, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(zzjj.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i11;
        this.zzc = zzl();
        this.zzd = bool;
        this.zze = str;
    }
}
