package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzoc {
    private final Map zza;

    private final int zzg() {
        try {
            String str = (String) this.zza.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private final Bundle zzf() {
        int iZzg;
        Map map = this.zza;
        if ("1".equals(map.get("GoogleConsent")) && (iZzg = zzg()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString(zzjj.AD_STORAGE.zze, str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(zzjj.AD_PERSONALIZATION.zze, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && iZzg >= 4) {
                    String str3 = zzjj.AD_USER_DATA.zze;
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        str2 = "granted";
                    }
                    bundle.putString(str3, str2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzoc) {
            return zza().equalsIgnoreCase(((zzoc) obj).zza());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String zza() {
        StringBuilder sb2 = new StringBuilder();
        ImmutableList immutableList = zzoe.zza;
        int size = immutableList.size();
        for (int i11 = 0; i11 < size; i11++) {
            String str = (String) immutableList.get(i11);
            Map map = this.zza;
            if (map.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append((String) map.get(str));
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00da  */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0071, please report this as an issue */
    public final Bundle zzb() {
        Map map;
        Bundle bundle;
        String str;
        String str2;
        zzfw zzfwVar = zzfx.zzaZ;
        if (((Boolean) zzfwVar.zzb(null)).booleanValue()) {
            Map map2 = this.zza;
            if ("1".equals(map2.get("gdprApplies")) && "1".equals(map2.get("EnableAdvertiserConsentMode"))) {
                if (((Boolean) zzfwVar.zzb(null)).booleanValue()) {
                    return zzf();
                }
                map = this.zza;
                if (map.get("Version") == null) {
                    return zzf();
                }
                if (zzg() >= 0) {
                    bundle = new Bundle();
                    String str3 = zzjj.AD_STORAGE.zze;
                    if (true != Objects.equals(map.get("AuthorizePurpose1"), "1")) {
                        str = "denied";
                    } else {
                        str = "granted";
                    }
                    bundle.putString(str3, str);
                    String str4 = zzjj.AD_PERSONALIZATION.zze;
                    if (Objects.equals(map.get("AuthorizePurpose3"), "1") || !Objects.equals(map.get("AuthorizePurpose4"), "1")) {
                        str2 = "denied";
                    } else {
                        str2 = "granted";
                    }
                    bundle.putString(str4, str2);
                    if (zzg() >= 4) {
                        bundle.putString(zzjj.AD_USER_DATA.zze, (Objects.equals(map.get("AuthorizePurpose1"), "1") || !Objects.equals(map.get("AuthorizePurpose7"), "1")) ? "denied" : "granted");
                    }
                    return bundle;
                }
            }
        } else {
            Map map3 = this.zza;
            if ("1".equals(map3.get("GoogleConsent")) && "1".equals(map3.get("gdprApplies")) && "1".equals(map3.get("EnableAdvertiserConsentMode"))) {
                if (((Boolean) zzfwVar.zzb(null)).booleanValue()) {
                    return zzf();
                }
                map = this.zza;
                if (map.get("Version") == null) {
                    return zzf();
                }
                if (zzg() >= 0) {
                    bundle = new Bundle();
                    String str5 = zzjj.AD_STORAGE.zze;
                    if (true != Objects.equals(map.get("AuthorizePurpose1"), "1")) {
                        str = "denied";
                    } else {
                        str = "granted";
                    }
                    bundle.putString(str5, str);
                    String str6 = zzjj.AD_PERSONALIZATION.zze;
                    if (Objects.equals(map.get("AuthorizePurpose3"), "1")) {
                        str2 = "denied";
                    } else {
                        str2 = "denied";
                    }
                    bundle.putString(str6, str2);
                    if (zzg() >= 4) {
                        bundle.putString(zzjj.AD_USER_DATA.zze, (Objects.equals(map.get("AuthorizePurpose1"), "1") || !Objects.equals(map.get("AuthorizePurpose7"), "1")) ? "denied" : "granted");
                    }
                    return bundle;
                }
            }
        }
        return Bundle.EMPTY;
    }

    public final String zzc() {
        String str = (String) this.zza.get("PurposeDiagnostics");
        return TextUtils.isEmpty(str) ? "200000" : str;
    }

    public final String zzd(zzoc zzocVar) {
        Map map = zzocVar.zza;
        String str = (map.isEmpty() || ((String) map.get("Version")) != null) ? "0" : "1";
        Bundle bundleZzb = zzb();
        Bundle bundleZzb2 = zzocVar.zzb();
        return str.concat((bundleZzb.size() == bundleZzb2.size() && Objects.equals(bundleZzb.getString("ad_storage"), bundleZzb2.getString("ad_storage")) && Objects.equals(bundleZzb.getString("ad_personalization"), bundleZzb2.getString("ad_personalization")) && Objects.equals(bundleZzb.getString("ad_user_data"), bundleZzb2.getString("ad_user_data"))) ? "0" : "1");
    }

    public final String zze() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1");
        int i11 = -1;
        try {
            String str = (String) this.zza.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i11 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i11 < 0 || i11 > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11 >> 6));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11 & 63));
        }
        int iZzg = zzg();
        if (iZzg < 0 || iZzg > 63) {
            sb2.append("0");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iZzg));
        }
        Preconditions.checkArgument(true);
        Map map = this.zza;
        int i12 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
        boolean zEquals = "1".equals(map.get("EnableAdvertiserConsentMode"));
        int i13 = i12 | 4;
        if (zEquals) {
            i13 = i12 | 12;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13));
        return sb2.toString();
    }

    public zzoc(Map map) {
        HashMap map2 = new HashMap();
        this.zza = map2;
        map2.putAll(map);
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    public final String toString() {
        return zza();
    }
}
