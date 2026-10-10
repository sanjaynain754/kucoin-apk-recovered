package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzli extends com.google.android.gms.measurement.internal.zzg {

    @androidx.annotation.VisibleForTesting
    protected com.google.android.gms.measurement.internal.zzkx zza;
    final com.google.android.gms.measurement.internal.zzx zzb;

    @androidx.annotation.VisibleForTesting
    protected boolean zzc;
    private com.google.android.gms.measurement.internal.zzjo zzd;
    private final java.util.Set zze;
    private boolean zzf;
    private final java.util.concurrent.atomic.AtomicReference zzg;
    private final java.lang.Object zzh;
    private boolean zzi;
    private int zzj;
    private com.google.android.gms.measurement.internal.zzay zzk;
    private com.google.android.gms.measurement.internal.zzay zzl;
    private java.util.PriorityQueue zzm;
    private boolean zzn;

    @androidx.annotation.GuardedBy("consentLock")
    private com.google.android.gms.measurement.internal.zzjk zzo;
    private final java.util.concurrent.atomic.AtomicLong zzp;
    private long zzq;
    private com.google.android.gms.measurement.internal.zzay zzr;
    private android.content.SharedPreferences.OnSharedPreferenceChangeListener zzs;
    private com.google.android.gms.measurement.internal.zzay zzt;
    private final com.google.android.gms.measurement.internal.zzpn zzv;

    public zzli(com.google.android.gms.measurement.internal.zzib r4) {
            r3 = this;
            r3.<init>(r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r3.zze = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.zzh = r0
            r0 = 0
            r3.zzi = r0
            r0 = 1
            r3.zzj = r0
            r3.zzc = r0
            com.google.android.gms.measurement.internal.zzkm r0 = new com.google.android.gms.measurement.internal.zzkm
            r0.<init>(r3)
            r3.zzv = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r3.zzg = r0
            com.google.android.gms.measurement.internal.zzjk r0 = com.google.android.gms.measurement.internal.zzjk.zza
            r3.zzo = r0
            r0 = -1
            r3.zzq = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            r3.zzp = r0
            com.google.android.gms.measurement.internal.zzx r0 = new com.google.android.gms.measurement.internal.zzx
            r0.<init>(r4)
            r3.zzb = r0
            return
    }

    private final com.google.android.gms.measurement.internal.zzlq zzaq(com.google.android.gms.measurement.internal.zzol r11) {
            r10 = this;
            java.net.URI r0 = new java.net.URI     // Catch: java.net.MalformedURLException -> Lf0 java.net.URISyntaxException -> Lf2
            java.lang.String r1 = r11.zzc     // Catch: java.net.MalformedURLException -> Lf0 java.net.URISyntaxException -> Lf2
            r0.<init>(r1)     // Catch: java.net.MalformedURLException -> Lf0 java.net.URISyntaxException -> Lf2
            java.net.URL r5 = r0.toURL()     // Catch: java.net.MalformedURLException -> Lf0 java.net.URISyntaxException -> Lf2
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            com.google.android.gms.measurement.internal.zzib r0 = r10.zzu
            com.google.android.gms.measurement.internal.zzgh r0 = r0.zzv()
            java.lang.String r4 = r0.zzl()
            com.google.android.gms.measurement.internal.zzib r0 = r10.zzu
            com.google.android.gms.measurement.internal.zzgt r2 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzk()
            long r6 = r11.zza
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = r11.zzc
            byte[] r7 = r11.zzb
            int r7 = r7.length
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "[sgtm] Uploading data from app. row_id, url, uncompressed size"
            r2.zzd(r8, r3, r6, r7)
            java.lang.String r2 = r11.zzg
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L4f
            com.google.android.gms.measurement.internal.zzgt r2 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzk()
            java.lang.String r6 = r11.zzg
            java.lang.String r7 = "[sgtm] Uploading data from app. row_id"
            r2.zzc(r7, r3, r6)
        L4f:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            android.os.Bundle r2 = r11.zzd
            java.util.Set r3 = r2.keySet()
            java.util.Iterator r3 = r3.iterator()
        L5e:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L78
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r8 = r2.getString(r6)
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L5e
            r7.put(r6, r8)
            goto L5e
        L78:
            com.google.android.gms.measurement.internal.zzln r3 = r0.zzn()
            byte[] r6 = r11.zzb
            com.google.android.gms.measurement.internal.zzky r8 = new com.google.android.gms.measurement.internal.zzky
            r8.<init>(r10, r1, r11)
            r3.zzw()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            com.google.android.gms.measurement.internal.zzib r11 = r3.zzu
            com.google.android.gms.measurement.internal.zzhy r11 = r11.zzaW()
            com.google.android.gms.measurement.internal.zzlm r2 = new com.google.android.gms.measurement.internal.zzlm
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r11.zzm(r2)
            com.google.android.gms.measurement.internal.zzpo r11 = r0.zzk()     // Catch: java.lang.InterruptedException -> Ld1
            com.google.android.gms.measurement.internal.zzib r11 = r11.zzu     // Catch: java.lang.InterruptedException -> Ld1
            com.google.android.gms.common.util.Clock r0 = r11.zzaZ()     // Catch: java.lang.InterruptedException -> Ld1
            long r2 = r0.currentTimeMillis()     // Catch: java.lang.InterruptedException -> Ld1
            r4 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 + r4
            monitor-enter(r1)     // Catch: java.lang.InterruptedException -> Ld1
        Lb0:
            java.lang.Object r0 = r1.get()     // Catch: java.lang.Throwable -> Lca
            if (r0 != 0) goto Lcd
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto Lcd
            r1.wait(r4)     // Catch: java.lang.Throwable -> Lca
            com.google.android.gms.common.util.Clock r0 = r11.zzaZ()     // Catch: java.lang.Throwable -> Lca
            long r4 = r0.currentTimeMillis()     // Catch: java.lang.Throwable -> Lca
            long r4 = r2 - r4
            goto Lb0
        Lca:
            r0 = move-exception
            r11 = r0
            goto Lcf
        Lcd:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lca
            goto Le0
        Lcf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lca
            throw r11     // Catch: java.lang.InterruptedException -> Ld1
        Ld1:
            com.google.android.gms.measurement.internal.zzib r11 = r10.zzu
            com.google.android.gms.measurement.internal.zzgt r11 = r11.zzaV()
            com.google.android.gms.measurement.internal.zzgr r11 = r11.zze()
            java.lang.String r0 = "[sgtm] Interrupted waiting for uploading batch"
            r11.zza(r0)
        Le0:
            java.lang.Object r11 = r1.get()
            if (r11 != 0) goto Le9
            com.google.android.gms.measurement.internal.zzlq r11 = com.google.android.gms.measurement.internal.zzlq.zza
            goto Lef
        Le9:
            java.lang.Object r11 = r1.get()
            com.google.android.gms.measurement.internal.zzlq r11 = (com.google.android.gms.measurement.internal.zzlq) r11
        Lef:
            return r11
        Lf0:
            r0 = move-exception
            goto Lf3
        Lf2:
            r0 = move-exception
        Lf3:
            com.google.android.gms.measurement.internal.zzib r1 = r10.zzu
            com.google.android.gms.measurement.internal.zzgt r1 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzb()
            java.lang.String r2 = r11.zzc
            long r3 = r11.zza
            java.lang.Long r11 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "[sgtm] Bad upload url for row_id"
            r1.zzd(r3, r2, r11, r0)
            com.google.android.gms.measurement.internal.zzlq r11 = com.google.android.gms.measurement.internal.zzlq.zzc
            return r11
    }

    @androidx.annotation.WorkerThread
    private final void zzar(java.lang.Boolean r4, boolean r5) {
            r3 = this;
            r3.zzg()
            r3.zzb()
            com.google.android.gms.measurement.internal.zzib r0 = r3.zzu
            com.google.android.gms.measurement.internal.zzgt r1 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzj()
            java.lang.String r2 = "Setting app measurement enabled (FE)"
            r1.zzb(r2, r4)
            com.google.android.gms.measurement.internal.zzhg r1 = r0.zzd()
            r1.zzh(r4)
            if (r5 == 0) goto L41
            com.google.android.gms.measurement.internal.zzhg r5 = r0.zzd()
            com.google.android.gms.measurement.internal.zzib r0 = r5.zzu
            r5.zzg()
            android.content.SharedPreferences r5 = r5.zzd()
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r0 = "measurement_enabled_from_api"
            if (r4 == 0) goto L3b
            boolean r1 = r4.booleanValue()
            r5.putBoolean(r0, r1)
            goto L3e
        L3b:
            r5.remove(r0)
        L3e:
            r5.apply()
        L41:
            com.google.android.gms.measurement.internal.zzib r5 = r3.zzu
            boolean r5 = r5.zzE()
            if (r5 != 0) goto L53
            if (r4 == 0) goto L52
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L52
            goto L53
        L52:
            return
        L53:
            r3.zzas()
            return
    }

    @androidx.annotation.WorkerThread
    private final void zzas() {
            r14 = this;
            r14.zzg()
            com.google.android.gms.measurement.internal.zzib r0 = r14.zzu
            com.google.android.gms.measurement.internal.zzhg r1 = r0.zzd()
            com.google.android.gms.measurement.internal.zzhf r1 = r1.zzh
            java.lang.String r1 = r1.zza()
            if (r1 == 0) goto L51
            java.lang.String r2 = "unset"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L2c
            com.google.android.gms.common.util.Clock r1 = r0.zzaZ()
            long r6 = r1.currentTimeMillis()
            java.lang.String r4 = "_npa"
            r5 = 0
            java.lang.String r3 = "app"
            r2 = r14
            r2.zzN(r3, r4, r5, r6)
            goto L52
        L2c:
            java.lang.String r2 = "true"
            boolean r1 = r2.equals(r1)
            r2 = 1
            if (r2 == r1) goto L39
            r1 = 0
            goto L3b
        L39:
            r1 = 1
        L3b:
            java.lang.Long r11 = java.lang.Long.valueOf(r1)
            com.google.android.gms.common.util.Clock r1 = r0.zzaZ()
            long r12 = r1.currentTimeMillis()
            java.lang.String r9 = "app"
            java.lang.String r10 = "_npa"
            r8 = r14
            r8.zzN(r9, r10, r11, r12)
            r2 = r8
            goto L52
        L51:
            r2 = r14
        L52:
            com.google.android.gms.measurement.internal.zzib r1 = r2.zzu
            boolean r1 = r1.zzB()
            if (r1 == 0) goto L86
            boolean r1 = r2.zzc
            if (r1 == 0) goto L86
            com.google.android.gms.measurement.internal.zzgt r1 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzj()
            java.lang.String r3 = "Recording app launch after enabling measurement for the first time (FE)"
            r1.zza(r3)
            r14.zzU()
            com.google.android.gms.measurement.internal.zzib r1 = r2.zzu
            com.google.android.gms.measurement.internal.zzob r1 = r1.zzh()
            com.google.android.gms.measurement.internal.zzoa r1 = r1.zza
            r1.zza()
            com.google.android.gms.measurement.internal.zzhy r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzjy r1 = new com.google.android.gms.measurement.internal.zzjy
            r1.<init>(r14)
            r0.zzj(r1)
            return
        L86:
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzj()
            java.lang.String r1 = "Updating Scion state (FE)"
            r0.zza(r1)
            com.google.android.gms.measurement.internal.zzib r0 = r2.zzu
            com.google.android.gms.measurement.internal.zznk r0 = r0.zzt()
            r0.zzi()
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzA(com.google.android.gms.measurement.internal.zzjk r6) {
            r5 = this;
            r5.zzg()
            com.google.android.gms.measurement.internal.zzjj r0 = com.google.android.gms.measurement.internal.zzjj.zzb
            boolean r0 = r6.zzo(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            com.google.android.gms.measurement.internal.zzjj r0 = com.google.android.gms.measurement.internal.zzjj.zza
            boolean r6 = r6.zzo(r0)
            if (r6 != 0) goto L16
            goto L18
        L16:
            r6 = r2
            goto L26
        L18:
            com.google.android.gms.measurement.internal.zzib r6 = r5.zzu
            com.google.android.gms.measurement.internal.zznk r6 = r6.zzt()
            boolean r6 = r6.zzO()
            if (r6 == 0) goto L25
            goto L16
        L25:
            r6 = r1
        L26:
            com.google.android.gms.measurement.internal.zzib r0 = r5.zzu
            boolean r3 = r0.zzE()
            if (r6 == r3) goto L67
            r0.zzD(r6)
            com.google.android.gms.measurement.internal.zzib r0 = r5.zzu
            com.google.android.gms.measurement.internal.zzhg r0 = r0.zzd()
            com.google.android.gms.measurement.internal.zzib r3 = r0.zzu
            r0.zzg()
            android.content.SharedPreferences r3 = r0.zzd()
            java.lang.String r4 = "measurement_enabled_from_api"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L55
            android.content.SharedPreferences r0 = r0.zzd()
            boolean r0 = r0.getBoolean(r4, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L56
        L55:
            r0 = 0
        L56:
            if (r6 == 0) goto L60
            if (r0 == 0) goto L60
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L67
        L60:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5.zzar(r6, r1)
        L67:
            return
    }

    public final void zzB(java.lang.String r10, java.lang.String r11, android.os.Bundle r12) {
            r9 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r9.zzu
            com.google.android.gms.common.util.Clock r0 = r0.zzaZ()
            long r7 = r0.currentTimeMillis()
            r5 = 1
            r6 = 1
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r1.zzC(r2, r3, r4, r5, r6, r7)
            return
    }

    public final void zzC(java.lang.String r11, java.lang.String r12, android.os.Bundle r13, boolean r14, boolean r15, long r16) {
            r10 = this;
            if (r13 != 0) goto L7
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
        L7:
            r5 = r13
            java.lang.String r13 = "screen_view"
            boolean r13 = java.util.Objects.equals(r12, r13)
            if (r13 == 0) goto L1c
            com.google.android.gms.measurement.internal.zzib r11 = r10.zzu
            com.google.android.gms.measurement.internal.zzma r11 = r11.zzs()
            r3 = r16
            r11.zzj(r5, r3)
            return
        L1c:
            r3 = r16
            r13 = 1
            if (r15 == 0) goto L2b
            com.google.android.gms.measurement.internal.zzjo r0 = r10.zzd
            if (r0 == 0) goto L2b
            boolean r0 = com.google.android.gms.measurement.internal.zzpo.zzZ(r12)
            if (r0 == 0) goto L2d
        L2b:
            r7 = r13
            goto L2f
        L2d:
            r13 = 0
            goto L2b
        L2f:
            if (r11 != 0) goto L33
            java.lang.String r11 = "app"
        L33:
            r1 = r11
            r9 = 0
            r0 = r10
            r2 = r12
            r8 = r14
            r6 = r15
            r0.zzJ(r1, r2, r3, r5, r6, r7, r8, r9)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzD() {
            r35 = this;
            r0 = r35
            r0.zzg()
            com.google.android.gms.measurement.internal.zzib r2 = r0.zzu
            com.google.android.gms.measurement.internal.zzgt r3 = r2.zzaV()
            com.google.android.gms.measurement.internal.zzgr r3 = r3.zzj()
            java.lang.String r4 = "Handle tcf update."
            r3.zza(r4)
            com.google.android.gms.measurement.internal.zzhg r3 = r2.zzd()
            android.content.SharedPreferences r3 = r3.zze()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.google.android.gms.measurement.internal.zzfw r5 = com.google.android.gms.measurement.internal.zzfx.zzaZ
            r6 = 0
            java.lang.Object r7 = r5.zzb(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.String r8 = "IABTCF_VendorConsents"
            java.lang.String r9 = "IABTCF_PurposeConsents"
            java.lang.String r11 = "IABTCF_EnableAdvertiserConsentMode"
            java.lang.String r12 = "IABTCF_gdprApplies"
            java.lang.String r13 = "IABTCF_PolicyVersion"
            java.lang.String r14 = "IABTCF_CmpSdkID"
            java.lang.String r15 = ""
            r16 = 2
            r17 = 0
            if (r7 == 0) goto L19c
            int r4 = com.google.android.gms.measurement.internal.zzoe.zzb
            com.google.android.gms.internal.measurement.zzko r4 = com.google.android.gms.internal.measurement.zzko.zzb
            com.google.android.gms.measurement.internal.zzod r7 = com.google.android.gms.measurement.internal.zzod.zza
            java.util.Map$Entry r4 = com.google.android.gms.measurement.internal.C7080f.m12912a(r4, r7)
            r18 = 1
            com.google.android.gms.internal.measurement.zzko r6 = com.google.android.gms.internal.measurement.zzko.zzc
            com.google.android.gms.measurement.internal.zzod r10 = com.google.android.gms.measurement.internal.zzod.zzd
            java.util.Map$Entry r6 = com.google.android.gms.measurement.internal.C7080f.m12912a(r6, r10)
            r19 = 5
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzd
            java.util.Map$Entry r1 = com.google.android.gms.measurement.internal.C7080f.m12912a(r1, r7)
            r20 = r1
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zze
            java.util.Map$Entry r1 = com.google.android.gms.measurement.internal.C7080f.m12912a(r1, r7)
            com.google.android.gms.internal.measurement.zzko r7 = com.google.android.gms.internal.measurement.zzko.zzh
            java.util.Map$Entry r7 = com.google.android.gms.measurement.internal.C7080f.m12912a(r7, r10)
            r21 = r1
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzj
            java.util.Map$Entry r1 = com.google.android.gms.measurement.internal.C7080f.m12912a(r1, r10)
            r22 = r1
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzk
            java.util.Map$Entry r1 = com.google.android.gms.measurement.internal.C7080f.m12912a(r1, r10)
            r10 = 7
            java.util.Map$Entry[] r10 = new java.util.Map.Entry[r10]
            r10[r17] = r4
            r10[r18] = r6
            r10[r16] = r20
            r4 = 3
            r10[r4] = r21
            r4 = 4
            r10[r4] = r7
            r10[r19] = r22
            r4 = 6
            r10[r4] = r1
            com.google.common.collect.ImmutableMap r20 = com.google.common.collect.ImmutableMap.ofEntries(r10)
            java.lang.String r1 = "CH"
            com.google.common.collect.ImmutableSet r22 = com.google.common.collect.ImmutableSet.m13488of(r1)
            r1 = r19
            char[] r1 = new char[r1]
            java.lang.String r4 = "IABTCF_TCString"
            boolean r34 = r3.contains(r4)
            int r24 = com.google.android.gms.measurement.internal.zzoe.zzb(r3, r14)
            int r27 = com.google.android.gms.measurement.internal.zzoe.zzb(r3, r13)
            int r26 = com.google.android.gms.measurement.internal.zzoe.zzb(r3, r12)
            java.lang.String r4 = "IABTCF_PurposeOneTreatment"
            int r28 = com.google.android.gms.measurement.internal.zzoe.zzb(r3, r4)
            int r25 = com.google.android.gms.measurement.internal.zzoe.zzb(r3, r11)
            java.lang.String r4 = "IABTCF_PublisherCC"
            java.lang.String r29 = com.google.android.gms.measurement.internal.zzoe.zza(r3, r4)
            com.google.common.collect.ImmutableMap$Builder r4 = com.google.common.collect.ImmutableMap.builder()
            com.google.common.collect.ImmutableSet r6 = r20.keySet()
            com.google.common.collect.UnmodifiableIterator r6 = r6.iterator()
        Lcc:
            boolean r7 = r6.hasNext()
            r10 = 755(0x2f3, float:1.058E-42)
            if (r7 == 0) goto L140
            java.lang.Object r7 = r6.next()
            com.google.android.gms.internal.measurement.zzko r7 = (com.google.android.gms.internal.measurement.zzko) r7
            int r11 = r7.zza()
            java.lang.String r12 = java.lang.String.valueOf(r11)
            int r12 = r12.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r12 = r12 + 28
            r13.<init>(r12)
            java.lang.String r12 = "IABTCF_PublisherRestrictions"
            r13.append(r12)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            java.lang.String r11 = com.google.android.gms.measurement.internal.zzoe.zza(r3, r11)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L136
            int r12 = r11.length()
            if (r12 >= r10) goto L10a
            goto L136
        L10a:
            r10 = 754(0x2f2, float:1.057E-42)
            char r11 = r11.charAt(r10)
            r10 = 10
            int r10 = java.lang.Character.digit(r11, r10)
            if (r10 < 0) goto L133
            com.google.android.gms.internal.measurement.zzkp[] r11 = com.google.android.gms.internal.measurement.zzkp.values()
            int r11 = r11.length
            if (r10 <= r11) goto L120
            goto L133
        L120:
            if (r10 == 0) goto L133
            r11 = r18
            if (r10 == r11) goto L130
            r11 = r16
            if (r10 == r11) goto L12d
            com.google.android.gms.internal.measurement.zzkp r10 = com.google.android.gms.internal.measurement.zzkp.zzd
            goto L138
        L12d:
            com.google.android.gms.internal.measurement.zzkp r10 = com.google.android.gms.internal.measurement.zzkp.zzc
            goto L138
        L130:
            com.google.android.gms.internal.measurement.zzkp r10 = com.google.android.gms.internal.measurement.zzkp.zzb
            goto L138
        L133:
            com.google.android.gms.internal.measurement.zzkp r10 = com.google.android.gms.internal.measurement.zzkp.zza
            goto L138
        L136:
            com.google.android.gms.internal.measurement.zzkp r10 = com.google.android.gms.internal.measurement.zzkp.zzd
        L138:
            r4.put(r7, r10)
            r16 = 2
            r18 = 1
            goto Lcc
        L140:
            com.google.common.collect.ImmutableMap r21 = r4.buildOrThrow()
            java.lang.String r30 = com.google.android.gms.measurement.internal.zzoe.zza(r3, r9)
            java.lang.String r4 = com.google.android.gms.measurement.internal.zzoe.zza(r3, r8)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r7 = 49
            if (r6 != 0) goto L165
            int r6 = r4.length()
            if (r6 < r10) goto L165
            r6 = 754(0x2f2, float:1.057E-42)
            char r4 = r4.charAt(r6)
            if (r4 != r7) goto L165
            r32 = 1
            goto L167
        L165:
            r32 = r17
        L167:
            java.lang.String r4 = "IABTCF_PurposeLegitimateInterests"
            java.lang.String r31 = com.google.android.gms.measurement.internal.zzoe.zza(r3, r4)
            java.lang.String r4 = "IABTCF_VendorLegitimateInterests"
            java.lang.String r3 = com.google.android.gms.measurement.internal.zzoe.zza(r3, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L18a
            int r4 = r3.length()
            if (r4 < r10) goto L18a
            r6 = 754(0x2f2, float:1.057E-42)
            char r3 = r3.charAt(r6)
            if (r3 != r7) goto L18a
            r33 = 1
            goto L18c
        L18a:
            r33 = r17
        L18c:
            r3 = 50
            r1[r17] = r3
            com.google.android.gms.measurement.internal.zzoc r3 = new com.google.android.gms.measurement.internal.zzoc
            r23 = r1
            java.util.Map r1 = com.google.android.gms.measurement.internal.zzoe.zzd(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r3.<init>(r1)
            goto L20c
        L19c:
            java.lang.String r1 = com.google.android.gms.measurement.internal.zzoe.zza(r3, r8)
            boolean r6 = r15.equals(r1)
            if (r6 != 0) goto L1bb
            int r6 = r1.length()
            r10 = 754(0x2f2, float:1.057E-42)
            if (r6 <= r10) goto L1bb
            char r1 = r1.charAt(r10)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r6 = "GoogleConsent"
            r4.put(r6, r1)
        L1bb:
            int r1 = com.google.android.gms.measurement.internal.zzoe.zzb(r3, r12)
            r6 = -1
            if (r1 == r6) goto L1cb
            java.lang.String r7 = "gdprApplies"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4.put(r7, r1)
        L1cb:
            int r1 = com.google.android.gms.measurement.internal.zzoe.zzb(r3, r11)
            if (r1 == r6) goto L1da
            java.lang.String r7 = "EnableAdvertiserConsentMode"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4.put(r7, r1)
        L1da:
            int r1 = com.google.android.gms.measurement.internal.zzoe.zzb(r3, r13)
            if (r1 == r6) goto L1e9
            java.lang.String r7 = "PolicyVersion"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4.put(r7, r1)
        L1e9:
            java.lang.String r1 = com.google.android.gms.measurement.internal.zzoe.zza(r3, r9)
            boolean r7 = r15.equals(r1)
            if (r7 != 0) goto L1f8
            java.lang.String r7 = "PurposeConsents"
            r4.put(r7, r1)
        L1f8:
            int r1 = com.google.android.gms.measurement.internal.zzoe.zzb(r3, r14)
            if (r1 == r6) goto L207
            java.lang.String r3 = "CmpSdkID"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4.put(r3, r1)
        L207:
            com.google.android.gms.measurement.internal.zzoc r3 = new com.google.android.gms.measurement.internal.zzoc
            r3.<init>(r4)
        L20c:
            com.google.android.gms.measurement.internal.zzgt r1 = r2.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzk()
            java.lang.String r4 = "Tcf preferences read"
            r1.zzb(r4, r3)
            com.google.android.gms.measurement.internal.zzal r1 = r2.zzc()
            r4 = 0
            boolean r1 = r1.zzp(r4, r5)
            java.lang.String r4 = "_tcf"
            java.lang.String r5 = "auto"
            java.lang.String r6 = "_tcfd"
            r7 = -30
            java.lang.String r8 = "Consent generated from Tcf"
            if (r1 == 0) goto L2d0
            com.google.android.gms.measurement.internal.zzhg r1 = r2.zzd()
            r1.zzg()
            android.content.SharedPreferences r1 = r1.zzd()
            java.lang.String r9 = "stored_tcf_param"
            java.lang.String r1 = r1.getString(r9, r15)
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            boolean r10 = android.text.TextUtils.isEmpty(r1)
            if (r10 == 0) goto L251
            com.google.android.gms.measurement.internal.zzoc r1 = new com.google.android.gms.measurement.internal.zzoc
            r1.<init>(r9)
            goto L286
        L251:
            java.lang.String r10 = ";"
            java.lang.String[] r1 = r1.split(r10)
            int r10 = r1.length
            r11 = r17
        L25a:
            if (r11 >= r10) goto L281
            r12 = r1[r11]
            java.lang.String r13 = "="
            java.lang.String[] r12 = r12.split(r13)
            int r13 = r12.length
            r14 = 2
            if (r13 < r14) goto L27c
            com.google.common.collect.ImmutableList r13 = com.google.android.gms.measurement.internal.zzoe.zza
            r15 = r12[r17]
            boolean r13 = r13.contains(r15)
            if (r13 == 0) goto L27c
            r13 = r12[r17]
            r18 = 1
            r12 = r12[r18]
            r9.put(r13, r12)
            goto L27e
        L27c:
            r18 = 1
        L27e:
            int r11 = r11 + 1
            goto L25a
        L281:
            com.google.android.gms.measurement.internal.zzoc r1 = new com.google.android.gms.measurement.internal.zzoc
            r1.<init>(r9)
        L286:
            com.google.android.gms.measurement.internal.zzhg r9 = r2.zzd()
            boolean r9 = r9.zzm(r3)
            if (r9 == 0) goto L307
            android.os.Bundle r9 = r3.zzb()
            com.google.android.gms.measurement.internal.zzgt r10 = r2.zzaV()
            com.google.android.gms.measurement.internal.zzgr r10 = r10.zzk()
            r10.zzb(r8, r9)
            android.os.Bundle r8 = android.os.Bundle.EMPTY
            if (r9 == r8) goto L2ae
            com.google.android.gms.common.util.Clock r2 = r2.zzaZ()
            long r10 = r2.currentTimeMillis()
            r0.zzp(r9, r7, r10)
        L2ae:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r1 = r3.zzd(r1)
            java.lang.String r7 = "_tcfm"
            r2.putString(r7, r1)
            java.lang.String r1 = r3.zzc()
            java.lang.String r7 = "_tcfd2"
            r2.putString(r7, r1)
            java.lang.String r1 = r3.zze()
            r2.putString(r6, r1)
            r0.zzF(r5, r4, r2)
            return
        L2d0:
            com.google.android.gms.measurement.internal.zzhg r1 = r2.zzd()
            boolean r1 = r1.zzm(r3)
            if (r1 == 0) goto L307
            android.os.Bundle r1 = r3.zzb()
            com.google.android.gms.measurement.internal.zzgt r9 = r2.zzaV()
            com.google.android.gms.measurement.internal.zzgr r9 = r9.zzk()
            r9.zzb(r8, r1)
            android.os.Bundle r8 = android.os.Bundle.EMPTY
            if (r1 == r8) goto L2f8
            com.google.android.gms.common.util.Clock r2 = r2.zzaZ()
            long r8 = r2.currentTimeMillis()
            r0.zzp(r1, r7, r8)
        L2f8:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = r3.zze()
            r1.putString(r6, r2)
            r0.zzF(r5, r4, r1)
        L307:
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzE() {
            r3 = this;
            r3.zzg()
            com.google.android.gms.measurement.internal.zzib r0 = r3.zzu
            com.google.android.gms.measurement.internal.zzgt r1 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzj()
            java.lang.String r2 = "Register tcfPrefChangeListener."
            r1.zza(r2)
            android.content.SharedPreferences$OnSharedPreferenceChangeListener r1 = r3.zzs
            if (r1 != 0) goto L26
            com.google.android.gms.measurement.internal.zzib r1 = r3.zzu
            com.google.android.gms.measurement.internal.zzka r2 = new com.google.android.gms.measurement.internal.zzka
            r2.<init>(r3, r1)
            r3.zzt = r2
            com.google.android.gms.measurement.internal.zzld r1 = new com.google.android.gms.measurement.internal.zzld
            r1.<init>(r3)
            r3.zzs = r1
        L26:
            com.google.android.gms.measurement.internal.zzhg r0 = r0.zzd()
            android.content.SharedPreferences r0 = r0.zze()
            android.content.SharedPreferences$OnSharedPreferenceChangeListener r1 = r3.zzs
            r0.registerOnSharedPreferenceChangeListener(r1)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzF(java.lang.String r8, java.lang.String r9, android.os.Bundle r10) {
            r7 = this;
            r7.zzg()
            com.google.android.gms.measurement.internal.zzib r0 = r7.zzu
            com.google.android.gms.common.util.Clock r0 = r0.zzaZ()
            long r4 = r0.currentTimeMillis()
            r1 = r7
            r2 = r8
            r3 = r9
            r6 = r10
            r1.zzG(r2, r3, r4, r6)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzG(java.lang.String r11, java.lang.String r12, long r13, android.os.Bundle r15) {
            r10 = this;
            r10.zzg()
            com.google.android.gms.measurement.internal.zzjo r1 = r10.zzd
            r2 = 1
            if (r1 == 0) goto Le
            boolean r1 = com.google.android.gms.measurement.internal.zzpo.zzZ(r12)
            if (r1 == 0) goto L10
        Le:
            r7 = r2
            goto L12
        L10:
            r2 = 0
            goto Le
        L12:
            r8 = 1
            r9 = 0
            r6 = 1
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r15
            r0.zzH(r1, r2, r3, r5, r6, r7, r8, r9)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzH(java.lang.String r21, java.lang.String r22, long r23, android.os.Bundle r25, boolean r26, boolean r27, boolean r28, java.lang.String r29) {
            r20 = this;
            r1 = r20
            r7 = r21
            r8 = r22
            r9 = r25
            r10 = 1
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            r1.zzg()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzu
            boolean r2 = r0.zzB()
            if (r2 == 0) goto L4b9
            com.google.android.gms.measurement.internal.zzib r2 = r1.zzu
            com.google.android.gms.measurement.internal.zzgh r2 = r2.zzv()
            java.util.List r2 = r2.zzp()
            if (r2 == 0) goto L40
            boolean r2 = r2.contains(r8)
            if (r2 == 0) goto L30
            goto L40
        L30:
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzj()
            java.lang.String r2 = "Dropping non-safelisted event. event name, origin"
            r0.zzc(r2, r8, r7)
            return
        L40:
            boolean r2 = r1.zzf
            r11 = 0
            if (r2 != 0) goto L9c
            r1.zzf = r10
            boolean r0 = r0.zzp()     // Catch: java.lang.ClassNotFoundException -> L8d
            java.lang.String r2 = "com.google.android.gms.tagmanager.TagManagerService"
            if (r0 != 0) goto L5e
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzu     // Catch: java.lang.ClassNotFoundException -> L8d
            android.content.Context r0 = r0.zzaY()     // Catch: java.lang.ClassNotFoundException -> L8d
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L8d
            java.lang.Class r0 = java.lang.Class.forName(r2, r10, r0)     // Catch: java.lang.ClassNotFoundException -> L8d
            goto L62
        L5e:
            java.lang.Class r0 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L8d
        L62:
            java.lang.String r2 = "initialize"
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Exception -> L7c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r3)     // Catch: java.lang.Exception -> L7c
            com.google.android.gms.measurement.internal.zzib r2 = r1.zzu     // Catch: java.lang.Exception -> L7c
            android.content.Context r2 = r2.zzaY()     // Catch: java.lang.Exception -> L7c
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L7c
            r0.invoke(r11, r2)     // Catch: java.lang.Exception -> L7c
            goto L9c
        L7c:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzib r2 = r1.zzu     // Catch: java.lang.ClassNotFoundException -> L8d
            com.google.android.gms.measurement.internal.zzgt r2 = r2.zzaV()     // Catch: java.lang.ClassNotFoundException -> L8d
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zze()     // Catch: java.lang.ClassNotFoundException -> L8d
            java.lang.String r3 = "Failed to invoke Tag Manager's initialize() method"
            r2.zzb(r3, r0)     // Catch: java.lang.ClassNotFoundException -> L8d
            goto L9c
        L8d:
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzi()
            java.lang.String r2 = "Tag Manager is not found and thus will not be used"
            r0.zza(r2)
        L9c:
            com.google.android.gms.measurement.internal.zzib r12 = r1.zzu
            com.google.android.gms.measurement.internal.zzal r0 = r12.zzc()
            com.google.android.gms.measurement.internal.zzfw r2 = com.google.android.gms.measurement.internal.zzfx.zzbg
            boolean r0 = r0.zzp(r11, r2)
            if (r0 != 0) goto Ld0
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto Ld0
            java.lang.String r0 = "gclid"
            boolean r2 = r9.containsKey(r0)
            if (r2 == 0) goto Ld0
            r12.zzaU()
            java.lang.String r4 = r9.getString(r0)
            com.google.android.gms.common.util.Clock r0 = r12.zzaZ()
            long r5 = r0.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1.zzN(r2, r3, r4, r5)
        Ld0:
            r6 = r1
            r12.zzaU()
            if (r26 == 0) goto Led
            boolean r0 = com.google.android.gms.measurement.internal.zzpo.zzaf(r8)
            if (r0 == 0) goto Led
            com.google.android.gms.measurement.internal.zzpo r0 = r12.zzk()
            com.google.android.gms.measurement.internal.zzhg r1 = r12.zzd()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzt
            android.os.Bundle r1 = r1.zza()
            r0.zzI(r9, r1)
        Led:
            r0 = 40
            r13 = 0
            if (r28 != 0) goto L16a
            r12.zzaU()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L16a
            com.google.android.gms.measurement.internal.zzib r1 = r6.zzu
            com.google.android.gms.measurement.internal.zzpo r2 = r1.zzk()
            java.lang.String r3 = "event"
            boolean r4 = r2.zzj(r3, r8)
            r5 = 2
            if (r4 != 0) goto L10d
            goto L127
        L10d:
            java.lang.String[] r4 = com.google.android.gms.measurement.internal.zzjl.zza
            java.lang.String[] r14 = com.google.android.gms.measurement.internal.zzjl.zzb
            boolean r4 = r2.zzl(r3, r4, r14, r8)
            if (r4 != 0) goto L11a
            r5 = 13
            goto L127
        L11a:
            com.google.android.gms.measurement.internal.zzib r4 = r2.zzu
            r4.zzc()
            boolean r2 = r2.zzm(r3, r0, r8)
            if (r2 != 0) goto L126
            goto L127
        L126:
            r5 = r13
        L127:
            if (r5 == 0) goto L16a
            com.google.android.gms.measurement.internal.zzgt r2 = r12.zzaV()
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzd()
            com.google.android.gms.measurement.internal.zzgm r3 = r12.zzl()
            java.lang.String r3 = r3.zza(r8)
            java.lang.String r4 = "Invalid public event name. Event will not be logged (FE)"
            r2.zzb(r4, r3)
            com.google.android.gms.measurement.internal.zzpo r2 = r1.zzk()
            r1.zzc()
            java.lang.String r0 = r2.zzC(r8, r0, r10)
            if (r8 == 0) goto L14f
            int r13 = r8.length()
        L14f:
            com.google.android.gms.measurement.internal.zzpo r1 = r1.zzk()
            com.google.android.gms.measurement.internal.zzpn r2 = r6.zzv
            r3 = 0
            java.lang.String r4 = "_ev"
            r26 = r0
            r21 = r1
            r22 = r2
            r23 = r3
            r25 = r4
            r24 = r5
            r27 = r13
            r21.zzN(r22, r23, r24, r25, r26, r27)
            return
        L16a:
            r12.zzaU()
            com.google.android.gms.measurement.internal.zzib r14 = r6.zzu
            com.google.android.gms.measurement.internal.zzma r1 = r14.zzs()
            com.google.android.gms.measurement.internal.zzlt r1 = r1.zzh(r13)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L183
            boolean r3 = r9.containsKey(r2)
            if (r3 != 0) goto L183
            r1.zzd = r10
        L183:
            if (r26 == 0) goto L189
            if (r28 != 0) goto L189
            r3 = r10
            goto L18a
        L189:
            r3 = r13
        L18a:
            com.google.android.gms.measurement.internal.zzpo.zzav(r1, r9, r3)
            java.lang.String r1 = "am"
            boolean r1 = r1.equals(r7)
            boolean r3 = com.google.android.gms.measurement.internal.zzpo.zzZ(r8)
            if (r26 == 0) goto L1d0
            com.google.android.gms.measurement.internal.zzjo r4 = r6.zzd
            if (r4 == 0) goto L1d0
            if (r3 != 0) goto L1d0
            if (r1 == 0) goto L1a3
            r9 = r10
            goto L1d1
        L1a3:
            com.google.android.gms.measurement.internal.zzgt r0 = r12.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzj()
            com.google.android.gms.measurement.internal.zzgm r1 = r12.zzl()
            java.lang.String r1 = r1.zza(r8)
            com.google.android.gms.measurement.internal.zzgm r2 = r12.zzl()
            java.lang.String r2 = r2.zze(r9)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.zzc(r3, r1, r2)
            com.google.android.gms.measurement.internal.zzjo r0 = r6.zzd
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzjo r0 = r6.zzd
            r4 = r23
            r1 = r7
            r2 = r8
            r3 = r9
            r0.interceptEvent(r1, r2, r3, r4)
            return
        L1d0:
            r9 = r1
        L1d1:
            com.google.android.gms.measurement.internal.zzib r15 = r6.zzu
            boolean r1 = r15.zzH()
            if (r1 != 0) goto L1db
            goto L4b8
        L1db:
            com.google.android.gms.measurement.internal.zzpo r1 = r12.zzk()
            int r1 = r1.zzn(r8)
            if (r1 == 0) goto L225
            com.google.android.gms.measurement.internal.zzgt r2 = r12.zzaV()
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzd()
            com.google.android.gms.measurement.internal.zzgm r3 = r12.zzl()
            java.lang.String r3 = r3.zza(r8)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.zzb(r4, r3)
            com.google.android.gms.measurement.internal.zzpo r2 = r12.zzk()
            r12.zzc()
            java.lang.String r0 = r2.zzC(r8, r0, r10)
            if (r8 == 0) goto L20b
            int r13 = r8.length()
        L20b:
            com.google.android.gms.measurement.internal.zzpo r2 = r15.zzk()
            com.google.android.gms.measurement.internal.zzpn r3 = r6.zzv
            java.lang.String r4 = "_ev"
            r23 = r29
            r26 = r0
            r24 = r1
            r21 = r2
            r22 = r3
            r25 = r4
            r27 = r13
            r21.zzN(r22, r23, r24, r25, r26, r27)
            return
        L225:
            java.lang.String r0 = "_sn"
            java.lang.String r1 = "_si"
            java.lang.String r3 = "_o"
            java.lang.String[] r0 = new java.lang.String[]{r3, r0, r2, r1}
            java.util.List r4 = com.google.android.gms.common.util.CollectionUtils.listOf(r0)
            com.google.android.gms.measurement.internal.zzpo r0 = r12.zzk()
            r5 = r28
            r1 = r29
            r2 = r8
            r8 = r3
            r3 = r25
            android.os.Bundle r0 = r0.zzF(r1, r2, r3, r4, r5)
            r1 = r2
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            r12.zzaU()
            com.google.android.gms.measurement.internal.zzma r2 = r14.zzs()
            com.google.android.gms.measurement.internal.zzlt r2 = r2.zzh(r13)
            java.lang.String r3 = "_ae"
            if (r2 == 0) goto L286
            boolean r2 = r3.equals(r1)
            if (r2 == 0) goto L286
            com.google.android.gms.measurement.internal.zzob r2 = r14.zzh()
            com.google.android.gms.measurement.internal.zznz r2 = r2.zzb
            r25 = 0
            com.google.android.gms.measurement.internal.zzob r4 = r2.zzc
            com.google.android.gms.measurement.internal.zzib r4 = r4.zzu
            com.google.android.gms.common.util.Clock r4 = r4.zzaZ()
            long r4 = r4.elapsedRealtime()
            r17 = r13
            r16 = r14
            long r13 = r2.zzb
            long r13 = r4 - r13
            r2.zzb = r4
            int r2 = (r13 > r25 ? 1 : (r13 == r25 ? 0 : -1))
            if (r2 <= 0) goto L28c
            com.google.android.gms.measurement.internal.zzpo r2 = r12.zzk()
            r2.zzak(r0, r13)
            goto L28c
        L286:
            r17 = r13
            r16 = r14
            r25 = 0
        L28c:
            java.lang.String r2 = "auto"
            boolean r2 = r2.equals(r7)
            java.lang.String r4 = "_ffr"
            if (r2 != 0) goto L2de
            java.lang.String r2 = "_ssr"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L2de
            com.google.android.gms.measurement.internal.zzpo r2 = r12.zzk()
            java.lang.String r4 = r0.getString(r4)
            boolean r5 = com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(r4)
            if (r5 == 0) goto L2ae
            r4 = r11
            goto L2b4
        L2ae:
            if (r4 == 0) goto L2b4
            java.lang.String r4 = r4.trim()
        L2b4:
            com.google.android.gms.measurement.internal.zzib r2 = r2.zzu
            com.google.android.gms.measurement.internal.zzhg r5 = r2.zzd()
            com.google.android.gms.measurement.internal.zzhf r5 = r5.zzq
            java.lang.String r5 = r5.zza()
            boolean r5 = java.util.Objects.equals(r4, r5)
            if (r5 != 0) goto L2d0
            com.google.android.gms.measurement.internal.zzhg r2 = r2.zzd()
            com.google.android.gms.measurement.internal.zzhf r2 = r2.zzq
            r2.zzb(r4)
            goto L2fd
        L2d0:
            com.google.android.gms.measurement.internal.zzgt r0 = r2.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzj()
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.zza(r1)
            return
        L2de:
            boolean r2 = r3.equals(r1)
            if (r2 == 0) goto L2fd
            com.google.android.gms.measurement.internal.zzpo r2 = r12.zzk()
            com.google.android.gms.measurement.internal.zzib r2 = r2.zzu
            com.google.android.gms.measurement.internal.zzhg r2 = r2.zzd()
            com.google.android.gms.measurement.internal.zzhf r2 = r2.zzq
            java.lang.String r2 = r2.zza()
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L2fd
            r0.putString(r4, r2)
        L2fd:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r13.add(r0)
            com.google.android.gms.measurement.internal.zzal r2 = r12.zzc()
            com.google.android.gms.measurement.internal.zzfw r4 = com.google.android.gms.measurement.internal.zzfx.zzaU
            boolean r2 = r2.zzp(r11, r4)
            if (r2 == 0) goto L31a
            com.google.android.gms.measurement.internal.zzob r2 = r16.zzh()
            boolean r2 = r2.zzi()
            goto L324
        L31a:
            com.google.android.gms.measurement.internal.zzhg r2 = r12.zzd()
            com.google.android.gms.measurement.internal.zzhb r2 = r2.zzn
            boolean r2 = r2.zza()
        L324:
            com.google.android.gms.measurement.internal.zzhg r4 = r12.zzd()
            com.google.android.gms.measurement.internal.zzhd r4 = r4.zzk
            long r4 = r4.zza()
            int r4 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r4 <= 0) goto L39a
            com.google.android.gms.measurement.internal.zzhg r4 = r12.zzd()
            r18 = r12
            r11 = r23
            boolean r4 = r4.zzp(r11)
            if (r4 == 0) goto L396
            if (r2 == 0) goto L396
            com.google.android.gms.measurement.internal.zzgt r2 = r18.zzaV()
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzk()
            java.lang.String r4 = "Current session is expired, remove the session number, ID, and engagement time"
            r2.zza(r4)
            com.google.android.gms.common.util.Clock r2 = r18.zzaZ()
            long r4 = r2.currentTimeMillis()
            r2 = r3
            java.lang.String r3 = "_sid"
            r5 = r4
            r4 = 0
            r19 = r2
            java.lang.String r2 = "auto"
            r1 = r20
            r10 = r25
            r14 = r19
            r1.zzN(r2, r3, r4, r5)
            com.google.android.gms.common.util.Clock r1 = r18.zzaZ()
            long r5 = r1.currentTimeMillis()
            java.lang.String r3 = "_sno"
            java.lang.String r2 = "auto"
            r1 = r20
            r1.zzN(r2, r3, r4, r5)
            com.google.android.gms.common.util.Clock r1 = r18.zzaZ()
            long r5 = r1.currentTimeMillis()
            java.lang.String r3 = "_se"
            java.lang.String r2 = "auto"
            r1 = r20
            r1.zzN(r2, r3, r4, r5)
            r6 = r1
            com.google.android.gms.measurement.internal.zzhg r1 = r18.zzd()
            com.google.android.gms.measurement.internal.zzhd r1 = r1.zzl
            r1.zzb(r10)
            goto L39f
        L396:
            r10 = r25
            r14 = r3
            goto L39f
        L39a:
            r10 = r25
            r14 = r3
            r18 = r12
        L39f:
            java.lang.String r1 = "extend_session"
            long r1 = r0.getLong(r1, r10)
            r3 = 1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L3c5
            com.google.android.gms.measurement.internal.zzgt r1 = r18.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzk()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzob r1 = r15.zzh()
            com.google.android.gms.measurement.internal.zzoa r1 = r1.zza
            r4 = r23
            r2 = 1
            r1.zzb(r4, r2)
            goto L3c7
        L3c5:
            r4 = r23
        L3c7:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r0.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = r17
        L3d9:
            if (r3 >= r2) goto L426
            java.lang.Object r10 = r1.get(r3)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L421
            r18.zzk()
            java.lang.Object r11 = r0.get(r10)
            boolean r12 = r11 instanceof android.os.Bundle
            if (r12 == 0) goto L3f6
            r12 = 1
            android.os.Bundle[] r15 = new android.os.Bundle[r12]
            android.os.Bundle r11 = (android.os.Bundle) r11
            r15[r17] = r11
            goto L41c
        L3f6:
            boolean r12 = r11 instanceof android.os.Parcelable[]
            if (r12 == 0) goto L407
            android.os.Parcelable[] r11 = (android.os.Parcelable[]) r11
            int r12 = r11.length
            java.lang.Class<android.os.Bundle[]> r15 = android.os.Bundle[].class
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r12, r15)
            r15 = r11
            android.os.Bundle[] r15 = (android.os.Bundle[]) r15
            goto L41c
        L407:
            boolean r12 = r11 instanceof java.util.ArrayList
            if (r12 == 0) goto L41b
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r12 = r11.size()
            android.os.Bundle[] r12 = new android.os.Bundle[r12]
            java.lang.Object[] r11 = r11.toArray(r12)
            r15 = r11
            android.os.Bundle[] r15 = (android.os.Bundle[]) r15
            goto L41c
        L41b:
            r15 = 0
        L41c:
            if (r15 == 0) goto L421
            r0.putParcelableArray(r10, r15)
        L421:
            r19 = 1
            int r3 = r3 + 1
            goto L3d9
        L426:
            r10 = r17
        L428:
            int r0 = r13.size()
            if (r10 >= r0) goto L48f
            java.lang.Object r0 = r13.get(r10)
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r10 == 0) goto L439
            java.lang.String r1 = "_ep"
            goto L43b
        L439:
            r1 = r22
        L43b:
            r0.putString(r8, r7)
            if (r27 == 0) goto L44b
            com.google.android.gms.measurement.internal.zzpo r2 = r18.zzk()
            r11 = 0
            android.os.Bundle r0 = r2.zzab(r0, r11)
        L449:
            r12 = r0
            goto L44d
        L44b:
            r11 = 0
            goto L449
        L44d:
            com.google.android.gms.measurement.internal.zzbg r0 = new com.google.android.gms.measurement.internal.zzbg
            com.google.android.gms.measurement.internal.zzbe r2 = new com.google.android.gms.measurement.internal.zzbe
            r2.<init>(r12)
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.measurement.internal.zznk r1 = r16.zzt()
            r7 = r29
            r1.zzn(r0, r7)
            if (r9 != 0) goto L484
            java.util.Set r0 = r6.zze
            java.util.Iterator r15 = r0.iterator()
        L469:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L484
            java.lang.Object r0 = r15.next()
            com.google.android.gms.measurement.internal.zzjp r0 = (com.google.android.gms.measurement.internal.zzjp) r0
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>(r12)
            r1 = r21
            r2 = r22
            r4 = r23
            r0.onEvent(r1, r2, r3, r4)
            goto L469
        L484:
            r2 = r22
            r19 = 1
            int r10 = r10 + 1
            r7 = r21
            r4 = r23
            goto L428
        L48f:
            r2 = r22
            r18.zzaU()
            com.google.android.gms.measurement.internal.zzma r0 = r16.zzs()
            r1 = r17
            com.google.android.gms.measurement.internal.zzlt r0 = r0.zzh(r1)
            if (r0 == 0) goto L4b8
            boolean r0 = r14.equals(r2)
            if (r0 == 0) goto L4b8
            com.google.android.gms.measurement.internal.zzob r0 = r16.zzh()
            com.google.android.gms.common.util.Clock r1 = r18.zzaZ()
            long r1 = r1.elapsedRealtime()
            com.google.android.gms.measurement.internal.zznz r0 = r0.zzb
            r12 = 1
            r0.zzd(r12, r12, r1)
        L4b8:
            return
        L4b9:
            r6 = r1
            com.google.android.gms.measurement.internal.zzib r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzj()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.zza(r1)
            return
    }

    public final void zzI(java.lang.String r11, java.lang.String r12, android.os.Bundle r13, java.lang.String r14) {
            r10 = this;
            com.google.android.gms.measurement.internal.zzib.zzL()
            com.google.android.gms.measurement.internal.zzib r11 = r10.zzu
            com.google.android.gms.common.util.Clock r11 = r11.zzaZ()
            long r3 = r11.currentTimeMillis()
            r7 = 1
            r8 = 1
            java.lang.String r1 = "auto"
            r6 = 0
            r0 = r10
            r2 = r12
            r5 = r13
            r9 = r14
            r0.zzJ(r1, r2, r3, r5, r6, r7, r8, r9)
            return
    }

    public final void zzJ(java.lang.String r13, java.lang.String r14, long r15, android.os.Bundle r17, boolean r18, boolean r19, boolean r20, java.lang.String r21) {
            r12 = this;
            int r0 = com.google.android.gms.measurement.internal.zzpo.zza
            android.os.Bundle r7 = new android.os.Bundle
            r0 = r17
            r7.<init>(r0)
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            boolean r3 = r2 instanceof android.os.Bundle
            if (r3 == 0) goto L30
            android.os.Bundle r3 = new android.os.Bundle
            android.os.Bundle r2 = (android.os.Bundle) r2
            r3.<init>(r2)
            r7.putBundle(r1, r3)
            goto L11
        L30:
            boolean r1 = r2 instanceof android.os.Parcelable[]
            r3 = 0
            if (r1 == 0) goto L4c
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
        L37:
            int r1 = r2.length
            if (r3 >= r1) goto L11
            r1 = r2[r3]
            boolean r4 = r1 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            android.os.Bundle r4 = new android.os.Bundle
            android.os.Bundle r1 = (android.os.Bundle) r1
            r4.<init>(r1)
            r2[r3] = r4
        L49:
            int r3 = r3 + 1
            goto L37
        L4c:
            boolean r1 = r2 instanceof java.util.List
            if (r1 == 0) goto L11
            java.util.List r2 = (java.util.List) r2
        L52:
            int r1 = r2.size()
            if (r3 >= r1) goto L11
            java.lang.Object r1 = r2.get(r3)
            boolean r4 = r1 instanceof android.os.Bundle
            if (r4 == 0) goto L6a
            android.os.Bundle r4 = new android.os.Bundle
            android.os.Bundle r1 = (android.os.Bundle) r1
            r4.<init>(r1)
            r2.set(r3, r4)
        L6a:
            int r3 = r3 + 1
            goto L52
        L6d:
            com.google.android.gms.measurement.internal.zzib r0 = r12.zzu
            com.google.android.gms.measurement.internal.zzhy r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzkb r1 = new com.google.android.gms.measurement.internal.zzkb
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10, r11)
            r0.zzj(r1)
            return
    }

    public final void zzK(java.lang.String r8, java.lang.String r9, java.lang.Object r10, boolean r11) {
            r7 = this;
            com.google.android.gms.measurement.internal.zzib r8 = r7.zzu
            com.google.android.gms.common.util.Clock r8 = r8.zzaZ()
            long r5 = r8.currentTimeMillis()
            java.lang.String r2 = "_ldl"
            r4 = 1
            java.lang.String r1 = "auto"
            r0 = r7
            r3 = r10
            r0.zzL(r1, r2, r3, r4, r5)
            return
    }

    public final void zzL(java.lang.String r17, java.lang.String r18, java.lang.Object r19, boolean r20, long r21) {
            r16 = this;
            r0 = r16
            r2 = r18
            r1 = r19
            r3 = 0
            r4 = 24
            if (r20 == 0) goto L17
            com.google.android.gms.measurement.internal.zzib r5 = r0.zzu
            com.google.android.gms.measurement.internal.zzpo r5 = r5.zzk()
            int r5 = r5.zzp(r2)
        L15:
            r12 = r5
            goto L42
        L17:
            com.google.android.gms.measurement.internal.zzib r5 = r0.zzu
            com.google.android.gms.measurement.internal.zzpo r5 = r5.zzk()
            java.lang.String r6 = "user property"
            boolean r7 = r5.zzj(r6, r2)
            r8 = 6
            if (r7 != 0) goto L29
        L27:
            r12 = r8
            goto L42
        L29:
            java.lang.String[] r7 = com.google.android.gms.measurement.internal.zzjn.zza
            r9 = 0
            boolean r7 = r5.zzl(r6, r7, r9, r2)
            if (r7 != 0) goto L35
            r5 = 15
            goto L15
        L35:
            com.google.android.gms.measurement.internal.zzib r7 = r5.zzu
            r7.zzc()
            boolean r5 = r5.zzm(r6, r4, r2)
            if (r5 != 0) goto L41
            goto L27
        L41:
            r12 = r3
        L42:
            r5 = 1
            if (r12 == 0) goto L68
            com.google.android.gms.measurement.internal.zzib r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzpo r6 = r1.zzk()
            r1.zzc()
            java.lang.String r14 = r6.zzC(r2, r4, r5)
            if (r2 == 0) goto L58
            int r3 = r2.length()
        L58:
            r15 = r3
            com.google.android.gms.measurement.internal.zzib r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzpn r10 = r0.zzv
            com.google.android.gms.measurement.internal.zzpo r9 = r1.zzk()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.zzN(r10, r11, r12, r13, r14, r15)
            return
        L68:
            if (r17 != 0) goto L6d
            java.lang.String r6 = "app"
            goto L6f
        L6d:
            r6 = r17
        L6f:
            if (r1 == 0) goto Lbc
            com.google.android.gms.measurement.internal.zzib r7 = r0.zzu
            com.google.android.gms.measurement.internal.zzpo r8 = r7.zzk()
            int r12 = r8.zzK(r2, r1)
            if (r12 == 0) goto Lab
            com.google.android.gms.measurement.internal.zzpo r6 = r7.zzk()
            r7.zzc()
            java.lang.String r14 = r6.zzC(r2, r4, r5)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 != 0) goto L93
            boolean r2 = r1 instanceof java.lang.CharSequence
            if (r2 == 0) goto L91
            goto L93
        L91:
            r15 = r3
            goto L9c
        L93:
            java.lang.String r1 = r1.toString()
            int r3 = r1.length()
            goto L91
        L9c:
            com.google.android.gms.measurement.internal.zzib r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzpn r10 = r0.zzv
            com.google.android.gms.measurement.internal.zzpo r9 = r1.zzk()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.zzN(r10, r11, r12, r13, r14, r15)
            return
        Lab:
            com.google.android.gms.measurement.internal.zzpo r3 = r7.zzk()
            java.lang.Object r5 = r3.zzL(r2, r1)
            if (r5 == 0) goto Lbb
            r3 = r21
            r1 = r6
            r0.zzM(r1, r2, r3, r5)
        Lbb:
            return
        Lbc:
            r1 = r6
            r5 = 0
            r0 = r16
            r2 = r18
            r3 = r21
            r0.zzM(r1, r2, r3, r5)
            return
    }

    public final void zzM(java.lang.String r9, java.lang.String r10, long r11, java.lang.Object r13) {
            r8 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r8.zzu
            com.google.android.gms.measurement.internal.zzhy r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzkc r1 = new com.google.android.gms.measurement.internal.zzkc
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            r0.zzj(r1)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzN(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
            r9 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)
            r9.zzg()
            r9.zzb()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L76
            boolean r0 = r12 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L54
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L54
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            r12 = 1
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r12 == r11) goto L37
            r11 = 0
            goto L38
        L37:
            r11 = r2
        L38:
            com.google.android.gms.measurement.internal.zzib r4 = r9.zzu
            java.lang.Long r12 = java.lang.Long.valueOf(r11)
            com.google.android.gms.measurement.internal.zzhg r11 = r4.zzd()
            com.google.android.gms.measurement.internal.zzhf r11 = r11.zzh
            long r4 = r12.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4f
            java.lang.String r0 = "true"
        L4f:
            r11.zzb(r0)
        L52:
            r11 = r1
            goto L65
        L54:
            if (r12 != 0) goto L65
            com.google.android.gms.measurement.internal.zzib r11 = r9.zzu
            com.google.android.gms.measurement.internal.zzhg r11 = r11.zzd()
            com.google.android.gms.measurement.internal.zzhf r11 = r11.zzh
            java.lang.String r0 = "unset"
            r11.zzb(r0)
            goto L52
        L65:
            com.google.android.gms.measurement.internal.zzib r0 = r9.zzu
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()
            java.lang.String r1 = "Setting user property(FE)"
            java.lang.String r2 = "non_personalized_ads(_npa)"
            r0.zzc(r1, r2, r12)
        L76:
            r4 = r11
            r7 = r12
            com.google.android.gms.measurement.internal.zzib r11 = r9.zzu
            boolean r12 = r11.zzB()
            if (r12 != 0) goto L90
            com.google.android.gms.measurement.internal.zzib r10 = r9.zzu
            com.google.android.gms.measurement.internal.zzgt r10 = r10.zzaV()
            com.google.android.gms.measurement.internal.zzgr r10 = r10.zzk()
            java.lang.String r11 = "User property not set since app measurement is disabled"
            r10.zza(r11)
            return
        L90:
            boolean r11 = r11.zzH()
            if (r11 != 0) goto L97
            return
        L97:
            com.google.android.gms.measurement.internal.zzib r11 = r9.zzu
            com.google.android.gms.measurement.internal.zzpk r3 = new com.google.android.gms.measurement.internal.zzpk
            r8 = r10
            r5 = r13
            r3.<init>(r4, r5, r7, r8)
            com.google.android.gms.measurement.internal.zznk r10 = r11.zzt()
            r10.zzA(r3)
            return
    }

    public final java.util.List zzO(boolean r8) {
            r7 = this;
            r7.zzb()
            com.google.android.gms.measurement.internal.zzib r0 = r7.zzu
            com.google.android.gms.measurement.internal.zzgt r1 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzk()
            java.lang.String r2 = "Getting user properties (FE)"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzhy r1 = r0.zzaW()
            boolean r1 = r1.zze()
            if (r1 != 0) goto L69
            r0.zzaU()
            boolean r1 = com.google.android.gms.measurement.internal.zzae.zza()
            if (r1 == 0) goto L35
            com.google.android.gms.measurement.internal.zzgt r8 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r8 = r8.zzb()
            java.lang.String r0 = "Cannot get all user properties from main thread"
            r8.zza(r0)
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            return r8
        L35:
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            com.google.android.gms.measurement.internal.zzib r1 = r7.zzu
            com.google.android.gms.measurement.internal.zzhy r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzke r6 = new com.google.android.gms.measurement.internal.zzke
            r6.<init>(r7, r2, r8)
            r3 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r5 = "get user properties"
            r1.zzk(r2, r3, r5, r6)
            java.lang.Object r1 = r2.get()
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L68
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.String r1 = "Timed out waiting for get user properties, includeInternal"
            r0.zzb(r1, r8)
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            return r8
        L68:
            return r1
        L69:
            com.google.android.gms.measurement.internal.zzgt r8 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r8 = r8.zzb()
            java.lang.String r0 = "Cannot get all user properties from analytics worker thread"
            r8.zza(r0)
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            return r8
    }

    public final java.util.Map zzP(java.lang.String r10, java.lang.String r11, boolean r12) {
            r9 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r9.zzu
            com.google.android.gms.measurement.internal.zzhy r1 = r0.zzaW()
            boolean r1 = r1.zze()
            if (r1 == 0) goto L1c
            com.google.android.gms.measurement.internal.zzgt r10 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r10 = r10.zzb()
            java.lang.String r11 = "Cannot get user properties from analytics worker thread"
            r10.zza(r11)
            java.util.Map r10 = java.util.Collections.EMPTY_MAP
            return r10
        L1c:
            r0.zzaU()
            boolean r1 = com.google.android.gms.measurement.internal.zzae.zza()
            if (r1 == 0) goto L35
            com.google.android.gms.measurement.internal.zzgt r10 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r10 = r10.zzb()
            java.lang.String r11 = "Cannot get user properties from main thread"
            r10.zza(r11)
            java.util.Map r10 = java.util.Collections.EMPTY_MAP
            return r10
        L35:
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            com.google.android.gms.measurement.internal.zzib r1 = r9.zzu
            com.google.android.gms.measurement.internal.zzhy r8 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzkk r1 = new com.google.android.gms.measurement.internal.zzkk
            r4 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r3 = r2
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r2 = r3
            r3 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r5 = "get user properties"
            r6 = r1
            r1 = r8
            r1.zzk(r2, r3, r5, r6)
            java.lang.Object r10 = r2.get()
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L71
            com.google.android.gms.measurement.internal.zzgt r10 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r10 = r10.zzb()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r7)
            java.lang.String r12 = "Timed out waiting for handle get user properties, includeInternal"
            r10.zzb(r12, r11)
            java.util.Map r10 = java.util.Collections.EMPTY_MAP
            return r10
        L71:
            androidx.collection.ArrayMap r11 = new androidx.collection.ArrayMap
            int r12 = r10.size()
            r11.<init>(r12)
            java.util.Iterator r10 = r10.iterator()
        L7e:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L96
            java.lang.Object r12 = r10.next()
            com.google.android.gms.measurement.internal.zzpk r12 = (com.google.android.gms.measurement.internal.zzpk) r12
            java.lang.Object r0 = r12.zza()
            if (r0 == 0) goto L7e
            java.lang.String r12 = r12.zzb
            r11.put(r12, r0)
            goto L7e
        L96:
            return r11
    }

    public final java.lang.String zzQ() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzg
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public final void zzR(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzg
            r0.set(r2)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzS() {
            r6 = this;
            r6.zzg()
            com.google.android.gms.measurement.internal.zzib r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzhg r1 = r0.zzd()
            com.google.android.gms.measurement.internal.zzhb r1 = r1.zzo
            boolean r1 = r1.zza()
            if (r1 != 0) goto L5d
            com.google.android.gms.measurement.internal.zzhg r1 = r0.zzd()
            com.google.android.gms.measurement.internal.zzhd r1 = r1.zzp
            long r1 = r1.zza()
            com.google.android.gms.measurement.internal.zzhg r3 = r0.zzd()
            com.google.android.gms.measurement.internal.zzhd r3 = r3.zzp
            r4 = 1
            long r4 = r4 + r1
            r3.zzb(r4)
            r0.zzc()
            r3 = 5
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L48
            com.google.android.gms.measurement.internal.zzgt r1 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zze()
            java.lang.String r2 = "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries."
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzhg r0 = r0.zzd()
            com.google.android.gms.measurement.internal.zzhb r0 = r0.zzo
            r1 = 1
            r0.zzb(r1)
            return
        L48:
            com.google.android.gms.measurement.internal.zzay r0 = r6.zzr
            if (r0 != 0) goto L55
            com.google.android.gms.measurement.internal.zzib r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzkf r1 = new com.google.android.gms.measurement.internal.zzkf
            r1.<init>(r6, r0)
            r6.zzr = r1
        L55:
            com.google.android.gms.measurement.internal.zzay r0 = r6.zzr
            r1 = 0
            r0.zzb(r1)
            return
        L5d:
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzj()
            java.lang.String r1 = "Deferred Deep Link already retrieved. Not fetching again."
            r0.zza(r1)
            return
    }

    public final void zzT(long r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.zzg
            r1 = 0
            r0.set(r1)
            com.google.android.gms.measurement.internal.zzib r0 = r2.zzu
            com.google.android.gms.measurement.internal.zzhy r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzkg r1 = new com.google.android.gms.measurement.internal.zzkg
            r1.<init>(r2, r3)
            r0.zzj(r1)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzU() {
            r6 = this;
            r6.zzg()
            r6.zzb()
            com.google.android.gms.measurement.internal.zzib r0 = r6.zzu
            boolean r0 = r0.zzH()
            if (r0 != 0) goto L10
            goto La9
        L10:
            com.google.android.gms.measurement.internal.zzib r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzal r1 = r0.zzc()
            com.google.android.gms.measurement.internal.zzib r2 = r1.zzu
            r2.zzaU()
            java.lang.String r2 = "google_analytics_deferred_deep_link_enabled"
            java.lang.Boolean r1 = r1.zzr(r2)
            if (r1 == 0) goto L42
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L42
            com.google.android.gms.measurement.internal.zzgt r1 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzj()
            java.lang.String r2 = "Deferred Deep Link feature enabled."
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzhy r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzlg r2 = new com.google.android.gms.measurement.internal.zzlg
            r2.<init>(r6)
            r1.zzj(r2)
        L42:
            com.google.android.gms.measurement.internal.zzib r1 = r6.zzu
            com.google.android.gms.measurement.internal.zznk r1 = r1.zzt()
            r1.zzE()
            r1 = 0
            r6.zzc = r1
            com.google.android.gms.measurement.internal.zzhg r1 = r0.zzd()
            r1.zzg()
            android.content.SharedPreferences r2 = r1.zzd()
            r3 = 0
            java.lang.String r4 = "previous_os_version"
            java.lang.String r2 = r2.getString(r4, r3)
            com.google.android.gms.measurement.internal.zzib r3 = r1.zzu
            com.google.android.gms.measurement.internal.zzba r3 = r3.zzu()
            r3.zzw()
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L85
            boolean r5 = r3.equals(r2)
            if (r5 != 0) goto L85
            android.content.SharedPreferences r1 = r1.zzd()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r4, r3)
            r1.apply()
        L85:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto La9
            com.google.android.gms.measurement.internal.zzba r0 = r0.zzu()
            r0.zzw()
            boolean r0 = r2.equals(r3)
            if (r0 != 0) goto La9
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "_po"
            r0.putString(r1, r2)
            java.lang.String r1 = "auto"
            java.lang.String r2 = "_ou"
            r6.zzF(r1, r2, r0)
        La9:
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzV(com.google.android.gms.measurement.internal.zzjo r3) {
            r2 = this;
            r2.zzg()
            r2.zzb()
            if (r3 == 0) goto L16
            com.google.android.gms.measurement.internal.zzjo r0 = r2.zzd
            if (r3 == r0) goto L16
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            java.lang.String r1 = "EventInterceptor already set."
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
        L16:
            r2.zzd = r3
            return
    }

    public final void zzW(com.google.android.gms.measurement.internal.zzjp r2) {
            r1 = this;
            r1.zzb()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.util.Set r0 = r1.zze
            boolean r2 = r0.add(r2)
            if (r2 != 0) goto L1d
            com.google.android.gms.measurement.internal.zzib r2 = r1.zzu
            com.google.android.gms.measurement.internal.zzgt r2 = r2.zzaV()
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zze()
            java.lang.String r0 = "OnEventListener already registered"
            r2.zza(r0)
        L1d:
            return
    }

    public final void zzX(com.google.android.gms.measurement.internal.zzjp r2) {
            r1 = this;
            r1.zzb()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.util.Set r0 = r1.zze
            boolean r2 = r0.remove(r2)
            if (r2 != 0) goto L1d
            com.google.android.gms.measurement.internal.zzib r2 = r1.zzu
            com.google.android.gms.measurement.internal.zzgt r2 = r2.zzaV()
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zze()
            java.lang.String r0 = "OnEventListener had not been registered"
            r2.zza(r0)
        L1d:
            return
    }

    public final int zzY(java.lang.String r1) {
            r0 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            com.google.android.gms.measurement.internal.zzib r1 = r0.zzu
            r1.zzc()
            r1 = 25
            return r1
    }

    public final void zzZ(android.os.Bundle r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r2.zzu
            com.google.android.gms.common.util.Clock r0 = r0.zzaZ()
            long r0 = r0.currentTimeMillis()
            r2.zzaa(r3, r0)
            return
    }

    public final void zzaa(android.os.Bundle r12, long r13) {
            r11 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r12)
            java.lang.String r12 = "app_id"
            java.lang.String r1 = r0.getString(r12)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L23
            com.google.android.gms.measurement.internal.zzib r1 = r11.zzu
            com.google.android.gms.measurement.internal.zzgt r1 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zze()
            java.lang.String r2 = "Package name should be null when calling setConditionalUserProperty"
            r1.zza(r2)
        L23:
            r0.remove(r12)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r2 = 0
            com.google.android.gms.measurement.internal.zzjg.zzb(r0, r12, r1, r2)
            java.lang.String r12 = "origin"
            com.google.android.gms.measurement.internal.zzjg.zzb(r0, r12, r1, r2)
            java.lang.String r3 = "name"
            com.google.android.gms.measurement.internal.zzjg.zzb(r0, r3, r1, r2)
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            java.lang.String r5 = "value"
            com.google.android.gms.measurement.internal.zzjg.zzb(r0, r5, r4, r2)
            java.lang.String r4 = "trigger_event_name"
            com.google.android.gms.measurement.internal.zzjg.zzb(r0, r4, r1, r2)
            r6 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.String r7 = "trigger_timeout"
            java.lang.Class<java.lang.Long> r8 = java.lang.Long.class
            com.google.android.gms.measurement.internal.zzjg.zzb(r0, r7, r8, r6)
            java.lang.String r9 = "timed_out_event_name"
            com.google.android.gms.measurement.internal.zzjg.zzb(r0, r9, r1, r2)
            java.lang.String r9 = "timed_out_event_params"
            java.lang.Class<android.os.Bundle> r10 = android.os.Bundle.class
            com.google.android.gms.measurement.internal.zzjg.zzb(r0, r9, r10, r2)
            java.lang.String r9 = "triggered_event_name"
            com.google.android.gms.measurement.internal.zzjg.zzb(r0, r9, r1, r2)
            java.lang.String r9 = "triggered_event_params"
            com.google.android.gms.measurement.internal.zzjg.zzb(r0, r9, r10, r2)
            java.lang.String r9 = "time_to_live"
            com.google.android.gms.measurement.internal.zzjg.zzb(r0, r9, r8, r6)
            java.lang.String r6 = "expired_event_name"
            com.google.android.gms.measurement.internal.zzjg.zzb(r0, r6, r1, r2)
            java.lang.String r1 = "expired_event_params"
            com.google.android.gms.measurement.internal.zzjg.zzb(r0, r1, r10, r2)
            java.lang.String r1 = r0.getString(r3)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            java.lang.String r12 = r0.getString(r12)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            java.lang.Object r12 = r0.get(r5)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)
            java.lang.String r12 = "creation_timestamp"
            r0.putLong(r12, r13)
            java.lang.String r12 = r0.getString(r3)
            java.lang.Object r13 = r0.get(r5)
            com.google.android.gms.measurement.internal.zzib r14 = r11.zzu
            com.google.android.gms.measurement.internal.zzpo r1 = r14.zzk()
            int r1 = r1.zzp(r12)
            if (r1 != 0) goto L161
            com.google.android.gms.measurement.internal.zzpo r1 = r14.zzk()
            int r1 = r1.zzK(r12, r13)
            if (r1 != 0) goto L14b
            com.google.android.gms.measurement.internal.zzpo r1 = r14.zzk()
            java.lang.Object r1 = r1.zzL(r12, r13)
            if (r1 != 0) goto Ld7
            com.google.android.gms.measurement.internal.zzgt r0 = r14.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()
            com.google.android.gms.measurement.internal.zzgm r14 = r14.zzl()
            java.lang.String r12 = r14.zzc(r12)
            java.lang.String r14 = "Unable to normalize conditional user property value"
            r0.zzc(r14, r12, r13)
            return
        Ld7:
            com.google.android.gms.measurement.internal.zzjg.zza(r0, r1)
            long r1 = r0.getLong(r7)
            java.lang.String r13 = r0.getString(r4)
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            r3 = 1
            r5 = 15552000000(0x39ef8b000, double:7.683708924E-314)
            if (r13 != 0) goto L114
            r14.zzc()
            int r13 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r13 > 0) goto Lfa
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L114
        Lfa:
            com.google.android.gms.measurement.internal.zzgt r13 = r14.zzaV()
            com.google.android.gms.measurement.internal.zzgr r13 = r13.zzb()
            com.google.android.gms.measurement.internal.zzgm r14 = r14.zzl()
            java.lang.String r12 = r14.zzc(r12)
            java.lang.Long r14 = java.lang.Long.valueOf(r1)
            java.lang.String r0 = "Invalid conditional user property timeout"
            r13.zzc(r0, r12, r14)
            return
        L114:
            long r1 = r0.getLong(r9)
            r14.zzc()
            int r13 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r13 > 0) goto L131
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L124
            goto L131
        L124:
            com.google.android.gms.measurement.internal.zzhy r12 = r14.zzaW()
            com.google.android.gms.measurement.internal.zzkh r13 = new com.google.android.gms.measurement.internal.zzkh
            r13.<init>(r11, r0)
            r12.zzj(r13)
            return
        L131:
            com.google.android.gms.measurement.internal.zzgt r13 = r14.zzaV()
            com.google.android.gms.measurement.internal.zzgr r13 = r13.zzb()
            com.google.android.gms.measurement.internal.zzgm r14 = r14.zzl()
            java.lang.String r12 = r14.zzc(r12)
            java.lang.Long r14 = java.lang.Long.valueOf(r1)
            java.lang.String r0 = "Invalid conditional user property time to live"
            r13.zzc(r0, r12, r14)
            return
        L14b:
            com.google.android.gms.measurement.internal.zzgt r0 = r14.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()
            com.google.android.gms.measurement.internal.zzgm r14 = r14.zzl()
            java.lang.String r12 = r14.zzc(r12)
            java.lang.String r14 = "Invalid conditional user property value"
            r0.zzc(r14, r12, r13)
            return
        L161:
            com.google.android.gms.measurement.internal.zzgt r13 = r14.zzaV()
            com.google.android.gms.measurement.internal.zzgr r13 = r13.zzb()
            com.google.android.gms.measurement.internal.zzgm r14 = r14.zzl()
            java.lang.String r12 = r14.zzc(r12)
            java.lang.String r14 = "Invalid conditional user property name"
            r13.zzb(r14, r12)
            return
    }

    public final void zzab(java.lang.String r6, java.lang.String r7, android.os.Bundle r8) {
            r5 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r5.zzu
            com.google.android.gms.common.util.Clock r1 = r0.zzaZ()
            long r1 = r1.currentTimeMillis()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "name"
            r3.putString(r4, r6)
            java.lang.String r6 = "creation_timestamp"
            r3.putLong(r6, r1)
            if (r7 == 0) goto L28
            java.lang.String r6 = "expired_event_name"
            r3.putString(r6, r7)
            java.lang.String r6 = "expired_event_params"
            r3.putBundle(r6, r8)
        L28:
            com.google.android.gms.measurement.internal.zzhy r6 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzki r7 = new com.google.android.gms.measurement.internal.zzki
            r7.<init>(r5, r3)
            r6.zzj(r7)
            return
    }

    public final java.util.ArrayList zzac(java.lang.String r10, java.lang.String r11) {
            r9 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r9.zzu
            com.google.android.gms.measurement.internal.zzhy r1 = r0.zzaW()
            boolean r1 = r1.zze()
            r2 = 0
            if (r1 == 0) goto L20
            com.google.android.gms.measurement.internal.zzgt r10 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r10 = r10.zzb()
            java.lang.String r11 = "Cannot get conditional user properties from analytics worker thread"
            r10.zza(r11)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r2)
            return r10
        L20:
            r0.zzaU()
            boolean r1 = com.google.android.gms.measurement.internal.zzae.zza()
            if (r1 == 0) goto L3c
            com.google.android.gms.measurement.internal.zzgt r10 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r10 = r10.zzb()
            java.lang.String r11 = "Cannot get conditional user properties from main thread"
            r10.zza(r11)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r2)
            return r10
        L3c:
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            r4.<init>()
            com.google.android.gms.measurement.internal.zzib r1 = r9.zzu
            com.google.android.gms.measurement.internal.zzhy r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzkj r3 = new com.google.android.gms.measurement.internal.zzkj
            r6 = 0
            r7 = r10
            r8 = r11
            r5 = r4
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r4 = r5
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r7 = "get conditional user properties"
            r8 = r3
            r3 = r1
            r3.zzk(r4, r5, r7, r8)
            java.lang.Object r10 = r4.get()
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L77
            com.google.android.gms.measurement.internal.zzgt r10 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r10 = r10.zzb()
            java.lang.String r11 = "Timed out waiting for get conditional user properties"
            r0 = 0
            r10.zzb(r11, r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            return r10
        L77:
            java.util.ArrayList r10 = com.google.android.gms.measurement.internal.zzpo.zzas(r10)
            return r10
    }

    public final java.lang.String zzad() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzma r0 = r0.zzs()
            com.google.android.gms.measurement.internal.zzlt r0 = r0.zzl()
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.zza
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final java.lang.String zzae() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzma r0 = r0.zzs()
            com.google.android.gms.measurement.internal.zzlt r0 = r0.zzl()
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.zzb
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final /* synthetic */ void zzaf(android.content.SharedPreferences r6, java.lang.String r7) {
            r5 = this;
            com.google.android.gms.measurement.internal.zzib r6 = r5.zzu
            com.google.android.gms.measurement.internal.zzal r0 = r6.zzc()
            r1 = 0
            com.google.android.gms.measurement.internal.zzfw r2 = com.google.android.gms.measurement.internal.zzfx.zzaZ
            boolean r0 = r0.zzp(r1, r2)
            r1 = 500(0x1f4, double:2.47E-321)
            java.lang.String r3 = "IABTCF_TCString change picked up in listener."
            java.lang.String r4 = "IABTCF_TCString"
            if (r0 != 0) goto L32
            boolean r7 = java.util.Objects.equals(r7, r4)
            if (r7 == 0) goto L49
            com.google.android.gms.measurement.internal.zzgt r6 = r6.zzaV()
            com.google.android.gms.measurement.internal.zzgr r6 = r6.zzk()
            r6.zza(r3)
            com.google.android.gms.measurement.internal.zzay r6 = r5.zzt
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            com.google.android.gms.measurement.internal.zzay r6 = (com.google.android.gms.measurement.internal.zzay) r6
            r6.zzb(r1)
            return
        L32:
            boolean r0 = java.util.Objects.equals(r7, r4)
            if (r0 != 0) goto L4a
            java.lang.String r0 = "IABTCF_gdprApplies"
            boolean r0 = java.util.Objects.equals(r7, r0)
            if (r0 != 0) goto L4a
            java.lang.String r0 = "IABTCF_EnableAdvertiserConsentMode"
            boolean r7 = java.util.Objects.equals(r7, r0)
            if (r7 == 0) goto L49
            goto L4a
        L49:
            return
        L4a:
            com.google.android.gms.measurement.internal.zzgt r6 = r6.zzaV()
            com.google.android.gms.measurement.internal.zzgr r6 = r6.zzk()
            r6.zza(r3)
            com.google.android.gms.measurement.internal.zzay r6 = r5.zzt
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            com.google.android.gms.measurement.internal.zzay r6 = (com.google.android.gms.measurement.internal.zzay) r6
            r6.zzb(r1)
            return
    }

    public final /* synthetic */ void zzag(android.os.Bundle r15) {
            r14 = this;
            boolean r0 = r15.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            r2 = r15
            goto Lee
        La:
            com.google.android.gms.measurement.internal.zzib r0 = r14.zzu
            android.os.Bundle r2 = new android.os.Bundle
            com.google.android.gms.measurement.internal.zzhg r3 = r0.zzd()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzt
            android.os.Bundle r3 = r3.zza()
            r2.<init>(r3)
            java.util.Set r3 = r15.keySet()
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L9f
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r15.get(r4)
            if (r6 == 0) goto L69
            boolean r7 = r6 instanceof java.lang.String
            if (r7 != 0) goto L69
            boolean r7 = r6 instanceof java.lang.Long
            if (r7 != 0) goto L69
            boolean r7 = r6 instanceof java.lang.Double
            if (r7 != 0) goto L69
            com.google.android.gms.measurement.internal.zzpo r5 = r0.zzk()
            boolean r5 = r5.zzt(r6)
            if (r5 == 0) goto L5b
            com.google.android.gms.measurement.internal.zzpo r7 = r0.zzk()
            com.google.android.gms.measurement.internal.zzpn r8 = r14.zzv
            r12 = 0
            r13 = 0
            r9 = 0
            r10 = 27
            r11 = 0
            r7.zzN(r8, r9, r10, r11, r12, r13)
        L5b:
            com.google.android.gms.measurement.internal.zzgt r5 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r5 = r5.zzh()
            java.lang.String r7 = "Invalid default event parameter type. Name, value"
            r5.zzc(r7, r4, r6)
            goto L23
        L69:
            boolean r7 = com.google.android.gms.measurement.internal.zzpo.zzZ(r4)
            if (r7 == 0) goto L7d
            com.google.android.gms.measurement.internal.zzgt r5 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r5 = r5.zzh()
            java.lang.String r6 = "Invalid default event parameter name. Name"
            r5.zzb(r6, r4)
            goto L23
        L7d:
            if (r6 != 0) goto L83
            r2.remove(r4)
            goto L23
        L83:
            com.google.android.gms.measurement.internal.zzpo r7 = r0.zzk()
            com.google.android.gms.measurement.internal.zzal r8 = r0.zzc()
            int r5 = r8.zze(r1, r5)
            java.lang.String r8 = "param"
            boolean r5 = r7.zzu(r8, r4, r5, r6)
            if (r5 == 0) goto L23
            com.google.android.gms.measurement.internal.zzpo r5 = r0.zzk()
            r5.zzM(r2, r4, r6)
            goto L23
        L9f:
            r0.zzk()
            com.google.android.gms.measurement.internal.zzal r3 = r0.zzc()
            int r3 = r3.zzc()
            int r4 = r2.size()
            if (r4 > r3) goto Lb1
            goto Lee
        Lb1:
            java.util.TreeSet r4 = new java.util.TreeSet
            java.util.Set r6 = r2.keySet()
            r4.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        Lbe:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Ld2
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            int r5 = r5 + 1
            if (r5 <= r3) goto Lbe
            r2.remove(r6)
            goto Lbe
        Ld2:
            com.google.android.gms.measurement.internal.zzpo r7 = r0.zzk()
            com.google.android.gms.measurement.internal.zzpn r8 = r14.zzv
            r12 = 0
            r13 = 0
            r9 = 0
            r10 = 26
            r11 = 0
            r7.zzN(r8, r9, r10, r11, r12, r13)
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzh()
            java.lang.String r3 = "Too many default event parameters set. Discarding beyond event parameter limit"
            r0.zza(r3)
        Lee:
            com.google.android.gms.measurement.internal.zzib r0 = r14.zzu
            com.google.android.gms.measurement.internal.zzhg r3 = r0.zzd()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzt
            r3.zzb(r2)
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L10d
            com.google.android.gms.measurement.internal.zzal r15 = r0.zzc()
            com.google.android.gms.measurement.internal.zzfw r0 = com.google.android.gms.measurement.internal.zzfx.zzaW
            boolean r15 = r15.zzp(r1, r0)
            if (r15 == 0) goto L10c
            goto L10d
        L10c:
            return
        L10d:
            com.google.android.gms.measurement.internal.zzib r15 = r14.zzu
            com.google.android.gms.measurement.internal.zznk r15 = r15.zzt()
            r15.zzH(r2)
            return
    }

    public final /* synthetic */ void zzah(int r6) {
            r5 = this;
            com.google.android.gms.measurement.internal.zzay r0 = r5.zzk
            if (r0 != 0) goto Ld
            com.google.android.gms.measurement.internal.zzib r0 = r5.zzu
            com.google.android.gms.measurement.internal.zzjw r1 = new com.google.android.gms.measurement.internal.zzjw
            r1.<init>(r5, r0)
            r5.zzk = r1
        Ld:
            com.google.android.gms.measurement.internal.zzay r0 = r5.zzk
            long r1 = (long) r6
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r0.zzb(r1)
            return
    }

    public final /* synthetic */ void zzai(java.lang.Boolean r1, boolean r2) {
            r0 = this;
            r2 = 1
            r0.zzar(r1, r2)
            return
    }

    public final /* synthetic */ void zzaj(com.google.android.gms.measurement.internal.zzjk r7, long r8, boolean r10, boolean r11) {
            r6 = this;
            r6.zzg()
            r6.zzb()
            com.google.android.gms.measurement.internal.zzib r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzhg r1 = r0.zzd()
            com.google.android.gms.measurement.internal.zzjk r1 = r1.zzl()
            long r2 = r6.zzq
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 > 0) goto L33
            int r1 = r1.zzb()
            int r2 = r7.zzb()
            boolean r1 = com.google.android.gms.measurement.internal.zzjk.zzu(r1, r2)
            if (r1 != 0) goto L25
            goto L33
        L25:
            com.google.android.gms.measurement.internal.zzgt r8 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r8 = r8.zzi()
            java.lang.String r9 = "Dropped out-of-date consent setting, proposed settings"
            r8.zzb(r9, r7)
            return
        L33:
            com.google.android.gms.measurement.internal.zzhg r1 = r0.zzd()
            com.google.android.gms.measurement.internal.zzib r2 = r1.zzu
            r1.zzg()
            int r2 = r7.zzb()
            boolean r3 = r1.zzk(r2)
            if (r3 == 0) goto L98
            com.google.android.gms.measurement.internal.zzib r3 = r6.zzu
            android.content.SharedPreferences r1 = r1.zzd()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r4 = r7.zzl()
            java.lang.String r5 = "consent_settings"
            r1.putString(r5, r4)
            java.lang.String r4 = "consent_source"
            r1.putInt(r4, r2)
            r1.apply()
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()
            java.lang.String r1 = "Setting storage consent(FE)"
            r0.zzb(r1, r7)
            r6.zzq = r8
            com.google.android.gms.measurement.internal.zznk r7 = r3.zzt()
            boolean r7 = r7.zzP()
            if (r7 == 0) goto L82
            com.google.android.gms.measurement.internal.zznk r7 = r3.zzt()
            r7.zzk(r10)
            goto L89
        L82:
            com.google.android.gms.measurement.internal.zznk r7 = r3.zzt()
            r7.zzj(r10)
        L89:
            if (r11 == 0) goto L97
            com.google.android.gms.measurement.internal.zznk r7 = r3.zzt()
            java.util.concurrent.atomic.AtomicReference r8 = new java.util.concurrent.atomic.AtomicReference
            r8.<init>()
            r7.zzC(r8)
        L97:
            return
        L98:
            com.google.android.gms.measurement.internal.zzgt r8 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r8 = r8.zzi()
            int r7 = r7.zzb()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r9 = "Lower precedence consent source ignored, proposed source"
            r8.zzb(r9, r7)
            return
    }

    public final /* synthetic */ void zzak() {
            r0 = this;
            r0.zzas()
            return
    }

    public final /* synthetic */ void zzal(boolean r1) {
            r0 = this;
            r1 = 0
            r0.zzi = r1
            return
    }

    public final /* synthetic */ int zzam() {
            r1 = this;
            int r0 = r1.zzj
            return r0
    }

    public final /* synthetic */ void zzan(int r1) {
            r0 = this;
            r0.zzj = r1
            return
    }

    public final /* synthetic */ com.google.android.gms.measurement.internal.zzay zzao() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzay r0 = r1.zzr
            return r0
    }

    public final /* synthetic */ int zzap(java.lang.Throwable r5) {
            r4 = this;
            java.lang.String r0 = r5.getMessage()
            r1 = 0
            r4.zzn = r1
            r1 = 2
            if (r0 != 0) goto Lb
            return r1
        Lb:
            boolean r2 = r5 instanceof java.lang.IllegalStateException
            if (r2 != 0) goto L38
            java.lang.String r2 = "garbage collected"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L38
            java.lang.Class r2 = r5.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "ServiceUnavailableException"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L28
            goto L38
        L28:
            boolean r5 = r5 instanceof java.lang.SecurityException
            if (r5 == 0) goto L37
            java.lang.String r5 = "READ_DEVICE_CONFIG"
            boolean r5 = r0.endsWith(r5)
            if (r5 == 0) goto L35
            return r1
        L35:
            r5 = 3
            return r5
        L37:
            return r1
        L38:
            java.lang.String r5 = "Background"
            boolean r5 = r0.contains(r5)
            r0 = 1
            if (r5 != 0) goto L42
            return r0
        L42:
            r4.zzn = r0
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final void zzh() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r2.zzu
            android.content.Context r1 = r0.zzaY()
            android.content.Context r1 = r1.getApplicationContext()
            boolean r1 = r1 instanceof android.app.Application
            if (r1 == 0) goto L21
            com.google.android.gms.measurement.internal.zzkx r1 = r2.zza
            if (r1 == 0) goto L21
            android.content.Context r0 = r0.zzaY()
            android.content.Context r0 = r0.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            com.google.android.gms.measurement.internal.zzkx r1 = r2.zza
            r0.unregisterActivityLifecycleCallbacks(r1)
        L21:
            return
    }

    public final java.lang.Boolean zzi() {
            r6 = this;
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            com.google.android.gms.measurement.internal.zzib r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzhy r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzkd r5 = new com.google.android.gms.measurement.internal.zzkd
            r5.<init>(r6, r1)
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.String r4 = "boolean test flag value"
            java.lang.Object r0 = r0.zzk(r1, r2, r4, r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            return r0
    }

    public final java.lang.String zzj() {
            r6 = this;
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            com.google.android.gms.measurement.internal.zzib r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzhy r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzkn r5 = new com.google.android.gms.measurement.internal.zzkn
            r5.<init>(r6, r1)
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.String r4 = "String test flag value"
            java.lang.Object r0 = r0.zzk(r1, r2, r4, r5)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public final java.lang.Long zzk() {
            r6 = this;
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            com.google.android.gms.measurement.internal.zzib r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzhy r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzko r5 = new com.google.android.gms.measurement.internal.zzko
            r5.<init>(r6, r1)
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.String r4 = "long test flag value"
            java.lang.Object r0 = r0.zzk(r1, r2, r4, r5)
            java.lang.Long r0 = (java.lang.Long) r0
            return r0
    }

    public final java.lang.Integer zzl() {
            r6 = this;
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            com.google.android.gms.measurement.internal.zzib r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzhy r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzkp r5 = new com.google.android.gms.measurement.internal.zzkp
            r5.<init>(r6, r1)
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.String r4 = "int test flag value"
            java.lang.Object r0 = r0.zzk(r1, r2, r4, r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            return r0
    }

    public final java.lang.Double zzm() {
            r6 = this;
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            com.google.android.gms.measurement.internal.zzib r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzhy r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzkq r5 = new com.google.android.gms.measurement.internal.zzkq
            r5.<init>(r6, r1)
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.String r4 = "double test flag value"
            java.lang.Object r0 = r0.zzk(r1, r2, r4, r5)
            java.lang.Double r0 = (java.lang.Double) r0
            return r0
    }

    public final void zzn(java.lang.Boolean r3) {
            r2 = this;
            r2.zzb()
            com.google.android.gms.measurement.internal.zzib r0 = r2.zzu
            com.google.android.gms.measurement.internal.zzhy r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzkr r1 = new com.google.android.gms.measurement.internal.zzkr
            r1.<init>(r2, r3)
            r0.zzj(r1)
            return
    }

    @androidx.annotation.VisibleForTesting
    public final void zzp(android.os.Bundle r9, int r10, long r11) {
            r8 = this;
            r8.zzb()
            com.google.android.gms.measurement.internal.zzjk r0 = com.google.android.gms.measurement.internal.zzjk.zza
            com.google.android.gms.measurement.internal.zzji r0 = com.google.android.gms.measurement.internal.zzji.zza
            com.google.android.gms.measurement.internal.zzjj[] r0 = r0.zzb()
            int r1 = r0.length
            r2 = 0
        Ld:
            r3 = 0
            if (r2 >= r1) goto L3c
            r4 = r0[r2]
            java.lang.String r4 = r4.zze
            boolean r5 = r9.containsKey(r4)
            if (r5 == 0) goto L39
            java.lang.String r4 = r9.getString(r4)
            if (r4 == 0) goto L39
            java.lang.String r5 = "granted"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L2b
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L35
        L2b:
            java.lang.String r5 = "denied"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L35
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
        L35:
            if (r3 != 0) goto L39
            r3 = r4
            goto L3c
        L39:
            int r2 = r2 + 1
            goto Ld
        L3c:
            if (r3 == 0) goto L5a
            com.google.android.gms.measurement.internal.zzib r0 = r8.zzu
            com.google.android.gms.measurement.internal.zzgt r1 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzh()
            java.lang.String r2 = "Ignoring invalid consent setting"
            r1.zzb(r2, r3)
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzh()
            java.lang.String r1 = "Valid consent values are 'granted', 'denied'"
            r0.zza(r1)
        L5a:
            com.google.android.gms.measurement.internal.zzib r0 = r8.zzu
            com.google.android.gms.measurement.internal.zzhy r0 = r0.zzaW()
            boolean r0 = r0.zze()
            com.google.android.gms.measurement.internal.zzjk r1 = com.google.android.gms.measurement.internal.zzjk.zze(r9, r10)
            boolean r2 = r1.zzc()
            if (r2 == 0) goto L71
            r8.zzs(r1, r0)
        L71:
            com.google.android.gms.measurement.internal.zzaz r1 = com.google.android.gms.measurement.internal.zzaz.zzh(r9, r10)
            boolean r2 = r1.zzd()
            if (r2 == 0) goto L7e
            r8.zzq(r1, r0)
        L7e:
            java.lang.Boolean r9 = com.google.android.gms.measurement.internal.zzaz.zzi(r9)
            if (r9 == 0) goto Lab
            r1 = -30
            if (r10 != r1) goto L8d
            java.lang.String r10 = "tcf"
        L8b:
            r2 = r10
            goto L90
        L8d:
            java.lang.String r10 = "app"
            goto L8b
        L90:
            if (r0 == 0) goto L9e
            java.lang.String r4 = r9.toString()
            java.lang.String r3 = "allow_personalized_ads"
            r1 = r8
            r5 = r11
            r1.zzN(r2, r3, r4, r5)
            return
        L9e:
            r5 = r11
            java.lang.String r4 = r9.toString()
            java.lang.String r3 = "allow_personalized_ads"
            r6 = r5
            r5 = 0
            r1 = r8
            r1.zzL(r2, r3, r4, r5, r6)
        Lab:
            return
    }

    public final void zzq(com.google.android.gms.measurement.internal.zzaz r2, boolean r3) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzks r0 = new com.google.android.gms.measurement.internal.zzks
            r0.<init>(r1, r2)
            if (r3 == 0) goto Le
            r1.zzg()
            r0.run()
            return
        Le:
            com.google.android.gms.measurement.internal.zzib r2 = r1.zzu
            com.google.android.gms.measurement.internal.zzhy r2 = r2.zzaW()
            r2.zzj(r0)
            return
    }

    public final void zzs(com.google.android.gms.measurement.internal.zzjk r10, boolean r11) {
            r9 = this;
            r9.zzb()
            int r0 = r10.zzb()
            r1 = -10
            if (r0 == r1) goto L2a
            com.google.android.gms.measurement.internal.zzjh r2 = r10.zzp()
            com.google.android.gms.measurement.internal.zzjh r3 = com.google.android.gms.measurement.internal.zzjh.zza
            if (r2 != r3) goto L2a
            com.google.android.gms.measurement.internal.zzjh r2 = r10.zzq()
            if (r2 == r3) goto L1a
            goto L2a
        L1a:
            com.google.android.gms.measurement.internal.zzib r10 = r9.zzu
            com.google.android.gms.measurement.internal.zzgt r10 = r10.zzaV()
            com.google.android.gms.measurement.internal.zzgr r10 = r10.zzh()
            java.lang.String r11 = "Ignoring empty consent settings"
            r10.zza(r11)
            return
        L2a:
            java.lang.Object r2 = r9.zzh
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.zzjk r3 = r9.zzo     // Catch: java.lang.Throwable -> Lcb
            int r3 = r3.zzb()     // Catch: java.lang.Throwable -> Lcb
            boolean r3 = com.google.android.gms.measurement.internal.zzjk.zzu(r0, r3)     // Catch: java.lang.Throwable -> Lcb
            r4 = 0
            if (r3 == 0) goto L64
            com.google.android.gms.measurement.internal.zzjk r3 = r9.zzo     // Catch: java.lang.Throwable -> L53
            boolean r3 = r10.zzr(r3)     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.zzjj r5 = com.google.android.gms.measurement.internal.zzjj.zzb     // Catch: java.lang.Throwable -> L53
            boolean r6 = r10.zzo(r5)     // Catch: java.lang.Throwable -> L53
            r7 = 1
            if (r6 == 0) goto L58
            com.google.android.gms.measurement.internal.zzjk r6 = r9.zzo     // Catch: java.lang.Throwable -> L53
            boolean r5 = r6.zzo(r5)     // Catch: java.lang.Throwable -> L53
            if (r5 != 0) goto L58
            r4 = r7
            goto L58
        L53:
            r0 = move-exception
            r10 = r0
            r4 = r9
            goto Lce
        L58:
            com.google.android.gms.measurement.internal.zzjk r5 = r9.zzo     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.zzjk r10 = r10.zzt(r5)     // Catch: java.lang.Throwable -> L53
            r9.zzo = r10     // Catch: java.lang.Throwable -> L53
            r8 = r4
            r4 = r7
        L62:
            r5 = r10
            goto L67
        L64:
            r3 = r4
            r8 = r3
            goto L62
        L67:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lcb
            if (r4 != 0) goto L7a
            com.google.android.gms.measurement.internal.zzib r10 = r9.zzu
            com.google.android.gms.measurement.internal.zzgt r10 = r10.zzaV()
            com.google.android.gms.measurement.internal.zzgr r10 = r10.zzi()
            java.lang.String r11 = "Ignoring lower-priority consent settings, proposed settings"
            r10.zzb(r11, r5)
            return
        L7a:
            java.util.concurrent.atomic.AtomicLong r10 = r9.zzp
            long r6 = r10.getAndIncrement()
            if (r3 == 0) goto La1
            java.util.concurrent.atomic.AtomicReference r10 = r9.zzg
            r0 = 0
            r10.set(r0)
            com.google.android.gms.measurement.internal.zzkt r3 = new com.google.android.gms.measurement.internal.zzkt
            r4 = r9
            r3.<init>(r4, r5, r6, r8)
            if (r11 == 0) goto L97
            r9.zzg()
            r3.run()
            return
        L97:
            com.google.android.gms.measurement.internal.zzib r10 = r4.zzu
            com.google.android.gms.measurement.internal.zzhy r10 = r10.zzaW()
            r10.zzl(r3)
            return
        La1:
            r4 = r9
            com.google.android.gms.measurement.internal.zzku r3 = new com.google.android.gms.measurement.internal.zzku
            r3.<init>(r4, r5, r6, r8)
            if (r11 == 0) goto Lb0
            r9.zzg()
            r3.run()
            return
        Lb0:
            r10 = 30
            if (r0 == r10) goto Lc1
            if (r0 != r1) goto Lb7
            goto Lc1
        Lb7:
            com.google.android.gms.measurement.internal.zzib r10 = r4.zzu
            com.google.android.gms.measurement.internal.zzhy r10 = r10.zzaW()
            r10.zzj(r3)
            return
        Lc1:
            com.google.android.gms.measurement.internal.zzib r10 = r4.zzu
            com.google.android.gms.measurement.internal.zzhy r10 = r10.zzaW()
            r10.zzl(r3)
            return
        Lcb:
            r0 = move-exception
            r4 = r9
        Lcd:
            r10 = r0
        Lce:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld0
            throw r10
        Ld0:
            r0 = move-exception
            goto Lcd
    }

    public final void zzt(java.lang.Runnable r13) {
            r12 = this;
            r12.zzb()
            com.google.android.gms.measurement.internal.zzib r0 = r12.zzu
            com.google.android.gms.measurement.internal.zzhy r1 = r0.zzaW()
            boolean r1 = r1.zze()
            if (r1 != 0) goto Lda
            com.google.android.gms.measurement.internal.zzhy r1 = r0.zzaW()
            boolean r1 = r1.zzf()
            if (r1 != 0) goto Lcc
            r0.zzaU()
            boolean r1 = com.google.android.gms.measurement.internal.zzae.zza()
            if (r1 != 0) goto Lbe
            com.google.android.gms.measurement.internal.zzgt r1 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzk()
            java.lang.String r2 = "[sgtm] Started client-side batch upload work."
            r1.zza(r2)
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L33:
            if (r2 != 0) goto La5
            com.google.android.gms.measurement.internal.zzgt r2 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzk()
            java.lang.String r5 = "[sgtm] Getting upload batches from service (FE)"
            r2.zza(r5)
            java.util.concurrent.atomic.AtomicReference r7 = new java.util.concurrent.atomic.AtomicReference
            r7.<init>()
            com.google.android.gms.measurement.internal.zzhy r6 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzlh r11 = new com.google.android.gms.measurement.internal.zzlh
            r11.<init>(r12, r7)
            r8 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r10 = "[sgtm] Getting upload batches"
            r6.zzk(r7, r8, r10, r11)
            java.lang.Object r2 = r7.get()
            com.google.android.gms.measurement.internal.zzop r2 = (com.google.android.gms.measurement.internal.zzop) r2
            if (r2 == 0) goto La5
            java.util.List r2 = r2.zza
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L68
            goto La5
        L68:
            com.google.android.gms.measurement.internal.zzgt r5 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r5 = r5.zzk()
            int r6 = r2.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "[sgtm] Retrieved upload batches. count"
            r5.zzb(r7, r6)
            int r5 = r2.size()
            int r3 = r3 + r5
            java.util.Iterator r2 = r2.iterator()
        L86:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto La3
            java.lang.Object r5 = r2.next()
            com.google.android.gms.measurement.internal.zzol r5 = (com.google.android.gms.measurement.internal.zzol) r5
            com.google.android.gms.measurement.internal.zzlq r5 = r12.zzaq(r5)
            com.google.android.gms.measurement.internal.zzlq r6 = com.google.android.gms.measurement.internal.zzlq.zzb
            if (r5 != r6) goto L9d
            int r4 = r4 + 1
            goto L86
        L9d:
            com.google.android.gms.measurement.internal.zzlq r6 = com.google.android.gms.measurement.internal.zzlq.zzd
            if (r5 != r6) goto L86
            r2 = 1
            goto L33
        La3:
            r2 = r1
            goto L33
        La5:
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.String r3 = "[sgtm] Completed client-side batch upload work. total, success"
            r0.zzc(r3, r1, r2)
            r13.run()
            return
        Lbe:
            com.google.android.gms.measurement.internal.zzgt r13 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r13 = r13.zzb()
            java.lang.String r0 = "Cannot retrieve and upload batches from main thread"
            r13.zza(r0)
            return
        Lcc:
            com.google.android.gms.measurement.internal.zzgt r13 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r13 = r13.zzb()
            java.lang.String r0 = "Cannot retrieve and upload batches from analytics network thread"
            r13.zza(r0)
            return
        Lda:
            com.google.android.gms.measurement.internal.zzgt r13 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r13 = r13.zzb()
            java.lang.String r0 = "Cannot retrieve and upload batches from analytics worker thread"
            r13.zza(r0)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzu(long r3) {
            r2 = this;
            r2.zzg()
            com.google.android.gms.measurement.internal.zzay r0 = r2.zzl
            if (r0 != 0) goto L10
            com.google.android.gms.measurement.internal.zzib r0 = r2.zzu
            com.google.android.gms.measurement.internal.zzjt r1 = new com.google.android.gms.measurement.internal.zzjt
            r1.<init>(r2, r0)
            r2.zzl = r1
        L10:
            com.google.android.gms.measurement.internal.zzay r0 = r2.zzl
            r0.zzb(r3)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzv() {
            r1 = this;
            r1.zzg()
            com.google.android.gms.measurement.internal.zzay r0 = r1.zzl
            if (r0 == 0) goto La
            r0.zzd()
        La:
            return
    }

    public final void zzw() {
            r9 = this;
            com.google.android.gms.internal.measurement.zzql.zza()
            com.google.android.gms.measurement.internal.zzib r0 = r9.zzu
            com.google.android.gms.measurement.internal.zzal r1 = r0.zzc()
            r2 = 0
            com.google.android.gms.measurement.internal.zzfw r3 = com.google.android.gms.measurement.internal.zzfx.zzaQ
            boolean r1 = r1.zzp(r2, r3)
            if (r1 == 0) goto L88
            com.google.android.gms.measurement.internal.zzhy r1 = r0.zzaW()
            boolean r1 = r1.zze()
            if (r1 != 0) goto L7b
            r0.zzaU()
            boolean r1 = com.google.android.gms.measurement.internal.zzae.zza()
            if (r1 != 0) goto L6d
            r9.zzb()
            com.google.android.gms.measurement.internal.zzgt r1 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzk()
            java.lang.String r2 = "Getting trigger URIs (FE)"
            r1.zza(r2)
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            r4.<init>()
            com.google.android.gms.measurement.internal.zzhy r3 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzkz r8 = new com.google.android.gms.measurement.internal.zzkz
            r8.<init>(r9, r4)
            r5 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r7 = "get trigger URIs"
            r3.zzk(r4, r5, r7, r8)
            java.lang.Object r1 = r4.get()
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L60
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzd()
            java.lang.String r1 = "Timed out waiting for get trigger URIs"
            r0.zza(r1)
            return
        L60:
            com.google.android.gms.measurement.internal.zzhy r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzla r2 = new com.google.android.gms.measurement.internal.zzla
            r2.<init>(r9, r1)
            r0.zzj(r2)
            return
        L6d:
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()
            java.lang.String r1 = "Cannot get trigger URIs from main thread"
            r0.zza(r1)
            return
        L7b:
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()
            java.lang.String r1 = "Cannot get trigger URIs from analytics worker thread"
            r0.zza(r1)
        L88:
            return
    }

    public final boolean zzx() {
            r1 = this;
            boolean r0 = r1.zzn
            return r0
    }

    @android.annotation.TargetApi(30)
    public final java.util.PriorityQueue zzy() {
            r3 = this;
            java.util.PriorityQueue r0 = r3.zzm
            if (r0 != 0) goto L13
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            com.google.android.gms.measurement.internal.zzlb r1 = com.google.android.gms.measurement.internal.zzlb.zza
            com.google.android.gms.measurement.internal.zzlc r2 = com.google.android.gms.measurement.internal.zzlc.zza
            java.util.Comparator r1 = java.util.Comparator.comparing(r1, r2)
            r0.<init>(r1)
            r3.zzm = r0
        L13:
            java.util.PriorityQueue r0 = r3.zzm
            return r0
    }

    @android.annotation.TargetApi(30)
    @androidx.annotation.WorkerThread
    public final void zzz() {
            r6 = this;
            r6.zzg()
            r0 = 0
            r6.zzn = r0
            java.util.PriorityQueue r1 = r6.zzy()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L60
            boolean r1 = r6.zzi
            if (r1 == 0) goto L15
            goto L60
        L15:
            java.util.PriorityQueue r1 = r6.zzy()
            java.lang.Object r1 = r1.poll()
            com.google.android.gms.measurement.internal.zzog r1 = (com.google.android.gms.measurement.internal.zzog) r1
            if (r1 == 0) goto L60
            com.google.android.gms.measurement.internal.zzib r2 = r6.zzu
            com.google.android.gms.measurement.internal.zzpo r3 = r2.zzk()
            androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures r3 = r3.zzT()
            if (r3 == 0) goto L60
            r4 = 1
            r6.zzi = r4
            com.google.android.gms.measurement.internal.zzgt r2 = r2.zzaV()
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzk()
            java.lang.String r4 = r1.zza
            java.lang.String r5 = "Registering trigger URI"
            r2.zzb(r5, r4)
            android.net.Uri r2 = android.net.Uri.parse(r4)
            com.google.common.util.concurrent.ListenableFuture r2 = r3.registerTriggerAsync(r2)
            if (r2 != 0) goto L53
            r6.zzi = r0
            java.util.PriorityQueue r0 = r6.zzy()
            r0.add(r1)
            return
        L53:
            com.google.android.gms.measurement.internal.zzju r0 = new com.google.android.gms.measurement.internal.zzju
            r0.<init>(r6)
            com.google.android.gms.measurement.internal.zzjv r3 = new com.google.android.gms.measurement.internal.zzjv
            r3.<init>(r6, r1)
            com.google.common.util.concurrent.Futures.addCallback(r2, r3, r0)
        L60:
            return
    }
}
