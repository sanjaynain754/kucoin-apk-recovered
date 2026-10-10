package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.credentials.provider.CredentialEntry;
import androidx.media3.common.C2711C;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p852kotlin.Unit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzli extends zzg {

    @VisibleForTesting
    protected zzkx zza;
    final zzx zzb;

    @VisibleForTesting
    protected boolean zzc;
    private zzjo zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    private boolean zzi;
    private int zzj;
    private zzay zzk;
    private zzay zzl;
    private PriorityQueue zzm;
    private boolean zzn;

    @GuardedBy("consentLock")
    private zzjk zzo;
    private final AtomicLong zzp;
    private long zzq;
    private zzay zzr;
    private SharedPreferences.OnSharedPreferenceChangeListener zzs;
    private zzay zzt;
    private final zzpn zzv;

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final void zzD() {
        zzoc zzocVar;
        zzoc zzocVar2;
        com.google.android.gms.internal.measurement.zzkp zzkpVar;
        zzg();
        zzib zzibVar = this.zzu;
        zzibVar.zzaV().zzj().zza("Handle tcf update.");
        SharedPreferences sharedPreferencesZze = zzibVar.zzd().zze();
        HashMap map = new HashMap();
        zzfw zzfwVar = zzfx.zzaZ;
        int i11 = 2;
        if (((Boolean) zzfwVar.zzb(null)).booleanValue()) {
            int i12 = zzoe.zzb;
            com.google.android.gms.internal.measurement.zzko zzkoVar = com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            zzod zzodVar = zzod.CONSENT;
            Map.Entry entryM12912a = C7080f.m12912a(zzkoVar, zzodVar);
            int i13 = 1;
            com.google.android.gms.internal.measurement.zzko zzkoVar2 = com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            zzod zzodVar2 = zzod.FLEXIBLE_LEGITIMATE_INTEREST;
            ImmutableMap immutableMapOfEntries = ImmutableMap.ofEntries(entryM12912a, C7080f.m12912a(zzkoVar2, zzodVar2), C7080f.m12912a(com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, zzodVar), C7080f.m12912a(com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, zzodVar), C7080f.m12912a(com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, zzodVar2), C7080f.m12912a(com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, zzodVar2), C7080f.m12912a(com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, zzodVar2));
            ImmutableSet immutableSetM13488of = ImmutableSet.m13488of("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesZze.contains("IABTCF_TCString");
            int iZzb = zzoe.zzb(sharedPreferencesZze, "IABTCF_CmpSdkID");
            int iZzb2 = zzoe.zzb(sharedPreferencesZze, "IABTCF_PolicyVersion");
            int iZzb3 = zzoe.zzb(sharedPreferencesZze, "IABTCF_gdprApplies");
            int iZzb4 = zzoe.zzb(sharedPreferencesZze, "IABTCF_PurposeOneTreatment");
            int iZzb5 = zzoe.zzb(sharedPreferencesZze, "IABTCF_EnableAdvertiserConsentMode");
            String strZza = zzoe.zza(sharedPreferencesZze, "IABTCF_PublisherCC");
            ImmutableMap.Builder builder = ImmutableMap.builder();
            UnmodifiableIterator it = immutableMapOfEntries.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.zzko zzkoVar3 = (com.google.android.gms.internal.measurement.zzko) it.next();
                int iZza = zzkoVar3.zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb2.append("IABTCF_PublisherRestrictions");
                sb2.append(iZza);
                String strZza2 = zzoe.zza(sharedPreferencesZze, sb2.toString());
                if (TextUtils.isEmpty(strZza2) || strZza2.length() < 755) {
                    zzkpVar = com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int iDigit = Character.digit(strZza2.charAt(754), 10);
                    if (iDigit < 0 || iDigit > com.google.android.gms.internal.measurement.zzkp.values().length || iDigit == 0) {
                        zzkpVar = com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    } else if (iDigit != i13) {
                        zzkpVar = iDigit != i11 ? com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_UNDEFINED : com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                    } else {
                        zzkpVar = com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    }
                }
                builder.put(zzkoVar3, zzkpVar);
                i11 = 2;
                i13 = 1;
            }
            ImmutableMap immutableMapBuildOrThrow = builder.buildOrThrow();
            String strZza3 = zzoe.zza(sharedPreferencesZze, "IABTCF_PurposeConsents");
            String strZza4 = zzoe.zza(sharedPreferencesZze, "IABTCF_VendorConsents");
            boolean z11 = !TextUtils.isEmpty(strZza4) && strZza4.length() >= 755 && strZza4.charAt(754) == '1';
            String strZza5 = zzoe.zza(sharedPreferencesZze, "IABTCF_PurposeLegitimateInterests");
            String strZza6 = zzoe.zza(sharedPreferencesZze, "IABTCF_VendorLegitimateInterests");
            boolean z12 = !TextUtils.isEmpty(strZza6) && strZza6.length() >= 755 && strZza6.charAt(754) == '1';
            cArr[0] = '2';
            zzocVar = new zzoc(zzoe.zzd(immutableMapOfEntries, immutableMapBuildOrThrow, immutableSetM13488of, cArr, iZzb, iZzb5, iZzb3, iZzb2, iZzb4, strZza, strZza3, strZza5, z11, z12, zContains));
        } else {
            String strZza7 = zzoe.zza(sharedPreferencesZze, "IABTCF_VendorConsents");
            if (!"".equals(strZza7) && strZza7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strZza7.charAt(754)));
            }
            int iZzb6 = zzoe.zzb(sharedPreferencesZze, "IABTCF_gdprApplies");
            if (iZzb6 != -1) {
                map.put("gdprApplies", String.valueOf(iZzb6));
            }
            int iZzb7 = zzoe.zzb(sharedPreferencesZze, "IABTCF_EnableAdvertiserConsentMode");
            if (iZzb7 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(iZzb7));
            }
            int iZzb8 = zzoe.zzb(sharedPreferencesZze, "IABTCF_PolicyVersion");
            if (iZzb8 != -1) {
                map.put("PolicyVersion", String.valueOf(iZzb8));
            }
            String strZza8 = zzoe.zza(sharedPreferencesZze, "IABTCF_PurposeConsents");
            if (!"".equals(strZza8)) {
                map.put("PurposeConsents", strZza8);
            }
            int iZzb9 = zzoe.zzb(sharedPreferencesZze, "IABTCF_CmpSdkID");
            if (iZzb9 != -1) {
                map.put("CmpSdkID", String.valueOf(iZzb9));
            }
            zzocVar = new zzoc(map);
        }
        zzibVar.zzaV().zzk().zzb("Tcf preferences read", zzocVar);
        if (!zzibVar.zzc().zzp(null, zzfwVar)) {
            if (zzibVar.zzd().zzm(zzocVar)) {
                Bundle bundleZzb = zzocVar.zzb();
                zzibVar.zzaV().zzk().zzb("Consent generated from Tcf", bundleZzb);
                if (bundleZzb != Bundle.EMPTY) {
                    zzp(bundleZzb, -30, zzibVar.zzaZ().currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", zzocVar.zze());
                zzF("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        zzhg zzhgVarZzd = zzibVar.zzd();
        zzhgVarZzd.zzg();
        String string = zzhgVarZzd.zzd().getString("stored_tcf_param", "");
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            zzocVar2 = new zzoc(map2);
        } else {
            for (String str : string.split(";")) {
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length >= 2 && zzoe.zza.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            zzocVar2 = new zzoc(map2);
        }
        if (zzibVar.zzd().zzm(zzocVar)) {
            Bundle bundleZzb2 = zzocVar.zzb();
            zzibVar.zzaV().zzk().zzb("Consent generated from Tcf", bundleZzb2);
            if (bundleZzb2 != Bundle.EMPTY) {
                zzp(bundleZzb2, -30, zzibVar.zzaZ().currentTimeMillis());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", zzocVar.zzd(zzocVar2));
            bundle2.putString("_tcfd2", zzocVar.zzc());
            bundle2.putString("_tcfd", zzocVar.zze());
            zzF("auto", "_tcf", bundle2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final void zzH(String str, String str2, long j11, Bundle bundle, boolean z11, boolean z12, boolean z13, String str3) {
        boolean z14;
        int i11;
        zzib zzibVar;
        long j12;
        long j13;
        String str4;
        zzib zzibVar2;
        long j14;
        Bundle[] bundleArr;
        String str5 = str;
        Preconditions.checkNotEmpty(str5);
        Preconditions.checkNotNull(bundle);
        zzg();
        zzb();
        zzib zzibVar3 = this.zzu;
        if (!zzibVar3.zzB()) {
            this.zzu.zzaV().zzj().zza("Event not sent since app measurement is disabled");
            return;
        }
        List listZzp = this.zzu.zzv().zzp();
        if (listZzp != null && !listZzp.contains(str2)) {
            this.zzu.zzaV().zzj().zzc("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!zzibVar3.zzp() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzu.zzaY().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.zzu.zzaY());
                } catch (Exception e11) {
                    this.zzu.zzaV().zze().zzb("Failed to invoke Tag Manager's initialize() method", e11);
                }
            } catch (ClassNotFoundException unused) {
                this.zzu.zzaV().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        zzib zzibVar4 = this.zzu;
        if (!zzibVar4.zzc().zzp(null, zzfx.zzbg) && Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2) && bundle.containsKey("gclid")) {
            zzibVar4.zzaU();
            zzN("auto", "_lgclid", bundle.getString("gclid"), zzibVar4.zzaZ().currentTimeMillis());
        }
        zzli zzliVar = this;
        zzibVar4.zzaU();
        if (z11 && zzpo.zzaf(str2)) {
            zzibVar4.zzk().zzI(bundle, zzibVar4.zzd().zzt.zza());
        }
        if (!z13) {
            zzibVar4.zzaU();
            if (!"_iap".equals(str2)) {
                zzib zzibVar5 = zzliVar.zzu;
                zzpo zzpoVarZzk = zzibVar5.zzk();
                int i12 = 2;
                if (zzpoVarZzk.zzj("event", str2)) {
                    if (zzpoVarZzk.zzl("event", zzjl.zza, zzjl.zzb, str2)) {
                        zzpoVarZzk.zzu.zzc();
                        if (zzpoVarZzk.zzm("event", 40, str2)) {
                            i12 = 0;
                        }
                    } else {
                        i12 = 13;
                    }
                }
                if (i12 != 0) {
                    zzibVar4.zzaV().zzd().zzb("Invalid public event name. Event will not be logged (FE)", zzibVar4.zzl().zza(str2));
                    zzpo zzpoVarZzk2 = zzibVar5.zzk();
                    zzibVar5.zzc();
                    zzibVar5.zzk().zzN(zzliVar.zzv, null, i12, "_ev", zzpoVarZzk2.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        zzibVar4.zzaU();
        zzib zzibVar6 = zzliVar.zzu;
        zzlt zzltVarZzh = zzibVar6.zzs().zzh(false);
        if (zzltVarZzh != null && !bundle.containsKey("_sc")) {
            zzltVarZzh.zzd = true;
        }
        zzpo.zzav(zzltVarZzh, bundle, z11 && !z13);
        boolean zEquals = "am".equals(str5);
        boolean zZzZ = zzpo.zzZ(str2);
        if (!z11 || zzliVar.zzd == null || zZzZ) {
            z14 = zEquals;
        } else {
            if (!zEquals) {
                zzibVar4.zzaV().zzj().zzc("Passing event to registered event handler (FE)", zzibVar4.zzl().zza(str2), zzibVar4.zzl().zze(bundle));
                Preconditions.checkNotNull(zzliVar.zzd);
                zzliVar.zzd.interceptEvent(str5, str2, bundle, j11);
                return;
            }
            z14 = true;
        }
        zzib zzibVar7 = zzliVar.zzu;
        if (zzibVar7.zzH()) {
            int iZzn = zzibVar4.zzk().zzn(str2);
            if (iZzn != 0) {
                zzibVar4.zzaV().zzd().zzb("Invalid event name. Event will not be logged (FE)", zzibVar4.zzl().zza(str2));
                zzpo zzpoVarZzk3 = zzibVar4.zzk();
                zzibVar4.zzc();
                zzibVar7.zzk().zzN(zzliVar.zzv, str3, iZzn, "_ev", zzpoVarZzk3.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleZzF = zzibVar4.zzk().zzF(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z13);
            Preconditions.checkNotNull(bundleZzF);
            zzibVar4.zzaU();
            if (zzibVar6.zzs().zzh(false) == null || !"_ae".equals(str2)) {
                i11 = 0;
                zzibVar = zzibVar6;
                j12 = 0;
            } else {
                zznz zznzVar = zzibVar6.zzh().zzb;
                j12 = 0;
                long jElapsedRealtime = zznzVar.zzc.zzu.zzaZ().elapsedRealtime();
                i11 = 0;
                zzibVar = zzibVar6;
                long j15 = jElapsedRealtime - zznzVar.zzb;
                zznzVar.zzb = jElapsedRealtime;
                if (j15 > 0) {
                    zzibVar4.zzk().zzak(bundleZzF, j15);
                }
            }
            if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                zzpo zzpoVarZzk4 = zzibVar4.zzk();
                String string = bundleZzF.getString("_ffr");
                if (Strings.isEmptyOrWhitespace(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                zzib zzibVar8 = zzpoVarZzk4.zzu;
                if (Objects.equals(string, zzibVar8.zzd().zzq.zza())) {
                    zzibVar8.zzaV().zzj().zza("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                zzibVar8.zzd().zzq.zzb(string);
            } else if ("_ae".equals(str2)) {
                String strZza = zzibVar4.zzk().zzu.zzd().zzq.zza();
                if (!TextUtils.isEmpty(strZza)) {
                    bundleZzF.putString("_ffr", strZza);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleZzF);
            boolean zZzi = zzibVar4.zzc().zzp(null, zzfx.zzaU) ? zzibVar.zzh().zzi() : zzibVar4.zzd().zzn.zza();
            if (zzibVar4.zzd().zzk.zza() > j12) {
                zzibVar2 = zzibVar4;
                if (zzibVar4.zzd().zzp(j11) && zZzi) {
                    zzibVar2.zzaV().zzk().zza("Current session is expired, remove the session number, ID, and engagement time");
                    j13 = j12;
                    str4 = "_ae";
                    zzN("auto", "_sid", null, zzibVar2.zzaZ().currentTimeMillis());
                    zzN("auto", "_sno", null, zzibVar2.zzaZ().currentTimeMillis());
                    zzN("auto", "_se", null, zzibVar2.zzaZ().currentTimeMillis());
                    zzliVar = this;
                    zzibVar2.zzd().zzl.zzb(j13);
                } else {
                    j13 = j12;
                    str4 = "_ae";
                }
            } else {
                j13 = j12;
                str4 = "_ae";
                zzibVar2 = zzibVar4;
            }
            if (bundleZzF.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j13) == 1) {
                zzibVar2.zzaV().zzk().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                j14 = j11;
                zzibVar7.zzh().zza.zzb(j14, true);
            } else {
                j14 = j11;
            }
            ArrayList arrayList2 = new ArrayList(bundleZzF.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i13 = i11; i13 < size; i13++) {
                String str6 = (String) arrayList2.get(i13);
                if (str6 != null) {
                    zzibVar2.zzk();
                    Object obj = bundleZzF.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[i11] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleZzF.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i14 = i11;
            while (i14 < arrayList.size()) {
                Bundle bundleZzab = (Bundle) arrayList.get(i14);
                String str7 = i14 != 0 ? "_ep" : str2;
                bundleZzab.putString("_o", str5);
                if (z12) {
                    bundleZzab = zzibVar2.zzk().zzab(bundleZzab, null);
                }
                Bundle bundle2 = bundleZzab;
                zzibVar.zzt().zzn(new zzbg(str7, new zzbe(bundle2), str5, j14), str3);
                if (!z14) {
                    Iterator it = zzliVar.zze.iterator();
                    while (it.hasNext()) {
                        ((zzjp) it.next()).onEvent(str, str2, new Bundle(bundle2), j11);
                    }
                }
                i14++;
                str5 = str;
                j14 = j11;
            }
            zzibVar2.zzaU();
            if (zzibVar.zzs().zzh(i11) == null || !str4.equals(str2)) {
                return;
            }
            zzibVar.zzh().zzb.zzd(true, true, zzibVar2.zzaZ().elapsedRealtime());
        }
    }

    public final /* synthetic */ void zzai(Boolean bool, boolean z11) {
        zzar(bool, true);
    }

    public final /* synthetic */ void zzal(boolean z11) {
        this.zzi = false;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    private final zzlq zzaq(final zzol zzolVar) {
        try {
            URL url = new URI(zzolVar.zzc).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strZzl = this.zzu.zzv().zzl();
            zzib zzibVar = this.zzu;
            zzgr zzgrVarZzk = zzibVar.zzaV().zzk();
            Long lValueOf = Long.valueOf(zzolVar.zza);
            zzgrVarZzk.zzd("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, zzolVar.zzc, Integer.valueOf(zzolVar.zzb.length));
            if (!TextUtils.isEmpty(zzolVar.zzg)) {
                zzibVar.zzaV().zzk().zzc("[sgtm] Uploading data from app. row_id", lValueOf, zzolVar.zzg);
            }
            HashMap map = new HashMap();
            Bundle bundle = zzolVar.zzd;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            zzln zzlnVarZzn = zzibVar.zzn();
            byte[] bArr = zzolVar.zzb;
            zzlk zzlkVar = new zzlk() { // from class: com.google.android.gms.measurement.internal.zzky
                /* JADX WARN: Code duplicated, block: B:10:0x0016  */
                /* JADX WARN: Code duplicated, block: B:11:0x002e A[PHI: r8
                  0x002e: PHI (r8v7 int) = (r8v1 int), (r8v0 int) binds: [B:9:0x0014, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:13:0x0064  */
                /* JADX WARN: Code duplicated, block: B:14:0x0067  */
                @Override // com.google.android.gms.measurement.internal.zzlk
                public final /* synthetic */ void zza(String str2, int i11, Throwable th2, byte[] bArr2, Map map2) {
                    zzlq zzlqVar;
                    zzli zzliVar = this.zza;
                    zzliVar.zzg();
                    zzol zzolVar2 = zzolVar;
                    if (i11 == 200 || i11 == 204) {
                        if (th2 == null) {
                            zzliVar.zzu.zzaV().zzk().zzb("[sgtm] Upload succeeded for row_id", Long.valueOf(zzolVar2.zza));
                            zzlqVar = zzlq.SUCCESS;
                        } else {
                            zzliVar.zzu.zzaV().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzolVar2.zza), Integer.valueOf(i11), th2);
                            if (Arrays.asList(((String) zzfx.zzt.zzb(null)).split(",")).contains(String.valueOf(i11))) {
                                zzlqVar = zzlq.BACKOFF;
                            } else {
                                zzlqVar = zzlq.FAILURE;
                            }
                        }
                    } else if (i11 == 304) {
                        i11 = 304;
                        if (th2 == null) {
                            zzliVar.zzu.zzaV().zzk().zzb("[sgtm] Upload succeeded for row_id", Long.valueOf(zzolVar2.zza));
                            zzlqVar = zzlq.SUCCESS;
                        } else {
                            zzliVar.zzu.zzaV().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzolVar2.zza), Integer.valueOf(i11), th2);
                            if (Arrays.asList(((String) zzfx.zzt.zzb(null)).split(",")).contains(String.valueOf(i11))) {
                                zzlqVar = zzlq.BACKOFF;
                            } else {
                                zzlqVar = zzlq.FAILURE;
                            }
                        }
                    } else {
                        zzliVar.zzu.zzaV().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzolVar2.zza), Integer.valueOf(i11), th2);
                        if (Arrays.asList(((String) zzfx.zzt.zzb(null)).split(",")).contains(String.valueOf(i11))) {
                            zzlqVar = zzlq.BACKOFF;
                        } else {
                            zzlqVar = zzlq.FAILURE;
                        }
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    zznk zznkVarZzt = zzliVar.zzu.zzt();
                    long j11 = zzolVar2.zza;
                    zznkVarZzt.zzy(new zzaf(j11, zzlqVar.zza(), zzolVar2.zzf));
                    zzliVar.zzu.zzaV().zzk().zzc("[sgtm] Updated status for row_id", Long.valueOf(j11), zzlqVar);
                    synchronized (atomicReference2) {
                        atomicReference2.set(zzlqVar);
                        atomicReference2.notifyAll();
                    }
                }
            };
            zzlnVarZzn.zzw();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(bArr);
            Preconditions.checkNotNull(zzlkVar);
            zzlnVarZzn.zzu.zzaW().zzm(new zzlm(zzlnVarZzn, strZzl, url, bArr, map, zzlkVar));
            try {
                zzib zzibVar2 = zzibVar.zzk().zzu;
                long jCurrentTimeMillis = zzibVar2.zzaZ().currentTimeMillis() + 60000;
                synchronized (atomicReference) {
                    for (long jCurrentTimeMillis2 = 60000; atomicReference.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - zzibVar2.zzaZ().currentTimeMillis()) {
                        try {
                            atomicReference.wait(jCurrentTimeMillis2);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.zzu.zzaV().zze().zza("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? zzlq.UNKNOWN : (zzlq) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e11) {
            this.zzu.zzaV().zzb().zzd("[sgtm] Bad upload url for row_id", zzolVar.zzc, Long.valueOf(zzolVar.zza), e11);
            return zzlq.FAILURE;
        }
    }

    public final void zzB(String str, String str2, Bundle bundle) {
        zzC(str, str2, bundle, true, true, this.zzu.zzaZ().currentTimeMillis());
    }

    public final void zzC(String str, String str2, Bundle bundle, boolean z11, boolean z12, long j11) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
            this.zzu.zzs().zzj(bundle2, j11);
            return;
        }
        boolean z13 = true;
        if (z12 && this.zzd != null && !zzpo.zzZ(str2)) {
            z13 = false;
        }
        boolean z14 = z13;
        if (str == null) {
            str = "app";
        }
        zzJ(str, str2, j11, bundle2, z12, z14, z11, null);
    }

    public final void zzJ(String str, String str2, long j11, Bundle bundle, boolean z11, boolean z12, boolean z13, String str3) {
        int i11 = zzpo.zza;
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i12 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i12 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i12];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i12] = new Bundle((Bundle) parcelable);
                        }
                        i12++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i12 < list.size()) {
                        Object obj2 = list.get(i12);
                        if (obj2 instanceof Bundle) {
                            list.set(i12, new Bundle((Bundle) obj2));
                        }
                        i12++;
                    }
                }
            }
        }
        this.zzu.zzaW().zzj(new zzkb(this, str, str2, j11, bundle2, z11, z12, z13, str3));
    }

    public final void zzK(String str, String str2, Object obj, boolean z11) {
        zzL("auto", "_ldl", obj, true, this.zzu.zzaZ().currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    public final void zzL(String str, String str2, Object obj, boolean z11, long j11) {
        int i11;
        int iZzp;
        String str3;
        zzib zzibVar;
        int iZzK;
        Object objZzL;
        if (!z11) {
            zzpo zzpoVarZzk = this.zzu.zzk();
            if (!zzpoVarZzk.zzj("user property", str2)) {
                i11 = 6;
            } else if (zzpoVarZzk.zzl("user property", zzjn.zza, null, str2)) {
                zzpoVarZzk.zzu.zzc();
                if (zzpoVarZzk.zzm("user property", 24, str2)) {
                    i11 = 0;
                } else {
                    i11 = 6;
                }
            } else {
                iZzp = 15;
            }
            if (i11 != 0) {
                zzib zzibVar2 = this.zzu;
                zzpo zzpoVarZzk2 = zzibVar2.zzk();
                zzibVar2.zzc();
                this.zzu.zzk().zzN(this.zzv, null, i11, "_ev", zzpoVarZzk2.zzC(str2, 24, true), str2 != null ? str2.length() : 0);
                return;
            }
            if (str == null) {
                str3 = "app";
            } else {
                str3 = str;
            }
            if (obj != null) {
                zzM(str3, str2, j11, null);
                return;
            }
            zzibVar = this.zzu;
            iZzK = zzibVar.zzk().zzK(str2, obj);
            if (iZzK != 0) {
                objZzL = zzibVar.zzk().zzL(str2, obj);
                if (objZzL != null) {
                    zzM(str3, str2, j11, objZzL);
                    return;
                }
                return;
            }
            zzpo zzpoVarZzk3 = zzibVar.zzk();
            zzibVar.zzc();
            this.zzu.zzk().zzN(this.zzv, null, iZzK, "_ev", zzpoVarZzk3.zzC(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
        }
        iZzp = this.zzu.zzk().zzp(str2);
        i11 = iZzp;
        if (i11 != 0) {
            zzib zzibVar3 = this.zzu;
            zzpo zzpoVarZzk4 = zzibVar3.zzk();
            zzibVar3.zzc();
            if (str2 != null) {
            }
            this.zzu.zzk().zzN(this.zzv, null, i11, "_ev", zzpoVarZzk4.zzC(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (obj != null) {
            zzM(str3, str2, j11, null);
            return;
        }
        zzibVar = this.zzu;
        iZzK = zzibVar.zzk().zzK(str2, obj);
        if (iZzK != 0) {
            objZzL = zzibVar.zzk().zzL(str2, obj);
            if (objZzL != null) {
                zzM(str3, str2, j11, objZzL);
                return;
            }
            return;
        }
        zzpo zzpoVarZzk5 = zzibVar.zzk();
        zzibVar.zzc();
        this.zzu.zzk().zzN(this.zzv, null, iZzK, "_ev", zzpoVarZzk5.zzC(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
    }

    public final void zzM(String str, String str2, long j11, Object obj) {
        this.zzu.zzaW().zzj(new zzkc(this, str, str2, obj, j11));
    }

    public final Map zzP(String str, String str2, boolean z11) {
        zzib zzibVar = this.zzu;
        if (zzibVar.zzaW().zze()) {
            zzibVar.zzaV().zzb().zza("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        zzibVar.zzaU();
        if (zzae.zza()) {
            zzibVar.zzaV().zzb().zza("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaW().zzk(atomicReference, 5000L, "get user properties", new zzkk(this, atomicReference, null, str, str2, z11));
        List<zzpk> list = (List) atomicReference.get();
        if (list == null) {
            zzibVar.zzaV().zzb().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z11));
            return Collections.EMPTY_MAP;
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (zzpk zzpkVar : list) {
            Object objZza = zzpkVar.zza();
            if (objZza != null) {
                arrayMap.put(zzpkVar.zzb, objZza);
            }
        }
        return arrayMap;
    }

    public final String zzQ() {
        return (String) this.zzg.get();
    }

    public final void zzR(String str) {
        this.zzg.set(str);
    }

    public final void zzT(long j11) {
        this.zzg.set(null);
        this.zzu.zzaW().zzj(new zzkg(this, j11));
    }

    public final void zzZ(Bundle bundle) {
        zzaa(bundle, this.zzu.zzaZ().currentTimeMillis());
    }

    public final void zzab(String str, String str2, Bundle bundle) {
        zzib zzibVar = this.zzu;
        long jCurrentTimeMillis = zzibVar.zzaZ().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzibVar.zzaW().zzj(new zzki(this, bundle2));
    }

    public final ArrayList zzac(String str, String str2) {
        zzib zzibVar = this.zzu;
        if (zzibVar.zzaW().zze()) {
            zzibVar.zzaV().zzb().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        zzibVar.zzaU();
        if (zzae.zza()) {
            zzibVar.zzaV().zzb().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaW().zzk(atomicReference, 5000L, "get conditional user properties", new zzkj(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzpo.zzas(list);
        }
        zzibVar.zzaV().zzb().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final String zzad() {
        zzlt zzltVarZzl = this.zzu.zzs().zzl();
        if (zzltVarZzl != null) {
            return zzltVarZzl.zza;
        }
        return null;
    }

    public final String zzae() {
        zzlt zzltVarZzl = this.zzu.zzs().zzl();
        if (zzltVarZzl != null) {
            return zzltVarZzl.zzb;
        }
        return null;
    }

    public final /* synthetic */ void zzaf(SharedPreferences sharedPreferences, String str) {
        zzib zzibVar = this.zzu;
        if (!zzibVar.zzc().zzp(null, zzfx.zzaZ)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                zzibVar.zzaV().zzk().zza("IABTCF_TCString change picked up in listener.");
                ((zzay) Preconditions.checkNotNull(this.zzt)).zzb(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            zzibVar.zzaV().zzk().zza("IABTCF_TCString change picked up in listener.");
            ((zzay) Preconditions.checkNotNull(this.zzt)).zzb(500L);
        }
    }

    public final /* synthetic */ void zzah(int i11) {
        if (this.zzk == null) {
            this.zzk = new zzjw(this, this.zzu);
        }
        this.zzk.zzb(((long) i11) * 1000);
    }

    public final /* synthetic */ int zzam() {
        return this.zzj;
    }

    public final /* synthetic */ void zzan(int i11) {
        this.zzj = i11;
    }

    public final /* synthetic */ zzay zzao() {
        return this.zzr;
    }

    public final void zzh() {
        zzib zzibVar = this.zzu;
        if (!(zzibVar.zzaY().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) zzibVar.zzaY().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzu.zzaW().zzk(atomicReference, C2711C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "boolean test flag value", new zzkd(this, atomicReference));
    }

    public final String zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzu.zzaW().zzk(atomicReference, C2711C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "String test flag value", new zzkn(this, atomicReference));
    }

    public final Long zzk() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzu.zzaW().zzk(atomicReference, C2711C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "long test flag value", new zzko(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzu.zzaW().zzk(atomicReference, C2711C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "int test flag value", new zzkp(this, atomicReference));
    }

    public final Double zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzu.zzaW().zzk(atomicReference, C2711C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "double test flag value", new zzkq(this, atomicReference));
    }

    public final void zzq(zzaz zzazVar, boolean z11) {
        zzks zzksVar = new zzks(this, zzazVar);
        if (!z11) {
            this.zzu.zzaW().zzj(zzksVar);
        } else {
            zzg();
            zzksVar.run();
        }
    }

    public final boolean zzx() {
        return this.zzn;
    }

    @TargetApi(30)
    public final PriorityQueue zzy() {
        if (this.zzm == null) {
            this.zzm = new PriorityQueue(Comparator.comparing(zzlb.zza, zzlc.zza));
        }
        return this.zzm;
    }

    public zzli(zzib zzibVar) {
        super(zzibVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzi = false;
        this.zzj = 1;
        this.zzc = true;
        this.zzv = new zzkm(this);
        this.zzg = new AtomicReference();
        this.zzo = zzjk.zza;
        this.zzq = -1L;
        this.zzp = new AtomicLong(0L);
        this.zzb = new zzx(zzibVar);
    }

    @WorkerThread
    private final void zzar(Boolean bool, boolean z11) {
        zzg();
        zzb();
        zzib zzibVar = this.zzu;
        zzibVar.zzaV().zzj().zzb("Setting app measurement enabled (FE)", bool);
        zzibVar.zzd().zzh(bool);
        if (z11) {
            zzhg zzhgVarZzd = zzibVar.zzd();
            zzib zzibVar2 = zzhgVarZzd.zzu;
            zzhgVarZzd.zzg();
            SharedPreferences.Editor editorEdit = zzhgVarZzd.zzd().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (!this.zzu.zzE() && (bool == null || bool.booleanValue())) {
            return;
        }
        zzak();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: zzas, reason: merged with bridge method [inline-methods] */
    public final void zzak() {
        zzli zzliVar;
        long j11;
        zzg();
        zzib zzibVar = this.zzu;
        String strZza = zzibVar.zzd().zzh.zza();
        if (strZza != null) {
            if ("unset".equals(strZza)) {
                zzliVar = this;
                zzliVar.zzN("app", "_npa", null, zzibVar.zzaZ().currentTimeMillis());
            } else {
                if (true != CredentialEntry.TRUE_STRING.equals(strZza)) {
                    j11 = 0;
                } else {
                    j11 = 1;
                }
                zzN("app", "_npa", Long.valueOf(j11), zzibVar.zzaZ().currentTimeMillis());
                zzliVar = this;
            }
        } else {
            zzliVar = this;
        }
        if (zzliVar.zzu.zzB() && zzliVar.zzc) {
            zzibVar.zzaV().zzj().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzU();
            zzliVar.zzu.zzh().zza.zza();
            zzibVar.zzaW().zzj(new zzjy(this));
            return;
        }
        zzibVar.zzaV().zzj().zza("Updating Scion state (FE)");
        zzliVar.zzu.zzt().zzi();
    }

    @WorkerThread
    public final void zzA(zzjk zzjkVar) {
        boolean z11;
        Boolean boolValueOf;
        zzg();
        if ((zzjkVar.zzo(zzjj.ANALYTICS_STORAGE) && zzjkVar.zzo(zzjj.AD_STORAGE)) || this.zzu.zzt().zzO()) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzib zzibVar = this.zzu;
        if (z11 != zzibVar.zzE()) {
            zzibVar.zzD(z11);
            zzhg zzhgVarZzd = this.zzu.zzd();
            zzib zzibVar2 = zzhgVarZzd.zzu;
            zzhgVarZzd.zzg();
            if (zzhgVarZzd.zzd().contains("measurement_enabled_from_api")) {
                boolValueOf = Boolean.valueOf(zzhgVarZzd.zzd().getBoolean("measurement_enabled_from_api", true));
            } else {
                boolValueOf = null;
            }
            if (!z11 || boolValueOf == null || boolValueOf.booleanValue()) {
                zzar(Boolean.valueOf(z11), false);
            }
        }
    }

    @WorkerThread
    public final void zzE() {
        zzg();
        zzib zzibVar = this.zzu;
        zzibVar.zzaV().zzj().zza("Register tcfPrefChangeListener.");
        if (this.zzs == null) {
            this.zzt = new zzka(this, this.zzu);
            this.zzs = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzld
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.zza.zzaf(sharedPreferences, str);
                }
            };
        }
        zzibVar.zzd().zze().registerOnSharedPreferenceChangeListener(this.zzs);
    }

    @WorkerThread
    public final void zzF(String str, String str2, Bundle bundle) {
        zzg();
        zzG(str, str2, this.zzu.zzaZ().currentTimeMillis(), bundle);
    }

    @WorkerThread
    public final void zzG(String str, String str2, long j11, Bundle bundle) {
        zzg();
        boolean z11 = true;
        if (this.zzd != null && !zzpo.zzZ(str2)) {
            z11 = false;
        }
        zzH(str, str2, j11, bundle, true, z11, true, null);
    }

    public final void zzI(String str, String str2, Bundle bundle, String str3) {
        zzib.zzL();
        zzJ("auto", str2, this.zzu.zzaZ().currentTimeMillis(), bundle, false, true, true, str3);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    @WorkerThread
    public final void zzN(String str, String str2, Object obj, long j11) {
        long j12;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzb();
        Object obj2 = obj;
        if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    String lowerCase = str3.toLowerCase(Locale.ENGLISH);
                    String str4 = CredentialEntry.FALSE_STRING;
                    if (true != CredentialEntry.FALSE_STRING.equals(lowerCase)) {
                        j12 = 0;
                    } else {
                        j12 = 1;
                    }
                    zzib zzibVar = this.zzu;
                    Long lValueOf = Long.valueOf(j12);
                    zzhf zzhfVar = zzibVar.zzd().zzh;
                    if (lValueOf.longValue() == 1) {
                        str4 = CredentialEntry.TRUE_STRING;
                    }
                    zzhfVar.zzb(str4);
                    obj = lValueOf;
                } else if (obj == null) {
                    this.zzu.zzd().zzh.zzb("unset");
                    obj = obj;
                }
                str2 = "_npa";
            } else if (obj == null) {
                this.zzu.zzd().zzh.zzb("unset");
                obj = obj;
                str2 = "_npa";
            }
            this.zzu.zzaV().zzk().zzc("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
            obj2 = obj;
        }
        String str5 = str2;
        Object obj3 = obj2;
        zzib zzibVar2 = this.zzu;
        if (!zzibVar2.zzB()) {
            this.zzu.zzaV().zzk().zza("User property not set since app measurement is disabled");
        } else {
            if (!zzibVar2.zzH()) {
                return;
            }
            this.zzu.zzt().zzA(new zzpk(str5, j11, obj3, str));
        }
    }

    public final List zzO(boolean z11) {
        zzb();
        zzib zzibVar = this.zzu;
        zzibVar.zzaV().zzk().zza("Getting user properties (FE)");
        if (!zzibVar.zzaW().zze()) {
            zzibVar.zzaU();
            if (zzae.zza()) {
                zzibVar.zzaV().zzb().zza("Cannot get all user properties from main thread");
                return Collections.EMPTY_LIST;
            }
            AtomicReference atomicReference = new AtomicReference();
            this.zzu.zzaW().zzk(atomicReference, 5000L, "get user properties", new zzke(this, atomicReference, z11));
            List list = (List) atomicReference.get();
            if (list == null) {
                zzibVar.zzaV().zzb().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z11));
                return Collections.EMPTY_LIST;
            }
            return list;
        }
        zzibVar.zzaV().zzb().zza("Cannot get all user properties from analytics worker thread");
        return Collections.EMPTY_LIST;
    }

    @WorkerThread
    public final void zzS() {
        zzg();
        zzib zzibVar = this.zzu;
        if (!zzibVar.zzd().zzo.zza()) {
            long jZza = zzibVar.zzd().zzp.zza();
            zzibVar.zzd().zzp.zzb(1 + jZza);
            zzibVar.zzc();
            if (jZza >= 5) {
                zzibVar.zzaV().zze().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                zzibVar.zzd().zzo.zzb(true);
                return;
            } else {
                if (this.zzr == null) {
                    this.zzr = new zzkf(this, this.zzu);
                }
                this.zzr.zzb(0L);
                return;
            }
        }
        zzibVar.zzaV().zzj().zza("Deferred Deep Link already retrieved. Not fetching again.");
    }

    @WorkerThread
    public final void zzU() {
        zzg();
        zzb();
        if (this.zzu.zzH()) {
            zzib zzibVar = this.zzu;
            zzal zzalVarZzc = zzibVar.zzc();
            zzalVarZzc.zzu.zzaU();
            Boolean boolZzr = zzalVarZzc.zzr("google_analytics_deferred_deep_link_enabled");
            if (boolZzr != null && boolZzr.booleanValue()) {
                zzibVar.zzaV().zzj().zza("Deferred Deep Link feature enabled.");
                zzibVar.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlg
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzS();
                    }
                });
            }
            this.zzu.zzt().zzE();
            this.zzc = false;
            zzhg zzhgVarZzd = zzibVar.zzd();
            zzhgVarZzd.zzg();
            String string = zzhgVarZzd.zzd().getString("previous_os_version", null);
            zzhgVarZzd.zzu.zzu().zzw();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = zzhgVarZzd.zzd().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                zzibVar.zzu().zzw();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    zzF("auto", "_ou", bundle);
                }
            }
        }
    }

    @WorkerThread
    public final void zzV(zzjo zzjoVar) {
        zzjo zzjoVar2;
        boolean z11;
        zzg();
        zzb();
        if (zzjoVar != null && zzjoVar != (zzjoVar2 = this.zzd)) {
            if (zzjoVar2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkState(z11, "EventInterceptor already set.");
        }
        this.zzd = zzjoVar;
    }

    public final void zzW(zzjp zzjpVar) {
        zzb();
        Preconditions.checkNotNull(zzjpVar);
        if (!this.zze.add(zzjpVar)) {
            this.zzu.zzaV().zze().zza("OnEventListener already registered");
        }
    }

    public final void zzX(zzjp zzjpVar) {
        zzb();
        Preconditions.checkNotNull(zzjpVar);
        if (!this.zze.remove(zzjpVar)) {
            this.zzu.zzaV().zze().zza("OnEventListener had not been registered");
        }
    }

    public final int zzY(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzu.zzc();
        return 25;
    }

    public final void zzaa(Bundle bundle, long j11) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.zzu.zzaV().zze().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzjg.zzb(bundle2, "app_id", String.class, null);
        zzjg.zzb(bundle2, "origin", String.class, null);
        zzjg.zzb(bundle2, "name", String.class, null);
        zzjg.zzb(bundle2, "value", Object.class, null);
        zzjg.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzjg.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzjg.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzjg.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzjg.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzjg.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzjg.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzjg.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzjg.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j11);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        zzib zzibVar = this.zzu;
        if (zzibVar.zzk().zzp(string) == 0) {
            if (zzibVar.zzk().zzK(string, obj) == 0) {
                Object objZzL = zzibVar.zzk().zzL(string, obj);
                if (objZzL == null) {
                    zzibVar.zzaV().zzb().zzc("Unable to normalize conditional user property value", zzibVar.zzl().zzc(string), obj);
                    return;
                }
                zzjg.zza(bundle2, objZzL);
                long j12 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
                if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
                    zzibVar.zzc();
                    if (j12 > 15552000000L || j12 < 1) {
                        zzibVar.zzaV().zzb().zzc("Invalid conditional user property timeout", zzibVar.zzl().zzc(string), Long.valueOf(j12));
                        return;
                    }
                }
                long j13 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
                zzibVar.zzc();
                if (j13 <= 15552000000L && j13 >= 1) {
                    zzibVar.zzaW().zzj(new zzkh(this, bundle2));
                    return;
                } else {
                    zzibVar.zzaV().zzb().zzc("Invalid conditional user property time to live", zzibVar.zzl().zzc(string), Long.valueOf(j13));
                    return;
                }
            }
            zzibVar.zzaV().zzb().zzc("Invalid conditional user property value", zzibVar.zzl().zzc(string), obj);
            return;
        }
        zzibVar.zzaV().zzb().zzb("Invalid conditional user property name", zzibVar.zzl().zzc(string));
    }

    public final /* synthetic */ void zzag(Bundle bundle) {
        Bundle bundle2;
        int i11;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            zzib zzibVar = this.zzu;
            bundle2 = new Bundle(zzibVar.zzd().zzt.zza());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i11 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (zzibVar.zzk().zzt(obj)) {
                        zzibVar.zzk().zzN(this.zzv, null, 27, null, null, 0);
                    }
                    zzibVar.zzaV().zzh().zzc("Invalid default event parameter type. Name, value", next, obj);
                } else if (zzpo.zzZ(next)) {
                    zzibVar.zzaV().zzh().zzb("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (zzibVar.zzk().zzu("param", next, zzibVar.zzc().zze(null, false), obj)) {
                    zzibVar.zzk().zzM(bundle2, next, obj);
                }
            }
            zzibVar.zzk();
            int iZzc = zzibVar.zzc().zzc();
            if (bundle2.size() > iZzc) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i11++;
                    if (i11 > iZzc) {
                        bundle2.remove(str);
                    }
                }
                zzibVar.zzk().zzN(this.zzv, null, 26, null, null, 0);
                zzibVar.zzaV().zzh().zza("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        zzib zzibVar2 = this.zzu;
        zzibVar2.zzd().zzt.zzb(bundle2);
        if (bundle.isEmpty() && !zzibVar2.zzc().zzp(null, zzfx.zzaW)) {
            return;
        }
        this.zzu.zzt().zzH(bundle2);
    }

    public final /* synthetic */ void zzaj(zzjk zzjkVar, long j11, boolean z11, boolean z12) {
        zzg();
        zzb();
        zzib zzibVar = this.zzu;
        zzjk zzjkVarZzl = zzibVar.zzd().zzl();
        if (j11 <= this.zzq && zzjk.zzu(zzjkVarZzl.zzb(), zzjkVar.zzb())) {
            zzibVar.zzaV().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzjkVar);
            return;
        }
        zzhg zzhgVarZzd = zzibVar.zzd();
        zzib zzibVar2 = zzhgVarZzd.zzu;
        zzhgVarZzd.zzg();
        int iZzb = zzjkVar.zzb();
        if (zzhgVarZzd.zzk(iZzb)) {
            zzib zzibVar3 = this.zzu;
            SharedPreferences.Editor editorEdit = zzhgVarZzd.zzd().edit();
            editorEdit.putString("consent_settings", zzjkVar.zzl());
            editorEdit.putInt("consent_source", iZzb);
            editorEdit.apply();
            zzibVar.zzaV().zzk().zzb("Setting storage consent(FE)", zzjkVar);
            this.zzq = j11;
            if (zzibVar3.zzt().zzP()) {
                zzibVar3.zzt().zzk(z11);
            } else {
                zzibVar3.zzt().zzj(z11);
            }
            if (z12) {
                zzibVar3.zzt().zzC(new AtomicReference());
                return;
            }
            return;
        }
        zzibVar.zzaV().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzjkVar.zzb()));
    }

    public final /* synthetic */ int zzap(Throwable th2) {
        String message = th2.getMessage();
        this.zzn = false;
        if (message == null) {
            return 2;
        }
        if (!(th2 instanceof IllegalStateException) && !message.contains("garbage collected") && !th2.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            if (!(th2 instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) {
                return 2;
            }
            return 3;
        }
        if (!message.contains("Background")) {
            return 1;
        }
        this.zzn = true;
        return 1;
    }

    public final void zzn(Boolean bool) {
        zzb();
        this.zzu.zzaW().zzj(new zzkr(this, bool));
    }

    @VisibleForTesting
    public final void zzp(Bundle bundle, int i11, long j11) {
        Object obj;
        String str;
        String string;
        zzb();
        zzjk zzjkVar = zzjk.zza;
        zzjj[] zzjjVarArrZzb = zzji.STORAGE.zzb();
        int length = zzjjVarArrZzb.length;
        int i12 = 0;
        while (true) {
            obj = null;
            if (i12 >= length) {
                break;
            }
            String str2 = zzjjVarArrZzb[i12].zze;
            if (bundle.containsKey(str2) && (string = bundle.getString(str2)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i12++;
        }
        if (obj != null) {
            zzib zzibVar = this.zzu;
            zzibVar.zzaV().zzh().zzb("Ignoring invalid consent setting", obj);
            zzibVar.zzaV().zzh().zza("Valid consent values are 'granted', 'denied'");
        }
        boolean zZze = this.zzu.zzaW().zze();
        zzjk zzjkVarZze = zzjk.zze(bundle, i11);
        if (zzjkVarZze.zzc()) {
            zzs(zzjkVarZze, zZze);
        }
        zzaz zzazVarZzh = zzaz.zzh(bundle, i11);
        if (zzazVarZzh.zzd()) {
            zzq(zzazVarZzh, zZze);
        }
        Boolean boolZzi = zzaz.zzi(bundle);
        if (boolZzi != null) {
            if (i11 == -30) {
                str = "tcf";
            } else {
                str = "app";
            }
            String str3 = str;
            if (zZze) {
                zzN(str3, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, boolZzi.toString(), j11);
            } else {
                zzL(str3, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, boolZzi.toString(), false, j11);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:56:0x00d0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void zzs(com.google.android.gms.measurement.internal.zzjk r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzli.zzs(com.google.android.gms.measurement.internal.zzjk, boolean):void");
    }

    public final void zzt(Runnable runnable) {
        zzb();
        zzib zzibVar = this.zzu;
        if (!zzibVar.zzaW().zze()) {
            if (!zzibVar.zzaW().zzf()) {
                zzibVar.zzaU();
                if (!zzae.zza()) {
                    zzibVar.zzaV().zzk().zza("[sgtm] Started client-side batch upload work.");
                    boolean z11 = false;
                    int size = 0;
                    int i11 = 0;
                    while (!z11) {
                        zzibVar.zzaV().zzk().zza("[sgtm] Getting upload batches from service (FE)");
                        final AtomicReference atomicReference = new AtomicReference();
                        zzibVar.zzaW().zzk(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlh
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzu.zzt().zzx(atomicReference, zzon.zza(zzlr.SGTM_CLIENT));
                            }
                        });
                        zzop zzopVar = (zzop) atomicReference.get();
                        if (zzopVar == null) {
                            break;
                        }
                        List list = zzopVar.zza;
                        if (!list.isEmpty()) {
                            zzibVar.zzaV().zzk().zzb("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                            size += list.size();
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    zzlq zzlqVarZzaq = zzaq((zzol) it.next());
                                    if (zzlqVarZzaq == zzlq.SUCCESS) {
                                        i11++;
                                    } else if (zzlqVarZzaq == zzlq.BACKOFF) {
                                        z11 = true;
                                        break;
                                    }
                                } else {
                                    z11 = false;
                                    break;
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    zzibVar.zzaV().zzk().zzc("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i11));
                    runnable.run();
                    return;
                }
                zzibVar.zzaV().zzb().zza("Cannot retrieve and upload batches from main thread");
                return;
            }
            zzibVar.zzaV().zzb().zza("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        zzibVar.zzaV().zzb().zza("Cannot retrieve and upload batches from analytics worker thread");
    }

    @WorkerThread
    public final void zzu(long j11) {
        zzg();
        if (this.zzl == null) {
            this.zzl = new zzjt(this, this.zzu);
        }
        this.zzl.zzb(j11);
    }

    @WorkerThread
    public final void zzv() {
        zzg();
        zzay zzayVar = this.zzl;
        if (zzayVar != null) {
            zzayVar.zzd();
        }
    }

    public final void zzw() {
        zzql.zza();
        zzib zzibVar = this.zzu;
        if (zzibVar.zzc().zzp(null, zzfx.zzaQ)) {
            if (!zzibVar.zzaW().zze()) {
                zzibVar.zzaU();
                if (!zzae.zza()) {
                    zzb();
                    zzibVar.zzaV().zzk().zza("Getting trigger URIs (FE)");
                    final AtomicReference atomicReference = new AtomicReference();
                    zzibVar.zzaW().zzk(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkz
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzli zzliVar = this.zza;
                            zzliVar.zzu.zzt().zzw(atomicReference, zzliVar.zzu.zzd().zzi.zza());
                        }
                    });
                    final List list = (List) atomicReference.get();
                    if (list == null) {
                        zzibVar.zzaV().zzd().zza("Timed out waiting for get trigger URIs");
                        return;
                    } else {
                        zzibVar.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzla
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzli zzliVar = this.zza;
                                zzliVar.zzg();
                                if (Build.VERSION.SDK_INT < 30) {
                                    return;
                                }
                                List<zzog> list2 = list;
                                SparseArray sparseArrayZzf = zzliVar.zzu.zzd().zzf();
                                for (zzog zzogVar : list2) {
                                    int i11 = zzogVar.zzc;
                                    if (!sparseArrayZzf.contains(i11) || ((Long) sparseArrayZzf.get(i11)).longValue() < zzogVar.zzb) {
                                        zzliVar.zzy().add(zzogVar);
                                    }
                                }
                                zzliVar.zzz();
                            }
                        });
                        return;
                    }
                }
                zzibVar.zzaV().zzb().zza("Cannot get trigger URIs from main thread");
                return;
            }
            zzibVar.zzaV().zzb().zza("Cannot get trigger URIs from analytics worker thread");
        }
    }

    @TargetApi(30)
    @WorkerThread
    public final void zzz() {
        zzog zzogVar;
        zzg();
        this.zzn = false;
        if (!zzy().isEmpty() && !this.zzi && (zzogVar = (zzog) zzy().poll()) != null) {
            zzib zzibVar = this.zzu;
            MeasurementManagerFutures measurementManagerFuturesZzT = zzibVar.zzk().zzT();
            if (measurementManagerFuturesZzT != null) {
                this.zzi = true;
                zzgr zzgrVarZzk = zzibVar.zzaV().zzk();
                String str = zzogVar.zza;
                zzgrVarZzk.zzb("Registering trigger URI", str);
                ListenableFuture<Unit> listenableFutureRegisterTriggerAsync = measurementManagerFuturesZzT.registerTriggerAsync(Uri.parse(str));
                if (listenableFutureRegisterTriggerAsync == null) {
                    this.zzi = false;
                    zzy().add(zzogVar);
                } else {
                    Futures.addCallback(listenableFutureRegisterTriggerAsync, new zzjv(this, zzogVar), new zzju(this));
                }
            }
        }
    }
}
