package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzjn;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzc {
    public static final /* synthetic */ int zza = 0;
    private static final ImmutableSet zzb = ImmutableSet.m13493of("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", FirebaseAnalytics.Event.CAMPAIGN_DETAILS, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    private static final ImmutableList zzc = ImmutableList.m13446of("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    private static final ImmutableList zzd = ImmutableList.m13442of("auto", "app", "am");
    private static final ImmutableList zze = ImmutableList.m13441of("_r", "_dbg");
    private static final ImmutableList zzf = new ImmutableList.Builder().add((Object[]) zzjn.zza).add((Object[]) zzjn.zzb).build();
    private static final ImmutableList zzg = ImmutableList.m13441of("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static boolean zza(String str) {
        return !zzd.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzb(String str, Bundle bundle) {
        if (zzc.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        ImmutableList immutableList = zze;
        int size = immutableList.size();
        int i11 = 0;
        while (i11 < size) {
            boolean zContainsKey = bundle.containsKey((String) immutableList.get(i11));
            i11++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzc(String str) {
        return !zzb.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzd(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals(FirebaseABTesting.OriginService.REMOTE_CONFIG);
        }
        if (Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION.equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (zzf.contains(str2)) {
            return false;
        }
        ImmutableList immutableList = zzg;
        int size = immutableList.size();
        int i11 = 0;
        while (i11 < size) {
            boolean zMatches = str2.matches((String) immutableList.get(i11));
            i11++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zze(String str, String str2, Bundle bundle) {
        byte b11;
        if (!Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2)) {
            return true;
        }
        if (!zza(str) || bundle == null) {
            return false;
        }
        ImmutableList immutableList = zze;
        int size = immutableList.size();
        int i11 = 0;
        while (i11 < size) {
            boolean zContainsKey = bundle.containsKey((String) immutableList.get(i11));
            i11++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals("fiam")) {
                    b11 = 2;
                } else {
                    b11 = -1;
                }
            } else if (str.equals("fdl")) {
                b11 = 1;
            } else {
                b11 = -1;
            }
        } else if (str.equals("fcm")) {
            b11 = 0;
        } else {
            b11 = -1;
        }
        if (b11 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        if (b11 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        if (b11 != 2) {
            return false;
        }
        bundle.putString("_cis", "fiam_integration");
        return true;
    }
}
