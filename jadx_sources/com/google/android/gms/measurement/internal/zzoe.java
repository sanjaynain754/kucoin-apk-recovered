package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzoe {
    static final ImmutableList zza = ImmutableList.m13451of("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");
    public static final /* synthetic */ int zzb = 0;

    public static int zzb(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0066  */
    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:51:0x010e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0128  */
    /* JADX WARN: Code duplicated, block: B:55:0x0147  */
    /* JADX WARN: Code duplicated, block: B:57:0x0166  */
    /* JADX WARN: Code duplicated, block: B:60:0x0183  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c9  */
    @VisibleForTesting
    public static final boolean zzc(com.google.android.gms.internal.measurement.zzko zzkoVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i11, int i12, int i13, int i14, int i15, String str, String str2, String str3, boolean z11, boolean z12, boolean z13) {
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        ImmutableSet immutableSet2;
        String str4;
        zzod zzodVar;
        int iOrdinal;
        char c11;
        int iZze = zze(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, z13);
        if (iZze > 0) {
            i17 = i13;
            if (i17 == 1) {
                i16 = i12;
                if (i16 != 1) {
                    i17 = 1;
                } else {
                    i19 = 1;
                    i18 = 1;
                }
                if (zzi(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i11, i19, i18, i14, i15, str, str2, str3, z11, z12, z13) == com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_NOT_ALLOWED) {
                    c11 = '3';
                } else {
                    i21 = i15;
                    if (zzkoVar == com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                        immutableSet2 = immutableSet;
                        str4 = str;
                        if (i21 == 1) {
                            if (immutableSet2.contains(str4)) {
                                if (iZze > 0 && cArr[iZze] != '2') {
                                    cArr[iZze] = '1';
                                }
                                return true;
                            }
                            i21 = 1;
                        }
                    } else {
                        immutableSet2 = immutableSet;
                        str4 = str;
                    }
                    if (immutableMap.containsKey(zzkoVar) || (zzodVar = (zzod) immutableMap.get(zzkoVar)) == null) {
                        c11 = '0';
                    } else {
                        iOrdinal = zzodVar.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    return zzi(zzkoVar, immutableMap, immutableMap2, immutableSet2, cArr, i11, i19, i18, i14, i21, str4, str2, str3, z11, z12, z13) == com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? zzh(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i11, i19, i18, i14, i21, str, str2, str3, z11, z12, z13) : zzg(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i11, i19, i18, i14, i21, str, str2, str3, z11, z12, z13);
                                }
                                if (iOrdinal == 3) {
                                    return zzi(zzkoVar, immutableMap, immutableMap2, immutableSet2, cArr, i11, i19, i18, i14, i21, str4, str2, str3, z11, z12, z13) == com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? zzg(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i11, i19, i18, i14, i21, str, str2, str3, z11, z12, z13) : zzh(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i11, i19, i18, i14, i21, str, str2, str3, z11, z12, z13);
                                }
                                c11 = '0';
                            } else if (zzi(zzkoVar, immutableMap, immutableMap2, immutableSet2, cArr, i11, i19, i18, i14, i21, str4, str2, str3, z11, z12, z13) != com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                                return zzh(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i11, i19, i18, i14, i21, str, str2, str3, z11, z12, z13);
                            }
                        } else if (zzi(zzkoVar, immutableMap, immutableMap2, immutableSet2, cArr, i11, i19, i18, i14, i21, str4, str2, str3, z11, z12, z13) != com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                            return zzg(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i11, i19, i18, i14, i21, str, str2, str3, z11, z12, z13);
                        }
                        c11 = '8';
                    }
                }
                if (iZze <= 0 && cArr[iZze] != '2') {
                    cArr[iZze] = c11;
                    return false;
                }
            }
            i16 = i12;
            cArr[iZze] = '2';
        } else {
            i16 = i12;
            i17 = i13;
        }
        i18 = i17;
        i19 = i16;
        if (zzi(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i11, i19, i18, i14, i15, str, str2, str3, z11, z12, z13) == com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c11 = '3';
        } else {
            i21 = i15;
            if (zzkoVar == com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                immutableSet2 = immutableSet;
                str4 = str;
                if (i21 == 1) {
                    if (immutableSet2.contains(str4)) {
                        if (iZze > 0) {
                            cArr[iZze] = '1';
                        }
                        return true;
                    }
                    i21 = 1;
                }
            } else {
                immutableSet2 = immutableSet;
                str4 = str;
            }
            if (immutableMap.containsKey(zzkoVar)) {
                c11 = '0';
            } else {
                iOrdinal = zzodVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (zzi(zzkoVar, immutableMap, immutableMap2, immutableSet2, cArr, i11, i19, i18, i14, i21, str4, str2, str3, z11, z12, z13) == com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                            }
                        }
                        if (iOrdinal == 3) {
                            if (zzi(zzkoVar, immutableMap, immutableMap2, immutableSet2, cArr, i11, i19, i18, i14, i21, str4, str2, str3, z11, z12, z13) == com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                            }
                        }
                        c11 = '0';
                    } else if (zzi(zzkoVar, immutableMap, immutableMap2, immutableSet2, cArr, i11, i19, i18, i14, i21, str4, str2, str3, z11, z12, z13) != com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return zzh(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i11, i19, i18, i14, i21, str, str2, str3, z11, z12, z13);
                    }
                } else if (zzi(zzkoVar, immutableMap, immutableMap2, immutableSet2, cArr, i11, i19, i18, i14, i21, str4, str2, str3, z11, z12, z13) != com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return zzg(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i11, i19, i18, i14, i21, str, str2, str3, z11, z12, z13);
                }
                c11 = '8';
            }
        }
        return iZze <= 0 ? false : false;
    }

    public static final Map zzd(ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i11, int i12, int i13, int i14, int i15, String str, String str2, String str3, boolean z11, boolean z12, boolean z13) {
        if (((Boolean) zzfx.zzba.zzb(null)).booleanValue() && !z13) {
            return ImmutableMap.m13458of();
        }
        com.google.android.gms.internal.measurement.zzko zzkoVar = com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        com.google.android.gms.internal.measurement.zzkp zzkpVar = (com.google.android.gms.internal.measurement.zzkp) immutableMap2.get(zzkoVar);
        com.google.android.gms.internal.measurement.zzko zzkoVar2 = com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        com.google.android.gms.internal.measurement.zzkp zzkpVar2 = (com.google.android.gms.internal.measurement.zzkp) immutableMap2.get(zzkoVar2);
        com.google.android.gms.internal.measurement.zzko zzkoVar3 = com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        com.google.android.gms.internal.measurement.zzkp zzkpVar3 = (com.google.android.gms.internal.measurement.zzkp) immutableMap2.get(zzkoVar3);
        com.google.android.gms.internal.measurement.zzko zzkoVar4 = com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        com.google.android.gms.internal.measurement.zzkp zzkpVar4 = (com.google.android.gms.internal.measurement.zzkp) immutableMap2.get(zzkoVar4);
        return ImmutableMap.builder().put("Version", "2").put("VendorConsent", true != z11 ? "0" : "1").put("VendorLegitimateInterest", true != z12 ? "0" : "1").put("gdprApplies", i13 != 1 ? "0" : "1").put("EnableAdvertiserConsentMode", i12 != 1 ? "0" : "1").put("PolicyVersion", String.valueOf(i14)).put("CmpSdkID", String.valueOf(i11)).put("PurposeOneTreatment", i15 != 1 ? "0" : "1").put("PublisherCC", str).put("PublisherRestrictions1", String.valueOf(zzkpVar != null ? zzkpVar.zza() : com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions3", String.valueOf(zzkpVar2 != null ? zzkpVar2.zza() : com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions4", String.valueOf(zzkpVar3 != null ? zzkpVar3.zza() : com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions7", String.valueOf(zzkpVar4 != null ? zzkpVar4.zza() : com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_UNDEFINED.zza())).putAll(ImmutableMap.m13462of("Purpose1", zzf(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, z13), "Purpose3", zzf(zzkoVar2, immutableMap, immutableMap2, immutableSet, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, z13), "Purpose4", zzf(zzkoVar3, immutableMap, immutableMap2, immutableSet, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, z13), "Purpose7", zzf(zzkoVar4, immutableMap, immutableMap2, immutableSet, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, z13))).putAll(ImmutableMap.m13463of("AuthorizePurpose1", (String) (true != zzc(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, z13) ? "0" : "1"), "AuthorizePurpose3", (String) (true != zzc(zzkoVar2, immutableMap, immutableMap2, immutableSet, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, z13) ? "0" : "1"), "AuthorizePurpose4", (String) (true != zzc(zzkoVar3, immutableMap, immutableMap2, immutableSet, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, z13) ? "0" : "1"), "AuthorizePurpose7", true != zzc(zzkoVar4, immutableMap, immutableMap2, immutableSet, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, z13) ? "0" : "1", "PurposeDiagnostics", new String(cArr))).buildOrThrow();
    }

    public static String zza(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    private static final int zze(com.google.android.gms.internal.measurement.zzko zzkoVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i11, int i12, int i13, int i14, int i15, String str, String str2, String str3, boolean z11, boolean z12, boolean z13) {
        if (zzkoVar == com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzkoVar == com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzkoVar == com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzkoVar == com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final com.google.android.gms.internal.measurement.zzkp zzi(com.google.android.gms.internal.measurement.zzko zzkoVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i11, int i12, int i13, int i14, int i15, String str, String str2, String str3, boolean z11, boolean z12, boolean z13) {
        return (com.google.android.gms.internal.measurement.zzkp) immutableMap2.getOrDefault(zzkoVar, com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_UNDEFINED);
    }

    private static final String zzf(com.google.android.gms.internal.measurement.zzko zzkoVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i11, int i12, int i13, int i14, int i15, String str, String str2, String str3, boolean z11, boolean z12, boolean z13) {
        String strValueOf;
        String strValueOf2 = "0";
        if (TextUtils.isEmpty(str2) || str2.length() < zzkoVar.zza()) {
            strValueOf = "0";
        } else {
            strValueOf = String.valueOf(str2.charAt(zzkoVar.zza() - 1));
        }
        if (!TextUtils.isEmpty(str3) && str3.length() >= zzkoVar.zza()) {
            strValueOf2 = String.valueOf(str3.charAt(zzkoVar.zza() - 1));
        }
        return String.valueOf(strValueOf).concat(String.valueOf(strValueOf2));
    }

    private static final boolean zzg(com.google.android.gms.internal.measurement.zzko zzkoVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i11, int i12, int i13, int i14, int i15, String str, String str2, String str3, boolean z11, boolean z12, boolean z13) {
        char c11;
        int iZze = zze(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, z13);
        boolean z14 = false;
        if (!z11) {
            c11 = '4';
        } else if (str2.length() < zzkoVar.zza()) {
            c11 = '0';
        } else {
            char cCharAt = str2.charAt(zzkoVar.zza() - 1);
            char c12 = '1';
            if (cCharAt == '1') {
                z14 = true;
            }
            if (iZze > 0 && cArr[iZze] != '2') {
                if (cCharAt != '1') {
                    c12 = '6';
                }
                cArr[iZze] = c12;
            }
            return z14;
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c11;
        }
        return false;
    }

    private static final boolean zzh(com.google.android.gms.internal.measurement.zzko zzkoVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i11, int i12, int i13, int i14, int i15, String str, String str2, String str3, boolean z11, boolean z12, boolean z13) {
        char c11;
        int iZze = zze(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, z13);
        boolean z14 = false;
        if (!z12) {
            c11 = '5';
        } else if (str3.length() < zzkoVar.zza()) {
            c11 = '0';
        } else {
            char cCharAt = str3.charAt(zzkoVar.zza() - 1);
            char c12 = '1';
            if (cCharAt == '1') {
                z14 = true;
            }
            if (iZze > 0 && cArr[iZze] != '2') {
                if (cCharAt != '1') {
                    c12 = '7';
                }
                cArr[iZze] = c12;
            }
            return z14;
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c11;
        }
        return false;
    }
}
